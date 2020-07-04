package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.lang.reflect.Array;
import okio.ByteString;

public abstract class AndroidMessage<M extends Message<M, B>, B extends Builder<M, B>> extends Message<M, B> implements Parcelable {

    static final class ProtoAdapterCreator<M> implements Creator<M> {
        private final ProtoAdapter<M> adapter;

        ProtoAdapterCreator(ProtoAdapter<M> protoAdapter) {
            this.adapter = protoAdapter;
        }

        public final M[] newArray(int i) {
            return (Object[]) Array.newInstance(this.adapter.javaType, i);
        }

        public final M createFromParcel(Parcel parcel) {
            try {
                return this.adapter.decode(parcel.createByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public static <E> Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return new ProtoAdapterCreator(protoAdapter);
    }

    protected AndroidMessage(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        super(protoAdapter, byteString);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(encode());
    }
}
