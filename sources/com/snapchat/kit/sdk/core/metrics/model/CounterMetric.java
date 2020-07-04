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

public final class CounterMetric extends Message<CounterMetric, Builder> {
    public static final ProtoAdapter<CounterMetric> ADAPTER = new ProtoAdapter_CounterMetric();
    public static final Long DEFAULT_COUNT = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.Timestamp#ADAPTER", tag = 2)
    public final Timestamp timestamp;

    public static final class Builder extends com.squareup.wire.Message.Builder<CounterMetric, Builder> {
        public Long count;
        public String name;
        public Timestamp timestamp;

        public final CounterMetric build() {
            return new CounterMetric(this.name, this.timestamp, this.count, super.buildUnknownFields());
        }

        public final Builder count(Long l) {
            this.count = l;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder timestamp(Timestamp timestamp2) {
            this.timestamp = timestamp2;
            return this;
        }
    }

    static final class ProtoAdapter_CounterMetric extends ProtoAdapter<CounterMetric> {
        public ProtoAdapter_CounterMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, CounterMetric.class);
        }

        public final CounterMetric redact(CounterMetric counterMetric) {
            Builder newBuilder = counterMetric.newBuilder();
            if (newBuilder.timestamp != null) {
                newBuilder.timestamp = (Timestamp) Timestamp.ADAPTER.redact(newBuilder.timestamp);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(CounterMetric counterMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, counterMetric.name) + Timestamp.ADAPTER.encodedSizeWithTag(2, counterMetric.timestamp) + ProtoAdapter.INT64.encodedSizeWithTag(3, counterMetric.count) + counterMetric.unknownFields().size();
        }

        public final CounterMetric decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.timestamp((Timestamp) Timestamp.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.count((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CounterMetric counterMetric) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, counterMetric.name);
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 2, counterMetric.timestamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, counterMetric.count);
            protoWriter.writeBytes(counterMetric.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.timestamp = this.timestamp;
        builder.count = this.count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.name != null) {
            i = this.name.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.timestamp != null) {
            i2 = this.timestamp.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.count != null) {
            i4 = this.count.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "CounterMetric{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterMetric)) {
            return false;
        }
        CounterMetric counterMetric = (CounterMetric) obj;
        if (!unknownFields().equals(counterMetric.unknownFields()) || !Internal.equals(this.name, counterMetric.name) || !Internal.equals(this.timestamp, counterMetric.timestamp) || !Internal.equals(this.count, counterMetric.count)) {
            return false;
        }
        return true;
    }

    public CounterMetric(String str, Timestamp timestamp2, Long l) {
        this(str, timestamp2, l, ByteString.EMPTY);
    }

    public CounterMetric(String str, Timestamp timestamp2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.timestamp = timestamp2;
        this.count = l;
    }
}
