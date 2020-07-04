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

/* renamed from: com.ss.ugc.aweme.proto.BlueVBrandInfoStructV2 */
public final class BlueVBrandInfoStructV2 extends Message<BlueVBrandInfoStructV2, Builder> {
    public static final ProtoAdapter<BlueVBrandInfoStructV2> ADAPTER = new ProtoAdapter_BlueVBrandInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer brand_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String brand_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer category_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String category_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer heat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 5)
    public UrlStructV2 logo_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public Integer rank_diff;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String tag_name;

    /* renamed from: com.ss.ugc.aweme.proto.BlueVBrandInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BlueVBrandInfoStructV2, Builder> {
        public Integer brand_id;
        public String brand_name;
        public Integer category_id;
        public String category_name;
        public Integer heat;
        public UrlStructV2 logo_url;
        public Integer rank;
        public Integer rank_diff;
        public String tag_name;

        public final BlueVBrandInfoStructV2 build() {
            BlueVBrandInfoStructV2 blueVBrandInfoStructV2 = new BlueVBrandInfoStructV2(this.category_id, this.category_name, this.brand_id, this.brand_name, this.logo_url, this.heat, this.rank, this.rank_diff, this.tag_name, super.buildUnknownFields());
            return blueVBrandInfoStructV2;
        }

        public final Builder brand_id(Integer num) {
            this.brand_id = num;
            return this;
        }

        public final Builder brand_name(String str) {
            this.brand_name = str;
            return this;
        }

        public final Builder category_id(Integer num) {
            this.category_id = num;
            return this;
        }

        public final Builder category_name(String str) {
            this.category_name = str;
            return this;
        }

        public final Builder heat(Integer num) {
            this.heat = num;
            return this;
        }

        public final Builder logo_url(UrlStructV2 urlStructV2) {
            this.logo_url = urlStructV2;
            return this;
        }

        public final Builder rank(Integer num) {
            this.rank = num;
            return this;
        }

        public final Builder rank_diff(Integer num) {
            this.rank_diff = num;
            return this;
        }

        public final Builder tag_name(String str) {
            this.tag_name = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.BlueVBrandInfoStructV2$ProtoAdapter_BlueVBrandInfoStructV2 */
    static final class ProtoAdapter_BlueVBrandInfoStructV2 extends ProtoAdapter<BlueVBrandInfoStructV2> {
        public ProtoAdapter_BlueVBrandInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BlueVBrandInfoStructV2.class);
        }

        public final int encodedSize(BlueVBrandInfoStructV2 blueVBrandInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, blueVBrandInfoStructV2.category_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, blueVBrandInfoStructV2.category_name) + ProtoAdapter.INT32.encodedSizeWithTag(3, blueVBrandInfoStructV2.brand_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, blueVBrandInfoStructV2.brand_name) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, blueVBrandInfoStructV2.logo_url) + ProtoAdapter.INT32.encodedSizeWithTag(6, blueVBrandInfoStructV2.heat) + ProtoAdapter.INT32.encodedSizeWithTag(7, blueVBrandInfoStructV2.rank) + ProtoAdapter.INT32.encodedSizeWithTag(8, blueVBrandInfoStructV2.rank_diff) + ProtoAdapter.STRING.encodedSizeWithTag(9, blueVBrandInfoStructV2.tag_name) + blueVBrandInfoStructV2.unknownFields().size();
        }

        public final BlueVBrandInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.category_id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.category_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.brand_id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.brand_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.logo_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.heat((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.rank((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.rank_diff((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.tag_name((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, BlueVBrandInfoStructV2 blueVBrandInfoStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, blueVBrandInfoStructV2.category_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blueVBrandInfoStructV2.category_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, blueVBrandInfoStructV2.brand_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, blueVBrandInfoStructV2.brand_name);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, blueVBrandInfoStructV2.logo_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, blueVBrandInfoStructV2.heat);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, blueVBrandInfoStructV2.rank);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, blueVBrandInfoStructV2.rank_diff);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, blueVBrandInfoStructV2.tag_name);
            protoWriter.writeBytes(blueVBrandInfoStructV2.unknownFields());
        }
    }

    public BlueVBrandInfoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.category_id = this.category_id;
        builder.category_name = this.category_name;
        builder.brand_id = this.brand_id;
        builder.brand_name = this.brand_name;
        builder.logo_url = this.logo_url;
        builder.heat = this.heat;
        builder.rank = this.rank;
        builder.rank_diff = this.rank_diff;
        builder.tag_name = this.tag_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i10 = 0;
        if (this.category_id != null) {
            i = this.category_id.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        if (this.category_name != null) {
            i2 = this.category_name.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        if (this.brand_id != null) {
            i3 = this.brand_id.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        if (this.brand_name != null) {
            i4 = this.brand_name.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        if (this.logo_url != null) {
            i5 = this.logo_url.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        if (this.heat != null) {
            i6 = this.heat.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        if (this.rank != null) {
            i7 = this.rank.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        if (this.rank_diff != null) {
            i8 = this.rank_diff.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        if (this.tag_name != null) {
            i10 = this.tag_name.hashCode();
        }
        int i19 = i18 + i10;
        this.hashCode = i19;
        return i19;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.category_id != null) {
            sb.append(", category_id=");
            sb.append(this.category_id);
        }
        if (this.category_name != null) {
            sb.append(", category_name=");
            sb.append(this.category_name);
        }
        if (this.brand_id != null) {
            sb.append(", brand_id=");
            sb.append(this.brand_id);
        }
        if (this.brand_name != null) {
            sb.append(", brand_name=");
            sb.append(this.brand_name);
        }
        if (this.logo_url != null) {
            sb.append(", logo_url=");
            sb.append(this.logo_url);
        }
        if (this.heat != null) {
            sb.append(", heat=");
            sb.append(this.heat);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        if (this.rank_diff != null) {
            sb.append(", rank_diff=");
            sb.append(this.rank_diff);
        }
        if (this.tag_name != null) {
            sb.append(", tag_name=");
            sb.append(this.tag_name);
        }
        StringBuilder replace = sb.replace(0, 2, "BlueVBrandInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlueVBrandInfoStructV2)) {
            return false;
        }
        BlueVBrandInfoStructV2 blueVBrandInfoStructV2 = (BlueVBrandInfoStructV2) obj;
        if (!unknownFields().equals(blueVBrandInfoStructV2.unknownFields()) || !Internal.equals(this.category_id, blueVBrandInfoStructV2.category_id) || !Internal.equals(this.category_name, blueVBrandInfoStructV2.category_name) || !Internal.equals(this.brand_id, blueVBrandInfoStructV2.brand_id) || !Internal.equals(this.brand_name, blueVBrandInfoStructV2.brand_name) || !Internal.equals(this.logo_url, blueVBrandInfoStructV2.logo_url) || !Internal.equals(this.heat, blueVBrandInfoStructV2.heat) || !Internal.equals(this.rank, blueVBrandInfoStructV2.rank) || !Internal.equals(this.rank_diff, blueVBrandInfoStructV2.rank_diff) || !Internal.equals(this.tag_name, blueVBrandInfoStructV2.tag_name)) {
            return false;
        }
        return true;
    }

    public BlueVBrandInfoStructV2(Integer num, String str, Integer num2, String str2, UrlStructV2 urlStructV2, Integer num3, Integer num4, Integer num5, String str3) {
        this(num, str, num2, str2, urlStructV2, num3, num4, num5, str3, ByteString.EMPTY);
    }

    public BlueVBrandInfoStructV2(Integer num, String str, Integer num2, String str2, UrlStructV2 urlStructV2, Integer num3, Integer num4, Integer num5, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.category_id = num;
        this.category_name = str;
        this.brand_id = num2;
        this.brand_name = str2;
        this.logo_url = urlStructV2;
        this.heat = num3;
        this.rank = num4;
        this.rank_diff = num5;
        this.tag_name = str3;
    }
}
