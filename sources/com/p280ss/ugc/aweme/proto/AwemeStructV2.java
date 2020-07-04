package com.p280ss.ugc.aweme.proto;

import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
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

/* renamed from: com.ss.ugc.aweme.proto.AwemeStructV2 */
public final class AwemeStructV2 extends Message<AwemeStructV2, Builder> {
    public static final ProtoAdapter<AwemeStructV2> ADAPTER = new ProtoAdapter_AwemeStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeACLStructV2#ADAPTER", tag = 119)
    public AwemeACLStructV2 acl_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceActivityStructV2#ADAPTER", tag = 77)
    public CommerceActivityStructV2 activity_pendant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 108)
    public Integer ad_aweme_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 95)
    public Integer ad_link_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 88)
    public String ad_order_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 53)
    public String ad_schedule;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorStructV2#ADAPTER", tag = 111)
    public AnchorStructV2 anchor;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeAnchorStructV2#ADAPTER", tag = 121)
    public AwemeAnchorStructV2 anchor_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = 4)
    public UserStructV2 author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 44)
    public Long author_user_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeControlStructV2#ADAPTER", tag = 109)
    public AwemeControlStructV2 aweme_control;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 30)
    public Integer aweme_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BannerTipV2#ADAPTER", tag = 118)
    public BannerTipV2 banner_tip;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 45)
    public Integer bodydance_score;
    @WireField(adapter = "com.ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2#ADAPTER", tag = 126)
    public WebcastRoomFeedCellStructV2 cell_room;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", label = Label.REPEATED, tag = 6)
    public List<ChallengeStructV2> cha_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = Label.REPEATED, tag = 67)
    public List<PositionStructV2> challenge_position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 35)
    public Boolean cmt_swt;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CNYStructV2#ADAPTER", tag = 123)
    public CNYStructV2 cny_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 54)
    public Integer collect_stat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommentStructV2#ADAPTER", label = Label.REPEATED, tag = 43)
    public List<CommentStructV2> comment_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceConfigDataV2#ADAPTER", label = Label.REPEATED, tag = 102)
    public List<CommerceConfigDataV2> commerce_config_data;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeCommerceStructV2#ADAPTER", tag = 116)
    public AwemeCommerceStructV2 commerce_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeCommerceStickerStructV2#ADAPTER", tag = 103)
    public AwemeCommerceStickerStructV2 commerce_sticker_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 91)
    public String desc_language;
    @WireField(adapter = "com.ss.ugc.aweme.proto.DescendantStructV2#ADAPTER", tag = 69)
    public DescendantStructV2 descendants;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 21)
    public String distance;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 105)
    public Integer distribute_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 29)
    public Integer duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 104)
    public Boolean enable_top_view;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelationLabelStructV2#ADAPTER", tag = 112)
    public RelationLabelStructV2 feed_relation_label;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2#ADAPTER", tag = 92)
    public AwemeFloatingCardStructV2 floating_card_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 59)
    public String forward_comment_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", tag = 58)
    public AwemeStructV2 forward_item;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 62)
    public String forward_item_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.GameStructV2#ADAPTER", tag = 71)
    public GameStructV2 game_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeGDAdStructV2#ADAPTER", tag = 31)
    public AwemeGDAdStructV2 gd_ad;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 46)
    public List<String> geofencing;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceActivityStructV2#ADAPTER", tag = 76)
    public CommerceActivityStructV2 gesture_red_packet;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 63)
    public String group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 110)
    public Boolean has_vs_entry;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeSearchStructV2#ADAPTER", tag = 82)
    public AwemeSearchStructV2 hot_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.HotListStructV2#ADAPTER", tag = 115)
    public HotListStructV2 hot_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ImageInfoStructV2#ADAPTER", label = Label.REPEATED, tag = 36)
    public List<ImageInfoStructV2> image_infos;
    @WireField(adapter = "com.ss.ugc.aweme.proto.InteractionStickerStructV2#ADAPTER", label = Label.REPEATED, tag = 93)
    public List<InteractionStickerStructV2> interaction_stickers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 27)
    public Boolean is_ads;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 107)
    public Integer is_effect_designer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 124)
    public Boolean is_familiar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 34)
    public Boolean is_fantasy;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 47)
    public Integer is_hash_tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 48)
    public Boolean is_pgcshow;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 38)
    public Boolean is_relieve;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer is_top;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 25)
    public Boolean is_vr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 68)
    public Integer item_comment_settings;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 80)
    public Integer item_duet;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 81)
    public Integer item_react;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 39)
    public UrlStructV2 label_friend;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 15)
    public UrlStructV2 label_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 22)
    public UrlStructV2 label_music_starter;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 84)
    public String label_music_starter_text;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 20)
    public UrlStructV2 label_origin_author;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 23)
    public UrlStructV2 label_private;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 label_thumb;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 18)
    public UrlStructV2 label_top;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoTextStructV2#ADAPTER", label = Label.REPEATED, tag = 55)
    public List<VideoTextStructV2> label_top_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String landing_page;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 74)
    public String link_ad_data;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LongVideoStructV2#ADAPTER", label = Label.REPEATED, tag = 79)
    public List<LongVideoStructV2> long_video;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MicroAppStructV2#ADAPTER", tag = 72)
    public MicroAppStructV2 micro_app_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 99)
    public String misc_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MixStructV2#ADAPTER", tag = 113)
    public MixStructV2 mix_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicStructV2#ADAPTER", tag = 5)
    public MusicStructV2 music;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeNationalTaskStructV2#ADAPTER", tag = 117)
    public AwemeNationalTaskStructV2 national_task_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 125)
    public Boolean need_vs_entry;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = Label.REPEATED, tag = 66)
    public List<PositionStructV2> nickname_position;
    @WireField(adapter = "com.ss.ugc.aweme.proto.OpenPlatformStructV2#ADAPTER", tag = 94)
    public OpenPlatformStructV2 open_platform_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 89)
    public String open_platform_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 101)
    public List<String> origin_comment_ids;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PoiStructV2#ADAPTER", tag = 28)
    public PoiStructV2 poi_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = Label.REPEATED, tag = 41)
    public List<PositionStructV2> position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 64)
    public String pre_forward_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PreloadStructV2#ADAPTER", tag = 86)
    public PreloadStructV2 preload;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 65)
    public Boolean prevent_download;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemePromotionOtherStructV2#ADAPTER", tag = 100)
    public AwemePromotionOtherStructV2 promotion_other_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PromotionStructV2#ADAPTER", label = Label.REPEATED, tag = 56)
    public List<PromotionStructV2> promotions;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public Integer rate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 70)
    public String raw_ad_data;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RedPacketStructV2#ADAPTER", tag = 33)
    public RedPacketStructV2 red_packet;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 49)
    public String region;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelationDynamicLableStructV2#ADAPTER", tag = 32)
    public RelationDynamicLableStructV2 relation_label;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeRiskStructV2#ADAPTER", tag = 37)
    public AwemeRiskStructV2 risk_infos;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 61)
    public String segment_latitudes;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 60)
    public String segment_longitudes;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 19)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String share_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 98)
    public String simple_promotions;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 114)
    public String simple_shop_seeding;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 40)
    public String sort_label;
    @WireField(adapter = "com.ss.ugc.aweme.proto.SpecialStickerStructV2#ADAPTER", tag = 52)
    public SpecialStickerStructV2 sp_sticker;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStarAtlasStructV2#ADAPTER", tag = 90)
    public AwemeStarAtlasStructV2 star_atlas_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 83)
    public Long star_atlas_order_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 87)
    public String star_recommend_tag;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStatisticsStructV2#ADAPTER", tag = 10)
    public AwemeStatisticsStructV2 statistics;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStatusStructV2#ADAPTER", tag = 11)
    public AwemeStatusStructV2 status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.NewFaceStickerStructV2#ADAPTER", tag = 78)
    public NewFaceStickerStructV2 sticker_detail;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 57)
    public String stickers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 97)
    public String take_down_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 96)
    public Integer take_down_reason;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TextExtraStructV2#ADAPTER", label = Label.REPEATED, tag = 14)
    public List<TextExtraStructV2> text_extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = Label.REPEATED, tag = 42)
    public List<PositionStructV2> uniqid_position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer user_digged;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoStructV2#ADAPTER", tag = 7)
    public VideoStructV2 video;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoControlV2#ADAPTER", tag = 106)
    public VideoControlV2 video_control;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeLabelStructV2#ADAPTER", label = Label.REPEATED, tag = 24)
    public List<AwemeLabelStructV2> video_labels;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoTextStructV2#ADAPTER", label = Label.REPEATED, tag = 50)
    public List<VideoTextStructV2> video_text;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VPAInfoStructV2#ADAPTER", tag = 122)
    public VPAInfoStructV2 vpa_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 51)
    public Integer vr_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 73)
    public Boolean with_promotional_music;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 85)
    public Boolean without_watermark;
    @WireField(adapter = "com.ss.ugc.aweme.proto.XiguaTaskStructV2#ADAPTER", tag = 75)
    public XiguaTaskStructV2 xigua_task;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeStructV2, Builder> {
        public AwemeACLStructV2 acl_info;
        public CommerceActivityStructV2 activity_pendant;
        public Integer ad_aweme_source;
        public Integer ad_link_type;
        public String ad_order_id;
        public String ad_schedule;
        public AnchorStructV2 anchor;
        public AwemeAnchorStructV2 anchor_info;
        public UserStructV2 author;
        public Long author_user_id;
        public AwemeControlStructV2 aweme_control;
        public String aweme_id;
        public Integer aweme_type;
        public BannerTipV2 banner_tip;
        public Integer bodydance_score;
        public WebcastRoomFeedCellStructV2 cell_room;
        public List<ChallengeStructV2> cha_list = Internal.newMutableList();
        public List<PositionStructV2> challenge_position = Internal.newMutableList();
        public Boolean cmt_swt;
        public CNYStructV2 cny_info;
        public Integer collect_stat;
        public List<CommentStructV2> comment_list = Internal.newMutableList();
        public List<CommerceConfigDataV2> commerce_config_data = Internal.newMutableList();
        public AwemeCommerceStructV2 commerce_info;
        public AwemeCommerceStickerStructV2 commerce_sticker_info;
        public Long create_time;
        public String desc;
        public String desc_language;
        public DescendantStructV2 descendants;
        public String distance;
        public Integer distribute_type;
        public Integer duration;
        public Boolean enable_top_view;
        public String extra;
        public RelationLabelStructV2 feed_relation_label;
        public AwemeFloatingCardStructV2 floating_card_content;
        public String forward_comment_id;
        public AwemeStructV2 forward_item;
        public String forward_item_id;
        public GameStructV2 game_info;
        public AwemeGDAdStructV2 gd_ad;
        public List<String> geofencing = Internal.newMutableList();
        public CommerceActivityStructV2 gesture_red_packet;
        public String group_id;
        public Boolean has_vs_entry;
        public AwemeSearchStructV2 hot_info;
        public HotListStructV2 hot_list;
        public List<ImageInfoStructV2> image_infos = Internal.newMutableList();
        public List<InteractionStickerStructV2> interaction_stickers = Internal.newMutableList();
        public Boolean is_ads;
        public Integer is_effect_designer;
        public Boolean is_familiar;
        public Boolean is_fantasy;
        public Integer is_hash_tag;
        public Boolean is_pgcshow;
        public Boolean is_relieve;
        public Integer is_top;
        public Boolean is_vr;
        public Integer item_comment_settings;
        public Integer item_duet;
        public Integer item_react;
        public UrlStructV2 label_friend;
        public UrlStructV2 label_large;
        public UrlStructV2 label_music_starter;
        public String label_music_starter_text;
        public UrlStructV2 label_origin_author;
        public UrlStructV2 label_private;
        public UrlStructV2 label_thumb;
        public UrlStructV2 label_top;
        public List<VideoTextStructV2> label_top_text = Internal.newMutableList();
        public String landing_page;
        public String link_ad_data;
        public List<LongVideoStructV2> long_video = Internal.newMutableList();
        public MicroAppStructV2 micro_app_info;
        public String misc_info;
        public MixStructV2 mix_info;
        public MusicStructV2 music;
        public AwemeNationalTaskStructV2 national_task_info;
        public Boolean need_vs_entry;
        public List<PositionStructV2> nickname_position = Internal.newMutableList();
        public OpenPlatformStructV2 open_platform_info;
        public String open_platform_name;
        public List<String> origin_comment_ids = Internal.newMutableList();
        public PoiStructV2 poi_info;
        public List<PositionStructV2> position = Internal.newMutableList();
        public String pre_forward_id;
        public PreloadStructV2 preload;
        public Boolean prevent_download;
        public AwemePromotionOtherStructV2 promotion_other_info;
        public List<PromotionStructV2> promotions = Internal.newMutableList();
        public Integer rate;
        public String raw_ad_data;
        public RedPacketStructV2 red_packet;
        public String region;
        public RelationDynamicLableStructV2 relation_label;
        public AwemeRiskStructV2 risk_infos;
        public String segment_latitudes;
        public String segment_longitudes;
        public ShareStructV2 share_info;
        public String share_url;
        public String simple_promotions;
        public String simple_shop_seeding;
        public String sort_label;
        public SpecialStickerStructV2 sp_sticker;
        public AwemeStarAtlasStructV2 star_atlas_info;
        public Long star_atlas_order_id;
        public String star_recommend_tag;
        public AwemeStatisticsStructV2 statistics;
        public AwemeStatusStructV2 status;
        public NewFaceStickerStructV2 sticker_detail;
        public String stickers;
        public String take_down_desc;
        public Integer take_down_reason;
        public List<TextExtraStructV2> text_extra = Internal.newMutableList();
        public List<PositionStructV2> uniqid_position = Internal.newMutableList();
        public Integer user_digged;
        public VideoStructV2 video;
        public VideoControlV2 video_control;
        public List<AwemeLabelStructV2> video_labels = Internal.newMutableList();
        public List<VideoTextStructV2> video_text = Internal.newMutableList();
        public VPAInfoStructV2 vpa_info;
        public Integer vr_type;
        public Boolean with_promotional_music;
        public Boolean without_watermark;
        public XiguaTaskStructV2 xigua_task;

        public final AwemeStructV2 build() {
            AwemeStructV2 awemeStructV2 = new AwemeStructV2(this.aweme_id, this.desc, this.create_time, this.author, this.music, this.cha_list, this.video, this.share_url, this.user_digged, this.statistics, this.status, this.extra, this.rate, this.text_extra, this.label_large, this.label_thumb, this.is_top, this.label_top, this.share_info, this.label_origin_author, this.distance, this.label_music_starter, this.label_private, this.video_labels, this.is_vr, this.landing_page, this.is_ads, this.poi_info, this.duration, this.aweme_type, this.gd_ad, this.relation_label, this.red_packet, this.is_fantasy, this.cmt_swt, this.image_infos, this.risk_infos, this.is_relieve, this.label_friend, this.sort_label, this.position, this.uniqid_position, this.comment_list, this.author_user_id, this.bodydance_score, this.geofencing, this.is_hash_tag, this.is_pgcshow, this.region, this.video_text, this.vr_type, this.sp_sticker, this.ad_schedule, this.collect_stat, this.label_top_text, this.promotions, this.stickers, this.forward_item, this.forward_comment_id, this.segment_longitudes, this.segment_latitudes, this.forward_item_id, this.group_id, this.pre_forward_id, this.prevent_download, this.nickname_position, this.challenge_position, this.item_comment_settings, this.descendants, this.raw_ad_data, this.game_info, this.micro_app_info, this.with_promotional_music, this.link_ad_data, this.xigua_task, this.gesture_red_packet, this.activity_pendant, this.sticker_detail, this.long_video, this.item_duet, this.item_react, this.hot_info, this.star_atlas_order_id, this.label_music_starter_text, this.without_watermark, this.preload, this.star_recommend_tag, this.ad_order_id, this.open_platform_name, this.star_atlas_info, this.desc_language, this.floating_card_content, this.interaction_stickers, this.open_platform_info, this.ad_link_type, this.take_down_reason, this.take_down_desc, this.simple_promotions, this.misc_info, this.promotion_other_info, this.origin_comment_ids, this.commerce_config_data, this.commerce_sticker_info, this.enable_top_view, this.distribute_type, this.video_control, this.is_effect_designer, this.ad_aweme_source, this.aweme_control, this.has_vs_entry, this.anchor, this.feed_relation_label, this.mix_info, this.simple_shop_seeding, this.hot_list, this.commerce_info, this.national_task_info, this.banner_tip, this.acl_info, this.anchor_info, this.vpa_info, this.cny_info, this.is_familiar, this.need_vs_entry, this.cell_room, super.buildUnknownFields());
            return awemeStructV2;
        }

        public final Builder acl_info(AwemeACLStructV2 awemeACLStructV2) {
            this.acl_info = awemeACLStructV2;
            return this;
        }

        public final Builder activity_pendant(CommerceActivityStructV2 commerceActivityStructV2) {
            this.activity_pendant = commerceActivityStructV2;
            return this;
        }

        public final Builder ad_aweme_source(Integer num) {
            this.ad_aweme_source = num;
            return this;
        }

        public final Builder ad_link_type(Integer num) {
            this.ad_link_type = num;
            return this;
        }

        public final Builder ad_order_id(String str) {
            this.ad_order_id = str;
            return this;
        }

        public final Builder ad_schedule(String str) {
            this.ad_schedule = str;
            return this;
        }

        public final Builder anchor(AnchorStructV2 anchorStructV2) {
            this.anchor = anchorStructV2;
            return this;
        }

        public final Builder anchor_info(AwemeAnchorStructV2 awemeAnchorStructV2) {
            this.anchor_info = awemeAnchorStructV2;
            return this;
        }

        public final Builder author(UserStructV2 userStructV2) {
            this.author = userStructV2;
            return this;
        }

        public final Builder author_user_id(Long l) {
            this.author_user_id = l;
            return this;
        }

        public final Builder aweme_control(AwemeControlStructV2 awemeControlStructV2) {
            this.aweme_control = awemeControlStructV2;
            return this;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder aweme_type(Integer num) {
            this.aweme_type = num;
            return this;
        }

        public final Builder banner_tip(BannerTipV2 bannerTipV2) {
            this.banner_tip = bannerTipV2;
            return this;
        }

        public final Builder bodydance_score(Integer num) {
            this.bodydance_score = num;
            return this;
        }

        public final Builder cell_room(WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2) {
            this.cell_room = webcastRoomFeedCellStructV2;
            return this;
        }

        public final Builder cmt_swt(Boolean bool) {
            this.cmt_swt = bool;
            return this;
        }

        public final Builder cny_info(CNYStructV2 cNYStructV2) {
            this.cny_info = cNYStructV2;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder commerce_info(AwemeCommerceStructV2 awemeCommerceStructV2) {
            this.commerce_info = awemeCommerceStructV2;
            return this;
        }

        public final Builder commerce_sticker_info(AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2) {
            this.commerce_sticker_info = awemeCommerceStickerStructV2;
            return this;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder desc_language(String str) {
            this.desc_language = str;
            return this;
        }

        public final Builder descendants(DescendantStructV2 descendantStructV2) {
            this.descendants = descendantStructV2;
            return this;
        }

        public final Builder distance(String str) {
            this.distance = str;
            return this;
        }

        public final Builder distribute_type(Integer num) {
            this.distribute_type = num;
            return this;
        }

        public final Builder duration(Integer num) {
            this.duration = num;
            return this;
        }

        public final Builder enable_top_view(Boolean bool) {
            this.enable_top_view = bool;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder feed_relation_label(RelationLabelStructV2 relationLabelStructV2) {
            this.feed_relation_label = relationLabelStructV2;
            return this;
        }

        public final Builder floating_card_content(AwemeFloatingCardStructV2 awemeFloatingCardStructV2) {
            this.floating_card_content = awemeFloatingCardStructV2;
            return this;
        }

        public final Builder forward_comment_id(String str) {
            this.forward_comment_id = str;
            return this;
        }

        public final Builder forward_item(AwemeStructV2 awemeStructV2) {
            this.forward_item = awemeStructV2;
            return this;
        }

        public final Builder forward_item_id(String str) {
            this.forward_item_id = str;
            return this;
        }

        public final Builder game_info(GameStructV2 gameStructV2) {
            this.game_info = gameStructV2;
            return this;
        }

        public final Builder gd_ad(AwemeGDAdStructV2 awemeGDAdStructV2) {
            this.gd_ad = awemeGDAdStructV2;
            return this;
        }

        public final Builder gesture_red_packet(CommerceActivityStructV2 commerceActivityStructV2) {
            this.gesture_red_packet = commerceActivityStructV2;
            return this;
        }

        public final Builder group_id(String str) {
            this.group_id = str;
            return this;
        }

        public final Builder has_vs_entry(Boolean bool) {
            this.has_vs_entry = bool;
            return this;
        }

        public final Builder hot_info(AwemeSearchStructV2 awemeSearchStructV2) {
            this.hot_info = awemeSearchStructV2;
            return this;
        }

        public final Builder hot_list(HotListStructV2 hotListStructV2) {
            this.hot_list = hotListStructV2;
            return this;
        }

        public final Builder is_ads(Boolean bool) {
            this.is_ads = bool;
            return this;
        }

        public final Builder is_effect_designer(Integer num) {
            this.is_effect_designer = num;
            return this;
        }

        public final Builder is_familiar(Boolean bool) {
            this.is_familiar = bool;
            return this;
        }

        public final Builder is_fantasy(Boolean bool) {
            this.is_fantasy = bool;
            return this;
        }

        public final Builder is_hash_tag(Integer num) {
            this.is_hash_tag = num;
            return this;
        }

        public final Builder is_pgcshow(Boolean bool) {
            this.is_pgcshow = bool;
            return this;
        }

        public final Builder is_relieve(Boolean bool) {
            this.is_relieve = bool;
            return this;
        }

        public final Builder is_top(Integer num) {
            this.is_top = num;
            return this;
        }

        public final Builder is_vr(Boolean bool) {
            this.is_vr = bool;
            return this;
        }

        public final Builder item_comment_settings(Integer num) {
            this.item_comment_settings = num;
            return this;
        }

        public final Builder item_duet(Integer num) {
            this.item_duet = num;
            return this;
        }

        public final Builder item_react(Integer num) {
            this.item_react = num;
            return this;
        }

        public final Builder label_friend(UrlStructV2 urlStructV2) {
            this.label_friend = urlStructV2;
            return this;
        }

        public final Builder label_large(UrlStructV2 urlStructV2) {
            this.label_large = urlStructV2;
            return this;
        }

        public final Builder label_music_starter(UrlStructV2 urlStructV2) {
            this.label_music_starter = urlStructV2;
            return this;
        }

        public final Builder label_music_starter_text(String str) {
            this.label_music_starter_text = str;
            return this;
        }

        public final Builder label_origin_author(UrlStructV2 urlStructV2) {
            this.label_origin_author = urlStructV2;
            return this;
        }

        public final Builder label_private(UrlStructV2 urlStructV2) {
            this.label_private = urlStructV2;
            return this;
        }

        public final Builder label_thumb(UrlStructV2 urlStructV2) {
            this.label_thumb = urlStructV2;
            return this;
        }

        public final Builder label_top(UrlStructV2 urlStructV2) {
            this.label_top = urlStructV2;
            return this;
        }

        public final Builder landing_page(String str) {
            this.landing_page = str;
            return this;
        }

        public final Builder link_ad_data(String str) {
            this.link_ad_data = str;
            return this;
        }

        public final Builder micro_app_info(MicroAppStructV2 microAppStructV2) {
            this.micro_app_info = microAppStructV2;
            return this;
        }

        public final Builder misc_info(String str) {
            this.misc_info = str;
            return this;
        }

        public final Builder mix_info(MixStructV2 mixStructV2) {
            this.mix_info = mixStructV2;
            return this;
        }

        public final Builder music(MusicStructV2 musicStructV2) {
            this.music = musicStructV2;
            return this;
        }

        public final Builder national_task_info(AwemeNationalTaskStructV2 awemeNationalTaskStructV2) {
            this.national_task_info = awemeNationalTaskStructV2;
            return this;
        }

        public final Builder need_vs_entry(Boolean bool) {
            this.need_vs_entry = bool;
            return this;
        }

        public final Builder open_platform_info(OpenPlatformStructV2 openPlatformStructV2) {
            this.open_platform_info = openPlatformStructV2;
            return this;
        }

        public final Builder open_platform_name(String str) {
            this.open_platform_name = str;
            return this;
        }

        public final Builder poi_info(PoiStructV2 poiStructV2) {
            this.poi_info = poiStructV2;
            return this;
        }

        public final Builder pre_forward_id(String str) {
            this.pre_forward_id = str;
            return this;
        }

        public final Builder preload(PreloadStructV2 preloadStructV2) {
            this.preload = preloadStructV2;
            return this;
        }

        public final Builder prevent_download(Boolean bool) {
            this.prevent_download = bool;
            return this;
        }

        public final Builder promotion_other_info(AwemePromotionOtherStructV2 awemePromotionOtherStructV2) {
            this.promotion_other_info = awemePromotionOtherStructV2;
            return this;
        }

        public final Builder rate(Integer num) {
            this.rate = num;
            return this;
        }

        public final Builder raw_ad_data(String str) {
            this.raw_ad_data = str;
            return this;
        }

        public final Builder red_packet(RedPacketStructV2 redPacketStructV2) {
            this.red_packet = redPacketStructV2;
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            return this;
        }

        public final Builder relation_label(RelationDynamicLableStructV2 relationDynamicLableStructV2) {
            this.relation_label = relationDynamicLableStructV2;
            return this;
        }

        public final Builder risk_infos(AwemeRiskStructV2 awemeRiskStructV2) {
            this.risk_infos = awemeRiskStructV2;
            return this;
        }

        public final Builder segment_latitudes(String str) {
            this.segment_latitudes = str;
            return this;
        }

        public final Builder segment_longitudes(String str) {
            this.segment_longitudes = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder share_url(String str) {
            this.share_url = str;
            return this;
        }

        public final Builder simple_promotions(String str) {
            this.simple_promotions = str;
            return this;
        }

        public final Builder simple_shop_seeding(String str) {
            this.simple_shop_seeding = str;
            return this;
        }

        public final Builder sort_label(String str) {
            this.sort_label = str;
            return this;
        }

        public final Builder sp_sticker(SpecialStickerStructV2 specialStickerStructV2) {
            this.sp_sticker = specialStickerStructV2;
            return this;
        }

        public final Builder star_atlas_info(AwemeStarAtlasStructV2 awemeStarAtlasStructV2) {
            this.star_atlas_info = awemeStarAtlasStructV2;
            return this;
        }

        public final Builder star_atlas_order_id(Long l) {
            this.star_atlas_order_id = l;
            return this;
        }

        public final Builder star_recommend_tag(String str) {
            this.star_recommend_tag = str;
            return this;
        }

        public final Builder statistics(AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            this.statistics = awemeStatisticsStructV2;
            return this;
        }

        public final Builder status(AwemeStatusStructV2 awemeStatusStructV2) {
            this.status = awemeStatusStructV2;
            return this;
        }

        public final Builder sticker_detail(NewFaceStickerStructV2 newFaceStickerStructV2) {
            this.sticker_detail = newFaceStickerStructV2;
            return this;
        }

        public final Builder stickers(String str) {
            this.stickers = str;
            return this;
        }

        public final Builder take_down_desc(String str) {
            this.take_down_desc = str;
            return this;
        }

        public final Builder take_down_reason(Integer num) {
            this.take_down_reason = num;
            return this;
        }

        public final Builder user_digged(Integer num) {
            this.user_digged = num;
            return this;
        }

        public final Builder video(VideoStructV2 videoStructV2) {
            this.video = videoStructV2;
            return this;
        }

        public final Builder video_control(VideoControlV2 videoControlV2) {
            this.video_control = videoControlV2;
            return this;
        }

        public final Builder vpa_info(VPAInfoStructV2 vPAInfoStructV2) {
            this.vpa_info = vPAInfoStructV2;
            return this;
        }

        public final Builder vr_type(Integer num) {
            this.vr_type = num;
            return this;
        }

        public final Builder with_promotional_music(Boolean bool) {
            this.with_promotional_music = bool;
            return this;
        }

        public final Builder without_watermark(Boolean bool) {
            this.without_watermark = bool;
            return this;
        }

        public final Builder xigua_task(XiguaTaskStructV2 xiguaTaskStructV2) {
            this.xigua_task = xiguaTaskStructV2;
            return this;
        }

        public final Builder cha_list(List<ChallengeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.cha_list = list;
            return this;
        }

        public final Builder challenge_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.challenge_position = list;
            return this;
        }

        public final Builder comment_list(List<CommentStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.comment_list = list;
            return this;
        }

        public final Builder commerce_config_data(List<CommerceConfigDataV2> list) {
            Internal.checkElementsNotNull(list);
            this.commerce_config_data = list;
            return this;
        }

        public final Builder geofencing(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.geofencing = list;
            return this;
        }

        public final Builder image_infos(List<ImageInfoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.image_infos = list;
            return this;
        }

        public final Builder interaction_stickers(List<InteractionStickerStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.interaction_stickers = list;
            return this;
        }

        public final Builder label_top_text(List<VideoTextStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.label_top_text = list;
            return this;
        }

        public final Builder long_video(List<LongVideoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.long_video = list;
            return this;
        }

        public final Builder nickname_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.nickname_position = list;
            return this;
        }

        public final Builder origin_comment_ids(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.origin_comment_ids = list;
            return this;
        }

        public final Builder position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.position = list;
            return this;
        }

        public final Builder promotions(List<PromotionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.promotions = list;
            return this;
        }

        public final Builder text_extra(List<TextExtraStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.text_extra = list;
            return this;
        }

        public final Builder uniqid_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.uniqid_position = list;
            return this;
        }

        public final Builder video_labels(List<AwemeLabelStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.video_labels = list;
            return this;
        }

        public final Builder video_text(List<VideoTextStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.video_text = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeStructV2$ProtoAdapter_AwemeStructV2 */
    static final class ProtoAdapter_AwemeStructV2 extends ProtoAdapter<AwemeStructV2> {
        public ProtoAdapter_AwemeStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStructV2.class);
        }

        public final AwemeStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.author((UserStructV2) UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.music((MusicStructV2) MusicStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.cha_list.add(ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.video((VideoStructV2) VideoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.share_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.user_digged((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.statistics((AwemeStatisticsStructV2) AwemeStatisticsStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.status((AwemeStatusStructV2) AwemeStatusStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.rate((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.text_extra.add(TextExtraStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.label_large((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.label_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.is_top((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 18:
                            builder.label_top((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.share_info((ShareStructV2) ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            builder.label_origin_author((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            builder.distance((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 22:
                            builder.label_music_starter((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            builder.label_private((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 24:
                            builder.video_labels.add(AwemeLabelStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            builder.is_vr((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                            builder.landing_page((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            builder.is_ads((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 28:
                            builder.poi_info((PoiStructV2) PoiStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 29:
                            builder.duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 30:
                            builder.aweme_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 31:
                            builder.gd_ad((AwemeGDAdStructV2) AwemeGDAdStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 32:
                            builder.relation_label((RelationDynamicLableStructV2) RelationDynamicLableStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 33:
                            builder.red_packet((RedPacketStructV2) RedPacketStructV2.ADAPTER.decode(protoReader));
                            break;
                        case BaseNotice.CHALLENGE /*34*/:
                            builder.is_fantasy((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 35:
                            builder.cmt_swt((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 36:
                            builder.image_infos.add(ImageInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 37:
                            builder.risk_infos((AwemeRiskStructV2) AwemeRiskStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 38:
                            builder.is_relieve((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 39:
                            builder.label_friend((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 40:
                            builder.sort_label((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.LIKE /*41*/:
                            builder.position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 42:
                            builder.uniqid_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 43:
                            builder.comment_list.add(CommentStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 44:
                            builder.author_user_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case BaseNotice.f89516AT /*45*/:
                            builder.bodydance_score((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 46:
                            builder.geofencing.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 47:
                            builder.is_hash_tag((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 48:
                            builder.is_pgcshow((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 49:
                            builder.region((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 50:
                            builder.video_text.add(VideoTextStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 51:
                            builder.vr_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 52:
                            builder.sp_sticker((SpecialStickerStructV2) SpecialStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 53:
                            builder.ad_schedule((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 54:
                            builder.collect_stat((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 55:
                            builder.label_top_text.add(VideoTextStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 56:
                            builder.promotions.add(PromotionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 57:
                            builder.stickers((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 58:
                            builder.forward_item((AwemeStructV2) AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 59:
                            builder.forward_comment_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 60:
                            builder.segment_longitudes((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.TCM /*61*/:
                            builder.segment_latitudes((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.CREATOR /*62*/:
                            builder.forward_item_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 63:
                            builder.group_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 64:
                            builder.pre_forward_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 65:
                            builder.prevent_download((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 66:
                            builder.nickname_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 67:
                            builder.challenge_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 68:
                            builder.item_comment_settings((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 69:
                            builder.descendants((DescendantStructV2) DescendantStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 70:
                            builder.raw_ad_data((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 71:
                            builder.game_info((GameStructV2) GameStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 72:
                            builder.micro_app_info((MicroAppStructV2) MicroAppStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 73:
                            builder.with_promotional_music((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 74:
                            builder.link_ad_data((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 75:
                            builder.xigua_task((XiguaTaskStructV2) XiguaTaskStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 76:
                            builder.gesture_red_packet((CommerceActivityStructV2) CommerceActivityStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 77:
                            builder.activity_pendant((CommerceActivityStructV2) CommerceActivityStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 78:
                            builder.sticker_detail((NewFaceStickerStructV2) NewFaceStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 79:
                            builder.long_video.add(LongVideoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 80:
                            builder.item_duet((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 81:
                            builder.item_react((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 82:
                            builder.hot_info((AwemeSearchStructV2) AwemeSearchStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 83:
                            builder.star_atlas_order_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 84:
                            builder.label_music_starter_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 85:
                            builder.without_watermark((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 86:
                            builder.preload((PreloadStructV2) PreloadStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 87:
                            builder.star_recommend_tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 88:
                            builder.ad_order_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 89:
                            builder.open_platform_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 90:
                            builder.star_atlas_info((AwemeStarAtlasStructV2) AwemeStarAtlasStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 91:
                            builder.desc_language((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 92:
                            builder.floating_card_content((AwemeFloatingCardStructV2) AwemeFloatingCardStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 93:
                            builder.interaction_stickers.add(InteractionStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 94:
                            builder.open_platform_info((OpenPlatformStructV2) OpenPlatformStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 95:
                            builder.ad_link_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 96:
                            builder.take_down_reason((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 97:
                            builder.take_down_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 98:
                            builder.simple_promotions((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 99:
                            builder.misc_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 100:
                            builder.promotion_other_info((AwemePromotionOtherStructV2) AwemePromotionOtherStructV2.ADAPTER.decode(protoReader));
                            break;
                        case BaseNotice.HASHTAG /*101*/:
                            builder.origin_comment_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 102:
                            builder.commerce_config_data.add(CommerceConfigDataV2.ADAPTER.decode(protoReader));
                            break;
                        case 103:
                            builder.commerce_sticker_info((AwemeCommerceStickerStructV2) AwemeCommerceStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 104:
                            builder.enable_top_view((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 105:
                            builder.distribute_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 106:
                            builder.video_control((VideoControlV2) VideoControlV2.ADAPTER.decode(protoReader));
                            break;
                        case 107:
                            builder.is_effect_designer((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 108:
                            builder.ad_aweme_source((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 109:
                            builder.aweme_control((AwemeControlStructV2) AwemeControlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED /*110*/:
                            builder.has_vs_entry((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 111:
                            builder.anchor((AnchorStructV2) AnchorStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 112:
                            builder.feed_relation_label((RelationLabelStructV2) RelationLabelStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 113:
                            builder.mix_info((MixStructV2) MixStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 114:
                            builder.simple_shop_seeding((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 115:
                            builder.hot_list((HotListStructV2) HotListStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 116:
                            builder.commerce_info((AwemeCommerceStructV2) AwemeCommerceStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 117:
                            builder.national_task_info((AwemeNationalTaskStructV2) AwemeNationalTaskStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 118:
                            builder.banner_tip((BannerTipV2) BannerTipV2.ADAPTER.decode(protoReader));
                            break;
                        case 119:
                            builder.acl_info((AwemeACLStructV2) AwemeACLStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 121:
                            builder.anchor_info((AwemeAnchorStructV2) AwemeAnchorStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 122:
                            builder.vpa_info((VPAInfoStructV2) VPAInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 123:
                            builder.cny_info((CNYStructV2) CNYStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 124:
                            builder.is_familiar((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 125:
                            builder.need_vs_entry((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 126:
                            builder.cell_room((WebcastRoomFeedCellStructV2) WebcastRoomFeedCellStructV2.ADAPTER.decode(protoReader));
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

        public final int encodedSize(AwemeStructV2 awemeStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStructV2.aweme_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeStructV2.desc) + ProtoAdapter.INT64.encodedSizeWithTag(3, awemeStructV2.create_time) + UserStructV2.ADAPTER.encodedSizeWithTag(4, awemeStructV2.author) + MusicStructV2.ADAPTER.encodedSizeWithTag(5, awemeStructV2.music) + ChallengeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(6, awemeStructV2.cha_list) + VideoStructV2.ADAPTER.encodedSizeWithTag(7, awemeStructV2.video) + ProtoAdapter.STRING.encodedSizeWithTag(8, awemeStructV2.share_url) + ProtoAdapter.INT32.encodedSizeWithTag(9, awemeStructV2.user_digged) + AwemeStatisticsStructV2.ADAPTER.encodedSizeWithTag(10, awemeStructV2.statistics) + AwemeStatusStructV2.ADAPTER.encodedSizeWithTag(11, awemeStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(12, awemeStructV2.extra) + ProtoAdapter.INT32.encodedSizeWithTag(13, awemeStructV2.rate) + TextExtraStructV2.ADAPTER.asRepeated().encodedSizeWithTag(14, awemeStructV2.text_extra) + UrlStructV2.ADAPTER.encodedSizeWithTag(15, awemeStructV2.label_large) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, awemeStructV2.label_thumb) + ProtoAdapter.INT32.encodedSizeWithTag(17, awemeStructV2.is_top) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, awemeStructV2.label_top) + ShareStructV2.ADAPTER.encodedSizeWithTag(19, awemeStructV2.share_info) + UrlStructV2.ADAPTER.encodedSizeWithTag(20, awemeStructV2.label_origin_author) + ProtoAdapter.STRING.encodedSizeWithTag(21, awemeStructV2.distance) + UrlStructV2.ADAPTER.encodedSizeWithTag(22, awemeStructV2.label_music_starter) + UrlStructV2.ADAPTER.encodedSizeWithTag(23, awemeStructV2.label_private) + AwemeLabelStructV2.ADAPTER.asRepeated().encodedSizeWithTag(24, awemeStructV2.video_labels) + ProtoAdapter.BOOL.encodedSizeWithTag(25, awemeStructV2.is_vr) + ProtoAdapter.STRING.encodedSizeWithTag(26, awemeStructV2.landing_page) + ProtoAdapter.BOOL.encodedSizeWithTag(27, awemeStructV2.is_ads) + PoiStructV2.ADAPTER.encodedSizeWithTag(28, awemeStructV2.poi_info) + ProtoAdapter.INT32.encodedSizeWithTag(29, awemeStructV2.duration) + ProtoAdapter.INT32.encodedSizeWithTag(30, awemeStructV2.aweme_type) + AwemeGDAdStructV2.ADAPTER.encodedSizeWithTag(31, awemeStructV2.gd_ad) + RelationDynamicLableStructV2.ADAPTER.encodedSizeWithTag(32, awemeStructV2.relation_label) + RedPacketStructV2.ADAPTER.encodedSizeWithTag(33, awemeStructV2.red_packet) + ProtoAdapter.BOOL.encodedSizeWithTag(34, awemeStructV2.is_fantasy) + ProtoAdapter.BOOL.encodedSizeWithTag(35, awemeStructV2.cmt_swt) + ImageInfoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(36, awemeStructV2.image_infos) + AwemeRiskStructV2.ADAPTER.encodedSizeWithTag(37, awemeStructV2.risk_infos) + ProtoAdapter.BOOL.encodedSizeWithTag(38, awemeStructV2.is_relieve) + UrlStructV2.ADAPTER.encodedSizeWithTag(39, awemeStructV2.label_friend) + ProtoAdapter.STRING.encodedSizeWithTag(40, awemeStructV2.sort_label) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(41, awemeStructV2.position) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(42, awemeStructV2.uniqid_position) + CommentStructV2.ADAPTER.asRepeated().encodedSizeWithTag(43, awemeStructV2.comment_list) + ProtoAdapter.INT64.encodedSizeWithTag(44, awemeStructV2.author_user_id) + ProtoAdapter.INT32.encodedSizeWithTag(45, awemeStructV2.bodydance_score) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(46, awemeStructV2.geofencing) + ProtoAdapter.INT32.encodedSizeWithTag(47, awemeStructV2.is_hash_tag) + ProtoAdapter.BOOL.encodedSizeWithTag(48, awemeStructV2.is_pgcshow) + ProtoAdapter.STRING.encodedSizeWithTag(49, awemeStructV2.region) + VideoTextStructV2.ADAPTER.asRepeated().encodedSizeWithTag(50, awemeStructV2.video_text) + ProtoAdapter.INT32.encodedSizeWithTag(51, awemeStructV2.vr_type) + SpecialStickerStructV2.ADAPTER.encodedSizeWithTag(52, awemeStructV2.sp_sticker) + ProtoAdapter.STRING.encodedSizeWithTag(53, awemeStructV2.ad_schedule) + ProtoAdapter.INT32.encodedSizeWithTag(54, awemeStructV2.collect_stat) + VideoTextStructV2.ADAPTER.asRepeated().encodedSizeWithTag(55, awemeStructV2.label_top_text) + PromotionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(56, awemeStructV2.promotions) + ProtoAdapter.STRING.encodedSizeWithTag(57, awemeStructV2.stickers) + AwemeStructV2.ADAPTER.encodedSizeWithTag(58, awemeStructV2.forward_item) + ProtoAdapter.STRING.encodedSizeWithTag(59, awemeStructV2.forward_comment_id) + ProtoAdapter.STRING.encodedSizeWithTag(60, awemeStructV2.segment_longitudes) + ProtoAdapter.STRING.encodedSizeWithTag(61, awemeStructV2.segment_latitudes) + ProtoAdapter.STRING.encodedSizeWithTag(62, awemeStructV2.forward_item_id) + ProtoAdapter.STRING.encodedSizeWithTag(63, awemeStructV2.group_id) + ProtoAdapter.STRING.encodedSizeWithTag(64, awemeStructV2.pre_forward_id) + ProtoAdapter.BOOL.encodedSizeWithTag(65, awemeStructV2.prevent_download) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(66, awemeStructV2.nickname_position) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(67, awemeStructV2.challenge_position) + ProtoAdapter.INT32.encodedSizeWithTag(68, awemeStructV2.item_comment_settings) + DescendantStructV2.ADAPTER.encodedSizeWithTag(69, awemeStructV2.descendants) + ProtoAdapter.STRING.encodedSizeWithTag(70, awemeStructV2.raw_ad_data) + GameStructV2.ADAPTER.encodedSizeWithTag(71, awemeStructV2.game_info) + MicroAppStructV2.ADAPTER.encodedSizeWithTag(72, awemeStructV2.micro_app_info) + ProtoAdapter.BOOL.encodedSizeWithTag(73, awemeStructV2.with_promotional_music) + ProtoAdapter.STRING.encodedSizeWithTag(74, awemeStructV2.link_ad_data) + XiguaTaskStructV2.ADAPTER.encodedSizeWithTag(75, awemeStructV2.xigua_task) + CommerceActivityStructV2.ADAPTER.encodedSizeWithTag(76, awemeStructV2.gesture_red_packet) + CommerceActivityStructV2.ADAPTER.encodedSizeWithTag(77, awemeStructV2.activity_pendant) + NewFaceStickerStructV2.ADAPTER.encodedSizeWithTag(78, awemeStructV2.sticker_detail) + LongVideoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(79, awemeStructV2.long_video) + ProtoAdapter.INT32.encodedSizeWithTag(80, awemeStructV2.item_duet) + ProtoAdapter.INT32.encodedSizeWithTag(81, awemeStructV2.item_react) + AwemeSearchStructV2.ADAPTER.encodedSizeWithTag(82, awemeStructV2.hot_info) + ProtoAdapter.INT64.encodedSizeWithTag(83, awemeStructV2.star_atlas_order_id) + ProtoAdapter.STRING.encodedSizeWithTag(84, awemeStructV2.label_music_starter_text) + ProtoAdapter.BOOL.encodedSizeWithTag(85, awemeStructV2.without_watermark) + PreloadStructV2.ADAPTER.encodedSizeWithTag(86, awemeStructV2.preload) + ProtoAdapter.STRING.encodedSizeWithTag(87, awemeStructV2.star_recommend_tag) + ProtoAdapter.STRING.encodedSizeWithTag(88, awemeStructV2.ad_order_id) + ProtoAdapter.STRING.encodedSizeWithTag(89, awemeStructV2.open_platform_name) + AwemeStarAtlasStructV2.ADAPTER.encodedSizeWithTag(90, awemeStructV2.star_atlas_info) + ProtoAdapter.STRING.encodedSizeWithTag(91, awemeStructV2.desc_language) + AwemeFloatingCardStructV2.ADAPTER.encodedSizeWithTag(92, awemeStructV2.floating_card_content) + InteractionStickerStructV2.ADAPTER.asRepeated().encodedSizeWithTag(93, awemeStructV2.interaction_stickers) + OpenPlatformStructV2.ADAPTER.encodedSizeWithTag(94, awemeStructV2.open_platform_info) + ProtoAdapter.INT32.encodedSizeWithTag(95, awemeStructV2.ad_link_type) + ProtoAdapter.INT32.encodedSizeWithTag(96, awemeStructV2.take_down_reason) + ProtoAdapter.STRING.encodedSizeWithTag(97, awemeStructV2.take_down_desc) + ProtoAdapter.STRING.encodedSizeWithTag(98, awemeStructV2.simple_promotions) + ProtoAdapter.STRING.encodedSizeWithTag(99, awemeStructV2.misc_info) + AwemePromotionOtherStructV2.ADAPTER.encodedSizeWithTag(100, awemeStructV2.promotion_other_info) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(BaseNotice.HASHTAG, awemeStructV2.origin_comment_ids) + CommerceConfigDataV2.ADAPTER.asRepeated().encodedSizeWithTag(102, awemeStructV2.commerce_config_data) + AwemeCommerceStickerStructV2.ADAPTER.encodedSizeWithTag(103, awemeStructV2.commerce_sticker_info) + ProtoAdapter.BOOL.encodedSizeWithTag(104, awemeStructV2.enable_top_view) + ProtoAdapter.INT32.encodedSizeWithTag(105, awemeStructV2.distribute_type) + VideoControlV2.ADAPTER.encodedSizeWithTag(106, awemeStructV2.video_control) + ProtoAdapter.INT32.encodedSizeWithTag(107, awemeStructV2.is_effect_designer) + ProtoAdapter.INT32.encodedSizeWithTag(108, awemeStructV2.ad_aweme_source) + AwemeControlStructV2.ADAPTER.encodedSizeWithTag(109, awemeStructV2.aweme_control) + ProtoAdapter.BOOL.encodedSizeWithTag(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, awemeStructV2.has_vs_entry) + AnchorStructV2.ADAPTER.encodedSizeWithTag(111, awemeStructV2.anchor) + RelationLabelStructV2.ADAPTER.encodedSizeWithTag(112, awemeStructV2.feed_relation_label) + MixStructV2.ADAPTER.encodedSizeWithTag(113, awemeStructV2.mix_info) + ProtoAdapter.STRING.encodedSizeWithTag(114, awemeStructV2.simple_shop_seeding) + HotListStructV2.ADAPTER.encodedSizeWithTag(115, awemeStructV2.hot_list) + AwemeCommerceStructV2.ADAPTER.encodedSizeWithTag(116, awemeStructV2.commerce_info) + AwemeNationalTaskStructV2.ADAPTER.encodedSizeWithTag(117, awemeStructV2.national_task_info) + BannerTipV2.ADAPTER.encodedSizeWithTag(118, awemeStructV2.banner_tip) + AwemeACLStructV2.ADAPTER.encodedSizeWithTag(119, awemeStructV2.acl_info) + AwemeAnchorStructV2.ADAPTER.encodedSizeWithTag(121, awemeStructV2.anchor_info) + VPAInfoStructV2.ADAPTER.encodedSizeWithTag(122, awemeStructV2.vpa_info) + CNYStructV2.ADAPTER.encodedSizeWithTag(123, awemeStructV2.cny_info) + ProtoAdapter.BOOL.encodedSizeWithTag(124, awemeStructV2.is_familiar) + ProtoAdapter.BOOL.encodedSizeWithTag(125, awemeStructV2.need_vs_entry) + WebcastRoomFeedCellStructV2.ADAPTER.encodedSizeWithTag(126, awemeStructV2.cell_room) + awemeStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AwemeStructV2 awemeStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStructV2.aweme_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeStructV2.desc);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, awemeStructV2.create_time);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 4, awemeStructV2.author);
            MusicStructV2.ADAPTER.encodeWithTag(protoWriter, 5, awemeStructV2.music);
            ChallengeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, awemeStructV2.cha_list);
            VideoStructV2.ADAPTER.encodeWithTag(protoWriter, 7, awemeStructV2.video);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, awemeStructV2.share_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, awemeStructV2.user_digged);
            AwemeStatisticsStructV2.ADAPTER.encodeWithTag(protoWriter, 10, awemeStructV2.statistics);
            AwemeStatusStructV2.ADAPTER.encodeWithTag(protoWriter, 11, awemeStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, awemeStructV2.extra);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, awemeStructV2.rate);
            TextExtraStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, awemeStructV2.text_extra);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 15, awemeStructV2.label_large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, awemeStructV2.label_thumb);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, awemeStructV2.is_top);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, awemeStructV2.label_top);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 19, awemeStructV2.share_info);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 20, awemeStructV2.label_origin_author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, awemeStructV2.distance);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 22, awemeStructV2.label_music_starter);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 23, awemeStructV2.label_private);
            AwemeLabelStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, awemeStructV2.video_labels);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, awemeStructV2.is_vr);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, awemeStructV2.landing_page);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, awemeStructV2.is_ads);
            PoiStructV2.ADAPTER.encodeWithTag(protoWriter, 28, awemeStructV2.poi_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 29, awemeStructV2.duration);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 30, awemeStructV2.aweme_type);
            AwemeGDAdStructV2.ADAPTER.encodeWithTag(protoWriter, 31, awemeStructV2.gd_ad);
            RelationDynamicLableStructV2.ADAPTER.encodeWithTag(protoWriter, 32, awemeStructV2.relation_label);
            RedPacketStructV2.ADAPTER.encodeWithTag(protoWriter, 33, awemeStructV2.red_packet);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 34, awemeStructV2.is_fantasy);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 35, awemeStructV2.cmt_swt);
            ImageInfoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 36, awemeStructV2.image_infos);
            AwemeRiskStructV2.ADAPTER.encodeWithTag(protoWriter, 37, awemeStructV2.risk_infos);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, awemeStructV2.is_relieve);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 39, awemeStructV2.label_friend);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 40, awemeStructV2.sort_label);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 41, awemeStructV2.position);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 42, awemeStructV2.uniqid_position);
            CommentStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 43, awemeStructV2.comment_list);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 44, awemeStructV2.author_user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 45, awemeStructV2.bodydance_score);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 46, awemeStructV2.geofencing);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 47, awemeStructV2.is_hash_tag);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 48, awemeStructV2.is_pgcshow);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 49, awemeStructV2.region);
            VideoTextStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 50, awemeStructV2.video_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 51, awemeStructV2.vr_type);
            SpecialStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 52, awemeStructV2.sp_sticker);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, awemeStructV2.ad_schedule);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 54, awemeStructV2.collect_stat);
            VideoTextStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 55, awemeStructV2.label_top_text);
            PromotionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 56, awemeStructV2.promotions);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 57, awemeStructV2.stickers);
            AwemeStructV2.ADAPTER.encodeWithTag(protoWriter, 58, awemeStructV2.forward_item);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 59, awemeStructV2.forward_comment_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 60, awemeStructV2.segment_longitudes);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 61, awemeStructV2.segment_latitudes);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 62, awemeStructV2.forward_item_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 63, awemeStructV2.group_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 64, awemeStructV2.pre_forward_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 65, awemeStructV2.prevent_download);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 66, awemeStructV2.nickname_position);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 67, awemeStructV2.challenge_position);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 68, awemeStructV2.item_comment_settings);
            DescendantStructV2.ADAPTER.encodeWithTag(protoWriter, 69, awemeStructV2.descendants);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 70, awemeStructV2.raw_ad_data);
            GameStructV2.ADAPTER.encodeWithTag(protoWriter, 71, awemeStructV2.game_info);
            MicroAppStructV2.ADAPTER.encodeWithTag(protoWriter, 72, awemeStructV2.micro_app_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 73, awemeStructV2.with_promotional_music);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 74, awemeStructV2.link_ad_data);
            XiguaTaskStructV2.ADAPTER.encodeWithTag(protoWriter, 75, awemeStructV2.xigua_task);
            CommerceActivityStructV2.ADAPTER.encodeWithTag(protoWriter, 76, awemeStructV2.gesture_red_packet);
            CommerceActivityStructV2.ADAPTER.encodeWithTag(protoWriter, 77, awemeStructV2.activity_pendant);
            NewFaceStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 78, awemeStructV2.sticker_detail);
            LongVideoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 79, awemeStructV2.long_video);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 80, awemeStructV2.item_duet);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 81, awemeStructV2.item_react);
            AwemeSearchStructV2.ADAPTER.encodeWithTag(protoWriter, 82, awemeStructV2.hot_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 83, awemeStructV2.star_atlas_order_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 84, awemeStructV2.label_music_starter_text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 85, awemeStructV2.without_watermark);
            PreloadStructV2.ADAPTER.encodeWithTag(protoWriter, 86, awemeStructV2.preload);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 87, awemeStructV2.star_recommend_tag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 88, awemeStructV2.ad_order_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 89, awemeStructV2.open_platform_name);
            AwemeStarAtlasStructV2.ADAPTER.encodeWithTag(protoWriter, 90, awemeStructV2.star_atlas_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 91, awemeStructV2.desc_language);
            AwemeFloatingCardStructV2.ADAPTER.encodeWithTag(protoWriter, 92, awemeStructV2.floating_card_content);
            InteractionStickerStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 93, awemeStructV2.interaction_stickers);
            OpenPlatformStructV2.ADAPTER.encodeWithTag(protoWriter, 94, awemeStructV2.open_platform_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 95, awemeStructV2.ad_link_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 96, awemeStructV2.take_down_reason);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 97, awemeStructV2.take_down_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 98, awemeStructV2.simple_promotions);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 99, awemeStructV2.misc_info);
            AwemePromotionOtherStructV2.ADAPTER.encodeWithTag(protoWriter, 100, awemeStructV2.promotion_other_info);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, BaseNotice.HASHTAG, awemeStructV2.origin_comment_ids);
            CommerceConfigDataV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 102, awemeStructV2.commerce_config_data);
            AwemeCommerceStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 103, awemeStructV2.commerce_sticker_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 104, awemeStructV2.enable_top_view);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 105, awemeStructV2.distribute_type);
            VideoControlV2.ADAPTER.encodeWithTag(protoWriter, 106, awemeStructV2.video_control);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 107, awemeStructV2.is_effect_designer);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 108, awemeStructV2.ad_aweme_source);
            AwemeControlStructV2.ADAPTER.encodeWithTag(protoWriter, 109, awemeStructV2.aweme_control);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, awemeStructV2.has_vs_entry);
            AnchorStructV2.ADAPTER.encodeWithTag(protoWriter, 111, awemeStructV2.anchor);
            RelationLabelStructV2.ADAPTER.encodeWithTag(protoWriter, 112, awemeStructV2.feed_relation_label);
            MixStructV2.ADAPTER.encodeWithTag(protoWriter, 113, awemeStructV2.mix_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 114, awemeStructV2.simple_shop_seeding);
            HotListStructV2.ADAPTER.encodeWithTag(protoWriter, 115, awemeStructV2.hot_list);
            AwemeCommerceStructV2.ADAPTER.encodeWithTag(protoWriter, 116, awemeStructV2.commerce_info);
            AwemeNationalTaskStructV2.ADAPTER.encodeWithTag(protoWriter, 117, awemeStructV2.national_task_info);
            BannerTipV2.ADAPTER.encodeWithTag(protoWriter, 118, awemeStructV2.banner_tip);
            AwemeACLStructV2.ADAPTER.encodeWithTag(protoWriter, 119, awemeStructV2.acl_info);
            AwemeAnchorStructV2.ADAPTER.encodeWithTag(protoWriter, 121, awemeStructV2.anchor_info);
            VPAInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 122, awemeStructV2.vpa_info);
            CNYStructV2.ADAPTER.encodeWithTag(protoWriter, 123, awemeStructV2.cny_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 124, awemeStructV2.is_familiar);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 125, awemeStructV2.need_vs_entry);
            WebcastRoomFeedCellStructV2.ADAPTER.encodeWithTag(protoWriter, 126, awemeStructV2.cell_room);
            protoWriter.writeBytes(awemeStructV2.unknownFields());
        }
    }

    public AwemeStructV2() {
    }

    public AwemeStructV2(String str, String str2, Long l, UserStructV2 userStructV2, MusicStructV2 musicStructV2, List<ChallengeStructV2> list, VideoStructV2 videoStructV2, String str3, Integer num, AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatusStructV2 awemeStatusStructV2, String str4, Integer num2, List<TextExtraStructV2> list2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3, UrlStructV2 urlStructV23, ShareStructV2 shareStructV2, UrlStructV2 urlStructV24, String str5, UrlStructV2 urlStructV25, UrlStructV2 urlStructV26, List<AwemeLabelStructV2> list3, Boolean bool, String str6, Boolean bool2, PoiStructV2 poiStructV2, Integer num4, Integer num5, AwemeGDAdStructV2 awemeGDAdStructV2, RelationDynamicLableStructV2 relationDynamicLableStructV2, RedPacketStructV2 redPacketStructV2, Boolean bool3, Boolean bool4, List<ImageInfoStructV2> list4, AwemeRiskStructV2 awemeRiskStructV2, Boolean bool5, UrlStructV2 urlStructV27, String str7, List<PositionStructV2> list5, List<PositionStructV2> list6, List<CommentStructV2> list7, Long l2, Integer num6, List<String> list8, Integer num7, Boolean bool6, String str8, List<VideoTextStructV2> list9, Integer num8, SpecialStickerStructV2 specialStickerStructV2, String str9, Integer num9, List<VideoTextStructV2> list10, List<PromotionStructV2> list11, String str10, AwemeStructV2 awemeStructV2, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool7, List<PositionStructV2> list12, List<PositionStructV2> list13, Integer num10, DescendantStructV2 descendantStructV2, String str17, GameStructV2 gameStructV2, MicroAppStructV2 microAppStructV2, Boolean bool8, String str18, XiguaTaskStructV2 xiguaTaskStructV2, CommerceActivityStructV2 commerceActivityStructV2, CommerceActivityStructV2 commerceActivityStructV22, NewFaceStickerStructV2 newFaceStickerStructV2, List<LongVideoStructV2> list14, Integer num11, Integer num12, AwemeSearchStructV2 awemeSearchStructV2, Long l3, String str19, Boolean bool9, PreloadStructV2 preloadStructV2, String str20, String str21, String str22, AwemeStarAtlasStructV2 awemeStarAtlasStructV2, String str23, AwemeFloatingCardStructV2 awemeFloatingCardStructV2, List<InteractionStickerStructV2> list15, OpenPlatformStructV2 openPlatformStructV2, Integer num13, Integer num14, String str24, String str25, String str26, AwemePromotionOtherStructV2 awemePromotionOtherStructV2, List<String> list16, List<CommerceConfigDataV2> list17, AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, Boolean bool10, Integer num15, VideoControlV2 videoControlV2, Integer num16, Integer num17, AwemeControlStructV2 awemeControlStructV2, Boolean bool11, AnchorStructV2 anchorStructV2, RelationLabelStructV2 relationLabelStructV2, MixStructV2 mixStructV2, String str27, HotListStructV2 hotListStructV2, AwemeCommerceStructV2 awemeCommerceStructV2, AwemeNationalTaskStructV2 awemeNationalTaskStructV2, BannerTipV2 bannerTipV2, AwemeACLStructV2 awemeACLStructV2, AwemeAnchorStructV2 awemeAnchorStructV2, VPAInfoStructV2 vPAInfoStructV2, CNYStructV2 cNYStructV2, Boolean bool12, Boolean bool13, WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2) {
        this(str, str2, l, userStructV2, musicStructV2, list, videoStructV2, str3, num, awemeStatisticsStructV2, awemeStatusStructV2, str4, num2, list2, urlStructV2, urlStructV22, num3, urlStructV23, shareStructV2, urlStructV24, str5, urlStructV25, urlStructV26, list3, bool, str6, bool2, poiStructV2, num4, num5, awemeGDAdStructV2, relationDynamicLableStructV2, redPacketStructV2, bool3, bool4, list4, awemeRiskStructV2, bool5, urlStructV27, str7, list5, list6, list7, l2, num6, list8, num7, bool6, str8, list9, num8, specialStickerStructV2, str9, num9, list10, list11, str10, awemeStructV2, str11, str12, str13, str14, str15, str16, bool7, list12, list13, num10, descendantStructV2, str17, gameStructV2, microAppStructV2, bool8, str18, xiguaTaskStructV2, commerceActivityStructV2, commerceActivityStructV22, newFaceStickerStructV2, list14, num11, num12, awemeSearchStructV2, l3, str19, bool9, preloadStructV2, str20, str21, str22, awemeStarAtlasStructV2, str23, awemeFloatingCardStructV2, list15, openPlatformStructV2, num13, num14, str24, str25, str26, awemePromotionOtherStructV2, list16, list17, awemeCommerceStickerStructV2, bool10, num15, videoControlV2, num16, num17, awemeControlStructV2, bool11, anchorStructV2, relationLabelStructV2, mixStructV2, str27, hotListStructV2, awemeCommerceStructV2, awemeNationalTaskStructV2, bannerTipV2, awemeACLStructV2, awemeAnchorStructV2, vPAInfoStructV2, cNYStructV2, bool12, bool13, webcastRoomFeedCellStructV2, ByteString.EMPTY);
    }

    public AwemeStructV2(String str, String str2, Long l, UserStructV2 userStructV2, MusicStructV2 musicStructV2, List<ChallengeStructV2> list, VideoStructV2 videoStructV2, String str3, Integer num, AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatusStructV2 awemeStatusStructV2, String str4, Integer num2, List<TextExtraStructV2> list2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3, UrlStructV2 urlStructV23, ShareStructV2 shareStructV2, UrlStructV2 urlStructV24, String str5, UrlStructV2 urlStructV25, UrlStructV2 urlStructV26, List<AwemeLabelStructV2> list3, Boolean bool, String str6, Boolean bool2, PoiStructV2 poiStructV2, Integer num4, Integer num5, AwemeGDAdStructV2 awemeGDAdStructV2, RelationDynamicLableStructV2 relationDynamicLableStructV2, RedPacketStructV2 redPacketStructV2, Boolean bool3, Boolean bool4, List<ImageInfoStructV2> list4, AwemeRiskStructV2 awemeRiskStructV2, Boolean bool5, UrlStructV2 urlStructV27, String str7, List<PositionStructV2> list5, List<PositionStructV2> list6, List<CommentStructV2> list7, Long l2, Integer num6, List<String> list8, Integer num7, Boolean bool6, String str8, List<VideoTextStructV2> list9, Integer num8, SpecialStickerStructV2 specialStickerStructV2, String str9, Integer num9, List<VideoTextStructV2> list10, List<PromotionStructV2> list11, String str10, AwemeStructV2 awemeStructV2, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool7, List<PositionStructV2> list12, List<PositionStructV2> list13, Integer num10, DescendantStructV2 descendantStructV2, String str17, GameStructV2 gameStructV2, MicroAppStructV2 microAppStructV2, Boolean bool8, String str18, XiguaTaskStructV2 xiguaTaskStructV2, CommerceActivityStructV2 commerceActivityStructV2, CommerceActivityStructV2 commerceActivityStructV22, NewFaceStickerStructV2 newFaceStickerStructV2, List<LongVideoStructV2> list14, Integer num11, Integer num12, AwemeSearchStructV2 awemeSearchStructV2, Long l3, String str19, Boolean bool9, PreloadStructV2 preloadStructV2, String str20, String str21, String str22, AwemeStarAtlasStructV2 awemeStarAtlasStructV2, String str23, AwemeFloatingCardStructV2 awemeFloatingCardStructV2, List<InteractionStickerStructV2> list15, OpenPlatformStructV2 openPlatformStructV2, Integer num13, Integer num14, String str24, String str25, String str26, AwemePromotionOtherStructV2 awemePromotionOtherStructV2, List<String> list16, List<CommerceConfigDataV2> list17, AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, Boolean bool10, Integer num15, VideoControlV2 videoControlV2, Integer num16, Integer num17, AwemeControlStructV2 awemeControlStructV2, Boolean bool11, AnchorStructV2 anchorStructV2, RelationLabelStructV2 relationLabelStructV2, MixStructV2 mixStructV2, String str27, HotListStructV2 hotListStructV2, AwemeCommerceStructV2 awemeCommerceStructV2, AwemeNationalTaskStructV2 awemeNationalTaskStructV2, BannerTipV2 bannerTipV2, AwemeACLStructV2 awemeACLStructV2, AwemeAnchorStructV2 awemeAnchorStructV2, VPAInfoStructV2 vPAInfoStructV2, CNYStructV2 cNYStructV2, Boolean bool12, Boolean bool13, WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = str;
        this.desc = str2;
        this.create_time = l;
        this.author = userStructV2;
        this.music = musicStructV2;
        List<ChallengeStructV2> list18 = list;
        this.cha_list = Internal.immutableCopyOf("cha_list", list);
        this.video = videoStructV2;
        this.share_url = str3;
        this.user_digged = num;
        this.statistics = awemeStatisticsStructV2;
        this.status = awemeStatusStructV2;
        this.extra = str4;
        this.rate = num2;
        this.text_extra = Internal.immutableCopyOf("text_extra", list2);
        this.label_large = urlStructV2;
        this.label_thumb = urlStructV22;
        this.is_top = num3;
        this.label_top = urlStructV23;
        this.share_info = shareStructV2;
        this.label_origin_author = urlStructV24;
        this.distance = str5;
        this.label_music_starter = urlStructV25;
        this.label_private = urlStructV26;
        this.video_labels = Internal.immutableCopyOf("video_labels", list3);
        this.is_vr = bool;
        this.landing_page = str6;
        this.is_ads = bool2;
        this.poi_info = poiStructV2;
        this.duration = num4;
        this.aweme_type = num5;
        this.gd_ad = awemeGDAdStructV2;
        this.relation_label = relationDynamicLableStructV2;
        this.red_packet = redPacketStructV2;
        this.is_fantasy = bool3;
        this.cmt_swt = bool4;
        this.image_infos = Internal.immutableCopyOf("image_infos", list4);
        this.risk_infos = awemeRiskStructV2;
        this.is_relieve = bool5;
        this.label_friend = urlStructV27;
        this.sort_label = str7;
        this.position = Internal.immutableCopyOf("position", list5);
        this.uniqid_position = Internal.immutableCopyOf("uniqid_position", list6);
        this.comment_list = Internal.immutableCopyOf("comment_list", list7);
        this.author_user_id = l2;
        this.bodydance_score = num6;
        this.geofencing = Internal.immutableCopyOf("geofencing", list8);
        this.is_hash_tag = num7;
        this.is_pgcshow = bool6;
        this.region = str8;
        this.video_text = Internal.immutableCopyOf("video_text", list9);
        this.vr_type = num8;
        this.sp_sticker = specialStickerStructV2;
        this.ad_schedule = str9;
        this.collect_stat = num9;
        this.label_top_text = Internal.immutableCopyOf("label_top_text", list10);
        this.promotions = Internal.immutableCopyOf("promotions", list11);
        this.stickers = str10;
        this.forward_item = awemeStructV2;
        this.forward_comment_id = str11;
        this.segment_longitudes = str12;
        this.segment_latitudes = str13;
        this.forward_item_id = str14;
        this.group_id = str15;
        this.pre_forward_id = str16;
        this.prevent_download = bool7;
        this.nickname_position = Internal.immutableCopyOf("nickname_position", list12);
        this.challenge_position = Internal.immutableCopyOf("challenge_position", list13);
        this.item_comment_settings = num10;
        this.descendants = descendantStructV2;
        this.raw_ad_data = str17;
        this.game_info = gameStructV2;
        this.micro_app_info = microAppStructV2;
        this.with_promotional_music = bool8;
        this.link_ad_data = str18;
        this.xigua_task = xiguaTaskStructV2;
        this.gesture_red_packet = commerceActivityStructV2;
        this.activity_pendant = commerceActivityStructV22;
        this.sticker_detail = newFaceStickerStructV2;
        this.long_video = Internal.immutableCopyOf("long_video", list14);
        this.item_duet = num11;
        this.item_react = num12;
        this.hot_info = awemeSearchStructV2;
        this.star_atlas_order_id = l3;
        this.label_music_starter_text = str19;
        this.without_watermark = bool9;
        this.preload = preloadStructV2;
        this.star_recommend_tag = str20;
        this.ad_order_id = str21;
        this.open_platform_name = str22;
        this.star_atlas_info = awemeStarAtlasStructV2;
        this.desc_language = str23;
        this.floating_card_content = awemeFloatingCardStructV2;
        this.interaction_stickers = Internal.immutableCopyOf("interaction_stickers", list15);
        this.open_platform_info = openPlatformStructV2;
        this.ad_link_type = num13;
        this.take_down_reason = num14;
        this.take_down_desc = str24;
        this.simple_promotions = str25;
        this.misc_info = str26;
        this.promotion_other_info = awemePromotionOtherStructV2;
        this.origin_comment_ids = Internal.immutableCopyOf("origin_comment_ids", list16);
        this.commerce_config_data = Internal.immutableCopyOf("commerce_config_data", list17);
        this.commerce_sticker_info = awemeCommerceStickerStructV2;
        this.enable_top_view = bool10;
        this.distribute_type = num15;
        this.video_control = videoControlV2;
        this.is_effect_designer = num16;
        this.ad_aweme_source = num17;
        this.aweme_control = awemeControlStructV2;
        this.has_vs_entry = bool11;
        this.anchor = anchorStructV2;
        this.feed_relation_label = relationLabelStructV2;
        this.mix_info = mixStructV2;
        this.simple_shop_seeding = str27;
        this.hot_list = hotListStructV2;
        this.commerce_info = awemeCommerceStructV2;
        this.national_task_info = awemeNationalTaskStructV2;
        this.banner_tip = bannerTipV2;
        this.acl_info = awemeACLStructV2;
        this.anchor_info = awemeAnchorStructV2;
        this.vpa_info = vPAInfoStructV2;
        this.cny_info = cNYStructV2;
        this.is_familiar = bool12;
        this.need_vs_entry = bool13;
        this.cell_room = webcastRoomFeedCellStructV2;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.desc = this.desc;
        builder.create_time = this.create_time;
        builder.author = this.author;
        builder.music = this.music;
        builder.cha_list = Internal.copyOf("cha_list", this.cha_list);
        builder.video = this.video;
        builder.share_url = this.share_url;
        builder.user_digged = this.user_digged;
        builder.statistics = this.statistics;
        builder.status = this.status;
        builder.extra = this.extra;
        builder.rate = this.rate;
        builder.text_extra = Internal.copyOf("text_extra", this.text_extra);
        builder.label_large = this.label_large;
        builder.label_thumb = this.label_thumb;
        builder.is_top = this.is_top;
        builder.label_top = this.label_top;
        builder.share_info = this.share_info;
        builder.label_origin_author = this.label_origin_author;
        builder.distance = this.distance;
        builder.label_music_starter = this.label_music_starter;
        builder.label_private = this.label_private;
        builder.video_labels = Internal.copyOf("video_labels", this.video_labels);
        builder.is_vr = this.is_vr;
        builder.landing_page = this.landing_page;
        builder.is_ads = this.is_ads;
        builder.poi_info = this.poi_info;
        builder.duration = this.duration;
        builder.aweme_type = this.aweme_type;
        builder.gd_ad = this.gd_ad;
        builder.relation_label = this.relation_label;
        builder.red_packet = this.red_packet;
        builder.is_fantasy = this.is_fantasy;
        builder.cmt_swt = this.cmt_swt;
        builder.image_infos = Internal.copyOf("image_infos", this.image_infos);
        builder.risk_infos = this.risk_infos;
        builder.is_relieve = this.is_relieve;
        builder.label_friend = this.label_friend;
        builder.sort_label = this.sort_label;
        builder.position = Internal.copyOf("position", this.position);
        builder.uniqid_position = Internal.copyOf("uniqid_position", this.uniqid_position);
        builder.comment_list = Internal.copyOf("comment_list", this.comment_list);
        builder.author_user_id = this.author_user_id;
        builder.bodydance_score = this.bodydance_score;
        builder.geofencing = Internal.copyOf("geofencing", this.geofencing);
        builder.is_hash_tag = this.is_hash_tag;
        builder.is_pgcshow = this.is_pgcshow;
        builder.region = this.region;
        builder.video_text = Internal.copyOf("video_text", this.video_text);
        builder.vr_type = this.vr_type;
        builder.sp_sticker = this.sp_sticker;
        builder.ad_schedule = this.ad_schedule;
        builder.collect_stat = this.collect_stat;
        builder.label_top_text = Internal.copyOf("label_top_text", this.label_top_text);
        builder.promotions = Internal.copyOf("promotions", this.promotions);
        builder.stickers = this.stickers;
        builder.forward_item = this.forward_item;
        builder.forward_comment_id = this.forward_comment_id;
        builder.segment_longitudes = this.segment_longitudes;
        builder.segment_latitudes = this.segment_latitudes;
        builder.forward_item_id = this.forward_item_id;
        builder.group_id = this.group_id;
        builder.pre_forward_id = this.pre_forward_id;
        builder.prevent_download = this.prevent_download;
        builder.nickname_position = Internal.copyOf("nickname_position", this.nickname_position);
        builder.challenge_position = Internal.copyOf("challenge_position", this.challenge_position);
        builder.item_comment_settings = this.item_comment_settings;
        builder.descendants = this.descendants;
        builder.raw_ad_data = this.raw_ad_data;
        builder.game_info = this.game_info;
        builder.micro_app_info = this.micro_app_info;
        builder.with_promotional_music = this.with_promotional_music;
        builder.link_ad_data = this.link_ad_data;
        builder.xigua_task = this.xigua_task;
        builder.gesture_red_packet = this.gesture_red_packet;
        builder.activity_pendant = this.activity_pendant;
        builder.sticker_detail = this.sticker_detail;
        builder.long_video = Internal.copyOf("long_video", this.long_video);
        builder.item_duet = this.item_duet;
        builder.item_react = this.item_react;
        builder.hot_info = this.hot_info;
        builder.star_atlas_order_id = this.star_atlas_order_id;
        builder.label_music_starter_text = this.label_music_starter_text;
        builder.without_watermark = this.without_watermark;
        builder.preload = this.preload;
        builder.star_recommend_tag = this.star_recommend_tag;
        builder.ad_order_id = this.ad_order_id;
        builder.open_platform_name = this.open_platform_name;
        builder.star_atlas_info = this.star_atlas_info;
        builder.desc_language = this.desc_language;
        builder.floating_card_content = this.floating_card_content;
        builder.interaction_stickers = Internal.copyOf("interaction_stickers", this.interaction_stickers);
        builder.open_platform_info = this.open_platform_info;
        builder.ad_link_type = this.ad_link_type;
        builder.take_down_reason = this.take_down_reason;
        builder.take_down_desc = this.take_down_desc;
        builder.simple_promotions = this.simple_promotions;
        builder.misc_info = this.misc_info;
        builder.promotion_other_info = this.promotion_other_info;
        builder.origin_comment_ids = Internal.copyOf("origin_comment_ids", this.origin_comment_ids);
        builder.commerce_config_data = Internal.copyOf("commerce_config_data", this.commerce_config_data);
        builder.commerce_sticker_info = this.commerce_sticker_info;
        builder.enable_top_view = this.enable_top_view;
        builder.distribute_type = this.distribute_type;
        builder.video_control = this.video_control;
        builder.is_effect_designer = this.is_effect_designer;
        builder.ad_aweme_source = this.ad_aweme_source;
        builder.aweme_control = this.aweme_control;
        builder.has_vs_entry = this.has_vs_entry;
        builder.anchor = this.anchor;
        builder.feed_relation_label = this.feed_relation_label;
        builder.mix_info = this.mix_info;
        builder.simple_shop_seeding = this.simple_shop_seeding;
        builder.hot_list = this.hot_list;
        builder.commerce_info = this.commerce_info;
        builder.national_task_info = this.national_task_info;
        builder.banner_tip = this.banner_tip;
        builder.acl_info = this.acl_info;
        builder.anchor_info = this.anchor_info;
        builder.vpa_info = this.vpa_info;
        builder.cny_info = this.cny_info;
        builder.is_familiar = this.is_familiar;
        builder.need_vs_entry = this.need_vs_entry;
        builder.cell_room = this.cell_room;
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
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        int i72;
        int i73;
        int i74;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        int i86;
        int i87;
        int i88;
        int i89;
        int i90;
        int i91;
        int i92;
        int i93;
        int i94;
        int i95;
        int i96;
        int i97;
        int i98;
        int i99;
        int i100;
        int i101;
        int i102;
        int i103;
        int i104;
        int i105;
        int i106;
        int i107;
        int i108 = this.hashCode;
        if (i108 != 0) {
            return i108;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i109 = 0;
        if (this.aweme_id != null) {
            i = this.aweme_id.hashCode();
        } else {
            i = 0;
        }
        int i110 = (hashCode + i) * 37;
        if (this.desc != null) {
            i2 = this.desc.hashCode();
        } else {
            i2 = 0;
        }
        int i111 = (i110 + i2) * 37;
        if (this.create_time != null) {
            i3 = this.create_time.hashCode();
        } else {
            i3 = 0;
        }
        int i112 = (i111 + i3) * 37;
        if (this.author != null) {
            i4 = this.author.hashCode();
        } else {
            i4 = 0;
        }
        int i113 = (i112 + i4) * 37;
        if (this.music != null) {
            i5 = this.music.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((i113 + i5) * 37) + this.cha_list.hashCode()) * 37;
        if (this.video != null) {
            i6 = this.video.hashCode();
        } else {
            i6 = 0;
        }
        int i114 = (hashCode2 + i6) * 37;
        if (this.share_url != null) {
            i7 = this.share_url.hashCode();
        } else {
            i7 = 0;
        }
        int i115 = (i114 + i7) * 37;
        if (this.user_digged != null) {
            i8 = this.user_digged.hashCode();
        } else {
            i8 = 0;
        }
        int i116 = (i115 + i8) * 37;
        if (this.statistics != null) {
            i9 = this.statistics.hashCode();
        } else {
            i9 = 0;
        }
        int i117 = (i116 + i9) * 37;
        if (this.status != null) {
            i10 = this.status.hashCode();
        } else {
            i10 = 0;
        }
        int i118 = (i117 + i10) * 37;
        if (this.extra != null) {
            i11 = this.extra.hashCode();
        } else {
            i11 = 0;
        }
        int i119 = (i118 + i11) * 37;
        if (this.rate != null) {
            i12 = this.rate.hashCode();
        } else {
            i12 = 0;
        }
        int hashCode3 = (((i119 + i12) * 37) + this.text_extra.hashCode()) * 37;
        if (this.label_large != null) {
            i13 = this.label_large.hashCode();
        } else {
            i13 = 0;
        }
        int i120 = (hashCode3 + i13) * 37;
        if (this.label_thumb != null) {
            i14 = this.label_thumb.hashCode();
        } else {
            i14 = 0;
        }
        int i121 = (i120 + i14) * 37;
        if (this.is_top != null) {
            i15 = this.is_top.hashCode();
        } else {
            i15 = 0;
        }
        int i122 = (i121 + i15) * 37;
        if (this.label_top != null) {
            i16 = this.label_top.hashCode();
        } else {
            i16 = 0;
        }
        int i123 = (i122 + i16) * 37;
        if (this.share_info != null) {
            i17 = this.share_info.hashCode();
        } else {
            i17 = 0;
        }
        int i124 = (i123 + i17) * 37;
        if (this.label_origin_author != null) {
            i18 = this.label_origin_author.hashCode();
        } else {
            i18 = 0;
        }
        int i125 = (i124 + i18) * 37;
        if (this.distance != null) {
            i19 = this.distance.hashCode();
        } else {
            i19 = 0;
        }
        int i126 = (i125 + i19) * 37;
        if (this.label_music_starter != null) {
            i20 = this.label_music_starter.hashCode();
        } else {
            i20 = 0;
        }
        int i127 = (i126 + i20) * 37;
        if (this.label_private != null) {
            i21 = this.label_private.hashCode();
        } else {
            i21 = 0;
        }
        int hashCode4 = (((i127 + i21) * 37) + this.video_labels.hashCode()) * 37;
        if (this.is_vr != null) {
            i22 = this.is_vr.hashCode();
        } else {
            i22 = 0;
        }
        int i128 = (hashCode4 + i22) * 37;
        if (this.landing_page != null) {
            i23 = this.landing_page.hashCode();
        } else {
            i23 = 0;
        }
        int i129 = (i128 + i23) * 37;
        if (this.is_ads != null) {
            i24 = this.is_ads.hashCode();
        } else {
            i24 = 0;
        }
        int i130 = (i129 + i24) * 37;
        if (this.poi_info != null) {
            i25 = this.poi_info.hashCode();
        } else {
            i25 = 0;
        }
        int i131 = (i130 + i25) * 37;
        if (this.duration != null) {
            i26 = this.duration.hashCode();
        } else {
            i26 = 0;
        }
        int i132 = (i131 + i26) * 37;
        if (this.aweme_type != null) {
            i27 = this.aweme_type.hashCode();
        } else {
            i27 = 0;
        }
        int i133 = (i132 + i27) * 37;
        if (this.gd_ad != null) {
            i28 = this.gd_ad.hashCode();
        } else {
            i28 = 0;
        }
        int i134 = (i133 + i28) * 37;
        if (this.relation_label != null) {
            i29 = this.relation_label.hashCode();
        } else {
            i29 = 0;
        }
        int i135 = (i134 + i29) * 37;
        if (this.red_packet != null) {
            i30 = this.red_packet.hashCode();
        } else {
            i30 = 0;
        }
        int i136 = (i135 + i30) * 37;
        if (this.is_fantasy != null) {
            i31 = this.is_fantasy.hashCode();
        } else {
            i31 = 0;
        }
        int i137 = (i136 + i31) * 37;
        if (this.cmt_swt != null) {
            i32 = this.cmt_swt.hashCode();
        } else {
            i32 = 0;
        }
        int hashCode5 = (((i137 + i32) * 37) + this.image_infos.hashCode()) * 37;
        if (this.risk_infos != null) {
            i33 = this.risk_infos.hashCode();
        } else {
            i33 = 0;
        }
        int i138 = (hashCode5 + i33) * 37;
        if (this.is_relieve != null) {
            i34 = this.is_relieve.hashCode();
        } else {
            i34 = 0;
        }
        int i139 = (i138 + i34) * 37;
        if (this.label_friend != null) {
            i35 = this.label_friend.hashCode();
        } else {
            i35 = 0;
        }
        int i140 = (i139 + i35) * 37;
        if (this.sort_label != null) {
            i36 = this.sort_label.hashCode();
        } else {
            i36 = 0;
        }
        int hashCode6 = (((((((i140 + i36) * 37) + this.position.hashCode()) * 37) + this.uniqid_position.hashCode()) * 37) + this.comment_list.hashCode()) * 37;
        if (this.author_user_id != null) {
            i37 = this.author_user_id.hashCode();
        } else {
            i37 = 0;
        }
        int i141 = (hashCode6 + i37) * 37;
        if (this.bodydance_score != null) {
            i38 = this.bodydance_score.hashCode();
        } else {
            i38 = 0;
        }
        int hashCode7 = (((i141 + i38) * 37) + this.geofencing.hashCode()) * 37;
        if (this.is_hash_tag != null) {
            i39 = this.is_hash_tag.hashCode();
        } else {
            i39 = 0;
        }
        int i142 = (hashCode7 + i39) * 37;
        if (this.is_pgcshow != null) {
            i40 = this.is_pgcshow.hashCode();
        } else {
            i40 = 0;
        }
        int i143 = (i142 + i40) * 37;
        if (this.region != null) {
            i41 = this.region.hashCode();
        } else {
            i41 = 0;
        }
        int hashCode8 = (((i143 + i41) * 37) + this.video_text.hashCode()) * 37;
        if (this.vr_type != null) {
            i42 = this.vr_type.hashCode();
        } else {
            i42 = 0;
        }
        int i144 = (hashCode8 + i42) * 37;
        if (this.sp_sticker != null) {
            i43 = this.sp_sticker.hashCode();
        } else {
            i43 = 0;
        }
        int i145 = (i144 + i43) * 37;
        if (this.ad_schedule != null) {
            i44 = this.ad_schedule.hashCode();
        } else {
            i44 = 0;
        }
        int i146 = (i145 + i44) * 37;
        if (this.collect_stat != null) {
            i45 = this.collect_stat.hashCode();
        } else {
            i45 = 0;
        }
        int hashCode9 = (((((i146 + i45) * 37) + this.label_top_text.hashCode()) * 37) + this.promotions.hashCode()) * 37;
        if (this.stickers != null) {
            i46 = this.stickers.hashCode();
        } else {
            i46 = 0;
        }
        int i147 = (hashCode9 + i46) * 37;
        if (this.forward_item != null) {
            i47 = this.forward_item.hashCode();
        } else {
            i47 = 0;
        }
        int i148 = (i147 + i47) * 37;
        if (this.forward_comment_id != null) {
            i48 = this.forward_comment_id.hashCode();
        } else {
            i48 = 0;
        }
        int i149 = (i148 + i48) * 37;
        if (this.segment_longitudes != null) {
            i49 = this.segment_longitudes.hashCode();
        } else {
            i49 = 0;
        }
        int i150 = (i149 + i49) * 37;
        if (this.segment_latitudes != null) {
            i50 = this.segment_latitudes.hashCode();
        } else {
            i50 = 0;
        }
        int i151 = (i150 + i50) * 37;
        if (this.forward_item_id != null) {
            i51 = this.forward_item_id.hashCode();
        } else {
            i51 = 0;
        }
        int i152 = (i151 + i51) * 37;
        if (this.group_id != null) {
            i52 = this.group_id.hashCode();
        } else {
            i52 = 0;
        }
        int i153 = (i152 + i52) * 37;
        if (this.pre_forward_id != null) {
            i53 = this.pre_forward_id.hashCode();
        } else {
            i53 = 0;
        }
        int i154 = (i153 + i53) * 37;
        if (this.prevent_download != null) {
            i54 = this.prevent_download.hashCode();
        } else {
            i54 = 0;
        }
        int hashCode10 = (((((i154 + i54) * 37) + this.nickname_position.hashCode()) * 37) + this.challenge_position.hashCode()) * 37;
        if (this.item_comment_settings != null) {
            i55 = this.item_comment_settings.hashCode();
        } else {
            i55 = 0;
        }
        int i155 = (hashCode10 + i55) * 37;
        if (this.descendants != null) {
            i56 = this.descendants.hashCode();
        } else {
            i56 = 0;
        }
        int i156 = (i155 + i56) * 37;
        if (this.raw_ad_data != null) {
            i57 = this.raw_ad_data.hashCode();
        } else {
            i57 = 0;
        }
        int i157 = (i156 + i57) * 37;
        if (this.game_info != null) {
            i58 = this.game_info.hashCode();
        } else {
            i58 = 0;
        }
        int i158 = (i157 + i58) * 37;
        if (this.micro_app_info != null) {
            i59 = this.micro_app_info.hashCode();
        } else {
            i59 = 0;
        }
        int i159 = (i158 + i59) * 37;
        if (this.with_promotional_music != null) {
            i60 = this.with_promotional_music.hashCode();
        } else {
            i60 = 0;
        }
        int i160 = (i159 + i60) * 37;
        if (this.link_ad_data != null) {
            i61 = this.link_ad_data.hashCode();
        } else {
            i61 = 0;
        }
        int i161 = (i160 + i61) * 37;
        if (this.xigua_task != null) {
            i62 = this.xigua_task.hashCode();
        } else {
            i62 = 0;
        }
        int i162 = (i161 + i62) * 37;
        if (this.gesture_red_packet != null) {
            i63 = this.gesture_red_packet.hashCode();
        } else {
            i63 = 0;
        }
        int i163 = (i162 + i63) * 37;
        if (this.activity_pendant != null) {
            i64 = this.activity_pendant.hashCode();
        } else {
            i64 = 0;
        }
        int i164 = (i163 + i64) * 37;
        if (this.sticker_detail != null) {
            i65 = this.sticker_detail.hashCode();
        } else {
            i65 = 0;
        }
        int hashCode11 = (((i164 + i65) * 37) + this.long_video.hashCode()) * 37;
        if (this.item_duet != null) {
            i66 = this.item_duet.hashCode();
        } else {
            i66 = 0;
        }
        int i165 = (hashCode11 + i66) * 37;
        if (this.item_react != null) {
            i67 = this.item_react.hashCode();
        } else {
            i67 = 0;
        }
        int i166 = (i165 + i67) * 37;
        if (this.hot_info != null) {
            i68 = this.hot_info.hashCode();
        } else {
            i68 = 0;
        }
        int i167 = (i166 + i68) * 37;
        if (this.star_atlas_order_id != null) {
            i69 = this.star_atlas_order_id.hashCode();
        } else {
            i69 = 0;
        }
        int i168 = (i167 + i69) * 37;
        if (this.label_music_starter_text != null) {
            i70 = this.label_music_starter_text.hashCode();
        } else {
            i70 = 0;
        }
        int i169 = (i168 + i70) * 37;
        if (this.without_watermark != null) {
            i71 = this.without_watermark.hashCode();
        } else {
            i71 = 0;
        }
        int i170 = (i169 + i71) * 37;
        if (this.preload != null) {
            i72 = this.preload.hashCode();
        } else {
            i72 = 0;
        }
        int i171 = (i170 + i72) * 37;
        if (this.star_recommend_tag != null) {
            i73 = this.star_recommend_tag.hashCode();
        } else {
            i73 = 0;
        }
        int i172 = (i171 + i73) * 37;
        if (this.ad_order_id != null) {
            i74 = this.ad_order_id.hashCode();
        } else {
            i74 = 0;
        }
        int i173 = (i172 + i74) * 37;
        if (this.open_platform_name != null) {
            i75 = this.open_platform_name.hashCode();
        } else {
            i75 = 0;
        }
        int i174 = (i173 + i75) * 37;
        if (this.star_atlas_info != null) {
            i76 = this.star_atlas_info.hashCode();
        } else {
            i76 = 0;
        }
        int i175 = (i174 + i76) * 37;
        if (this.desc_language != null) {
            i77 = this.desc_language.hashCode();
        } else {
            i77 = 0;
        }
        int i176 = (i175 + i77) * 37;
        if (this.floating_card_content != null) {
            i78 = this.floating_card_content.hashCode();
        } else {
            i78 = 0;
        }
        int hashCode12 = (((i176 + i78) * 37) + this.interaction_stickers.hashCode()) * 37;
        if (this.open_platform_info != null) {
            i79 = this.open_platform_info.hashCode();
        } else {
            i79 = 0;
        }
        int i177 = (hashCode12 + i79) * 37;
        if (this.ad_link_type != null) {
            i80 = this.ad_link_type.hashCode();
        } else {
            i80 = 0;
        }
        int i178 = (i177 + i80) * 37;
        if (this.take_down_reason != null) {
            i81 = this.take_down_reason.hashCode();
        } else {
            i81 = 0;
        }
        int i179 = (i178 + i81) * 37;
        if (this.take_down_desc != null) {
            i82 = this.take_down_desc.hashCode();
        } else {
            i82 = 0;
        }
        int i180 = (i179 + i82) * 37;
        if (this.simple_promotions != null) {
            i83 = this.simple_promotions.hashCode();
        } else {
            i83 = 0;
        }
        int i181 = (i180 + i83) * 37;
        if (this.misc_info != null) {
            i84 = this.misc_info.hashCode();
        } else {
            i84 = 0;
        }
        int i182 = (i181 + i84) * 37;
        if (this.promotion_other_info != null) {
            i85 = this.promotion_other_info.hashCode();
        } else {
            i85 = 0;
        }
        int hashCode13 = (((((i182 + i85) * 37) + this.origin_comment_ids.hashCode()) * 37) + this.commerce_config_data.hashCode()) * 37;
        if (this.commerce_sticker_info != null) {
            i86 = this.commerce_sticker_info.hashCode();
        } else {
            i86 = 0;
        }
        int i183 = (hashCode13 + i86) * 37;
        if (this.enable_top_view != null) {
            i87 = this.enable_top_view.hashCode();
        } else {
            i87 = 0;
        }
        int i184 = (i183 + i87) * 37;
        if (this.distribute_type != null) {
            i88 = this.distribute_type.hashCode();
        } else {
            i88 = 0;
        }
        int i185 = (i184 + i88) * 37;
        if (this.video_control != null) {
            i89 = this.video_control.hashCode();
        } else {
            i89 = 0;
        }
        int i186 = (i185 + i89) * 37;
        if (this.is_effect_designer != null) {
            i90 = this.is_effect_designer.hashCode();
        } else {
            i90 = 0;
        }
        int i187 = (i186 + i90) * 37;
        if (this.ad_aweme_source != null) {
            i91 = this.ad_aweme_source.hashCode();
        } else {
            i91 = 0;
        }
        int i188 = (i187 + i91) * 37;
        if (this.aweme_control != null) {
            i92 = this.aweme_control.hashCode();
        } else {
            i92 = 0;
        }
        int i189 = (i188 + i92) * 37;
        if (this.has_vs_entry != null) {
            i93 = this.has_vs_entry.hashCode();
        } else {
            i93 = 0;
        }
        int i190 = (i189 + i93) * 37;
        if (this.anchor != null) {
            i94 = this.anchor.hashCode();
        } else {
            i94 = 0;
        }
        int i191 = (i190 + i94) * 37;
        if (this.feed_relation_label != null) {
            i95 = this.feed_relation_label.hashCode();
        } else {
            i95 = 0;
        }
        int i192 = (i191 + i95) * 37;
        if (this.mix_info != null) {
            i96 = this.mix_info.hashCode();
        } else {
            i96 = 0;
        }
        int i193 = (i192 + i96) * 37;
        if (this.simple_shop_seeding != null) {
            i97 = this.simple_shop_seeding.hashCode();
        } else {
            i97 = 0;
        }
        int i194 = (i193 + i97) * 37;
        if (this.hot_list != null) {
            i98 = this.hot_list.hashCode();
        } else {
            i98 = 0;
        }
        int i195 = (i194 + i98) * 37;
        if (this.commerce_info != null) {
            i99 = this.commerce_info.hashCode();
        } else {
            i99 = 0;
        }
        int i196 = (i195 + i99) * 37;
        if (this.national_task_info != null) {
            i100 = this.national_task_info.hashCode();
        } else {
            i100 = 0;
        }
        int i197 = (i196 + i100) * 37;
        if (this.banner_tip != null) {
            i101 = this.banner_tip.hashCode();
        } else {
            i101 = 0;
        }
        int i198 = (i197 + i101) * 37;
        if (this.acl_info != null) {
            i102 = this.acl_info.hashCode();
        } else {
            i102 = 0;
        }
        int i199 = (i198 + i102) * 37;
        if (this.anchor_info != null) {
            i103 = this.anchor_info.hashCode();
        } else {
            i103 = 0;
        }
        int i200 = (i199 + i103) * 37;
        if (this.vpa_info != null) {
            i104 = this.vpa_info.hashCode();
        } else {
            i104 = 0;
        }
        int i201 = (i200 + i104) * 37;
        if (this.cny_info != null) {
            i105 = this.cny_info.hashCode();
        } else {
            i105 = 0;
        }
        int i202 = (i201 + i105) * 37;
        if (this.is_familiar != null) {
            i106 = this.is_familiar.hashCode();
        } else {
            i106 = 0;
        }
        int i203 = (i202 + i106) * 37;
        if (this.need_vs_entry != null) {
            i107 = this.need_vs_entry.hashCode();
        } else {
            i107 = 0;
        }
        int i204 = (i203 + i107) * 37;
        if (this.cell_room != null) {
            i109 = this.cell_room.hashCode();
        }
        int i205 = i204 + i109;
        this.hashCode = i205;
        return i205;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.author != null) {
            sb.append(", author=");
            sb.append(this.author);
        }
        if (this.music != null) {
            sb.append(", music=");
            sb.append(this.music);
        }
        if (!this.cha_list.isEmpty()) {
            sb.append(", cha_list=");
            sb.append(this.cha_list);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (this.share_url != null) {
            sb.append(", share_url=");
            sb.append(this.share_url);
        }
        if (this.user_digged != null) {
            sb.append(", user_digged=");
            sb.append(this.user_digged);
        }
        if (this.statistics != null) {
            sb.append(", statistics=");
            sb.append(this.statistics);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.rate != null) {
            sb.append(", rate=");
            sb.append(this.rate);
        }
        if (!this.text_extra.isEmpty()) {
            sb.append(", text_extra=");
            sb.append(this.text_extra);
        }
        if (this.label_large != null) {
            sb.append(", label_large=");
            sb.append(this.label_large);
        }
        if (this.label_thumb != null) {
            sb.append(", label_thumb=");
            sb.append(this.label_thumb);
        }
        if (this.is_top != null) {
            sb.append(", is_top=");
            sb.append(this.is_top);
        }
        if (this.label_top != null) {
            sb.append(", label_top=");
            sb.append(this.label_top);
        }
        if (this.share_info != null) {
            sb.append(", share_info=");
            sb.append(this.share_info);
        }
        if (this.label_origin_author != null) {
            sb.append(", label_origin_author=");
            sb.append(this.label_origin_author);
        }
        if (this.distance != null) {
            sb.append(", distance=");
            sb.append(this.distance);
        }
        if (this.label_music_starter != null) {
            sb.append(", label_music_starter=");
            sb.append(this.label_music_starter);
        }
        if (this.label_private != null) {
            sb.append(", label_private=");
            sb.append(this.label_private);
        }
        if (!this.video_labels.isEmpty()) {
            sb.append(", video_labels=");
            sb.append(this.video_labels);
        }
        if (this.is_vr != null) {
            sb.append(", is_vr=");
            sb.append(this.is_vr);
        }
        if (this.landing_page != null) {
            sb.append(", landing_page=");
            sb.append(this.landing_page);
        }
        if (this.is_ads != null) {
            sb.append(", is_ads=");
            sb.append(this.is_ads);
        }
        if (this.poi_info != null) {
            sb.append(", poi_info=");
            sb.append(this.poi_info);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.aweme_type != null) {
            sb.append(", aweme_type=");
            sb.append(this.aweme_type);
        }
        if (this.gd_ad != null) {
            sb.append(", gd_ad=");
            sb.append(this.gd_ad);
        }
        if (this.relation_label != null) {
            sb.append(", relation_label=");
            sb.append(this.relation_label);
        }
        if (this.red_packet != null) {
            sb.append(", red_packet=");
            sb.append(this.red_packet);
        }
        if (this.is_fantasy != null) {
            sb.append(", is_fantasy=");
            sb.append(this.is_fantasy);
        }
        if (this.cmt_swt != null) {
            sb.append(", cmt_swt=");
            sb.append(this.cmt_swt);
        }
        if (!this.image_infos.isEmpty()) {
            sb.append(", image_infos=");
            sb.append(this.image_infos);
        }
        if (this.risk_infos != null) {
            sb.append(", risk_infos=");
            sb.append(this.risk_infos);
        }
        if (this.is_relieve != null) {
            sb.append(", is_relieve=");
            sb.append(this.is_relieve);
        }
        if (this.label_friend != null) {
            sb.append(", label_friend=");
            sb.append(this.label_friend);
        }
        if (this.sort_label != null) {
            sb.append(", sort_label=");
            sb.append(this.sort_label);
        }
        if (!this.position.isEmpty()) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (!this.uniqid_position.isEmpty()) {
            sb.append(", uniqid_position=");
            sb.append(this.uniqid_position);
        }
        if (!this.comment_list.isEmpty()) {
            sb.append(", comment_list=");
            sb.append(this.comment_list);
        }
        if (this.author_user_id != null) {
            sb.append(", author_user_id=");
            sb.append(this.author_user_id);
        }
        if (this.bodydance_score != null) {
            sb.append(", bodydance_score=");
            sb.append(this.bodydance_score);
        }
        if (!this.geofencing.isEmpty()) {
            sb.append(", geofencing=");
            sb.append(this.geofencing);
        }
        if (this.is_hash_tag != null) {
            sb.append(", is_hash_tag=");
            sb.append(this.is_hash_tag);
        }
        if (this.is_pgcshow != null) {
            sb.append(", is_pgcshow=");
            sb.append(this.is_pgcshow);
        }
        if (this.region != null) {
            sb.append(", region=");
            sb.append(this.region);
        }
        if (!this.video_text.isEmpty()) {
            sb.append(", video_text=");
            sb.append(this.video_text);
        }
        if (this.vr_type != null) {
            sb.append(", vr_type=");
            sb.append(this.vr_type);
        }
        if (this.sp_sticker != null) {
            sb.append(", sp_sticker=");
            sb.append(this.sp_sticker);
        }
        if (this.ad_schedule != null) {
            sb.append(", ad_schedule=");
            sb.append(this.ad_schedule);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=");
            sb.append(this.collect_stat);
        }
        if (!this.label_top_text.isEmpty()) {
            sb.append(", label_top_text=");
            sb.append(this.label_top_text);
        }
        if (!this.promotions.isEmpty()) {
            sb.append(", promotions=");
            sb.append(this.promotions);
        }
        if (this.stickers != null) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        if (this.forward_item != null) {
            sb.append(", forward_item=");
            sb.append(this.forward_item);
        }
        if (this.forward_comment_id != null) {
            sb.append(", forward_comment_id=");
            sb.append(this.forward_comment_id);
        }
        if (this.segment_longitudes != null) {
            sb.append(", segment_longitudes=");
            sb.append(this.segment_longitudes);
        }
        if (this.segment_latitudes != null) {
            sb.append(", segment_latitudes=");
            sb.append(this.segment_latitudes);
        }
        if (this.forward_item_id != null) {
            sb.append(", forward_item_id=");
            sb.append(this.forward_item_id);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.pre_forward_id != null) {
            sb.append(", pre_forward_id=");
            sb.append(this.pre_forward_id);
        }
        if (this.prevent_download != null) {
            sb.append(", prevent_download=");
            sb.append(this.prevent_download);
        }
        if (!this.nickname_position.isEmpty()) {
            sb.append(", nickname_position=");
            sb.append(this.nickname_position);
        }
        if (!this.challenge_position.isEmpty()) {
            sb.append(", challenge_position=");
            sb.append(this.challenge_position);
        }
        if (this.item_comment_settings != null) {
            sb.append(", item_comment_settings=");
            sb.append(this.item_comment_settings);
        }
        if (this.descendants != null) {
            sb.append(", descendants=");
            sb.append(this.descendants);
        }
        if (this.raw_ad_data != null) {
            sb.append(", raw_ad_data=");
            sb.append(this.raw_ad_data);
        }
        if (this.game_info != null) {
            sb.append(", game_info=");
            sb.append(this.game_info);
        }
        if (this.micro_app_info != null) {
            sb.append(", micro_app_info=");
            sb.append(this.micro_app_info);
        }
        if (this.with_promotional_music != null) {
            sb.append(", with_promotional_music=");
            sb.append(this.with_promotional_music);
        }
        if (this.link_ad_data != null) {
            sb.append(", link_ad_data=");
            sb.append(this.link_ad_data);
        }
        if (this.xigua_task != null) {
            sb.append(", xigua_task=");
            sb.append(this.xigua_task);
        }
        if (this.gesture_red_packet != null) {
            sb.append(", gesture_red_packet=");
            sb.append(this.gesture_red_packet);
        }
        if (this.activity_pendant != null) {
            sb.append(", activity_pendant=");
            sb.append(this.activity_pendant);
        }
        if (this.sticker_detail != null) {
            sb.append(", sticker_detail=");
            sb.append(this.sticker_detail);
        }
        if (!this.long_video.isEmpty()) {
            sb.append(", long_video=");
            sb.append(this.long_video);
        }
        if (this.item_duet != null) {
            sb.append(", item_duet=");
            sb.append(this.item_duet);
        }
        if (this.item_react != null) {
            sb.append(", item_react=");
            sb.append(this.item_react);
        }
        if (this.hot_info != null) {
            sb.append(", hot_info=");
            sb.append(this.hot_info);
        }
        if (this.star_atlas_order_id != null) {
            sb.append(", star_atlas_order_id=");
            sb.append(this.star_atlas_order_id);
        }
        if (this.label_music_starter_text != null) {
            sb.append(", label_music_starter_text=");
            sb.append(this.label_music_starter_text);
        }
        if (this.without_watermark != null) {
            sb.append(", without_watermark=");
            sb.append(this.without_watermark);
        }
        if (this.preload != null) {
            sb.append(", preload=");
            sb.append(this.preload);
        }
        if (this.star_recommend_tag != null) {
            sb.append(", star_recommend_tag=");
            sb.append(this.star_recommend_tag);
        }
        if (this.ad_order_id != null) {
            sb.append(", ad_order_id=");
            sb.append(this.ad_order_id);
        }
        if (this.open_platform_name != null) {
            sb.append(", open_platform_name=");
            sb.append(this.open_platform_name);
        }
        if (this.star_atlas_info != null) {
            sb.append(", star_atlas_info=");
            sb.append(this.star_atlas_info);
        }
        if (this.desc_language != null) {
            sb.append(", desc_language=");
            sb.append(this.desc_language);
        }
        if (this.floating_card_content != null) {
            sb.append(", floating_card_content=");
            sb.append(this.floating_card_content);
        }
        if (!this.interaction_stickers.isEmpty()) {
            sb.append(", interaction_stickers=");
            sb.append(this.interaction_stickers);
        }
        if (this.open_platform_info != null) {
            sb.append(", open_platform_info=");
            sb.append(this.open_platform_info);
        }
        if (this.ad_link_type != null) {
            sb.append(", ad_link_type=");
            sb.append(this.ad_link_type);
        }
        if (this.take_down_reason != null) {
            sb.append(", take_down_reason=");
            sb.append(this.take_down_reason);
        }
        if (this.take_down_desc != null) {
            sb.append(", take_down_desc=");
            sb.append(this.take_down_desc);
        }
        if (this.simple_promotions != null) {
            sb.append(", simple_promotions=");
            sb.append(this.simple_promotions);
        }
        if (this.misc_info != null) {
            sb.append(", misc_info=");
            sb.append(this.misc_info);
        }
        if (this.promotion_other_info != null) {
            sb.append(", promotion_other_info=");
            sb.append(this.promotion_other_info);
        }
        if (!this.origin_comment_ids.isEmpty()) {
            sb.append(", origin_comment_ids=");
            sb.append(this.origin_comment_ids);
        }
        if (!this.commerce_config_data.isEmpty()) {
            sb.append(", commerce_config_data=");
            sb.append(this.commerce_config_data);
        }
        if (this.commerce_sticker_info != null) {
            sb.append(", commerce_sticker_info=");
            sb.append(this.commerce_sticker_info);
        }
        if (this.enable_top_view != null) {
            sb.append(", enable_top_view=");
            sb.append(this.enable_top_view);
        }
        if (this.distribute_type != null) {
            sb.append(", distribute_type=");
            sb.append(this.distribute_type);
        }
        if (this.video_control != null) {
            sb.append(", video_control=");
            sb.append(this.video_control);
        }
        if (this.is_effect_designer != null) {
            sb.append(", is_effect_designer=");
            sb.append(this.is_effect_designer);
        }
        if (this.ad_aweme_source != null) {
            sb.append(", ad_aweme_source=");
            sb.append(this.ad_aweme_source);
        }
        if (this.aweme_control != null) {
            sb.append(", aweme_control=");
            sb.append(this.aweme_control);
        }
        if (this.has_vs_entry != null) {
            sb.append(", has_vs_entry=");
            sb.append(this.has_vs_entry);
        }
        if (this.anchor != null) {
            sb.append(", anchor=");
            sb.append(this.anchor);
        }
        if (this.feed_relation_label != null) {
            sb.append(", feed_relation_label=");
            sb.append(this.feed_relation_label);
        }
        if (this.mix_info != null) {
            sb.append(", mix_info=");
            sb.append(this.mix_info);
        }
        if (this.simple_shop_seeding != null) {
            sb.append(", simple_shop_seeding=");
            sb.append(this.simple_shop_seeding);
        }
        if (this.hot_list != null) {
            sb.append(", hot_list=");
            sb.append(this.hot_list);
        }
        if (this.commerce_info != null) {
            sb.append(", commerce_info=");
            sb.append(this.commerce_info);
        }
        if (this.national_task_info != null) {
            sb.append(", national_task_info=");
            sb.append(this.national_task_info);
        }
        if (this.banner_tip != null) {
            sb.append(", banner_tip=");
            sb.append(this.banner_tip);
        }
        if (this.acl_info != null) {
            sb.append(", acl_info=");
            sb.append(this.acl_info);
        }
        if (this.anchor_info != null) {
            sb.append(", anchor_info=");
            sb.append(this.anchor_info);
        }
        if (this.vpa_info != null) {
            sb.append(", vpa_info=");
            sb.append(this.vpa_info);
        }
        if (this.cny_info != null) {
            sb.append(", cny_info=");
            sb.append(this.cny_info);
        }
        if (this.is_familiar != null) {
            sb.append(", is_familiar=");
            sb.append(this.is_familiar);
        }
        if (this.need_vs_entry != null) {
            sb.append(", need_vs_entry=");
            sb.append(this.need_vs_entry);
        }
        if (this.cell_room != null) {
            sb.append(", cell_room=");
            sb.append(this.cell_room);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStructV2)) {
            return false;
        }
        AwemeStructV2 awemeStructV2 = (AwemeStructV2) obj;
        if (!unknownFields().equals(awemeStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStructV2.aweme_id) || !Internal.equals(this.desc, awemeStructV2.desc) || !Internal.equals(this.create_time, awemeStructV2.create_time) || !Internal.equals(this.author, awemeStructV2.author) || !Internal.equals(this.music, awemeStructV2.music) || !this.cha_list.equals(awemeStructV2.cha_list) || !Internal.equals(this.video, awemeStructV2.video) || !Internal.equals(this.share_url, awemeStructV2.share_url) || !Internal.equals(this.user_digged, awemeStructV2.user_digged) || !Internal.equals(this.statistics, awemeStructV2.statistics) || !Internal.equals(this.status, awemeStructV2.status) || !Internal.equals(this.extra, awemeStructV2.extra) || !Internal.equals(this.rate, awemeStructV2.rate) || !this.text_extra.equals(awemeStructV2.text_extra) || !Internal.equals(this.label_large, awemeStructV2.label_large) || !Internal.equals(this.label_thumb, awemeStructV2.label_thumb) || !Internal.equals(this.is_top, awemeStructV2.is_top) || !Internal.equals(this.label_top, awemeStructV2.label_top) || !Internal.equals(this.share_info, awemeStructV2.share_info) || !Internal.equals(this.label_origin_author, awemeStructV2.label_origin_author) || !Internal.equals(this.distance, awemeStructV2.distance) || !Internal.equals(this.label_music_starter, awemeStructV2.label_music_starter) || !Internal.equals(this.label_private, awemeStructV2.label_private) || !this.video_labels.equals(awemeStructV2.video_labels) || !Internal.equals(this.is_vr, awemeStructV2.is_vr) || !Internal.equals(this.landing_page, awemeStructV2.landing_page) || !Internal.equals(this.is_ads, awemeStructV2.is_ads) || !Internal.equals(this.poi_info, awemeStructV2.poi_info) || !Internal.equals(this.duration, awemeStructV2.duration) || !Internal.equals(this.aweme_type, awemeStructV2.aweme_type) || !Internal.equals(this.gd_ad, awemeStructV2.gd_ad) || !Internal.equals(this.relation_label, awemeStructV2.relation_label) || !Internal.equals(this.red_packet, awemeStructV2.red_packet) || !Internal.equals(this.is_fantasy, awemeStructV2.is_fantasy) || !Internal.equals(this.cmt_swt, awemeStructV2.cmt_swt) || !this.image_infos.equals(awemeStructV2.image_infos) || !Internal.equals(this.risk_infos, awemeStructV2.risk_infos) || !Internal.equals(this.is_relieve, awemeStructV2.is_relieve) || !Internal.equals(this.label_friend, awemeStructV2.label_friend) || !Internal.equals(this.sort_label, awemeStructV2.sort_label) || !this.position.equals(awemeStructV2.position) || !this.uniqid_position.equals(awemeStructV2.uniqid_position) || !this.comment_list.equals(awemeStructV2.comment_list) || !Internal.equals(this.author_user_id, awemeStructV2.author_user_id) || !Internal.equals(this.bodydance_score, awemeStructV2.bodydance_score) || !this.geofencing.equals(awemeStructV2.geofencing) || !Internal.equals(this.is_hash_tag, awemeStructV2.is_hash_tag) || !Internal.equals(this.is_pgcshow, awemeStructV2.is_pgcshow) || !Internal.equals(this.region, awemeStructV2.region) || !this.video_text.equals(awemeStructV2.video_text) || !Internal.equals(this.vr_type, awemeStructV2.vr_type) || !Internal.equals(this.sp_sticker, awemeStructV2.sp_sticker) || !Internal.equals(this.ad_schedule, awemeStructV2.ad_schedule) || !Internal.equals(this.collect_stat, awemeStructV2.collect_stat) || !this.label_top_text.equals(awemeStructV2.label_top_text) || !this.promotions.equals(awemeStructV2.promotions) || !Internal.equals(this.stickers, awemeStructV2.stickers) || !Internal.equals(this.forward_item, awemeStructV2.forward_item) || !Internal.equals(this.forward_comment_id, awemeStructV2.forward_comment_id) || !Internal.equals(this.segment_longitudes, awemeStructV2.segment_longitudes) || !Internal.equals(this.segment_latitudes, awemeStructV2.segment_latitudes) || !Internal.equals(this.forward_item_id, awemeStructV2.forward_item_id) || !Internal.equals(this.group_id, awemeStructV2.group_id) || !Internal.equals(this.pre_forward_id, awemeStructV2.pre_forward_id) || !Internal.equals(this.prevent_download, awemeStructV2.prevent_download) || !this.nickname_position.equals(awemeStructV2.nickname_position) || !this.challenge_position.equals(awemeStructV2.challenge_position) || !Internal.equals(this.item_comment_settings, awemeStructV2.item_comment_settings) || !Internal.equals(this.descendants, awemeStructV2.descendants) || !Internal.equals(this.raw_ad_data, awemeStructV2.raw_ad_data) || !Internal.equals(this.game_info, awemeStructV2.game_info) || !Internal.equals(this.micro_app_info, awemeStructV2.micro_app_info) || !Internal.equals(this.with_promotional_music, awemeStructV2.with_promotional_music) || !Internal.equals(this.link_ad_data, awemeStructV2.link_ad_data) || !Internal.equals(this.xigua_task, awemeStructV2.xigua_task) || !Internal.equals(this.gesture_red_packet, awemeStructV2.gesture_red_packet) || !Internal.equals(this.activity_pendant, awemeStructV2.activity_pendant) || !Internal.equals(this.sticker_detail, awemeStructV2.sticker_detail) || !this.long_video.equals(awemeStructV2.long_video) || !Internal.equals(this.item_duet, awemeStructV2.item_duet) || !Internal.equals(this.item_react, awemeStructV2.item_react) || !Internal.equals(this.hot_info, awemeStructV2.hot_info) || !Internal.equals(this.star_atlas_order_id, awemeStructV2.star_atlas_order_id) || !Internal.equals(this.label_music_starter_text, awemeStructV2.label_music_starter_text) || !Internal.equals(this.without_watermark, awemeStructV2.without_watermark) || !Internal.equals(this.preload, awemeStructV2.preload) || !Internal.equals(this.star_recommend_tag, awemeStructV2.star_recommend_tag) || !Internal.equals(this.ad_order_id, awemeStructV2.ad_order_id) || !Internal.equals(this.open_platform_name, awemeStructV2.open_platform_name) || !Internal.equals(this.star_atlas_info, awemeStructV2.star_atlas_info) || !Internal.equals(this.desc_language, awemeStructV2.desc_language) || !Internal.equals(this.floating_card_content, awemeStructV2.floating_card_content) || !this.interaction_stickers.equals(awemeStructV2.interaction_stickers) || !Internal.equals(this.open_platform_info, awemeStructV2.open_platform_info) || !Internal.equals(this.ad_link_type, awemeStructV2.ad_link_type) || !Internal.equals(this.take_down_reason, awemeStructV2.take_down_reason) || !Internal.equals(this.take_down_desc, awemeStructV2.take_down_desc) || !Internal.equals(this.simple_promotions, awemeStructV2.simple_promotions) || !Internal.equals(this.misc_info, awemeStructV2.misc_info) || !Internal.equals(this.promotion_other_info, awemeStructV2.promotion_other_info) || !this.origin_comment_ids.equals(awemeStructV2.origin_comment_ids) || !this.commerce_config_data.equals(awemeStructV2.commerce_config_data) || !Internal.equals(this.commerce_sticker_info, awemeStructV2.commerce_sticker_info) || !Internal.equals(this.enable_top_view, awemeStructV2.enable_top_view) || !Internal.equals(this.distribute_type, awemeStructV2.distribute_type) || !Internal.equals(this.video_control, awemeStructV2.video_control) || !Internal.equals(this.is_effect_designer, awemeStructV2.is_effect_designer) || !Internal.equals(this.ad_aweme_source, awemeStructV2.ad_aweme_source) || !Internal.equals(this.aweme_control, awemeStructV2.aweme_control) || !Internal.equals(this.has_vs_entry, awemeStructV2.has_vs_entry) || !Internal.equals(this.anchor, awemeStructV2.anchor) || !Internal.equals(this.feed_relation_label, awemeStructV2.feed_relation_label) || !Internal.equals(this.mix_info, awemeStructV2.mix_info) || !Internal.equals(this.simple_shop_seeding, awemeStructV2.simple_shop_seeding) || !Internal.equals(this.hot_list, awemeStructV2.hot_list) || !Internal.equals(this.commerce_info, awemeStructV2.commerce_info) || !Internal.equals(this.national_task_info, awemeStructV2.national_task_info) || !Internal.equals(this.banner_tip, awemeStructV2.banner_tip) || !Internal.equals(this.acl_info, awemeStructV2.acl_info) || !Internal.equals(this.anchor_info, awemeStructV2.anchor_info) || !Internal.equals(this.vpa_info, awemeStructV2.vpa_info) || !Internal.equals(this.cny_info, awemeStructV2.cny_info) || !Internal.equals(this.is_familiar, awemeStructV2.is_familiar) || !Internal.equals(this.need_vs_entry, awemeStructV2.need_vs_entry) || !Internal.equals(this.cell_room, awemeStructV2.cell_room)) {
            return false;
        }
        return true;
    }
}
