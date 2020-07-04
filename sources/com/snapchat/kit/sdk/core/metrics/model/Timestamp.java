package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Timestamp extends Message<Timestamp, Builder> {
    public static final ProtoAdapter<Timestamp> ADAPTER = new ProtoAdapter_Timestamp();
    public static final Integer DEFAULT_NANOS = Integer.valueOf(0);
    public static final Long DEFAULT_SECONDS = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer nanos;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long seconds;

    public static final class Builder extends com.squareup.wire.Message.Builder<Timestamp, Builder> {
        public Integer nanos;
        public Long seconds;

        public final Timestamp build() {
            return new Timestamp(this.seconds, this.nanos, super.buildUnknownFields());
        }

        public final Builder nanos(Integer num) {
            this.nanos = num;
            return this;
        }

        public final Builder seconds(Long l) {
            this.seconds = l;
            return this;
        }
    }

    static final class ProtoAdapter_Timestamp extends ProtoAdapter<Timestamp> {
        public ProtoAdapter_Timestamp() {
            super(FieldEncoding.LENGTH_DELIMITED, Timestamp.class);
        }

        public final Timestamp redact(Timestamp timestamp) {
            Builder newBuilder = timestamp.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Timestamp timestamp) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, timestamp.seconds) + ProtoAdapter.INT32.encodedSizeWithTag(2, timestamp.nanos) + timestamp.unknownFields().size();
        }

        public final Timestamp decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.seconds((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.nanos((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Timestamp timestamp) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, timestamp.seconds);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, timestamp.nanos);
            protoWriter.writeBytes(timestamp.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.seconds = this.seconds;
        builder.nanos = this.nanos;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.seconds != null) {
            i = this.seconds.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.nanos != null) {
            i3 = this.nanos.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.seconds != null) {
            sb.append(", seconds=");
            sb.append(this.seconds);
        }
        if (this.nanos != null) {
            sb.append(", nanos=");
            sb.append(this.nanos);
        }
        StringBuilder replace = sb.replace(0, 2, "Timestamp{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return false;
        }
        Timestamp timestamp = (Timestamp) obj;
        if (!unknownFields().equals(timestamp.unknownFields()) || !Internal.equals(this.seconds, timestamp.seconds) || !Internal.equals(this.nanos, timestamp.nanos)) {
            return false;
        }
        return true;
    }

    public Timestamp(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public Timestamp(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.seconds = l;
        this.nanos = num;
    }
}
