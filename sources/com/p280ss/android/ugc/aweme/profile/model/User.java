package com.p280ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.commerce.CommerceInfo;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.music.OriginalMusician;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.User */
public class User implements Serializable, Cloneable {
    public static final int UNLIVE = 0;
    @C6593c(mo15949a = "accept_private_policy")
    public boolean acceptPrivatePolicy;
    @C6593c(mo15949a = "account_region")
    public String accountRegion;
    @C6593c(mo15949a = "ad_cover_title")
    public AdCoverTitle adCoverTitle;
    @C6593c(mo15949a = "ad_cover_url")
    public List<UrlModel> adCoverUrl;
    @C6593c(mo15949a = "ad_order_id")
    public String adOrderId;
    @C6593c(mo15949a = "allowStatus")
    public int allowStatus;
    @C6593c(mo15949a = "authority_status")
    public long authorityStatus;
    @C6593c(mo15949a = "avatar_decoration")
    public AvatarDecoration avatarDecoration;
    @C6593c(mo15949a = "avatar_larger")
    public UrlModel avatarLarger;
    @C6593c(mo15949a = "avatar_medium")
    public UrlModel avatarMedium;
    @C6593c(mo15949a = "avatar_pendant_larger")
    public UrlModel avatarPendantLarger;
    @C6593c(mo15949a = "avatar_pendant_medium")
    public UrlModel avatarPendantMedium;
    @C6593c(mo15949a = "avatar_pendant_thumb")
    public UrlModel avatarPendantThumb;
    @C6593c(mo15949a = "avatar_thumb")
    public UrlModel avatarThumb;
    @C6593c(mo15949a = "avatar_update_reminder")
    public boolean avatarUpdateReminder;
    @C6593c(mo15949a = "video_icon")
    public UrlModel avatarVideoUri;
    @C6593c(mo15949a = "aweme_count")
    public int awemeCount;
    @C6593c(mo15949a = "aweme_cover")
    public UserAwemeCover awemeCover;
    @C6593c(mo15949a = "bind_phone")
    public String bindPhone;
    @C6593c(mo15949a = "bio_email")
    public String bioEmail;
    @C6593c(mo15949a = "bio_secure_url")
    public String bioSecureUrl;
    @C6593c(mo15949a = "bio_url")
    public String bioUrl;
    @C6593c(mo15949a = "birthday")
    public String birthday;
    @C6593c(mo15949a = "birthday_hide_level")
    public int birthdayHideLevel;
    @C6593c(mo15949a = "brand_info")
    public BlueVBrandInfo brandInfo;
    @C6593c(mo15949a = "can_modify_school_info")
    public boolean canModifySchoolInfo;
    @C6593c(mo15949a = "cha_list")
    public List<Challenge> challengeList;
    @C6593c(mo15949a = "location")
    public String city;
    @C6593c(mo15949a = "city")
    public String cityName;
    @C6593c(mo15949a = "collect_count")
    public int collectCount;
    @C6593c(mo15949a = "college_name")
    public String collegeName;
    @C6593c(mo15949a = "comment_filter_status")
    public int commentFilterStatus;
    @C6593c(mo15949a = "comment_setting")
    public int commentSetting;
    @C6593c(mo15949a = "commerce_info")
    public CommerceInfo commerceInfo;
    @C6593c(mo15949a = "commerce_permissions")
    public CommercePermissionStruct commercePermission;
    @C6593c(mo15949a = "commerce_user_info")
    public CommerceUserInfo commerceUserInfo;
    @C6593c(mo15949a = "commerce_user_level")
    public int commerceUserLevel;
    @C6593c(mo15949a = "constellation")
    public int constellation;
    @C6593c(mo15949a = "country")
    public String country;
    @C6593c(mo15949a = "cover_url")
    public List<UrlModel> coverUrls;
    @C6593c(mo15949a = "create_time")
    public Long createTime;
    @C6593c(mo15949a = "custom_verify")
    public String customVerify;
    @C6593c(mo15949a = "display_wvalantine_activity_entry")
    public boolean displayWvalantineActivityEntry;
    @C6593c(mo15949a = "district")
    public String district;
    @C6593c(mo15949a = "dongtai_count")
    public int dongtai_count;
    @C6593c(mo15949a = "dou_plus_share_location")
    public int douPlusShareLocation;
    @C6593c(mo15949a = "download_setting")
    public int downloadSetting;
    @C6593c(mo15949a = "duet_setting")
    public int duetSetting;
    @C6593c(mo15949a = "education")
    public int education;
    @C6593c(mo15949a = "effect_detail")
    public EffectArtistDetail effectArtistDetail;
    @C6593c(mo15949a = "email")
    public String email;
    @C6593c(mo15949a = "enroll_year")
    public String enrollYear;
    @C6593c(mo15949a = "enterprise_verify_reason")
    public String enterpriseVerifyReason;
    @C6593c(mo15949a = "mplatform_followers_count")
    public int fansCount;
    @C6593c(mo15949a = "favoriting_count")
    public int favoritingCount;
    @C6593c(mo15949a = "fb_expire_time")
    public long fbExpireTime;
    @C6593c(mo15949a = "follow_status")
    public int followStatus;
    @C6593c(mo15949a = "follower_count")
    public int followerCount;
    @C6593c(mo15949a = "followers_detail")
    public List<FollowerDetail> followerDetailList;
    @C6593c(mo15949a = "follower_status")
    public int followerStatus;
    @C6593c(mo15949a = "following_count")
    public int followingCount;
    @C6593c(mo15949a = "force_private_account")
    public boolean forcePrivateAccount;
    @C6593c(mo15949a = "gender")
    public int gender;
    @C6593c(mo15949a = "google_account")
    public String googleAccount;
    @C6593c(mo15949a = "has_email")
    public boolean hasEmail;
    @C6593c(mo15949a = "has_facebook_token")
    public boolean hasFacebookToken;
    @C6593c(mo15949a = "has_activity_medal")
    public boolean hasMedal;
    @C6593c(mo15949a = "has_orders")
    public boolean hasOrders;
    @C6593c(mo15949a = "has_story")
    public boolean hasStory;
    @C6593c(mo15949a = "has_twitter_token")
    public boolean hasTwitterToken;
    @C6593c(mo15949a = "has_unread_story")
    public Boolean hasUnreadStory;
    @C6593c(mo15949a = "has_youtube_token")
    public boolean hasYoutubeToken;
    @C6593c(mo15949a = "hide_location")
    public boolean hideCity;
    @C6593c(mo15949a = "hide_following_follower_list")
    public int hideFollowingFollowerList;
    @C6593c(mo15949a = "hide_search")
    public boolean hideSearch;
    @C6593c(mo15949a = "homepage_bottom_toast")
    public List<HomePageBottomToast> homepageBottomToast;
    @C6593c(mo15949a = "honor_info")
    public HonorStruct honorStruct;
    @C6593c(mo15949a = "ins_id")
    public String insId;
    @C6593c(mo15949a = "is_activity_user")
    public boolean isActivityUser;
    @C6593c(mo15949a = "is_ad_fake")
    public boolean isAdFake;
    @C6593c(mo15949a = "is_binded_weibo")
    public boolean isBindedWeibo;
    @C6593c(mo15949a = "is_block")
    public boolean isBlock;
    @C6593c(mo15949a = "is_blocked")
    public boolean isBlocked;
    @C6593c(mo15949a = "content_language_already_popup")
    public boolean isContentLanguageDialogShown;
    @C6593c(mo15949a = "has_insights")
    public boolean isCreater;
    @C6593c(mo15949a = "is_discipline_member")
    public boolean isDisciplineMember;
    @C6593c(mo15949a = "is_effect_artist")
    public boolean isEffectArtist;
    @C6593c(mo15949a = "is_email_verified")
    public boolean isEmailVerified;
    @C6593c(mo15949a = "is_flowcard_member")
    public boolean isFlowcardMember;
    @C6593c(mo15949a = "is_minor")
    public boolean isMinor;
    public boolean isNewRecommend;
    @C6593c(mo15949a = "douplus_old_user")
    public boolean isOldDouplusUser;
    @C6593c(mo15949a = "is_phone_binded")
    public boolean isPhoneBinded;
    @C6593c(mo15949a = "is_pro_account")
    public boolean isProAccount;
    @C6593c(mo15949a = "is_star")
    public boolean isStar;
    @C6593c(mo15949a = "sync_to_toutiao")
    public int isSyncToutiao;
    @C6593c(mo15949a = "is_verified'")
    public boolean isVerified;
    @C6593c(mo15949a = "iso_country_code")
    public String isoCountryCode;
    @C6593c(mo15949a = "language")
    public String language;
    @C6593c(mo15949a = "latest_order_time")
    public Long latestOrderTime;
    @C6593c(mo15949a = "new_story_cover")
    public List<UrlModel> latestStoryCover;
    @C6593c(mo15949a = "live_agreement")
    public int liveAgreement;
    @C6593c(mo15949a = "live_commerce")
    public boolean liveCommerce;
    @C6593c(mo15949a = "login_platform")
    public int loginPlatform;
    public int mAtType;
    @C6593c(mo15949a = "general_permission")
    public GeneralPermission mGeneralPermission;
    @C6593c(mo15949a = "hot_list")
    public HotListStruct mHotListStruct;
    @C6593c(mo15949a = "is_gov_media_vip")
    public boolean mIsGovMediaVip;
    @C6593c(mo15949a = "name_field")
    public String nameField;
    @C6593c(mo15949a = "need_addr_card")
    public boolean needAddrCard;
    @C6593c(mo15949a = "need_points")
    public List<NeedPointStruct> needPoints;
    @C6593c(mo15949a = "need_recommend")
    public boolean needRecommend;
    @C6593c(mo15949a = "neiguang_shield")
    public int neiguangShield;
    @C6593c(mo15949a = "nickname")
    public String nickname;
    @C6593c(mo15949a = "nickname_update_reminder")
    public boolean nicknameUpdateReminder;
    @C6593c(mo15949a = "notify_private_account")
    public int notifyPrivateAccount;
    @C6593c(mo15949a = "original_musician")
    public OriginalMusician originalMusician;
    @C6593c(mo15949a = "platform_sync_info")
    public PlatformInfo[] platformInfos;
    @C6593c(mo15949a = "post_default_download_setting")
    public boolean postDefaultDownloadSetting;
    @C6593c(mo15949a = "prevent_download")
    public boolean preventDownload;
    @C6593c(mo15949a = "private_aweme_count")
    public int privateAwemeCount;
    @C6593c(mo15949a = "profile_completion")
    public float profileCompletion;
    @C6593c(mo15949a = "profile_pv")
    public long profilePv;
    @C6593c(mo15949a = "province")
    public String province;
    @C6593c(mo15949a = "quick_shop_info")
    public QuickShopInfo quickShopInfo;
    @C6593c(mo15949a = "r_fans_group_info")
    public RocketFansGroupInfo rFansGroupInfo;
    @C6593c(mo15949a = "item_list")
    public List<RecommendAwemeItem> recommendAwemeItems;
    @C6593c(mo15949a = "recommend_reason")
    public String recommendReason;
    @C6593c(mo15949a = "recommend_reason_relation")
    public String recommendReasonRelation;
    @C6593c(mo15949a = "recommend_score")
    public double recommendScore;
    @C6593c(mo15949a = "region")
    public String region;
    @C6593c(mo15949a = "registerStatus")
    public int registerStatus;
    @C6593c(mo15949a = "register_time")
    public long registerTime;
    @C6593c(mo15949a = "relation_label")
    public String relationLabel;
    @C6593c(mo15949a = "relative_users")
    public List<RelativeUserInfo> relativeUserInfos;
    @C6593c(mo15949a = "remark_name")
    public String remarkName;
    @C6593c(mo15949a = "rid")
    public String requestId;
    @C6593c(mo15949a = "room_cover")
    public UrlModel roomCover;
    @C6593c(mo15949a = "room_data")
    public String roomData;
    @C6593c(mo15949a = "room_id")
    public long roomId;
    @C6593c(mo15949a = "room_type_tag")
    public String roomTypeTag;
    @C6593c(mo15949a = "school_visible")
    public int schoolInfoShowRange;
    @C6593c(mo15949a = "school_name")
    public String schoolName;
    @C6593c(mo15949a = "school_poi_id")
    public String schoolPoiId;
    @C6593c(mo15949a = "school_type")
    public int schoolType;
    @C6593c(mo15949a = "sec_uid")
    public String secUid;
    @C6593c(mo15949a = "secret")
    public boolean secret;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "shield_comment_notice")
    public int shieldCommentNotice;
    @C6593c(mo15949a = "shield_digg_notice")
    public int shieldDiggNotice;
    @C6593c(mo15949a = "shield_follow_notice")
    public int shieldFollowNotice;
    @C6593c(mo15949a = "shop_micro_app")
    public String shopMicroApp;
    @C6593c(mo15949a = "short_id")
    public String shortId;
    @C6593c(mo15949a = "show_artist_playlist")
    public int showArtistPlaylist;
    @C6593c(mo15949a = "show_favorite_list")
    public boolean showFavoriteList;
    @C6593c(mo15949a = "show_gender_strategy")
    public int showGenderStrategy;
    @C6593c(mo15949a = "show_image_bubble")
    public boolean showImageBubble;
    @C6593c(mo15949a = "signature")
    public String signature;
    @C6593c(mo15949a = "signature_language")
    public String signatureLanguage;
    @C6593c(mo15949a = "sprint_support_user_info")
    public HotSearchSprintStruct sprintSupportUserInfo;
    @C6593c(mo15949a = "star_billboard_rank")
    public int starBillboardRank;
    @C6593c(mo15949a = "star_use_new_download")
    public boolean starUseNewDownload;
    @C6593c(mo15949a = "life_story_block")
    public StoryBlockInfo storyBlockInfo;
    @C6593c(mo15949a = "story_count")
    public int storyCount;
    @C6593c(mo15949a = "story_open")
    public boolean storyOpen;
    @C6593c(mo15949a = "tab_settings")
    public TabSetting tabSetting;
    @C6593c(mo15949a = "profile_tab_type")
    public int tabType;
    @C6593c(mo15949a = "third_name")
    public String thirdName;
    @C6593c(mo15949a = "total_favorited")
    public long totalFavorited;
    @C6593c(mo15949a = "tw_expire_time")
    public long twExpireTime;
    @C6593c(mo15949a = "twitter_id")
    public String twitterId;
    @C6593c(mo15949a = "twitter_name")
    public String twitterName;
    @C6593c(mo15949a = "type_label")
    public long[] typeLabels;
    @C6593c(mo15949a = "uid")
    public String uid;
    @C6593c(mo15949a = "unique_id")
    public String uniqueId;
    @C6593c(mo15949a = "unique_id_modify_time")
    public long unique_id_modify_time;
    @C6593c(mo15949a = "urge_detail")
    public UrgeStruct urgeDetail;
    @C6593c(mo15949a = "user_canceled")
    public boolean userCancelled;
    @C6593c(mo15949a = "pay_grade")
    public UserHonor userHonor;
    @C6593c(mo15949a = "user_mode")
    public int userMode = -1;
    @C6593c(mo15949a = "user_period")
    public int userPeriod;
    @C6593c(mo15949a = "user_rate")
    public int userRate;
    @C6593c(mo15949a = "user_rate_remind_info")
    public UserRateRemindInfo userRateRemindInfo;
    @C6593c(mo15949a = "user_story_count")
    public int userStoryCount;
    @C6593c(mo15949a = "vcd_schema_url")
    public String vcdSchemaUrl;
    @C6593c(mo15949a = "verification_badge_type")
    public int verificationBadgeType;
    @C6593c(mo15949a = "verification_type")
    public int verificationType;
    @C6593c(mo15949a = "verify_info")
    public String verifyInfo;
    @C6593c(mo15949a = "realname_verify_status", mo15950b = {"live_verify"})
    public int verifyStatus;
    @C6593c(mo15949a = "video_cover")
    public VideoCover videoCover;
    @C6593c(mo15949a = "watch_status")
    public int watchStatus;
    @C6593c(mo15949a = "weibo_name")
    public String weiboNickname;
    @C6593c(mo15949a = "weibo_schema")
    public String weiboSchema;
    @C6593c(mo15949a = "weibo_url")
    public String weiboUrl;
    @C6593c(mo15949a = "weibo_verify")
    public String weiboVerify;
    @C6593c(mo15949a = "with_commerce_enterprise_tab_entry")
    public boolean withCommerceEnterpriseTabEntry;
    @C6593c(mo15949a = "with_commerce_entry")
    public boolean withCommerceEntry;
    @C6593c(mo15949a = "with_commerce_newbie_task")
    public boolean withCommerceNewbieTask;
    @C6593c(mo15949a = "with_dou_entry")
    public boolean withDouEntry = true;
    @C6593c(mo15949a = "with_douplus_entry")
    public boolean withDouplusEntry;
    @C6593c(mo15949a = "with_fusion_shop_entry")
    public boolean withFusionShopEntry;
    @C6593c(mo15949a = "with_item_commerce_entry")
    public boolean withItemCommerceEntry;
    @C6593c(mo15949a = "with_luban_entry")
    public boolean withLubanEntry;
    @C6593c(mo15949a = "with_new_goods")
    public boolean withNewGoods;
    @C6593c(mo15949a = "with_shop_entry")
    public boolean withShopEntry;
    @C6593c(mo15949a = "with_star_atlas_entry")
    public boolean withStarAtlasEntry;
    @C6593c(mo15949a = "wx_tag")
    public int wxTag;
    @C6593c(mo15949a = "xmas_unlock_count")
    public int xmasUnlockCount;
    @C6593c(mo15949a = "youtube_last_refresh_time")
    public long youTubeLastRefreshTime;
    @C6593c(mo15949a = "youtube_refresh_token")
    public String youTubeRefreshToken;
    @C6593c(mo15949a = "youtube_channel_id")
    public String youtubeChannelId;
    @C6593c(mo15949a = "youtube_channel_title")
    public String youtubeChannelTitle;
    @C6593c(mo15949a = "youtube_expire_time")
    public long youtubeExpireTime;

    /* renamed from: com.ss.android.ugc.aweme.profile.model.User$BirthdayHideLevel */
    public @interface BirthdayHideLevel {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.model.User$ProfileTabType */
    public interface ProfileTabType {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.model.User$ShowArtistListType */
    public interface ShowArtistListType {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.model.User$VerificationType */
    public interface VerificationType {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.model.User$VerifyStatus */
    public interface VerifyStatus {
    }

    public boolean avatarUpdateReminder() {
        return this.avatarUpdateReminder;
    }

    public String getAccountRegion() {
        return this.accountRegion;
    }

    public AdCoverTitle getAdCoverTitle() {
        return this.adCoverTitle;
    }

    public List<UrlModel> getAdCoverUrl() {
        return this.adCoverUrl;
    }

    public String getAdOrderId() {
        return this.adOrderId;
    }

    public int getAllowStatus() {
        return this.allowStatus;
    }

    public int getAtType() {
        return this.mAtType;
    }

    public long getAuthorityStatus() {
        return this.authorityStatus;
    }

    public AvatarDecoration getAvatarDecoration() {
        return this.avatarDecoration;
    }

    public UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public UrlModel getAvatarPendantLarger() {
        return this.avatarPendantLarger;
    }

    public UrlModel getAvatarPendantMedium() {
        return this.avatarPendantMedium;
    }

    public UrlModel getAvatarPendantThumb() {
        return this.avatarPendantThumb;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public UrlModel getAvatarVideoUri() {
        return this.avatarVideoUri;
    }

    public int getAwemeCount() {
        return this.awemeCount;
    }

    public UserAwemeCover getAwemeCover() {
        return this.awemeCover;
    }

    public String getBindPhone() {
        return this.bindPhone;
    }

    public String getBioEmail() {
        return this.bioEmail;
    }

    public String getBioSecureUrl() {
        return this.bioSecureUrl;
    }

    public String getBioUrl() {
        return this.bioUrl;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public int getBirthdayHideLevel() {
        return this.birthdayHideLevel;
    }

    public BlueVBrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public String getCity() {
        return this.city;
    }

    public String getCityName() {
        return this.cityName;
    }

    public int getCollectCount() {
        return this.collectCount;
    }

    public String getCollegeName() {
        return this.collegeName;
    }

    public int getCommentFilterStatus() {
        return this.commentFilterStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public CommerceInfo getCommerceInfo() {
        return this.commerceInfo;
    }

    public CommercePermissionStruct getCommercePermission() {
        return this.commercePermission;
    }

    public CommerceUserInfo getCommerceUserInfo() {
        return this.commerceUserInfo;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public int getConstellation() {
        return this.constellation;
    }

    public String getCountry() {
        return this.country;
    }

    public List<UrlModel> getCoverUrls() {
        return this.coverUrls;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getDongtaiCount() {
        return this.dongtai_count;
    }

    public int getDouPlusShareLocation() {
        return this.douPlusShareLocation;
    }

    public int getDownloadSetting() {
        return this.downloadSetting;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public int getEducation() {
        return this.education;
    }

    public EffectArtistDetail getEffectArtistDetail() {
        return this.effectArtistDetail;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEnrollYear() {
        return this.enrollYear;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public int getFavoritingCount() {
        return this.favoritingCount;
    }

    public long getFbExpireTime() {
        return this.fbExpireTime;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public int getFollowerCount() {
        return this.followerCount;
    }

    public List<FollowerDetail> getFollowerDetailList() {
        return this.followerDetailList;
    }

    public int getFollowerStatus() {
        return this.followerStatus;
    }

    public int getFollowingCount() {
        return this.followingCount;
    }

    public int getGender() {
        return this.gender;
    }

    public GeneralPermission getGeneralPermission() {
        return this.mGeneralPermission;
    }

    public String getGoogleAccount() {
        return this.googleAccount;
    }

    public long getHandleModified() {
        return this.unique_id_modify_time;
    }

    public int getHideFollowingFollowerList() {
        return this.hideFollowingFollowerList;
    }

    public List<HomePageBottomToast> getHomepageBottomToast() {
        return this.homepageBottomToast;
    }

    public HonorStruct getHonorStruct() {
        return this.honorStruct;
    }

    public String getInsId() {
        return this.insId;
    }

    public boolean getIsCreater() {
        return this.isCreater;
    }

    public boolean getIsOldDouPlusUser() {
        return this.isOldDouplusUser;
    }

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public String getLanguage() {
        return this.language;
    }

    public List<UrlModel> getLatestStoryCover() {
        return this.latestStoryCover;
    }

    public int getLiveAgreement() {
        return this.liveAgreement;
    }

    public int getLoginPlatform() {
        return this.loginPlatform;
    }

    public String getNameField() {
        return this.nameField;
    }

    public List<NeedPointStruct> getNeedPoints() {
        return this.needPoints;
    }

    public int getNeiguangShield() {
        return this.neiguangShield;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public OriginalMusician getOriginalMusician() {
        return this.originalMusician;
    }

    public PlatformInfo[] getPlatformInfos() {
        return this.platformInfos;
    }

    public int getPrivateAwemeCount() {
        return this.privateAwemeCount;
    }

    public float getProfileCompletion() {
        return this.profileCompletion;
    }

    public long getProfilePv() {
        return this.profilePv;
    }

    public String getProvince() {
        return this.province;
    }

    public QuickShopInfo getQuickShopInfo() {
        return this.quickShopInfo;
    }

    public List<RecommendAwemeItem> getRecommendAwemeItems() {
        return this.recommendAwemeItems;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRecommendReasonRelation() {
        return this.recommendReasonRelation;
    }

    public double getRecommendScore() {
        return this.recommendScore;
    }

    public String getRegion() {
        return this.region;
    }

    public int getRegisterStatus() {
        return this.registerStatus;
    }

    public long getRegisterTime() {
        return this.registerTime;
    }

    public String getRelationLabel() {
        return this.relationLabel;
    }

    public List<RelativeUserInfo> getRelativeUserInfos() {
        return this.relativeUserInfos;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public String getRooomData() {
        return this.roomData;
    }

    public int getSchoolInfoShowRange() {
        return this.schoolInfoShowRange;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public String getSchoolPoiId() {
        return this.schoolPoiId;
    }

    public int getSchoolType() {
        return this.schoolType;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShieldCommentNotice() {
        return this.shieldCommentNotice;
    }

    public int getShieldDiggNotice() {
        return this.shieldDiggNotice;
    }

    public int getShieldFollowNotice() {
        return this.shieldFollowNotice;
    }

    public String getShopMicroApp() {
        return this.shopMicroApp;
    }

    public String getShortId() {
        return this.shortId;
    }

    public int getShowArtistPlaylist() {
        return this.showArtistPlaylist;
    }

    public int getShowGenderStrategy() {
        return this.showGenderStrategy;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSignatureLanguage() {
        return this.signatureLanguage;
    }

    public HotSearchSprintStruct getSprintSupportUserInfo() {
        return this.sprintSupportUserInfo;
    }

    public int getStarBillboardRank() {
        return this.starBillboardRank;
    }

    public StoryBlockInfo getStoryBlockInfo() {
        return this.storyBlockInfo;
    }

    public int getStoryCount() {
        return this.storyCount;
    }

    public TabSetting getTabSetting() {
        return this.tabSetting;
    }

    public int getTabType() {
        return this.tabType;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public long getTotalFavorited() {
        return this.totalFavorited;
    }

    public long getTwExpireTime() {
        return this.twExpireTime;
    }

    public String getTwitterId() {
        return this.twitterId;
    }

    public String getTwitterName() {
        return this.twitterName;
    }

    public long[] getTypeLabels() {
        return this.typeLabels;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public UrgeStruct getUrgeDetail() {
        return this.urgeDetail;
    }

    public UserHonor getUserHonor() {
        return this.userHonor;
    }

    public int getUserMode() {
        return this.userMode;
    }

    public int getUserPeriod() {
        return this.userPeriod;
    }

    public int getUserRate() {
        return this.userRate;
    }

    public UserRateRemindInfo getUserRateRemindInfo() {
        return this.userRateRemindInfo;
    }

    public int getUserStoryCount() {
        return this.userStoryCount;
    }

    public int getVerificationBadgeType() {
        return this.verificationBadgeType;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public String getVerifyInfo() {
        return this.verifyInfo;
    }

    public int getVerifyStatus() {
        return this.verifyStatus;
    }

    public VideoCover getVideoCover() {
        return this.videoCover;
    }

    public int getWatchwStatus() {
        return this.watchStatus;
    }

    public String getWeiboNickname() {
        return this.weiboNickname;
    }

    public String getWeiboSchema() {
        return this.weiboSchema;
    }

    public String getWeiboUrl() {
        return this.weiboUrl;
    }

    public String getWeiboVerify() {
        return this.weiboVerify;
    }

    public boolean getWithLubanEntry() {
        return this.withLubanEntry;
    }

    public int getWxTag() {
        return this.wxTag;
    }

    public int getXmasUnlockCount() {
        return this.xmasUnlockCount;
    }

    public long getYouTubeLastRefreshTime() {
        return this.youTubeLastRefreshTime;
    }

    public String getYouTubeRefreshToken() {
        return this.youTubeRefreshToken;
    }

    public String getYoutubeChannelId() {
        return this.youtubeChannelId;
    }

    public String getYoutubeChannelTitle() {
        return this.youtubeChannelTitle;
    }

    public long getYoutubeExpireTime() {
        return this.youtubeExpireTime;
    }

    public HotListStruct getmHotListStruct() {
        return this.mHotListStruct;
    }

    public RocketFansGroupInfo getrFansGroupInfo() {
        return this.rFansGroupInfo;
    }

    public boolean hasMedal() {
        return this.hasMedal;
    }

    public boolean isAcceptPrivatePolicy() {
        return this.acceptPrivatePolicy;
    }

    public boolean isActivityUser() {
        return this.isActivityUser;
    }

    public boolean isAdFake() {
        return this.isAdFake;
    }

    public boolean isBindedWeibo() {
        return this.isBindedWeibo;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public boolean isCanModifySchoolInfo() {
        return this.canModifySchoolInfo;
    }

    public boolean isContentLanguageDialogShown() {
        return this.isContentLanguageDialogShown;
    }

    public boolean isDisciplineMember() {
        return this.isDisciplineMember;
    }

    public boolean isDisplayWvalantineActivityEntry() {
        return this.displayWvalantineActivityEntry;
    }

    public boolean isEffectArtist() {
        return this.isEffectArtist;
    }

    public boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public boolean isFlowcardMember() {
        return this.isFlowcardMember;
    }

    public boolean isForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public boolean isGovMediaVip() {
        return this.mIsGovMediaVip;
    }

    public boolean isHasEmail() {
        return this.hasEmail;
    }

    public boolean isHasFacebookToken() {
        return this.hasFacebookToken;
    }

    public boolean isHasOrders() {
        return this.hasOrders;
    }

    public boolean isHasStory() {
        return this.hasStory;
    }

    public boolean isHasTwitterToken() {
        return this.hasTwitterToken;
    }

    public Boolean isHasUnreadStory() {
        return this.hasUnreadStory;
    }

    public boolean isHasYoutubeToken() {
        return this.hasYoutubeToken;
    }

    public boolean isHideCity() {
        return this.hideCity;
    }

    public boolean isHideSearch() {
        return this.hideSearch;
    }

    public boolean isLiveCommerce() {
        return this.liveCommerce;
    }

    public boolean isMinor() {
        return this.isMinor;
    }

    public boolean isNeedAddrCard() {
        return this.needAddrCard;
    }

    public boolean isNeedRecommend() {
        return this.needRecommend;
    }

    public boolean isNewRecommend() {
        return this.isNewRecommend;
    }

    public boolean isPhoneBinded() {
        return this.isPhoneBinded;
    }

    public boolean isPostDefaultDownloadSetting() {
        return this.postDefaultDownloadSetting;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isProAccount() {
        return this.isProAccount;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public boolean isShowFavoriteList() {
        return this.showFavoriteList;
    }

    public boolean isShowImageBubble() {
        return this.showImageBubble;
    }

    public boolean isStar() {
        return this.isStar;
    }

    public boolean isStarUseNewDownload() {
        return this.starUseNewDownload;
    }

    public boolean isStoryOpen() {
        return this.storyOpen;
    }

    public boolean isUserCancelled() {
        return this.userCancelled;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public boolean isWithCommerceEnterpriseTabEntry() {
        return this.withCommerceEnterpriseTabEntry;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public boolean isWithCommerceNewbieTask() {
        return this.withCommerceNewbieTask;
    }

    public boolean isWithDouEntry() {
        return this.withDouEntry;
    }

    public boolean isWithDouplusEntry() {
        return this.withDouplusEntry;
    }

    public boolean isWithFusionShopEntry() {
        return this.withFusionShopEntry;
    }

    public boolean isWithItemCommerceEntry() {
        return this.withItemCommerceEntry;
    }

    public boolean isWithNewGoods() {
        return this.withNewGoods;
    }

    public boolean isWithShopEntry() {
        return this.withShopEntry;
    }

    public boolean isWithStarAtlasEntry() {
        return this.withStarAtlasEntry;
    }

    public boolean nicknameUpdateReminder() {
        return this.nicknameUpdateReminder;
    }

    public boolean getIsSyncToutiao() {
        if (this.isSyncToutiao == 1) {
            return true;
        }
        return false;
    }

    public boolean hasSignLiveAgreement() {
        if (this.liveAgreement == 1) {
            return true;
        }
        return false;
    }

    public boolean isFacebookExpire() {
        return checkExpire(this.fbExpireTime);
    }

    public boolean isTwitterExpire() {
        return checkExpire(this.twExpireTime);
    }

    public boolean isYoutubeExpire() {
        return checkExpire(this.youtubeExpireTime);
    }

    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public long getCreateTime() {
        if (this.createTime == null) {
            return 0;
        }
        return this.createTime.longValue();
    }

    public long getLatestOrderTime() {
        if (this.latestOrderTime == null) {
            return 0;
        }
        return this.latestOrderTime.longValue();
    }

    public boolean hasAdEntry() {
        if (this.commerceUserInfo == null || !this.commerceUserInfo.hasAdEntry) {
            return false;
        }
        return true;
    }

    public boolean isLive() {
        if (this.roomId != 0) {
            return true;
        }
        return false;
    }

    public UrlModel getDefaultAdCoverUrl() {
        if (C6307b.m19566a((Collection<T>) this.adCoverUrl)) {
            return null;
        }
        return (UrlModel) this.adCoverUrl.get(0);
    }

    public String getLiveUid() {
        StringBuilder sb = new StringBuilder("live");
        sb.append(this.uid);
        return sb.toString();
    }

    public int hashCode() {
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
        int i21 = 0;
        if (this.uid != null) {
            i = this.uid.hashCode();
        } else {
            i = 0;
        }
        int i22 = i * 31;
        if (this.shortId != null) {
            i2 = this.shortId.hashCode();
        } else {
            i2 = 0;
        }
        int i23 = (i22 + i2) * 31;
        if (this.nickname != null) {
            i3 = this.nickname.hashCode();
        } else {
            i3 = 0;
        }
        int i24 = (((i23 + i3) * 31) + this.gender) * 31;
        if (this.signature != null) {
            i4 = this.signature.hashCode();
        } else {
            i4 = 0;
        }
        int i25 = (i24 + i4) * 31;
        if (this.birthday != null) {
            i5 = this.birthday.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 31;
        if (this.avatarLarger != null) {
            i6 = this.avatarLarger.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 31;
        if (this.avatarThumb != null) {
            i7 = this.avatarThumb.hashCode();
        } else {
            i7 = 0;
        }
        int i28 = (i27 + i7) * 31;
        if (this.avatarMedium != null) {
            i8 = this.avatarMedium.hashCode();
        } else {
            i8 = 0;
        }
        int i29 = (i28 + i8) * 31;
        if (this.avatarVideoUri != null) {
            i9 = this.avatarVideoUri.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (((((((((((((((((((((((i29 + i9) * 31) + (this.isVerified ? 1 : 0)) * 31) + this.allowStatus) * 31) + this.followStatus) * 31) + this.followerStatus) * 31) + this.watchStatus) * 31) + this.awemeCount) * 31) + this.followingCount) * 31) + this.followerCount) * 31) + this.collectCount) * 31) + this.favoritingCount) * 31) + this.registerStatus) * 31;
        if (this.thirdName != null) {
            i10 = this.thirdName.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (((((((i30 + i10) * 31) + (this.hideSearch ? 1 : 0)) * 31) + this.mAtType) * 31) + this.constellation) * 31;
        if (this.city != null) {
            i11 = this.city.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 31;
        if (this.weiboVerify != null) {
            i12 = this.weiboVerify.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 31;
        if (this.customVerify != null) {
            i13 = this.customVerify.hashCode();
        } else {
            i13 = 0;
        }
        int i34 = (i33 + i13) * 31;
        if (this.uniqueId != null) {
            i14 = this.uniqueId.hashCode();
        } else {
            i14 = 0;
        }
        int i35 = (i34 + i14) * 31;
        if (this.shareInfo != null) {
            i15 = this.shareInfo.hashCode();
        } else {
            i15 = 0;
        }
        int i36 = (i35 + i15) * 31;
        if (this.bindPhone != null) {
            i16 = this.bindPhone.hashCode();
        } else {
            i16 = 0;
        }
        int i37 = (((i36 + i16) * 31) + (this.hasEmail ? 1 : 0)) * 31;
        if (this.createTime != null) {
            i17 = this.createTime.hashCode();
        } else {
            i17 = 0;
        }
        int i38 = (((((((((((((((((i37 + i17) * 31) + (this.needRecommend ? 1 : 0)) * 31) + (this.hideCity ? 1 : 0)) * 31) + (this.secret ? 1 : 0)) * 31) + (this.preventDownload ? 1 : 0)) * 31) + (this.showImageBubble ? 1 : 0)) * 31) + this.commentSetting) * 31) + this.duetSetting) * 31) + this.downloadSetting) * 31;
        if (this.region != null) {
            i18 = this.region.hashCode();
        } else {
            i18 = 0;
        }
        int i39 = (i38 + i18) * 31;
        if (this.language != null) {
            i19 = this.language.hashCode();
        } else {
            i19 = 0;
        }
        int i40 = (i39 + i19) * 31;
        if (this.roomTypeTag != null) {
            i20 = this.roomTypeTag.hashCode();
        } else {
            i20 = 0;
        }
        int i41 = (((i40 + i20) * 31) + this.userStoryCount) * 31;
        if (this.latestOrderTime != null) {
            i21 = this.latestOrderTime.hashCode();
        }
        return i41 + i21;
    }

    public void setAcceptPrivatePolicy(boolean z) {
        this.acceptPrivatePolicy = z;
    }

    public void setAccountRegion(String str) {
        this.accountRegion = str;
    }

    public void setActivityUser(boolean z) {
        this.isActivityUser = z;
    }

    public void setAdCoverTitle(AdCoverTitle adCoverTitle2) {
        this.adCoverTitle = adCoverTitle2;
    }

    public void setAdCoverUrl(List<UrlModel> list) {
        this.adCoverUrl = list;
    }

    public void setAdFake(boolean z) {
        this.isAdFake = z;
    }

    public void setAdOrderId(String str) {
        this.adOrderId = str;
    }

    public void setAllowStatus(int i) {
        this.allowStatus = i;
    }

    public void setAtType(int i) {
        this.mAtType = i;
    }

    public void setAuthorityStatus(long j) {
        this.authorityStatus = j;
    }

    public void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public void setAvatarPendantLarger(UrlModel urlModel) {
        this.avatarPendantLarger = urlModel;
    }

    public void setAvatarPendantMedium(UrlModel urlModel) {
        this.avatarPendantMedium = urlModel;
    }

    public void setAvatarPendantThumb(UrlModel urlModel) {
        this.avatarPendantThumb = urlModel;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setAvatarUpdateReminder(boolean z) {
        this.avatarUpdateReminder = z;
    }

    public void setAvatarVideoUri(UrlModel urlModel) {
        this.avatarVideoUri = urlModel;
    }

    public void setAwemeCount(int i) {
        this.awemeCount = i;
    }

    public void setAwemeCover(UserAwemeCover userAwemeCover) {
        this.awemeCover = userAwemeCover;
    }

    public void setBindPhone(String str) {
        this.bindPhone = str;
    }

    public void setBindedWeibo(boolean z) {
        this.isBindedWeibo = z;
    }

    public void setBioEmail(String str) {
        this.bioEmail = str;
    }

    public void setBioSecureUrl(String str) {
        this.bioSecureUrl = str;
    }

    public void setBioUrl(String str) {
        this.bioUrl = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setBirthdayHideLevel(int i) {
        this.birthdayHideLevel = i;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public void setBrandInfo(BlueVBrandInfo blueVBrandInfo) {
        this.brandInfo = blueVBrandInfo;
    }

    public void setBroadcasterRoomId(long j) {
        this.roomId = j;
    }

    public void setCanModifySchoolInfo(boolean z) {
        this.canModifySchoolInfo = z;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setCollectCount(int i) {
        this.collectCount = i;
    }

    public void setCollegeName(String str) {
        this.collegeName = str;
    }

    public void setCommentFilterStatus(int i) {
        this.commentFilterStatus = i;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommerceInfo(CommerceInfo commerceInfo2) {
        this.commerceInfo = commerceInfo2;
    }

    public void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public void setConstellation(int i) {
        this.constellation = i;
    }

    public void setContentLanguageDialogShown(boolean z) {
        this.isContentLanguageDialogShown = z;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCoverUrls(List<UrlModel> list) {
        this.coverUrls = list;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setDisciplineMember(boolean z) {
        this.isDisciplineMember = z;
    }

    public void setDisplayWvalantineActivityEntry(boolean z) {
        this.displayWvalantineActivityEntry = z;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setDongtaiCount(int i) {
        this.dongtai_count = i;
    }

    public void setDouPlusShareLocation(int i) {
        this.douPlusShareLocation = i;
    }

    public void setDownloadSetting(int i) {
        this.downloadSetting = i;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setEducation(int i) {
        this.education = i;
    }

    public void setEffectArtist(boolean z) {
        this.isEffectArtist = z;
    }

    public void setEffectArtistDetail(EffectArtistDetail effectArtistDetail2) {
        this.effectArtistDetail = effectArtistDetail2;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmailVerified(boolean z) {
        this.isEmailVerified = z;
    }

    public void setEnrollYear(String str) {
        this.enrollYear = str;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setFansCount(int i) {
        this.fansCount = i;
    }

    public void setFavoritingCount(int i) {
        this.favoritingCount = i;
    }

    public void setFbExpireTime(long j) {
        this.fbExpireTime = j;
    }

    public void setFlowcardMember(boolean z) {
        this.isFlowcardMember = z;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setFollowerCount(int i) {
        this.followerCount = i;
    }

    public void setFollowerDetailList(List<FollowerDetail> list) {
        this.followerDetailList = list;
    }

    public void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public void setFollowingCount(int i) {
        this.followingCount = i;
    }

    public void setForcePrivateAccount(boolean z) {
        this.forcePrivateAccount = z;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setGoogleAccount(String str) {
        this.googleAccount = str;
    }

    public void setHandleModified(long j) {
        this.unique_id_modify_time = j;
    }

    public void setHasEmail(boolean z) {
        this.hasEmail = z;
    }

    public void setHasFacebookToken(boolean z) {
        this.hasFacebookToken = z;
    }

    public void setHasMedal(boolean z) {
        this.hasMedal = z;
    }

    public void setHasOrders(boolean z) {
        this.hasOrders = z;
    }

    public void setHasStory(boolean z) {
        this.hasStory = z;
    }

    public void setHasTwitterToken(boolean z) {
        this.hasTwitterToken = z;
    }

    public void setHasYoutubeToken(boolean z) {
        this.hasYoutubeToken = z;
    }

    public void setHideCity(boolean z) {
        this.hideCity = z;
    }

    public void setHideFollowingFollowerList(int i) {
        this.hideFollowingFollowerList = i;
    }

    public void setHideSearch(boolean z) {
        this.hideSearch = z;
    }

    public void setHonorStruct(HonorStruct honorStruct2) {
        this.honorStruct = honorStruct2;
    }

    public void setInsId(String str) {
        this.insId = str;
    }

    public void setIsCreater(boolean z) {
        this.isCreater = z;
    }

    public void setIsGovMediaVip(boolean z) {
        this.mIsGovMediaVip = z;
    }

    public void setIsOldDouplusUser(boolean z) {
        this.isOldDouplusUser = z;
    }

    public void setIsSyncToutiao(int i) {
        this.isSyncToutiao = i;
    }

    public void setIsoCountryCode(String str) {
        this.isoCountryCode = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLatestOrderTime(Long l) {
        this.latestOrderTime = l;
    }

    public void setLatestStoryCover(List<UrlModel> list) {
        this.latestStoryCover = list;
    }

    public void setLiveAgreement(int i) {
        this.liveAgreement = i;
    }

    public void setLoginPlatform(int i) {
        this.loginPlatform = i;
    }

    public void setMinor(boolean z) {
        this.isMinor = z;
    }

    public void setNameField(String str) {
        this.nameField = str;
    }

    public void setNeedAddrCard(boolean z) {
        this.needAddrCard = z;
    }

    public void setNeedPoints(List<NeedPointStruct> list) {
        this.needPoints = list;
    }

    public void setNeedRecommend(boolean z) {
        this.needRecommend = z;
    }

    public void setNeiguangShield(int i) {
        this.neiguangShield = i;
    }

    public void setNewRecommend(boolean z) {
        this.isNewRecommend = z;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setNicknameUpdateReminder(boolean z) {
        this.nicknameUpdateReminder = z;
    }

    public void setNotifyPrivateAccount(int i) {
        this.notifyPrivateAccount = i;
    }

    public void setOriginalMusician(OriginalMusician originalMusician2) {
        this.originalMusician = originalMusician2;
    }

    public void setPhoneBinded(boolean z) {
        this.isPhoneBinded = z;
    }

    public void setPlatformInfos(PlatformInfo[] platformInfoArr) {
        this.platformInfos = platformInfoArr;
    }

    public void setPostDefaultDownloadSetting(boolean z) {
        this.postDefaultDownloadSetting = z;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPrivateAwemeCount(int i) {
        this.privateAwemeCount = i;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setQuickShopInfo(QuickShopInfo quickShopInfo2) {
        this.quickShopInfo = quickShopInfo2;
    }

    public void setRecommendAwemeItems(List<RecommendAwemeItem> list) {
        this.recommendAwemeItems = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendReasonRelation(String str) {
        this.recommendReasonRelation = str;
    }

    public void setRecommendScore(double d) {
        this.recommendScore = d;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRegisterStatus(int i) {
        this.registerStatus = i;
    }

    public void setRegisterTime(long j) {
        this.registerTime = j;
    }

    public void setRelationLabel(String str) {
        this.relationLabel = str;
    }

    public void setRelativeUserInfos(List<RelativeUserInfo> list) {
        this.relativeUserInfos = list;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRoomData(String str) {
        this.roomData = str;
    }

    public void setSchoolInfoShowRange(int i) {
        this.schoolInfoShowRange = i;
    }

    public void setSchoolName(String str) {
        this.schoolName = str;
    }

    public void setSchoolPoiId(String str) {
        this.schoolPoiId = str;
    }

    public void setSchoolType(int i) {
        this.schoolType = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(boolean z) {
        this.secret = z;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setShieldCommentNotice(int i) {
        this.shieldCommentNotice = i;
    }

    public void setShieldDiggNotice(int i) {
        this.shieldDiggNotice = i;
    }

    public void setShieldFollowNotice(int i) {
        this.shieldFollowNotice = i;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setShowArtistPlaylist(int i) {
        this.showArtistPlaylist = i;
    }

    public void setShowFavoriteList(boolean z) {
        this.showFavoriteList = z;
    }

    public void setShowGenderStrategy(int i) {
        this.showGenderStrategy = i;
    }

    public void setShowImageBubble(boolean z) {
        this.showImageBubble = z;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSignatureLanguage(String str) {
        this.signatureLanguage = str;
    }

    public void setSprintSupportUserInfo(HotSearchSprintStruct hotSearchSprintStruct) {
        this.sprintSupportUserInfo = hotSearchSprintStruct;
    }

    public void setStar(boolean z) {
        this.isStar = z;
    }

    public void setStarBillboardRank(int i) {
        this.starBillboardRank = i;
    }

    public void setStarUseNewDownload(boolean z) {
        this.starUseNewDownload = z;
    }

    public void setStoryBlockInfo(StoryBlockInfo storyBlockInfo2) {
        this.storyBlockInfo = storyBlockInfo2;
    }

    public void setStoryCount(int i) {
        this.storyCount = i;
    }

    public void setStoryOpen(boolean z) {
        this.storyOpen = z;
    }

    public void setTabSetting(TabSetting tabSetting2) {
        this.tabSetting = tabSetting2;
    }

    public void setTabType(int i) {
        this.tabType = i;
    }

    public void setThirdName(String str) {
        this.thirdName = str;
    }

    public void setTotalFavorited(long j) {
        this.totalFavorited = j;
    }

    public void setTwExpireTime(long j) {
        this.twExpireTime = j;
    }

    public void setTwitterId(String str) {
        this.twitterId = str;
    }

    public void setTwitterName(String str) {
        this.twitterName = str;
    }

    public void setTypeLabels(long[] jArr) {
        this.typeLabels = jArr;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setUrgeDetail(UrgeStruct urgeStruct) {
        this.urgeDetail = urgeStruct;
    }

    public void setUserCancelled(boolean z) {
        this.userCancelled = z;
    }

    public void setUserHonor(UserHonor userHonor2) {
        this.userHonor = userHonor2;
    }

    public void setUserMode(int i) {
        this.userMode = i;
    }

    public void setUserPeriod(int i) {
        this.userPeriod = i;
    }

    public void setUserRate(int i) {
        this.userRate = i;
    }

    public void setUserRateRemindInfo(UserRateRemindInfo userRateRemindInfo2) {
        this.userRateRemindInfo = userRateRemindInfo2;
    }

    public void setUserStoryCount(int i) {
        this.userStoryCount = i;
    }

    public void setVerificationType(int i) {
        this.verificationType = i;
    }

    public void setVerified(boolean z) {
        this.isVerified = z;
    }

    public void setVerifyInfo(String str) {
        this.verifyInfo = str;
    }

    public void setVerifyStatus(int i) {
        this.verifyStatus = i;
    }

    public void setVideoCover(VideoCover videoCover2) {
        this.videoCover = videoCover2;
    }

    public void setWatchStatus(int i) {
        this.watchStatus = i;
    }

    public void setWeiboNickname(String str) {
        this.weiboNickname = str;
    }

    public void setWeiboSchema(String str) {
        this.weiboSchema = str;
    }

    public void setWeiboUrl(String str) {
        this.weiboUrl = str;
    }

    public void setWeiboVerify(String str) {
        this.weiboVerify = str;
    }

    public void setWithCommerceEnterpriseTabEntry(boolean z) {
        this.withCommerceEnterpriseTabEntry = z;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }

    public void setWithCommerceNewbieTask(boolean z) {
        this.withCommerceNewbieTask = z;
    }

    public void setWithDouEntry(boolean z) {
        this.withDouEntry = z;
    }

    public void setWithDouplusEntry(boolean z) {
        this.withDouplusEntry = z;
    }

    public void setWithFusionShopEntry(boolean z) {
        this.withFusionShopEntry = z;
    }

    public void setWithItemCommerceEntry(boolean z) {
        this.withItemCommerceEntry = z;
    }

    public void setWithLubanEntry(boolean z) {
        this.withLubanEntry = z;
    }

    public void setWithNewGoods(boolean z) {
        this.withNewGoods = z;
    }

    public void setWithShopEntry(boolean z) {
        this.withShopEntry = z;
    }

    public void setWxTag(int i) {
        this.wxTag = i;
    }

    public void setXmasUnlockCount(int i) {
        this.xmasUnlockCount = i;
    }

    public void setYouTubeLastRefreshTime(long j) {
        this.youTubeLastRefreshTime = j;
    }

    public void setYouTubeRefreshToken(String str) {
        this.youTubeRefreshToken = str;
    }

    public void setYoutubeChannelId(String str) {
        this.youtubeChannelId = str;
    }

    public void setYoutubeChannelTitle(String str) {
        this.youtubeChannelTitle = str;
    }

    public void setYoutubeExpireTime(long j) {
        this.youtubeExpireTime = j;
    }

    public void setmHotListStruct(HotListStruct hotListStruct) {
        this.mHotListStruct = hotListStruct;
    }

    public void setrFansGroupInfo(RocketFansGroupInfo rocketFansGroupInfo) {
        this.rFansGroupInfo = rocketFansGroupInfo;
    }

    public void setHasUnreadStory(boolean z) {
        this.hasUnreadStory = Boolean.valueOf(z);
    }

    private boolean checkExpire(long j) {
        if ((System.currentTimeMillis() / 1000) - j > 0) {
            return true;
        }
        return false;
    }

    public PlatformInfo getPlatformInfo(String str) {
        PlatformInfo[] platformInfoArr;
        if (!TextUtils.isEmpty(str) && this.platformInfos != null) {
            for (PlatformInfo platformInfo : this.platformInfos) {
                if (str.equals(platformInfo.getPatformName())) {
                    return platformInfo;
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (this.gender != user.gender || this.isVerified != user.isVerified || this.allowStatus != user.allowStatus || this.followStatus != user.followStatus || this.followerStatus != user.followerStatus || this.watchStatus != user.watchStatus || this.awemeCount != user.awemeCount || this.followingCount != user.followingCount || this.followerCount != user.followerCount || this.collectCount != user.collectCount || this.totalFavorited != user.totalFavorited || this.favoritingCount != user.favoritingCount || this.registerStatus != user.registerStatus || this.hideSearch != user.hideSearch || this.mAtType != user.mAtType || this.constellation != user.constellation || this.needRecommend != user.needRecommend || this.hideCity != user.hideCity || this.secret != user.secret || this.userStoryCount != user.userStoryCount) {
            return false;
        }
        if (this.uid == null ? user.uid != null : !this.uid.equals(user.uid)) {
            return false;
        }
        if (this.shortId == null ? user.shortId != null : !this.shortId.equals(user.shortId)) {
            return false;
        }
        if (this.nickname == null ? user.nickname != null : !this.nickname.equals(user.nickname)) {
            return false;
        }
        if (this.signature == null ? user.signature != null : !this.signature.equals(user.signature)) {
            return false;
        }
        if (this.birthday == null ? user.birthday != null : !this.birthday.equals(user.birthday)) {
            return false;
        }
        if (this.birthdayHideLevel != user.birthdayHideLevel) {
            return false;
        }
        if (this.avatarLarger == null ? user.avatarLarger != null : !this.avatarLarger.equals(user.avatarLarger)) {
            return false;
        }
        if (this.avatarThumb == null ? user.avatarThumb != null : !this.avatarThumb.equals(user.avatarThumb)) {
            return false;
        }
        if (this.avatarMedium == null ? user.avatarMedium != null : !this.avatarMedium.equals(user.avatarMedium)) {
            return false;
        }
        if (this.avatarVideoUri == null ? user.avatarVideoUri != null : !this.avatarVideoUri.equals(user.avatarVideoUri)) {
            return false;
        }
        if (this.thirdName == null ? user.thirdName != null : !this.thirdName.equals(user.thirdName)) {
            return false;
        }
        if (this.city == null ? user.city != null : !this.city.equals(user.city)) {
            return false;
        }
        if (this.weiboVerify == null ? user.weiboVerify != null : !this.weiboVerify.equals(user.weiboVerify)) {
            return false;
        }
        if (this.customVerify == null ? user.customVerify != null : !this.customVerify.equals(user.customVerify)) {
            return false;
        }
        if (this.uniqueId == null ? user.uniqueId != null : !this.uniqueId.equals(user.uniqueId)) {
            return false;
        }
        if (this.shareInfo == null ? user.shareInfo != null : !this.shareInfo.equals(user.shareInfo)) {
            return false;
        }
        if (this.createTime == null ? user.createTime != null : !this.createTime.equals(user.createTime)) {
            return false;
        }
        if (this.starUseNewDownload != user.starUseNewDownload || this.preventDownload != user.preventDownload || this.showImageBubble != user.showImageBubble || this.acceptPrivatePolicy != user.acceptPrivatePolicy || this.commentSetting != user.commentSetting || this.duetSetting != user.duetSetting || this.hasEmail != user.hasEmail || this.mIsGovMediaVip != user.mIsGovMediaVip || this.downloadSetting != user.downloadSetting) {
            return false;
        }
        if (this.region == null ? user.region != null : !this.region.equals(user.region)) {
            return false;
        }
        if (this.language == null ? user.language != null : !this.language.equals(user.language)) {
            return false;
        }
        if (this.roomTypeTag == null ? user.roomTypeTag != null : !this.roomTypeTag.equals(user.roomTypeTag)) {
            return false;
        }
        if (this.latestOrderTime == null ? user.latestOrderTime != null : !this.latestOrderTime.equals(user.latestOrderTime)) {
            return false;
        }
        if (this.bindPhone != null) {
            return this.bindPhone.equals(user.bindPhone);
        }
        if (user.bindPhone == null) {
            return true;
        }
        return false;
    }
}
