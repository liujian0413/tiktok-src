package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.PositionStructV2 */
public final class PositionStructV2 extends Message<PositionStructV2, Builder> {
    public static final ProtoAdapter<PositionStructV2> ADAPTER = new ProtoAdapter_PositionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer begin;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer end;

    /* renamed from: com.ss.ugc.aweme.proto.PositionStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PositionStructV2, Builder> {
        public Integer begin;
        public Integer end;

        public final PositionStructV2 build() {
            return new PositionStructV2(this.begin, this.end, super.buildUnknownFields());
        }

        public final Builder begin(Integer num) {
            this.begin = num;
            return this;
        }

        public final Builder end(Integer num) {
            this.end = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PositionStructV2$ProtoAdapter_PositionStructV2 */
    static final class ProtoAdapter_PositionStructV2 extends ProtoAdapter<PositionStructV2> {
        public ProtoAdapter_PositionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PositionStructV2.class);
        }

        public final int encodedSize(PositionStructV2 positionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, positionStructV2.begin) + ProtoAdapter.INT32.encodedSizeWithTag(2, positionStructV2.end) + positionStructV2.unknownFields().size();
        }

        public final PositionStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.begin((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.end((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PositionStructV2 positionStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, positionStructV2.begin);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, positionStructV2.end);
            protoWriter.writeBytes(positionStructV2.unknownFields());
        }
    }

    public PositionStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.begin = this.begin;
        builder.end = this.end;
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
        if (this.begin != null) {
            i = this.begin.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.end != null) {
            i3 = this.end.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        StringBuilder replace = sb.replace(0, 2, "PositionStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PositionStructV2)) {
            return false;
        }
        PositionStructV2 positionStructV2 = (PositionStructV2) obj;
        if (!unknownFields().equals(positionStructV2.unknownFields()) || !Internal.equals(this.begin, positionStructV2.begin) || !Internal.equals(this.end, positionStructV2.end)) {
            return false;
        }
        return true;
    }

    public PositionStructV2(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public PositionStructV2(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.begin = num;
        this.end = num2;
    }
}
