package com.p280ss.ugc.aweme.proto;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
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

/* renamed from: com.ss.ugc.aweme.proto.ChallengeStructV2 */
public final class ChallengeStructV2 extends Message<ChallengeStructV2, Builder> {
    public static final ProtoAdapter<ChallengeStructV2> ADAPTER = new ProtoAdapter_ChallengeStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 22)
    public Boolean allow_upload_cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnnouncementStructV2#ADAPTER", tag = 29)
    public AnnouncementStructV2 announcement_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = 5)
    public UserStructV2 author;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 12)
    public UrlStructV2 background_image_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.IconButtonStructV2#ADAPTER", tag = 34)
    public IconButtonStructV2 button;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CategoryCoverStructV2#ADAPTER", tag = 24)
    public CategoryCoverStructV2 category_cover_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 33)
    public List<String> cha_attrs;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String cha_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String cid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer collect_stat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicStructV2#ADAPTER", label = Label.REPEATED, tag = 8)
    public List<MusicStructV2> connect_music;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 30)
    public Integer content_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 18)
    public UrlStructV2 cover_item;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String cover_photo;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String desc;
    @WireField(adapter = "com.ss.ugc.aweme.proto.DisclaimerStructV2#ADAPTER", tag = 21)
    public DisclaimerStructV2 disclaimer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String hashtag_profile;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 19)
    public Integer is_challenge;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 23)
    public Boolean is_commerce;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 27)
    public Integer is_hot_search;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 16)
    public Boolean is_pgcshow;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String link_action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String link_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 28)
    public Integer link_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 31)
    public Integer module_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 32)
    public String profile_tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String schema;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 7)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public String sticker_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public Integer sub_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public String use_count_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer user_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 20)
    public Long view_count;

    /* renamed from: com.ss.ugc.aweme.proto.ChallengeStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ChallengeStructV2, Builder> {
        public Boolean allow_upload_cover;
        public AnnouncementStructV2 announcement_info;
        public UserStructV2 author;
        public UrlStructV2 background_image_url;
        public IconButtonStructV2 button;
        public CategoryCoverStructV2 category_cover_info;
        public List<String> cha_attrs = Internal.newMutableList();
        public String cha_name;
        public String cid;
        public Integer collect_stat;
        public List<MusicStructV2> connect_music = Internal.newMutableList();
        public Integer content_type;
        public UrlStructV2 cover_item;
        public String cover_photo;
        public String desc;
        public DisclaimerStructV2 disclaimer;
        public String hashtag_profile;
        public Integer is_challenge;
        public Boolean is_commerce;
        public Integer is_hot_search;
        public Boolean is_pgcshow;
        public String link_action;
        public String link_text;
        public Integer link_type;
        public Integer module_type;
        public String profile_tag;
        public String schema;
        public ShareStructV2 share_info;
        public String sticker_id;
        public Integer sub_type;
        public Integer type;
        public String use_count_desc;
        public Integer user_count;
        public Long view_count;

        public final ChallengeStructV2 build() {
            ChallengeStructV2 challengeStructV2 = new ChallengeStructV2(this.cid, this.cha_name, this.desc, this.schema, this.author, this.user_count, this.share_info, this.connect_music, this.type, this.use_count_desc, this.sub_type, this.background_image_url, this.sticker_id, this.link_text, this.link_action, this.is_pgcshow, this.collect_stat, this.cover_item, this.is_challenge, this.view_count, this.disclaimer, this.allow_upload_cover, this.is_commerce, this.category_cover_info, this.hashtag_profile, this.cover_photo, this.is_hot_search, this.link_type, this.announcement_info, this.content_type, this.module_type, this.profile_tag, this.cha_attrs, this.button, super.buildUnknownFields());
            return challengeStructV2;
        }

        public final Builder allow_upload_cover(Boolean bool) {
            this.allow_upload_cover = bool;
            return this;
        }

        public final Builder announcement_info(AnnouncementStructV2 announcementStructV2) {
            this.announcement_info = announcementStructV2;
            return this;
        }

        public final Builder author(UserStructV2 userStructV2) {
            this.author = userStructV2;
            return this;
        }

        public final Builder background_image_url(UrlStructV2 urlStructV2) {
            this.background_image_url = urlStructV2;
            return this;
        }

        public final Builder button(IconButtonStructV2 iconButtonStructV2) {
            this.button = iconButtonStructV2;
            return this;
        }

        public final Builder category_cover_info(CategoryCoverStructV2 categoryCoverStructV2) {
            this.category_cover_info = categoryCoverStructV2;
            return this;
        }

        public final Builder cha_name(String str) {
            this.cha_name = str;
            return this;
        }

        public final Builder cid(String str) {
            this.cid = str;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder content_type(Integer num) {
            this.content_type = num;
            return this;
        }

        public final Builder cover_item(UrlStructV2 urlStructV2) {
            this.cover_item = urlStructV2;
            return this;
        }

        public final Builder cover_photo(String str) {
            this.cover_photo = str;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder disclaimer(DisclaimerStructV2 disclaimerStructV2) {
            this.disclaimer = disclaimerStructV2;
            return this;
        }

        public final Builder hashtag_profile(String str) {
            this.hashtag_profile = str;
            return this;
        }

        public final Builder is_challenge(Integer num) {
            this.is_challenge = num;
            return this;
        }

        public final Builder is_commerce(Boolean bool) {
            this.is_commerce = bool;
            return this;
        }

        public final Builder is_hot_search(Integer num) {
            this.is_hot_search = num;
            return this;
        }

        public final Builder is_pgcshow(Boolean bool) {
            this.is_pgcshow = bool;
            return this;
        }

        public final Builder link_action(String str) {
            this.link_action = str;
            return this;
        }

        public final Builder link_text(String str) {
            this.link_text = str;
            return this;
        }

        public final Builder link_type(Integer num) {
            this.link_type = num;
            return this;
        }

        public final Builder module_type(Integer num) {
            this.module_type = num;
            return this;
        }

        public final Builder profile_tag(String str) {
            this.profile_tag = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder sticker_id(String str) {
            this.sticker_id = str;
            return this;
        }

        public final Builder sub_type(Integer num) {
            this.sub_type = num;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder use_count_desc(String str) {
            this.use_count_desc = str;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder view_count(Long l) {
            this.view_count = l;
            return this;
        }

        public final Builder cha_attrs(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.cha_attrs = list;
            return this;
        }

        public final Builder connect_music(List<MusicStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.connect_music = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ChallengeStructV2$ProtoAdapter_ChallengeStructV2 */
    static final class ProtoAdapter_ChallengeStructV2 extends ProtoAdapter<ChallengeStructV2> {
        public ProtoAdapter_ChallengeStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ChallengeStructV2.class);
        }

        public final int encodedSize(ChallengeStructV2 challengeStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, challengeStructV2.cid) + ProtoAdapter.STRING.encodedSizeWithTag(2, challengeStructV2.cha_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, challengeStructV2.desc) + ProtoAdapter.STRING.encodedSizeWithTag(4, challengeStructV2.schema) + UserStructV2.ADAPTER.encodedSizeWithTag(5, challengeStructV2.author) + ProtoAdapter.INT32.encodedSizeWithTag(6, challengeStructV2.user_count) + ShareStructV2.ADAPTER.encodedSizeWithTag(7, challengeStructV2.share_info) + MusicStructV2.ADAPTER.asRepeated().encodedSizeWithTag(8, challengeStructV2.connect_music) + ProtoAdapter.INT32.encodedSizeWithTag(9, challengeStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(10, challengeStructV2.use_count_desc) + ProtoAdapter.INT32.encodedSizeWithTag(11, challengeStructV2.sub_type) + UrlStructV2.ADAPTER.encodedSizeWithTag(12, challengeStructV2.background_image_url) + ProtoAdapter.STRING.encodedSizeWithTag(13, challengeStructV2.sticker_id) + ProtoAdapter.STRING.encodedSizeWithTag(14, challengeStructV2.link_text) + ProtoAdapter.STRING.encodedSizeWithTag(15, challengeStructV2.link_action) + ProtoAdapter.BOOL.encodedSizeWithTag(16, challengeStructV2.is_pgcshow) + ProtoAdapter.INT32.encodedSizeWithTag(17, challengeStructV2.collect_stat) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, challengeStructV2.cover_item) + ProtoAdapter.INT32.encodedSizeWithTag(19, challengeStructV2.is_challenge) + ProtoAdapter.INT64.encodedSizeWithTag(20, challengeStructV2.view_count) + DisclaimerStructV2.ADAPTER.encodedSizeWithTag(21, challengeStructV2.disclaimer) + ProtoAdapter.BOOL.encodedSizeWithTag(22, challengeStructV2.allow_upload_cover) + ProtoAdapter.BOOL.encodedSizeWithTag(23, challengeStructV2.is_commerce) + CategoryCoverStructV2.ADAPTER.encodedSizeWithTag(24, challengeStructV2.category_cover_info) + ProtoAdapter.STRING.encodedSizeWithTag(25, challengeStructV2.hashtag_profile) + ProtoAdapter.STRING.encodedSizeWithTag(26, challengeStructV2.cover_photo) + ProtoAdapter.INT32.encodedSizeWithTag(27, challengeStructV2.is_hot_search) + ProtoAdapter.INT32.encodedSizeWithTag(28, challengeStructV2.link_type) + AnnouncementStructV2.ADAPTER.encodedSizeWithTag(29, challengeStructV2.announcement_info) + ProtoAdapter.INT32.encodedSizeWithTag(30, challengeStructV2.content_type) + ProtoAdapter.INT32.encodedSizeWithTag(31, challengeStructV2.module_type) + ProtoAdapter.STRING.encodedSizeWithTag(32, challengeStructV2.profile_tag) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(33, challengeStructV2.cha_attrs) + IconButtonStructV2.ADAPTER.encodedSizeWithTag(34, challengeStructV2.button) + challengeStructV2.unknownFields().size();
        }

        public final ChallengeStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.cha_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.author((UserStructV2) UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.user_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.share_info((ShareStructV2) ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.connect_music.add(MusicStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.use_count_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.sub_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 12:
                            builder.background_image_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.sticker_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.link_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.link_action((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.is_pgcshow((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 17:
                            builder.collect_stat((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 18:
                            builder.cover_item((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.is_challenge((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 20:
                            builder.view_count((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 21:
                            builder.disclaimer((DisclaimerStructV2) DisclaimerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            builder.allow_upload_cover((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 23:
                            builder.is_commerce((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 24:
                            builder.category_cover_info((CategoryCoverStructV2) CategoryCoverStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            builder.hashtag_profile((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                            builder.cover_photo((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            builder.is_hot_search((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 28:
                            builder.link_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 29:
                            builder.announcement_info((AnnouncementStructV2) AnnouncementStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            builder.content_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 31:
                            builder.module_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 32:
                            builder.profile_tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 33:
                            builder.cha_attrs.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.CHALLENGE /*34*/:
                            builder.button((IconButtonStructV2) IconButtonStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ChallengeStructV2 challengeStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, challengeStructV2.cid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, challengeStructV2.cha_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, challengeStructV2.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, challengeStructV2.schema);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 5, challengeStructV2.author);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, challengeStructV2.user_count);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 7, challengeStructV2.share_info);
            MusicStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, challengeStructV2.connect_music);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, challengeStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, challengeStructV2.use_count_desc);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, challengeStructV2.sub_type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 12, challengeStructV2.background_image_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, challengeStructV2.sticker_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, challengeStructV2.link_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, challengeStructV2.link_action);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, challengeStructV2.is_pgcshow);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, challengeStructV2.collect_stat);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, challengeStructV2.cover_item);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, challengeStructV2.is_challenge);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, challengeStructV2.view_count);
            DisclaimerStructV2.ADAPTER.encodeWithTag(protoWriter, 21, challengeStructV2.disclaimer);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, challengeStructV2.allow_upload_cover);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, challengeStructV2.is_commerce);
            CategoryCoverStructV2.ADAPTER.encodeWithTag(protoWriter, 24, challengeStructV2.category_cover_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, challengeStructV2.hashtag_profile);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, challengeStructV2.cover_photo);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 27, challengeStructV2.is_hot_search);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, challengeStructV2.link_type);
            AnnouncementStructV2.ADAPTER.encodeWithTag(protoWriter, 29, challengeStructV2.announcement_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 30, challengeStructV2.content_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 31, challengeStructV2.module_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, challengeStructV2.profile_tag);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 33, challengeStructV2.cha_attrs);
            IconButtonStructV2.ADAPTER.encodeWithTag(protoWriter, 34, challengeStructV2.button);
            protoWriter.writeBytes(challengeStructV2.unknownFields());
        }
    }

    public ChallengeStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cid = this.cid;
        builder.cha_name = this.cha_name;
        builder.desc = this.desc;
        builder.schema = this.schema;
        builder.author = this.author;
        builder.user_count = this.user_count;
        builder.share_info = this.share_info;
        builder.connect_music = Internal.copyOf("connect_music", this.connect_music);
        builder.type = this.type;
        builder.use_count_desc = this.use_count_desc;
        builder.sub_type = this.sub_type;
        builder.background_image_url = this.background_image_url;
        builder.sticker_id = this.sticker_id;
        builder.link_text = this.link_text;
        builder.link_action = this.link_action;
        builder.is_pgcshow = this.is_pgcshow;
        builder.collect_stat = this.collect_stat;
        builder.cover_item = this.cover_item;
        builder.is_challenge = this.is_challenge;
        builder.view_count = this.view_count;
        builder.disclaimer = this.disclaimer;
        builder.allow_upload_cover = this.allow_upload_cover;
        builder.is_commerce = this.is_commerce;
        builder.category_cover_info = this.category_cover_info;
        builder.hashtag_profile = this.hashtag_profile;
        builder.cover_photo = this.cover_photo;
        builder.is_hot_search = this.is_hot_search;
        builder.link_type = this.link_type;
        builder.announcement_info = this.announcement_info;
        builder.content_type = this.content_type;
        builder.module_type = this.module_type;
        builder.profile_tag = this.profile_tag;
        builder.cha_attrs = Internal.copyOf("cha_attrs", this.cha_attrs);
        builder.button = this.button;
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
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32 = this.hashCode;
        if (i32 != 0) {
            return i32;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i33 = 0;
        if (this.cid != null) {
            i = this.cid.hashCode();
        } else {
            i = 0;
        }
        int i34 = (hashCode + i) * 37;
        if (this.cha_name != null) {
            i2 = this.cha_name.hashCode();
        } else {
            i2 = 0;
        }
        int i35 = (i34 + i2) * 37;
        if (this.desc != null) {
            i3 = this.desc.hashCode();
        } else {
            i3 = 0;
        }
        int i36 = (i35 + i3) * 37;
        if (this.schema != null) {
            i4 = this.schema.hashCode();
        } else {
            i4 = 0;
        }
        int i37 = (i36 + i4) * 37;
        if (this.author != null) {
            i5 = this.author.hashCode();
        } else {
            i5 = 0;
        }
        int i38 = (i37 + i5) * 37;
        if (this.user_count != null) {
            i6 = this.user_count.hashCode();
        } else {
            i6 = 0;
        }
        int i39 = (i38 + i6) * 37;
        if (this.share_info != null) {
            i7 = this.share_info.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = (((i39 + i7) * 37) + this.connect_music.hashCode()) * 37;
        if (this.type != null) {
            i8 = this.type.hashCode();
        } else {
            i8 = 0;
        }
        int i40 = (hashCode2 + i8) * 37;
        if (this.use_count_desc != null) {
            i9 = this.use_count_desc.hashCode();
        } else {
            i9 = 0;
        }
        int i41 = (i40 + i9) * 37;
        if (this.sub_type != null) {
            i10 = this.sub_type.hashCode();
        } else {
            i10 = 0;
        }
        int i42 = (i41 + i10) * 37;
        if (this.background_image_url != null) {
            i11 = this.background_image_url.hashCode();
        } else {
            i11 = 0;
        }
        int i43 = (i42 + i11) * 37;
        if (this.sticker_id != null) {
            i12 = this.sticker_id.hashCode();
        } else {
            i12 = 0;
        }
        int i44 = (i43 + i12) * 37;
        if (this.link_text != null) {
            i13 = this.link_text.hashCode();
        } else {
            i13 = 0;
        }
        int i45 = (i44 + i13) * 37;
        if (this.link_action != null) {
            i14 = this.link_action.hashCode();
        } else {
            i14 = 0;
        }
        int i46 = (i45 + i14) * 37;
        if (this.is_pgcshow != null) {
            i15 = this.is_pgcshow.hashCode();
        } else {
            i15 = 0;
        }
        int i47 = (i46 + i15) * 37;
        if (this.collect_stat != null) {
            i16 = this.collect_stat.hashCode();
        } else {
            i16 = 0;
        }
        int i48 = (i47 + i16) * 37;
        if (this.cover_item != null) {
            i17 = this.cover_item.hashCode();
        } else {
            i17 = 0;
        }
        int i49 = (i48 + i17) * 37;
        if (this.is_challenge != null) {
            i18 = this.is_challenge.hashCode();
        } else {
            i18 = 0;
        }
        int i50 = (i49 + i18) * 37;
        if (this.view_count != null) {
            i19 = this.view_count.hashCode();
        } else {
            i19 = 0;
        }
        int i51 = (i50 + i19) * 37;
        if (this.disclaimer != null) {
            i20 = this.disclaimer.hashCode();
        } else {
            i20 = 0;
        }
        int i52 = (i51 + i20) * 37;
        if (this.allow_upload_cover != null) {
            i21 = this.allow_upload_cover.hashCode();
        } else {
            i21 = 0;
        }
        int i53 = (i52 + i21) * 37;
        if (this.is_commerce != null) {
            i22 = this.is_commerce.hashCode();
        } else {
            i22 = 0;
        }
        int i54 = (i53 + i22) * 37;
        if (this.category_cover_info != null) {
            i23 = this.category_cover_info.hashCode();
        } else {
            i23 = 0;
        }
        int i55 = (i54 + i23) * 37;
        if (this.hashtag_profile != null) {
            i24 = this.hashtag_profile.hashCode();
        } else {
            i24 = 0;
        }
        int i56 = (i55 + i24) * 37;
        if (this.cover_photo != null) {
            i25 = this.cover_photo.hashCode();
        } else {
            i25 = 0;
        }
        int i57 = (i56 + i25) * 37;
        if (this.is_hot_search != null) {
            i26 = this.is_hot_search.hashCode();
        } else {
            i26 = 0;
        }
        int i58 = (i57 + i26) * 37;
        if (this.link_type != null) {
            i27 = this.link_type.hashCode();
        } else {
            i27 = 0;
        }
        int i59 = (i58 + i27) * 37;
        if (this.announcement_info != null) {
            i28 = this.announcement_info.hashCode();
        } else {
            i28 = 0;
        }
        int i60 = (i59 + i28) * 37;
        if (this.content_type != null) {
            i29 = this.content_type.hashCode();
        } else {
            i29 = 0;
        }
        int i61 = (i60 + i29) * 37;
        if (this.module_type != null) {
            i30 = this.module_type.hashCode();
        } else {
            i30 = 0;
        }
        int i62 = (i61 + i30) * 37;
        if (this.profile_tag != null) {
            i31 = this.profile_tag.hashCode();
        } else {
            i31 = 0;
        }
        int hashCode3 = (((i62 + i31) * 37) + this.cha_attrs.hashCode()) * 37;
        if (this.button != null) {
            i33 = this.button.hashCode();
        }
        int i63 = hashCode3 + i33;
        this.hashCode = i63;
        return i63;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.cha_name != null) {
            sb.append(", cha_name=");
            sb.append(this.cha_name);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.author != null) {
            sb.append(", author=");
            sb.append(this.author);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (this.share_info != null) {
            sb.append(", share_info=");
            sb.append(this.share_info);
        }
        if (!this.connect_music.isEmpty()) {
            sb.append(", connect_music=");
            sb.append(this.connect_music);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.use_count_desc != null) {
            sb.append(", use_count_desc=");
            sb.append(this.use_count_desc);
        }
        if (this.sub_type != null) {
            sb.append(", sub_type=");
            sb.append(this.sub_type);
        }
        if (this.background_image_url != null) {
            sb.append(", background_image_url=");
            sb.append(this.background_image_url);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=");
            sb.append(this.sticker_id);
        }
        if (this.link_text != null) {
            sb.append(", link_text=");
            sb.append(this.link_text);
        }
        if (this.link_action != null) {
            sb.append(", link_action=");
            sb.append(this.link_action);
        }
        if (this.is_pgcshow != null) {
            sb.append(", is_pgcshow=");
            sb.append(this.is_pgcshow);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=");
            sb.append(this.collect_stat);
        }
        if (this.cover_item != null) {
            sb.append(", cover_item=");
            sb.append(this.cover_item);
        }
        if (this.is_challenge != null) {
            sb.append(", is_challenge=");
            sb.append(this.is_challenge);
        }
        if (this.view_count != null) {
            sb.append(", view_count=");
            sb.append(this.view_count);
        }
        if (this.disclaimer != null) {
            sb.append(", disclaimer=");
            sb.append(this.disclaimer);
        }
        if (this.allow_upload_cover != null) {
            sb.append(", allow_upload_cover=");
            sb.append(this.allow_upload_cover);
        }
        if (this.is_commerce != null) {
            sb.append(", is_commerce=");
            sb.append(this.is_commerce);
        }
        if (this.category_cover_info != null) {
            sb.append(", category_cover_info=");
            sb.append(this.category_cover_info);
        }
        if (this.hashtag_profile != null) {
            sb.append(", hashtag_profile=");
            sb.append(this.hashtag_profile);
        }
        if (this.cover_photo != null) {
            sb.append(", cover_photo=");
            sb.append(this.cover_photo);
        }
        if (this.is_hot_search != null) {
            sb.append(", is_hot_search=");
            sb.append(this.is_hot_search);
        }
        if (this.link_type != null) {
            sb.append(", link_type=");
            sb.append(this.link_type);
        }
        if (this.announcement_info != null) {
            sb.append(", announcement_info=");
            sb.append(this.announcement_info);
        }
        if (this.content_type != null) {
            sb.append(", content_type=");
            sb.append(this.content_type);
        }
        if (this.module_type != null) {
            sb.append(", module_type=");
            sb.append(this.module_type);
        }
        if (this.profile_tag != null) {
            sb.append(", profile_tag=");
            sb.append(this.profile_tag);
        }
        if (!this.cha_attrs.isEmpty()) {
            sb.append(", cha_attrs=");
            sb.append(this.cha_attrs);
        }
        if (this.button != null) {
            sb.append(", button=");
            sb.append(this.button);
        }
        StringBuilder replace = sb.replace(0, 2, "ChallengeStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChallengeStructV2)) {
            return false;
        }
        ChallengeStructV2 challengeStructV2 = (ChallengeStructV2) obj;
        if (!unknownFields().equals(challengeStructV2.unknownFields()) || !Internal.equals(this.cid, challengeStructV2.cid) || !Internal.equals(this.cha_name, challengeStructV2.cha_name) || !Internal.equals(this.desc, challengeStructV2.desc) || !Internal.equals(this.schema, challengeStructV2.schema) || !Internal.equals(this.author, challengeStructV2.author) || !Internal.equals(this.user_count, challengeStructV2.user_count) || !Internal.equals(this.share_info, challengeStructV2.share_info) || !this.connect_music.equals(challengeStructV2.connect_music) || !Internal.equals(this.type, challengeStructV2.type) || !Internal.equals(this.use_count_desc, challengeStructV2.use_count_desc) || !Internal.equals(this.sub_type, challengeStructV2.sub_type) || !Internal.equals(this.background_image_url, challengeStructV2.background_image_url) || !Internal.equals(this.sticker_id, challengeStructV2.sticker_id) || !Internal.equals(this.link_text, challengeStructV2.link_text) || !Internal.equals(this.link_action, challengeStructV2.link_action) || !Internal.equals(this.is_pgcshow, challengeStructV2.is_pgcshow) || !Internal.equals(this.collect_stat, challengeStructV2.collect_stat) || !Internal.equals(this.cover_item, challengeStructV2.cover_item) || !Internal.equals(this.is_challenge, challengeStructV2.is_challenge) || !Internal.equals(this.view_count, challengeStructV2.view_count) || !Internal.equals(this.disclaimer, challengeStructV2.disclaimer) || !Internal.equals(this.allow_upload_cover, challengeStructV2.allow_upload_cover) || !Internal.equals(this.is_commerce, challengeStructV2.is_commerce) || !Internal.equals(this.category_cover_info, challengeStructV2.category_cover_info) || !Internal.equals(this.hashtag_profile, challengeStructV2.hashtag_profile) || !Internal.equals(this.cover_photo, challengeStructV2.cover_photo) || !Internal.equals(this.is_hot_search, challengeStructV2.is_hot_search) || !Internal.equals(this.link_type, challengeStructV2.link_type) || !Internal.equals(this.announcement_info, challengeStructV2.announcement_info) || !Internal.equals(this.content_type, challengeStructV2.content_type) || !Internal.equals(this.module_type, challengeStructV2.module_type) || !Internal.equals(this.profile_tag, challengeStructV2.profile_tag) || !this.cha_attrs.equals(challengeStructV2.cha_attrs) || !Internal.equals(this.button, challengeStructV2.button)) {
            return false;
        }
        return true;
    }

    public ChallengeStructV2(String str, String str2, String str3, String str4, UserStructV2 userStructV2, Integer num, ShareStructV2 shareStructV2, List<MusicStructV2> list, Integer num2, String str5, Integer num3, UrlStructV2 urlStructV2, String str6, String str7, String str8, Boolean bool, Integer num4, UrlStructV2 urlStructV22, Integer num5, Long l, DisclaimerStructV2 disclaimerStructV2, Boolean bool2, Boolean bool3, CategoryCoverStructV2 categoryCoverStructV2, String str9, String str10, Integer num6, Integer num7, AnnouncementStructV2 announcementStructV2, Integer num8, Integer num9, String str11, List<String> list2, IconButtonStructV2 iconButtonStructV2) {
        this(str, str2, str3, str4, userStructV2, num, shareStructV2, list, num2, str5, num3, urlStructV2, str6, str7, str8, bool, num4, urlStructV22, num5, l, disclaimerStructV2, bool2, bool3, categoryCoverStructV2, str9, str10, num6, num7, announcementStructV2, num8, num9, str11, list2, iconButtonStructV2, ByteString.EMPTY);
    }

    public ChallengeStructV2(String str, String str2, String str3, String str4, UserStructV2 userStructV2, Integer num, ShareStructV2 shareStructV2, List<MusicStructV2> list, Integer num2, String str5, Integer num3, UrlStructV2 urlStructV2, String str6, String str7, String str8, Boolean bool, Integer num4, UrlStructV2 urlStructV22, Integer num5, Long l, DisclaimerStructV2 disclaimerStructV2, Boolean bool2, Boolean bool3, CategoryCoverStructV2 categoryCoverStructV2, String str9, String str10, Integer num6, Integer num7, AnnouncementStructV2 announcementStructV2, Integer num8, Integer num9, String str11, List<String> list2, IconButtonStructV2 iconButtonStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.cha_name = str2;
        this.desc = str3;
        this.schema = str4;
        this.author = userStructV2;
        this.user_count = num;
        this.share_info = shareStructV2;
        List<MusicStructV2> list3 = list;
        this.connect_music = Internal.immutableCopyOf("connect_music", list);
        this.type = num2;
        this.use_count_desc = str5;
        this.sub_type = num3;
        this.background_image_url = urlStructV2;
        this.sticker_id = str6;
        this.link_text = str7;
        this.link_action = str8;
        this.is_pgcshow = bool;
        this.collect_stat = num4;
        this.cover_item = urlStructV22;
        this.is_challenge = num5;
        this.view_count = l;
        this.disclaimer = disclaimerStructV2;
        this.allow_upload_cover = bool2;
        this.is_commerce = bool3;
        this.category_cover_info = categoryCoverStructV2;
        this.hashtag_profile = str9;
        this.cover_photo = str10;
        this.is_hot_search = num6;
        this.link_type = num7;
        this.announcement_info = announcementStructV2;
        this.content_type = num8;
        this.module_type = num9;
        this.profile_tag = str11;
        this.cha_attrs = Internal.immutableCopyOf("cha_attrs", list2);
        this.button = iconButtonStructV2;
    }
}
