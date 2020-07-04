package com.p280ss.android.ugc.aweme.bridgeservice;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.account.util.C22316a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22708e;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverFragment.Style;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.festival.christmas.model.C29139b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30192a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.newfollow.C34109a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1708y.C43578b;
import com.p280ss.android.ugc.aweme.profile.C35744e;
import com.p280ss.android.ugc.aweme.profile.cover.C35740a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BindAccountView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36403cq;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditFragment;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.setting.p337ui.SettingNewVersionActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bridgeservice.IBridgeService */
public interface IBridgeService {

    /* renamed from: com.ss.android.ugc.aweme.bridgeservice.IBridgeService$a */
    public interface C23545a {
        /* renamed from: a */
        void mo61466a(ArrayList<String> arrayList);

        /* renamed from: b */
        void mo61467b(ArrayList<String> arrayList);
    }

    void afterLogIn();

    void afterLogOut();

    void afterSwitchAccount();

    void changeStatusBarMainTab(Activity activity, String str);

    void checkContentDialogNeedShow(Context context);

    void checkForUpdate(Activity activity, boolean z, String str);

    void checkOnLineTimer();

    ShareContext checkShareContextWhenPublish(Object obj);

    void checkToCleanNoneUsedFiles();

    void checkToTransformMusDraft();

    C36340al createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    AmeBaseFragment createCollectPoiFragment();

    LinearLayout createFollowFeedEmptyHeadView(Activity activity, String str, C35744e eVar);

    AmeBaseFragment createMyProfileFragment();

    Fragment createPublishDialogFragment();

    C34109a createRecommendListPresenter();

    C35744e createThirdPartyAddFriendView(Activity activity);

    ProfileEditFragment createUserProfileEditFragment();

    AmeBaseFragment createUserProfileFragment();

    C35740a createVideoCoverManager(Context context, FrameLayout frameLayout, ImageView imageView);

    void enterChildrenModeSetting(Activity activity);

    void enterMyFavorites(Activity activity, Bundle bundle);

    void enterProfileCropActivity(FragmentActivity fragmentActivity, Aweme aweme);

    void festivalShareFromH5(Context context, String str, C27876a aVar);

