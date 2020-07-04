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

/* renamed from: com.ss.ugc.aweme.proto.MusicStructV2 */
public final class MusicStructV2 extends Message<MusicStructV2, Builder> {
    public static final ProtoAdapter<MusicStructV2> ADAPTER = new ProtoAdapter_MusicStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String album;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 27)
    public UrlStructV2 audio_track;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 38)
    public Boolean author_deleted;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = Label.REPEATED, tag = 42)
    public List<PositionStructV2> author_position;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 58)
    public UrlStructV2 avatar_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 57)
    public UrlStructV2 avatar_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 56)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 32)
    public Integer billboard_rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 35)
    public Long binded_challenge_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", tag = 29)
    public ChallengeStructV2 bodydance_challenge;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 34)
    public UrlStructV2 bodydance_challenge_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 28)
    public UrlStructV2 bodydance_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CategoryCoverStructV2#ADAPTER", tag = 46)
    public CategoryCoverStructV2 category_cover_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", tag = 31)
    public ChallengeStructV2 challenge;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 61)
    public Long cluster_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 20)
    public Integer collect_stat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 6)
    public UrlStructV2 cover_hd;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 7)
    public UrlStructV2 cover_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 8)
    public UrlStructV2 cover_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 9)
    public UrlStructV2 cover_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer duration;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 23)
    public UrlStructV2 effects_data;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 14)
    public Integer end_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ExternalSongStructV2#ADAPTER", label = Label.REPEATED, tag = 52)
    public List<ExternalSongStructV2> external_song_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)

    /* renamed from: id */
    public Long f118744id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String id_str;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 39)
    public Boolean is_del_video;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 47)
    public Boolean is_only_owner_use;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 30)
    public Boolean is_original;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 37)
    public Boolean is_restricted;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 48)
    public Boolean is_video_not_recommend;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 40)
    public Boolean is_video_self_see;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 54)
    public Integer lyric_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 55)
    public String lyric_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 33)
    public String mid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 44)
    public Integer music_billboard_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2#ADAPTER", tag = 45)
    public BranchBillboardWeeklyStructV2 music_billboard_weekly_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 62)
    public Boolean mute_share;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
    public String offline_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 41)
    public String owner_handle;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 24)
    public String owner_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String owner_nickname;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 10)
    public UrlStructV2 play_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = Label.REPEATED, tag = 18)
    public List<PositionStructV2> position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 43)
    public Boolean prevent_download;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 51)
    public Integer prevent_item_download_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 60)
    public Double preview_end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 59)
    public Double preview_start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 36)
    public Boolean redirect;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public String schema_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 53)
    public String sec_uid;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 19)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public Integer source_platform;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public Integer start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 21)
    public Integer status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 49)
    public UrlStructV2 strong_beat_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 50)
    public List<String> unshelve_countries;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String use_count_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer user_count;

    /* renamed from: com.ss.ugc.aweme.proto.MusicStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MusicStructV2, Builder> {
        public String album;
        public UrlStructV2 audio_track;
        public String author;
        public Boolean author_deleted;
        public List<PositionStructV2> author_position = Internal.newMutableList();
        public UrlStructV2 avatar_large;
        public UrlStructV2 avatar_medium;
        public UrlStructV2 avatar_thumb;
        public Integer billboard_rank;
        public Long binded_challenge_id;
        public ChallengeStructV2 bodydance_challenge;
        public UrlStructV2 bodydance_challenge_id;
        public UrlStructV2 bodydance_url;
        public CategoryCoverStructV2 category_cover_info;
        public ChallengeStructV2 challenge;
        public Long cluster_id;
        public Integer collect_stat;
        public UrlStructV2 cover_hd;
        public UrlStructV2 cover_large;
        public UrlStructV2 cover_medium;
        public UrlStructV2 cover_thumb;
        public Integer duration;
        public UrlStructV2 effects_data;
        public Integer end_time;
        public List<ExternalSongStructV2> external_song_info = Internal.newMutableList();
        public String extra;

        /* renamed from: id */
        public Long f118745id;
        public String id_str;
        public Boolean is_del_video;
        public Boolean is_only_owner_use;
        public Boolean is_original;
        public Boolean is_restricted;
        public Boolean is_video_not_recommend;
        public Boolean is_video_self_see;
        public Integer lyric_type;
        public String lyric_url;
        public String mid;
        public Integer music_billboard_type;
        public BranchBillboardWeeklyStructV2 music_billboard_weekly_info;
        public Boolean mute_share;
        public String offline_desc;
        public String owner_handle;
        public String owner_id;
        public String owner_nickname;
        public UrlStructV2 play_url;
        public List<PositionStructV2> position = Internal.newMutableList();
        public Boolean prevent_download;
        public Integer prevent_item_download_status;
        public Double preview_end_time;
        public Double preview_start_time;
        public Boolean redirect;
        public String schema_url;
        public String sec_uid;
        public ShareStructV2 share_info;
        public Integer source_platform;
        public Integer start_time;
        public Integer status;
        public UrlStructV2 strong_beat_url;
        public String title;
        public List<String> unshelve_countries = Internal.newMutableList();
        public String use_count_desc;
        public Integer user_count;

        public final MusicStructV2 build() {
            MusicStructV2 musicStructV2 = new MusicStructV2(this.f118745id, this.id_str, this.title, this.author, this.album, this.cover_hd, this.cover_large, this.cover_medium, this.cover_thumb, this.play_url, this.schema_url, this.source_platform, this.start_time, this.end_time, this.duration, this.extra, this.user_count, this.position, this.share_info, this.collect_stat, this.status, this.offline_desc, this.effects_data, this.owner_id, this.owner_nickname, this.use_count_desc, this.audio_track, this.bodydance_url, this.bodydance_challenge, this.is_original, this.challenge, this.billboard_rank, this.mid, this.bodydance_challenge_id, this.binded_challenge_id, this.redirect, this.is_restricted, this.author_deleted, this.is_del_video, this.is_video_self_see, this.owner_handle, this.author_position, this.prevent_download, this.music_billboard_type, this.music_billboard_weekly_info, this.category_cover_info, this.is_only_owner_use, this.is_video_not_recommend, this.strong_beat_url, this.unshelve_countries, this.prevent_item_download_status, this.external_song_info, this.sec_uid, this.lyric_type, this.lyric_url, this.avatar_thumb, this.avatar_medium, this.avatar_large, this.preview_start_time, this.preview_end_time, this.cluster_id, this.mute_share, super.buildUnknownFields());
            return musicStructV2;
        }

        public final Builder album(String str) {
            this.album = str;
            return this;
        }

        public final Builder audio_track(UrlStructV2 urlStructV2) {
            this.audio_track = urlStructV2;
            return this;
        }

        public final Builder author(String str) {
            this.author = str;
            return this;
        }

        public final Builder author_deleted(Boolean bool) {
            this.author_deleted = bool;
            return this;
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

        public final Builder billboard_rank(Integer num) {
            this.billboard_rank = num;
            return this;
        }

        public final Builder binded_challenge_id(Long l) {
            this.binded_challenge_id = l;
            return this;
        }

        public final Builder bodydance_challenge(ChallengeStructV2 challengeStructV2) {
            this.bodydance_challenge = challengeStructV2;
            return this;
        }

        public final Builder bodydance_challenge_id(UrlStructV2 urlStructV2) {
            this.bodydance_challenge_id = urlStructV2;
            return this;
        }

        public final Builder bodydance_url(UrlStructV2 urlStructV2) {
            this.bodydance_url = urlStructV2;
            return this;
        }

        public final Builder category_cover_info(CategoryCoverStructV2 categoryCoverStructV2) {
            this.category_cover_info = categoryCoverStructV2;
            return this;
        }

        public final Builder challenge(ChallengeStructV2 challengeStructV2) {
            this.challenge = challengeStructV2;
            return this;
        }

        public final Builder cluster_id(Long l) {
            this.cluster_id = l;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder cover_hd(UrlStructV2 urlStructV2) {
            this.cover_hd = urlStructV2;
            return this;
        }

        public final Builder cover_large(UrlStructV2 urlStructV2) {
            this.cover_large = urlStructV2;
            return this;
        }

        public final Builder cover_medium(UrlStructV2 urlStructV2) {
            this.cover_medium = urlStructV2;
            return this;
        }

        public final Builder cover_thumb(UrlStructV2 urlStructV2) {
            this.cover_thumb = urlStructV2;
            return this;
        }

        public final Builder duration(Integer num) {
            this.duration = num;
            return this;
        }

        public final Builder effects_data(UrlStructV2 urlStructV2) {
            this.effects_data = urlStructV2;
            return this;
        }

        public final Builder end_time(Integer num) {
            this.end_time = num;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        /* renamed from: id */
        public final Builder mo113304id(Long l) {
            this.f118745id = l;
            return this;
        }

        public final Builder id_str(String str) {
            this.id_str = str;
            return this;
        }

        public final Builder is_del_video(Boolean bool) {
            this.is_del_video = bool;
            return this;
        }

        public final Builder is_only_owner_use(Boolean bool) {
            this.is_only_owner_use = bool;
            return this;
        }

        public final Builder is_original(Boolean bool) {
            this.is_original = bool;
            return this;
        }

        public final Builder is_restricted(Boolean bool) {
            this.is_restricted = bool;
            return this;
        }

        public final Builder is_video_not_recommend(Boolean bool) {
            this.is_video_not_recommend = bool;
            return this;
        }

        public final Builder is_video_self_see(Boolean bool) {
            this.is_video_self_see = bool;
            return this;
        }

        public final Builder lyric_type(Integer num) {
            this.lyric_type = num;
            return this;
        }

        public final Builder lyric_url(String str) {
            this.lyric_url = str;
            return this;
        }

        public final Builder mid(String str) {
            this.mid = str;
            return this;
        }

        public final Builder music_billboard_type(Integer num) {
            this.music_billboard_type = num;
            return this;
        }

        public final Builder music_billboard_weekly_info(BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2) {
            this.music_billboard_weekly_info = branchBillboardWeeklyStructV2;
            return this;
        }

        public final Builder mute_share(Boolean bool) {
            this.mute_share = bool;
            return this;
        }

        public final Builder offline_desc(String str) {
            this.offline_desc = str;
            return this;
        }

        public final Builder owner_handle(String str) {
            this.owner_handle = str;
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

        public final Builder play_url(UrlStructV2 urlStructV2) {
            this.play_url = urlStructV2;
            return this;
        }

        public final Builder prevent_download(Boolean bool) {
            this.prevent_download = bool;
            return this;
        }

        public final Builder prevent_item_download_status(Integer num) {
            this.prevent_item_download_status = num;
            return this;
        }

        public final Builder preview_end_time(Double d) {
            this.preview_end_time = d;
            return this;
        }

        public final Builder preview_start_time(Double d) {
            this.preview_start_time = d;
            return this;
        }

        public final Builder redirect(Boolean bool) {
            this.redirect = bool;
            return this;
        }

        public final Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder source_platform(Integer num) {
            this.source_platform = num;
            return this;
        }

        public final Builder start_time(Integer num) {
            this.start_time = num;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder strong_beat_url(UrlStructV2 urlStructV2) {
            this.strong_beat_url = urlStructV2;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
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

        public final Builder author_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.author_position = list;
            return this;
        }

        public final Builder external_song_info(List<ExternalSongStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.external_song_info = list;
            return this;
        }

        public final Builder position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.position = list;
            return this;
        }

        public final Builder unshelve_countries(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.unshelve_countries = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MusicStructV2$ProtoAdapter_MusicStructV2 */
    static final class ProtoAdapter_MusicStructV2 extends ProtoAdapter<MusicStructV2> {
        public ProtoAdapter_MusicStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicStructV2.class);
        }

        public final MusicStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo113304id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.id_str((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.author((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.album((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.cover_hd((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.cover_large((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.cover_medium((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.cover_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.play_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.schema_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.source_platform((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 13:
                            builder.start_time((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.end_time((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 15:
                            builder.duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            builder.user_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 18:
                            builder.position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.share_info((ShareStructV2) ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            builder.collect_stat((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 21:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 22:
                            builder.offline_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 23:
                            builder.effects_data((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 24:
                            builder.owner_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 25:
                            builder.owner_nickname((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                            builder.use_count_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            builder.audio_track((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 28:
                            builder.bodydance_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 29:
                            builder.bodydance_challenge((ChallengeStructV2) ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            builder.is_original((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 31:
                            builder.challenge((ChallengeStructV2) ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 32:
                            builder.billboard_rank((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 33:
                            builder.mid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.CHALLENGE /*34*/:
                            builder.bodydance_challenge_id((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 35:
                            builder.binded_challenge_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 36:
                            builder.redirect((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 37:
                            builder.is_restricted((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 38:
                            builder.author_deleted((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 39:
                            builder.is_del_video((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 40:
                            builder.is_video_self_see((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case BaseNotice.LIKE /*41*/:
                            builder.owner_handle((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 42:
                            builder.author_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 43:
                            builder.prevent_download((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 44:
                            builder.music_billboard_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case BaseNotice.f89516AT /*45*/:
                            builder.music_billboard_weekly_info((BranchBillboardWeeklyStructV2) BranchBillboardWeeklyStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 46:
                            builder.category_cover_info((CategoryCoverStructV2) CategoryCoverStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 47:
                            builder.is_only_owner_use((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 48:
                            builder.is_video_not_recommend((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 49:
                            builder.strong_beat_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 50:
                            builder.unshelve_countries.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 51:
                            builder.prevent_item_download_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 52:
                            builder.external_song_info.add(ExternalSongStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 53:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 54:
                            builder.lyric_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 55:
                            builder.lyric_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 56:
                            builder.avatar_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 57:
                            builder.avatar_medium((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 58:
                            builder.avatar_large((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 59:
                            builder.preview_start_time((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 60:
                            builder.preview_end_time((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case BaseNotice.TCM /*61*/:
                            builder.cluster_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case BaseNotice.CREATOR /*62*/:
                            builder.mute_share((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final int encodedSize(MusicStructV2 musicStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, musicStructV2.f118744id) + ProtoAdapter.STRING.encodedSizeWithTag(2, musicStructV2.id_str) + ProtoAdapter.STRING.encodedSizeWithTag(3, musicStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(4, musicStructV2.author) + ProtoAdapter.STRING.encodedSizeWithTag(5, musicStructV2.album) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, musicStructV2.cover_hd) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, musicStructV2.cover_large) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, musicStructV2.cover_medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(9, musicStructV2.cover_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(10, musicStructV2.play_url) + ProtoAdapter.STRING.encodedSizeWithTag(11, musicStructV2.schema_url) + ProtoAdapter.INT32.encodedSizeWithTag(12, musicStructV2.source_platform) + ProtoAdapter.INT32.encodedSizeWithTag(13, musicStructV2.start_time) + ProtoAdapter.INT32.encodedSizeWithTag(14, musicStructV2.end_time) + ProtoAdapter.INT32.encodedSizeWithTag(15, musicStructV2.duration) + ProtoAdapter.STRING.encodedSizeWithTag(16, musicStructV2.extra) + ProtoAdapter.INT32.encodedSizeWithTag(17, musicStructV2.user_count) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(18, musicStructV2.position) + ShareStructV2.ADAPTER.encodedSizeWithTag(19, musicStructV2.share_info) + ProtoAdapter.INT32.encodedSizeWithTag(20, musicStructV2.collect_stat) + ProtoAdapter.INT32.encodedSizeWithTag(21, musicStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(22, musicStructV2.offline_desc) + UrlStructV2.ADAPTER.encodedSizeWithTag(23, musicStructV2.effects_data) + ProtoAdapter.STRING.encodedSizeWithTag(24, musicStructV2.owner_id) + ProtoAdapter.STRING.encodedSizeWithTag(25, musicStructV2.owner_nickname) + ProtoAdapter.STRING.encodedSizeWithTag(26, musicStructV2.use_count_desc) + UrlStructV2.ADAPTER.encodedSizeWithTag(27, musicStructV2.audio_track) + UrlStructV2.ADAPTER.encodedSizeWithTag(28, musicStructV2.bodydance_url) + ChallengeStructV2.ADAPTER.encodedSizeWithTag(29, musicStructV2.bodydance_challenge) + ProtoAdapter.BOOL.encodedSizeWithTag(30, musicStructV2.is_original) + ChallengeStructV2.ADAPTER.encodedSizeWithTag(31, musicStructV2.challenge) + ProtoAdapter.INT32.encodedSizeWithTag(32, musicStructV2.billboard_rank) + ProtoAdapter.STRING.encodedSizeWithTag(33, musicStructV2.mid) + UrlStructV2.ADAPTER.encodedSizeWithTag(34, musicStructV2.bodydance_challenge_id) + ProtoAdapter.INT64.encodedSizeWithTag(35, musicStructV2.binded_challenge_id) + ProtoAdapter.BOOL.encodedSizeWithTag(36, musicStructV2.redirect) + ProtoAdapter.BOOL.encodedSizeWithTag(37, musicStructV2.is_restricted) + ProtoAdapter.BOOL.encodedSizeWithTag(38, musicStructV2.author_deleted) + ProtoAdapter.BOOL.encodedSizeWithTag(39, musicStructV2.is_del_video) + ProtoAdapter.BOOL.encodedSizeWithTag(40, musicStructV2.is_video_self_see) + ProtoAdapter.STRING.encodedSizeWithTag(41, musicStructV2.owner_handle) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(42, musicStructV2.author_position) + ProtoAdapter.BOOL.encodedSizeWithTag(43, musicStructV2.prevent_download) + ProtoAdapter.INT32.encodedSizeWithTag(44, musicStructV2.music_billboard_type) + BranchBillboardWeeklyStructV2.ADAPTER.encodedSizeWithTag(45, musicStructV2.music_billboard_weekly_info) + CategoryCoverStructV2.ADAPTER.encodedSizeWithTag(46, musicStructV2.category_cover_info) + ProtoAdapter.BOOL.encodedSizeWithTag(47, musicStructV2.is_only_owner_use) + ProtoAdapter.BOOL.encodedSizeWithTag(48, musicStructV2.is_video_not_recommend) + UrlStructV2.ADAPTER.encodedSizeWithTag(49, musicStructV2.strong_beat_url) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(50, musicStructV2.unshelve_countries) + ProtoAdapter.INT32.encodedSizeWithTag(51, musicStructV2.prevent_item_download_status) + ExternalSongStructV2.ADAPTER.asRepeated().encodedSizeWithTag(52, musicStructV2.external_song_info) + ProtoAdapter.STRING.encodedSizeWithTag(53, musicStructV2.sec_uid) + ProtoAdapter.INT32.encodedSizeWithTag(54, musicStructV2.lyric_type) + ProtoAdapter.STRING.encodedSizeWithTag(55, musicStructV2.lyric_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(56, musicStructV2.avatar_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(57, musicStructV2.avatar_medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(58, musicStructV2.avatar_large) + ProtoAdapter.DOUBLE.encodedSizeWithTag(59, musicStructV2.preview_start_time) + ProtoAdapter.DOUBLE.encodedSizeWithTag(60, musicStructV2.preview_end_time) + ProtoAdapter.INT64.encodedSizeWithTag(61, musicStructV2.cluster_id) + ProtoAdapter.BOOL.encodedSizeWithTag(62, musicStructV2.mute_share) + musicStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MusicStructV2 musicStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, musicStructV2.f118744id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, musicStructV2.id_str);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, musicStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, musicStructV2.author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, musicStructV2.album);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, musicStructV2.cover_hd);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, musicStructV2.cover_large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, musicStructV2.cover_medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 9, musicStructV2.cover_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 10, musicStructV2.play_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, musicStructV2.schema_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, musicStructV2.source_platform);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, musicStructV2.start_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, musicStructV2.end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, musicStructV2.duration);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, musicStructV2.extra);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, musicStructV2.user_count);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, musicStructV2.position);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 19, musicStructV2.share_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, musicStructV2.collect_stat);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, musicStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, musicStructV2.offline_desc);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 23, musicStructV2.effects_data);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, musicStructV2.owner_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, musicStructV2.owner_nickname);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, musicStructV2.use_count_desc);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 27, musicStructV2.audio_track);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 28, musicStructV2.bodydance_url);
            ChallengeStructV2.ADAPTER.encodeWithTag(protoWriter, 29, musicStructV2.bodydance_challenge);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, musicStructV2.is_original);
            ChallengeStructV2.ADAPTER.encodeWithTag(protoWriter, 31, musicStructV2.challenge);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 32, musicStructV2.billboard_rank);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 33, musicStructV2.mid);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 34, musicStructV2.bodydance_challenge_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 35, musicStructV2.binded_challenge_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, musicStructV2.redirect);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, musicStructV2.is_restricted);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, musicStructV2.author_deleted);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, musicStructV2.is_del_video);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 40, musicStructV2.is_video_self_see);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 41, musicStructV2.owner_handle);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 42, musicStructV2.author_position);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 43, musicStructV2.prevent_download);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 44, musicStructV2.music_billboard_type);
            BranchBillboardWeeklyStructV2.ADAPTER.encodeWithTag(protoWriter, 45, musicStructV2.music_billboard_weekly_info);
            CategoryCoverStructV2.ADAPTER.encodeWithTag(protoWriter, 46, musicStructV2.category_cover_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 47, musicStructV2.is_only_owner_use);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 48, musicStructV2.is_video_not_recommend);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 49, musicStructV2.strong_beat_url);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 50, musicStructV2.unshelve_countries);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 51, musicStructV2.prevent_item_download_status);
            ExternalSongStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 52, musicStructV2.external_song_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, musicStructV2.sec_uid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 54, musicStructV2.lyric_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 55, musicStructV2.lyric_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 56, musicStructV2.avatar_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 57, musicStructV2.avatar_medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 58, musicStructV2.avatar_large);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 59, musicStructV2.preview_start_time);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 60, musicStructV2.preview_end_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 61, musicStructV2.cluster_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 62, musicStructV2.mute_share);
            protoWriter.writeBytes(musicStructV2.unknownFields());
        }
    }

    public MusicStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f118745id = this.f118744id;
        builder.id_str = this.id_str;
        builder.title = this.title;
        builder.author = this.author;
        builder.album = this.album;
        builder.cover_hd = this.cover_hd;
        builder.cover_large = this.cover_large;
        builder.cover_medium = this.cover_medium;
        builder.cover_thumb = this.cover_thumb;
        builder.play_url = this.play_url;
        builder.schema_url = this.schema_url;
        builder.source_platform = this.source_platform;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.duration = this.duration;
        builder.extra = this.extra;
        builder.user_count = this.user_count;
        builder.position = Internal.copyOf("position", this.position);
        builder.share_info = this.share_info;
        builder.collect_stat = this.collect_stat;
        builder.status = this.status;
        builder.offline_desc = this.offline_desc;
        builder.effects_data = this.effects_data;
        builder.owner_id = this.owner_id;
        builder.owner_nickname = this.owner_nickname;
        builder.use_count_desc = this.use_count_desc;
        builder.audio_track = this.audio_track;
        builder.bodydance_url = this.bodydance_url;
        builder.bodydance_challenge = this.bodydance_challenge;
        builder.is_original = this.is_original;
        builder.challenge = this.challenge;
        builder.billboard_rank = this.billboard_rank;
        builder.mid = this.mid;
        builder.bodydance_challenge_id = this.bodydance_challenge_id;
        builder.binded_challenge_id = this.binded_challenge_id;
        builder.redirect = this.redirect;
        builder.is_restricted = this.is_restricted;
        builder.author_deleted = this.author_deleted;
        builder.is_del_video = this.is_del_video;
        builder.is_video_self_see = this.is_video_self_see;
        builder.owner_handle = this.owner_handle;
        builder.author_position = Internal.copyOf("author_position", this.author_position);
        builder.prevent_download = this.prevent_download;
        builder.music_billboard_type = this.music_billboard_type;
        builder.music_billboard_weekly_info = this.music_billboard_weekly_info;
        builder.category_cover_info = this.category_cover_info;
        builder.is_only_owner_use = this.is_only_owner_use;
        builder.is_video_not_recommend = this.is_video_not_recommend;
        builder.strong_beat_url = this.strong_beat_url;
        builder.unshelve_countries = Internal.copyOf("unshelve_countries", this.unshelve_countries);
        builder.prevent_item_download_status = this.prevent_item_download_status;
        builder.external_song_info = Internal.copyOf("external_song_info", this.external_song_info);
        builder.sec_uid = this.sec_uid;
        builder.lyric_type = this.lyric_type;
        builder.lyric_url = this.lyric_url;
        builder.avatar_thumb = this.avatar_thumb;
        builder.avatar_medium = this.avatar_medium;
        builder.avatar_large = this.avatar_large;
        builder.preview_start_time = this.preview_start_time;
        builder.preview_end_time = this.preview_end_time;
        builder.cluster_id = this.cluster_id;
        builder.mute_share = this.mute_share;
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
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58 = this.hashCode;
        if (i58 != 0) {
            return i58;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i59 = 0;
        if (this.f118744id != null) {
            i = this.f118744id.hashCode();
        } else {
            i = 0;
        }
        int i60 = (hashCode + i) * 37;
        if (this.id_str != null) {
            i2 = this.id_str.hashCode();
        } else {
            i2 = 0;
        }
        int i61 = (i60 + i2) * 37;
        if (this.title != null) {
            i3 = this.title.hashCode();
        } else {
            i3 = 0;
        }
        int i62 = (i61 + i3) * 37;
        if (this.author != null) {
            i4 = this.author.hashCode();
        } else {
            i4 = 0;
        }
        int i63 = (i62 + i4) * 37;
        if (this.album != null) {
            i5 = this.album.hashCode();
        } else {
            i5 = 0;
        }
        int i64 = (i63 + i5) * 37;
        if (this.cover_hd != null) {
            i6 = this.cover_hd.hashCode();
        } else {
            i6 = 0;
        }
        int i65 = (i64 + i6) * 37;
        if (this.cover_large != null) {
            i7 = this.cover_large.hashCode();
        } else {
            i7 = 0;
        }
        int i66 = (i65 + i7) * 37;
        if (this.cover_medium != null) {
            i8 = this.cover_medium.hashCode();
        } else {
            i8 = 0;
        }
        int i67 = (i66 + i8) * 37;
        if (this.cover_thumb != null) {
            i9 = this.cover_thumb.hashCode();
        } else {
            i9 = 0;
        }
        int i68 = (i67 + i9) * 37;
        if (this.play_url != null) {
            i10 = this.play_url.hashCode();
        } else {
            i10 = 0;
        }
        int i69 = (i68 + i10) * 37;
        if (this.schema_url != null) {
            i11 = this.schema_url.hashCode();
        } else {
            i11 = 0;
        }
        int i70 = (i69 + i11) * 37;
        if (this.source_platform != null) {
            i12 = this.source_platform.hashCode();
        } else {
            i12 = 0;
        }
        int i71 = (i70 + i12) * 37;
        if (this.start_time != null) {
            i13 = this.start_time.hashCode();
        } else {
            i13 = 0;
        }
        int i72 = (i71 + i13) * 37;
        if (this.end_time != null) {
            i14 = this.end_time.hashCode();
        } else {
            i14 = 0;
        }
        int i73 = (i72 + i14) * 37;
        if (this.duration != null) {
            i15 = this.duration.hashCode();
        } else {
            i15 = 0;
        }
        int i74 = (i73 + i15) * 37;
        if (this.extra != null) {
            i16 = this.extra.hashCode();
        } else {
            i16 = 0;
        }
        int i75 = (i74 + i16) * 37;
        if (this.user_count != null) {
            i17 = this.user_count.hashCode();
        } else {
            i17 = 0;
        }
        int hashCode2 = (((i75 + i17) * 37) + this.position.hashCode()) * 37;
        if (this.share_info != null) {
            i18 = this.share_info.hashCode();
        } else {
            i18 = 0;
        }
        int i76 = (hashCode2 + i18) * 37;
        if (this.collect_stat != null) {
            i19 = this.collect_stat.hashCode();
        } else {
            i19 = 0;
        }
        int i77 = (i76 + i19) * 37;
        if (this.status != null) {
            i20 = this.status.hashCode();
        } else {
            i20 = 0;
        }
        int i78 = (i77 + i20) * 37;
        if (this.offline_desc != null) {
            i21 = this.offline_desc.hashCode();
        } else {
            i21 = 0;
        }
        int i79 = (i78 + i21) * 37;
        if (this.effects_data != null) {
            i22 = this.effects_data.hashCode();
        } else {
            i22 = 0;
        }
        int i80 = (i79 + i22) * 37;
        if (this.owner_id != null) {
            i23 = this.owner_id.hashCode();
        } else {
            i23 = 0;
        }
        int i81 = (i80 + i23) * 37;
        if (this.owner_nickname != null) {
            i24 = this.owner_nickname.hashCode();
        } else {
            i24 = 0;
        }
        int i82 = (i81 + i24) * 37;
        if (this.use_count_desc != null) {
            i25 = this.use_count_desc.hashCode();
        } else {
            i25 = 0;
        }
        int i83 = (i82 + i25) * 37;
        if (this.audio_track != null) {
            i26 = this.audio_track.hashCode();
        } else {
            i26 = 0;
        }
        int i84 = (i83 + i26) * 37;
        if (this.bodydance_url != null) {
            i27 = this.bodydance_url.hashCode();
        } else {
            i27 = 0;
        }
        int i85 = (i84 + i27) * 37;
        if (this.bodydance_challenge != null) {
            i28 = this.bodydance_challenge.hashCode();
        } else {
            i28 = 0;
        }
        int i86 = (i85 + i28) * 37;
        if (this.is_original != null) {
            i29 = this.is_original.hashCode();
        } else {
            i29 = 0;
        }
        int i87 = (i86 + i29) * 37;
        if (this.challenge != null) {
            i30 = this.challenge.hashCode();
        } else {
            i30 = 0;
        }
        int i88 = (i87 + i30) * 37;
        if (this.billboard_rank != null) {
            i31 = this.billboard_rank.hashCode();
        } else {
            i31 = 0;
        }
        int i89 = (i88 + i31) * 37;
        if (this.mid != null) {
            i32 = this.mid.hashCode();
        } else {
            i32 = 0;
        }
        int i90 = (i89 + i32) * 37;
        if (this.bodydance_challenge_id != null) {
            i33 = this.bodydance_challenge_id.hashCode();
        } else {
            i33 = 0;
        }
        int i91 = (i90 + i33) * 37;
        if (this.binded_challenge_id != null) {
            i34 = this.binded_challenge_id.hashCode();
        } else {
            i34 = 0;
        }
        int i92 = (i91 + i34) * 37;
        if (this.redirect != null) {
            i35 = this.redirect.hashCode();
        } else {
            i35 = 0;
        }
        int i93 = (i92 + i35) * 37;
        if (this.is_restricted != null) {
            i36 = this.is_restricted.hashCode();
        } else {
            i36 = 0;
        }
        int i94 = (i93 + i36) * 37;
        if (this.author_deleted != null) {
            i37 = this.author_deleted.hashCode();
        } else {
            i37 = 0;
        }
        int i95 = (i94 + i37) * 37;
        if (this.is_del_video != null) {
            i38 = this.is_del_video.hashCode();
        } else {
            i38 = 0;
        }
        int i96 = (i95 + i38) * 37;
        if (this.is_video_self_see != null) {
            i39 = this.is_video_self_see.hashCode();
        } else {
            i39 = 0;
        }
        int i97 = (i96 + i39) * 37;
        if (this.owner_handle != null) {
            i40 = this.owner_handle.hashCode();
        } else {
            i40 = 0;
        }
        int hashCode3 = (((i97 + i40) * 37) + this.author_position.hashCode()) * 37;
        if (this.prevent_download != null) {
            i41 = this.prevent_download.hashCode();
        } else {
            i41 = 0;
        }
        int i98 = (hashCode3 + i41) * 37;
        if (this.music_billboard_type != null) {
            i42 = this.music_billboard_type.hashCode();
        } else {
            i42 = 0;
        }
        int i99 = (i98 + i42) * 37;
        if (this.music_billboard_weekly_info != null) {
            i43 = this.music_billboard_weekly_info.hashCode();
        } else {
            i43 = 0;
        }
        int i100 = (i99 + i43) * 37;
        if (this.category_cover_info != null) {
            i44 = this.category_cover_info.hashCode();
        } else {
            i44 = 0;
        }
        int i101 = (i100 + i44) * 37;
        if (this.is_only_owner_use != null) {
            i45 = this.is_only_owner_use.hashCode();
        } else {
            i45 = 0;
        }
        int i102 = (i101 + i45) * 37;
        if (this.is_video_not_recommend != null) {
            i46 = this.is_video_not_recommend.hashCode();
        } else {
            i46 = 0;
        }
        int i103 = (i102 + i46) * 37;
        if (this.strong_beat_url != null) {
            i47 = this.strong_beat_url.hashCode();
        } else {
            i47 = 0;
        }
        int hashCode4 = (((i103 + i47) * 37) + this.unshelve_countries.hashCode()) * 37;
        if (this.prevent_item_download_status != null) {
            i48 = this.prevent_item_download_status.hashCode();
        } else {
            i48 = 0;
        }
        int hashCode5 = (((hashCode4 + i48) * 37) + this.external_song_info.hashCode()) * 37;
        if (this.sec_uid != null) {
            i49 = this.sec_uid.hashCode();
        } else {
            i49 = 0;
        }
        int i104 = (hashCode5 + i49) * 37;
        if (this.lyric_type != null) {
            i50 = this.lyric_type.hashCode();
        } else {
            i50 = 0;
        }
        int i105 = (i104 + i50) * 37;
        if (this.lyric_url != null) {
            i51 = this.lyric_url.hashCode();
        } else {
            i51 = 0;
        }
        int i106 = (i105 + i51) * 37;
        if (this.avatar_thumb != null) {
            i52 = this.avatar_thumb.hashCode();
        } else {
            i52 = 0;
        }
        int i107 = (i106 + i52) * 37;
        if (this.avatar_medium != null) {
            i53 = this.avatar_medium.hashCode();
        } else {
            i53 = 0;
        }
        int i108 = (i107 + i53) * 37;
        if (this.avatar_large != null) {
            i54 = this.avatar_large.hashCode();
        } else {
            i54 = 0;
        }
        int i109 = (i108 + i54) * 37;
        if (this.preview_start_time != null) {
            i55 = this.preview_start_time.hashCode();
        } else {
            i55 = 0;
        }
        int i110 = (i109 + i55) * 37;
        if (this.preview_end_time != null) {
            i56 = this.preview_end_time.hashCode();
        } else {
            i56 = 0;
        }
        int i111 = (i110 + i56) * 37;
        if (this.cluster_id != null) {
            i57 = this.cluster_id.hashCode();
        } else {
            i57 = 0;
        }
        int i112 = (i111 + i57) * 37;
        if (this.mute_share != null) {
            i59 = this.mute_share.hashCode();
        }
        int i113 = i112 + i59;
        this.hashCode = i113;
        return i113;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f118744id != null) {
            sb.append(", id=");
            sb.append(this.f118744id);
        }
        if (this.id_str != null) {
            sb.append(", id_str=");
            sb.append(this.id_str);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.author != null) {
            sb.append(", author=");
            sb.append(this.author);
        }
        if (this.album != null) {
            sb.append(", album=");
            sb.append(this.album);
        }
        if (this.cover_hd != null) {
            sb.append(", cover_hd=");
            sb.append(this.cover_hd);
        }
        if (this.cover_large != null) {
            sb.append(", cover_large=");
            sb.append(this.cover_large);
        }
        if (this.cover_medium != null) {
            sb.append(", cover_medium=");
            sb.append(this.cover_medium);
        }
        if (this.cover_thumb != null) {
            sb.append(", cover_thumb=");
            sb.append(this.cover_thumb);
        }
        if (this.play_url != null) {
            sb.append(", play_url=");
            sb.append(this.play_url);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=");
            sb.append(this.schema_url);
        }
        if (this.source_platform != null) {
            sb.append(", source_platform=");
            sb.append(this.source_platform);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (!this.position.isEmpty()) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.share_info != null) {
            sb.append(", share_info=");
            sb.append(this.share_info);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=");
            sb.append(this.collect_stat);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.offline_desc != null) {
            sb.append(", offline_desc=");
            sb.append(this.offline_desc);
        }
        if (this.effects_data != null) {
            sb.append(", effects_data=");
            sb.append(this.effects_data);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.owner_nickname != null) {
            sb.append(", owner_nickname=");
            sb.append(this.owner_nickname);
        }
        if (this.use_count_desc != null) {
            sb.append(", use_count_desc=");
            sb.append(this.use_count_desc);
        }
        if (this.audio_track != null) {
            sb.append(", audio_track=");
            sb.append(this.audio_track);
        }
        if (this.bodydance_url != null) {
            sb.append(", bodydance_url=");
            sb.append(this.bodydance_url);
        }
        if (this.bodydance_challenge != null) {
            sb.append(", bodydance_challenge=");
            sb.append(this.bodydance_challenge);
        }
        if (this.is_original != null) {
            sb.append(", is_original=");
            sb.append(this.is_original);
        }
        if (this.challenge != null) {
            sb.append(", challenge=");
            sb.append(this.challenge);
        }
        if (this.billboard_rank != null) {
            sb.append(", billboard_rank=");
            sb.append(this.billboard_rank);
        }
        if (this.mid != null) {
            sb.append(", mid=");
            sb.append(this.mid);
        }
        if (this.bodydance_challenge_id != null) {
            sb.append(", bodydance_challenge_id=");
            sb.append(this.bodydance_challenge_id);
        }
        if (this.binded_challenge_id != null) {
            sb.append(", binded_challenge_id=");
            sb.append(this.binded_challenge_id);
        }
        if (this.redirect != null) {
            sb.append(", redirect=");
            sb.append(this.redirect);
        }
        if (this.is_restricted != null) {
            sb.append(", is_restricted=");
            sb.append(this.is_restricted);
        }
        if (this.author_deleted != null) {
            sb.append(", author_deleted=");
            sb.append(this.author_deleted);
        }
        if (this.is_del_video != null) {
            sb.append(", is_del_video=");
            sb.append(this.is_del_video);
        }
        if (this.is_video_self_see != null) {
            sb.append(", is_video_self_see=");
            sb.append(this.is_video_self_see);
        }
        if (this.owner_handle != null) {
            sb.append(", owner_handle=");
            sb.append(this.owner_handle);
        }
        if (!this.author_position.isEmpty()) {
            sb.append(", author_position=");
            sb.append(this.author_position);
        }
        if (this.prevent_download != null) {
            sb.append(", prevent_download=");
            sb.append(this.prevent_download);
        }
        if (this.music_billboard_type != null) {
            sb.append(", music_billboard_type=");
            sb.append(this.music_billboard_type);
        }
        if (this.music_billboard_weekly_info != null) {
            sb.append(", music_billboard_weekly_info=");
            sb.append(this.music_billboard_weekly_info);
        }
        if (this.category_cover_info != null) {
            sb.append(", category_cover_info=");
            sb.append(this.category_cover_info);
        }
        if (this.is_only_owner_use != null) {
            sb.append(", is_only_owner_use=");
            sb.append(this.is_only_owner_use);
        }
        if (this.is_video_not_recommend != null) {
            sb.append(", is_video_not_recommend=");
            sb.append(this.is_video_not_recommend);
        }
        if (this.strong_beat_url != null) {
            sb.append(", strong_beat_url=");
            sb.append(this.strong_beat_url);
        }
        if (!this.unshelve_countries.isEmpty()) {
            sb.append(", unshelve_countries=");
            sb.append(this.unshelve_countries);
        }
        if (this.prevent_item_download_status != null) {
            sb.append(", prevent_item_download_status=");
            sb.append(this.prevent_item_download_status);
        }
        if (!this.external_song_info.isEmpty()) {
            sb.append(", external_song_info=");
            sb.append(this.external_song_info);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.lyric_type != null) {
            sb.append(", lyric_type=");
            sb.append(this.lyric_type);
        }
        if (this.lyric_url != null) {
            sb.append(", lyric_url=");
            sb.append(this.lyric_url);
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
        if (this.preview_start_time != null) {
            sb.append(", preview_start_time=");
            sb.append(this.preview_start_time);
        }
        if (this.preview_end_time != null) {
            sb.append(", preview_end_time=");
            sb.append(this.preview_end_time);
        }
        if (this.cluster_id != null) {
            sb.append(", cluster_id=");
            sb.append(this.cluster_id);
        }
        if (this.mute_share != null) {
            sb.append(", mute_share=");
            sb.append(this.mute_share);
        }
        StringBuilder replace = sb.replace(0, 2, "MusicStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicStructV2)) {
            return false;
        }
        MusicStructV2 musicStructV2 = (MusicStructV2) obj;
        if (!unknownFields().equals(musicStructV2.unknownFields()) || !Internal.equals(this.f118744id, musicStructV2.f118744id) || !Internal.equals(this.id_str, musicStructV2.id_str) || !Internal.equals(this.title, musicStructV2.title) || !Internal.equals(this.author, musicStructV2.author) || !Internal.equals(this.album, musicStructV2.album) || !Internal.equals(this.cover_hd, musicStructV2.cover_hd) || !Internal.equals(this.cover_large, musicStructV2.cover_large) || !Internal.equals(this.cover_medium, musicStructV2.cover_medium) || !Internal.equals(this.cover_thumb, musicStructV2.cover_thumb) || !Internal.equals(this.play_url, musicStructV2.play_url) || !Internal.equals(this.schema_url, musicStructV2.schema_url) || !Internal.equals(this.source_platform, musicStructV2.source_platform) || !Internal.equals(this.start_time, musicStructV2.start_time) || !Internal.equals(this.end_time, musicStructV2.end_time) || !Internal.equals(this.duration, musicStructV2.duration) || !Internal.equals(this.extra, musicStructV2.extra) || !Internal.equals(this.user_count, musicStructV2.user_count) || !this.position.equals(musicStructV2.position) || !Internal.equals(this.share_info, musicStructV2.share_info) || !Internal.equals(this.collect_stat, musicStructV2.collect_stat) || !Internal.equals(this.status, musicStructV2.status) || !Internal.equals(this.offline_desc, musicStructV2.offline_desc) || !Internal.equals(this.effects_data, musicStructV2.effects_data) || !Internal.equals(this.owner_id, musicStructV2.owner_id) || !Internal.equals(this.owner_nickname, musicStructV2.owner_nickname) || !Internal.equals(this.use_count_desc, musicStructV2.use_count_desc) || !Internal.equals(this.audio_track, musicStructV2.audio_track) || !Internal.equals(this.bodydance_url, musicStructV2.bodydance_url) || !Internal.equals(this.bodydance_challenge, musicStructV2.bodydance_challenge) || !Internal.equals(this.is_original, musicStructV2.is_original) || !Internal.equals(this.challenge, musicStructV2.challenge) || !Internal.equals(this.billboard_rank, musicStructV2.billboard_rank) || !Internal.equals(this.mid, musicStructV2.mid) || !Internal.equals(this.bodydance_challenge_id, musicStructV2.bodydance_challenge_id) || !Internal.equals(this.binded_challenge_id, musicStructV2.binded_challenge_id) || !Internal.equals(this.redirect, musicStructV2.redirect) || !Internal.equals(this.is_restricted, musicStructV2.is_restricted) || !Internal.equals(this.author_deleted, musicStructV2.author_deleted) || !Internal.equals(this.is_del_video, musicStructV2.is_del_video) || !Internal.equals(this.is_video_self_see, musicStructV2.is_video_self_see) || !Internal.equals(this.owner_handle, musicStructV2.owner_handle) || !this.author_position.equals(musicStructV2.author_position) || !Internal.equals(this.prevent_download, musicStructV2.prevent_download) || !Internal.equals(this.music_billboard_type, musicStructV2.music_billboard_type) || !Internal.equals(this.music_billboard_weekly_info, musicStructV2.music_billboard_weekly_info) || !Internal.equals(this.category_cover_info, musicStructV2.category_cover_info) || !Internal.equals(this.is_only_owner_use, musicStructV2.is_only_owner_use) || !Internal.equals(this.is_video_not_recommend, musicStructV2.is_video_not_recommend) || !Internal.equals(this.strong_beat_url, musicStructV2.strong_beat_url) || !this.unshelve_countries.equals(musicStructV2.unshelve_countries) || !Internal.equals(this.prevent_item_download_status, musicStructV2.prevent_item_download_status) || !this.external_song_info.equals(musicStructV2.external_song_info) || !Internal.equals(this.sec_uid, musicStructV2.sec_uid) || !Internal.equals(this.lyric_type, musicStructV2.lyric_type) || !Internal.equals(this.lyric_url, musicStructV2.lyric_url) || !Internal.equals(this.avatar_thumb, musicStructV2.avatar_thumb) || !Internal.equals(this.avatar_medium, musicStructV2.avatar_medium) || !Internal.equals(this.avatar_large, musicStructV2.avatar_large) || !Internal.equals(this.preview_start_time, musicStructV2.preview_start_time) || !Internal.equals(this.preview_end_time, musicStructV2.preview_end_time) || !Internal.equals(this.cluster_id, musicStructV2.cluster_id) || !Internal.equals(this.mute_share, musicStructV2.mute_share)) {
            return false;
        }
        return true;
    }

    public MusicStructV2(Long l, String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, Integer num5, List<PositionStructV2> list, ShareStructV2 shareStructV2, Integer num6, Integer num7, String str7, UrlStructV2 urlStructV26, String str8, String str9, String str10, UrlStructV2 urlStructV27, UrlStructV2 urlStructV28, ChallengeStructV2 challengeStructV2, Boolean bool, ChallengeStructV2 challengeStructV22, Integer num8, String str11, UrlStructV2 urlStructV29, Long l2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str12, List<PositionStructV2> list2, Boolean bool7, Integer num9, BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2, CategoryCoverStructV2 categoryCoverStructV2, Boolean bool8, Boolean bool9, UrlStructV2 urlStructV210, List<String> list3, Integer num10, List<ExternalSongStructV2> list4, String str13, Integer num11, String str14, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, UrlStructV2 urlStructV213, Double d, Double d2, Long l3, Boolean bool10) {
        this(l, str, str2, str3, str4, urlStructV2, urlStructV22, urlStructV23, urlStructV24, urlStructV25, str5, num, num2, num3, num4, str6, num5, list, shareStructV2, num6, num7, str7, urlStructV26, str8, str9, str10, urlStructV27, urlStructV28, challengeStructV2, bool, challengeStructV22, num8, str11, urlStructV29, l2, bool2, bool3, bool4, bool5, bool6, str12, list2, bool7, num9, branchBillboardWeeklyStructV2, categoryCoverStructV2, bool8, bool9, urlStructV210, list3, num10, list4, str13, num11, str14, urlStructV211, urlStructV212, urlStructV213, d, d2, l3, bool10, ByteString.EMPTY);
    }

    public MusicStructV2(Long l, String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, Integer num5, List<PositionStructV2> list, ShareStructV2 shareStructV2, Integer num6, Integer num7, String str7, UrlStructV2 urlStructV26, String str8, String str9, String str10, UrlStructV2 urlStructV27, UrlStructV2 urlStructV28, ChallengeStructV2 challengeStructV2, Boolean bool, ChallengeStructV2 challengeStructV22, Integer num8, String str11, UrlStructV2 urlStructV29, Long l2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str12, List<PositionStructV2> list2, Boolean bool7, Integer num9, BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2, CategoryCoverStructV2 categoryCoverStructV2, Boolean bool8, Boolean bool9, UrlStructV2 urlStructV210, List<String> list3, Integer num10, List<ExternalSongStructV2> list4, String str13, Integer num11, String str14, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, UrlStructV2 urlStructV213, Double d, Double d2, Long l3, Boolean bool10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f118744id = l;
        this.id_str = str;
        this.title = str2;
        this.author = str3;
        this.album = str4;
        this.cover_hd = urlStructV2;
        this.cover_large = urlStructV22;
        this.cover_medium = urlStructV23;
        this.cover_thumb = urlStructV24;
        this.play_url = urlStructV25;
        this.schema_url = str5;
        this.source_platform = num;
        this.start_time = num2;
        this.end_time = num3;
        this.duration = num4;
        this.extra = str6;
        this.user_count = num5;
        this.position = Internal.immutableCopyOf("position", list);
        this.share_info = shareStructV2;
        this.collect_stat = num6;
        this.status = num7;
        this.offline_desc = str7;
        this.effects_data = urlStructV26;
        this.owner_id = str8;
        this.owner_nickname = str9;
        this.use_count_desc = str10;
        this.audio_track = urlStructV27;
        this.bodydance_url = urlStructV28;
        this.bodydance_challenge = challengeStructV2;
        this.is_original = bool;
        this.challenge = challengeStructV22;
        this.billboard_rank = num8;
        this.mid = str11;
        this.bodydance_challenge_id = urlStructV29;
        this.binded_challenge_id = l2;
        this.redirect = bool2;
        this.is_restricted = bool3;
        this.author_deleted = bool4;
        this.is_del_video = bool5;
        this.is_video_self_see = bool6;
        this.owner_handle = str12;
        this.author_position = Internal.immutableCopyOf("author_position", list2);
        this.prevent_download = bool7;
        this.music_billboard_type = num9;
        this.music_billboard_weekly_info = branchBillboardWeeklyStructV2;
        this.category_cover_info = categoryCoverStructV2;
        this.is_only_owner_use = bool8;
        this.is_video_not_recommend = bool9;
        this.strong_beat_url = urlStructV210;
        this.unshelve_countries = Internal.immutableCopyOf("unshelve_countries", list3);
        this.prevent_item_download_status = num10;
        this.external_song_info = Internal.immutableCopyOf("external_song_info", list4);
        this.sec_uid = str13;
        this.lyric_type = num11;
        this.lyric_url = str14;
        this.avatar_thumb = urlStructV211;
        this.avatar_medium = urlStructV212;
        this.avatar_large = urlStructV213;
        this.preview_start_time = d;
        this.preview_end_time = d2;
        this.cluster_id = l3;
        this.mute_share = bool10;
    }
}
