package com.p280ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.language.C32330k;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache */
public class SharePrefCache {
    private static final int CAN_IM_ON = 1;
    private static final String ESTR = "a3668f0afac72ca3f6c1697d29e0e1bb1fef4ab0285319b95ac39fa42c38d05f";
    public static final int EVERYONE_SETTING_VALUE = 0;
    public static final String TAG = "SharePrefCache";
    private C22903bl<String> accessToken;
    private C22903bl<Integer> adDisplayTimemit;
    private C22903bl<String> adIntroUrl;
    private C22903bl<String> adLandingPageConfig;
    private C22903bl<String> adSouthNorthFirstSupportTeam;
    private C22903bl<Long> adSouthNorthFirstSupportTime;
    private C22903bl<Integer> appStoreScoreSection;
    private C22903bl<Integer> appStoreScoreSwitch;
    private C22903bl<Integer> appStoreScoreThreshold;
    private C22903bl<Integer> arStickerFliterTimes;
    private C22903bl<Integer> atFriendsShowType;
    private C22903bl<Boolean> autoSaveVideo;
    private C22903bl<Boolean> autoSendTwitter;
    private C22903bl<Integer> beautyModel;
    private C22903bl<String> billboardFansScheme;
    private C22903bl<String> billboardStarScheme;
    private C22903bl<Integer> bodyDanceGuideTimes;
    private C22903bl<String> brandScheme;
    private List<C22903bl> cacheItems;
    private C22903bl<Integer> cameraPosition;
    private C22903bl<Boolean> canCreateInsights;
    private C22903bl<Integer> canIm;
    private C22903bl<Integer> canImSendPic;
    private C22903bl<Boolean> canLive;
    private C22903bl<Boolean> clickGuideShown;
    private boolean collectAllItems;
    private C22903bl<Boolean> commerceLiveCompatibleOld;
    private C22903bl<Integer> completeProfilePolicyInterval;
    private C22903bl<Integer> completeProfilePolicyTimes;
    private C22903bl<Boolean> confirmUploadContacts;
    private C22903bl<Long> contactsUploadedLastTime;
    private C22903bl<Boolean> debugWebBar;
    private C22903bl<Set<String>> defaultAvatarUrl;
    private C22903bl<Set<String>> defaultProfileCoverUrl;
    private C22903bl<String> deviceInfoUrl;
    private C22903bl<Boolean> deviceMonitor;
    private C22903bl<String> dialogContent;
    private C22903bl<String> dialogSlogan;
    private C22903bl<String> dialogTitle;
    private C22903bl<Integer> dialogType;
    private C22903bl<String> dialogUrl;
    private C22903bl<Integer> disableTaobao;
    private C22903bl<String> douyinCardScheme;
    private C22903bl<String> downloadForbiddenToast;
    private C22903bl<Integer> downloadMicroApp;
    private C22903bl<String> downloadSdkConfig;
    private C22903bl<Boolean> downloadStatusWhenPublish;
    private C22903bl<Boolean> enableAntiAliasing;
    private C22903bl<Boolean> enableCacheUserInsert;
    private C22903bl<Boolean> enableCacheUserList;
    private C22903bl<Boolean> enableFace2Face;
    private C22903bl<Boolean> enableLawWindow;
    private C22903bl<Boolean> enableMessagePb2Json;
    private C22903bl<Boolean> enableProfileActivityLink;
    private C22903bl<Boolean> enableShoppingUser;
    private C22903bl<Boolean> enableUltraResolution;
    private C22903bl<Boolean> enableUploadPC;
    private C22903bl<String> estr;
    private C22903bl<String> facebookAccessToken;
    private C22903bl<Long> festivalShareDonationTime;
    private C22903bl<Long> fetchUserCacheIntervals;
    private C22903bl<Integer> flashStatus;
    private C22903bl<Integer> followFeedAsDefault;
    private C22903bl<Boolean> followGuideShown;
    private C22903bl<Long> followNoticeCloseTime;
    private C22903bl<Integer> followUserThreshold;
    private C22903bl<Integer> friendTabAvatarDuation;
    private C22903bl<String> gameConfig;
    private C22903bl<Boolean> geckoLocalTestUseOnline;
    private C22903bl<String> googleServerAuthCode;
    private C22903bl<String> guardianChild;
    private C22903bl<String> guardianParent;
    private C22903bl<Integer> hardEncode;
    private C22903bl<Boolean> hasAlreadyShowBubble;
    private C22903bl<Boolean> hasEnterBindPhone;
    private C22903bl<Boolean> hasLongPressDislike;
    private C22903bl<Boolean> hasShowFilterGuide;
    private C22903bl<Boolean> hasShowRemarkNamePopup;
    private C22903bl<String> hitRankActivityProfileBackgroud;
    private C22903bl<String> hitRankActivityStarBackground;
    private C22903bl<Integer> hitRankActivityStatus;
    private C22903bl<Integer> hotSearchWordsShowInterval;
    private C22903bl<String> hotsoonDownloadUrl;
    private C22903bl<Integer> httpRetryCount;
    private C22903bl<Long> httpRetryInterval;
    private C22903bl<Long> httpTimeOut;
    private C22903bl<Boolean> iesOffline;
    private C22903bl<Boolean> imCommentForwardEnabled;
    private C22903bl<String> imCurrentLocaleLanguage;
    private C22903bl<String> imUrlTemplate;
    private C22903bl<Boolean> inUltraResBlackList;
    private C22903bl<Long> invitedAllTimeStamp;
    private C22903bl<String> invitedContacts;
    private C22903bl<Boolean> isAwemePrivate;
    private C22903bl<Boolean> isBubbleShown;
    private C22903bl<Boolean> isClickMoreRedPoint;
    private C22903bl<Boolean> isContactDialogShown;
    private C22903bl<Boolean> isContactsUploaded;
    private C22903bl<Boolean> isEnableLocalMusicEntrance;
    private C22903bl<Boolean> isEnableUpdateUserDialog;
    private C22903bl<Boolean> isEuropeCountry;
    private C22903bl<Boolean> isFirstFavouriteSuccess;
    private C22903bl<Boolean> isFirstLaunch;
    private C22903bl<Boolean> isFirstPublishAweme;
    private C22903bl<Boolean> isFirstPublishComment;
    private C22903bl<Boolean> isFirstPublishSync;
    private C22903bl<Boolean> isFirstReportVideo;
    private C22903bl<Boolean> isFirstSetPrivate;
    private C22903bl<Boolean> isFirstShowFavouriteAnimation;
    private C22903bl<Boolean> isFirstShowInsightsAnimation;
    private C22903bl<Integer> isForceHttps;
    private C22903bl<Boolean> isGrantedLocationPermission;
    private C22903bl<Boolean> isHotSearchAwemeBillboardEnable;
    private C22903bl<Boolean> isHotSearchBillboardEnable;
    private C22903bl<Boolean> isHotSearchMusicalBillboardEnable;
    private C22903bl<Boolean> isHotSearchPositiveEnergyBillboardEnable;
    private C22903bl<Boolean> isLike2DynamicBubbleHasShowed;
    private C22903bl<Integer> isNewInstall;
    private C22903bl<Boolean> isNpthEnable;
    private C22903bl<Boolean> isOb;
    private C22903bl<Boolean> isOldUser;
    private C22903bl<Boolean> isPoiBubbleShown;
    private C22903bl<Boolean> isPrivateAvailable;
    private C22903bl<Boolean> isProfileBubbleShown;
    private C22903bl<Boolean> isProfileNavbarBubbleShown;
    private C22903bl<Boolean> isPublishSyncToHuoshan;
    private C22903bl<Boolean> isPublishSyncToToutiao;
    private C22903bl<Integer> isPublishSyncToToutiaoNew;
    private C22903bl<Boolean> isShowAllowDownloadTipSetting;
    private C22903bl<Boolean> isShowFavouriteIcon;
    private C22903bl<Boolean> isShowFavouritePopup;
    private C22903bl<Boolean> isShowHotSearchVideoTip;
    private C22903bl<Boolean> isShowNearBy;
    private C22903bl<Boolean> isShowRankingIndicator;
    private C22903bl<Boolean> isShowSyncToToutiaoDialog;
    private C22903bl<Boolean> isShowUserFeedBackPoint;
    private C22903bl<Boolean> isSyncToHuoshan;
    private C22903bl<Boolean> isTargetBindingUser;
    private C22903bl<Boolean> isUseBackRefresh;
    private C22903bl<Boolean> isUseTTnet;
    private C22903bl<Boolean> isUseTongdunSdk;
    private C22903bl<Boolean> ischangeFollowTab;
    private C22903bl<String> jsActlogUrl;
    private C22903bl<String> judgementClauseScheme;
    private C22903bl<Long> lastCloseFeedUpdateUserDialog;
    private C22903bl<Long> lastCloseUpdateUserDialog;
    private C22903bl<Long> lastEnterProfileTime;
    private C22903bl<Long> lastFeedCount;
    private C22903bl<Long> lastFeedTime;
    private C22903bl<Long> lastFetchUserCacheIntervals;
    private C22903bl<Long> lastFilterTime;
    private C22903bl<Long> lastGetRelieveAwemeTime;
    private C22903bl<Long> lastHintToastTime;
    private C22903bl<Long> lastLockedTime;
    private C22903bl<Boolean> lastPublishFailed;
    private C22903bl<Long> lastShowBindHintTime;
    private C22903bl<Long> lastShowProfileBindHintTime;
    private C22903bl<Long> lastUnlockTime;
    private C22903bl<String> lastUploadPassCode;
    private C22903bl<Integer> lastUsableNetworkSpeed;
    private C22903bl<Boolean> liveAgreement;
    private C22903bl<Boolean> liveAnswer;
    private C22903bl<Boolean> liveContactsVerify;
    private C22903bl<Integer> liveCoverAuditFailedTimes;
    private C22903bl<Integer> liveCoverBubble;
    private C22903bl<Integer> liveCoverWarnChangeTimes;
    private C22903bl<Integer> liveDefaultBitrate;
    private C22903bl<Integer> liveMaxBitrate;
    private C22903bl<Integer> liveMinBitrate;
    private C22903bl<Boolean> liveSkylightHasShowAnimation;
    private C22903bl<Boolean> liveSkylightShowAnimation;
    private C22903bl<Boolean> longVideoPermitted;
    private C22903bl<Long> longVideoThreshold;
    private C22903bl<Set<String>> mGeckoChannels;
    private C22903bl<Set<String>> mGeckoInitialHighPriorityChannels;
    private C22903bl<Integer> mRnContextCreateTimeout;
    private C22903bl<Boolean> mRnPreloadContextOn;
    private C22903bl<Boolean> mRnSnapshotOn;
    private SharedPreferences mSharedPreferences;
    private C22903bl<Boolean> mUseNewPackageNow;
    private C22903bl<String> merchPickerUrl;
    private C22903bl<String> miniAppLabTitle;
    private C22903bl<Boolean> mockLiveMoney;
    private C22903bl<Boolean> mockLiveResolution;
    private C22903bl<Boolean> mockLiveSend;
    private C22903bl<String> mpTab;
    private C22903bl<Integer> multiSelectLimit;
    private C22903bl<String> musicBillboardRuleUrl;
    private C22903bl<String> musicRingtoneScheme;
    private C22903bl<Integer> musicianShowType;
    private C22903bl<String> needChooseLanguages;
    private C22903bl<Integer> networkLibType;
    private C22903bl<Boolean> newAnchorShowBubble;
    private C22903bl<String> newbieHelpShopUrl;
    private C22903bl<Long> normalGuideDisplayTimeIntervals;
    private C22903bl<Integer> normalGuideDisplayTimes;
    private C22903bl<Integer> noticeCountLatency;
    private C22903bl<String> openAppBackLogParams;
    private C22903bl<Integer> openImLink;
    private C22903bl<Long> operationGuideDisplayTimeIntervals;
    private C22903bl<Integer> operationGuideDisplayTimes;
    private C22903bl<String> orderShareIntroUrl;
    private C22903bl<String> orginalMusicianUrl;
    private C22903bl<Boolean> originalMusiciaShareStyle;
    private C22903bl<Boolean> originalMusicianEntry;
    private C22903bl<Integer> personalizationMode;
    private C22903bl<String> poiErrorReport;
    private C22903bl<String> poiMerchantUrl;
    private C22903bl<String> previewGoodReport;
    private C22903bl<Integer> privacyAccountFollowCount;
    private C22903bl<Integer> privacyDownloadSetting;
    private C22903bl<String> privacyReminderH5Url;
    private C22903bl<Float> profileCompletionThreshold;
    private C22903bl<Float> profilePerfectionAvatar;
    private C22903bl<Float> profilePerfectionBirthday;
    private C22903bl<Float> profilePerfectionGender;
    private C22903bl<Float> profilePerfectionLocation;
    private C22903bl<Float> profilePerfectionNickname;
    private C22903bl<Float> profilePerfectionSchool;
    private C22903bl<Float> profilePerfectionShortId;
    private C22903bl<Float> profilePerfectionSignature;
    private C22903bl<Long> progressbarThreshold;
    private C22903bl<Integer> promoteDialogPopupClickType;
    private C22903bl<String> promoteDialogPopupPopupContent;
    private C22903bl<Integer> promoteDialogPopupPopupInterval;
    private C22903bl<String> promoteDialogPopupPopupLinkText;
    private C22903bl<String> promoteDialogPopupPopupMsg;
    private C22903bl<String> promoteDialogPopupPopupTitle;
    private C22903bl<String> promoteDialogPopupPopupUrl;
    private C22903bl<Integer> promoteDialogPopupTimesLimit;
    private C22903bl<Boolean> promoteDialogShouldShow;
    private C22903bl<String> reactAddShopUrl;
    private C22903bl<String> reactEShopToolboxUrl;
    private List<String> recentList;
    private C22903bl<String> referralEntrance;
    private C22903bl<Integer> refreshZhima;
    private C22903bl<Boolean> removeFollowerSwitch;
    private C22903bl<String> requestNotificationText;
    private C22903bl<String> requestNotificationTitle;
    private C22903bl<Boolean> rnFallback;
    private C22903bl<String> sameCityActiveId;
    private C22903bl<Integer> scrollToProfileGuideState;
    private C22903bl<String> searchTabIndex;
    private C22903bl<String> searchTrendBannerUrl;
    private C22903bl<String> shareCookieCacheItem;
    private C22903bl<Boolean> shiledMusicSDK;
    private C22903bl<String> shopWishListUrl;
    private C22903bl<Boolean> shouldShowFavouriteTip;
    private C22903bl<Boolean> shouldShowPrivateAccountTipInProfile;
    private C22903bl<Boolean> showAdIntroFlag;
    private C22903bl<Boolean> showAddBusinessGoodsDot;
    private C22903bl<Integer> showBindHintCount;
    private C22903bl<Boolean> showCouponItem;
    private C22903bl<Integer> showCreatorRewards;
    private C22903bl<Boolean> showFansCard;
    private C22903bl<Integer> showHashTagBg;
    private C22903bl<Boolean> showInteractionStickers;
    private C22903bl<Boolean> showInvitedContactsFriends;
    private C22903bl<Integer> showJumpEffectAfterFollowCount;
    private C22903bl<Integer> showLiveRewards;
    private C22903bl<Integer> showLoginDialogState;
    private C22903bl<Boolean> showMiniAppFreshGuideBubble;
    private C22903bl<Boolean> showMiniAppFreshGuideDialog;
    private C22903bl<Boolean> showMiniAppFreshGuideNotify;
    private C22903bl<Boolean> showPlayerInfoUI;
    private C22903bl<Integer> showProfileBindHintCount;
    private C22903bl<Integer> showPromoteLicense;
    private C22903bl<Boolean> showTimeLineTab;
    private C22903bl<Boolean> showVideoBitrateInfo;
    private C22903bl<String> starAtlasOrderWebUrl;
    private C22903bl<String> starBillboardRuleUrl;
    private C22903bl<Boolean> stickerArtEntry;
    private C22903bl<String> stickerArtlistUrl;
    private C22903bl<String> storyFontType;
    private C22903bl<Integer> storyInfoStickerMaxCount;
    private C22903bl<Boolean> storyPublishFriendsDuoshanBanner;
    private C22903bl<Boolean> storyPublishSaveLocal;
    private C22903bl<Boolean> storyQuickPanelShowInActivity;
    private C22903bl<Boolean> storyRecordGuideShow;
    private C22903bl<String> storyRegisterPublishSyncHintContent;
    private C22903bl<String> storyRegisterPublishSyncHintH5Str;
    private C22903bl<String> storyRegisterPublishSyncHintH5Url;
    private C22903bl<String> storyRegisterPublishSyncHintTitle;
    private C22903bl<Boolean> storySettingDoudouPhoto;
    private C22903bl<Boolean> storySettingManualOpenDoudou;
    private C22903bl<Integer> storySettingReplyPermission;
    private C22903bl<Boolean> storySettingSyncDuoshan;
    private C22903bl<Integer> storySettingSyncToast;
    private C22903bl<Integer> storySettingViewPermission;
    private C22903bl<String> storyShakeLastTime;
    private C22903bl<Boolean> storyShakeSurpriseHintShow;
    private C22903bl<Long> storyStickerQuickPanelCloseTime;
    private C22903bl<Integer> storyTextStickerMaxCount;
    private C22903bl<String> storyUnRegisterPublishSyncHintContent;
    private C22903bl<String> storyUnRegisterPublishSyncHintH5Str;
    private C22903bl<String> storyUnRegisterPublishSyncHintH5Url;
    private C22903bl<String> storyUnRegisterPublishSyncHintTitle;
    private C22903bl<Integer> swipeDataCount;
    private C22903bl<Integer> syncTT;
    private C22903bl<Boolean> syncTTFirstPublish;
    private C22903bl<String> syncToTTUrl;
    private C22903bl<Float> syntheticVideoBitrate;
    private C22903bl<Integer> tapDataCount;
    private C22903bl<String> teenagerProtectionScheme;
    private C22903bl<Long> todayVideoPlayTime;
    private C22903bl<Boolean> ttRegion;
    private C22903bl<Boolean> ttRoute;
    private C22903bl<String> twitterAccessToken;
    private C22903bl<String> twitterSecret;
    private C22903bl<Integer> ultraResolutionLevel;
    private C22903bl<Integer> upGuideNum;
    private C22903bl<Integer> updateUserFrequency;
    private C22903bl<Integer> updateUserPosition;
    private C22903bl<String> updateUserTimeInfo;
    private C22903bl<String> updateUserTipContent;
    private C22903bl<Long> uploadContactsNoticeLastShowTime;
    private C22903bl<Integer> uploadContactsNoticeShowCount;
    private C22903bl<String> uploadContactsPolicyCaption;
    private C22903bl<Integer> uploadContactsPolicyInterval;
    private C22903bl<String> uploadContactsPolicyPic;
    private C22903bl<String> uploadContactsPolicyText;
    private C22903bl<Integer> uploadContactsPolicyTimes;
    private C22903bl<Boolean> useCronet;
    private C22903bl<Boolean> useDefaultHost;
    private C22903bl<Boolean> useHttps;
    private C22903bl<Integer> useLiveWallpaper;
    private C22903bl<Integer> useNewDouyinSaftyCenter;
    private C22903bl<Boolean> useNewFFmpeg;
    private C22903bl<Integer> useSyntheticHardcode;
    private C22903bl<String> userAddLanguages;
    private C22903bl<String> userCurrentRegion;
    private C22903bl<Boolean> userHasPassword;
    private C22903bl<String> userResidence;
    private C22903bl<Integer> verifyExceed;
    private C22903bl<Float> videoBitrate;
    private C22903bl<Integer> videoCommit;
    private C22903bl<Integer> videoCompose;
    private C22903bl<Boolean> videoPreload;
    private C22903bl<Integer> weakNetPreLoadSwitch;
    private C22903bl<Integer> x2cSwitch;