    boolean festivalShareVideoAfterPublish(Context context, C29139b bVar, Aweme aweme);

    Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2);

    String getAdvertisingIdOb();

    List<C22316a> getAfterLoginActions(Bundle bundle);

    String getAndroidId();

    int getAntiAddictionContinuePlayId();

    int getAntiAddictionTextViewId();

    int getAntiAddictionViewId();

    int getAntiTextResourceId();

    SQLiteDatabase getAppOpenReadDB();

    List<C22708e> getDeeplinkCommands();

    C26596c getDiscoverFragment(Style style, boolean z);

    C43578b getDouLabService();

    Class<? extends Activity> getHeaderDetailActivity();

    boolean getInterestSelectShowed();

    Intent getInviteUserListActivityIntent(Activity activity, int i);

    String getLocalLanguage(Context context);

    Class<? extends Activity> getManagerMyAccountActivity();

    Class<?> getMyProfileFragmentClass();

    Fragment getNearbyFragment();

    Class<? extends Activity> getPrivacySettingActivity();

    String getReportUrl();

    Class<? extends Activity> getSettingActivityClass();

    C37562ao getSettingManager();

    C30192a getSettingsWatcher();

    int getShareIconResource();

    Class<? extends AmeBaseActivity> getSubmitFeedbackActivity();

    Integer getUnloginMessageDrawable();

    Integer getUnloginProfileMoreImg();

    void getUserSettings();

    Widget getVideoBottomInputWidget();

    Widget getVideoFamiliarBarrageWidget();

    Widget getVideoUserInfoWidget();

    Intent getWebUriIntent(Context context, Uri uri);

    void goToPrivacyActivity(Context context);

    void handleNav(MainTabStrip mainTabStrip);

    void handleOpenSdk(Intent intent, C23545a aVar);

    String handleUnlogin(TabChangeManager tabChangeManager, String str);

    void handleUnloginForSetting(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet);

    boolean havePGCShow();

    void increaseViewedCount(boolean z);

    View inflateFamiliarFullFeedImageView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    View inflateFamiliarFullFeedVideoView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void initMiniAppInDeeplink(Context context, Uri uri);

    void initRouterConfig();

    boolean isChannelSubTabNearby();

    boolean isClientKeyValid(ShareContext shareContext);

    boolean isFamiliarFeedFullScreen();

    boolean isFocusOnVideoTime();

    boolean isFromOpenSdk(Intent intent);

    boolean isHaveLatestTab();

    boolean isNeedContactsFriends(boolean z);

    boolean isNeedLightStatusBar();

    boolean isNeedReplacePushPath();

    boolean isStartJourneyActivity(Activity activity);

    boolean isStartWelcomeScreenActivity(Activity activity);

    boolean isUploadContactsNoticeDialogShowing();

    boolean isUserMaterialDialogDealing();

    boolean judgeIsPolarisUrl(String str);

    void jumpToH5(String str, Context context);

    void jumpToH5(String str, Context context, Intent intent);

    boolean needCallbackOnActivityResumed(Activity activity);

    boolean needCheckCopyright();

    boolean needLiveInRecord();

    void onBackToOpenPlatform(Object obj);

    void onFeedStartForContentLanguageGuide(Context context, Aweme aweme);

    void onFeedStartForInitialChooseLanguage(Context context);

    void onFeedStop();

    void onMainTabChanged(TabChangeManager tabChangeManager, String str);

    void onRecommendFeedStopForLanguage();

    void onReturnThirdPlatformFailed(Activity activity, ShareContext shareContext, String str, int i);

    void openAgreement(Activity activity, String str, boolean z, String str2);

    void openDouPlus(Context context);

    void openLanguageTestDialog(Context context);

    void openPoiCouponScopeActivity(Context context, Bundle bundle);

    void openSettingFragment(Context context);

    void openWallet(Activity activity);

    void pushOrNoticeShowLinkAccountDialog(C0608j jVar, String str);

    void readTaskPlayerCycle(int i, boolean z);

    void registerComponentAndStatus(EventActivityComponent eventActivityComponent, C39328f fVar);

    Dialog requestContactsPermissionAfterBindMobile(Context context, String str);

    void requestLocationPermissions(Activity activity, C43154a aVar);

    void setCustomStatusBarInLayout(Activity activity);

    void setHasShowToutiaoLink(BindAccountView bindAccountView);

    void setHasShowedUserAntiAddictionViewToday();

    void setStatusBar(Activity activity);

    void setStatusBar(Activity activity, View view);

    boolean shouldShowAntiAddictionView();

    boolean shouldShowVSButton(Aweme aweme);

    void showLinkAccountDialog(C0608j jVar, String str, C36403cq cqVar);

    void showNewYearGuideDialog(Activity activity, Aweme aweme, String str, String str2, boolean z);

    void showPoiRateDialog(Context context, String str, String str2, String str3, int i, String str4, String str5, HashMap<String, String> hashMap);

    void showPoiRateUploadVideoSuccessDialog(Context context);

    void startAuthNativeActivity(Context context, Bundle bundle, AuthClickCallBackWeb authClickCallBackWeb);

    void startFeedsDetectTask(int i);

    void startMicroAppGroupActivity(Activity activity, Bundle bundle);

    void startThirdSocialActivity(Context context, User user, int i);

    void switchToBioUrl(Activity activity, String str);

    void switchToSignature(Activity activity);

    void trackAppsFlyerEvent(String str, String str2);

    boolean tryOpenPolarisPage(Context context, String str);

    void tryRefreshLocation(Context context);

    void trySetJumpToFissionH5(String str);

    void tryShowMoneyGrowthDialog(Context context);

    void tryToShowPromoteProgram(Activity activity);

    void updateTTAbTest(AbTestModel abTestModel);
}
