package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        transient Buffer unknownFieldsBuffer;
        transient ByteString unknownFieldsByteString = ByteString.EMPTY;
        transient ProtoWriter unknownFieldsWriter;

        public abstract M build();

        protected Builder() {
        }

        public final ByteString buildUnknownFields() {
            if (this.unknownFieldsBuffer != null) {
                this.unknownFieldsByteString = this.unknownFieldsBuffer.readByteString();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = ByteString.EMPTY;
            if (this.unknownFieldsBuffer != null) {
                this.unknownFieldsBuffer.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new Buffer();
                this.unknownFieldsWriter = new ProtoWriter(this.unknownFieldsBuffer);
                try {
                    this.unknownFieldsWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = ByteString.EMPTY;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final Builder<M, B> addUnknownFields(ByteString byteString) {
            if (byteString.size() > 0) {
                prepareForNewUnknownFields();
                try {
                    this.unknownFieldsWriter.writeBytes(byteString);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public abstract Builder<M, B> newBuilder();

    public String toString() {
        return this.adapter.toString(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        if (byteString != null) {
            return byteString;
        }
        return ByteString.EMPTY;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.encode(outputStream, this);
    }

    public final void encode(BufferedSink bufferedSink) throws IOException {
        this.adapter.encode(bufferedSink, this);
    }

    protected Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        if (protoAdapter == null) {
            throw new NullPointerException("adapter == null");
        } else if (byteString != null) {
            this.adapter = protoAdapter;
            this.unknownFields = byteString;
        } else {
            throw new NullPointerException("unknownFields == null");
        }
    }
}
