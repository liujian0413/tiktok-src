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

/* renamed from: com.ss.ugc.aweme.proto.AwemeCommerceStickerStructV2 */
public final class AwemeCommerceStickerStructV2 extends Message<AwemeCommerceStickerStructV2, Builder> {
    public static final ProtoAdapter<AwemeCommerceStickerStructV2> ADAPTER = new ProtoAdapter_AwemeCommerceStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long commerce_sticker_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String letters;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String web_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String web_url_title;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeCommerceStickerStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeCommerceStickerStructV2, Builder> {
        public Long commerce_sticker_id;
        public UrlStructV2 icon_url;
        public String letters;
        public String open_url;
        public String web_url;
        public String web_url_title;

        public final AwemeCommerceStickerStructV2 build() {
            AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2 = new AwemeCommerceStickerStructV2(this.commerce_sticker_id, this.icon_url, this.letters, this.open_url, this.web_url, this.web_url_title, super.buildUnknownFields());
            return awemeCommerceStickerStructV2;
        }

        public final Builder commerce_sticker_id(Long l) {
            this.commerce_sticker_id = l;
            return this;
        }

        public final Builder icon_url(UrlStructV2 urlStructV2) {
            this.icon_url = urlStructV2;
            return this;
        }

        public final Builder letters(String str) {
            this.letters = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }

        public final Builder web_url_title(String str) {
            this.web_url_title = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeCommerceStickerStructV2$ProtoAdapter_AwemeCommerceStickerStructV2 */
    static final class ProtoAdapter_AwemeCommerceStickerStructV2 extends ProtoAdapter<AwemeCommerceStickerStructV2> {
        public ProtoAdapter_AwemeCommerceStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeCommerceStickerStructV2.class);
        }

        public final int encodedSize(AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, awemeCommerceStickerStructV2.commerce_sticker_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, awemeCommerceStickerStructV2.icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, awemeCommerceStickerStructV2.letters) + ProtoAdapter.STRING.encodedSizeWithTag(4, awemeCommerceStickerStructV2.open_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, awemeCommerceStickerStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, awemeCommerceStickerStructV2.web_url_title) + awemeCommerceStickerStructV2.unknownFields().size();
        }

        public final AwemeCommerceStickerStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.commerce_sticker_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.icon_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.letters((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.open_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.web_url_title((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, awemeCommerceStickerStructV2.commerce_sticker_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, awemeCommerceStickerStructV2.icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, awemeCommerceStickerStructV2.letters);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, awemeCommerceStickerStructV2.open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, awemeCommerceStickerStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, awemeCommerceStickerStructV2.web_url_title);
            protoWriter.writeBytes(awemeCommerceStickerStructV2.unknownFields());
        }
    }

    public AwemeCommerceStickerStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.commerce_sticker_id = this.commerce_sticker_id;
        builder.icon_url = this.icon_url;
        builder.letters = this.letters;
        builder.open_url = this.open_url;
        builder.web_url = this.web_url;
        builder.web_url_title = this.web_url_title;
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
        if (this.commerce_sticker_id != null) {
            i = this.commerce_sticker_id.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.icon_url != null) {
            i2 = this.icon_url.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.letters != null) {
            i3 = this.letters.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.open_url != null) {
            i4 = this.open_url.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.web_url != null) {
            i5 = this.web_url.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.web_url_title != null) {
            i7 = this.web_url_title.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.commerce_sticker_id != null) {
            sb.append(", commerce_sticker_id=");
            sb.append(this.commerce_sticker_id);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.letters != null) {
            sb.append(", letters=");
            sb.append(this.letters);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        if (this.web_url_title != null) {
            sb.append(", web_url_title=");
            sb.append(this.web_url_title);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeCommerceStickerStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeCommerceStickerStructV2)) {
            return false;
        }
        AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2 = (AwemeCommerceStickerStructV2) obj;
        if (!unknownFields().equals(awemeCommerceStickerStructV2.unknownFields()) || !Internal.equals(this.commerce_sticker_id, awemeCommerceStickerStructV2.commerce_sticker_id) || !Internal.equals(this.icon_url, awemeCommerceStickerStructV2.icon_url) || !Internal.equals(this.letters, awemeCommerceStickerStructV2.letters) || !Internal.equals(this.open_url, awemeCommerceStickerStructV2.open_url) || !Internal.equals(this.web_url, awemeCommerceStickerStructV2.web_url) || !Internal.equals(this.web_url_title, awemeCommerceStickerStructV2.web_url_title)) {
            return false;
        }
        return true;
    }

    public AwemeCommerceStickerStructV2(Long l, UrlStructV2 urlStructV2, String str, String str2, String str3, String str4) {
        this(l, urlStructV2, str, str2, str3, str4, ByteString.EMPTY);
    }

    public AwemeCommerceStickerStructV2(Long l, UrlStructV2 urlStructV2, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.commerce_sticker_id = l;
        this.icon_url = urlStructV2;
        this.letters = str;
        this.open_url = str2;
        this.web_url = str3;
        this.web_url_title = str4;
    }
}
