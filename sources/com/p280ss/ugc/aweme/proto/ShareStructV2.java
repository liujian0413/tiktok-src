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

/* renamed from: com.ss.ugc.aweme.proto.ShareStructV2 */
public final class ShareStructV2 extends Message<ShareStructV2, Builder> {
    public static final ProtoAdapter<ShareStructV2> ADAPTER = new ProtoAdapter_ShareStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public Integer bool_persist;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String goods_rec_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String manage_goods_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String share_desc;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 7)
    public UrlStructV2 share_image_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String share_link_desc;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 5)
    public UrlStructV2 share_qrcode_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String share_quote;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String share_signature_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public String share_signature_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String share_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public String share_title_myself;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public String share_title_other;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String share_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String share_weibo_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public String whatsapp_desc;

    /* renamed from: com.ss.ugc.aweme.proto.ShareStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ShareStructV2, Builder> {
        public Integer bool_persist;
        public String goods_rec_url;
        public String manage_goods_url;
        public String share_desc;
        public UrlStructV2 share_image_url;
        public String share_link_desc;
        public UrlStructV2 share_qrcode_url;
        public String share_quote;
        public String share_signature_desc;
        public String share_signature_url;
        public String share_title;
        public String share_title_myself;
        public String share_title_other;
        public String share_url;
        public String share_weibo_desc;
        public String whatsapp_desc;

        public final ShareStructV2 build() {
            ShareStructV2 shareStructV2 = new ShareStructV2(this.share_url, this.share_weibo_desc, this.share_desc, this.share_title, this.share_qrcode_url, this.manage_goods_url, this.share_image_url, this.bool_persist, this.goods_rec_url, this.share_title_myself, this.share_title_other, this.share_link_desc, this.share_signature_url, this.share_signature_desc, this.share_quote, this.whatsapp_desc, super.buildUnknownFields());
            return shareStructV2;
        }

        public final Builder bool_persist(Integer num) {
            this.bool_persist = num;
            return this;
        }

        public final Builder goods_rec_url(String str) {
            this.goods_rec_url = str;
            return this;
        }

        public final Builder manage_goods_url(String str) {
            this.manage_goods_url = str;
            return this;
        }

        public final Builder share_desc(String str) {
            this.share_desc = str;
            return this;
        }

        public final Builder share_image_url(UrlStructV2 urlStructV2) {
            this.share_image_url = urlStructV2;
            return this;
        }

        public final Builder share_link_desc(String str) {
            this.share_link_desc = str;
            return this;
        }

        public final Builder share_qrcode_url(UrlStructV2 urlStructV2) {
            this.share_qrcode_url = urlStructV2;
            return this;
        }

        public final Builder share_quote(String str) {
            this.share_quote = str;
            return this;
        }

        public final Builder share_signature_desc(String str) {
            this.share_signature_desc = str;
            return this;
        }

        public final Builder share_signature_url(String str) {
            this.share_signature_url = str;
            return this;
        }

        public final Builder share_title(String str) {
            this.share_title = str;
            return this;
        }

        public final Builder share_title_myself(String str) {
            this.share_title_myself = str;
            return this;
        }

        public final Builder share_title_other(String str) {
            this.share_title_other = str;
            return this;
        }

        public final Builder share_url(String str) {
            this.share_url = str;
            return this;
        }

        public final Builder share_weibo_desc(String str) {
            this.share_weibo_desc = str;
            return this;
        }

        public final Builder whatsapp_desc(String str) {
            this.whatsapp_desc = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ShareStructV2$ProtoAdapter_ShareStructV2 */
    static final class ProtoAdapter_ShareStructV2 extends ProtoAdapter<ShareStructV2> {
        public ProtoAdapter_ShareStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareStructV2.class);
        }

        public final int encodedSize(ShareStructV2 shareStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, shareStructV2.share_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, shareStructV2.share_weibo_desc) + ProtoAdapter.STRING.encodedSizeWithTag(3, shareStructV2.share_desc) + ProtoAdapter.STRING.encodedSizeWithTag(4, shareStructV2.share_title) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, shareStructV2.share_qrcode_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, shareStructV2.manage_goods_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, shareStructV2.share_image_url) + ProtoAdapter.INT32.encodedSizeWithTag(8, shareStructV2.bool_persist) + ProtoAdapter.STRING.encodedSizeWithTag(9, shareStructV2.goods_rec_url) + ProtoAdapter.STRING.encodedSizeWithTag(10, shareStructV2.share_title_myself) + ProtoAdapter.STRING.encodedSizeWithTag(11, shareStructV2.share_title_other) + ProtoAdapter.STRING.encodedSizeWithTag(12, shareStructV2.share_link_desc) + ProtoAdapter.STRING.encodedSizeWithTag(13, shareStructV2.share_signature_url) + ProtoAdapter.STRING.encodedSizeWithTag(14, shareStructV2.share_signature_desc) + ProtoAdapter.STRING.encodedSizeWithTag(15, shareStructV2.share_quote) + ProtoAdapter.STRING.encodedSizeWithTag(16, shareStructV2.whatsapp_desc) + shareStructV2.unknownFields().size();
        }

        public final ShareStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.share_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.share_weibo_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.share_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.share_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.share_qrcode_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.manage_goods_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.share_image_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.bool_persist((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.goods_rec_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.share_title_myself((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.share_title_other((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.share_link_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.share_signature_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.share_signature_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.share_quote((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.whatsapp_desc((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ShareStructV2 shareStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareStructV2.share_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareStructV2.share_weibo_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareStructV2.share_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareStructV2.share_title);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, shareStructV2.share_qrcode_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, shareStructV2.manage_goods_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, shareStructV2.share_image_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, shareStructV2.bool_persist);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, shareStructV2.goods_rec_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, shareStructV2.share_title_myself);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, shareStructV2.share_title_other);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, shareStructV2.share_link_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, shareStructV2.share_signature_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, shareStructV2.share_signature_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, shareStructV2.share_quote);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, shareStructV2.whatsapp_desc);
            protoWriter.writeBytes(shareStructV2.unknownFields());
        }
    }

    public ShareStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.share_url = this.share_url;
        builder.share_weibo_desc = this.share_weibo_desc;
        builder.share_desc = this.share_desc;
        builder.share_title = this.share_title;
        builder.share_qrcode_url = this.share_qrcode_url;
        builder.manage_goods_url = this.manage_goods_url;
        builder.share_image_url = this.share_image_url;
        builder.bool_persist = this.bool_persist;
        builder.goods_rec_url = this.goods_rec_url;
        builder.share_title_myself = this.share_title_myself;
        builder.share_title_other = this.share_title_other;
        builder.share_link_desc = this.share_link_desc;
        builder.share_signature_url = this.share_signature_url;
        builder.share_signature_desc = this.share_signature_desc;
        builder.share_quote = this.share_quote;
        builder.whatsapp_desc = this.whatsapp_desc;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.hashCode;
        if (i16 != 0) {
            return i16;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i17 = 0;
        if (this.share_url != null) {
            i = this.share_url.hashCode();
        } else {
            i = 0;
        }
        int i18 = (hashCode + i) * 37;
        if (this.share_weibo_desc != null) {
            i2 = this.share_weibo_desc.hashCode();
        } else {
            i2 = 0;
        }
        int i19 = (i18 + i2) * 37;
        if (this.share_desc != null) {
            i3 = this.share_desc.hashCode();
        } else {
            i3 = 0;
        }
        int i20 = (i19 + i3) * 37;
        if (this.share_title != null) {
            i4 = this.share_title.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (i20 + i4) * 37;
        if (this.share_qrcode_url != null) {
            i5 = this.share_qrcode_url.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 37;
        if (this.manage_goods_url != null) {
            i6 = this.manage_goods_url.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 37;
        if (this.share_image_url != null) {
            i7 = this.share_image_url.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 37;
        if (this.bool_persist != null) {
            i8 = this.bool_persist.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 37;
        if (this.goods_rec_url != null) {
            i9 = this.goods_rec_url.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 37;
        if (this.share_title_myself != null) {
            i10 = this.share_title_myself.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 37;
        if (this.share_title_other != null) {
            i11 = this.share_title_other.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 37;
        if (this.share_link_desc != null) {
            i12 = this.share_link_desc.hashCode();
        } else {
            i12 = 0;
        }
        int i29 = (i28 + i12) * 37;
        if (this.share_signature_url != null) {
            i13 = this.share_signature_url.hashCode();
        } else {
            i13 = 0;
        }
        int i30 = (i29 + i13) * 37;
        if (this.share_signature_desc != null) {
            i14 = this.share_signature_desc.hashCode();
        } else {
            i14 = 0;
        }
        int i31 = (i30 + i14) * 37;
        if (this.share_quote != null) {
            i15 = this.share_quote.hashCode();
        } else {
            i15 = 0;
        }
        int i32 = (i31 + i15) * 37;
        if (this.whatsapp_desc != null) {
            i17 = this.whatsapp_desc.hashCode();
        }
        int i33 = i32 + i17;
        this.hashCode = i33;
        return i33;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.share_url != null) {
            sb.append(", share_url=");
            sb.append(this.share_url);
        }
        if (this.share_weibo_desc != null) {
            sb.append(", share_weibo_desc=");
            sb.append(this.share_weibo_desc);
        }
        if (this.share_desc != null) {
            sb.append(", share_desc=");
            sb.append(this.share_desc);
        }
        if (this.share_title != null) {
            sb.append(", share_title=");
            sb.append(this.share_title);
        }
        if (this.share_qrcode_url != null) {
            sb.append(", share_qrcode_url=");
            sb.append(this.share_qrcode_url);
        }
        if (this.manage_goods_url != null) {
            sb.append(", manage_goods_url=");
            sb.append(this.manage_goods_url);
        }
        if (this.share_image_url != null) {
            sb.append(", share_image_url=");
            sb.append(this.share_image_url);
        }
        if (this.bool_persist != null) {
            sb.append(", bool_persist=");
            sb.append(this.bool_persist);
        }
        if (this.goods_rec_url != null) {
            sb.append(", goods_rec_url=");
            sb.append(this.goods_rec_url);
        }
        if (this.share_title_myself != null) {
            sb.append(", share_title_myself=");
            sb.append(this.share_title_myself);
        }
        if (this.share_title_other != null) {
            sb.append(", share_title_other=");
            sb.append(this.share_title_other);
        }
        if (this.share_link_desc != null) {
            sb.append(", share_link_desc=");
            sb.append(this.share_link_desc);
        }
        if (this.share_signature_url != null) {
            sb.append(", share_signature_url=");
            sb.append(this.share_signature_url);
        }
        if (this.share_signature_desc != null) {
            sb.append(", share_signature_desc=");
            sb.append(this.share_signature_desc);
        }
        if (this.share_quote != null) {
            sb.append(", share_quote=");
            sb.append(this.share_quote);
        }
        if (this.whatsapp_desc != null) {
            sb.append(", whatsapp_desc=");
            sb.append(this.whatsapp_desc);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShareStructV2)) {
            return false;
        }
        ShareStructV2 shareStructV2 = (ShareStructV2) obj;
        if (!unknownFields().equals(shareStructV2.unknownFields()) || !Internal.equals(this.share_url, shareStructV2.share_url) || !Internal.equals(this.share_weibo_desc, shareStructV2.share_weibo_desc) || !Internal.equals(this.share_desc, shareStructV2.share_desc) || !Internal.equals(this.share_title, shareStructV2.share_title) || !Internal.equals(this.share_qrcode_url, shareStructV2.share_qrcode_url) || !Internal.equals(this.manage_goods_url, shareStructV2.manage_goods_url) || !Internal.equals(this.share_image_url, shareStructV2.share_image_url) || !Internal.equals(this.bool_persist, shareStructV2.bool_persist) || !Internal.equals(this.goods_rec_url, shareStructV2.goods_rec_url) || !Internal.equals(this.share_title_myself, shareStructV2.share_title_myself) || !Internal.equals(this.share_title_other, shareStructV2.share_title_other) || !Internal.equals(this.share_link_desc, shareStructV2.share_link_desc) || !Internal.equals(this.share_signature_url, shareStructV2.share_signature_url) || !Internal.equals(this.share_signature_desc, shareStructV2.share_signature_desc) || !Internal.equals(this.share_quote, shareStructV2.share_quote) || !Internal.equals(this.whatsapp_desc, shareStructV2.whatsapp_desc)) {
            return false;
        }
        return true;
    }

    public ShareStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, String str5, UrlStructV2 urlStructV22, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this(str, str2, str3, str4, urlStructV2, str5, urlStructV22, num, str6, str7, str8, str9, str10, str11, str12, str13, ByteString.EMPTY);
    }

    public ShareStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, String str5, UrlStructV2 urlStructV22, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_url = str;
        this.share_weibo_desc = str2;
        this.share_desc = str3;
        this.share_title = str4;
        this.share_qrcode_url = urlStructV2;
        this.manage_goods_url = str5;
        this.share_image_url = urlStructV22;
        this.bool_persist = num;
        this.goods_rec_url = str6;
        this.share_title_myself = str7;
        this.share_title_other = str8;
        this.share_link_desc = str9;
        this.share_signature_url = str10;
        this.share_signature_desc = str11;
        this.share_quote = str12;
        this.whatsapp_desc = str13;
    }
}
