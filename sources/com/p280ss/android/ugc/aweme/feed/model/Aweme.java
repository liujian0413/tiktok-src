package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import com.p280ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.p280ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.p280ss.android.ugc.aweme.commerce.model.PromotionOtherInfo;
import com.p280ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.p280ss.android.ugc.aweme.commercialize.model.AdNodeTrackUrl;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.Position;
import com.p280ss.android.ugc.aweme.feed.model.dongchedi.DCDVideoExtra;
import com.p280ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p280ss.android.ugc.aweme.feed.model.poi.NearbyCardStruct;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiOpCardStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiRankCardStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Aweme */
public class Aweme implements C6866d, Serializable, Cloneable {
    @C6593c(mo15949a = "activity_id")
    public String activityId;
    @C6593c(mo15949a = "activity_pendant")
    public CommerceActivityStruct activityPendant;
    @C6593c(mo15949a = "ad_aweme_source")
    public int adAwemeSource;
    public boolean adDescHandle = true;
    public int adDescMaxLines = 4;
    @C6593c(mo15949a = "ad_link_type")
    public int adLinkType;
    @C6593c(mo15949a = "ad_order_id")
    public String adOrderId;
    @C6593c(mo15949a = "ad_schedule")
    public String adSchedule;
    @C6593c(mo15949a = "aweme_id")
    public String aid;
    @C6593c(mo15949a = "anchor")
    public Anchor anchor;
    @C6593c(mo15949a = "anchor_info")
    public AnchorInfo anchorInfo;
    @C6593c(mo15949a = "author")
    public User author;
    @C6593c(mo15949a = "acl_info")
    public AwemeACLShare awemeACLShareInfo;
    @C6593c(mo15949a = "aweme_control")
    public AwemeControl awemeControl = new AwemeControl();
    @C6593c(mo15949a = "national_task_info")
    public AwemeNationalTask awemeNationalTask;
    public int awemePosition = -1;
    @C6593c(mo15949a = "raw_ad_data")
    public AwemeRawAd awemeRawAd;
    @C6593c(mo15949a = "risk_infos")
    public AwemeRiskModel awemeRiskModel;
    @C6593c(mo15949a = "aweme_type")
    public int awemeType;
    @C6593c(mo15949a = "banner_tip")
    public BannerTip bannerTip;
    public transient AVUploadMiscInfoStruct cacheAvUploadMiscInfoStruct;
    @C6593c(mo15949a = "can_play")
    public boolean canPlay = true;
    @C6593c(mo15949a = "cha_list")
    public List<Challenge> challengeList;
    @C6593c(mo15949a = "cmt_swt")
    public boolean cmtSwt;
    @C6593c(mo15949a = "collect_stat")
    public int collectStatus;
    @C6593c(mo15949a = "item_comment_settings")
    public int commentSetting;
    @C6593c(mo15949a = "commerce_config_data")
    public List<CommerceConfigData> commerceConfigDataList;
    @C6593c(mo15949a = "commerce_sticker_info")
    public CommerceStickerInfo commerceStickerInfo;
    @C6593c(mo15949a = "create_time")
    public long createTime;
    public long date;
    @C6593c(mo15949a = "dcd_video_extra")
    public DCDVideoExtra dcdVideoExtra;
    @C6593c(mo15949a = "desc")
    public String desc;
    @C6593c(mo15949a = "desc_language")
    public String descLanguage;
    @C6593c(mo15949a = "descendants")
    public DescendantsModel descendantsModel;
    @C6593c(mo15949a = "distance")
    public String distance;
    @C6593c(mo15949a = "distribute_type")
    public int distributeType;
    @C6593c(mo15949a = "without_watermark")
    public boolean downloadWithoutWatermark;
    @C6593c(mo15949a = "item_duet")
    public int duetSetting;
    public transient WeakReference<CharSequence> ellipsizeDesc;
    public transient CharSequence ellipsizeTransDesc;
    @C6593c(mo15949a = "enable_top_view")
    public boolean enableTopView = true;
    @C6593c(mo15949a = "external_video_type")
    public int externalType;
    @C6593c(mo15949a = "extra")
    public String extra;
    public List<User> familiarRecommendUser;
    public long feedCount;
    @C6593c(mo15949a = "feed_relation_label")
    public RelationLabelNew feedRelationLabel;
    @C6593c(mo15949a = "floating_card_content")
    public FloatingCardInfo floatingCardInfo;
    @C6593c(mo15949a = "forward_comment_id")
    public String forwardCommentId;
    @C6593c(mo15949a = "forward_item")
    public Aweme forwardItem;
    @C6593c(mo15949a = "forward_item_id")
    public String forwardItemId;
    public Challenge fromRawChallenge;
    @C6593c(mo15949a = "game_info")
    public GameInfo gameInfo;
    @C6593c(mo15949a = "has_vs_entry")
    public boolean hasVisionSearchEntry;
    @C6593c(mo15949a = "hot_list")
    public HotListStruct hotListStruct;
    @C6593c(mo15949a = "hot_info")
    public HotSearchInfo hotSearchInfo;
    public String hotSpot;
    @C6593c(mo15949a = "image_infos")
    public List<ImageInfo> imageInfos;
    @C6593c(mo15949a = "interaction_stickers")
    public List<InteractStickerStruct> interactStickerStructs;
    @C6593c(mo15949a = "is_ads")
    public boolean isAd;
    public boolean isCanCache = true;
    @C6593c(mo15949a = "is_effect_designer")
    public boolean isEffectDesigner;
    public boolean isFakeResponse;
    @C6593c(mo15949a = "is_familiar")
    public boolean isFamiliar;
    @C6593c(mo15949a = "is_fantasy")
    public boolean isFantasy;
    public boolean isFirstInSpot;
    public boolean isFromDouPlusGuideAnimate;
    @C6593c(mo15949a = "is_hash_tag")
    public int isHashTag;
    public boolean isLastInSpot;
    @C6593c(mo15949a = "is_pgcshow")
    public boolean isPgcShow;
    public boolean isPreloadScroll;
    @C6593c(mo15949a = "is_preview")
    public int isPreview;
    @C6593c(mo15949a = "is_prohibited")
    public boolean isProhibited;
    @C6593c(mo15949a = "is_relieve")
    public boolean isRelieve;
    @C6593c(mo15949a = "is_top")
    public int isTop;
    @C6593c(mo15949a = "is_vr")
    public boolean isVr;
    @C6593c(mo15949a = "label_large")
    public UrlModel labelLarge;
    @C6593c(mo15949a = "label_private")
    public UrlModel labelPrivate;
    @C6593c(mo15949a = "label_thumb")
    public UrlModel labelThumb;
    @C6593c(mo15949a = "label_top")
    public UrlModel labelTop;
    @C6593c(mo15949a = "landing_page")
    public String landingPage;
    @C6593c(mo15949a = "law_critical_country")
    public boolean lawCriticalCountry;
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "link_ad_data")
    public LinkData linkAdData;
    @C6593c(mo15949a = "long_video")
    public List<LongVideo> longVideos;
    @C6593c(mo15949a = "commerce_info")
    public AwemeCommerceStruct mCommerceVideoAuthInfo;
    public int mConcatAndUploadState;
    @C6593c(mo15949a = "label_music_starter_text")
    public String mLabelMusicStarterText;
    @C6593c(mo15949a = "label_origin_author_text")
    public String mLabelOriginAuthorText;
    @C6593c(mo15949a = "cny_info")
    public LiveAwesomeSplashInfo mLiveAwesomeSplashInfo;
    public HashMap<String, String> mMobParams;
    @C6593c(mo15949a = "new_relation_label")
    public List<RelationLabelNew> mNewRelationLabel;
    @C6593c(mo15949a = "cell_room")
    public RoomFeedCellStruct mRoomFeedCellStruct;
    @C6593c(mo15949a = "micro_app_info")
    public MicroAppInfo microAppInfo;
    @C6593c(mo15949a = "mix_info")
    public MixStruct mixInfo;
    @C6593c(mo15949a = "music")
    public Music music;
    @C6593c(mo15949a = "label_music_starter")
    public UrlModel musicStarter;
    @C6593c(mo15949a = "nearby_card")
    public NearbyCardStruct nearbyCardStruct;
    @C6593c(mo15949a = "need_vs_entry")
    public boolean needVisionSearchEntry;
    @C6593c(mo15949a = "new_source_id")
    public String newSourceId;
    @C6593c(mo15949a = "new_source_type")
    public String newSourceType;
    @C6593c(mo15949a = "nickname_position")
    public List<Position> nicknamePosition;
    @C6593c(mo15949a = "open_platform_name")
    public String openPlatformName;
    @C6593c(mo15949a = "open_platform_info")
    public OpenPlatformStruct openPlatformStruct;
    @C6593c(mo15949a = "label_origin_author")
    public UrlModel originAuthor;
    @C6593c(mo15949a = "origin_comment_ids")
    public List<String> originCommentIds;
    public int originalPos;
    public PoiOpCardStruct poiOpCardStruct;
    public PoiRankCardStruct poiRankCardStruct;
    @C6593c(mo15949a = "poi_info")
    public PoiStruct poiStruct;
    @C6593c(mo15949a = "position")
    public List<Position> position;
    @C6593c(mo15949a = "pre_forward_id")
    public String preForwardId;
    @C6593c(mo15949a = "preload")
    public Preload preload;
    @C6593c(mo15949a = "prevent_download")
    public boolean preventDownload;
    @C6593c(mo15949a = "promotion_other_info")
    public PromotionOtherInfo promotionOtherInfo;
    @C6593c(mo15949a = "rate")
    public int rate = -1;
    public String rateScore;
    @C6593c(mo15949a = "react_from")
    public String reactFrom;
    @C6593c(mo15949a = "react_origin")
    public String reactOrigin;
    @C6593c(mo15949a = "item_react")
    public int reactSetting;
    @C6593c(mo15949a = "react_view")
    public String reactView;
    @C6593c(mo15949a = "region")
    public String region;
    @C6593c(mo15949a = "relation_label")
    public RelationDynamicLabel relationLabel;
    public String repostFromGroupId;
    public String repostFromUserId;
    public String requestId;
    @C6593c(mo15949a = "room")
    public RoomStruct room;
    @C6593c(mo15949a = "scenario")
    public int scenario;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "share_url")
    public String shareUrl;
    public SimplePoiInfoStruct simplePoiInfoStruct;
    public List<SimplePromotion> simplePromotions;
    @C6593c(mo15949a = "simple_promotions")
    public String simplePromotionsString = "";
    @C6593c(mo15949a = "simple_shop_seeding")
    public String simpleShopSeeding;
    @C6593c(mo15949a = "sp_sticker")
    public SpecialSticker specialSticker;
    @C6593c(mo15949a = "star_atlas_info")
    public AwemeStarAtlas starAtlasInfo;
    @C6593c(mo15949a = "star_atlas_order_id")
    public long starAtlasOrderId;
    @C6593c(mo15949a = "star_recommend_tag")
    public String starRecommendTag;
    @C6593c(mo15949a = "statistics")
    public AwemeStatistics statistics;
    @C6593c(mo15949a = "status")
    public AwemeStatus status;
    @C6593c(mo15949a = "sticker_detail")
    public NewFaceStickerBean stickerEntranceInfo;
    @C6593c(mo15949a = "stickers")
    public String stickerIDs;
    @C6593c(mo15949a = "stream_url")
    public StreamUrlModel streamUrlModel;
    @C6593c(mo15949a = "take_down_desc")
    public String takeDownDesc;
    @C6593c(mo15949a = "take_down_reason")
    public int takeDownReason;
    @C6593c(mo15949a = "text_extra")
    public List<TextExtraStruct> textExtra;
    @C6593c(mo15949a = "label_top_text")
    public List<AwemeTextLabelModel> textTopLabels;
    @C6593c(mo15949a = "video_text")
    public List<AwemeTextLabelModel> textVideoLabels;
    @C6593c(mo15949a = "title")
    public String title;
    public transient CharSequence transDesc;
    public transient int transDescLines;
    @C6593c(mo15949a = "uniqid_position")
    public List<Position> uniqidPosition;
    @C6593c(mo15949a = "misc_info")
    public String uploadMiscInfoStructStr;
    @C6593c(mo15949a = "user_digged")
    public int userDigg;
    @C6593c(mo15949a = "video")
    public Video video;
    @C6593c(mo15949a = "video_control")
    public VideoControl videoControl;
    @C6593c(mo15949a = "video_labels")
    public List<AwemeLabelModel> videoLabels;
    @C6593c(mo15949a = "with_promotional_music")
    public boolean withPromotionalMusic;
    @C6593c(mo15949a = "xigua_task")
    public XiGuaTaskStruct xiGuaTask;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.Aweme$ConcatAndUploadState */
    public interface ConcatAndUploadState {
    }

    public String getActivityId() {
        return this.activityId;
    }

    public CommerceActivityStruct getActivityPendant() {
        return this.activityPendant;
    }

    public int getAdAwemeSource() {
        return this.adAwemeSource;
    }

    public int getAdDescMaxLines() {
        return this.adDescMaxLines;
    }

    public String getAdOrderId() {
        return this.adOrderId;
    }

    public String getAdSchedule() {
        return this.adSchedule;
    }

    public String getAid() {
        return this.aid;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    public User getAuthor() {
        return this.author;
    }

    public AwemeACLShare getAwemeACLShareInfo() {
        return this.awemeACLShareInfo;
    }

    public AwemeNationalTask getAwemeNationalTask() {
        return this.awemeNationalTask;
    }

    public int getAwemePosition() {
        return this.awemePosition;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public AwemeRiskModel getAwemeRiskModel() {
        return this.awemeRiskModel;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public BannerTip getBannerTip() {
        return this.bannerTip;
    }

    public boolean getCanCache() {
        return this.isCanCache;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public List<CommerceConfigData> getCommerceConfigDataList() {
        return this.commerceConfigDataList;
    }

    public CommerceStickerInfo getCommerceStickerInfo() {
        return this.commerceStickerInfo;
    }

    public AwemeCommerceStruct getCommerceVideoAuthInfo() {
        return this.mCommerceVideoAuthInfo;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDate() {
        return this.date;
    }

    public DCDVideoExtra getDcdVideoExtra() {
        return this.dcdVideoExtra;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDescLanguage() {
        return this.descLanguage;
    }

    public DescendantsModel getDescendantsModel() {
        return this.descendantsModel;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getDistributeType() {
        return this.distributeType;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<User> getFamiliarRecommendUser() {
        return this.familiarRecommendUser;
    }

    public long getFeedCount() {
        return this.feedCount;
    }

    public RelationLabelNew getFeedRelationLabel() {
        return this.feedRelationLabel;
    }

    public FloatingCardInfo getFloatingCardInfo() {
        return this.floatingCardInfo;
    }

    public String getForwardCommentId() {
        return this.forwardCommentId;
    }

    public Aweme getForwardItem() {
        return this.forwardItem;
    }

    public String getForwardItemId() {
        return this.forwardItemId;
    }

    public Challenge getFromRawChallenge() {
        return this.fromRawChallenge;
    }

    public GameInfo getGameInfo() {
        return this.gameInfo;
    }

    public HotListStruct getHotListStruct() {
        return this.hotListStruct;
    }

    public HotSearchInfo getHotSearchInfo() {
        return this.hotSearchInfo;
    }

    public String getHotSpot() {
        return this.hotSpot;
    }

    public List<ImageInfo> getImageInfos() {
        return this.imageInfos;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public boolean getIsFromDouPlusGuideAnimate() {
        return this.isFromDouPlusGuideAnimate;
    }

    public boolean getIsPreloadScroll() {
        return this.isPreloadScroll;
    }

    public int getIsTop() {
        return this.isTop;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public String getLabelMusicStarterText() {
        return this.mLabelMusicStarterText;
    }

    public String getLabelOriginAuthorText() {
        return this.mLabelOriginAuthorText;
    }

    public UrlModel getLabelPrivate() {
        return this.labelPrivate;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public UrlModel getLabelTop() {
        return this.labelTop;
    }

    public String getLandingPage() {
        return this.landingPage;
    }

    public LinkData getLinkAdData() {
        return this.linkAdData;
    }

    public LiveAwesomeSplashInfo getLiveAwesomeSplashInfo() {
        return this.mLiveAwesomeSplashInfo;
    }

    public List<LongVideo> getLongVideos() {
        return this.longVideos;
    }

    public MicroAppInfo getMicroAppInfo() {
        return this.microAppInfo;
    }

    public MixStruct getMixInfo() {
        return this.mixInfo;
    }

    public HashMap<String, String> getMobParams() {
        return this.mMobParams;
    }

    public Music getMusic() {
        return this.music;
    }

    public UrlModel getMusicStarter() {
        return this.musicStarter;
    }

    public NearbyCardStruct getNearbyCardStruct() {
        return this.nearbyCardStruct;
    }

    public List<RelationLabelNew> getNewRelationLabel() {
        return this.mNewRelationLabel;
    }

    public String getNewSourceId() {
        return this.newSourceId;
    }

    public String getNewSourceType() {
        return this.newSourceType;
    }

    public List<Position> getNicknamePosition() {
        return this.nicknamePosition;
    }

    public String getOpenPlatformName() {
        return this.openPlatformName;
    }

    public OpenPlatformStruct getOpenPlatformStruct() {
        return this.openPlatformStruct;
    }

    public UrlModel getOriginAuthor() {
        return this.originAuthor;
    }

    public List<String> getOriginCommentIds() {
        return this.originCommentIds;
    }

    public int getOriginalPos() {
        return this.originalPos;
    }

    public PoiOpCardStruct getPoiOpCardStruct() {
        return this.poiOpCardStruct;
    }

    public PoiRankCardStruct getPoiRankCardStruct() {
        return this.poiRankCardStruct;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public Preload getPreload() {
        return this.preload;
    }

    public PromotionOtherInfo getPromotionOtherInfo() {
        return this.promotionOtherInfo;
    }

    public int getRate() {
        return this.rate;
    }

    public String getRateScore() {
        return this.rateScore;
    }

    public String getRawPromotion() {
        return this.simplePromotionsString;
    }

    public String getReactFrom() {
        return this.reactFrom;
    }

    public String getReactOrigin() {
        return this.reactOrigin;
    }

    public int getReactSetting() {
        return this.reactSetting;
    }

    public String getReactView() {
        return this.reactView;
    }

    public String getRegion() {
        return this.region;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public String getRepostFromGroupId() {
        return this.repostFromGroupId;
    }

    public String getRepostFromUserId() {
        return this.repostFromUserId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public RoomStruct getRoom() {
        return this.room;
    }

    public RoomFeedCellStruct getRoomFeedCellStruct() {
        return this.mRoomFeedCellStruct;
    }

    public int getScenario() {
        return this.scenario;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public SimplePoiInfoStruct getSimplePoiInfoStruct() {
        return this.simplePoiInfoStruct;
    }

    public String getSimpleShopSeeding() {
        return this.simpleShopSeeding;
    }

    public SpecialSticker getSpecialSticker() {
        return this.specialSticker;
    }

    public AwemeStarAtlas getStarAtlasInfo() {
        return this.starAtlasInfo;
    }

    public long getStarAtlasOrderId() {
        return this.starAtlasOrderId;
    }

    public String getStarRecommendTag() {
        return this.starRecommendTag;
    }

    public AwemeStatistics getStatistics() {
        return this.statistics;
    }

    public AwemeStatus getStatus() {
        return this.status;
    }

    public NewFaceStickerBean getStickerEntranceInfo() {
        return this.stickerEntranceInfo;
    }

    public String getStickerIDs() {
        return this.stickerIDs;
    }

    public StreamUrlModel getStreamUrlModel() {
        return this.streamUrlModel;
    }

    public String getTakeDownDesc() {
        return this.takeDownDesc;
    }

    public int getTakeDownReason() {
        return this.takeDownReason;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public List<AwemeTextLabelModel> getTextTopLabels() {
        return this.textTopLabels;
    }

    public List<AwemeTextLabelModel> getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public String getTitle() {
        return this.title;
    }

    public CharSequence getTransDesc() {
        return this.transDesc;
    }

    public int getTransDescLines() {
        return this.transDescLines;
    }

    public List<Position> getUniqidPosition() {
        return this.uniqidPosition;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public List<AwemeLabelModel> getVideoLabels() {
        return this.videoLabels;
    }

    public XiGuaTaskStruct getXiGuaTask() {
        return this.xiGuaTask;
    }

    public boolean hasVisionSearchEntry() {
        return this.hasVisionSearchEntry;
    }

    public boolean isAdDescHandle() {
        return this.adDescHandle;
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public boolean isEffectDesigner() {
        return this.isEffectDesigner;
    }

    public boolean isEnableTopView() {
        return this.enableTopView;
    }

    public boolean isFakeResponse() {
        return this.isFakeResponse;
    }

    public boolean isFamiliar() {
        return this.isFamiliar;
    }

    public boolean isFantasy() {
        return this.isFantasy;
    }

    public boolean isFirstInSpot() {
        return this.isFirstInSpot;
    }

    public boolean isLastInSpot() {
        return this.isLastInSpot;
    }

    public boolean isLawCriticalCountry() {
        return this.lawCriticalCountry;
    }

    public boolean isPgcShow() {
        return this.isPgcShow;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRelieve() {
        return this.isRelieve;
    }

    public boolean isVr() {
        return this.isVr;
    }

    public boolean isWithPromotionalMusic() {
        return this.withPromotionalMusic;
    }

    public boolean needVisionSearchEntry() {
        return this.needVisionSearchEntry;
    }

    public int getFollowStatus() {
        return this.author.getFollowStatus();
    }

    public boolean hasStickerID() {
        if (this.stickerIDs != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.aid.hashCode();
    }

    public boolean isAwemeFromXiGua() {
        if (this.externalType == 1) {
            return true;
        }
        return false;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isConcating() {
        if (this.mConcatAndUploadState == 1) {
            return true;
        }
        return false;
    }

    public boolean isHashTag() {
        if (this.isHashTag == 1) {
            return true;
        }
        return false;
    }

    public boolean isLike() {
        if (this.userDigg == 1) {
            return true;
        }
        return false;
    }

    public boolean isPoiRegion() {
        if (this.nearbyCardStruct != null) {
            return true;
        }
        return false;
    }

    public boolean isPreview() {
        if (this.isPreview == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportGameChallenge() {
        if (this.gameInfo != null) {
            return true;
        }
        return false;
    }

    public boolean isTop() {
        if (this.isTop == 1) {
            return true;
        }
        return false;
    }

    public boolean needPreloadAdLink() {
        if (this.adLinkType == 1) {
            return true;
        }
        return false;
    }

    public String getAuthorUid() {
        if (this.author != null) {
            return this.author.getUid();
        }
        return "";
    }

    public AwemeControl getAwemeControl() {
        if (this.awemeControl == null) {
            this.awemeControl = new AwemeControl();
        }
        return this.awemeControl;
    }

    public String getAwemeRawAdIdStr() {
        if (this.awemeRawAd != null) {
            return this.awemeRawAd.getCreativeIdStr();
        }
        return "";
    }

    public int getDownloadStatus() {
        if (this.status == null) {
            return 0;
        }
        return this.status.getDownloadStatus();
    }

    public CharSequence getEllipsizeTransDesc() {
        if (TextUtils.isEmpty(this.ellipsizeTransDesc)) {
            return getTransDesc();
        }
        return this.ellipsizeTransDesc;
    }

    public int getEnterpriseType() {
        if (this.author == null) {
            return 0;
        }
        return this.author.getCommerceUserLevel();
    }

    public String getForwardGroupId() {
        if (isMultiForwardAweme()) {
            return this.preForwardId;
        }
        return "";
    }

    public String getMixId() {
        if (this.mixInfo != null) {
            return this.mixInfo.mixId;
        }
        return "";
    }

    public String getRecallType() {
        if (this.promotionOtherInfo == null) {
            return "";
        }
        return this.promotionOtherInfo.getRecallReason();
    }

    public String getReviewDetailUrl() {
        if (this.status == null) {
            return "";
        }
        return this.status.getReviewDetailUrl();
    }

    public AVUploadMiscInfoStruct getUploadMiscInfoStruct() {
        if (this.cacheAvUploadMiscInfoStruct == null) {
            this.cacheAvUploadMiscInfoStruct = AVUploadMiscInfoStruct.createStruct(this.uploadMiscInfoStructStr);
        }
        return this.cacheAvUploadMiscInfoStruct;
    }

    public boolean hasPromotion() {
        if (getPromotion() != null) {
            return true;
        }
        return false;
    }

    public boolean isAd() {
        if (!this.isAd || this.awemeRawAd == null) {
            return false;
        }
        return true;
    }

    public boolean isAwemeFromDongCheDi() {
        if (this.externalType == 2) {
            return true;
        }
        return false;
    }

    public boolean isDelete() {
        if (this.status == null || !this.status.isDelete()) {
            return false;
        }
        return true;
    }

    public boolean isForwardAweme() {
        if (this.awemeType == 13) {
            return true;
        }
        return false;
    }

    public boolean isHotListAweme() {
        if (this.hotListStruct == null || this.hotListStruct.getType() == 0) {
            return false;
        }
        return true;
    }

    public boolean isImage() {
        if (this.awemeType == 2) {
            return true;
        }
        return false;
    }

    public boolean isInReviewing() {
        if (this.status == null || !this.status.isInReviewing()) {
            return false;
        }
        return true;
    }

    public boolean isLive() {
        if (this.awemeType == 101) {
            return true;
        }
        return false;
    }

    public boolean isOrderShareRecommend() {
        if (this.promotionOtherInfo == null) {
            return false;
        }
        return this.promotionOtherInfo.isOrderShareRecommend();
    }

    public boolean isPoiOperate() {
        if (this.awemeType == 3002) {
            return true;
        }
        return false;
    }

    public boolean isPoiRank() {
        if (this.awemeType == 3001) {
            return true;
        }
        return false;
    }

    public boolean isPrivate() {
        if (this.status == null || this.status.getPrivateStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isProhibited() {
        if (this.status == null || !this.status.isProhibited()) {
            return false;
        }
        return true;
    }

    public boolean isProhibitedAndShouldTell() {
        if (this.status == null || !this.status.isProhibitedAndShouldTell()) {
            return false;
        }
        return true;
    }

    public boolean isPublic() {
        if (this.status == null || this.status.getPrivateStatus() != 0) {
            return false;
        }
        return true;
    }

    public boolean isReviewed() {
        if (this.status == null || !this.status.isReviewed()) {
            return false;
        }
        return true;
    }

    public boolean isSelfSee() {
        if (this.status == null || !this.status.isSelfSee()) {
            return false;
        }
        return true;
    }

    public boolean isSelfSeeAndShouldTell() {
        if (this.status == null || !this.status.isSelfSeeAndShouldTell()) {
            return false;
        }
        return true;
    }

    public boolean isUploadFailure() {
        if (this.mConcatAndUploadState == 3) {
            return true;
        }
        return false;
    }

    public boolean isUploading() {
        if (this.mConcatAndUploadState == 2) {
            return true;
        }
        return false;
    }

    public boolean isUserPost() {
        if (this.awemeType == 33 || this.adAwemeSource == 1) {
            return true;
        }
        return false;
    }

    public boolean shouldShowReviewStatus() {
        if (this.status == null || !this.status.shouldShowReviewStatus()) {
            return false;
        }
        return true;
    }

    public CommentStruct getAdCommentStruct() {
        if (getAwemeRawAd() != null) {
            return getAwemeRawAd().getCommentArea();
        }
        return null;
    }

    public String getFromRequestId() {
        if (getAwemeType() != 13) {
            return getRequestId();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getRequestId();
        }
        return "";
    }

    public String getFromUserId() {
        if (getAwemeType() != 13) {
            return getAuthorUid();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getAuthorUid();
        }
        return "";
    }

    public SimplePromotion getPromotion() {
        if (getPromotions().isEmpty()) {
            return null;
        }
        return (SimplePromotion) getPromotions().get(0);
    }

    public List<String> getRawAdClickTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel clickTrackUrlList = getAwemeRawAd().getClickTrackUrlList();
        if (clickTrackUrlList == null) {
            return null;
        }
        return clickTrackUrlList.getUrlList();
    }

    public List<String> getRawAdEffectivePlayTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel effectivePlayTrackUrlList = getAwemeRawAd().getEffectivePlayTrackUrlList();
        if (effectivePlayTrackUrlList == null) {
            return null;
        }
        return effectivePlayTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayOverTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel playOverTrackUrlList = getAwemeRawAd().getPlayOverTrackUrlList();
        if (playOverTrackUrlList == null) {
            return null;
        }
        return playOverTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel playTrackUrlList = getAwemeRawAd().getPlayTrackUrlList();
        if (playTrackUrlList == null) {
            return null;
        }
        return playTrackUrlList.getUrlList();
    }

    public List<String> getRawAdShowTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel trackUrlList = getAwemeRawAd().getTrackUrlList();
        if (trackUrlList == null) {
            return null;
        }
        return trackUrlList.getUrlList();
    }

    public boolean hasValidPoi() {
        if (this.poiStruct == null || TextUtils.isEmpty(this.poiStruct.poiId)) {
            return false;
        }
        return true;
    }

    public boolean isAppAd() {
        if (!isAd() || !this.awemeRawAd.isAppAd()) {
            return false;
        }
        return true;
    }

    public boolean isDouyinGovMediaVip() {
        if (!C6399b.m19945u() || this.author == null || !this.author.isGovMediaVip()) {
            return false;
        }
        return true;
    }

    public boolean isHotSearchAweme() {
        if (this.hotSearchInfo == null || TextUtils.isEmpty(this.hotSearchInfo.getSentence())) {
            return false;
        }
        return true;
    }

    public boolean isHotVideoAweme() {
        if (this.hotSearchInfo == null || this.hotSearchInfo.getVideoRank() <= 0 || this.hotSearchInfo.getVideoRankVV() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isMixAweme() {
        if (this.mixInfo == null || TextUtils.isEmpty(this.mixInfo.mixId)) {
            return false;
        }
        return true;
    }

    public boolean withFakeUser() {
        if (this.author == null || this.author.isAdFake()) {
            return true;
        }
        return false;
    }

    private boolean commerceVideoTypeAllowDuetReact() {
        if (this.awemeType == 1 || this.awemeType == 29 || this.awemeType == 30 || this.awemeType == 32 || this.awemeType == 33 || this.awemeType == 201) {
            return true;
        }
        return false;
    }

    private boolean isMultiForwardAweme() {
        if (C6307b.m19566a((Collection<T>) this.textExtra)) {
            return false;
        }
        for (TextExtraStruct type : this.textExtra) {
            if (type.getType() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean canDuetVideoType() {
        if (this.awemeType == 0 || this.awemeType == 51 || this.awemeType == 52 || this.awemeType == 54 || this.awemeType == 53 || this.awemeType == 55 || this.awemeType == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public boolean canReactVideoType() {
        if (this.awemeType == 52 || this.awemeType == 0 || this.awemeType == 51 || this.awemeType == 54 || this.awemeType == 53 || this.awemeType == 55 || this.awemeType == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public ItemCommentEggGroup getCommentEggGroup() {
        if (this.commerceConfigDataList != null && !this.commerceConfigDataList.isEmpty()) {
            for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
                if (commerceConfigData.type == 4) {
                    return commerceConfigData.itemCommentEggGroup;
                }
            }
        }
        return null;
    }

    public ItemLikeEggData getCommerceAdLikeDigg() {
        if (this.commerceConfigDataList != null && !this.commerceConfigDataList.isEmpty()) {
            for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
                if (commerceConfigData.type == 1 && commerceConfigData.itemLikeEggData != null) {
                    return commerceConfigData.itemLikeEggData;
                }
            }
        }
        return null;
    }

    public UrlModel getDynamicPreferredCover() {
        if (this.video == null) {
            if (this.imageInfos == null || this.imageInfos.isEmpty()) {
                return null;
            }
            return ((ImageInfo) this.imageInfos.get(0)).labelThumb;
        } else if (this.video.dynamicCover != null) {
            return this.video.dynamicCover;
        } else {
            if (this.video.cover != null) {
                return this.video.cover;
            }
            return null;
        }
    }

    public CharSequence getEllipsizeDesc() {
        if (this.ellipsizeDesc == null || TextUtils.isEmpty((CharSequence) this.ellipsizeDesc.get())) {
            return getDesc();
        }
        return (CharSequence) this.ellipsizeDesc.get();
    }

    public String getFirstPlayAddr() {
        if (this.video != null) {
            VideoUrlModel properPlayAddr = this.video.getProperPlayAddr();
            if (properPlayAddr != null && !C6307b.m19566a((Collection<T>) properPlayAddr.getUrlList())) {
                return (String) properPlayAddr.getUrlList().get(0);
            }
        }
        return null;
    }

    public String getForwardUserId() {
        String str = "";
        if (C6307b.m19566a((Collection<T>) this.textExtra)) {
            return "";
        }
        for (TextExtraStruct textExtraStruct : this.textExtra) {
            if (textExtraStruct.getType() == 2) {
                return textExtraStruct.getUserId();
            }
        }
        return str;
    }

    public String getFromGroupId() {
        if (getAwemeType() != 13) {
            return getAid();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getAid();
        }
        return getForwardItemId();
    }

    public SimpleShopSeedingModel getSimpleShopSeedingModel() {
        List list;
        if (C6399b.m19943s()) {
            return null;
        }
        try {
            list = (List) new C6600e().mo15975a(getSimpleShopSeeding(), new C6597a<List<SimpleShopSeedingModel>>() {
            }.type);
        } catch (Exception unused) {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (SimpleShopSeedingModel) list.get(0);
    }

    public List<SimplePromotion> getPromotions() {
        ArrayList arrayList;
        if (TextUtils.isEmpty(this.simplePromotionsString)) {
            if (this.simplePromotions == null) {
                this.simplePromotions = new ArrayList();
            }
            return this.simplePromotions;
        }
        if (this.simplePromotions == null) {
            try {
                SimplePromotion[] simplePromotionArr = (SimplePromotion[]) new C6600e().mo15974a(this.simplePromotionsString, SimplePromotion[].class);
                if (simplePromotionArr == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(Arrays.asList(simplePromotionArr));
                }
                this.simplePromotions = arrayList;
            } catch (Exception unused) {
                this.simplePromotions = new ArrayList();
            }
        }
        return this.simplePromotions;
    }

    public void convertChallengeToHashTag() {
        String str;
        List challengeList2 = getChallengeList();
        if (challengeList2 != null && !challengeList2.isEmpty()) {
            Challenge challenge = (Challenge) challengeList2.get(0);
            if (challenge != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challenge.getChallengeName());
                sb.append(" ");
                TextExtraStruct textExtraStruct = new TextExtraStruct();
                textExtraStruct.setType(1);
                textExtraStruct.setHashTagName(challenge.getChallengeName());
                textExtraStruct.setStart(0);
                textExtraStruct.setCid(challenge.getCid());
                textExtraStruct.setEnd(sb.length());
                if (getDesc() == null) {
                    str = "";
                } else {
                    str = getDesc();
                }
                StringBuilder sb2 = new StringBuilder("#");
                sb2.append(challenge.getChallengeName());
                if (!str.contains(sb2.toString())) {
                    sb.append(getDesc());
                    setDesc(sb.toString());
                    int end = textExtraStruct.getEnd() - textExtraStruct.getStart();
                    List textExtra2 = getTextExtra();
                    if (textExtra2 != null) {
                        for (TextExtraStruct textExtraStruct2 : getTextExtra()) {
                            textExtraStruct2.setStart(textExtraStruct2.getStart() + end);
                            textExtraStruct2.setEnd(textExtraStruct2.getEnd() + end);
                        }
                    } else {
                        textExtra2 = new ArrayList();
                        setTextExtra(textExtra2);
                    }
                    textExtra2.add(textExtraStruct);
                }
            }
        }
    }

    public Aweme clone() {
        AwemeStatistics awemeStatistics;
        Aweme aweme = new Aweme();
        aweme.aid = this.aid;
        aweme.commerceConfigDataList = this.commerceConfigDataList;
        aweme.starAtlasOrderId = this.starAtlasOrderId;
        aweme.desc = this.desc;
        aweme.createTime = this.createTime;
        aweme.author = this.author;
        aweme.music = this.music;
        aweme.challengeList = this.challengeList;
        aweme.video = this.video;
        aweme.longVideos = this.longVideos;
        aweme.shareUrl = this.shareUrl;
        aweme.userDigg = this.userDigg;
        AwemeStatus awemeStatus = null;
        if (this.statistics == null) {
            awemeStatistics = null;
        } else {
            awemeStatistics = this.statistics.clone();
        }
        aweme.statistics = awemeStatistics;
        if (this.status != null) {
            awemeStatus = this.status.clone();
        }
        aweme.status = awemeStatus;
        aweme.reactFrom = this.reactFrom;
        aweme.reactOrigin = this.reactOrigin;
        aweme.reactView = this.reactView;
        aweme.commerceStickerInfo = this.commerceStickerInfo;
        aweme.videoControl = this.videoControl;
        aweme.distributeType = this.distributeType;
        aweme.extra = this.extra;
        aweme.rate = this.rate;
        aweme.shareInfo = this.shareInfo;
        aweme.textVideoLabels = this.textVideoLabels;
        aweme.textTopLabels = this.textTopLabels;
        aweme.videoLabels = this.videoLabels;
        aweme.isHashTag = this.isHashTag;
        aweme.awemeType = this.awemeType;
        aweme.adAwemeSource = this.adAwemeSource;
        aweme.awemeRawAd = this.awemeRawAd;
        aweme.specialSticker = this.specialSticker;
        aweme.poiStruct = this.poiStruct;
        aweme.openPlatformStruct = this.openPlatformStruct;
        aweme.relationLabel = this.relationLabel;
        aweme.cmtSwt = this.cmtSwt;
        aweme.streamUrlModel = this.streamUrlModel;
        aweme.title = this.title;
        aweme.isPgcShow = this.isPgcShow;
        aweme.imageInfos = this.imageInfos;
        aweme.awemeRiskModel = this.awemeRiskModel;
        aweme.descendantsModel = this.descendantsModel;
        aweme.collectStatus = this.collectStatus;
        aweme.scenario = this.scenario;
        aweme.lawCriticalCountry = this.lawCriticalCountry;
        aweme.canPlay = this.canPlay;
        aweme.commentSetting = this.commentSetting;
        aweme.reactSetting = this.reactSetting;
        aweme.duetSetting = this.duetSetting;
        aweme.simplePromotionsString = this.simplePromotionsString;
        aweme.simplePromotions = this.simplePromotions;
        aweme.activityPendant = this.activityPendant;
        aweme.promotionOtherInfo = this.promotionOtherInfo;
        aweme.position = this.position;
        aweme.uniqidPosition = this.uniqidPosition;
        aweme.nicknamePosition = this.nicknamePosition;
        aweme.room = this.room;
        aweme.stickerIDs = this.stickerIDs;
        aweme.uploadMiscInfoStructStr = this.uploadMiscInfoStructStr;
        aweme.takeDownReason = this.takeDownReason;
        aweme.takeDownDesc = this.takeDownDesc;
        aweme.forwardItem = this.forwardItem;
        aweme.forwardItemId = this.forwardItemId;
        aweme.forwardCommentId = this.forwardCommentId;
        aweme.preForwardId = this.preForwardId;
        aweme.preventDownload = this.preventDownload;
        aweme.region = this.region;
        aweme.microAppInfo = this.microAppInfo;
        aweme.gameInfo = this.gameInfo;
        aweme.isProhibited = this.isProhibited;
        aweme.hotSearchInfo = this.hotSearchInfo;
        aweme.hotListStruct = this.hotListStruct;
        aweme.downloadWithoutWatermark = this.downloadWithoutWatermark;
        aweme.openPlatformName = this.openPlatformName;
        aweme.linkAdData = this.linkAdData;
        aweme.adLinkType = this.adLinkType;
        aweme.awemeNationalTask = this.awemeNationalTask;
        aweme.enableTopView = this.enableTopView;
        aweme.isCanCache = this.isCanCache;
        aweme.isPreloadScroll = this.isPreloadScroll;
        aweme.isFakeResponse = this.isFakeResponse;
        aweme.repostFromGroupId = this.repostFromGroupId;
        aweme.repostFromUserId = this.repostFromUserId;
        aweme.date = this.date;
        aweme.labelLarge = this.labelLarge;
        aweme.labelPrivate = this.labelPrivate;
        aweme.labelThumb = this.labelThumb;
        aweme.textExtra = this.textExtra;
        aweme.isTop = this.isTop;
        aweme.labelTop = this.labelTop;
        aweme.originAuthor = this.originAuthor;
        aweme.musicStarter = this.musicStarter;
        aweme.mLabelOriginAuthorText = this.mLabelOriginAuthorText;
        aweme.mLabelMusicStarterText = this.mLabelMusicStarterText;
        aweme.originalPos = this.originalPos;
        aweme.distance = this.distance;
        aweme.landingPage = this.landingPage;
        aweme.isAd = this.isAd;
        aweme.isVr = this.isVr;
        aweme.isRelieve = this.isRelieve;
        aweme.adSchedule = this.adSchedule;
        aweme.xiGuaTask = this.xiGuaTask;
        aweme.preload = this.preload;
        aweme.feedCount = this.feedCount;
        aweme.isEffectDesigner = this.isEffectDesigner;
        aweme.withPromotionalMusic = this.withPromotionalMusic;
        aweme.stickerEntranceInfo = this.stickerEntranceInfo;
        aweme.starRecommendTag = this.starRecommendTag;
        aweme.adOrderId = this.adOrderId;
        aweme.interactStickerStructs = this.interactStickerStructs;
        aweme.starAtlasInfo = this.starAtlasInfo;
        aweme.descLanguage = this.descLanguage;
        aweme.floatingCardInfo = this.floatingCardInfo;
        aweme.originCommentIds = this.originCommentIds;
        aweme.requestId = this.requestId;
        aweme.awemePosition = this.awemePosition;
        aweme.mConcatAndUploadState = this.mConcatAndUploadState;
        aweme.awemeControl = this.awemeControl;
        aweme.hasVisionSearchEntry = this.hasVisionSearchEntry;
        aweme.anchor = this.anchor;
        aweme.mCommerceVideoAuthInfo = this.mCommerceVideoAuthInfo;
        aweme.isPreview = this.isPreview;
        return aweme;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Aweme{aid='");
        sb.append(this.aid);
        sb.append('\'');
        sb.append(", desc='");
        sb.append(this.desc);
        sb.append('\'');
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", challengeList=");
        sb.append(this.challengeList);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", shareUrl='");
        sb.append(this.shareUrl);
        sb.append('\'');
        sb.append(", userDigg=");
        sb.append(this.userDigg);
        sb.append(", statistics=");
        sb.append(this.statistics);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", extra='");
        sb.append(this.extra);
        sb.append('\'');
        sb.append(", rate=");
        sb.append(this.rate);
        sb.append(", shareInfo=");
        sb.append(this.shareInfo);
        sb.append(", labelLarge=");
        sb.append(this.labelLarge);
        sb.append(", labelThumb=");
        sb.append(this.labelThumb);
        sb.append(", textExtra=");
        sb.append(this.textExtra);
        sb.append(", isTop=");
        sb.append(this.isTop);
        sb.append(", labelTop=");
        sb.append(this.labelTop);
        sb.append(", originalPos=");
        sb.append(this.originalPos);
        sb.append(", isAd=");
        sb.append(this.isAd);
        sb.append(", awemeType=");
        sb.append(this.awemeType);
        sb.append(", awemeRawAd=");
        sb.append(this.awemeRawAd);
        sb.append(", specialSticker=");
        sb.append(this.specialSticker);
        sb.append(", videoLabels=");
        sb.append(this.videoLabels);
        sb.append(", cmtSwt=");
        sb.append(this.cmtSwt);
        sb.append(", adSchedule=");
        sb.append(this.adSchedule);
        sb.append(", simplePromotions=");
        sb.append(this.simplePromotions);
        sb.append(", region=");
        sb.append(this.region);
        sb.append('}');
        return sb.toString();
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }

    public void setAdAwemeSource(int i) {
        this.adAwemeSource = i;
    }

    public void setAdDescHandle(boolean z) {
        this.adDescHandle = z;
    }

    public void setAdDescMaxLines(int i) {
        this.adDescMaxLines = i;
    }

    public void setAdOrderId(String str) {
        this.adOrderId = str;
    }

    public void setAdSchedule(String str) {
        this.adSchedule = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAnchor(Anchor anchor2) {
        this.anchor = anchor2;
    }

    public void setAnchorInfo(AnchorInfo anchorInfo2) {
        this.anchorInfo = anchorInfo2;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAwemeACLShareInfo(AwemeACLShare awemeACLShare) {
        this.awemeACLShareInfo = awemeACLShare;
    }

    public void setAwemeControl(AwemeControl awemeControl2) {
        this.awemeControl = awemeControl2;
    }

    public void setAwemeNationalTask(AwemeNationalTask awemeNationalTask2) {
        this.awemeNationalTask = awemeNationalTask2;
    }

    public void setAwemePosition(int i) {
        this.awemePosition = i;
    }

    public void setAwemeRawAd(AwemeRawAd awemeRawAd2) {
        this.awemeRawAd = awemeRawAd2;
    }

    public void setAwemeRiskModel(AwemeRiskModel awemeRiskModel2) {
        this.awemeRiskModel = awemeRiskModel2;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setBannerTip(BannerTip bannerTip2) {
        this.bannerTip = bannerTip2;
    }

    public void setCanCache(boolean z) {
        this.isCanCache = z;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommerceConfigDataList(List<CommerceConfigData> list) {
        this.commerceConfigDataList = list;
    }

    public void setCommerceStickerInfo(CommerceStickerInfo commerceStickerInfo2) {
        this.commerceStickerInfo = commerceStickerInfo2;
    }

    public void setConcatAndUploadState(int i) {
        this.mConcatAndUploadState = i;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setDcdVideoExtra(DCDVideoExtra dCDVideoExtra) {
        this.dcdVideoExtra = dCDVideoExtra;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDescLanguage(String str) {
        this.descLanguage = str;
    }

    public void setDescendantsModel(DescendantsModel descendantsModel2) {
        this.descendantsModel = descendantsModel2;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistributeType(int i) {
        this.distributeType = i;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setEffectDesigner(boolean z) {
        this.isEffectDesigner = z;
    }

    public void setEllipsizeTransDesc(CharSequence charSequence) {
        this.ellipsizeTransDesc = charSequence;
    }

    public void setEnableTopView(boolean z) {
        this.enableTopView = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFakeResponse(boolean z) {
        this.isFakeResponse = z;
    }

    public void setFamiliar(boolean z) {
        this.isFamiliar = z;
    }

    public void setFamiliarRecommendUser(List<User> list) {
        this.familiarRecommendUser = list;
    }

    public Aweme setFantasy(boolean z) {
        this.isFantasy = z;
        return this;
    }

    public void setFeedCount(long j) {
        this.feedCount = j;
    }

    public void setFeedRelationLabel(RelationLabelNew relationLabelNew) {
        this.feedRelationLabel = relationLabelNew;
    }

    public void setFirstInSpot(boolean z) {
        this.isFirstInSpot = z;
    }

    public void setFloatingCardInfo(FloatingCardInfo floatingCardInfo2) {
        this.floatingCardInfo = floatingCardInfo2;
    }

    public void setForwardCommentId(String str) {
        this.forwardCommentId = str;
    }

    public void setForwardItem(Aweme aweme) {
        this.forwardItem = aweme;
    }

    public void setForwardItemId(String str) {
        this.forwardItemId = str;
    }

    public void setFromRawChallenge(Challenge challenge) {
        this.fromRawChallenge = challenge;
    }

    public void setGameInfo(GameInfo gameInfo2) {
        this.gameInfo = gameInfo2;
    }

    public void setHasVisionSearchEntry(boolean z) {
        this.hasVisionSearchEntry = z;
    }

    public void setHashTag(int i) {
        this.isHashTag = i;
    }

    public Aweme setHotListStruct(HotListStruct hotListStruct2) {
        this.hotListStruct = hotListStruct2;
        return this;
    }

    public void setHotSearchInfo(HotSearchInfo hotSearchInfo2) {
        this.hotSearchInfo = hotSearchInfo2;
    }

    public Aweme setHotSpot(String str) {
        this.hotSpot = str;
        return this;
    }

    public void setImageInfos(List<ImageInfo> list) {
        this.imageInfos = list;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setIsFromDouPlusGuideAnimate(boolean z) {
        this.isFromDouPlusGuideAnimate = z;
    }

    public void setIsPreloadScroll(boolean z) {
        this.isPreloadScroll = z;
    }

    public void setIsTop(int i) {
        this.isTop = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelMusicStarterText(String str) {
        this.mLabelMusicStarterText = str;
    }

    public void setLabelOriginAuthorText(String str) {
        this.mLabelOriginAuthorText = str;
    }

    public void setLabelPrivate(UrlModel urlModel) {
        this.labelPrivate = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLabelTop(UrlModel urlModel) {
        this.labelTop = urlModel;
    }

    public void setLandingPage(String str) {
        this.landingPage = str;
    }

    public void setLastInSpot(boolean z) {
        this.isLastInSpot = z;
    }

    public void setLawCriticalCountry(boolean z) {
        this.lawCriticalCountry = z;
    }

    public void setLike(boolean z) {
        this.userDigg = z ? 1 : 0;
    }

    public void setLinkAdData(LinkData linkData) {
        this.linkAdData = linkData;
    }

    public void setLiveAwesomeSplashInfo(LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        this.mLiveAwesomeSplashInfo = liveAwesomeSplashInfo;
    }

    public void setLongVideos(List<LongVideo> list) {
        this.longVideos = list;
    }

    public void setMicroAppInfo(MicroAppInfo microAppInfo2) {
        this.microAppInfo = microAppInfo2;
    }

    public void setMixInfo(MixStruct mixStruct) {
        this.mixInfo = mixStruct;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setMusicStarter(UrlModel urlModel) {
        this.musicStarter = urlModel;
    }

    public void setNearbyCardStruct(NearbyCardStruct nearbyCardStruct2) {
        this.nearbyCardStruct = nearbyCardStruct2;
    }

    public void setNeedVisionSearchEntry(boolean z) {
        this.needVisionSearchEntry = z;
    }

    public void setNewRelationLabel(List<RelationLabelNew> list) {
        this.mNewRelationLabel = list;
    }

    public void setNewSourceId(String str) {
        this.newSourceId = str;
    }

    public void setNewSourceType(String str) {
        this.newSourceType = str;
    }

    public void setNicknamePosition(List<Position> list) {
        this.nicknamePosition = list;
    }

    public void setOpenPlatformName(String str) {
        this.openPlatformName = str;
    }

    public void setOpenPlatformStruct(OpenPlatformStruct openPlatformStruct2) {
        this.openPlatformStruct = openPlatformStruct2;
    }

    public void setOriginAuthor(UrlModel urlModel) {
        this.originAuthor = urlModel;
    }

    public void setOriginCommentIds(List<String> list) {
        this.originCommentIds = list;
    }

    public void setOriginalPos(int i) {
        this.originalPos = i;
    }

    public void setPgcShow(boolean z) {
        this.isPgcShow = z;
    }

    public void setPoiOpCardStruct(PoiOpCardStruct poiOpCardStruct2) {
        this.poiOpCardStruct = poiOpCardStruct2;
    }

    public void setPoiRankCardStruct(PoiRankCardStruct poiRankCardStruct2) {
        this.poiRankCardStruct = poiRankCardStruct2;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setPosition(List<Position> list) {
        this.position = list;
    }

    public void setPreload(Preload preload2) {
        this.preload = preload2;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPromotionOtherInfo(PromotionOtherInfo promotionOtherInfo2) {
        this.promotionOtherInfo = promotionOtherInfo2;
    }

    public void setRate(int i) {
        this.rate = i;
    }

    public void setRateScore(String str) {
        this.rateScore = str;
    }

    public void setReactFrom(String str) {
        this.reactFrom = str;
    }

    public void setReactOrigin(String str) {
        this.reactOrigin = str;
    }

    public void setReactSetting(int i) {
        this.reactSetting = i;
    }

    public void setReactView(String str) {
        this.reactView = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setRelieve(boolean z) {
        this.isRelieve = z;
    }

    public void setRepostFromGroupId(String str) {
        this.repostFromGroupId = str;
    }

    public void setRepostFromUserId(String str) {
        this.repostFromUserId = str;
    }

    public void setRoom(RoomStruct roomStruct) {
        this.room = roomStruct;
    }

    public void setRoomFeedCellStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.mRoomFeedCellStruct = roomFeedCellStruct;
    }

    public void setScenario(int i) {
        this.scenario = i;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSimplePoiInfoStruct(SimplePoiInfoStruct simplePoiInfoStruct2) {
        this.simplePoiInfoStruct = simplePoiInfoStruct2;
    }

    public void setSimpleShopSeeding(String str) {
        this.simpleShopSeeding = str;
    }

    public void setSpecialSticker(SpecialSticker specialSticker2) {
        this.specialSticker = specialSticker2;
    }

    public void setStarAtlasInfo(AwemeStarAtlas awemeStarAtlas) {
        this.starAtlasInfo = awemeStarAtlas;
    }

    public void setStarAtlasOrderId(long j) {
        this.starAtlasOrderId = j;
    }

    public void setStarRecommendTag(String str) {
        this.starRecommendTag = str;
    }

    public void setStatistics(AwemeStatistics awemeStatistics) {
        this.statistics = awemeStatistics;
    }

    public void setStatus(AwemeStatus awemeStatus) {
        this.status = awemeStatus;
    }

    public void setStickerEntranceInfo(NewFaceStickerBean newFaceStickerBean) {
        this.stickerEntranceInfo = newFaceStickerBean;
    }

    public void setStickerIDs(String str) {
        this.stickerIDs = str;
    }

    public void setStreamUrlModel(StreamUrlModel streamUrlModel2) {
        this.streamUrlModel = streamUrlModel2;
    }

    public void setTakeDownDesc(String str) {
        this.takeDownDesc = str;
    }

    public void setTakeDownReason(int i) {
        this.takeDownReason = i;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTextTopLabels(List<AwemeTextLabelModel> list) {
        this.textTopLabels = list;
    }

    public void setTextVideoLabels(List<AwemeTextLabelModel> list) {
        this.textVideoLabels = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTransDesc(CharSequence charSequence) {
        this.transDesc = charSequence;
    }

    public void setTransDescLines(int i) {
        this.transDescLines = i;
    }

    public void setUniqidPosition(List<Position> list) {
        this.uniqidPosition = list;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }

    public void setVideoLabels(List<AwemeLabelModel> list) {
        this.videoLabels = list;
    }

    public void setXiGuaTask(XiGuaTaskStruct xiGuaTaskStruct) {
        this.xiGuaTask = xiGuaTaskStruct;
    }

    public void setRawPromotion(String str) {
        this.simplePromotionsString = str;
        this.simplePromotions = null;
    }

    public static Aweme newDateSection(long j) {
        Aweme aweme = new Aweme();
        aweme.setAid("");
        aweme.setDate(j);
        return aweme;
    }

    public void setEllipsizeDesc(CharSequence charSequence) {
        if (charSequence == null) {
            this.ellipsizeDesc = null;
        } else {
            this.ellipsizeDesc = new WeakReference<>(charSequence);
        }
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (isForwardAweme() && this.forwardItem != null) {
            this.forwardItem.setRequestId(str);
        }
        if (this.author != null) {
            this.author.setRequestId(str);
        }
    }

    public void setVr(boolean z) {
        this.isVr = z;
        if (this.video != null) {
            setVr(this.video.getPlayAddrH264(), z);
            setVr(this.video.getPlayAddrH265(), z);
        }
    }

    public void updateSameAweme(Aweme aweme) {
        if (aweme != null && C6319n.m19594a(aweme.aid, this.aid)) {
            update(aweme);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aweme)) {
            return false;
        }
        Aweme aweme = (Aweme) obj;
        if (!TextUtils.equals(this.aid, aweme.aid) || this.userDigg != aweme.userDigg || !C23480h.m77087a(this.status, aweme.status) || !C23480h.m77087a(this.statistics, aweme.statistics)) {
            return false;
        }
        return true;
    }

    public List<String> getRawAdPlayNodeTrackUrlList(int i) {
        if (getAwemeRawAd() == null) {
            return null;
        }
        List<AdNodeTrackUrl> adNodeTrackUrlList = getAwemeRawAd().getAdNodeTrackUrlList();
        if (C6307b.m19566a((Collection<T>) adNodeTrackUrlList)) {
            return null;
        }
        for (AdNodeTrackUrl adNodeTrackUrl : adNodeTrackUrlList) {
            if (adNodeTrackUrl.percent == i) {
                return adNodeTrackUrl.urlList;
            }
        }
        return null;
    }

    public void update(Aweme aweme) {
        String str;
        String str2;
        long j;
        Boolean bool;
        User user;
        String str3;
        AwemeStatus awemeStatus;
        List<Challenge> list;
        Music music2;
        Video video2;
        String str4;
        List<TextExtraStruct> list2;
        MicroAppInfo microAppInfo2;
        NewFaceStickerBean newFaceStickerBean;
        String str5;
        List<LongVideo> list3;
        VideoControl videoControl2;
        if (aweme != null) {
            if (TextUtils.isEmpty(aweme.aid)) {
                str = this.aid;
            } else {
                str = aweme.aid;
            }
            this.aid = str;
            if (aweme.desc == null) {
                str2 = this.desc;
            } else {
                str2 = aweme.desc;
            }
            this.desc = str2;
            if (aweme.createTime == 0) {
                j = this.createTime;
            } else {
                j = aweme.createTime;
            }
            this.createTime = j;
            if (this.author == null) {
                bool = null;
            } else {
                bool = this.author.isHasUnreadStory();
            }
            if (aweme.author == null) {
                user = this.author;
            } else {
                user = aweme.author;
            }
            this.author = user;
            if (!(bool == null || this.author == null || this.author.isHasUnreadStory() != null)) {
                this.author.setHasUnreadStory(bool.booleanValue());
            }
            if (aweme.commerceConfigDataList != null && !aweme.commerceConfigDataList.isEmpty()) {
                this.commerceConfigDataList = aweme.commerceConfigDataList;
            }
            if (TextUtils.isEmpty(aweme.shareUrl)) {
                str3 = this.shareUrl;
            } else {
                str3 = aweme.shareUrl;
            }
            this.shareUrl = str3;
            this.userDigg = aweme.userDigg;
            this.statistics = aweme.statistics;
            if (aweme.status == null) {
                awemeStatus = this.status;
            } else {
                awemeStatus = aweme.status;
            }
            this.status = awemeStatus;
            if (aweme.challengeList == null) {
                list = this.challengeList;
            } else {
                list = aweme.challengeList;
            }
            this.challengeList = list;
            if (aweme.music == null) {
                music2 = this.music;
            } else {
                music2 = aweme.music;
            }
            this.music = music2;
            if (aweme.video == null) {
                video2 = this.video;
            } else {
                video2 = aweme.video;
            }
            this.video = video2;
            if (TextUtils.isEmpty(aweme.extra)) {
                str4 = this.extra;
            } else {
                str4 = aweme.extra;
            }
            this.extra = str4;
            if (aweme.textExtra == null) {
                list2 = this.textExtra;
            } else {
                list2 = aweme.textExtra;
            }
            this.textExtra = list2;
            this.rate = aweme.rate;
            this.starAtlasOrderId = aweme.starAtlasOrderId;
            this.isFantasy = aweme.isFantasy;
            this.labelTop = aweme.labelTop;
            this.labelLarge = aweme.labelLarge;
            this.labelThumb = aweme.labelThumb;
            this.shareInfo = aweme.shareInfo;
            this.originAuthor = aweme.originAuthor;
            this.musicStarter = aweme.musicStarter;
            this.mLabelMusicStarterText = aweme.mLabelMusicStarterText;
            this.mLabelOriginAuthorText = aweme.mLabelOriginAuthorText;
            this.isHashTag = aweme.isHashTag;
            this.videoLabels = aweme.videoLabels;
            this.poiStruct = aweme.poiStruct;
            this.isAd = aweme.isAd;
            this.awemeType = aweme.awemeType;
            this.collectStatus = aweme.collectStatus;
            this.awemeRawAd = aweme.awemeRawAd;
            this.specialSticker = aweme.specialSticker;
            this.mLiveAwesomeSplashInfo = aweme.mLiveAwesomeSplashInfo;
            this.videoLabels = aweme.videoLabels;
            this.textVideoLabels = aweme.textVideoLabels;
            this.textTopLabels = aweme.textTopLabels;
            this.imageInfos = aweme.imageInfos;
            this.awemeRiskModel = aweme.awemeRiskModel;
            this.cmtSwt = aweme.cmtSwt;
            this.canPlay = aweme.canPlay;
            this.scenario = aweme.scenario;
            this.position = aweme.position;
            this.lawCriticalCountry = aweme.lawCriticalCountry;
            this.room = aweme.room;
            this.adSchedule = aweme.adSchedule;
            this.simplePromotionsString = aweme.simplePromotionsString;
            this.feedCount = aweme.feedCount;
            this.preventDownload = aweme.preventDownload;
            this.forwardItem = aweme.forwardItem;
            this.forwardItemId = aweme.forwardItemId;
            this.forwardCommentId = aweme.forwardCommentId;
            this.preForwardId = aweme.preForwardId;
            this.withPromotionalMusic = aweme.withPromotionalMusic;
            this.linkAdData = aweme.linkAdData;
            this.starAtlasInfo = aweme.starAtlasInfo;
            this.awemeNationalTask = aweme.awemeNationalTask;
            this.activityPendant = aweme.activityPendant;
            this.xiGuaTask = aweme.xiGuaTask;
            if (aweme.microAppInfo == null) {
                microAppInfo2 = this.microAppInfo;
            } else {
                microAppInfo2 = aweme.microAppInfo;
            }
            this.microAppInfo = microAppInfo2;
            if (aweme.stickerEntranceInfo == null) {
                newFaceStickerBean = this.stickerEntranceInfo;
            } else {
                newFaceStickerBean = aweme.stickerEntranceInfo;
            }
            this.stickerEntranceInfo = newFaceStickerBean;
            if (TextUtils.isEmpty(aweme.stickerIDs)) {
                str5 = this.stickerIDs;
            } else {
                str5 = aweme.stickerIDs;
            }
            this.stickerIDs = str5;
            this.hotListStruct = aweme.hotListStruct;
            if (aweme.longVideos == null) {
                list3 = this.longVideos;
            } else {
                list3 = aweme.longVideos;
            }
            this.longVideos = list3;
            this.takeDownReason = aweme.takeDownReason;
            this.takeDownDesc = aweme.takeDownDesc;
            this.starRecommendTag = aweme.starRecommendTag;
            this.adOrderId = aweme.adOrderId;
            this.downloadWithoutWatermark = aweme.downloadWithoutWatermark;
            this.openPlatformName = aweme.openPlatformName;
            if (!C6307b.m19566a((Collection<T>) aweme.interactStickerStructs)) {
                this.interactStickerStructs = aweme.interactStickerStructs;
            }
            this.originCommentIds = aweme.originCommentIds;
            this.duetSetting = aweme.duetSetting;
            this.reactSetting = aweme.reactSetting;
            this.isEffectDesigner = aweme.isEffectDesigner;
            this.enableTopView = aweme.enableTopView;
            this.commentSetting = aweme.commentSetting;
            if (aweme.videoControl == null) {
                videoControl2 = this.videoControl;
            } else {
                videoControl2 = aweme.videoControl;
            }
            this.videoControl = videoControl2;
            this.distributeType = aweme.distributeType;
            this.mixInfo = aweme.mixInfo;
            if (aweme.getMobParams() != null) {
                this.mMobParams = aweme.getMobParams();
            }
            if (!TextUtils.isEmpty(aweme.getRateScore())) {
                this.rateScore = aweme.getRateScore();
            }
            if (aweme.getCommerceVideoAuthInfo() != null) {
                this.mCommerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            }
            this.uploadMiscInfoStructStr = aweme.uploadMiscInfoStructStr;
            this.cacheAvUploadMiscInfoStruct = AVUploadMiscInfoStruct.createStruct(this.uploadMiscInfoStructStr);
            this.feedRelationLabel = aweme.feedRelationLabel;
        }
    }

    private void setVr(VideoUrlModel videoUrlModel, boolean z) {
        if (videoUrlModel != null) {
            videoUrlModel.setVr(z);
        }
    }

    public void appendMobParam(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.mMobParams == null) {
                this.mMobParams = new HashMap<>();
            }
            this.mMobParams.put(str, str2);
        }
    }
}