    /* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache$a */
    static class C22688a {

        /* renamed from: a */
        public static SharePrefCache f60406a = new SharePrefCache();
    }

    public static SharePrefCache inst() {
        return C22688a.f60406a;
    }

    public SharedPreferences getSharePref() {
        return this.mSharedPreferences;
    }

    public int getArStickerFilterGuideTimes() {
        return ((Integer) getArStickerFliterTimesItem().mo59877d()).intValue();
    }

    public int getBeautyModel() {
        return ((Integer) getBeautyModelItem().mo59877d()).intValue();
    }

    public boolean getImCommentForwardEnabled() {
        return ((Boolean) getImCommentForwardEnabledItem().mo59877d()).booleanValue();
    }

    public String getImUrlTemplate() {
        return (String) getImUrlTemplateItem().mo59877d();
    }

    public boolean getIsFirstPublishAweme() {
        return ((Boolean) getFirstPublishAwemeItem().mo59877d()).booleanValue();
    }

    public boolean getIsFirstPublishComment() {
        return ((Boolean) getFirstPublishCommentItem().mo59877d()).booleanValue();
    }

    public long getLastInviteAllTimeStamp() {
        return ((Long) getLastInviteAllTimeStampItem().mo59877d()).longValue();
    }

    public int getMultiSelectLimit() {
        return ((Integer) getMultiSelectLimitItem().mo59877d()).intValue();
    }

    public int getNetworkLibType() {
        return ((Integer) getNetworkLibTypeItem().mo59877d()).intValue();
    }

    public int getOpenImLink() {
        return ((Integer) getOpenImLinkItem().mo59877d()).intValue();
    }

