package com.p280ss.ugc.aweme.proto;

import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.NewFaceStickerStructV2 */
public final class NewFaceStickerStructV2 extends Message<NewFaceStickerStructV2, Builder> {
    public static final ProtoAdapter<NewFaceStickerStructV2> ADAPTER = new ProtoAdapter_NewFaceStickerStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 avatar_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 15)
    public UrlStructV2 avatar_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 14)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 3)
    public List<String> children;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceStickerStructV2#ADAPTER", tag = 12)
    public CommerceStickerStructV2 commerce_sticker;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String effect_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 18)
    public String extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)

    /* renamed from: id */
    public String f118748id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 11)
    public Boolean is_favorite;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String owner_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String owner_nickname;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 10)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 13)
    public List<String> tags;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer user_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 17)
    public Long vv_count;

    /* renamed from: com.ss.ugc.aweme.proto.NewFaceStickerStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<NewFaceStickerStructV2, Builder> {
        public UrlStructV2 avatar_large;
        public UrlStructV2 avatar_medium;
        public UrlStructV2 avatar_thumb;
        public List<String> children = Internal.newMutableList();
        public CommerceStickerStructV2 commerce_sticker;
        public String desc;
        public String effect_id;
        public String extra;
        public UrlStructV2 icon_url;

        /* renamed from: id */
        public String f118749id;
        public Boolean is_favorite;
        public String name;
        public String owner_id;
        public String owner_nickname;
        public ShareStructV2 share_info;
        public List<String> tags = Internal.newMutableList();
        public Integer user_count;
        public Long vv_count;

        public final NewFaceStickerStructV2 build() {
            NewFaceStickerStructV2 newFaceStickerStructV2 = new NewFaceStickerStructV2(this.f118749id, this.name, this.children, this.icon_url, this.owner_id, this.owner_nickname, this.user_count, this.desc, this.effect_id, this.share_info, this.is_favorite, this.commerce_sticker, this.tags, this.avatar_thumb, this.avatar_medium, this.avatar_large, this.vv_count, this.extra, super.buildUnknownFields());
            return newFaceStickerStructV2;
        }

        public final Builder avatar_large(UrlStructV2 urlStructV2) {
            this.avatar_large = urlStructV2;
            return this;
        }

        public final Builder avatar_medium(UrlStructV2 urlStructV2) {
            this.avatar_medium = urlStructV2;
            return this;
        }

        public final Builder avatar_thumb(UrlStructV2 urlStructV2) {
            this.avatar_thumb = urlStructV2;
            return this;
        }

        public final Builder commerce_sticker(CommerceStickerStructV2 commerceStickerStructV2) {
            this.commerce_sticker = commerceStickerStructV2;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder effect_id(String str) {
            this.effect_id = str;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder icon_url(UrlStructV2 urlStructV2) {
            this.icon_url = urlStructV2;
            return this;
        }

        /* renamed from: id */
        public final Builder mo113363id(String str) {
            this.f118749id = str;
            return this;
        }

        public final Builder is_favorite(Boolean bool) {
            this.is_favorite = bool;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder owner_id(String str) {
            this.owner_id = str;
            return this;
        }

        public final Builder owner_nickname(String str) {
            this.owner_nickname = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder vv_count(Long l) {
            this.vv_count = l;
            return this;
        }

        public final Builder children(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.children = list;
            return this;
        }

        public final Builder tags(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.tags = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.NewFaceStickerStructV2$ProtoAdapter_NewFaceStickerStructV2 */
    static final class ProtoAdapter_NewFaceStickerStructV2 extends ProtoAdapter<NewFaceStickerStructV2> {
        public ProtoAdapter_NewFaceStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, NewFaceStickerStructV2.class);
        }

        public final int encodedSize(NewFaceStickerStructV2 newFaceStickerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, newFaceStickerStructV2.f118748id) + ProtoAdapter.STRING.encodedSizeWithTag(2, newFaceStickerStructV2.name) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, newFaceStickerStructV2.children) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, newFaceStickerStructV2.icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, newFaceStickerStructV2.owner_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, newFaceStickerStructV2.owner_nickname) + ProtoAdapter.INT32.encodedSizeWithTag(7, newFaceStickerStructV2.user_count) + ProtoAdapter.STRING.encodedSizeWithTag(8, newFaceStickerStructV2.desc) + ProtoAdapter.STRING.encodedSizeWithTag(9, newFaceStickerStructV2.effect_id) + ShareStructV2.ADAPTER.encodedSizeWithTag(10, newFaceStickerStructV2.share_info) + ProtoAdapter.BOOL.encodedSizeWithTag(11, newFaceStickerStructV2.is_favorite) + CommerceStickerStructV2.ADAPTER.encodedSizeWithTag(12, newFaceStickerStructV2.commerce_sticker) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(13, newFaceStickerStructV2.tags) + UrlStructV2.ADAPTER.encodedSizeWithTag(14, newFaceStickerStructV2.avatar_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(15, newFaceStickerStructV2.avatar_medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, newFaceStickerStructV2.avatar_large) + ProtoAdapter.INT64.encodedSizeWithTag(17, newFaceStickerStructV2.vv_count) + ProtoAdapter.STRING.encodedSizeWithTag(18, newFaceStickerStructV2.extra) + newFaceStickerStructV2.unknownFields().size();
        }

        public final NewFaceStickerStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo113363id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.children.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.icon_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.owner_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.owner_nickname((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.user_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.effect_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.share_info((ShareStructV2) ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.is_favorite((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 12:
                            builder.commerce_sticker((CommerceStickerStructV2) CommerceStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.tags.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.avatar_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.avatar_medium((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.avatar_large((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.vv_count((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 18:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, NewFaceStickerStructV2 newFaceStickerStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, newFaceStickerStructV2.f118748id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, newFaceStickerStructV2.name);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, newFaceStickerStructV2.children);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, newFaceStickerStructV2.icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, newFaceStickerStructV2.owner_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, newFaceStickerStructV2.owner_nickname);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, newFaceStickerStructV2.user_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, newFaceStickerStructV2.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, newFaceStickerStructV2.effect_id);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 10, newFaceStickerStructV2.share_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, newFaceStickerStructV2.is_favorite);
            CommerceStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 12, newFaceStickerStructV2.commerce_sticker);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 13, newFaceStickerStructV2.tags);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 14, newFaceStickerStructV2.avatar_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 15, newFaceStickerStructV2.avatar_medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, newFaceStickerStructV2.avatar_large);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, newFaceStickerStructV2.vv_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, newFaceStickerStructV2.extra);
            protoWriter.writeBytes(newFaceStickerStructV2.unknownFields());
        }
    }

    public NewFaceStickerStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f118749id = this.f118748id;
        builder.name = this.name;
        builder.children = Internal.copyOf("children", this.children);
        builder.icon_url = this.icon_url;
        builder.owner_id = this.owner_id;
        builder.owner_nickname = this.owner_nickname;
        builder.user_count = this.user_count;
        builder.desc = this.desc;
        builder.effect_id = this.effect_id;
        builder.share_info = this.share_info;
        builder.is_favorite = this.is_favorite;
        builder.commerce_sticker = this.commerce_sticker;
        builder.tags = Internal.copyOf(C38347c.f99557l, this.tags);
        builder.avatar_thumb = this.avatar_thumb;
        builder.avatar_medium = this.avatar_medium;
        builder.avatar_large = this.avatar_large;
        builder.vv_count = this.vv_count;
        builder.extra = this.extra;
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
        if (this.f118748id != null) {
            i = this.f118748id.hashCode();
        } else {
            i = 0;
        }
        int i18 = (hashCode + i) * 37;
        if (this.name != null) {
            i2 = this.name.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((i18 + i2) * 37) + this.children.hashCode()) * 37;
        if (this.icon_url != null) {
            i3 = this.icon_url.hashCode();
        } else {
            i3 = 0;
        }
        int i19 = (hashCode2 + i3) * 37;
        if (this.owner_id != null) {
            i4 = this.owner_id.hashCode();
        } else {
            i4 = 0;
        }
        int i20 = (i19 + i4) * 37;
        if (this.owner_nickname != null) {
            i5 = this.owner_nickname.hashCode();
        } else {
            i5 = 0;
        }
        int i21 = (i20 + i5) * 37;
        if (this.user_count != null) {
            i6 = this.user_count.hashCode();
        } else {
            i6 = 0;
        }
        int i22 = (i21 + i6) * 37;
        if (this.desc != null) {
            i7 = this.desc.hashCode();
        } else {
            i7 = 0;
        }
        int i23 = (i22 + i7) * 37;
        if (this.effect_id != null) {
            i8 = this.effect_id.hashCode();
        } else {
            i8 = 0;
        }
        int i24 = (i23 + i8) * 37;
        if (this.share_info != null) {
            i9 = this.share_info.hashCode();
        } else {
            i9 = 0;
        }
        int i25 = (i24 + i9) * 37;
        if (this.is_favorite != null) {
            i10 = this.is_favorite.hashCode();
        } else {
            i10 = 0;
        }
        int i26 = (i25 + i10) * 37;
        if (this.commerce_sticker != null) {
            i11 = this.commerce_sticker.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode3 = (((i26 + i11) * 37) + this.tags.hashCode()) * 37;
        if (this.avatar_thumb != null) {
            i12 = this.avatar_thumb.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (hashCode3 + i12) * 37;
        if (this.avatar_medium != null) {
            i13 = this.avatar_medium.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 37;
        if (this.avatar_large != null) {
            i14 = this.avatar_large.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 37;
        if (this.vv_count != null) {
            i15 = this.vv_count.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (i29 + i15) * 37;
        if (this.extra != null) {
            i17 = this.extra.hashCode();
        }
        int i31 = i30 + i17;
        this.hashCode = i31;
        return i31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f118748id != null) {
            sb.append(", id=");
            sb.append(this.f118748id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.children.isEmpty()) {
            sb.append(", children=");
            sb.append(this.children);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.owner_nickname != null) {
            sb.append(", owner_nickname=");
            sb.append(this.owner_nickname);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.effect_id != null) {
            sb.append(", effect_id=");
            sb.append(this.effect_id);
        }
        if (this.share_info != null) {
            sb.append(", share_info=");
            sb.append(this.share_info);
        }
        if (this.is_favorite != null) {
            sb.append(", is_favorite=");
            sb.append(this.is_favorite);
        }
        if (this.commerce_sticker != null) {
            sb.append(", commerce_sticker=");
            sb.append(this.commerce_sticker);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=");
            sb.append(this.avatar_thumb);
        }
        if (this.avatar_medium != null) {
            sb.append(", avatar_medium=");
            sb.append(this.avatar_medium);
        }
        if (this.avatar_large != null) {
            sb.append(", avatar_large=");
            sb.append(this.avatar_large);
        }
        if (this.vv_count != null) {
            sb.append(", vv_count=");
            sb.append(this.vv_count);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "NewFaceStickerStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewFaceStickerStructV2)) {
            return false;
        }
        NewFaceStickerStructV2 newFaceStickerStructV2 = (NewFaceStickerStructV2) obj;
        if (!unknownFields().equals(newFaceStickerStructV2.unknownFields()) || !Internal.equals(this.f118748id, newFaceStickerStructV2.f118748id) || !Internal.equals(this.name, newFaceStickerStructV2.name) || !this.children.equals(newFaceStickerStructV2.children) || !Internal.equals(this.icon_url, newFaceStickerStructV2.icon_url) || !Internal.equals(this.owner_id, newFaceStickerStructV2.owner_id) || !Internal.equals(this.owner_nickname, newFaceStickerStructV2.owner_nickname) || !Internal.equals(this.user_count, newFaceStickerStructV2.user_count) || !Internal.equals(this.desc, newFaceStickerStructV2.desc) || !Internal.equals(this.effect_id, newFaceStickerStructV2.effect_id) || !Internal.equals(this.share_info, newFaceStickerStructV2.share_info) || !Internal.equals(this.is_favorite, newFaceStickerStructV2.is_favorite) || !Internal.equals(this.commerce_sticker, newFaceStickerStructV2.commerce_sticker) || !this.tags.equals(newFaceStickerStructV2.tags) || !Internal.equals(this.avatar_thumb, newFaceStickerStructV2.avatar_thumb) || !Internal.equals(this.avatar_medium, newFaceStickerStructV2.avatar_medium) || !Internal.equals(this.avatar_large, newFaceStickerStructV2.avatar_large) || !Internal.equals(this.vv_count, newFaceStickerStructV2.vv_count) || !Internal.equals(this.extra, newFaceStickerStructV2.extra)) {
            return false;
        }
        return true;
    }

    public NewFaceStickerStructV2(String str, String str2, List<String> list, UrlStructV2 urlStructV2, String str3, String str4, Integer num, String str5, String str6, ShareStructV2 shareStructV2, Boolean bool, CommerceStickerStructV2 commerceStickerStructV2, List<String> list2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, Long l, String str7) {
        this(str, str2, list, urlStructV2, str3, str4, num, str5, str6, shareStructV2, bool, commerceStickerStructV2, list2, urlStructV22, urlStructV23, urlStructV24, l, str7, ByteString.EMPTY);
    }

    public NewFaceStickerStructV2(String str, String str2, List<String> list, UrlStructV2 urlStructV2, String str3, String str4, Integer num, String str5, String str6, ShareStructV2 shareStructV2, Boolean bool, CommerceStickerStructV2 commerceStickerStructV2, List<String> list2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, Long l, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f118748id = str;
        this.name = str2;
        List<String> list3 = list;
        this.children = Internal.immutableCopyOf("children", list);
        this.icon_url = urlStructV2;
        this.owner_id = str3;
        this.owner_nickname = str4;
        this.user_count = num;
        this.desc = str5;
        this.effect_id = str6;
        this.share_info = shareStructV2;
        this.is_favorite = bool;
        this.commerce_sticker = commerceStickerStructV2;
        this.tags = Internal.immutableCopyOf(C38347c.f99557l, list2);
        this.avatar_thumb = urlStructV22;
        this.avatar_medium = urlStructV23;
        this.avatar_large = urlStructV24;
        this.vv_count = l;
        this.extra = str7;
    }
}
