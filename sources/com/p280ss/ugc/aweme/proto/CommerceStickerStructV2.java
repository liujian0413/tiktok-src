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

/* renamed from: com.ss.ugc.aweme.proto.CommerceStickerStructV2 */
public final class CommerceStickerStructV2 extends Message<CommerceStickerStructV2, Builder> {
    public static final ProtoAdapter<CommerceStickerStructV2> ADAPTER = new ProtoAdapter_CommerceStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String ad_owner_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String ad_owner_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public String challenge_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String detail_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String detail_letters;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String detail_open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String detail_web_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String detail_web_url_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 19)
    public Long expire_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)

    /* renamed from: id */
    public String f118740id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public String music_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 11)
    public UrlStructV2 publish_icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String publish_letters;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public String publish_open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String publish_web_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String publish_web_url_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String screen_desc;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 18)
    public UrlStructV2 screen_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 10)
    public Boolean screen_switch;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceStickerUnlockStructV2#ADAPTER", tag = 20)
    public CommerceStickerUnlockStructV2 unlock_info;

    /* renamed from: com.ss.ugc.aweme.proto.CommerceStickerStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommerceStickerStructV2, Builder> {
        public String ad_owner_id;
        public String ad_owner_name;
        public String challenge_id;
        public String detail_desc;
        public String detail_letters;
        public String detail_open_url;
        public String detail_web_url;
        public String detail_web_url_title;
        public Long expire_time;

        /* renamed from: id */
        public String f118741id;
        public String music_id;
        public UrlStructV2 publish_icon_url;
        public String publish_letters;
        public String publish_open_url;
        public String publish_web_url;
        public String publish_web_url_title;
        public String screen_desc;
        public UrlStructV2 screen_icon;
        public Boolean screen_switch;
        public CommerceStickerUnlockStructV2 unlock_info;

        public final CommerceStickerStructV2 build() {
            CommerceStickerStructV2 commerceStickerStructV2 = new CommerceStickerStructV2(this.f118741id, this.ad_owner_id, this.ad_owner_name, this.detail_desc, this.detail_letters, this.detail_open_url, this.detail_web_url, this.detail_web_url_title, this.screen_desc, this.screen_switch, this.publish_icon_url, this.publish_letters, this.publish_open_url, this.publish_web_url, this.publish_web_url_title, this.music_id, this.challenge_id, this.screen_icon, this.expire_time, this.unlock_info, super.buildUnknownFields());
            return commerceStickerStructV2;
        }

        public final Builder ad_owner_id(String str) {
            this.ad_owner_id = str;
            return this;
        }

        public final Builder ad_owner_name(String str) {
            this.ad_owner_name = str;
            return this;
        }

        public final Builder challenge_id(String str) {
            this.challenge_id = str;
            return this;
        }

        public final Builder detail_desc(String str) {
            this.detail_desc = str;
            return this;
        }

        public final Builder detail_letters(String str) {
            this.detail_letters = str;
            return this;
        }

        public final Builder detail_open_url(String str) {
            this.detail_open_url = str;
            return this;
        }

        public final Builder detail_web_url(String str) {
            this.detail_web_url = str;
            return this;
        }

        public final Builder detail_web_url_title(String str) {
            this.detail_web_url_title = str;
            return this;
        }

        public final Builder expire_time(Long l) {
            this.expire_time = l;
            return this;
        }

        /* renamed from: id */
        public final Builder mo113017id(String str) {
            this.f118741id = str;
            return this;
        }

        public final Builder music_id(String str) {
            this.music_id = str;
            return this;
        }

        public final Builder publish_icon_url(UrlStructV2 urlStructV2) {
            this.publish_icon_url = urlStructV2;
            return this;
        }

        public final Builder publish_letters(String str) {
            this.publish_letters = str;
            return this;
        }

        public final Builder publish_open_url(String str) {
            this.publish_open_url = str;
            return this;
        }

        public final Builder publish_web_url(String str) {
            this.publish_web_url = str;
            return this;
        }

        public final Builder publish_web_url_title(String str) {
            this.publish_web_url_title = str;
            return this;
        }

        public final Builder screen_desc(String str) {
            this.screen_desc = str;
            return this;
        }

        public final Builder screen_icon(UrlStructV2 urlStructV2) {
            this.screen_icon = urlStructV2;
            return this;
        }

        public final Builder screen_switch(Boolean bool) {
            this.screen_switch = bool;
            return this;
        }

        public final Builder unlock_info(CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2) {
            this.unlock_info = commerceStickerUnlockStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommerceStickerStructV2$ProtoAdapter_CommerceStickerStructV2 */
    static final class ProtoAdapter_CommerceStickerStructV2 extends ProtoAdapter<CommerceStickerStructV2> {
        public ProtoAdapter_CommerceStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceStickerStructV2.class);
        }

        public final int encodedSize(CommerceStickerStructV2 commerceStickerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, commerceStickerStructV2.f118740id) + ProtoAdapter.STRING.encodedSizeWithTag(2, commerceStickerStructV2.ad_owner_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, commerceStickerStructV2.ad_owner_name) + ProtoAdapter.STRING.encodedSizeWithTag(4, commerceStickerStructV2.detail_desc) + ProtoAdapter.STRING.encodedSizeWithTag(5, commerceStickerStructV2.detail_letters) + ProtoAdapter.STRING.encodedSizeWithTag(6, commerceStickerStructV2.detail_open_url) + ProtoAdapter.STRING.encodedSizeWithTag(7, commerceStickerStructV2.detail_web_url) + ProtoAdapter.STRING.encodedSizeWithTag(8, commerceStickerStructV2.detail_web_url_title) + ProtoAdapter.STRING.encodedSizeWithTag(9, commerceStickerStructV2.screen_desc) + ProtoAdapter.BOOL.encodedSizeWithTag(10, commerceStickerStructV2.screen_switch) + UrlStructV2.ADAPTER.encodedSizeWithTag(11, commerceStickerStructV2.publish_icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(12, commerceStickerStructV2.publish_letters) + ProtoAdapter.STRING.encodedSizeWithTag(13, commerceStickerStructV2.publish_open_url) + ProtoAdapter.STRING.encodedSizeWithTag(14, commerceStickerStructV2.publish_web_url) + ProtoAdapter.STRING.encodedSizeWithTag(15, commerceStickerStructV2.publish_web_url_title) + ProtoAdapter.STRING.encodedSizeWithTag(16, commerceStickerStructV2.music_id) + ProtoAdapter.STRING.encodedSizeWithTag(17, commerceStickerStructV2.challenge_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, commerceStickerStructV2.screen_icon) + ProtoAdapter.INT64.encodedSizeWithTag(19, commerceStickerStructV2.expire_time) + CommerceStickerUnlockStructV2.ADAPTER.encodedSizeWithTag(20, commerceStickerStructV2.unlock_info) + commerceStickerStructV2.unknownFields().size();
        }

        public final CommerceStickerStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo113017id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.ad_owner_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.ad_owner_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.detail_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.detail_letters((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.detail_open_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.detail_web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.detail_web_url_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.screen_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.screen_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 11:
                            builder.publish_icon_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.publish_letters((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.publish_open_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.publish_web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.publish_web_url_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.music_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            builder.challenge_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 18:
                            builder.screen_icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.expire_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 20:
                            builder.unlock_info((CommerceStickerUnlockStructV2) CommerceStickerUnlockStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommerceStickerStructV2 commerceStickerStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commerceStickerStructV2.f118740id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commerceStickerStructV2.ad_owner_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commerceStickerStructV2.ad_owner_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commerceStickerStructV2.detail_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, commerceStickerStructV2.detail_letters);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, commerceStickerStructV2.detail_open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, commerceStickerStructV2.detail_web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, commerceStickerStructV2.detail_web_url_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, commerceStickerStructV2.screen_desc);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, commerceStickerStructV2.screen_switch);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 11, commerceStickerStructV2.publish_icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, commerceStickerStructV2.publish_letters);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, commerceStickerStructV2.publish_open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, commerceStickerStructV2.publish_web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, commerceStickerStructV2.publish_web_url_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, commerceStickerStructV2.music_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, commerceStickerStructV2.challenge_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, commerceStickerStructV2.screen_icon);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, commerceStickerStructV2.expire_time);
            CommerceStickerUnlockStructV2.ADAPTER.encodeWithTag(protoWriter, 20, commerceStickerStructV2.unlock_info);
            protoWriter.writeBytes(commerceStickerStructV2.unknownFields());
        }
    }

    public CommerceStickerStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f118741id = this.f118740id;
        builder.ad_owner_id = this.ad_owner_id;
        builder.ad_owner_name = this.ad_owner_name;
        builder.detail_desc = this.detail_desc;
        builder.detail_letters = this.detail_letters;
        builder.detail_open_url = this.detail_open_url;
        builder.detail_web_url = this.detail_web_url;
        builder.detail_web_url_title = this.detail_web_url_title;
        builder.screen_desc = this.screen_desc;
        builder.screen_switch = this.screen_switch;
        builder.publish_icon_url = this.publish_icon_url;
        builder.publish_letters = this.publish_letters;
        builder.publish_open_url = this.publish_open_url;
        builder.publish_web_url = this.publish_web_url;
        builder.publish_web_url_title = this.publish_web_url_title;
        builder.music_id = this.music_id;
        builder.challenge_id = this.challenge_id;
        builder.screen_icon = this.screen_icon;
        builder.expire_time = this.expire_time;
        builder.unlock_info = this.unlock_info;
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
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.hashCode;
        if (i20 != 0) {
            return i20;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i21 = 0;
        if (this.f118740id != null) {
            i = this.f118740id.hashCode();
        } else {
            i = 0;
        }
        int i22 = (hashCode + i) * 37;
        if (this.ad_owner_id != null) {
            i2 = this.ad_owner_id.hashCode();
        } else {
            i2 = 0;
        }
        int i23 = (i22 + i2) * 37;
        if (this.ad_owner_name != null) {
            i3 = this.ad_owner_name.hashCode();
        } else {
            i3 = 0;
        }
        int i24 = (i23 + i3) * 37;
        if (this.detail_desc != null) {
            i4 = this.detail_desc.hashCode();
        } else {
            i4 = 0;
        }
        int i25 = (i24 + i4) * 37;
        if (this.detail_letters != null) {
            i5 = this.detail_letters.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 37;
        if (this.detail_open_url != null) {
            i6 = this.detail_open_url.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 37;
        if (this.detail_web_url != null) {
            i7 = this.detail_web_url.hashCode();
        } else {
            i7 = 0;
        }
        int i28 = (i27 + i7) * 37;
        if (this.detail_web_url_title != null) {
            i8 = this.detail_web_url_title.hashCode();
        } else {
            i8 = 0;
        }
        int i29 = (i28 + i8) * 37;
        if (this.screen_desc != null) {
            i9 = this.screen_desc.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (i29 + i9) * 37;
        if (this.screen_switch != null) {
            i10 = this.screen_switch.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (i30 + i10) * 37;
        if (this.publish_icon_url != null) {
            i11 = this.publish_icon_url.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 37;
        if (this.publish_letters != null) {
            i12 = this.publish_letters.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 37;
        if (this.publish_open_url != null) {
            i13 = this.publish_open_url.hashCode();
        } else {
            i13 = 0;
        }
        int i34 = (i33 + i13) * 37;
        if (this.publish_web_url != null) {
            i14 = this.publish_web_url.hashCode();
        } else {
            i14 = 0;
        }
        int i35 = (i34 + i14) * 37;
        if (this.publish_web_url_title != null) {
            i15 = this.publish_web_url_title.hashCode();
        } else {
            i15 = 0;
        }
        int i36 = (i35 + i15) * 37;
        if (this.music_id != null) {
            i16 = this.music_id.hashCode();
        } else {
            i16 = 0;
        }
        int i37 = (i36 + i16) * 37;
        if (this.challenge_id != null) {
            i17 = this.challenge_id.hashCode();
        } else {
            i17 = 0;
        }
        int i38 = (i37 + i17) * 37;
        if (this.screen_icon != null) {
            i18 = this.screen_icon.hashCode();
        } else {
            i18 = 0;
        }
        int i39 = (i38 + i18) * 37;
        if (this.expire_time != null) {
            i19 = this.expire_time.hashCode();
        } else {
            i19 = 0;
        }
        int i40 = (i39 + i19) * 37;
        if (this.unlock_info != null) {
            i21 = this.unlock_info.hashCode();
        }
        int i41 = i40 + i21;
        this.hashCode = i41;
        return i41;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f118740id != null) {
            sb.append(", id=");
            sb.append(this.f118740id);
        }
        if (this.ad_owner_id != null) {
            sb.append(", ad_owner_id=");
            sb.append(this.ad_owner_id);
        }
        if (this.ad_owner_name != null) {
            sb.append(", ad_owner_name=");
            sb.append(this.ad_owner_name);
        }
        if (this.detail_desc != null) {
            sb.append(", detail_desc=");
            sb.append(this.detail_desc);
        }
        if (this.detail_letters != null) {
            sb.append(", detail_letters=");
            sb.append(this.detail_letters);
        }
        if (this.detail_open_url != null) {
            sb.append(", detail_open_url=");
            sb.append(this.detail_open_url);
        }
        if (this.detail_web_url != null) {
            sb.append(", detail_web_url=");
            sb.append(this.detail_web_url);
        }
        if (this.detail_web_url_title != null) {
            sb.append(", detail_web_url_title=");
            sb.append(this.detail_web_url_title);
        }
        if (this.screen_desc != null) {
            sb.append(", screen_desc=");
            sb.append(this.screen_desc);
        }
        if (this.screen_switch != null) {
            sb.append(", screen_switch=");
            sb.append(this.screen_switch);
        }
        if (this.publish_icon_url != null) {
            sb.append(", publish_icon_url=");
            sb.append(this.publish_icon_url);
        }
        if (this.publish_letters != null) {
            sb.append(", publish_letters=");
            sb.append(this.publish_letters);
        }
        if (this.publish_open_url != null) {
            sb.append(", publish_open_url=");
            sb.append(this.publish_open_url);
        }
        if (this.publish_web_url != null) {
            sb.append(", publish_web_url=");
            sb.append(this.publish_web_url);
        }
        if (this.publish_web_url_title != null) {
            sb.append(", publish_web_url_title=");
            sb.append(this.publish_web_url_title);
        }
        if (this.music_id != null) {
            sb.append(", music_id=");
            sb.append(this.music_id);
        }
        if (this.challenge_id != null) {
            sb.append(", challenge_id=");
            sb.append(this.challenge_id);
        }
        if (this.screen_icon != null) {
            sb.append(", screen_icon=");
            sb.append(this.screen_icon);
        }
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        if (this.unlock_info != null) {
            sb.append(", unlock_info=");
            sb.append(this.unlock_info);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceStickerStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceStickerStructV2)) {
            return false;
        }
        CommerceStickerStructV2 commerceStickerStructV2 = (CommerceStickerStructV2) obj;
        if (!unknownFields().equals(commerceStickerStructV2.unknownFields()) || !Internal.equals(this.f118740id, commerceStickerStructV2.f118740id) || !Internal.equals(this.ad_owner_id, commerceStickerStructV2.ad_owner_id) || !Internal.equals(this.ad_owner_name, commerceStickerStructV2.ad_owner_name) || !Internal.equals(this.detail_desc, commerceStickerStructV2.detail_desc) || !Internal.equals(this.detail_letters, commerceStickerStructV2.detail_letters) || !Internal.equals(this.detail_open_url, commerceStickerStructV2.detail_open_url) || !Internal.equals(this.detail_web_url, commerceStickerStructV2.detail_web_url) || !Internal.equals(this.detail_web_url_title, commerceStickerStructV2.detail_web_url_title) || !Internal.equals(this.screen_desc, commerceStickerStructV2.screen_desc) || !Internal.equals(this.screen_switch, commerceStickerStructV2.screen_switch) || !Internal.equals(this.publish_icon_url, commerceStickerStructV2.publish_icon_url) || !Internal.equals(this.publish_letters, commerceStickerStructV2.publish_letters) || !Internal.equals(this.publish_open_url, commerceStickerStructV2.publish_open_url) || !Internal.equals(this.publish_web_url, commerceStickerStructV2.publish_web_url) || !Internal.equals(this.publish_web_url_title, commerceStickerStructV2.publish_web_url_title) || !Internal.equals(this.music_id, commerceStickerStructV2.music_id) || !Internal.equals(this.challenge_id, commerceStickerStructV2.challenge_id) || !Internal.equals(this.screen_icon, commerceStickerStructV2.screen_icon) || !Internal.equals(this.expire_time, commerceStickerStructV2.expire_time) || !Internal.equals(this.unlock_info, commerceStickerStructV2.unlock_info)) {
            return false;
        }
        return true;
    }

    public CommerceStickerStructV2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, UrlStructV2 urlStructV2, String str10, String str11, String str12, String str13, String str14, String str15, UrlStructV2 urlStructV22, Long l, CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, urlStructV2, str10, str11, str12, str13, str14, str15, urlStructV22, l, commerceStickerUnlockStructV2, ByteString.EMPTY);
    }

    public CommerceStickerStructV2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, UrlStructV2 urlStructV2, String str10, String str11, String str12, String str13, String str14, String str15, UrlStructV2 urlStructV22, Long l, CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f118740id = str;
        this.ad_owner_id = str2;
        this.ad_owner_name = str3;
        this.detail_desc = str4;
        this.detail_letters = str5;
        this.detail_open_url = str6;
        this.detail_web_url = str7;
        this.detail_web_url_title = str8;
        this.screen_desc = str9;
        this.screen_switch = bool;
        this.publish_icon_url = urlStructV2;
        this.publish_letters = str10;
        this.publish_open_url = str11;
        this.publish_web_url = str12;
        this.publish_web_url_title = str13;
        this.music_id = str14;
        this.challenge_id = str15;
        this.screen_icon = urlStructV22;
        this.expire_time = l;
        this.unlock_info = commerceStickerUnlockStructV2;
    }
}
