package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6709k;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.utils.C23484l;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.link.C24769b;
import com.p280ss.android.ugc.aweme.commercialize.link.C24792i;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25222ad;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30202j;
import com.p280ss.android.ugc.aweme.legoImp.inflate.C32348g;
import com.p280ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask;
import com.p280ss.android.ugc.aweme.main.p1382d.C32955d;
import com.p280ss.android.ugc.aweme.p1685ug.C42686a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.profile.model.UrlModelWrap;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.api.SettingApi;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings.GeckoConfig;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings.GlobalTips;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings.HotSearchDisplay;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings.PushPrePermissionView;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings.ShowCreatorLicense;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings.UserCacheSetting;
import com.p280ss.android.ugc.aweme.setting.p1518f.C37628a;
import com.p280ss.android.ugc.aweme.share.C37969ah;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import com.p280ss.android.ugc.aweme.video.C43212e;
import com.p280ss.android.ugc.aweme.wallet.C43395a;
import com.p280ss.android.ugc.aweme.zhima.C43586c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.setting.ao */
public abstract class C37562ao implements C6310a, C37540aa {

    /* renamed from: a */
    private static C37562ao f97970a = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSettingManager();

    /* renamed from: b */
    protected SettingApi f97971b = ((SettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(SettingApi.class));

    /* renamed from: c */
    protected C6309f f97972c = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: d */
    public GlobalTips f97973d;

    /* renamed from: e */
    public boolean f97974e;

    /* renamed from: f */
    public String f97975f = "{}";

    /* renamed from: g */
    protected List<C37566a> f97976g = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.setting.ao$a */
    public interface C37566a {
        /* renamed from: a */
        void mo84112a(AwemeSettings awemeSettings);
    }

    /* renamed from: a */
    public static C37562ao m120324a() {
        return f97970a;
    }

    /* renamed from: a */
    public void mo94852a(final AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            if (awemeSettings.globalTips != null) {
                this.f97973d = awemeSettings.globalTips;
                C23338f.m76567e().mo60632b("place_holder", this.f97973d.search_tips);
            }
            C22345t.m73983k(awemeSettings.enableTwitterNewKeySecret);
            C22345t.m73957a(awemeSettings.syncToTT);
            C22345t.m73961a(awemeSettings.enablePassportService);
            C22345t.m73964b(awemeSettings.enableEmailLogin);
            Editor edit = SharePrefCache.inst().getSharePref().edit();
            mo94826a(edit, awemeSettings);
            SharePrefCache.inst().getDeviceMonitor().mo59874b(edit, Boolean.valueOf(awemeSettings.deviceMonitor));
            SharePrefCache.inst().getLiveSkylightShowAnimation().mo59874b(edit, Boolean.valueOf(awemeSettings.liveSkylightShowAnimation));
            SharePrefCache.inst().getIsUseTongdunSdk().mo59874b(edit, Boolean.valueOf(awemeSettings.isUseTongdunSdk));
            SharePrefCache.inst().getIsUseBackRefresh().mo59874b(edit, Boolean.valueOf(awemeSettings.isUseBackRefresh));
            SharePrefCache.inst().getShowTimeLineTab().mo59874b(edit, Boolean.valueOf(awemeSettings.isShowTimeLineTab()));
            SharePrefCache.inst().getHttpRetryCount().mo59874b(edit, Integer.valueOf(awemeSettings.httpRetryCount));
            if (awemeSettings.f98128sp != null && !TextUtils.isEmpty(awemeSettings.f98128sp.estr)) {
                SharePrefCache.inst().getEstr().mo59874b(edit, awemeSettings.f98128sp.estr);
            }
            SharePrefCache.inst().getTTRoute().mo59874b(edit, Boolean.valueOf(awemeSettings.ttRoute));
            SharePrefCache.inst().getTTRegion().mo59874b(edit, Boolean.valueOf(awemeSettings.ttRegion));
            SharePrefCache.inst().getVideoPreload().mo59874b(edit, Boolean.valueOf(awemeSettings.getNeedPreLoad()));
            SharePrefCache.inst().getAdDisplayTimemit().mo59874b(edit, Integer.valueOf(awemeSettings.adDisplayTime));
            SharePrefCache.inst().getHardEncode().mo59874b(edit, Integer.valueOf(awemeSettings.useHardcode));
            SharePrefCache.inst().getIsShowNearBy().mo59874b(edit, Boolean.valueOf(awemeSettings.isShowNearByTab));
            SharePrefCache.inst().getShiledMusicSDK().mo59874b(edit, Boolean.valueOf(awemeSettings.shieldMusicSDK));
            SharePrefCache.inst().getNewAnchorShowBubble().mo59874b(edit, Boolean.valueOf(awemeSettings.newAnchorShowBubble));
            SharePrefCache.inst().getUseSyntheticHardcode().mo59874b(edit, Integer.valueOf(awemeSettings.useSyntheticHardcode));
            SharePrefCache.inst().getIsChangeFollowTab().mo59874b(edit, Boolean.valueOf(awemeSettings.isChangeFollowTab()));
            SharePrefCache.inst().getLiveDefaultBitrate().mo59874b(edit, Integer.valueOf(awemeSettings.liveDefaultBitrate));
            SharePrefCache.inst().getLiveMaxBitrate().mo59874b(edit, Integer.valueOf(awemeSettings.liveMaxBitrate));
            SharePrefCache.inst().getLiveMinBitrate().mo59874b(edit, Integer.valueOf(awemeSettings.liveMinBitrate));
            C23060u.m75742a().mo60093w().mo59874b(edit, Integer.valueOf(awemeSettings.picQrcodeRecognitionSwitch));
            C23060u.m75742a().mo60094x().mo59874b(edit, Boolean.valueOf(awemeSettings.selfSeeWaterMarkSwitch));
            C23060u.m75742a().mo60095y().mo59874b(edit, Boolean.valueOf(awemeSettings.enableEmailLogin));
            C23060u.m75742a().mo60096z().mo59874b(edit, Boolean.valueOf(awemeSettings.enablePassportService));
            C23060u.m75742a().mo60069am().mo59871a(awemeSettings.selfProfileLandingTabs);
            C23060u.m75742a().mo60070an().mo59871a(awemeSettings.otherProfileLandingTabs);
            SharePrefCache.inst().getBeautyModelItem().mo59874b(edit, Integer.valueOf(awemeSettings.beautyModel));
            C23060u.m75742a().mo60041K().mo59874b(edit, Boolean.valueOf(awemeSettings.canDuet));
            SharePrefCache.inst().isOb().mo59874b(edit, Boolean.valueOf(awemeSettings.isOb));
            SharePrefCache.inst().isNpthEnable().mo59874b(edit, Boolean.valueOf(awemeSettings.isNpthEnable));
            Context a = C6399b.m19921a();
            C6887b.m21436b().mo16902a(a, "enable_home_scan_qrcode", awemeSettings.enableHomeScanQrCode);
            C6887b.m21436b().mo16898a(a, "awe_network_x_token_disabled", awemeSettings.aweNetworkXTokenDisabled);
            C6887b.m21436b().mo16898a(a, "enable_fancy_qrcode", awemeSettings.enableFancyQrcode);
            C6887b.m21436b().mo16898a(a, "enable_read_fancy_qrcode", awemeSettings.enableReadFancyQrcode);
            C6887b.m21436b().mo16898a(a, "enable_share_qrcode_h5_as_image", awemeSettings.getSharePictureDirect());
            C6887b.m21436b().mo16902a(a, C37969ah.f98866a, awemeSettings.disableIidInShareUrl);
            C6887b.m21436b().mo16902a(a, C37969ah.f98867b, awemeSettings.disableUCodeInShareUrl);
            SharePrefCache.inst().getSearchTabIndex().mo59874b(edit, awemeSettings.getSearchTabIndex());
            C6887b.m21436b().mo16900a(a, "i18n_third_login_strategy", (Object) awemeSettings.i18nThridLoginSetting);
            C6887b.m21436b().mo16902a(a, "enable_twitter_new_key_secret", awemeSettings.enableTwitterNewKeySecret);
            if (awemeSettings.verifyExceed > 0) {
                SharePrefCache.inst().getVerifyExceed().mo59874b(edit, Integer.valueOf(awemeSettings.verifyExceed));
            }
            SharePrefCache.inst().getOriginalMusicianEntry().mo59874b(edit, Boolean.valueOf(awemeSettings.showOriginalMusicianEntry));
            SharePrefCache.inst().getMusicianShowType().mo59874b(edit, Integer.valueOf(awemeSettings.musicianShowType));
            SharePrefCache.inst().getAtFriendsShowType().mo59874b(edit, Integer.valueOf(awemeSettings.atFriendsShowType));
            SharePrefCache.inst().getOriginalMusiciaShareStyle().mo59874b(edit, Boolean.valueOf(awemeSettings.originalMusicianShare));
            SharePrefCache.inst().getOrginalMusicianUrl().mo59874b(edit, awemeSettings.orginalMusicianUrl);
            SharePrefCache.inst().getStickerArtlistUrl().mo59874b(edit, awemeSettings.stickerArtistUrl);
            SharePrefCache.inst().getStickerArtEntry().mo59874b(edit, Boolean.valueOf(awemeSettings.stickerArtistEntry));
            SharePrefCache.inst().getUseNewDouyinSaftyCenter().mo59874b(edit, Integer.valueOf(awemeSettings.useNewDouyinSaftyCenter));
            SharePrefCache.inst().getJsActlogUrl().mo59874b(edit, awemeSettings.jsActLogUrl);
            SharePrefCache.inst().getSyncTT().mo59874b(edit, Integer.valueOf(awemeSettings.syncToTT));
            SharePrefCache.inst().getSyncToTTUrl().mo59874b(edit, awemeSettings.syncToTTUrl);
            SharePrefCache.inst().getCanIm().mo59874b(edit, Integer.valueOf(awemeSettings.canIm));
            SharePrefCache.inst().getCanImSendPic().mo59874b(edit, Integer.valueOf(awemeSettings.canImSendPic));
            SharePrefCache.inst().getIsForceHttps().mo59874b(edit, Integer.valueOf(awemeSettings.isForceHttps));
            SharePrefCache.inst().getShowInteractionStickers().mo59874b(edit, Boolean.valueOf(awemeSettings.showInteractionStickers));
            SharePrefCache.inst().getRemoveFollowerSwitch().mo59874b(edit, Boolean.valueOf(awemeSettings.removeFollowerSwitch));
            if (awemeSettings.publishSyncDuoshanAllConfig != null) {
                if (awemeSettings.publishSyncDuoshanAllConfig.f109140a != null) {
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintTitle().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109140a.f109142a);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintContent().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109140a.f109143b);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Str().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109140a.f109144c);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Url().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109140a.f109145d);
                }
                if (awemeSettings.publishSyncDuoshanAllConfig.f109141b != null) {
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintTitle().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109141b.f109142a);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintContent().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109141b.f109143b);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Str().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109141b.f109144c);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Url().mo59874b(edit, awemeSettings.publishSyncDuoshanAllConfig.f109141b.f109145d);
                }
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).setFontTypeList(awemeSettings.storyFontDataList);
            SharePrefCache.inst().getStoryInfoStickerMaxCount().mo59874b(edit, Integer.valueOf(awemeSettings.infoStickerMaxCount));
            SharePrefCache.inst().getStoryTextStickerMaxCount().mo59874b(edit, Integer.valueOf(awemeSettings.textStickerMaxCount));
            if (awemeSettings.shareUrlWhiteList != null) {
                C23060u.m75742a().mo60078h().mo59874b(edit, new HashSet(Arrays.asList(awemeSettings.shareUrlWhiteList.getLongWhiteList())));
                C23060u.m75742a().mo60082l().mo59874b(edit, new HashSet(Arrays.asList(awemeSettings.shareUrlWhiteList.getShortWhiteList())));
            }
            if (awemeSettings.ttplayerBufferDuration > 0) {
                C23060u.m75742a().mo60046P().mo59874b(edit, Integer.valueOf(awemeSettings.ttplayerBufferDuration));
            }
            if (awemeSettings.share_h5_url_whitelist != null) {
                C23060u.m75742a().mo60083m().mo59874b(edit, new HashSet(awemeSettings.share_h5_url_whitelist));
            }
            C23060u.m75742a().mo60047Q().mo59874b(edit, Integer.valueOf(awemeSettings.enableIJKHardwarePlayer));
            NetworkUtils.setIsForceHttps(awemeSettings.isForceHttps);
            SharePrefCache.inst().getImCommentForwardEnabledItem().mo59874b(edit, Boolean.valueOf(awemeSettings.imCommentForwardEnabled));
            C42686a.m135540a(new Runnable() {
                public final void run() {
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).initVideoRecordConfig();
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).initVideoImportConfig();
                }
            });
            SharePrefCache.inst().getDownloadForbiddenToast().mo59874b(edit, awemeSettings.downloadForbiddenToast);
            C23060u.m75742a().mo60048R().mo59874b(edit, awemeSettings.downloadCheckStatus);
            ShowCreatorLicense showCreatorLicense = awemeSettings.showCreatorLicense;
            boolean z = false;
            if (showCreatorLicense != null) {
                SharePrefCache.inst().getPromoteDialogShouldShow().mo59874b(edit, Boolean.valueOf(showCreatorLicense.show != 0));
                SharePrefCache.inst().getPromoteDialogPopupTimesLimit().mo59874b(edit, Integer.valueOf(showCreatorLicense.timeLimit));
                SharePrefCache.inst().getPromoteDialogPopupPopupTitle().mo59874b(edit, showCreatorLicense.title);
                SharePrefCache.inst().getPromoteDialogPopupPopupMsg().mo59874b(edit, showCreatorLicense.msg);
                SharePrefCache.inst().getPromoteDialogPopupPopupContent().mo59874b(edit, showCreatorLicense.content);
                SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().mo59874b(edit, showCreatorLicense.linkText);
                SharePrefCache.inst().getPromoteDialogPopupPopupUrl().mo59874b(edit, showCreatorLicense.url);
                SharePrefCache.inst().getPromoteDialogPopupClickType().mo59874b(edit, Integer.valueOf(showCreatorLicense.clickType));
            }
            C23060u.m75742a().mo60087q().mo59871a(Integer.valueOf(awemeSettings.privatePermission));
            SharePrefCache.inst().getPrivacyDownloadSetting().mo59874b(edit, Integer.valueOf(awemeSettings.enablePrivacyDownloadSetting));
            SharePrefCache.inst().getIsShowAllowDownloadTipSetting().mo59874b(edit, Boolean.valueOf(awemeSettings.showAllowDownloadTip));
            SharePrefCache.inst().getIsUseTTnet().mo59874b(edit, Boolean.valueOf(awemeSettings.isUseTTnet));
            SharePrefCache.inst().getShowHashTagBg().mo59874b(edit, Integer.valueOf(awemeSettings.showHashTagBg));
            SharePrefCache.inst().getCanCreateInsights().mo59874b(edit, Boolean.valueOf(awemeSettings.canInsights));
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    C37562ao.m120325c(awemeSettings);
                }
            });
            GeckoConfig geckoConfig = awemeSettings.mGeckoConfig;
            if (geckoConfig != null && !C6307b.m19566a((Collection<T>) geckoConfig.mInitChannels)) {
                C42983bo.m136459a(geckoConfig.mInitChannels, geckoConfig.initialHighPriorityChannels, geckoConfig.mDynamicChannels);
                SharePrefCache.inst().getGeckoChannels().mo59874b(edit, new HashSet(geckoConfig.mInitChannels));
                SharePrefCache.inst().getUseNewPackageNow().mo59874b(edit, Boolean.valueOf(geckoConfig.useNewPackageNow));
                if (geckoConfig.rnContextCreateTimeOut > 0) {
                    SharePrefCache.inst().getRnContextCreateTimeout().mo59874b(edit, Integer.valueOf(geckoConfig.rnContextCreateTimeOut));
                }
                SharePrefCache.inst().getRnPreloadContextOn().mo59874b(edit, Boolean.valueOf(geckoConfig.rnPreloadContextOn));
                SharePrefCache.inst().getRnSnapshotOn().mo59874b(edit, Boolean.valueOf(geckoConfig.rnSnapShotOn));
                SharePrefCache.inst().getGeckoInitialHighPriorityChannels().mo59874b(edit, geckoConfig.initialHighPriorityChannels != null ? new HashSet(geckoConfig.initialHighPriorityChannels) : new HashSet());
            }
            for (C37566a aVar : new CopyOnWriteArrayList(this.f97976g)) {
                if (aVar != null) {
                    aVar.mo84112a(awemeSettings);
                }
            }
            this.f97976g.clear();
            C23060u.m75742a().mo60088r().mo59874b(edit, Boolean.valueOf(awemeSettings.splashImageCenter));
            C23060u.m75742a().mo60089s().mo59874b(edit, Boolean.valueOf(awemeSettings.splashVideoCenter));
            C23060u.m75742a().mo60090t().mo59874b(edit, Boolean.valueOf(awemeSettings.splashSupportTimeOut));
            SharePrefCache.inst().getDownloadMicroApp().mo59874b(edit, Integer.valueOf(awemeSettings.downloadMicroApp));
            SharePrefCache.inst().getFollowNoticeCloseTime().mo59874b(edit, Long.valueOf(awemeSettings.noticeCloseTime));
            SharePrefCache.inst().getMiniAppLabelTitle().mo59874b(edit, awemeSettings.labTitle);
            SharePrefCache.inst().getPrivacyReminderH5Url().mo59874b(edit, awemeSettings.privacyReminder);
            HotSearchDisplay hotSearchDisplay = awemeSettings.hotSearchDisplay;
            if (hotSearchDisplay != null) {
                SharePrefCache.inst().getNormalGuideDisplayTimes().mo59874b(edit, Integer.valueOf(hotSearchDisplay.normalGuideDisplayTimes));
                SharePrefCache.inst().getNormalGuideDisplayTimeIntervals().mo59874b(edit, Long.valueOf(hotSearchDisplay.normalGuideDisplayTimeIntervals * 1000));
                SharePrefCache.inst().getOperationGuideDisplayTimes().mo59874b(edit, Integer.valueOf(hotSearchDisplay.operationGuideDisplayTimes));
                SharePrefCache.inst().getOperationGuideDisplayTimeIntervals().mo59874b(edit, Long.valueOf(hotSearchDisplay.operationGuideDisplayTimeIntervals * 1000));
            }
            PushPrePermissionView pushPrePermissionView = awemeSettings.pushPrePermissionView;
            if (pushPrePermissionView != null) {
                SharePrefCache.inst().getRequestNotificationTitle().mo59874b(edit, pushPrePermissionView.toastTitle);
                SharePrefCache.inst().getRequestNotificationText().mo59874b(edit, pushPrePermissionView.toastText);
            }
            SharePrefCache.inst().getNoticeCountLatency().mo59874b(edit, Integer.valueOf(awemeSettings.noticeCountLatency));
            SharePrefCache.inst().getFriendTabAvatarDuation().mo59874b(edit, Integer.valueOf(awemeSettings.friendTabAvatarDuration));
            C43395a.m137717a(awemeSettings.walletConfig);
            C37628a.m120432a(awemeSettings.hateFulConfig);
            C43212e.m137013a(awemeSettings.hashTagRegex);
            SharePrefCache.inst().getEnableProfileActivityLink().mo59874b(edit, Boolean.valueOf(awemeSettings.enableProfileActivity));
            SharePrefCache.inst().getEnableFace2Face().mo59874b(edit, Boolean.valueOf(awemeSettings.enableFace2Face));
            C24769b.m81284a(awemeSettings);
            C24792i.m81331a(awemeSettings);
            C25222ad.m82931a(awemeSettings);
            SharePrefCache.inst().getEableUltraResolution().mo59874b(edit, Boolean.valueOf(awemeSettings.enableUltraResolution));
            SharePrefCache.inst().isInUltraResBlackList().mo59874b(edit, Boolean.valueOf(awemeSettings.inUltraResBlackList));
            SharePrefCache.inst().getEnableAntiAliasing().mo59874b(edit, Boolean.valueOf(awemeSettings.enableAntiAliasing));
            SharePrefCache.inst().getUltraResolutionLevel().mo59874b(edit, Integer.valueOf(awemeSettings.ultraResolutionLevel));
            C32348g.m104916a(awemeSettings.x2cSwitch);
            C23060u.m75742a().mo60058ab().mo59874b(edit, awemeSettings.dmtJsBridgeWhiteList);
            UserCacheSetting userCacheSetting = awemeSettings.userCacheSetting;
            if (userCacheSetting != null) {
                SharePrefCache.inst().getIsEnableCacheUserList().mo59874b(edit, Boolean.valueOf(userCacheSetting.enableUserCache == 1));
                C22903bl isEnableCacheUserInsert = SharePrefCache.inst().getIsEnableCacheUserInsert();
                if (userCacheSetting.enableCacheUserInsert == 1) {
                    z = true;
                }
                isEnableCacheUserInsert.mo59874b(edit, Boolean.valueOf(z));
                SharePrefCache.inst().getFetchUserCacheIntervals().mo59874b(edit, Long.valueOf(userCacheSetting.fetchUserCacheIntervals));
            }
            C6887b.m21436b().mo16900a((Context) AwemeApplication.m21341a(), "aweme_gecko_offline_host_prefix", (Object) awemeSettings.geckoOfflineHostPrefix);
            C6887b.m21436b().mo16902a((Context) AwemeApplication.m21341a(), C37969ah.f98868c, awemeSettings.tencentSdkDisabled);
            edit.apply();
        }
    }

    protected C37562ao() {
    }

    /* renamed from: a */
    public final void mo94849a(int i) {
        mo94850a(i, null);
    }

    public void handleMsg(Message message) {
        mo94853a(message.obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo94848a(C6709k kVar) throws Exception {
        if (kVar != null) {
            this.f97975f = kVar.toString();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo94854b(C37566a aVar) {
        if (this.f97976g.contains(aVar)) {
            this.f97976g.remove(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo94856c(Object obj) throws Exception {
        if (obj != null) {
            this.f97975f = obj.toString();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo94851a(C37566a aVar) {
        this.f97976g.add(aVar);
    }

    /* renamed from: b */
    public final void mo94855b(Object obj) {
        C1592h.m7853a((Callable<TResult>) new C37573aq<TResult>(this, obj));
        mo94853a(obj);
    }

    /* renamed from: c */
    public static void m120325c(AwemeSettings awemeSettings) {
        if (!C6307b.m19566a((Collection<T>) awemeSettings.defaultCoverUrls)) {
            HashSet hashSet = new HashSet();
            int i = 0;
            try {
                for (UrlModel urlModelWrap : awemeSettings.defaultCoverUrls) {
                    int i2 = i + 1;
                    hashSet.add(new UrlModelWrap(i, urlModelWrap).toJsonString());
                    i = i2;
                }
            } catch (Exception unused) {
            }
            C23338f.m76564b().mo60633b("default_profile_cover_url", (Set<String>) hashSet);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo94847a(Context context) throws Exception {
        try {
            String b = C6887b.m21436b().mo16905b((Context) AwemeApplication.m21341a(), "last_setting_version", "");
            int i = 0;
            if (context != null) {
                i = C23484l.m77111a(context);
            }
            C6709k kVar = (C6709k) this.f97971b.queryRawSetting(PosterSRProcessorInitTask.getCpuModel(), i, b).get();
            C1592h.m7853a((Callable<TResult>) new C37574ar<TResult>(this, kVar));
            return kVar;
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public void mo94853a(Object obj) {
        this.f97974e = true;
        if (!(obj instanceof Exception) && (obj instanceof AwemeSettings)) {
            AwemeSettings awemeSettings = (AwemeSettings) obj;
            mo94852a(awemeSettings);
            C42961az.m136380a(new C32955d());
            C43586c.m138112a().mo105521a(awemeSettings);
        }
    }

    /* renamed from: a */
    public void mo94850a(int i, Context context) {
        C37579ay.m120349a();
        C30202j.m98867a().mo76689a(false);
        this.f97972c.post(new Runnable() {
            public final void run() {
            }
        });
        C23397p.m76735a().mo60807a(this.f97972c, new C37567ap(this, context), 0);
    }
}
