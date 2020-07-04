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

public final class TimerMetric extends Message<TimerMetric, Builder> {
    public static final ProtoAdapter<TimerMetric> ADAPTER = new ProtoAdapter_TimerMetric();
    public static final Long DEFAULT_LATENCY_MILLIS = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long latency_millis;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.Timestamp#ADAPTER", tag = 2)
    public final Timestamp timestamp;

    public static final class Builder extends com.squareup.wire.Message.Builder<TimerMetric, Builder> {
        public Long latency_millis;
        public String name;
        public Timestamp timestamp;

        public final TimerMetric build() {
            return new TimerMetric(this.name, this.timestamp, this.latency_millis, super.buildUnknownFields());
        }

        public final Builder latency_millis(Long l) {
            this.latency_millis = l;
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

    static final class ProtoAdapter_TimerMetric extends ProtoAdapter<TimerMetric> {
        public ProtoAdapter_TimerMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, TimerMetric.class);
        }

        public final TimerMetric redact(TimerMetric timerMetric) {
            Builder newBuilder = timerMetric.newBuilder();
            if (newBuilder.timestamp != null) {
                newBuilder.timestamp = (Timestamp) Timestamp.ADAPTER.redact(newBuilder.timestamp);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(TimerMetric timerMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, timerMetric.name) + Timestamp.ADAPTER.encodedSizeWithTag(2, timerMetric.timestamp) + ProtoAdapter.INT64.encodedSizeWithTag(3, timerMetric.latency_millis) + timerMetric.unknownFields().size();
        }

        public final TimerMetric decode(ProtoReader protoReader) throws IOException {
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
                            builder.latency_millis((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, TimerMetric timerMetric) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timerMetric.name);
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 2, timerMetric.timestamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, timerMetric.latency_millis);
            protoWriter.writeBytes(timerMetric.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.timestamp = this.timestamp;
        builder.latency_millis = this.latency_millis;
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
        if (this.latency_millis != null) {
            i4 = this.latency_millis.hashCode();
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
        if (this.latency_millis != null) {
            sb.append(", latency_millis=");
            sb.append(this.latency_millis);
        }
        StringBuilder replace = sb.replace(0, 2, "TimerMetric{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimerMetric)) {
            return false;
        }
        TimerMetric timerMetric = (TimerMetric) obj;
        if (!unknownFields().equals(timerMetric.unknownFields()) || !Internal.equals(this.name, timerMetric.name) || !Internal.equals(this.timestamp, timerMetric.timestamp) || !Internal.equals(this.latency_millis, timerMetric.latency_millis)) {
            return false;
        }
        return true;
    }

    public TimerMetric(String str, Timestamp timestamp2, Long l) {
        this(str, timestamp2, l, ByteString.EMPTY);
    }

    public TimerMetric(String str, Timestamp timestamp2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.timestamp = timestamp2;
        this.latency_millis = l;
    }
}
