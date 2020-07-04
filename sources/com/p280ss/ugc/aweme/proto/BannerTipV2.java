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

/* renamed from: com.ss.ugc.aweme.proto.BannerTipV2 */
public final class BannerTipV2 extends Message<BannerTipV2, Builder> {
    public static final ProtoAdapter<BannerTipV2> ADAPTER = new ProtoAdapter_BannerTipV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String banner_txt;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer banner_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String link_txt;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer link_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String link_url;

    /* renamed from: com.ss.ugc.aweme.proto.BannerTipV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BannerTipV2, Builder> {
        public String banner_txt;
        public Integer banner_type;
        public String link_txt;
        public Integer link_type;
        public String link_url;

        public final BannerTipV2 build() {
            BannerTipV2 bannerTipV2 = new BannerTipV2(this.banner_type, this.banner_txt, this.link_type, this.link_url, this.link_txt, super.buildUnknownFields());
            return bannerTipV2;
        }

        public final Builder banner_txt(String str) {
            this.banner_txt = str;
            return this;
        }

        public final Builder banner_type(Integer num) {
            this.banner_type = num;
            return this;
        }

        public final Builder link_txt(String str) {
            this.link_txt = str;
            return this;
        }

        public final Builder link_type(Integer num) {
            this.link_type = num;
            return this;
        }

        public final Builder link_url(String str) {
            this.link_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.BannerTipV2$ProtoAdapter_BannerTipV2 */
    static final class ProtoAdapter_BannerTipV2 extends ProtoAdapter<BannerTipV2> {
        public ProtoAdapter_BannerTipV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerTipV2.class);
        }

        public final int encodedSize(BannerTipV2 bannerTipV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, bannerTipV2.banner_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, bannerTipV2.banner_txt) + ProtoAdapter.INT32.encodedSizeWithTag(3, bannerTipV2.link_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, bannerTipV2.link_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, bannerTipV2.link_txt) + bannerTipV2.unknownFields().size();
        }

        public final BannerTipV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.banner_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.banner_txt((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.link_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.link_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.link_txt((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, BannerTipV2 bannerTipV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, bannerTipV2.banner_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bannerTipV2.banner_txt);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, bannerTipV2.link_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, bannerTipV2.link_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, bannerTipV2.link_txt);
            protoWriter.writeBytes(bannerTipV2.unknownFields());
        }
    }

    public BannerTipV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.banner_type = this.banner_type;
        builder.banner_txt = this.banner_txt;
        builder.link_type = this.link_type;
        builder.link_url = this.link_url;
        builder.link_txt = this.link_txt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.banner_type != null) {
            i = this.banner_type.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.banner_txt != null) {
            i2 = this.banner_txt.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.link_type != null) {
            i3 = this.link_type.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.link_url != null) {
            i4 = this.link_url.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.link_txt != null) {
            i6 = this.link_txt.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.banner_type != null) {
            sb.append(", banner_type=");
            sb.append(this.banner_type);
        }
        if (this.banner_txt != null) {
            sb.append(", banner_txt=");
            sb.append(this.banner_txt);
        }
        if (this.link_type != null) {
            sb.append(", link_type=");
            sb.append(this.link_type);
        }
        if (this.link_url != null) {
            sb.append(", link_url=");
            sb.append(this.link_url);
        }
        if (this.link_txt != null) {
            sb.append(", link_txt=");
            sb.append(this.link_txt);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerTipV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerTipV2)) {
            return false;
        }
        BannerTipV2 bannerTipV2 = (BannerTipV2) obj;
        if (!unknownFields().equals(bannerTipV2.unknownFields()) || !Internal.equals(this.banner_type, bannerTipV2.banner_type) || !Internal.equals(this.banner_txt, bannerTipV2.banner_txt) || !Internal.equals(this.link_type, bannerTipV2.link_type) || !Internal.equals(this.link_url, bannerTipV2.link_url) || !Internal.equals(this.link_txt, bannerTipV2.link_txt)) {
            return false;
        }
        return true;
    }

    public BannerTipV2(Integer num, String str, Integer num2, String str2, String str3) {
        this(num, str, num2, str2, str3, ByteString.EMPTY);
    }

    public BannerTipV2(Integer num, String str, Integer num2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.banner_type = num;
        this.banner_txt = str;
        this.link_type = num2;
        this.link_url = str2;
        this.link_txt = str3;
    }
}