    public boolean isOpenForward() {
        if (!C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    public boolean isUseTTnet() {
        return ((Boolean) getIsUseTTnet().mo59877d()).booleanValue();
    }

    private C22903bl<Integer> getArStickerFliterTimesItem() {
        if (this.arStickerFliterTimes == null) {
            this.arStickerFliterTimes = new C22903bl<>("ar_sticker_filter_guide_times", Integer.valueOf(0));
            this.cacheItems.add(this.arStickerFliterTimes);
        }
        return this.arStickerFliterTimes;
    }

    private C22903bl<Boolean> getCanLive() {
        if (this.canLive == null) {
            this.canLive = new C22903bl<>("live_can_live", Boolean.valueOf(false));
            this.cacheItems.add(this.canLive);
        }
        return this.canLive;
    }

    private C22903bl<Boolean> getClickMoreRedPoint() {
        if (this.isClickMoreRedPoint == null) {
            this.isClickMoreRedPoint = new C22903bl<>("is_click_more_red_point", Boolean.valueOf(false));
            this.cacheItems.add(this.isClickMoreRedPoint);
        }
        return this.isClickMoreRedPoint;
    }

    private C22903bl<Boolean> getFirstPublishAwemeItem() {
        if (this.isFirstPublishAweme == null) {
            this.isFirstPublishAweme = new C22903bl<>("first_publish_aweme", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstPublishAweme);
        }
        return this.isFirstPublishAweme;
    }

    private C22903bl<Boolean> getFirstPublishCommentItem() {
        if (this.isFirstPublishComment == null) {
            this.isFirstPublishComment = new C22903bl<>("first_publish_comment", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstPublishComment);
        }
        return this.isFirstPublishComment;
    }

    private C22903bl<Boolean> getHasShowFilterGuideItem() {
        if (this.hasShowFilterGuide == null) {
            this.hasShowFilterGuide = new C22903bl<>("live_show_filter_guide", Boolean.valueOf(false));
            this.cacheItems.add(this.hasShowFilterGuide);
        }
        return this.hasShowFilterGuide;
    }

    private C22903bl<Integer> getShowCreatorRewards() {
        if (this.showCreatorRewards == null) {
            this.showCreatorRewards = new C22903bl<>("show_creator_rewards", Integer.valueOf(0));
            this.cacheItems.add(this.showCreatorRewards);
        }
        return this.showCreatorRewards;
    }

    private C22903bl<Integer> getShowLiveRewards() {
        if (this.showLiveRewards == null) {
            this.showLiveRewards = new C22903bl<>("show_live_rewards", Integer.valueOf(0));
            this.cacheItems.add(this.showLiveRewards);
        }
        return this.showLiveRewards;
    }

    public void clearCache() {
        collectAllItemsIfNeed();
        for (C22903bl b : this.cacheItems) {
            b.mo59873b();
        }
    }

    public C22903bl<String> getAccessToken() {
        if (this.accessToken == null) {
            this.accessToken = new C22903bl<>("access_token", "");
            this.cacheItems.add(this.accessToken);
        }
        return this.accessToken;
    }

    public C22903bl<Integer> getAdDisplayTimemit() {
        if (this.adDisplayTimemit == null) {
            this.adDisplayTimemit = new C22903bl<>("ad_display_time", Integer.valueOf(3));
            this.cacheItems.add(this.adDisplayTimemit);
        }
        return this.adDisplayTimemit;
    }

    public C22903bl<String> getAdIntroUrlItem() {
        if (this.adIntroUrl == null) {
            this.adIntroUrl = new C22903bl<>("ad_intro_url", "");
            this.cacheItems.add(this.adIntroUrl);
        }
        return this.adIntroUrl;
    }

    public C22903bl<String> getAdLandingPageConfig() {
        if (this.adLandingPageConfig == null) {
            this.adLandingPageConfig = new C22903bl<>("ad_landing_page_config", "");
            this.cacheItems.add(this.adLandingPageConfig);
        }
        return this.adLandingPageConfig;
    }

    public C22903bl<String> getAdSouthNorthFirstSupportTeam() {
        if (this.adSouthNorthFirstSupportTeam == null) {
            this.adSouthNorthFirstSupportTeam = new C22903bl<>("ad_south_north_support_team", "");
        }
        return this.adSouthNorthFirstSupportTeam;
    }

    public C22903bl<Long> getAdSouthNorthFirstSupportTime() {
        if (this.adSouthNorthFirstSupportTime == null) {
            this.adSouthNorthFirstSupportTime = new C22903bl<>("ad_south_north_support_time", Long.valueOf(0));
        }
        return this.adSouthNorthFirstSupportTime;
    }

    public C22903bl<String> getAppEnterForegroundTime() {
        if (this.updateUserTimeInfo == null) {
            this.updateUserTimeInfo = new C22903bl<>("update_user_time_info", "");
            this.cacheItems.add(this.updateUserTimeInfo);
        }
        return this.updateUserTimeInfo;
    }

    public C22903bl<Integer> getAppStoreScoreSection() {
        if (this.appStoreScoreSection == null) {
            this.appStoreScoreSection = new C22903bl<>("APP_STORE_SCORE_SECTION", Integer.valueOf(7));
            this.cacheItems.add(this.appStoreScoreSection);
        }
        return this.appStoreScoreSection;
    }

    public C22903bl<Integer> getAppStoreScoreSwitch() {
        if (this.appStoreScoreSwitch == null) {
            this.appStoreScoreSwitch = new C22903bl<>("APP_STORE_SCORE_SWITCH", Integer.valueOf(1));
            this.cacheItems.add(this.appStoreScoreSwitch);
        }
        return this.appStoreScoreSwitch;
    }

    public C22903bl<Integer> getAppStoreScoreThreshold() {
        if (this.appStoreScoreThreshold == null) {
            this.appStoreScoreThreshold = new C22903bl<>("APP_STORE_SCORE_THRESHOLD", Integer.valueOf(3));
            this.cacheItems.add(this.appStoreScoreThreshold);
        }
        return this.appStoreScoreThreshold;
    }

    public C22903bl<Integer> getAtFriendsShowType() {
        if (this.atFriendsShowType == null) {
            this.atFriendsShowType = new C22903bl<>("at_friends_show_type", Integer.valueOf(0));
            this.cacheItems.add(this.atFriendsShowType);
        }
        return this.atFriendsShowType;
    }

    public C22903bl<Boolean> getAutoSaveVideo() {
        if (this.autoSaveVideo == null) {
            this.autoSaveVideo = new C22903bl<>("auto_save_video", Boolean.valueOf(true));
            this.cacheItems.add(this.autoSaveVideo);
        }
        return this.autoSaveVideo;
    }

    public C22903bl<Boolean> getAutoSendTwitter() {
        if (this.autoSendTwitter == null) {
            this.autoSendTwitter = new C22903bl<>("auto_send_twitter", Boolean.valueOf(false));
            this.cacheItems.add(this.autoSendTwitter);
        }
        return this.autoSendTwitter;
    }

    public C22903bl<Integer> getBeautyModelItem() {
        if (this.beautyModel == null) {
            this.beautyModel = new C22903bl<>("beauty_model", Integer.valueOf(0));
            this.cacheItems.add(this.beautyModel);
        }
        return this.beautyModel;
    }

    public C22903bl<String> getBillboardFansScheme() {
        if (this.billboardFansScheme == null) {
            this.billboardFansScheme = new C22903bl<>("billboard_fans_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbillboard_fans%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_billboard_fans%26hide_nav_bar%3D1%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823");
            this.cacheItems.add(this.billboardFansScheme);
        }
        return this.billboardFansScheme;
    }

    public C22903bl<String> getBillboardStarScheme() {
        if (this.billboardStarScheme == null) {
            this.billboardStarScheme = new C22903bl<>("billboard_star_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbillboard_star%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_billboard_star%26hide_nav_bar%3D1");
            this.cacheItems.add(this.billboardStarScheme);
        }
        return this.billboardStarScheme;
    }

    public C22903bl<Integer> getBodyDanceGuideTimes() {
        if (this.bodyDanceGuideTimes == null) {
            this.bodyDanceGuideTimes = new C22903bl<>("body_dance_guide_times", Integer.valueOf(0));
            this.cacheItems.add(this.bodyDanceGuideTimes);
        }
        return this.bodyDanceGuideTimes;
    }

    public C22903bl<String> getBrandScheme() {
        if (this.brandScheme == null) {
            this.brandScheme = new C22903bl<>("brand_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbrand_rank%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Furl%3Dhttps%253A%252F%252Faweme.snssdk.com%252Ffalcon%252Frn%252Fbrand_rank%26channel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_brand_rank%26hide_nav_bar%3D1");
            this.cacheItems.add(this.brandScheme);
        }
        return this.brandScheme;
    }

    public C22903bl<Boolean> getCanCreateInsights() {
        if (this.canCreateInsights == null) {
            this.canCreateInsights = new C22903bl<>("can_create_insights", Boolean.valueOf(false));
            this.cacheItems.add(this.canCreateInsights);
        }
        return this.canCreateInsights;
    }

    public C22903bl<Integer> getCanIm() {
        if (this.canIm == null) {
            this.canIm = new C22903bl<>("im_can_im", Integer.valueOf(1));
            this.cacheItems.add(this.canIm);
        }
        return this.canIm;
    }

    public C22903bl<Integer> getCanImSendPic() {
        if (this.canImSendPic == null) {
            this.canImSendPic = new C22903bl<>("im_can_send_pic", Integer.valueOf(0));
            this.cacheItems.add(this.canImSendPic);
        }
        return this.canImSendPic;
    }

    public C22903bl<Boolean> getClickGuideShown() {
        if (this.clickGuideShown == null) {
            this.clickGuideShown = new C22903bl<>("click_guide_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.clickGuideShown);
        }
        return this.clickGuideShown;
    }

    public C22903bl<Boolean> getCommerceLiveCompatibleOld() {
        if (this.commerceLiveCompatibleOld == null) {
            this.commerceLiveCompatibleOld = new C22903bl<>("capatible_with_old_version", Boolean.valueOf(false));
            this.cacheItems.add(this.commerceLiveCompatibleOld);
        }
        return this.commerceLiveCompatibleOld;
    }

    public C22903bl<Integer> getCompleteProfilePolicyInterval() {
        if (this.completeProfilePolicyInterval == null) {
            this.completeProfilePolicyInterval = new C22903bl<>("completeprofilepolicy_interval", Integer.valueOf(0));
            this.cacheItems.add(this.completeProfilePolicyInterval);
        }
        return this.completeProfilePolicyInterval;
    }

    public C22903bl<Integer> getCompleteProfilePolicyTimes() {
        if (this.completeProfilePolicyTimes == null) {
            this.completeProfilePolicyTimes = new C22903bl<>("completeprofilepolicy_times", Integer.valueOf(0));
            this.cacheItems.add(this.completeProfilePolicyTimes);
        }
        return this.completeProfilePolicyTimes;
    }

    public C22903bl<Boolean> getConfirmUploadContacts() {
        if (this.confirmUploadContacts == null) {
            this.confirmUploadContacts = new C22903bl<>("confirm_upload_contacts", Boolean.valueOf(false));
            this.cacheItems.add(this.confirmUploadContacts);
        }
        return this.confirmUploadContacts;
    }

    public C22903bl<Long> getContactsUploadedLastTime() {
        if (this.contactsUploadedLastTime == null) {
            this.contactsUploadedLastTime = new C22903bl<>("contacts_uploaded_last_time", Long.valueOf(0));
            this.cacheItems.add(this.contactsUploadedLastTime);
        }
        return this.contactsUploadedLastTime;
    }

    public C22903bl<String> getCurrentLocaleLanguage() {
        if (this.imCurrentLocaleLanguage == null) {
            this.imCurrentLocaleLanguage = new C22903bl<>("im_current_locale", Locale.CHINESE.getLanguage());
            this.cacheItems.add(this.imCurrentLocaleLanguage);
        }
        return this.imCurrentLocaleLanguage;
    }

    public C22903bl<Boolean> getDebugWebBar() {
        if (this.debugWebBar == null) {
            this.debugWebBar = new C22903bl<>("debug_web_bar", Boolean.valueOf(true));
            this.cacheItems.add(this.debugWebBar);
        }
        return this.debugWebBar;
    }

    public C22903bl<Set<String>> getDefaultAvatarUrl() {
        if (this.defaultAvatarUrl == null) {
            this.defaultAvatarUrl = new C22903bl<>("default_avatarurl", new HashSet());
            this.cacheItems.add(this.defaultAvatarUrl);
        }
        return this.defaultAvatarUrl;
    }

    public C22903bl<String> getDeviceInfoUrl() {
        if (this.deviceInfoUrl == null) {
            this.deviceInfoUrl = new C22903bl<>("fp_upload_device_url", "");
            this.cacheItems.add(this.deviceInfoUrl);
        }
        return this.deviceInfoUrl;
    }

    public C22903bl<Boolean> getDeviceMonitor() {
        if (this.deviceMonitor == null) {
            this.deviceMonitor = new C22903bl<>("device_monitor", Boolean.valueOf(true));
            this.cacheItems.add(this.deviceMonitor);
        }
        return this.deviceMonitor;
    }

    public C22903bl<String> getDialogContent() {
        if (this.dialogContent == null) {
            this.dialogContent = new C22903bl<>("dialog_content", "");
            this.cacheItems.add(this.dialogContent);
        }
        return this.dialogContent;
    }

    public C22903bl<String> getDialogSlogan() {
        if (this.dialogSlogan == null) {
            this.dialogSlogan = new C22903bl<>("dialog_slogan", "");
            this.cacheItems.add(this.dialogSlogan);
        }
        return this.dialogSlogan;
    }

    public C22903bl<String> getDialogTitle() {
        if (this.dialogTitle == null) {
            this.dialogTitle = new C22903bl<>("dialog_title", "");
            this.cacheItems.add(this.dialogTitle);
        }
        return this.dialogTitle;
    }

    public C22903bl<Integer> getDialogType() {
        if (this.dialogType == null) {
            this.dialogType = new C22903bl<>("dialog_type", Integer.valueOf(0));
            this.cacheItems.add(this.dialogType);
        }
        return this.dialogType;
    }

    public C22903bl<String> getDialogUrl() {
        if (this.dialogUrl == null) {
            this.dialogUrl = new C22903bl<>("dialog_url", "");
            this.cacheItems.add(this.dialogUrl);
        }
        return this.dialogUrl;
    }

    public C22903bl<Integer> getDisableTaobao() {
        if (this.disableTaobao == null) {
            this.disableTaobao = new C22903bl<>("disable_taobao", Integer.valueOf(0));
            this.cacheItems.add(this.disableTaobao);
        }
        return this.disableTaobao;
    }

    public C22903bl<String> getDouyinCardScheme() {
        if (this.douyinCardScheme == null) {
            this.douyinCardScheme = new C22903bl<>("douyin_card_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fdouyin_card%3Fhide_nav_bar%3D1%26media_source%3Ddouyin&hide_nav_bar=1&media_source=douyin&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_douyin_card%26hide_nav_bar%3D1%26media_source%3Ddouyin");
            this.cacheItems.add(this.douyinCardScheme);
        }
        return this.douyinCardScheme;
    }

    public C22903bl<String> getDownloadForbiddenToast() {
        if (this.downloadForbiddenToast == null) {
            this.downloadForbiddenToast = new C22903bl<>("download_forbidden_toast", "");
            this.cacheItems.add(this.downloadForbiddenToast);
        }
        return this.downloadForbiddenToast;
    }

    public C22903bl<Integer> getDownloadMicroApp() {
        if (this.downloadMicroApp == null) {
            this.downloadMicroApp = new C22903bl<>("download_micro_app", Integer.valueOf(1));
            this.cacheItems.add(this.downloadMicroApp);
        }
        return this.downloadMicroApp;
    }

    public C22903bl<String> getDownloadSdkConfig() {
        if (this.downloadSdkConfig == null) {
            this.downloadSdkConfig = new C22903bl<>("download_sdk_config", "");
            this.cacheItems.add(this.downloadSdkConfig);
        }
        return this.downloadSdkConfig;
    }

    public C22903bl<Boolean> getDownloadStatusWhenPublish() {
        if (this.downloadStatusWhenPublish == null) {
            this.downloadStatusWhenPublish = new C22903bl<>("download_status_when_publish", Boolean.valueOf(true));
        }
        return this.downloadStatusWhenPublish;
    }

    public C22903bl<Boolean> getEableUltraResolution() {
        if (this.enableUltraResolution == null) {
            this.enableUltraResolution = new C22903bl<>("enable_ultra_resolution", Boolean.valueOf(false));
            this.cacheItems.add(this.enableUltraResolution);
        }
        return this.enableUltraResolution;
    }

    public C22903bl<Boolean> getEnableAntiAliasing() {
        if (this.enableAntiAliasing == null) {
            this.enableAntiAliasing = new C22903bl<>("enable_anti_aliasing", Boolean.valueOf(false));
            this.cacheItems.add(this.enableAntiAliasing);
        }
        return this.enableAntiAliasing;
    }

    public C22903bl<Boolean> getEnableFace2Face() {
        if (this.enableFace2Face == null) {
            this.enableFace2Face = new C22903bl<>("enable_face_to_face", Boolean.valueOf(true));
            this.cacheItems.add(this.enableFace2Face);
        }
        return this.enableFace2Face;
    }

    public C22903bl<Boolean> getEnableProfileActivityLink() {
        if (this.enableProfileActivityLink == null) {
            this.enableProfileActivityLink = new C22903bl<>("enable_profile_link", Boolean.valueOf(false));
            this.cacheItems.add(this.enableProfileActivityLink);
        }
        return this.enableProfileActivityLink;
    }

    public C22903bl<Boolean> getEnableUploadPC() {
        if (this.enableUploadPC == null) {
            this.enableUploadPC = new C22903bl<>("enableuploadpc", Boolean.valueOf(true));
            this.cacheItems.add(this.enableUploadPC);
        }
        return this.enableUploadPC;
    }

    public C22903bl<String> getEstr() {
        if (this.estr == null) {
            this.estr = new C22903bl<>("estr", "a3668f0afac72ca3f6c1697d29e0e1bb1fef4ab0285319b95ac39fa42c38d05f");
            this.cacheItems.add(this.estr);
        }
        return this.estr;
    }

    public C22903bl<String> getFacebookAccessToken() {
        if (this.facebookAccessToken == null) {
            this.facebookAccessToken = new C22903bl<>("facebook_access_token", "");
            this.cacheItems.add(this.facebookAccessToken);
        }
        return this.facebookAccessToken;
    }

    public C22903bl<Long> getFestivalShareDonationTime() {
        if (this.festivalShareDonationTime == null) {
            this.festivalShareDonationTime = new C22903bl<>("festival_share_donation_time", Long.valueOf(0));
            this.cacheItems.add(this.festivalShareDonationTime);
        }
        return this.festivalShareDonationTime;
    }

    public C22903bl<Long> getFetchUserCacheIntervals() {
        if (this.fetchUserCacheIntervals == null) {
            this.fetchUserCacheIntervals = new C22903bl<>("fetch_user_cache_intervals", Long.valueOf(0));
            this.cacheItems.add(this.fetchUserCacheIntervals);
        }
        return this.fetchUserCacheIntervals;
    }

    public C22903bl<Integer> getFlashStatus() {
        if (this.flashStatus == null) {
            this.flashStatus = new C22903bl<>("flash_status", Integer.valueOf(0));
            this.cacheItems.add(this.flashStatus);
        }
        return this.flashStatus;
    }

    public C22903bl<Integer> getFollowFeedAsDefault() {
        if (this.followFeedAsDefault == null) {
            this.followFeedAsDefault = new C22903bl<>("follow_feed_as_default", Integer.valueOf(0));
            this.cacheItems.add(this.followFeedAsDefault);
        }
        return this.followFeedAsDefault;
    }

    public C22903bl<Boolean> getFollowGuideShown() {
        if (this.followGuideShown == null) {
            this.followGuideShown = new C22903bl<>("follow_guide_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.followGuideShown);
        }
        return this.followGuideShown;
    }

    public C22903bl<Long> getFollowNoticeCloseTime() {
        if (this.followNoticeCloseTime == null) {
            this.followNoticeCloseTime = new C22903bl<>("follow_notice_close_time", Long.valueOf(0));
            this.cacheItems.add(this.followNoticeCloseTime);
        }
        return this.followNoticeCloseTime;
    }

    public C22903bl<Integer> getFollowUserThreshold() {
        if (this.followUserThreshold == null) {
            this.followUserThreshold = new C22903bl<>("show_follow_tab_following_limit", Integer.valueOf(1));
            this.cacheItems.add(this.followUserThreshold);
        }
        return this.followUserThreshold;
    }

    public C22903bl<Integer> getFriendTabAvatarDuation() {
        if (this.friendTabAvatarDuation == null) {
            this.friendTabAvatarDuation = new C22903bl<>("friend_tab_avatar_duration", Integer.valueOf(0));
            this.cacheItems.add(this.friendTabAvatarDuation);
        }
        return this.friendTabAvatarDuation;
    }

    public C22903bl<String> getGameConfig() {
        if (this.gameConfig == null) {
            this.gameConfig = new C22903bl<>("aweme_game_config", "");
            this.cacheItems.add(this.gameConfig);
        }
        return this.gameConfig;
    }

    public C22903bl<Set<String>> getGeckoChannels() {
        if (this.mGeckoChannels == null) {
            this.mGeckoChannels = new C22903bl<>("gecko_init_channels", new HashSet());
            this.cacheItems.add(this.mGeckoChannels);
        }
        return this.mGeckoChannels;
    }

    public C22903bl<Set<String>> getGeckoInitialHighPriorityChannels() {
        if (this.mGeckoInitialHighPriorityChannels == null) {
            this.mGeckoInitialHighPriorityChannels = new C22903bl<>("initial_high_priority_channel", new HashSet());
            this.cacheItems.add(this.mGeckoInitialHighPriorityChannels);
        }
        return this.mGeckoInitialHighPriorityChannels;
    }

    public C22903bl<Boolean> getGeckoLocalTestUseOnline() {
        if (this.geckoLocalTestUseOnline == null) {
            this.geckoLocalTestUseOnline = new C22903bl<>("gecko_local_test_use_online", Boolean.valueOf(false));
            this.cacheItems.add(this.geckoLocalTestUseOnline);
        }
        return this.geckoLocalTestUseOnline;
    }

    public C22903bl<String> getGoogleServerAuthCode() {
        if (this.googleServerAuthCode == null) {
            this.googleServerAuthCode = new C22903bl<>("google_server_auth_code", "");
            this.cacheItems.add(this.googleServerAuthCode);
        }
        return this.googleServerAuthCode;
    }

    public C22903bl<String> getGuardianChildScheme() {
        if (this.guardianChild == null) {
            this.guardianChild = new C22903bl<>("guardian_child", C22879as.m75347b());
            this.cacheItems.add(this.guardianChild);
        }
        return this.guardianChild;
    }

    public C22903bl<String> getGuardianParentScheme() {
        if (this.guardianParent == null) {
            this.guardianParent = new C22903bl<>("guardian_parent", C22879as.m75346a());
            this.cacheItems.add(this.guardianParent);
        }
        return this.guardianParent;
    }

    public C22903bl<Integer> getHardEncode() {
        if (this.hardEncode == null) {
            this.hardEncode = new C22903bl<>("hard_encode", Integer.valueOf(0));
            this.cacheItems.add(this.hardEncode);
        }
        return this.hardEncode;
    }

    public C22903bl<Boolean> getHasAlreadyShowBubble() {
        if (this.hasAlreadyShowBubble == null) {
            this.hasAlreadyShowBubble = new C22903bl<>("has_already_show_bubble", Boolean.valueOf(false));
            this.cacheItems.add(this.hasAlreadyShowBubble);
        }
        return this.hasAlreadyShowBubble;
    }

    public C22903bl<Boolean> getHasEnterBindPhone() {
        if (this.hasEnterBindPhone == null) {
            this.hasEnterBindPhone = new C22903bl<>("has_enter_bind_phone", Boolean.valueOf(false));
            this.cacheItems.add(this.hasEnterBindPhone);
        }
        return this.hasEnterBindPhone;
    }

    public C22903bl<Boolean> getHasLongPressDislike() {
        if (this.hasLongPressDislike == null) {
            this.hasLongPressDislike = new C22903bl<>("has_long_pressed_dislike", Boolean.valueOf(false));
            this.cacheItems.add(this.hasLongPressDislike);
        }
        return this.hasLongPressDislike;
    }

    public C22903bl<Boolean> getHasShowRemarkNamePopup() {
        if (this.hasShowRemarkNamePopup == null) {
            this.hasShowRemarkNamePopup = new C22903bl<>("is_show_remarkname_popup", Boolean.valueOf(false));
            this.cacheItems.add(this.hasShowRemarkNamePopup);
        }
        return this.hasShowRemarkNamePopup;
    }

    public C22903bl<String> getHitRankActivityProfileBackground() {
        if (this.hitRankActivityProfileBackgroud == null) {
            this.hitRankActivityProfileBackgroud = new C22903bl<>("HIT_RANK_ACTIVITY_PROFILE_BACKGROUND", "");
            this.cacheItems.add(this.hitRankActivityProfileBackgroud);
        }
        return this.hitRankActivityProfileBackgroud;
    }

    public C22903bl<String> getHitRankActivityStarBackground() {
        if (this.hitRankActivityStarBackground == null) {
            this.hitRankActivityStarBackground = new C22903bl<>("hit_rank_activity_star_background", "");
            this.cacheItems.add(this.hitRankActivityStarBackground);
        }
        return this.hitRankActivityStarBackground;
    }

    public C22903bl<Integer> getHitRankActivityStatus() {
        if (this.hitRankActivityStatus == null) {
            this.hitRankActivityStatus = new C22903bl<>("hit_rank_activity_status", Integer.valueOf(0));
            this.cacheItems.add(this.hitRankActivityStatus);
        }
        return this.hitRankActivityStatus;
    }

    public C22903bl<Integer> getHotSearchWordsShowInterval() {
        if (this.hotSearchWordsShowInterval == null) {
            this.hotSearchWordsShowInterval = new C22903bl<>("hot_search_words_show_interval", Integer.valueOf(2));
            this.cacheItems.add(this.hotSearchWordsShowInterval);
        }
        return this.hotSearchWordsShowInterval;
    }

    public C22903bl<String> getHotsoonDownloadUrl() {
        if (this.hotsoonDownloadUrl == null) {
            this.hotsoonDownloadUrl = new C22903bl<>("hotsoon_download_url", "");
            this.cacheItems.add(this.hotsoonDownloadUrl);
        }
        return this.hotsoonDownloadUrl;
    }

    public C22903bl<Integer> getHttpRetryCount() {
        if (this.httpRetryCount == null) {
            this.httpRetryCount = new C22903bl<>("http_retry_count", Integer.valueOf(3));
            this.cacheItems.add(this.httpRetryCount);
        }
        return this.httpRetryCount;
    }

    public C22903bl<Long> getHttpRetryInterval() {
        if (this.httpRetryInterval == null) {
            this.httpRetryInterval = new C22903bl<>("http_retry_interval", Long.valueOf(500));
            this.cacheItems.add(this.httpRetryInterval);
        }
        return this.httpRetryInterval;
    }

    public C22903bl<Long> getHttpTimeOut() {
        if (this.httpTimeOut == null) {
            this.httpTimeOut = new C22903bl<>("http_timeout", Long.valueOf(DouPlusShareGuideExperiment.MIN_VALID_DURATION));
            this.cacheItems.add(this.httpTimeOut);
        }
        return this.httpTimeOut;
    }

    public C22903bl<Boolean> getIesOffline() {
        if (this.iesOffline == null) {
            this.iesOffline = new C22903bl<>("iesoffline", Boolean.valueOf(true));
            this.cacheItems.add(this.iesOffline);
        }
        return this.iesOffline;
    }

    public C22903bl<String> getImUrlTemplateItem() {
        if (this.imUrlTemplate == null) {
            this.imUrlTemplate = new C22903bl<>("im_url_template", "");
            this.cacheItems.add(this.imUrlTemplate);
        }
        return this.imUrlTemplate;
    }

    public C22903bl<String> getInvitedContacts() {
        if (this.invitedContacts == null) {
            this.invitedContacts = new C22903bl<>("invite_friends", "");
            this.cacheItems.add(this.invitedContacts);
        }
        return this.invitedContacts;
    }

    public C22903bl<Boolean> getIsAwemePrivate() {
        if (this.isAwemePrivate == null) {
            this.isAwemePrivate = new C22903bl<>("is_aweme_private", Boolean.valueOf(false));
            this.cacheItems.add(this.isAwemePrivate);
        }
        return this.isAwemePrivate;
    }

    public C22903bl<Boolean> getIsBubbleShown() {
        if (this.isBubbleShown == null) {
            this.isBubbleShown = new C22903bl<>("bubble_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.isBubbleShown);
        }
        return this.isBubbleShown;
    }

    public C22903bl<Boolean> getIsChangeFollowTab() {
        if (this.ischangeFollowTab == null) {
            this.ischangeFollowTab = new C22903bl<>("is_change_follow_tab", Boolean.valueOf(false));
            this.cacheItems.add(this.ischangeFollowTab);
        }
        return this.ischangeFollowTab;
    }

    public C22903bl<Boolean> getIsContactsUploaded() {
        if (this.isContactsUploaded == null) {
            this.isContactsUploaded = new C22903bl<>("contacts_uploaded", Boolean.valueOf(false));
            this.cacheItems.add(this.isContactsUploaded);
        }
        return this.isContactsUploaded;
    }

    public C22903bl<Boolean> getIsEnableCacheUserInsert() {
        if (this.enableCacheUserInsert == null) {
            this.enableCacheUserInsert = new C22903bl<>("enable_cache_user_insert", Boolean.valueOf(false));
            this.cacheItems.add(this.enableCacheUserInsert);
        }
        return this.enableCacheUserInsert;
    }

    public C22903bl<Boolean> getIsEnableCacheUserList() {
        if (this.enableCacheUserList == null) {
            this.enableCacheUserList = new C22903bl<>("enable_cache_user_list", Boolean.valueOf(false));
            this.cacheItems.add(this.enableCacheUserList);
        }
        return this.enableCacheUserList;
    }

    public C22903bl<Boolean> getIsEnableLocalMusicEntrance() {
        if (this.isEnableLocalMusicEntrance == null) {
            this.isEnableLocalMusicEntrance = new C22903bl<>("is_enable_local_music_entrance", Boolean.valueOf(false));
            this.cacheItems.add(this.isEnableLocalMusicEntrance);
        }
        return this.isEnableLocalMusicEntrance;
    }

    public C22903bl<Boolean> getIsEnableUpdateUserDialog() {
        if (this.isEnableUpdateUserDialog == null) {
            this.isEnableUpdateUserDialog = new C22903bl<>("is_enable_update_user", Boolean.valueOf(false));
            this.cacheItems.add(this.isEnableUpdateUserDialog);
        }
        return this.isEnableUpdateUserDialog;
    }

    public C22903bl<Boolean> getIsFirstFavouriteSuccess() {
        if (this.isFirstFavouriteSuccess == null) {
            this.isFirstFavouriteSuccess = new C22903bl<>("first_favourite_success", Boolean.valueOf(false));
            this.cacheItems.add(this.isFirstFavouriteSuccess);
        }
        return this.isFirstFavouriteSuccess;
    }

    public C22903bl<Boolean> getIsFirstLaunch() {
        if (this.isFirstLaunch == null) {
            this.isFirstLaunch = new C22903bl<>("is_first_lauch", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstLaunch);
        }
        return this.isFirstLaunch;
    }

    public C22903bl<Boolean> getIsFirstReportVideo() {
        if (this.isFirstReportVideo == null) {
            this.isFirstReportVideo = new C22903bl<>("is_first_report_video", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstReportVideo);
        }
        return this.isFirstReportVideo;
    }

    public C22903bl<Boolean> getIsFirstSetPrivate() {
        if (this.isFirstSetPrivate == null) {
            this.isFirstSetPrivate = new C22903bl<>("first_set_aweme_private", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstSetPrivate);
        }
        return this.isFirstSetPrivate;
    }

    public C22903bl<Boolean> getIsFirstShowFavouriteAnimation() {
        if (this.isFirstShowFavouriteAnimation == null) {
            this.isFirstShowFavouriteAnimation = new C22903bl<>("first_show_favourite_animation", Boolean.valueOf(false));
            this.cacheItems.add(this.isFirstShowFavouriteAnimation);
        }
        return this.isFirstShowFavouriteAnimation;
    }

    public C22903bl<Integer> getIsForceHttps() {
        if (this.isForceHttps == null) {
            this.isForceHttps = new C22903bl<>("isforcehttps", Integer.valueOf(0));
            this.cacheItems.add(this.isForceHttps);
        }
        return this.isForceHttps;
    }

    public C22903bl<Boolean> getIsGrantedLocationPermission() {
        if (this.isGrantedLocationPermission == null) {
            this.isGrantedLocationPermission = new C22903bl<>("location_granted", Boolean.valueOf(false));
            this.cacheItems.add(this.isGrantedLocationPermission);
        }
        return this.isGrantedLocationPermission;
    }

    public C22903bl<Boolean> getIsHotSearchAwemeBillboardEnable() {
        if (this.isHotSearchAwemeBillboardEnable == null) {
            this.isHotSearchAwemeBillboardEnable = new C22903bl<>("is_hot_search_aweme_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchAwemeBillboardEnable);
        }
        return this.isHotSearchAwemeBillboardEnable;
    }

    public C22903bl<Boolean> getIsHotSearchBillboardEnable() {
        if (this.isHotSearchBillboardEnable == null) {
            this.isHotSearchBillboardEnable = new C22903bl<>("is_hot_search_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchBillboardEnable);
        }
        return this.isHotSearchBillboardEnable;
    }

    public C22903bl<Boolean> getIsHotSearchMusicalBillboardEnable() {
        if (this.isHotSearchMusicalBillboardEnable == null) {
            this.isHotSearchMusicalBillboardEnable = new C22903bl<>("is_hot_search_music_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchMusicalBillboardEnable);
        }
        return this.isHotSearchMusicalBillboardEnable;
    }

    public C22903bl<Boolean> getIsHotSearchPositiveEnergyBillboardEnable() {
        if (this.isHotSearchPositiveEnergyBillboardEnable == null) {
            this.isHotSearchPositiveEnergyBillboardEnable = new C22903bl<>("is_hot_search_positive_energy_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchPositiveEnergyBillboardEnable);
        }
        return this.isHotSearchPositiveEnergyBillboardEnable;
    }

    public C22903bl<Boolean> getIsLike2DynamicBubbleHasShowed() {
        if (this.isLike2DynamicBubbleHasShowed == null) {
            this.isLike2DynamicBubbleHasShowed = new C22903bl<>("profile_like2dynamic_bubble_has_showed", Boolean.valueOf(false));
            this.cacheItems.add(this.isLike2DynamicBubbleHasShowed);
        }
        return this.isLike2DynamicBubbleHasShowed;
    }

    public C22903bl<Integer> getIsNewInstall() {
        if (this.isNewInstall == null) {
            this.isNewInstall = new C22903bl<>("is_new_install", Integer.valueOf(-1));
            this.cacheItems.add(this.isNewInstall);
        }
        return this.isNewInstall;
    }

    public C22903bl<Boolean> getIsOldUser() {
        if (this.isOldUser == null) {
            this.isOldUser = new C22903bl<>("old_user", Boolean.valueOf(false));
            this.cacheItems.add(this.isOldUser);
        }
        return this.isOldUser;
    }

    public C22903bl<Boolean> getIsPoiBubbleShown() {
        if (this.isPoiBubbleShown == null) {
            this.isPoiBubbleShown = new C22903bl<>("poi_bubble_shown", Boolean.valueOf(true));
            this.cacheItems.add(this.isPoiBubbleShown);
        }
        return this.isPoiBubbleShown;
    }

    public C22903bl<Boolean> getIsPrivateAvailable() {
        if (this.isPrivateAvailable == null) {
            this.isPrivateAvailable = new C22903bl<>("private_aweme_available", Boolean.valueOf(true));
            this.cacheItems.add(this.isPrivateAvailable);
        }
        return this.isPrivateAvailable;
    }

    public C22903bl<Boolean> getIsProfileBubbleShown() {
        if (this.isProfileBubbleShown == null) {
            this.isProfileBubbleShown = new C22903bl<>("profile_bubble_shown", Boolean.valueOf(true));
            this.cacheItems.add(this.isProfileBubbleShown);
        }
        return this.isProfileBubbleShown;
    }

    public C22903bl<Boolean> getIsProfileNavBarBubbleShown() {
        if (this.isProfileNavbarBubbleShown == null) {
            this.isProfileNavbarBubbleShown = new C22903bl<>("profile_bubble_navbar_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.isProfileNavbarBubbleShown);
        }
        return this.isProfileNavbarBubbleShown;
    }

    public C22903bl<Boolean> getIsShowAllowDownloadTipSetting() {
        if (this.isShowAllowDownloadTipSetting == null) {
            this.isShowAllowDownloadTipSetting = new C22903bl<>("isShowAllowDownloadTip", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowAllowDownloadTipSetting);
        }
        return this.isShowAllowDownloadTipSetting;
    }

    public C22903bl<Boolean> getIsShowFavouriteIcon() {
        if (this.isShowFavouriteIcon == null) {
            this.isShowFavouriteIcon = new C22903bl<>("show_favourite_icon", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowFavouriteIcon);
        }
        return this.isShowFavouriteIcon;
    }

    public C22903bl<Boolean> getIsShowFavouritePopup() {
        if (this.isShowFavouritePopup == null) {
            this.isShowFavouritePopup = new C22903bl<>("is_show_favourite_popup", Boolean.valueOf(true));
            this.cacheItems.add(this.isShowFavouritePopup);
        }
        return this.isShowFavouritePopup;
    }

    public C22903bl<Boolean> getIsShowHotSearchVideoTip() {
        if (this.isShowHotSearchVideoTip == null) {
            this.isShowHotSearchVideoTip = new C22903bl<>("is_show_hot_search_video_tip", Boolean.valueOf(true));
            this.cacheItems.add(this.isShowHotSearchVideoTip);
        }
        return this.isShowHotSearchVideoTip;
    }

    public C22903bl<Boolean> getIsShowRankingIndicator() {
        if (this.isShowRankingIndicator == null) {
            this.isShowRankingIndicator = new C22903bl<>("is_show_ranking_indicator", Boolean.valueOf(true));
            this.cacheItems.add(this.isShowRankingIndicator);
        }
        return this.isShowRankingIndicator;
    }

    public C22903bl<Boolean> getIsShowUserFeedBackPoint() {
        if (this.isShowUserFeedBackPoint == null) {
            this.isShowUserFeedBackPoint = new C22903bl<>("si_show_user_feed_back_point", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowUserFeedBackPoint);
        }
        return this.isShowUserFeedBackPoint;
    }

    public C22903bl<Boolean> getIsTargetBindingUser() {
        if (this.isTargetBindingUser == null) {
            this.isTargetBindingUser = new C22903bl<>("is_target_binding_user", Boolean.valueOf(false));
            this.cacheItems.add(this.isTargetBindingUser);
        }
        return this.isTargetBindingUser;
    }

    public C22903bl<Boolean> getIsUseBackRefresh() {
        if (this.isUseBackRefresh == null) {
            this.isUseBackRefresh = new C22903bl<>("is_use_back_refresh", Boolean.valueOf(true));
            this.cacheItems.add(this.isUseBackRefresh);
        }
        return this.isUseBackRefresh;
    }

    public C22903bl<Boolean> getIsUseTTnet() {
        if (this.isUseTTnet == null) {
            this.isUseTTnet = new C22903bl<>("is_use_ttnet", Boolean.valueOf(false));
            this.cacheItems.add(this.isUseTTnet);
        }
        return this.isUseTTnet;
    }

    public C22903bl<Boolean> getIsUseTongdunSdk() {
        if (this.isUseTongdunSdk == null) {
            this.isUseTongdunSdk = new C22903bl<>("is_use_tongdun_sdk", Boolean.valueOf(true));
            this.cacheItems.add(this.isUseTongdunSdk);
        }
        return this.isUseTongdunSdk;
    }

    public C22903bl<String> getJsActlogUrl() {
        if (this.jsActlogUrl == null) {
            this.jsActlogUrl = new C22903bl<>("js_actlog_url", "");
            this.cacheItems.add(this.jsActlogUrl);
        }
        return this.jsActlogUrl;
    }

    public C22903bl<String> getJudgementClauseScheme() {
        if (this.judgementClauseScheme == null) {
            this.judgementClauseScheme = new C22903bl<>("judgement_clause_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fjudgment_clause%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_judgment_clause%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.judgementClauseScheme);
        }
        return this.judgementClauseScheme;
    }

    public C22903bl<Long> getLastCloseFeedUpdateDialogTime() {
        if (this.lastCloseFeedUpdateUserDialog == null) {
            this.lastCloseFeedUpdateUserDialog = new C22903bl<>("last_close_feed_update_user_dialog", Long.valueOf(0));
            this.cacheItems.add(this.lastCloseFeedUpdateUserDialog);
        }
        return this.lastCloseFeedUpdateUserDialog;
    }

    public C22903bl<Long> getLastCloseUpdateDialogTime() {
        if (this.lastCloseUpdateUserDialog == null) {
            this.lastCloseUpdateUserDialog = new C22903bl<>("last_close_update_user_dialog", Long.valueOf(0));
            this.cacheItems.add(this.lastCloseUpdateUserDialog);
        }
        return this.lastCloseUpdateUserDialog;
    }

    public C22903bl<Long> getLastEnterProfileTime() {
        if (this.lastEnterProfileTime == null) {
            this.lastEnterProfileTime = new C22903bl<>("last_enter_profile_time", Long.valueOf(0));
            this.cacheItems.add(this.lastEnterProfileTime);
        }
        return this.lastEnterProfileTime;
    }

    public C22903bl<Long> getLastFeedCount() {
        if (this.lastFeedCount == null) {
            this.lastFeedCount = new C22903bl<>("last_feed_count", Long.valueOf(0));
            this.cacheItems.add(this.lastFeedCount);
        }
        return this.lastFeedCount;
    }

    public C22903bl<Long> getLastFeedTime() {
        if (this.lastFeedTime == null) {
            this.lastFeedTime = new C22903bl<>("last_feed_time", Long.valueOf(0));
            this.cacheItems.add(this.lastFeedTime);
        }
        return this.lastFeedTime;
    }

    public C22903bl<Long> getLastFetchUserCacheIntervals() {
        if (this.lastFetchUserCacheIntervals == null) {
            this.lastFetchUserCacheIntervals = new C22903bl<>("last_fetch_user_cache_intervals", Long.valueOf(0));
            this.cacheItems.add(this.lastFetchUserCacheIntervals);
        }
        return this.lastFetchUserCacheIntervals;
    }

    public C22903bl<Long> getLastFilterTime() {
        if (this.lastFilterTime == null) {
            this.lastFilterTime = new C22903bl<>("last_filter_time", Long.valueOf(0));
            this.cacheItems.add(this.lastFilterTime);
        }
        return this.lastFilterTime;
    }

    public C22903bl<Long> getLastGetRelieveAwemeTime() {
        if (this.lastGetRelieveAwemeTime == null) {
            this.lastGetRelieveAwemeTime = new C22903bl<>("has_relieve_aweme", Long.valueOf(0));
            this.cacheItems.add(this.lastGetRelieveAwemeTime);
        }
        return this.lastGetRelieveAwemeTime;
    }

    public C22903bl<Long> getLastHintToastTime() {
        if (this.lastHintToastTime == null) {
            this.lastHintToastTime = new C22903bl<>("last_hint_toast_time", Long.valueOf(0));
            this.cacheItems.add(this.lastHintToastTime);
        }
        return this.lastHintToastTime;
    }

    public C22903bl<Long> getLastInviteAllTimeStampItem() {
        if (this.invitedAllTimeStamp == null) {
            this.invitedAllTimeStamp = new C22903bl<>("contact_invite_all_time_stamp", Long.valueOf(0));
            this.cacheItems.add(this.invitedAllTimeStamp);
        }
        return this.invitedAllTimeStamp;
    }

    public C22903bl<Long> getLastLockedTime() {
        if (this.lastLockedTime == null) {
            this.lastLockedTime = new C22903bl<>("last_append_video_time", Long.valueOf(0));
            this.cacheItems.add(this.lastLockedTime);
        }
        return this.lastLockedTime;
    }

    public C22903bl<Boolean> getLastPublishFailed() {
        if (this.lastPublishFailed == null) {
            this.lastPublishFailed = new C22903bl<>("last_publish_failed", Boolean.valueOf(false));
            this.cacheItems.add(this.lastPublishFailed);
        }
        return this.lastPublishFailed;
    }

    public C22903bl<Long> getLastShowBindHintTime() {
        if (this.lastShowBindHintTime == null) {
            this.lastShowBindHintTime = new C22903bl<>("lastShowBindHintTime", Long.valueOf(0));
            this.cacheItems.add(this.lastShowBindHintTime);
        }
        return this.lastShowBindHintTime;
    }

    public C22903bl<Long> getLastShowProfileBindHintTime() {
        if (this.lastShowProfileBindHintTime == null) {
            this.lastShowProfileBindHintTime = new C22903bl<>("lastShowProfileBindHintTime", Long.valueOf(0));
            this.cacheItems.add(this.lastShowProfileBindHintTime);
        }
        return this.lastShowProfileBindHintTime;
    }

    public C22903bl<Long> getLastUnlockTime() {
        if (this.lastUnlockTime == null) {
            this.lastUnlockTime = new C22903bl<>("last_unlock_time", Long.valueOf(0));
            this.cacheItems.add(this.lastUnlockTime);
        }
        return this.lastUnlockTime;
    }

    public C22903bl<String> getLastUploadPassCode() {
        if (this.lastUploadPassCode == null) {
            this.lastUploadPassCode = new C22903bl<>("hasuploadpasscode", "");
            this.cacheItems.add(this.lastUploadPassCode);
        }
        return this.lastUploadPassCode;
    }

    public C22903bl<Integer> getLastUsableNetworkSpeed() {
        if (this.lastUsableNetworkSpeed == null) {
            this.lastUsableNetworkSpeed = new C22903bl<>("last_usable_network_speed", Integer.valueOf(-1));
        }
        return this.lastUsableNetworkSpeed;
    }

    public C22903bl<Integer> getLiveCoverAuditFailedTimes() {
        if (this.liveCoverAuditFailedTimes == null) {
            this.liveCoverAuditFailedTimes = new C22903bl<>("live_cover_audit_failed_times", Integer.valueOf(1));
            this.cacheItems.add(this.liveCoverAuditFailedTimes);
        }
        return this.liveCoverAuditFailedTimes;
    }

    public C22903bl<Integer> getLiveCoverBubble() {
        if (this.liveCoverBubble == null) {
            this.liveCoverBubble = new C22903bl<>("live_cover_bubble", Integer.valueOf(1));
            this.cacheItems.add(this.liveCoverBubble);
        }
        return this.liveCoverBubble;
    }

    public C22903bl<Integer> getLiveCoverWarnChangeTimes() {
        if (this.liveCoverWarnChangeTimes == null) {
            this.liveCoverWarnChangeTimes = new C22903bl<>("live_cover_warn_change_times", Integer.valueOf(1));
            this.cacheItems.add(this.liveCoverWarnChangeTimes);
        }
        return this.liveCoverWarnChangeTimes;
    }

    public C22903bl<Integer> getLiveDefaultBitrate() {
        if (this.liveDefaultBitrate == null) {
            this.liveDefaultBitrate = new C22903bl<>("live_default_bitrate", Integer.valueOf(0));
            this.cacheItems.add(this.liveDefaultBitrate);
        }
        return this.liveDefaultBitrate;
    }

    public C22903bl<Integer> getLiveMaxBitrate() {
        if (this.liveMaxBitrate == null) {
            this.liveMaxBitrate = new C22903bl<>("live_max_bitrate", Integer.valueOf(0));
            this.cacheItems.add(this.liveMaxBitrate);
        }
        return this.liveMaxBitrate;
    }

    public C22903bl<Integer> getLiveMinBitrate() {
        if (this.liveMinBitrate == null) {
            this.liveMinBitrate = new C22903bl<>("live_min_bitrate", Integer.valueOf(0));
            this.cacheItems.add(this.liveMinBitrate);
        }
        return this.liveMinBitrate;
    }

    public C22903bl<Boolean> getLiveSkylightShowAnimation() {
        if (this.liveSkylightShowAnimation == null) {
            this.liveSkylightShowAnimation = new C22903bl<>("live_skylight_show_animation", Boolean.valueOf(false));
            this.cacheItems.add(this.liveSkylightShowAnimation);
        }
        return this.liveSkylightShowAnimation;
    }

    public C22903bl<Boolean> getLongVideoPermitted() {
        if (this.longVideoPermitted == null) {
            this.longVideoPermitted = new C22903bl<>("long_video_permitted", Boolean.valueOf(false));
            this.cacheItems.add(this.longVideoPermitted);
        }
        return this.longVideoPermitted;
    }

    public C22903bl<Long> getLongVideoThreshold() {
        if (this.longVideoThreshold == null) {
            this.longVideoThreshold = new C22903bl<>("long_video_threshold", Long.valueOf(60000));
            this.cacheItems.add(this.longVideoThreshold);
        }
        return this.longVideoThreshold;
    }

    public C22903bl<String> getMiniAppLabelTitle() {
        if (this.miniAppLabTitle == null) {
            this.miniAppLabTitle = new C22903bl<>("lab_title", "");
            this.cacheItems.add(this.miniAppLabTitle);
        }
        return this.miniAppLabTitle;
    }

    public C22903bl<String> getMpTab() {
        if (this.mpTab == null) {
            this.mpTab = new C22903bl<>("mp_tab", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fmp_tab%3Fhide_nav_bar%3D1%26enter_from%3DrnToWeb");
            this.cacheItems.add(this.mpTab);
        }
        return this.mpTab;
    }

    public C22903bl<Integer> getMultiSelectLimitItem() {
        if (this.multiSelectLimit == null) {
            this.multiSelectLimit = new C22903bl<>("multi_select_limit", Integer.valueOf(10));
            this.cacheItems.add(this.multiSelectLimit);
        }
        return this.multiSelectLimit;
    }

    public C22903bl<String> getMusicBillboardRuleUrl() {
        if (this.musicBillboardRuleUrl == null) {
            this.musicBillboardRuleUrl = new C22903bl<>("music_billboard_rule_url", "");
            this.cacheItems.add(this.musicBillboardRuleUrl);
        }
        return this.musicBillboardRuleUrl;
    }

    public C22903bl<String> getMusicRingtoneScheme() {
        if (this.musicRingtoneScheme == null) {
            this.musicRingtoneScheme = new C22903bl<>("music_ringtone_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fringtone%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_ringtone%26bg_theme%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.musicRingtoneScheme);
        }
        return this.musicRingtoneScheme;
    }

    public C22903bl<Integer> getMusicianShowType() {
        if (this.musicianShowType == null) {
            this.musicianShowType = new C22903bl<>("musician_show_type", Integer.valueOf(0));
            this.cacheItems.add(this.musicianShowType);
        }
        return this.musicianShowType;
    }

    public C22903bl<String> getNeedChooseLanguages() {
        if (this.needChooseLanguages == null) {
            this.needChooseLanguages = new C22903bl<>("need_choose_languages", "");
            this.cacheItems.add(this.needChooseLanguages);
        }
        return this.needChooseLanguages;
    }

    public C22903bl<Integer> getNetworkLibTypeItem() {
        if (this.networkLibType == null) {
            this.networkLibType = new C22903bl<>("network_lib_type", Integer.valueOf(1));
            this.cacheItems.add(this.networkLibType);
        }
        return this.networkLibType;
    }

    public C22903bl<Boolean> getNewAnchorShowBubble() {
        if (this.newAnchorShowBubble == null) {
            this.newAnchorShowBubble = new C22903bl<>("new_anchor_show_bubble", Boolean.valueOf(false));
            this.cacheItems.add(this.newAnchorShowBubble);
        }
        return this.newAnchorShowBubble;
    }

    public synchronized C22903bl<String> getNewbieHelpShopUrl() {
        if (this.newbieHelpShopUrl == null) {
            this.newbieHelpShopUrl = new C22903bl<>("newbie_help_shop_url", "");
            this.cacheItems.add(this.newbieHelpShopUrl);
        }
        return this.newbieHelpShopUrl;
    }

    public C22903bl<Long> getNormalGuideDisplayTimeIntervals() {
        if (this.normalGuideDisplayTimeIntervals == null) {
            this.normalGuideDisplayTimeIntervals = new C22903bl<>("normal_guide_display_time_intervals", Long.valueOf(0));
            this.cacheItems.add(this.normalGuideDisplayTimeIntervals);
        }
        return this.normalGuideDisplayTimeIntervals;
    }

    public C22903bl<Integer> getNormalGuideDisplayTimes() {
        if (this.normalGuideDisplayTimes == null) {
            this.normalGuideDisplayTimes = new C22903bl<>("normal_guide_display_times", Integer.valueOf(0));
            this.cacheItems.add(this.normalGuideDisplayTimes);
        }
        return this.normalGuideDisplayTimes;
    }

    public C22903bl<Integer> getNoticeCountLatency() {
        if (this.noticeCountLatency == null) {
            this.noticeCountLatency = new C22903bl<>("notice_count_latency", Integer.valueOf(0));
            this.cacheItems.add(this.noticeCountLatency);
        }
        return this.noticeCountLatency;
    }

    public C22903bl<String> getOpenAppBackLogParams() {
        if (this.openAppBackLogParams == null) {
            this.openAppBackLogParams = new C22903bl<>("open_app_back_log_params", "");
        }
        return this.openAppBackLogParams;
    }

    public C22903bl<Integer> getOpenImLinkItem() {
        if (this.openImLink == null) {
            this.openImLink = new C22903bl<>("open_im_link", Integer.valueOf(0));
            this.cacheItems.add(this.openImLink);
        }
        return this.openImLink;
    }

    public C22903bl<Long> getOperationGuideDisplayTimeIntervals() {
        if (this.operationGuideDisplayTimeIntervals == null) {
            this.operationGuideDisplayTimeIntervals = new C22903bl<>("operation_guide_display_time_intervals", Long.valueOf(0));
            this.cacheItems.add(this.operationGuideDisplayTimeIntervals);
        }
        return this.operationGuideDisplayTimeIntervals;
    }

    public C22903bl<Integer> getOperationGuideDisplayTimes() {
        if (this.operationGuideDisplayTimes == null) {
            this.operationGuideDisplayTimes = new C22903bl<>("operation_guide_display_times", Integer.valueOf(0));
            this.cacheItems.add(this.operationGuideDisplayTimes);
        }
        return this.operationGuideDisplayTimes;
    }

    public C22903bl<String> getOrderShareIntroUrl() {
        if (this.orderShareIntroUrl == null) {
            this.orderShareIntroUrl = new C22903bl<>("order_share_intro_url", "");
            this.cacheItems.add(this.orderShareIntroUrl);
        }
        return this.orderShareIntroUrl;
    }

    public C22903bl<String> getOrginalMusicianUrl() {
        if (this.orginalMusicianUrl == null) {
            this.orginalMusicianUrl = new C22903bl<>("orginal_musician_url", "");
            this.cacheItems.add(this.orginalMusicianUrl);
        }
        return this.orginalMusicianUrl;
    }

    public C22903bl<Boolean> getOriginalMusiciaShareStyle() {
        if (this.originalMusiciaShareStyle == null) {
            this.originalMusiciaShareStyle = new C22903bl<>("original_musician_share_style", Boolean.valueOf(false));
            this.cacheItems.add(this.originalMusiciaShareStyle);
        }
        return this.originalMusiciaShareStyle;
    }

    public C22903bl<Boolean> getOriginalMusicianEntry() {
        if (this.originalMusicianEntry == null) {
            this.originalMusicianEntry = new C22903bl<>("original_musician_entry", Boolean.valueOf(false));
            this.cacheItems.add(this.originalMusicianEntry);
        }
        return this.originalMusicianEntry;
    }

    public C22903bl<Integer> getPersonalizationMode() {
        if (this.personalizationMode == null) {
            this.personalizationMode = new C22903bl<>("personalization_mode", Integer.valueOf(0));
            this.cacheItems.add(this.personalizationMode);
        }
        return this.personalizationMode;
    }

    public C22903bl<String> getPoiErrorReport() {
        if (this.poiErrorReport == null) {
            this.poiErrorReport = new C22903bl<>("poi_error_report", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fpoi_error_report%2F%3Fhide_nav_bar%3D1%26loading_bgcolor%3D%2523161823&hide_nav_bar=1&loading_bgcolor=%23161823&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_error_report%26force_h5%3D0%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dpoi_page");
            this.cacheItems.add(this.poiErrorReport);
        }
        return this.poiErrorReport;
    }

    public C22903bl<String> getPreviewGoodReport() {
        if (this.previewGoodReport == null) {
            this.previewGoodReport = new C22903bl<>("preview_good_report", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fgoods_report%3Fhide_status_bar%3D0%26hide_nav_bar%3D1%26loading_bgcolor%3D%2523161823&hide_status_bar=0&hide_nav_bar=1&loading_bgcolor=%23161823");
            this.cacheItems.add(this.previewGoodReport);
        }
        return this.previewGoodReport;
    }

    public C22903bl<Integer> getPrivacyAccountFollowCount() {
        if (this.privacyAccountFollowCount == null) {
            this.privacyAccountFollowCount = new C22903bl<>("privacy_account_follow_count", Integer.valueOf(0));
        }
        return this.privacyAccountFollowCount;
    }

    public C22903bl<Integer> getPrivacyDownloadSetting() {
        if (this.privacyDownloadSetting == null) {
            this.privacyDownloadSetting = new C22903bl<>("enablePrivacyDownload", Integer.valueOf(0));
            this.cacheItems.add(this.privacyDownloadSetting);
        }
        return this.privacyDownloadSetting;
    }

    public C22903bl<String> getPrivacyReminderH5Url() {
        if (this.privacyReminderH5Url == null) {
            this.privacyReminderH5Url = new C22903bl<>("privacy_reminder", "");
            this.cacheItems.add(this.privacyReminderH5Url);
        }
        return this.privacyReminderH5Url;
    }

    public C22903bl<Float> getProfileCompletionThreshold() {
        if (this.profileCompletionThreshold == null) {
            this.profileCompletionThreshold = new C22903bl<>("profilecompletion_threshold", Float.valueOf(0.0f));
            this.cacheItems.add(this.profileCompletionThreshold);
        }
        return this.profileCompletionThreshold;
    }

    public C22903bl<Float> getProfilePerfectionAvatar() {
        if (this.profilePerfectionAvatar == null) {
            this.profilePerfectionAvatar = new C22903bl<>("profileperfection_avatar", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionAvatar);
        }
        return this.profilePerfectionAvatar;
    }

    public C22903bl<Float> getProfilePerfectionBirthday() {
        if (this.profilePerfectionBirthday == null) {
            this.profilePerfectionBirthday = new C22903bl<>("profileperfection_birthday", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionBirthday);
        }
        return this.profilePerfectionBirthday;
    }

    public C22903bl<Float> getProfilePerfectionGender() {
        if (this.profilePerfectionGender == null) {
            this.profilePerfectionGender = new C22903bl<>("profileperfection_gender", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionGender);
        }
        return this.profilePerfectionGender;
    }

    public C22903bl<Float> getProfilePerfectionLocation() {
        if (this.profilePerfectionLocation == null) {
            this.profilePerfectionLocation = new C22903bl<>("profileperfection_location", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionLocation);
        }
        return this.profilePerfectionLocation;
    }

    public C22903bl<Float> getProfilePerfectionNickname() {
        if (this.profilePerfectionNickname == null) {
            this.profilePerfectionNickname = new C22903bl<>("profileperfection_nickname", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionNickname);
        }
        return this.profilePerfectionNickname;
    }

    public C22903bl<Float> getProfilePerfectionSchool() {
        if (this.profilePerfectionSchool == null) {
            this.profilePerfectionSchool = new C22903bl<>("profileperfection_school", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionSchool);
        }
        return this.profilePerfectionSchool;
    }

    public C22903bl<Float> getProfilePerfectionShortId() {
        if (this.profilePerfectionShortId == null) {
            this.profilePerfectionShortId = new C22903bl<>("profileperfection_shortid", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionShortId);
        }
        return this.profilePerfectionShortId;
    }

    public C22903bl<Float> getProfilePerfectionSignature() {
        if (this.profilePerfectionSignature == null) {
            this.profilePerfectionSignature = new C22903bl<>("profileperfection_signature", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionSignature);
        }
        return this.profilePerfectionSignature;
    }

    public C22903bl<Long> getProgressbarThreshold() {
        if (this.progressbarThreshold == null) {
            this.progressbarThreshold = new C22903bl<>("progressbar_threshold", Long.valueOf(30000));
            this.cacheItems.add(this.progressbarThreshold);
        }
        return this.progressbarThreshold;
    }

    public C22903bl<Integer> getPromoteDialogPopupClickType() {
        if (this.promoteDialogPopupClickType == null) {
            this.promoteDialogPopupClickType = new C22903bl<>("promote_dialog_popup_click_type", Integer.valueOf(0));
            this.cacheItems.add(this.promoteDialogPopupClickType);
        }
        return this.promoteDialogPopupClickType;
    }

    public C22903bl<String> getPromoteDialogPopupPopupContent() {
        if (this.promoteDialogPopupPopupContent == null) {
            this.promoteDialogPopupPopupContent = new C22903bl<>("promote_dialog_popup_content", "");
            this.cacheItems.add(this.promoteDialogPopupPopupContent);
        }
        return this.promoteDialogPopupPopupContent;
    }

    public C22903bl<Integer> getPromoteDialogPopupPopupInterval() {
        if (this.promoteDialogPopupPopupInterval == null) {
            this.promoteDialogPopupPopupInterval = new C22903bl<>("promote_dialog_popup_interval", Integer.valueOf(7));
            this.cacheItems.add(this.promoteDialogPopupPopupInterval);
        }
        return this.promoteDialogPopupPopupInterval;
    }

    public C22903bl<String> getPromoteDialogPopupPopupLinkText() {
        if (this.promoteDialogPopupPopupLinkText == null) {
            this.promoteDialogPopupPopupLinkText = new C22903bl<>("promote_dialog_popup_linkText", "");
            this.cacheItems.add(this.promoteDialogPopupPopupLinkText);
        }
        return this.promoteDialogPopupPopupLinkText;
    }

    public C22903bl<String> getPromoteDialogPopupPopupMsg() {
        if (this.promoteDialogPopupPopupMsg == null) {
            this.promoteDialogPopupPopupMsg = new C22903bl<>("promote_dialog_popup_msg", "");
            this.cacheItems.add(this.promoteDialogPopupPopupMsg);
        }
        return this.promoteDialogPopupPopupMsg;
    }

    public C22903bl<String> getPromoteDialogPopupPopupTitle() {
        if (this.promoteDialogPopupPopupTitle == null) {
            this.promoteDialogPopupPopupTitle = new C22903bl<>("promote_dialog_popup_title", "");
            this.cacheItems.add(this.promoteDialogPopupPopupTitle);
        }
        return this.promoteDialogPopupPopupTitle;
    }

    public C22903bl<String> getPromoteDialogPopupPopupUrl() {
        if (this.promoteDialogPopupPopupUrl == null) {
            this.promoteDialogPopupPopupUrl = new C22903bl<>("promote_dialog_popup_url", "");
            this.cacheItems.add(this.promoteDialogPopupPopupUrl);
        }
        return this.promoteDialogPopupPopupUrl;
    }

    public C22903bl<Integer> getPromoteDialogPopupTimesLimit() {
        if (this.promoteDialogPopupTimesLimit == null) {
            this.promoteDialogPopupTimesLimit = new C22903bl<>("promote_dialog_popup_times_limit", Integer.valueOf(3));
            this.cacheItems.add(this.promoteDialogPopupTimesLimit);
        }
        return this.promoteDialogPopupTimesLimit;
    }

    public C22903bl<Boolean> getPromoteDialogShouldShow() {
        if (this.promoteDialogShouldShow == null) {
            this.promoteDialogShouldShow = new C22903bl<>("promote_dialog_show", Boolean.valueOf(false));
            this.cacheItems.add(this.promoteDialogShouldShow);
        }
        return this.promoteDialogShouldShow;
    }

    public C22903bl<String> getReactAddShopUrl() {
        if (this.reactAddShopUrl == null) {
            this.reactAddShopUrl = new C22903bl<>("react_edit_draft_url", "https://aweme.snssdk.com/falcon/rn/business?hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&initPage=home&hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&initPage=home");
            this.cacheItems.add(this.reactAddShopUrl);
        }
        return this.reactAddShopUrl;
    }

    public C22903bl<String> getReactEShopToolboxUrl() {
        if (this.reactEShopToolboxUrl == null) {
            this.reactEShopToolboxUrl = new C22903bl<>("react_e_shop_tool_box_url", "https://aweme.snssdk.com/falcon/rn/eshop_toolbox?hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff");
            this.cacheItems.add(this.reactEShopToolboxUrl);
        }
        return this.reactEShopToolboxUrl;
    }

    public C22903bl<String> getReferralEntrance() {
        if (this.referralEntrance == null) {
            this.referralEntrance = new C22903bl<>("invite_friends", "");
        }
        return this.referralEntrance;
    }

    public C22903bl<Integer> getRefreshZhima() {
        if (this.refreshZhima == null) {
            this.refreshZhima = new C22903bl<>("refresh_zhima", Integer.valueOf(0));
            this.cacheItems.add(this.refreshZhima);
        }
        return this.refreshZhima;
    }

    public C22903bl<Boolean> getRemoveFollowerSwitch() {
        if (this.removeFollowerSwitch == null) {
            this.removeFollowerSwitch = new C22903bl<>("remove_follower_switch", Boolean.valueOf(false));
        }
        return this.removeFollowerSwitch;
    }

    public C22903bl<String> getRequestNotificationText() {
        if (this.requestNotificationText == null) {
            this.requestNotificationText = new C22903bl<>("request_notification_text", "");
            this.cacheItems.add(this.requestNotificationText);
        }
        return this.requestNotificationText;
    }

    public C22903bl<String> getRequestNotificationTitle() {
        if (this.requestNotificationTitle == null) {
            this.requestNotificationTitle = new C22903bl<>("request_notification_title", "");
            this.cacheItems.add(this.requestNotificationTitle);
        }
        return this.requestNotificationTitle;
    }

    public C22903bl<Integer> getRnContextCreateTimeout() {
        if (this.mRnContextCreateTimeout == null) {
            this.mRnContextCreateTimeout = new C22903bl<>("rn_context_create_timeout", Integer.valueOf(3000));
            this.cacheItems.add(this.mRnContextCreateTimeout);
        }
        return this.mRnContextCreateTimeout;
    }

    public C22903bl<Boolean> getRnFallback() {
        if (this.rnFallback == null) {
            this.rnFallback = new C22903bl<>("rn_fallback", Boolean.valueOf(false));
            this.cacheItems.add(this.rnFallback);
        }
        return this.rnFallback;
    }

    public C22903bl<Boolean> getRnPreloadContextOn() {
        if (this.mRnPreloadContextOn == null) {
            this.mRnPreloadContextOn = new C22903bl<>("rn_preload_context_on", Boolean.valueOf(true));
            this.cacheItems.add(this.mRnPreloadContextOn);
        }
        return this.mRnPreloadContextOn;
    }

    public C22903bl<Boolean> getRnSnapshotOn() {
        if (this.mRnSnapshotOn == null) {
            this.mRnSnapshotOn = new C22903bl<>("rn_snap_shot_on", Boolean.valueOf(true));
            this.cacheItems.add(this.mRnSnapshotOn);
        }
        return this.mRnSnapshotOn;
    }

    public C22903bl<String> getSameCityActiveId() {
        if (this.sameCityActiveId == null) {
            this.sameCityActiveId = new C22903bl<>("same_city_active_id", "");
            this.cacheItems.add(this.sameCityActiveId);
        }
        return this.sameCityActiveId;
    }

    public C22903bl<Integer> getScrollToProfileGuideState() {
        if (this.scrollToProfileGuideState == null) {
            this.scrollToProfileGuideState = new C22903bl<>("scroll_to_profile_guide_state", Integer.valueOf(0));
            this.cacheItems.add(this.scrollToProfileGuideState);
        }
        return this.scrollToProfileGuideState;
    }

    public C22903bl<String> getSearchTabIndex() {
        if (this.searchTabIndex == null) {
            this.searchTabIndex = new C22903bl<>("search_tab_index", "");
            this.cacheItems.add(this.searchTabIndex);
        }
        return this.searchTabIndex;
    }

    public C22903bl<String> getSearchTrendBannerUrl() {
        if (this.searchTrendBannerUrl == null) {
            this.searchTrendBannerUrl = new C22903bl<>("search_trend_banner_url", "");
            this.cacheItems.add(this.searchTrendBannerUrl);
        }
        return this.searchTrendBannerUrl;
    }

    public C22903bl<String> getShareCookieCacheItem() {
        if (this.shareCookieCacheItem == null) {
            this.shareCookieCacheItem = new C22903bl<>("share_cookie_domain", "");
            this.cacheItems.add(this.shareCookieCacheItem);
        }
        return this.shareCookieCacheItem;
    }

    public C22903bl<Boolean> getShiledMusicSDK() {
        if (this.shiledMusicSDK == null) {
            this.shiledMusicSDK = new C22903bl<>("shield_music_sdk", Boolean.valueOf(false));
            this.cacheItems.add(this.shiledMusicSDK);
        }
        return this.shiledMusicSDK;
    }

    public C22903bl<String> getShopWishListUrl() {
        if (this.shopWishListUrl == null) {
            this.shopWishListUrl = new C22903bl<>("shop_wish_list_url", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fshop_wish_list%3Fhide_nav_bar%3D1%26loading_bgcolor%3D%2523FFFFFF%26bg_theme%3D%2523FFFFFF%26disable_pop_gesture%3D1&hide_nav_bar=1&loading_bgcolor=%23FFFFFF&bg_theme=%23FFFFFF&disable_pop_gesture=1");
            this.cacheItems.add(this.shopWishListUrl);
        }
        return this.shopWishListUrl;
    }

    public C22903bl<Boolean> getShouldShowFavouriteTip() {
        if (this.shouldShowFavouriteTip == null) {
            this.shouldShowFavouriteTip = new C22903bl<>("should_show_favourite_tip", Boolean.valueOf(true));
            this.cacheItems.add(this.shouldShowFavouriteTip);
        }
        return this.shouldShowFavouriteTip;
    }

    public C22903bl<Boolean> getShouldShowPrivateAccountTipInProfile() {
        if (this.shouldShowPrivateAccountTipInProfile == null) {
            this.shouldShowPrivateAccountTipInProfile = new C22903bl<>("show_private_account_tip_in_profile", Boolean.valueOf(false));
            this.cacheItems.add(this.shouldShowPrivateAccountTipInProfile);
        }
        return this.shouldShowPrivateAccountTipInProfile;
    }

    public C22903bl<Boolean> getShowAdIntroItem() {
        if (this.showAdIntroFlag == null) {
            this.showAdIntroFlag = new C22903bl<>("is_show_ad_intro", Boolean.valueOf(false));
            this.cacheItems.add(this.showAdIntroFlag);
        }
        return this.showAdIntroFlag;
    }

    public C22903bl<Boolean> getShowAddBusinessGoodsDot() {
        if (this.showAddBusinessGoodsDot == null) {
            this.showAddBusinessGoodsDot = new C22903bl<>("show_add_business_dot", Boolean.valueOf(true));
            this.cacheItems.add(this.showAddBusinessGoodsDot);
        }
        return this.showAddBusinessGoodsDot;
    }

    public C22903bl<Integer> getShowBindHintCount() {
        if (this.showBindHintCount == null) {
            this.showBindHintCount = new C22903bl<>("showBindHintCount", Integer.valueOf(0));
            this.cacheItems.add(this.showBindHintCount);
        }
        return this.showBindHintCount;
    }

    public C22903bl<Boolean> getShowCouponItem() {
        if (this.showCouponItem == null) {
            this.showCouponItem = new C22903bl<>("is_show_coupon_item", Boolean.valueOf(true));
            this.cacheItems.add(this.showCouponItem);
        }
        return this.showCouponItem;
    }

    public C22903bl<Boolean> getShowFansCard() {
        if (this.showFansCard == null) {
            this.showFansCard = new C22903bl<>("show_fans_card", Boolean.valueOf(true));
            this.cacheItems.add(this.showFansCard);
        }
        return this.showFansCard;
    }

    public C22903bl<Integer> getShowHashTagBg() {
        if (this.showHashTagBg == null) {
            this.showHashTagBg = new C22903bl<>("enable_hashtag_background", Integer.valueOf(0));
            this.cacheItems.add(this.showHashTagBg);
        }
        return this.showHashTagBg;
    }

    public C22903bl<Boolean> getShowInteractionStickers() {
        if (this.showInteractionStickers == null) {
            this.showInteractionStickers = new C22903bl<>("show_interaction_stickers", Boolean.valueOf(false));
        }
        return this.showInteractionStickers;
    }

    public C22903bl<Integer> getShowJumpEffectAfterFollowCount() {
        if (this.showJumpEffectAfterFollowCount == null) {
            this.showJumpEffectAfterFollowCount = new C22903bl<>("jump_effect_after_follow", Integer.valueOf(0));
            this.cacheItems.add(this.showJumpEffectAfterFollowCount);
        }
        return this.showJumpEffectAfterFollowCount;
    }

    public C22903bl<Integer> getShowLoginDialogState() {
        if (this.showLoginDialogState == null) {
            this.showLoginDialogState = new C22903bl<>("shown_login_dialog_state", Integer.valueOf(2));
            this.cacheItems.add(this.showLoginDialogState);
        }
        return this.showLoginDialogState;
    }

    public C22903bl<Boolean> getShowMiniAppFreshGuideBubble() {
        if (this.showMiniAppFreshGuideBubble == null) {
            this.showMiniAppFreshGuideBubble = new C22903bl<>("show_mini_app_fresh_guide_bubble", Boolean.valueOf(false));
            this.cacheItems.add(this.showMiniAppFreshGuideBubble);
        }
        return this.showMiniAppFreshGuideBubble;
    }

    public C22903bl<Boolean> getShowMiniAppFreshGuideDialog() {
        if (this.showMiniAppFreshGuideDialog == null) {
            this.showMiniAppFreshGuideDialog = new C22903bl<>("show_mini_app_fresh_guide_dialog", Boolean.valueOf(false));
            this.cacheItems.add(this.showMiniAppFreshGuideDialog);
        }
        return this.showMiniAppFreshGuideDialog;
    }

    public C22903bl<Boolean> getShowMiniAppFreshGuideNotify() {
        if (this.showMiniAppFreshGuideNotify == null) {
            this.showMiniAppFreshGuideNotify = new C22903bl<>("show_mini_app_fresh_guide_notify", Boolean.valueOf(false));
            this.cacheItems.add(this.showMiniAppFreshGuideNotify);
        }
        return this.showMiniAppFreshGuideNotify;
    }

    public C22903bl<Boolean> getShowPlayerInfoUI() {
        if (this.showPlayerInfoUI == null) {
            this.showPlayerInfoUI = new C22903bl<>("show_player_info_ui", Boolean.valueOf(false));
            this.cacheItems.add(this.showPlayerInfoUI);
        }
        return this.showPlayerInfoUI;
    }

    public C22903bl<Integer> getShowProfileBindHintCount() {
        if (this.showProfileBindHintCount == null) {
            this.showProfileBindHintCount = new C22903bl<>("showProfileBindHintCount", Integer.valueOf(0));
            this.cacheItems.add(this.showProfileBindHintCount);
        }
        return this.showProfileBindHintCount;
    }

    public C22903bl<Integer> getShowPromoteLicense() {
        if (this.showPromoteLicense == null) {
            this.showPromoteLicense = new C22903bl<>("show_creator_license_210", Integer.valueOf(0));
            this.cacheItems.add(this.showPromoteLicense);
        }
        return this.showPromoteLicense;
    }

    public C22903bl<Boolean> getShowTimeLineTab() {
        if (this.showTimeLineTab == null) {
            this.showTimeLineTab = new C22903bl<>("show_timeline_tab", Boolean.valueOf(false));
            this.cacheItems.add(this.showTimeLineTab);
        }
        return this.showTimeLineTab;
    }

    public C22903bl<Boolean> getShowVideoBitrateInfo() {
        if (this.showVideoBitrateInfo == null) {
            this.showVideoBitrateInfo = new C22903bl<>("showVideoBitrateInfo", Boolean.valueOf(false));
            this.cacheItems.add(this.showVideoBitrateInfo);
        }
        return this.showVideoBitrateInfo;
    }

    public C22903bl<String> getStarAtlasOrderWebUrl() {
        if (this.starAtlasOrderWebUrl == null) {
            this.starAtlasOrderWebUrl = new C22903bl<>("star_atlas_order", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fstar_order%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_douyin_ad_star_order%26bundle%3Dindex.js%26module_name%3Dpage_star_order%26hide_nav_bar%3D1%26");
            this.cacheItems.add(this.starAtlasOrderWebUrl);
        }
        return this.starAtlasOrderWebUrl;
    }

    public C22903bl<String> getStarBillboardRuleUrl() {
        if (this.starBillboardRuleUrl == null) {
            this.starBillboardRuleUrl = new C22903bl<>("star_billboard_rule_url", "");
            this.cacheItems.add(this.starBillboardRuleUrl);
        }
        return this.starBillboardRuleUrl;
    }

    public C22903bl<Boolean> getStickerArtEntry() {
        if (this.stickerArtEntry == null) {
            this.stickerArtEntry = new C22903bl<>("sticker_artist_entry", Boolean.valueOf(false));
            this.cacheItems.add(this.stickerArtEntry);
        }
        return this.stickerArtEntry;
    }

    public C22903bl<String> getStickerArtlistUrl() {
        if (this.stickerArtlistUrl == null) {
            this.stickerArtlistUrl = new C22903bl<>("sticker_artlist_url", "");
            this.cacheItems.add(this.stickerArtlistUrl);
        }
        return this.stickerArtlistUrl;
    }

    public C22903bl<String> getStoryFontType() {
        if (this.storyFontType == null) {
            this.storyFontType = new C22903bl<>("story_font_type", "");
        }
        return this.storyFontType;
    }

    public C22903bl<Integer> getStoryInfoStickerMaxCount() {
        if (this.storyInfoStickerMaxCount == null) {
            this.storyInfoStickerMaxCount = new C22903bl<>("story_info_sticker_max_count", Integer.valueOf(30));
            this.cacheItems.add(this.storyInfoStickerMaxCount);
        }
        return this.storyInfoStickerMaxCount;
    }

    public C22903bl<Boolean> getStoryPublishFriendsBanner() {
        if (this.storyPublishFriendsDuoshanBanner == null) {
            this.storyPublishFriendsDuoshanBanner = new C22903bl<>("story_publish_friend_banner", Boolean.valueOf(false));
        }
        return this.storyPublishFriendsDuoshanBanner;
    }

    public C22903bl<Boolean> getStoryPublishSaveLocal() {
        if (this.storyPublishSaveLocal == null) {
            this.storyPublishSaveLocal = new C22903bl<>("story_publish_save_local", Boolean.valueOf(true));
            this.cacheItems.add(this.storyPublishSaveLocal);
        }
        return this.storyPublishSaveLocal;
    }

    public C22903bl<Boolean> getStoryQuickPanelShowInActivity() {
        if (this.storyQuickPanelShowInActivity == null) {
            this.storyQuickPanelShowInActivity = new C22903bl<>("story_festival_sticker_quick_panel_activity_show", Boolean.valueOf(false));
        }
        return this.storyQuickPanelShowInActivity;
    }

    public C22903bl<Boolean> getStoryRecordGuideShow() {
        if (this.storyRecordGuideShow == null) {
            this.storyRecordGuideShow = new C22903bl<>("story_record_guide_show", Boolean.valueOf(false));
        }
        return this.storyRecordGuideShow;
    }

    public C22903bl<String> getStoryRegisterPublishSyncHintContent() {
        if (this.storyRegisterPublishSyncHintContent == null) {
            this.storyRegisterPublishSyncHintContent = new C22903bl<>("story_publish_register_sync_hint_content", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintContent);
        }
        return this.storyRegisterPublishSyncHintContent;
    }

    public C22903bl<String> getStoryRegisterPublishSyncHintH5Str() {
        if (this.storyRegisterPublishSyncHintH5Str == null) {
            this.storyRegisterPublishSyncHintH5Str = new C22903bl<>("story_publish_register_sync_hint_h5", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Str);
        }
        return this.storyRegisterPublishSyncHintH5Str;
    }

    public C22903bl<String> getStoryRegisterPublishSyncHintH5Url() {
        if (this.storyRegisterPublishSyncHintH5Url == null) {
            this.storyRegisterPublishSyncHintH5Url = new C22903bl<>("story_publish_register_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Url);
        }
        return this.storyRegisterPublishSyncHintH5Url;
    }

    public C22903bl<String> getStoryRegisterPublishSyncHintTitle() {
        if (this.storyRegisterPublishSyncHintTitle == null) {
            this.storyRegisterPublishSyncHintTitle = new C22903bl<>("story_publish_register_sync_hint_title", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintTitle);
        }
        return this.storyRegisterPublishSyncHintTitle;
    }

    public C22903bl<Boolean> getStorySettingDoudouPhoto() {
        if (this.storySettingDoudouPhoto == null) {
            this.storySettingDoudouPhoto = new C22903bl<>("story_setting_duodou_photo", Boolean.valueOf(true));
        }
        return this.storySettingDoudouPhoto;
    }

    public C22903bl<Boolean> getStorySettingManualOpenDoudou() {
        if (this.storySettingManualOpenDoudou == null) {
            this.storySettingManualOpenDoudou = new C22903bl<>("story_setting_manual_open_doudou", Boolean.valueOf(false));
            this.cacheItems.add(this.storySettingManualOpenDoudou);
        }
        return this.storySettingManualOpenDoudou;
    }

    public C22903bl<Integer> getStorySettingReplyPermission() {
        if (this.storySettingReplyPermission == null) {
            this.storySettingReplyPermission = new C22903bl<>("story_setting_reply_permission", Integer.valueOf(0));
        }
        return this.storySettingReplyPermission;
    }

    public C22903bl<Boolean> getStorySettingSyncDuoshan() {
        if (this.storySettingSyncDuoshan == null) {
            this.storySettingSyncDuoshan = new C22903bl<>("story_setting_sync_duoshan", Boolean.valueOf(false));
        }
        return this.storySettingSyncDuoshan;
    }

    public C22903bl<Integer> getStorySettingSyncToast() {
        if (this.storySettingSyncToast == null) {
            this.storySettingSyncToast = new C22903bl<>("story_setting_sync_toast", Integer.valueOf(0));
            this.cacheItems.add(this.storySettingSyncToast);
        }
        return this.storySettingSyncToast;
    }

    public C22903bl<Integer> getStorySettingViewPermission() {
        if (this.storySettingViewPermission == null) {
            this.storySettingViewPermission = new C22903bl<>("story_setting_view_permission", Integer.valueOf(0));
        }
        return this.storySettingViewPermission;
    }

    public C22903bl<String> getStoryShakeLastTime() {
        if (this.storyShakeLastTime == null) {
            this.storyShakeLastTime = new C22903bl<>("story_festival_last_shake_card_time", "");
        }
        return this.storyShakeLastTime;
    }

    public C22903bl<Boolean> getStoryShakeSurpriseHintShow() {
        if (this.storyShakeSurpriseHintShow == null) {
            this.storyShakeSurpriseHintShow = new C22903bl<>("story_shake_video_surprise_hint", Boolean.valueOf(false));
        }
        return this.storyShakeSurpriseHintShow;
    }

    public C22903bl<Long> getStoryStickerQuickPanelCloseTime() {
        if (this.storyStickerQuickPanelCloseTime == null) {
            this.storyStickerQuickPanelCloseTime = new C22903bl<>("story_festival_sticker_quick_panel_close_time", Long.valueOf(0));
        }
        return this.storyStickerQuickPanelCloseTime;
    }

    public C22903bl<Integer> getStoryTextStickerMaxCount() {
        if (this.storyTextStickerMaxCount == null) {
            this.storyTextStickerMaxCount = new C22903bl<>("story_text_sticker_max_count", Integer.valueOf(30));
            this.cacheItems.add(this.storyTextStickerMaxCount);
        }
        return this.storyTextStickerMaxCount;
    }

    public C22903bl<String> getStoryUnRegisterPublishSyncHintContent() {
        if (this.storyUnRegisterPublishSyncHintContent == null) {
            this.storyUnRegisterPublishSyncHintContent = new C22903bl<>("story_publish_unregister_sync_hint_content", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintContent);
        }
        return this.storyUnRegisterPublishSyncHintContent;
    }

    public C22903bl<String> getStoryUnRegisterPublishSyncHintH5Str() {
        if (this.storyUnRegisterPublishSyncHintH5Str == null) {
            this.storyUnRegisterPublishSyncHintH5Str = new C22903bl<>("story_publish_unregister_sync_hint_h5", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Str);
        }
        return this.storyUnRegisterPublishSyncHintH5Str;
    }

    public C22903bl<String> getStoryUnRegisterPublishSyncHintH5Url() {
        if (this.storyUnRegisterPublishSyncHintH5Url == null) {
            this.storyUnRegisterPublishSyncHintH5Url = new C22903bl<>("story_publish_unregister_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Url);
        }
        return this.storyUnRegisterPublishSyncHintH5Url;
    }

    public C22903bl<String> getStoryUnRegisterPublishSyncHintTitle() {
        if (this.storyUnRegisterPublishSyncHintTitle == null) {
            this.storyUnRegisterPublishSyncHintTitle = new C22903bl<>("story_publish_unregister_sync_hint_title", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintTitle);
        }
        return this.storyUnRegisterPublishSyncHintTitle;
    }

    public C22903bl<Integer> getSwipeDataCount() {
        if (this.swipeDataCount == null) {
            this.swipeDataCount = new C22903bl<>("swipe_data_count", Integer.valueOf(0));
            this.cacheItems.add(this.swipeDataCount);
        }
        return this.swipeDataCount;
    }

    public C22903bl<Integer> getSyncTT() {
        if (this.syncTT == null) {
            this.syncTT = new C22903bl<>("sync_to_toutiao", Integer.valueOf(1));
            this.cacheItems.add(this.syncTT);
        }
        return this.syncTT;
    }

    public C22903bl<Boolean> getSyncTTFirstPublish() {
        if (this.syncTTFirstPublish == null) {
            this.syncTTFirstPublish = new C22903bl<>("sync_to_toutiao_first_publish", Boolean.valueOf(true));
            this.cacheItems.add(this.syncTTFirstPublish);
        }
        return this.syncTTFirstPublish;
    }

    public C22903bl<String> getSyncToTTUrl() {
        if (this.syncToTTUrl == null) {
            this.syncToTTUrl = new C22903bl<>("sync_to_toutiao_url", "");
            this.cacheItems.add(this.syncToTTUrl);
        }
        return this.syncToTTUrl;
    }

    public C22903bl<Float> getSyntheticVideoBitrate() {
        if (this.syntheticVideoBitrate == null) {
            this.syntheticVideoBitrate = new C22903bl<>("synthetic_video_bitrate", Float.valueOf(1.0f));
            this.cacheItems.add(this.syntheticVideoBitrate);
        }
        return this.syntheticVideoBitrate;
    }

    public C22903bl<Boolean> getTTRoute() {
        if (this.ttRoute == null) {
            this.ttRoute = new C22903bl<>("ttroute", Boolean.valueOf(false));
            this.cacheItems.add(this.ttRoute);
        }
        return this.ttRoute;
    }

    public C22903bl<Integer> getTapDataCount() {
        if (this.tapDataCount == null) {
            this.tapDataCount = new C22903bl<>("tap_data_count", Integer.valueOf(0));
            this.cacheItems.add(this.tapDataCount);
        }
        return this.tapDataCount;
    }

    public C22903bl<String> getTeenagerProtectionScheme() {
        if (this.teenagerProtectionScheme == null) {
            this.teenagerProtectionScheme = new C22903bl<>("TEENAGER_PROTECTION_SCHEME", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fteen_protection_appeal%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_teen_protection_appeal%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.teenagerProtectionScheme);
        }
        return this.teenagerProtectionScheme;
    }

    public C22903bl<Long> getTodayVideoPlayTime() {
        if (this.todayVideoPlayTime == null) {
            this.todayVideoPlayTime = new C22903bl<>("today_video_play_time", Long.valueOf(0));
            this.cacheItems.add(this.todayVideoPlayTime);
        }
        return this.todayVideoPlayTime;
    }

    public C22903bl<String> getTwitterAccessToken() {
        if (this.twitterAccessToken == null) {
            this.twitterAccessToken = new C22903bl<>("twitter_access_token", "");
            this.cacheItems.add(this.twitterAccessToken);
        }
        return this.twitterAccessToken;
    }

    public C22903bl<String> getTwitterSecret() {
        if (this.twitterSecret == null) {
            this.twitterSecret = new C22903bl<>("twitter_secret", "");
            this.cacheItems.add(this.twitterSecret);
        }
        return this.twitterSecret;
    }

    public C22903bl<Integer> getUltraResolutionLevel() {
        if (this.ultraResolutionLevel == null) {
            this.ultraResolutionLevel = new C22903bl<>("ultra_resolution_level", Integer.valueOf(0));
            this.cacheItems.add(this.ultraResolutionLevel);
        }
        return this.ultraResolutionLevel;
    }

    public C22903bl<Integer> getUpGuideNum() {
        if (this.upGuideNum == null) {
            this.upGuideNum = new C22903bl<>("up_guide_num", Integer.valueOf(-1));
            this.cacheItems.add(this.upGuideNum);
        }
        return this.upGuideNum;
    }

    public C22903bl<Integer> getUpdateUserFrequency() {
        if (this.updateUserFrequency == null) {
            this.updateUserFrequency = new C22903bl<>("update_user_frequency", Integer.valueOf(0));
            this.cacheItems.add(this.updateUserFrequency);
        }
        return this.updateUserFrequency;
    }

    public C22903bl<Integer> getUpdateUserPosition() {
        if (this.updateUserPosition == null) {
            this.updateUserPosition = new C22903bl<>("update_user_position", Integer.valueOf(-1));
            this.cacheItems.add(this.updateUserPosition);
        }
        return this.updateUserPosition;
    }

    public C22903bl<String> getUpdateUserTipContent() {
        if (this.updateUserTipContent == null) {
            this.updateUserTipContent = new C22903bl<>("update_user_tip_content", "");
            this.cacheItems.add(this.updateUserTipContent);
        }
        return this.updateUserTipContent;
    }

    public C22903bl<Long> getUploadContactsNoticeLastShowTime() {
        if (this.uploadContactsNoticeLastShowTime == null) {
            this.uploadContactsNoticeLastShowTime = new C22903bl<>("upload_contacts_notice_last_show_time", Long.valueOf(0));
            this.cacheItems.add(this.uploadContactsNoticeLastShowTime);
        }
        return this.uploadContactsNoticeLastShowTime;
    }

    public C22903bl<Integer> getUploadContactsNoticeShowCount() {
        if (this.uploadContactsNoticeShowCount == null) {
            this.uploadContactsNoticeShowCount = new C22903bl<>("upload_contacts_notice_show_count", Integer.valueOf(0));
            this.cacheItems.add(this.uploadContactsNoticeShowCount);
        }
        return this.uploadContactsNoticeShowCount;
    }

    public C22903bl<String> getUploadContactsPolicyCaption() {
        if (this.uploadContactsPolicyCaption == null) {
            this.uploadContactsPolicyCaption = new C22903bl<>("upload_contacts_policy_caption", "");
            this.cacheItems.add(this.uploadContactsPolicyCaption);
        }
        return this.uploadContactsPolicyCaption;
    }

    public C22903bl<Integer> getUploadContactsPolicyInterval() {
        if (this.uploadContactsPolicyInterval == null) {
            this.uploadContactsPolicyInterval = new C22903bl<>("upload_contacts_policy_interval", Integer.valueOf(1));
            this.cacheItems.add(this.uploadContactsPolicyInterval);
        }
        return this.uploadContactsPolicyInterval;
    }

    public C22903bl<String> getUploadContactsPolicyPic() {
        if (this.uploadContactsPolicyPic == null) {
            this.uploadContactsPolicyPic = new C22903bl<>("upload_contacts_policy_pic", "");
            this.cacheItems.add(this.uploadContactsPolicyPic);
        }
        return this.uploadContactsPolicyPic;
    }

    public C22903bl<String> getUploadContactsPolicyText() {
        if (this.uploadContactsPolicyText == null) {
            this.uploadContactsPolicyText = new C22903bl<>("upload_contacts_policy_text", "");
            this.cacheItems.add(this.uploadContactsPolicyText);
        }
        return this.uploadContactsPolicyText;
    }

    public C22903bl<Integer> getUploadContactsPolicyTimes() {
        if (this.uploadContactsPolicyTimes == null) {
            this.uploadContactsPolicyTimes = new C22903bl<>("upload_contacts_policy_times", Integer.valueOf(0));
            this.cacheItems.add(this.uploadContactsPolicyTimes);
        }
        return this.uploadContactsPolicyTimes;
    }

    public C22903bl<Boolean> getUseCronet() {
        if (this.useCronet == null) {
            this.useCronet = new C22903bl<>("use_cronet", Boolean.valueOf(true));
            this.cacheItems.add(this.useCronet);
        }
        return this.useCronet;
    }

    public C22903bl<Boolean> getUseDefaultHost() {
        if (this.useDefaultHost == null) {
            this.useDefaultHost = new C22903bl<>("use_default_host", Boolean.valueOf(false));
            this.cacheItems.add(this.useDefaultHost);
        }
        return this.useDefaultHost;
    }

    public C22903bl<Boolean> getUseHttps() {
        if (this.useHttps == null) {
            this.useHttps = new C22903bl<>("use_https", Boolean.valueOf(true));
            this.cacheItems.add(this.useHttps);
        }
        return this.useHttps;
    }

    public C22903bl<Integer> getUseLiveWallpaper() {
        if (this.useLiveWallpaper == null) {
            this.useLiveWallpaper = new C22903bl<>("use_live_wallpaper", Integer.valueOf(0));
            this.cacheItems.add(this.useLiveWallpaper);
        }
        return this.useLiveWallpaper;
    }

    public C22903bl<Integer> getUseNewDouyinSaftyCenter() {
        if (this.useNewDouyinSaftyCenter == null) {
            this.useNewDouyinSaftyCenter = new C22903bl<>("use_new_douyin_safety_center", Integer.valueOf(0));
            this.cacheItems.add(this.useNewDouyinSaftyCenter);
        }
        return this.useNewDouyinSaftyCenter;
    }

    public C22903bl<Boolean> getUseNewFFmpeg() {
        if (this.useNewFFmpeg == null) {
            this.useNewFFmpeg = new C22903bl<>("use_new_ffmpeg", Boolean.valueOf(false));
            this.cacheItems.add(this.useNewFFmpeg);
        }
        return this.useNewFFmpeg;
    }

    public C22903bl<Boolean> getUseNewPackageNow() {
        if (this.mUseNewPackageNow == null) {
            this.mUseNewPackageNow = new C22903bl<>("use_new_package_now", Boolean.valueOf(false));
            this.cacheItems.add(this.mUseNewPackageNow);
        }
        return this.mUseNewPackageNow;
    }

    public C22903bl<Integer> getUseSyntheticHardcode() {
        if (this.useSyntheticHardcode == null) {
            this.useSyntheticHardcode = new C22903bl<>("use_synthetic_hardcode", Integer.valueOf(0));
            this.cacheItems.add(this.useSyntheticHardcode);
        }
        return this.useSyntheticHardcode;
    }

    public C22903bl<String> getUserAddLanguages() {
        if (this.userAddLanguages == null) {
            this.userAddLanguages = new C22903bl<>("user_add_languages", "");
            this.cacheItems.add(this.userAddLanguages);
        }
        return this.userAddLanguages;
    }

    public C22903bl<String> getUserCurrentRegion() {
        if (this.userCurrentRegion == null) {
            this.userCurrentRegion = new C22903bl<>("user_current_region", "");
            this.cacheItems.add(this.userCurrentRegion);
        }
        return this.userCurrentRegion;
    }

    public C22903bl<Boolean> getUserHasPassword() {
        if (this.userHasPassword == null) {
            this.userHasPassword = new C22903bl<>("user_has_password", Boolean.valueOf(false));
            this.cacheItems.add(this.userHasPassword);
        }
        return this.userHasPassword;
    }

    public C22903bl<String> getUserResidence() {
        if (this.userResidence == null) {
            this.userResidence = new C22903bl<>("user_residence", "");
            this.cacheItems.add(this.userResidence);
        }
        return this.userResidence;
    }

    public C22903bl<Integer> getVerifyExceed() {
        if (this.verifyExceed == null) {
            this.verifyExceed = new C22903bl<>("verify_exceed", Integer.valueOf(5));
            this.cacheItems.add(this.verifyExceed);
        }
        return this.verifyExceed;
    }

    public C22903bl<Float> getVideoBitrate() {
        if (this.videoBitrate == null) {
            this.videoBitrate = new C22903bl<>("video_bitrate", Float.valueOf(1.0f));
            this.cacheItems.add(this.videoBitrate);
        }
        return this.videoBitrate;
    }

    public C22903bl<Integer> getVideoCommit() {
        if (this.videoCommit == null) {
            this.videoCommit = new C22903bl<>("video_commit", Integer.valueOf(30));
            this.cacheItems.add(this.videoCommit);
        }
        return this.videoCommit;
    }

    public C22903bl<Integer> getVideoCompose() {
        if (this.videoCompose == null) {
            this.videoCompose = new C22903bl<>("video_compose", Integer.valueOf(70));
            this.cacheItems.add(this.videoCompose);
        }
        return this.videoCompose;
    }

    public C22903bl<Boolean> getVideoPreload() {
        if (this.videoPreload == null) {
            this.videoPreload = new C22903bl<>("video_preload", Boolean.valueOf(true));
            this.cacheItems.add(this.videoPreload);
        }
        return this.videoPreload;
    }

    public C22903bl<Integer> getWeakNetPreLoadSwitch() {
        if (this.weakNetPreLoadSwitch == null) {
            this.weakNetPreLoadSwitch = new C22903bl<>("weak_net_pre_load_switch", Integer.valueOf(1));
            this.cacheItems.add(this.weakNetPreLoadSwitch);
        }
        return this.weakNetPreLoadSwitch;
    }

    public C22903bl<Integer> getX2cSwitch() {
        if (this.x2cSwitch == null) {
            this.x2cSwitch = new C22903bl<>("x2c_switch", Integer.valueOf(2));
            this.cacheItems.add(this.x2cSwitch);
        }
        return this.x2cSwitch;
    }

    public C22903bl<Boolean> isEnableMessagePb2Json() {
        if (this.enableMessagePb2Json == null) {
            this.enableMessagePb2Json = new C22903bl<>("live_enanble_message_pb2json", Boolean.valueOf(false));
            this.cacheItems.add(this.enableMessagePb2Json);
        }
        return this.enableMessagePb2Json;
    }

    public C22903bl<Boolean> isFirstPublishSync() {
        if (this.isFirstPublishSync == null) {
            this.isFirstPublishSync = new C22903bl<>("is_first_publish", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstPublishSync);
        }
        return this.isFirstPublishSync;
    }

    public boolean isFollowFeedAsDefault() {
        if (getFollowFeedAsDefault() == null || ((Integer) getFollowFeedAsDefault().mo59877d()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public C22903bl<Boolean> isInUltraResBlackList() {
        if (this.inUltraResBlackList == null) {
            this.inUltraResBlackList = new C22903bl<>("in_ultra_resolution_black_list", Boolean.valueOf(false));
            this.cacheItems.add(this.inUltraResBlackList);
        }
        return this.inUltraResBlackList;
    }

    public C22903bl<Boolean> isNpthEnable() {
        if (this.isNpthEnable == null) {
            this.isNpthEnable = new C22903bl<>("is_npth_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isNpthEnable);
        }
        return this.isNpthEnable;
    }

    public C22903bl<Boolean> isOb() {
        if (this.isOb == null) {
            this.isOb = new C22903bl<>("is_ob", Boolean.valueOf(false));
            this.cacheItems.add(this.isOb);
        }
        return this.isOb;
    }

    public C22903bl<Boolean> isPublishSyncToHuoshan() {
        if (this.isPublishSyncToHuoshan == null) {
            this.isPublishSyncToHuoshan = new C22903bl<>("is_publish_sync_huoshan", Boolean.valueOf(true));
            this.cacheItems.add(this.isPublishSyncToHuoshan);
        }
        return this.isPublishSyncToHuoshan;
    }

    public C22903bl<Boolean> isPublishSyncToToutiao() {
        if (this.isPublishSyncToToutiao == null) {
            this.isPublishSyncToToutiao = new C22903bl<>("is_publish_sync_toutiao_new", Boolean.valueOf(true));
            this.cacheItems.add(this.isPublishSyncToToutiao);
        }
        return this.isPublishSyncToToutiao;
    }

    public C22903bl<Integer> isPublishSyncToToutiaoNew() {
        if (this.isPublishSyncToToutiaoNew == null) {
            this.isPublishSyncToToutiaoNew = new C22903bl<>("is_publish_sync_toutiao_new_new", Integer.valueOf(0));
            this.cacheItems.add(this.isPublishSyncToToutiaoNew);
        }
        return this.isPublishSyncToToutiaoNew;
    }

    public C22903bl<Boolean> isShowInviteContactsFriends() {
        if (this.showInvitedContactsFriends == null) {
            this.showInvitedContactsFriends = new C22903bl<>("invite_friends_settings", Boolean.valueOf(false));
            this.cacheItems.add(this.showInvitedContactsFriends);
        }
        return this.showInvitedContactsFriends;
    }

    public C22903bl<Boolean> isShowSyncToToutiaoDialog() {
        if (this.isShowSyncToToutiaoDialog == null) {
            this.isShowSyncToToutiaoDialog = new C22903bl<>("is_show_sync_toutiao_dialog", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowSyncToToutiaoDialog);
        }
        return this.isShowSyncToToutiaoDialog;
    }

    public C22903bl<Boolean> isSyncToHuoshan() {
        if (this.isSyncToHuoshan == null) {
            this.isSyncToHuoshan = new C22903bl<>("is_sync_to_huoshan", Boolean.valueOf(false));
            this.cacheItems.add(this.isSyncToHuoshan);
        }
        return this.isSyncToHuoshan;
    }

    public C22903bl<Boolean> liveAgreement() {
        if (this.liveAgreement == null) {
            this.liveAgreement = new C22903bl<>("live_agreement", Boolean.valueOf(false));
            this.cacheItems.add(this.liveAgreement);
        }
        return this.liveAgreement;
    }

    public C22903bl<Boolean> liveAnswer() {
        if (this.liveAnswer == null) {
            this.liveAnswer = new C22903bl<>("live_answer", Boolean.valueOf(false));
            this.cacheItems.add(this.liveAnswer);
        }
        return this.liveAnswer;
    }

    public C22903bl<Boolean> liveContactsVerify() {
        if (this.liveContactsVerify == null) {
            this.liveContactsVerify = new C22903bl<>("live_contacts_verify", Boolean.valueOf(false));
            this.cacheItems.add(this.liveContactsVerify);
        }
        return this.liveContactsVerify;
    }

    public C22903bl<Boolean> mockLiveMoney() {
        if (this.mockLiveMoney == null) {
            this.mockLiveMoney = new C22903bl<>("mock_live_money", Boolean.valueOf(false));
            this.cacheItems.add(this.mockLiveMoney);
        }
        return this.mockLiveMoney;
    }

    public C22903bl<Boolean> mockLiveResolution() {
        if (this.mockLiveResolution == null) {
            this.mockLiveResolution = new C22903bl<>("mock_live_resolution", Boolean.valueOf(false));
            this.cacheItems.add(this.mockLiveResolution);
        }
        return this.mockLiveResolution;
    }

    public C22903bl<Boolean> mockLiveSend() {
        if (this.mockLiveSend == null) {
            this.mockLiveSend = new C22903bl<>("mock_live_send", Boolean.valueOf(false));
            this.cacheItems.add(this.mockLiveSend);
        }
        return this.mockLiveSend;
    }

    private SharePrefCache() {
        this.recentList = Arrays.asList(new String[]{"IN", "NP", "PK", "LK"});
        this.cacheItems = Collections.synchronizedList(new ArrayList());
        this.mSharedPreferences = C7285c.m22838a(C6399b.m19921a(), "aweme-app", 0);
    }

    private void collectAllItemsIfNeed() {
        Method[] declaredMethods;
        if (!this.collectAllItems) {
            this.collectAllItems = true;
            for (Method method : SharePrefCache.class.getDeclaredMethods()) {
                if (method.getReturnType() == C22903bl.class) {
                    try {
                        method.invoke(this, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
            }
        }
    }

    public C22903bl<Integer> getCameraPosition() {
        if (this.cameraPosition == null) {
            this.cameraPosition = new C22903bl<>("camera_position", Integer.valueOf(C6399b.m19946v() ^ true ? 1 : 0));
            this.cacheItems.add(this.cameraPosition);
        }
        return this.cameraPosition;
    }

    public synchronized C22903bl<Boolean> getEnableLawWindow() {
        if (this.enableLawWindow == null) {
            this.enableLawWindow = new C22903bl<>("enable_law_window", Boolean.valueOf(false));
            this.cacheItems.add(this.enableLawWindow);
        }
        return this.enableLawWindow;
    }

    public synchronized C22903bl<Boolean> getEnableShoppingUser() {
        if (this.enableShoppingUser == null) {
            this.enableShoppingUser = new C22903bl<>("enable_shopping_user", Boolean.valueOf(false));
            this.cacheItems.add(this.enableShoppingUser);
        }
        return this.enableShoppingUser;
    }

    public C22903bl<Boolean> getImCommentForwardEnabledItem() {
        if (this.imCommentForwardEnabled == null) {
            this.imCommentForwardEnabled = new C22903bl<>("im_comment_forward_enabled", Boolean.valueOf(!C6399b.m19946v()));
            this.cacheItems.add(this.imCommentForwardEnabled);
        }
        return this.imCommentForwardEnabled;
    }

    public C22903bl<Boolean> getIsContactDialogShown() {
        if (this.isContactDialogShown == null) {
            this.isContactDialogShown = new C22903bl<>("contact_dialog_shown", Boolean.valueOf(getSharePref().getBoolean("contact_dialog_shown", false)));
            this.cacheItems.add(this.isContactDialogShown);
        }
        return this.isContactDialogShown;
    }

    public C22903bl<Boolean> getIsFirstShowInsightsAnimation() {
        if (this.isFirstShowInsightsAnimation == null) {
            StringBuilder sb = new StringBuilder("first_show_insights_animation_");
            sb.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().getCurUserId());
            this.isFirstShowInsightsAnimation = new C22903bl<>(sb.toString(), Boolean.valueOf(false));
            this.cacheItems.add(this.isFirstShowInsightsAnimation);
        }
        return this.isFirstShowInsightsAnimation;
    }

    public C22903bl<Boolean> getIsShowNearBy() {
        if (this.isShowNearBy == null) {
            if (C30538p.m99745a()) {
                this.isShowNearBy = new C22903bl<>("is_show_near_by", Boolean.valueOf(false));
            } else {
                this.isShowNearBy = new C22903bl<>("is_show_near_by", Boolean.valueOf(true));
            }
            this.cacheItems.add(this.isShowNearBy);
        }
        return this.isShowNearBy;
    }

    public Boolean getLiveSkylightHasShowAnimation() {
        if (this.liveSkylightHasShowAnimation == null) {
            this.liveSkylightHasShowAnimation = new C22903bl<>("live_skylight_has_show_animation", Boolean.valueOf(false));
            this.cacheItems.add(this.liveSkylightHasShowAnimation);
        }
        Boolean bool = (Boolean) this.liveSkylightHasShowAnimation.mo59877d();
        if (!bool.booleanValue()) {
            this.liveSkylightHasShowAnimation.mo59871a(Boolean.valueOf(true));
        }
        return bool;
    }

    public C22903bl<String> getMerchPickerUrl() {
        String str;
        if (this.merchPickerUrl == null) {
            String str2 = "merch_share_url";
            if (C6399b.m19928c()) {
                str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Flive_merch%3Fhide_status_bar%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3DFFFFFF%26bg_theme%3DFFFFFF%26disable_pop_gesture%3D1%26disablePopGesture%3D1%26popup_mode%3D1&hide_status_bar=1&hide_nav_bar=1&loading_bgcolor=FFFFFF&bg_theme=FFFFFF&disable_pop_gesture=1&disablePopGesture=1&popup_mode=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dies_ecom_rn%26bundle_name%3Dies_ecom_rn%26module_name%3Dpage_live_merch%26hide_status_bar%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3DFFFFFF%26bg_theme%3DFFFFFF%26disable_pop_gesture%3D1%26disablePopGesture%3D1%26popup_mode%3D1";
            } else {
                str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Flive_merch%3Fhide_status_bar%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3DFFFFFF%26bg_theme%3DFFFFFF%26disable_pop_gesture%3D1%26disablePopGesture%3D1%26popup_mode%3D1&hide_status_bar=1&hide_nav_bar=1&loading_bgcolor=FFFFFF&bg_theme=FFFFFF&disable_pop_gesture=1&disablePopGesture=1&popup_mode=1";
            }
            this.merchPickerUrl = new C22903bl<>(str2, str);
            this.cacheItems.add(this.merchPickerUrl);
        }
        return this.merchPickerUrl;
    }

    public C22903bl<Boolean> getTTRegion() {
        if (this.ttRegion == null) {
            boolean z = false;
            String g = C32330k.m104885g();
            if (C6399b.m19946v() && g != null && this.recentList.contains(g)) {
                z = true;
            }
            this.ttRegion = new C22903bl<>("ttregion", Boolean.valueOf(z));
            this.cacheItems.add(this.ttRegion);
        }
        return this.ttRegion;
    }

    public C22903bl<Boolean> getIsEuropeCountry() {
        if (this.isEuropeCountry == null) {
            if (!TextUtils.isEmpty(C32330k.m104886h())) {
                this.isEuropeCountry = new C22903bl<>("is_europe_country", Boolean.valueOf(C32330k.m104884a(C32330k.m104886h())));
            } else if (!TextUtils.isEmpty(C32330k.m104885g())) {
                this.isEuropeCountry = new C22903bl<>("is_europe_country", Boolean.valueOf(C32330k.m104884a(C32330k.m104885g())));
            } else {
                this.isEuropeCountry = new C22903bl<>("is_europe_country", Boolean.valueOf(false));
            }
            this.cacheItems.add(this.isEuropeCountry);
        }
        return this.isEuropeCountry;
    }

    public void setCurrentLocaleLanguage(String str) {
        getCurrentLocaleLanguage().mo59871a(str);
    }

    public void setImUrlTemplate(String str) {
        getImUrlTemplateItem().mo59871a(str);
    }

    public void setInvitedContacts(String str) {
        getInvitedContacts().mo59871a(str);
    }

    public void setSameCityActiveId(String str) {
        getSameCityActiveId().mo59871a(str);
    }

    public void setShowInvitedContactsFriends(Boolean bool) {
        isShowInviteContactsFriends().mo59871a(bool);
    }

    public void setUseTTnet(Boolean bool) {
        getIsUseTTnet().mo59871a(bool);
    }

    public void setBeautyModel(int i) {
        getBeautyModelItem().mo59871a(Integer.valueOf(i));
    }

    public void setImCommentForwardEnabled(boolean z) {
        getImCommentForwardEnabledItem().mo59871a(Boolean.valueOf(z));
    }

    public void setIsFirstPublishAweme(boolean z) {
        getFirstPublishAwemeItem().mo59871a(Boolean.valueOf(z));
    }

    public void setIsFirstPublishComment(boolean z) {
        getFirstPublishCommentItem().mo59871a(Boolean.valueOf(z));
    }

    public void setLastInviteAllTimeStamp(long j) {
        getLastInviteAllTimeStampItem().mo59871a(Long.valueOf(j));
    }

    public void setMultiSelectLimit(int i) {
        getMultiSelectLimitItem().mo59871a(Integer.valueOf(i));
    }

    public void setNetworkLibType(int i) {
        getNetworkLibTypeItem().mo59871a(Integer.valueOf(i));
    }

    public void setOpenImLink(int i) {
        getOpenImLinkItem().mo59871a(Integer.valueOf(i));
    }

    public void setShowAddBusinessGoodsDot(boolean z) {
        getShowAddBusinessGoodsDot().mo59871a(Boolean.valueOf(z));
    }
}
