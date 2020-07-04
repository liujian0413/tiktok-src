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

/* renamed from: com.ss.ugc.aweme.proto.BitRateStructV2 */
public final class BitRateStructV2 extends Message<BitRateStructV2, Builder> {
    public static final ProtoAdapter<BitRateStructV2> ADAPTER = new ProtoAdapter_BitRateStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer bit_rate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String gear_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer is_h265;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 play_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 6)
    public UrlStructV2 play_addr_265;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer quality_type;

    /* renamed from: com.ss.ugc.aweme.proto.BitRateStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BitRateStructV2, Builder> {
        public Integer bit_rate;
        public String gear_name;
        public Integer is_h265;
        public UrlStructV2 play_addr;
        public UrlStructV2 play_addr_265;
        public Integer quality_type;

        public final BitRateStructV2 build() {
            BitRateStructV2 bitRateStructV2 = new BitRateStructV2(this.gear_name, this.quality_type, this.bit_rate, this.play_addr, this.is_h265, this.play_addr_265, super.buildUnknownFields());
            return bitRateStructV2;
        }

        public final Builder bit_rate(Integer num) {
            this.bit_rate = num;
            return this;
        }

        public final Builder gear_name(String str) {
            this.gear_name = str;
            return this;
        }

        public final Builder is_h265(Integer num) {
            this.is_h265 = num;
            return this;
        }

        public final Builder play_addr(UrlStructV2 urlStructV2) {
            this.play_addr = urlStructV2;
            return this;
        }

        public final Builder play_addr_265(UrlStructV2 urlStructV2) {
            this.play_addr_265 = urlStructV2;
            return this;
        }

        public final Builder quality_type(Integer num) {
            this.quality_type = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.BitRateStructV2$ProtoAdapter_BitRateStructV2 */
    static final class ProtoAdapter_BitRateStructV2 extends ProtoAdapter<BitRateStructV2> {
        public ProtoAdapter_BitRateStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BitRateStructV2.class);
        }

        public final int encodedSize(BitRateStructV2 bitRateStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, bitRateStructV2.gear_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, bitRateStructV2.quality_type) + ProtoAdapter.INT32.encodedSizeWithTag(3, bitRateStructV2.bit_rate) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, bitRateStructV2.play_addr) + ProtoAdapter.INT32.encodedSizeWithTag(5, bitRateStructV2.is_h265) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, bitRateStructV2.play_addr_265) + bitRateStructV2.unknownFields().size();
        }

        public final BitRateStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.gear_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.quality_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.bit_rate((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.play_addr((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.is_h265((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.play_addr_265((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, BitRateStructV2 bitRateStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bitRateStructV2.gear_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, bitRateStructV2.quality_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, bitRateStructV2.bit_rate);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, bitRateStructV2.play_addr);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, bitRateStructV2.is_h265);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, bitRateStructV2.play_addr_265);
            protoWriter.writeBytes(bitRateStructV2.unknownFields());
        }
    }

    public BitRateStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.gear_name = this.gear_name;
        builder.quality_type = this.quality_type;
        builder.bit_rate = this.bit_rate;
        builder.play_addr = this.play_addr;
        builder.is_h265 = this.is_h265;
        builder.play_addr_265 = this.play_addr_265;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.gear_name != null) {
            i = this.gear_name.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.quality_type != null) {
            i2 = this.quality_type.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.bit_rate != null) {
            i3 = this.bit_rate.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.play_addr != null) {
            i4 = this.play_addr.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.is_h265 != null) {
            i5 = this.is_h265.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.play_addr_265 != null) {
            i7 = this.play_addr_265.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.gear_name != null) {
            sb.append(", gear_name=");
            sb.append(this.gear_name);
        }
        if (this.quality_type != null) {
            sb.append(", quality_type=");
            sb.append(this.quality_type);
        }
        if (this.bit_rate != null) {
            sb.append(", bit_rate=");
            sb.append(this.bit_rate);
        }
        if (this.play_addr != null) {
            sb.append(", play_addr=");
            sb.append(this.play_addr);
        }
        if (this.is_h265 != null) {
            sb.append(", is_h265=");
            sb.append(this.is_h265);
        }
        if (this.play_addr_265 != null) {
            sb.append(", play_addr_265=");
            sb.append(this.play_addr_265);
        }
        StringBuilder replace = sb.replace(0, 2, "BitRateStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitRateStructV2)) {
            return false;
        }
        BitRateStructV2 bitRateStructV2 = (BitRateStructV2) obj;
        if (!unknownFields().equals(bitRateStructV2.unknownFields()) || !Internal.equals(this.gear_name, bitRateStructV2.gear_name) || !Internal.equals(this.quality_type, bitRateStructV2.quality_type) || !Internal.equals(this.bit_rate, bitRateStructV2.bit_rate) || !Internal.equals(this.play_addr, bitRateStructV2.play_addr) || !Internal.equals(this.is_h265, bitRateStructV2.is_h265) || !Internal.equals(this.play_addr_265, bitRateStructV2.play_addr_265)) {
            return false;
        }
        return true;
    }

    public BitRateStructV2(String str, Integer num, Integer num2, UrlStructV2 urlStructV2, Integer num3, UrlStructV2 urlStructV22) {
        this(str, num, num2, urlStructV2, num3, urlStructV22, ByteString.EMPTY);
    }

    public BitRateStructV2(String str, Integer num, Integer num2, UrlStructV2 urlStructV2, Integer num3, UrlStructV2 urlStructV22, ByteString byteString) {
        super(ADAPTER, byteString);
        this.gear_name = str;
        this.quality_type = num;
        this.bit_rate = num2;
        this.play_addr = urlStructV2;
        this.is_h265 = num3;
        this.play_addr_265 = urlStructV22;
    }
}
