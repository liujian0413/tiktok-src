package com.p280ss.android.ugc.aweme.i18n;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bolts.C1592h;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.dataplatform.p507a.C10034a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C21787z;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.p280ss.android.ugc.aweme.account.util.C22316a;
import com.p280ss.android.ugc.aweme.account.util.C22330i;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22689a.C22708e;
import com.p280ss.android.ugc.aweme.app.C22689a.C22709f;
import com.p280ss.android.ugc.aweme.app.C22773ag.C22774a;
import com.p280ss.android.ugc.aweme.app.C22872aq.C22874b;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p1020a.p1021a.C22731a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.C23545a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23808t;
import com.p280ss.android.ugc.aweme.common.BaseShareContext;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.common.widget.LoadingStatusView.C25732a;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import com.p280ss.android.ugc.aweme.discover.p1185ui.CommunityAgreementActivity;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverFragment;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverFragment.Style;
import com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4CategoryFragment;
import com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4NavigationFragment;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.UserFavoritesActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28780ah.C28781a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.festival.christmas.model.C29139b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.GuideToInviteThirdFriends;
import com.p280ss.android.ugc.aweme.friends.p1285ui.IAddFriendsActivity;
import com.p280ss.android.ugc.aweme.friends.p1285ui.InviteUserListActivity;
import com.p280ss.android.ugc.aweme.global.config.settings.C30192a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.task.C30296a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.p280ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity;
import com.p280ss.android.ugc.aweme.i18n.draftcompat.C30453c;
import com.p280ss.android.ugc.aweme.i18n.draftcompat.CleanUpHelper;
import com.p280ss.android.ugc.aweme.i18n.language.initial.C30483e;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.i18n.musically.p1304a.p1305a.C30491a;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1308ui.MusProfileEditFragment;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.p1309ui.MusHeaderDetailActivity;
import com.p280ss.android.ugc.aweme.i18n.p1301c.p1302a.C30438a;
import com.p280ss.android.ugc.aweme.i18n.settings.language.MusChooseLanguageActivity;
import com.p280ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity;
import com.p280ss.android.ugc.aweme.interest.C32186e;
import com.p280ss.android.ugc.aweme.interest.C32190g;
import com.p280ss.android.ugc.aweme.interest.C32190g.C32191a;
import com.p280ss.android.ugc.aweme.interest.InterestSelectActivity;
import com.p280ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.login.p1373ui.C32697b;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.money.growth.C33633c;
import com.p280ss.android.ugc.aweme.money.growth.C33639e.C33640a;
import com.p280ss.android.ugc.aweme.money.growth.MoneyGrowthDialog;
import com.p280ss.android.ugc.aweme.net.interceptor.C34073c;
import com.p280ss.android.ugc.aweme.newfollow.C34109a;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.MTTutorialVideoExperiment;
import com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.C34653a;
import com.p280ss.android.ugc.aweme.opensdk.share.C34683c;
import com.p280ss.android.ugc.aweme.opensdk.share.C34685e;
import com.p280ss.android.ugc.aweme.opensdk.share.base.C34682a;
import com.p280ss.android.ugc.aweme.opensdk.share.base.DYImageObject;
import com.p280ss.android.ugc.aweme.opensdk.share.base.DYVideoObject;
import com.p280ss.android.ugc.aweme.opensdk.share.base.TikTokImageObject;
import com.p280ss.android.ugc.aweme.opensdk.share.base.TikTokVideoObject;
import com.p280ss.android.ugc.aweme.opensdk.share.p1450a.C34675a;
import com.p280ss.android.ugc.aweme.opensdk.share.p1450a.C34675a.C34678a;
import com.p280ss.android.ugc.aweme.opensdk.share.share.C34697a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42722c;
import com.p280ss.android.ugc.aweme.p1708y.C43568a;
import com.p280ss.android.ugc.aweme.p1708y.C43578b;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.C35744e;
import com.p280ss.android.ugc.aweme.profile.cover.C35740a;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediMTAwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BindAccountView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36348aq;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36403cq;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MTAwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusLinkAccountDialog;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusMyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusUserProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditBioUrlActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.MyProfileV2Fragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.UserProfileV2Fragment;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37249i;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37543ad;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.setting.C37665p;
import com.p280ss.android.ugc.aweme.setting.C37943w;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.setting.p337ui.MusSettingManageMyAccountActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.MusSettingNewVersionActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.MusSubmitFeedbackActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.SettingNewVersionActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.child.ChildrenModeMusSettingActivity;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37686a;
import com.p280ss.android.ugc.aweme.setting.secret.p1526a.C37699a;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a;
import com.p280ss.android.ugc.aweme.share.C37982an;
import com.p280ss.android.ugc.aweme.share.C37991as;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38564j;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PublishDialogFragment;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41563o;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import com.p280ss.android.ugc.aweme.unlogin.C42760d;
import com.p280ss.android.ugc.aweme.util.C42866a;
import com.p280ss.android.ugc.aweme.util.C42896t;
import com.p280ss.android.ugc.aweme.utils.C43020co;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.wallet.C43395a;
import com.p280ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb;
import com.p280ss.android.ugc.aweme.welcome.WelcomeScreenActivity;
import com.p280ss.android.ugc.aweme.welcome.WelcomeScreenActivity.C43534a;
import com.p280ss.android.ugc.trill.abtest.C44974b;
import com.p280ss.android.ugc.trill.language.C45026f.C45027a;
import com.p280ss.android.ugc.trill.p1757a.C44972a;
import com.p280ss.android.ugc.trill.p1760c.p1761a.C44985a;
import com.p280ss.android.ugc.trill.p1762d.C44987a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import com.zhiliaoapp.musically.openauthorize.AwemeAuthorizedActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient.Builder;

/* renamed from: com.ss.android.ugc.aweme.i18n.BridgeService */
public class BridgeService implements IBridgeService {
    private static final boolean IS_FLAVOR_MUSICALLY = TextUtils.equals("musically", "musically");
    private ExecutorService mExecutorService;
    private C41990e mLiveServiceAdapter;

    public void addAggregatedData(List list, Context context) {
    }

    public void addOneCard(int i) {
    }

    public void addSupportLanguageItems() {
    }

    public void checkOnLineTimer() {
    }

    public boolean checkVersionMusical() {
        return true;
    }

    public Fragment createAddFriendsFragment() {
        return null;
    }

    public ProfileListFragment createCollectPoiFragment() {
        return null;
    }

    public LinearLayout createFamiliarFeedEmptyHeadView(Activity activity, LinearLayout linearLayout, C35744e eVar) {
        return null;
    }

    public LinearLayout createFollowFeedEmptyHeadView(Activity activity, String str, C35744e eVar) {
        return null;
    }

    public Fragment createOneLoginStartFragment(OneLoginPhoneBean oneLoginPhoneBean, long j) {
        return null;
    }

    public C34109a createRecommendListPresenter() {
        return null;
    }

    public C35744e createThirdPartyAddFriendView(Activity activity) {
        return null;
    }

    public C35740a createVideoCoverManager(Context context, FrameLayout frameLayout, ImageView imageView) {
        return null;
    }

    public void endOneLogin() {
    }

    public void enterProfileCropActivity(FragmentActivity fragmentActivity, Aweme aweme) {
    }

    public void festivalShareFromH5(Context context, String str, C27876a aVar) {
    }

    public void festivalShareVideo(Context context, Dialog dialog, Aweme aweme, String str) {
    }

    public boolean festivalShareVideoAfterPublish(Context context, C29139b bVar, Aweme aweme) {
        return false;
    }

    public Class<? extends Activity> fillProfileActivityV2() {
        return null;
    }

    public int getAntiAddictionContinuePlayId() {
        return 0;
    }

    public int getAntiAddictionTextViewId() {
        return 0;
    }

    public int getAntiAddictionViewId() {
        return 0;
    }

    public int getAntiTextResourceId() {
        return 0;
    }

    public String getChannelI18nName() {
        return "";
    }

    public Class<? extends Activity> getCheckProfileActivity() {
        return CheckProfileActivity.class;
    }

    public Class<? extends AmeSSActivity> getChooseLanguageActivityClass() {
        return MusChooseLanguageActivity.class;
    }

    public int getDefaultShareIcon() {
        return R.drawable.a8u;
    }

    public int getGoogleIcon() {
        return R.drawable.bb8;
    }

    public Class<? extends Activity> getHeaderDetailActivity() {
        return MusHeaderDetailActivity.class;
    }

    public int getLayoutId(int i) {
        return 0;
    }

    public Class<? extends Activity> getMainActivity() {
        return null;
    }

    public Class<? extends Activity> getManagerMyAccountActivity() {
        return MusSettingManageMyAccountActivity.class;
    }

    public Class<? extends Activity> getPrivacySettingActivity() {
        return MusPrivacyActivity.class;
    }

    public Class<? extends Activity> getProfileActivity() {
        return CheckProfileActivity.class;
    }

    public String getReportUrl() {
        return "https://m.tiktok.com/report/";
    }

    public Class<? extends AmeBaseActivity> getSubmitFeedbackActivity() {
        return MusSubmitFeedbackActivity.class;
    }

    public Class getVerifyActivity() {
        return null;
    }

    public Widget getVideoBottomInputWidget() {
        return null;
    }

    public Widget getVideoFamiliarBarrageWidget() {
        return null;
    }

    public Widget getVideoUserInfoWidget() {
        return null;
    }

    public Intent getWebUriIntent(Context context, Uri uri) {
        return null;
    }

    public boolean havePGCShow() {
        return IS_FLAVOR_MUSICALLY;
    }

    public View inflateFamiliarFullFeedImageView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public View inflateFamiliarFullFeedVideoView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void initMiniAppInDeeplink(Context context, Uri uri) {
    }

    public void initOneLogin(Context context, String str, C32697b bVar) {
    }

    public boolean isChannelSubTabNearby() {
        return false;
    }

    public boolean isFamiliarFeedFullScreen() {
        return false;
    }

    public boolean isFocusOnVideoTime() {
        return IS_FLAVOR_MUSICALLY;
    }

    public boolean isForceEnableColorFilter() {
        return IS_FLAVOR_MUSICALLY;
    }

    public boolean isHaveLatestTab() {
        return false;
    }

    public boolean isNeedAddChallengeNameToDesc() {
        return false;
    }

    public boolean isNeedLightStatusBar() {
        return true;
    }

    public boolean isNeedReplacePushPath() {
        return IS_FLAVOR_MUSICALLY;
    }

    public boolean isNeedToastExceptionMsg(int i) {
        return i != 2067;
    }

    public boolean isUploadContactsNoticeDialogShowing() {
        return false;
    }

    public boolean isUserMaterialDialogDealing() {
        return false;
    }

    public boolean isVideoCoverFrameDarkColor() {
        return IS_FLAVOR_MUSICALLY;
    }

    public boolean needCallbackOnActivityResumed(Activity activity) {
        return false;
    }

    public boolean needCheckCopyright() {
        return IS_FLAVOR_MUSICALLY;
    }

    public boolean needCompatWithMusAudio() {
        return IS_FLAVOR_MUSICALLY;
    }

    public boolean needForceDirectShoot() {
        return false;
    }

    public void observeActivityRpInfo(C0043i iVar, C36348aq aqVar) {
    }

    public void onPageSelected() {
    }

    public void openDouPlus(Context context) {
    }

    public void openPoiCouponScopeActivity(Context context, Bundle bundle) {
    }

    public void registerComponentAndStatus(EventActivityComponent eventActivityComponent, C39328f fVar) {
    }

    public Dialog requestContactsPermissionAfterBindMobile(Context context, String str) {
        return null;
    }

    public Class<? extends Activity> selectCountryActivity() {
        return null;
    }

    public void sendEnterChannelEvent(String str, String str2) {
    }

    public void sendEnterSubChannelEvent(String str, String str2) {
    }

    public void sendHomepageFreshEvent(String str, String str2) {
    }

    public void setCurrentVideoPublicState(boolean z) {
    }

    public void setHasActive() {
    }

    public void setHasShowToutiaoLink(BindAccountView bindAccountView) {
    }

    public void setHasShowedUserAntiAddictionViewToday() {
    }

    public boolean shouldShowAntiAddictionView() {
        return false;
    }

    public boolean shouldShowVSButton(Aweme aweme) {
        return false;
    }

    public Dialog showMobileProtocolDialog(Activity activity, boolean z) {
        return null;
    }

    public void showNewYearGuideDialog(Activity activity, Aweme aweme, String str, String str2, boolean z) {
    }

    public void showPoiRateDialog(Context context, String str, String str2, String str3, int i, String str4, String str5, HashMap<String, String> hashMap) {
    }

    public void showPoiRateUploadVideoSuccessDialog(Context context) {
    }

    public Dialog showPrivacyDialog(Activity activity) {
        return null;
    }

    public Dialog showProtocolDialog(Activity activity) {
        return null;
    }

    public void startMicroAppGroupActivity(Activity activity, Bundle bundle) {
    }

    public void tryShowUserMaterialAuthDialog(Context context) {
    }

    public void tryToShowPromoteProgram(Activity activity) {
    }

    private void syncPushSetting() {
        C37703a.f98219b.mo95049a(null, false);
    }

    public void checkToTransformMusDraft() {
        C30453c.m99472a().mo80129b();
    }

    public Fragment createPublishDialogFragment() {
        return new PublishDialogFragment();
    }

    public ProfileEditFragment createUserProfileEditFragment() {
        return new MusProfileEditFragment();
    }

    public String getAdvertisingIdOb() {
        return C44987a.m141951b();
    }

    public String getAndroidId() {
        return C44987a.m141952c();
    }

    public SQLiteDatabase getAppOpenReadDB() {
        return C44972a.m141913a().f115648b;
    }

    public SQLiteDatabase getAppOpenWriteDB() {
        return C44972a.m141913a().f115647a;
    }

    public C43578b getDouLabService() {
        return new C43568a();
    }

    public C7152c getInterestSelectRequest() {
        return new C32186e();
    }

    public Fragment getNearbyFragment() {
        return new FeedRecommendFragment();
    }

    public C37562ao getSettingManager() {
        return new C37665p();
    }

    public C30192a getSettingsWatcher() {
        return new C37943w();
    }

    public int getShareIconResource() {
        return C37982an.m121298a();
    }

    public Integer getUnloginMessageDrawable() {
        return Integer.valueOf(R.drawable.b23);
    }

    public Integer getUnloginProfileMoreImg() {
        return Integer.valueOf(R.drawable.ayu);
    }

    public void getUserSettings() {
        C37686a.m120524a(true);
        C37699a.m120557b();
    }

    public void onFeedStop() {
        C30483e.m99569a().mo80164c();
    }

    public void checkToCleanNoneUsedFiles() {
        if (CleanUpHelper.m99458a()) {
            CleanUpHelper.m99460c();
        }
    }

    public boolean getInterestSelectShowed() {
        if (!C32191a.m104467c() || C32191a.m104468d() != 0) {
            return false;
        }
        return true;
    }

    public Class<?> getMyProfileFragmentClass() {
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            return MyProfileV2Fragment.class;
        }
        return MusMyProfileFragment.class;
    }

    public Class<? extends Activity> getSettingActivityClass() {
        if (C43122ff.m136767b()) {
            return ChildrenModeMusSettingActivity.class;
        }
        return MusSettingNewVersionActivity.class;
    }

    public int getSwipeUpGuideType() {
        return C10034a.m29821d(true).intValue();
    }

    public void onRecommendFeedStopForLanguage() {
        C30483e.m99569a().mo80164c();
        C45027a.m142034a().mo107550d();
    }

    public void afterLogOut() {
        if (!(KakaoSDK.getAdapter() == null || Session.getCurrentSession() == null)) {
            Session.getCurrentSession().close();
        }
        C44985a.m141947d();
        C37686a.m120524a(true);
        C25789b.m84766m();
    }

    public AmeBaseFragment createMyProfileFragment() {
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            return new MyProfileV2Fragment();
        }
        return new MusMyProfileFragment();
    }

    public AmeBaseFragment createUserProfileFragment() {
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            return new UserProfileV2Fragment();
        }
        return new MusUserProfileFragment();
    }

    public List<C22708e> getDeeplinkCommands() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C22874b.m75338a());
        arrayList.addAll(C22774a.m75159a());
        arrayList.addAll(C22709f.m75046a());
        return arrayList;
    }

    public C38564j getMaxDurationResolver() {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).createMaxDurationResolver();
    }

    public void initRouterConfig() {
        SmartRouter.configRouter("snssdk1233").withOtherSchemes(new String[]{"aweme", C22909c.f60637a});
    }

    public int isInterestOrWelcomeShowing() {
        if (C32190g.m104459a() && !C32190g.f84056f) {
            return 1;
        }
        if (WelcomeScreenActivity.m138012j() || C43534a.m138022b()) {
            return 2;
        }
        return 0;
    }

    public void afterLogIn() {
        if (!C45027a.m142034a().mo107546a()) {
            syncPushSetting();
        }
        if (!C43122ff.m136767b() && C6384b.m19835a().mo15292a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", C6384b.m19835a().mo15295d().mt_tutorial_video, false)) {
            C7121a.m22254e().mo18551a(new C37249i()).mo18552a();
        }
    }

    public void afterSwitchAccount() {
        if (!(KakaoSDK.getAdapter() == null || Session.getCurrentSession() == null)) {
            Session.getCurrentSession().close();
        }
        C44985a.m141947d();
        C25789b.m84766m();
        if (C25789b.m84753a().mo66974c() != 0) {
            C6877n.m21407a("not_clear_old_settings", "", null);
        }
        syncPushSetting();
    }

    public boolean needLiveInRecord() {
        if (this.mLiveServiceAdapter == null) {
            this.mLiveServiceAdapter = new C41990e();
        }
        if (!C41990e.m133510c() || !C21115b.m71197a().isLogin() || C41563o.m132356a()) {
            return false;
        }
        return true;
    }

    public void addExtraPlayCommonParam(C19290j jVar) {
        C30438a.m99423a(jVar);
    }

    public void increaseViewedCount(boolean z) {
        C42896t.m136198a();
    }

    public void openLanguageTestDialog(Context context) {
        C30483e.m99573c(context);
    }

    public void switchToSignature(Activity activity) {
        ProfileEditActivity.m117084a(activity);
    }

    public void checkContentDialogNeedShow(Context context) {
        C45027a.m142034a().mo107548b(context);
    }

    public ShareContext checkShareContextWhenPublish(Object obj) {
        return C34697a.m112007a(obj);
    }

    public ShareContext createShareContext(Intent intent) {
        return C34697a.m112006a(intent);
    }

    public boolean isClientKeyValid(ShareContext shareContext) {
        return C34697a.m112009a((BaseShareContext) shareContext);
    }

    public boolean isStartJourneyActivity(Activity activity) {
        return NewUserJourneyActivity.m104519a(activity);
    }

    public boolean judgeIsPolarisUrl(String str) {
        return C42722c.m135621a(str);
    }

    public void onFeedStartForInitialChooseLanguage(Context context) {
        C30483e.m99569a().mo80161a(context);
    }

    public void openWallet(Activity activity) {
        C43395a.m137716a(activity, IWalletMainProxy.KEY_PAGE_INDEX);
    }

    public void setCustomStatusBarInLayout(Activity activity) {
        C23487o.m77149b(activity);
        C23487o.m77155c(activity);
    }

    public void setStatusBar(Activity activity) {
        C23487o.m77149b(activity);
        C23487o.m77155c(activity);
    }

    public void startFeedsDetectTask(int i) {
        C30491a.m99589a().mo80169a(i);
    }

    public void tryRefreshLocation(Context context) {
        C32630h.m105696b(context).mo83998b();
    }

    public void tryShowMoneyGrowthDialog(Context context) {
        MoneyGrowthDialog.f87757g.mo86005a(context);
    }

    private boolean needCheckPrivateAccountBeforePlay(User user) {
        return C43122ff.m136769b(user, C43122ff.m136787r(user));
    }

    public void dismissLoginDialog(Dialog dialog) {
        if (dialog.isShowing()) {
            C30461l.m99486a(dialog);
        }
    }

    public void goToPrivacyActivity(Context context) {
        context.startActivity(new Intent(context, MusPrivacyActivity.class));
    }

    public void initOtherReferences(View view) {
        view.findViewById(R.id.brx).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a((Activity) view.getContext()).mo56859a());
            }
        });
    }

    public boolean isFromOpenSdk(Intent intent) {
        if (!TextUtils.isEmpty(intent.getStringExtra("_aweme_open_sdk_params_client_key"))) {
            return true;
        }
        return false;
    }

    public boolean isInMyProfilePage(Context context) {
        if (context instanceof MainActivity) {
            return ((MainActivity) context).getCurFragment() instanceof MusMyProfileFragment;
        }
        return false;
    }

    public void trySetJumpToFissionH5(String str) {
        if (C42722c.m135621a(str)) {
            C28781a.m94773a(true);
        }
    }

    public void updateTTAbTest(AbTestModel abTestModel) {
        try {
            C44974b.m141917a().mo107493a(JSONObject.toJSONString(abTestModel));
        } catch (Exception unused) {
        }
    }

    public void enterChildrenModeSetting(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            activity.startActivity(new Intent(activity, ChildrenModeMusSettingActivity.class));
        }
    }

    public Intent getMainActivityIntent(Context context) {
        Class sessionListActivityClass = C30553b.m99810g().getSessionListActivityClass();
        if (sessionListActivityClass != null) {
            return new Intent(context, sessionListActivityClass);
        }
        return null;
    }

    public void openSettingFragment(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, MusSettingNewVersionActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("from_pro_account", true);
            context.startActivity(intent);
        }
    }

    public boolean tryStartWelcomeScreenOrInterestSelectActivity(Activity activity) {
        boolean a = WelcomeScreenActivity.m138009a(activity);
        if (!a) {
            a = InterestSelectActivity.m104407a(activity);
        }
        if (a) {
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
        }
        return a;
    }

    public String getLocalLanguage(Context context) {
        String language = C30472f.m99529a(context).getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            return "en";
        }
        return language;
    }

    public void onBackToOpenPlatform(Object obj) {
        String str;
        final ShareContext a = C34697a.m112007a(obj);
        if (C34697a.m112009a((BaseShareContext) a)) {
            final Activity b = AwemeApplication.m21343b();
            if (b != null) {
                if (TextUtils.isEmpty(a.mAppName)) {
                    str = b.getString(R.string.e70);
                } else {
                    str = a.mAppName;
                }
                new C34675a(b, str, "share success", new C34678a() {
                    /* renamed from: b */
                    public final void mo80107b() {
                        Intent intent = new Intent();
                        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                        b.sendBroadcast(intent);
                    }

                    /* renamed from: a */
                    public final void mo80106a() {
                        new C34685e(b, a).mo88008a();
                        C6907h.m21524a("return_to_origin_app", (Map) C22984d.m75611a().mo59973a("launch_from", a.mClientKey).f60753a);
                    }
                }).show();
            }
        }
    }

    public boolean canAwemePlay(Aweme aweme) {
        boolean z;
        boolean z2;
        if (aweme == null || aweme.getStatus() == null || aweme.getStatus().isDelete() || !C43122ff.m136787r(aweme.getAuthor())) {
            z = false;
        } else {
            z = true;
        }
        if (aweme == null || aweme.getStatus() == null || aweme.getStatus().isDelete() || aweme.getStatus().isPrivate() || needCheckPrivateAccountBeforePlay(aweme.getAuthor())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public List<C22316a> getAfterLoginActions(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C30431a(bundle));
        if (bundle.getBoolean("new_user_need_set_pass_word", false)) {
            arrayList.add(new C30435b(bundle));
        }
        if (bundle.getBoolean("new_user_need_set_username", false)) {
            arrayList.add(new C30447d(bundle));
        }
        arrayList.add(new C30454e(bundle));
        arrayList.add(new C30455f(this, bundle));
        arrayList.add(new C30456g(this, bundle));
        arrayList.add(new C30457h(bundle));
        arrayList.add(new C30458i(bundle));
        return arrayList;
    }

    public void handleNav(MainTabStrip mainTabStrip) {
        if (C21115b.m71197a().isLogin()) {
            if (C43122ff.m136767b() || TimeLockRuler.isInTeenagerModeNewVersion()) {
                mainTabStrip.mo79827d();
            } else if (C25789b.m84758d()) {
                mainTabStrip.mo79826c();
            } else {
                if (C21115b.m71197a().getCurUser().getFollowingCount() >= ((Integer) SharePrefCache.inst().getFollowUserThreshold().mo59877d()).intValue()) {
                    int b = C30296a.f79657a.mo79794b(0);
                    if (b == 0) {
                        mainTabStrip.mo79827d();
                    } else if (b == 2) {
                        C6857a.m21312e().mo16818a();
                        C6857a.m21312e().mo16824b();
                        mainTabStrip.mo79826c();
                    } else {
                        if (b == 1) {
                            mainTabStrip.mo79827d();
                        }
                    }
                } else {
                    mainTabStrip.mo79827d();
                }
            }
        }
    }

    public boolean isNeedContactsFriends(boolean z) {
        if (!z) {
            return true;
        }
        if (!TextUtils.isEmpty(C32326h.m104886h())) {
            if (!C32326h.m104884a(C32326h.m104886h())) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(C32326h.m104885g())) {
            if (!C32326h.m104884a(C32326h.m104885g())) {
                return true;
            }
            return false;
        } else if (!((Boolean) SharePrefCache.inst().getIsEuropeCountry().mo59877d()).booleanValue()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isStartWelcomeScreenActivity(Activity activity) {
        if (C6870b.m21395c() || activity.getIntent().getBooleanExtra("FROM_WELCOME_SCREEN", false)) {
            return false;
        }
        Class cls = WelcomeScreenActivity.class;
        boolean z = true;
        if (!WelcomeScreenActivity.m138013k()) {
            if (!C32190g.m104459a() || C32190g.f84056f) {
                z = false;
            } else {
                cls = InterestSelectActivity.class;
            }
        }
        if (z) {
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
            Intent intent = new Intent(activity, cls);
            intent.putExtra("deeplink_intent_about_welcome_screen", activity.getIntent());
            activity.startActivity(intent);
            activity.finish();
        }
        return z;
    }

    public void enterMyFavorites(Activity activity, Bundle bundle) {
        UserFavoritesActivity.m91202a(activity, bundle);
    }

    public void handleUnloginForSetting(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet) {
        C42760d.m135711a(settingNewVersionActivity, hashSet);
    }

    public void jumpToH5(String str, Context context) {
        C33633c.m108531a(str, context);
    }

    public void switchToBioUrl(Activity activity, String str) {
        ProfileEditBioUrlActivity.m117097a(activity, str);
    }

    public Intent getInviteUserListActivityIntent(Activity activity, int i) {
        return InviteUserListActivity.m98688a((Context) activity, i);
    }

    public String handleUnlogin(TabChangeManager tabChangeManager, String str) {
        return C42760d.f111092a.mo104372a(tabChangeManager, str);
    }

    public void onFeedStartForContentLanguageGuide(Context context, Aweme aweme) {
        C45027a.m142034a().mo107545a(context, aweme);
    }

    public void readTaskPlayerCycle(int i, boolean z) {
        C33640a.m108571a().mo86022a(i, z);
    }

    public void requestLocationPermissions(Activity activity, C43154a aVar) {
        C32630h.m105696b(activity).mo84012c(activity, aVar);
    }

    public boolean tryOpenPolarisPage(Context context, String str) {
        return C42722c.m135620a(context, str, "ads");
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$0$BridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (!C22330i.m73931a("enter_from_login_ui_routine")) {
            C22731a.m75106b(bundle);
        }
    }

    public void addSpecialNetworkInterceptor(Builder builder, int i) {
        builder.addNetworkInterceptor(new C34073c());
    }

    public void setLoadingStatusTextColor(Context context, C25732a aVar) {
        if (context != null && aVar != null) {
            aVar.mo66680a(C0683b.m2912c(context, R.color.a6f));
        }
    }

    public void setStatusBar(Activity activity, View view) {
        if (IS_FLAVOR_MUSICALLY && activity != null && view != null) {
            C25713b.m84475a(view);
            C23487o.m77155c(activity);
        }
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$2$BridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        Activity b = AwemeApplication.m21343b();
        if (b != null) {
            C6861a.m21336e().keepCallback().setPassword(b, bundle, new C30437c(bundle));
        } else {
            C22731a.m75106b(bundle);
        }
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$4$BridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        Activity b = AwemeApplication.m21343b();
        if (b != null) {
            C6861a.m21332a().userNameService().setUserNameForThirdParty(b, bundle, new C30460k(bundle));
        } else {
            C22731a.m75106b(bundle);
        }
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$5$BridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (!GuideToInviteThirdFriends.m98615a(AwemeApplication.m21343b())) {
            C22731a.m75106b(bundle);
        }
    }

    public String getBlockedUserOpInfoString(User user, Context context) {
        return context.getString(R.string.cbk, new Object[]{C43122ff.m136777h(user), C30537o.m99738a((long) user.getFollowerCount())});
    }

    public void onMainTabChanged(TabChangeManager tabChangeManager, String str) {
        if (!TextUtils.isEmpty(str) && str.equals("USER")) {
            Fragment a = tabChangeManager.mo84567a();
            if (a != null && (a instanceof MusMyProfileFragment)) {
                ((MusMyProfileFragment) a).mo92079K();
            }
        }
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$10$BridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (Keva.getRepo("compliance_setting").getBoolean("need_to_show_ftc_age_gate_but_no_showed", false)) {
            C6877n.m21407a("aweme_age_gate_not_show", "", C6869c.m21381a().mo16885a("platform", Integer.valueOf(C21115b.m71197a().getCurUser().getLoginPlatform())).mo16888b());
        }
        C22731a.m75106b(bundle);
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$9$BridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle.getBoolean("need_restart", false)) {
            new Handler().postDelayed(new C30459j(bundle), 500);
        } else {
            C22731a.m75106b(bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$getAfterLoginActions$6$BridgeService(final Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        Activity b = AwemeApplication.m21343b();
        if (!C6861a.m21334c().keepCallback().showFTCAgeGateForCurrentUser(b, new C21787z() {
            /* renamed from: a */
            public final void mo58121a() {
                C22731a.m75106b(bundle);
            }
        })) {
            if (C43122ff.m136767b()) {
                bundle.putBoolean("need_restart", true);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(b);
            }
            C22731a.m75106b(bundle);
        }
    }

    public void trackAppsFlyerEvent(final String str, final String str2) {
        if (this.mExecutorService == null) {
            synchronized (BridgeService.class) {
                if (this.mExecutorService == null) {
                    this.mExecutorService = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("AppsFlyer").mo18996a());
                }
            }
        }
        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                C42866a.m136075a(str, str2);
                return null;
            }
        }, (Executor) this.mExecutorService);
    }

    public void changeStatusBarMainTab(Activity activity, String str) {
        if (activity != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1382453013) {
                if (hashCode != 2223327) {
                    if (hashCode != 2614219) {
                        if (hashCode == 1055811561 && str.equals("DISCOVER")) {
                            c = 1;
                        }
                    } else if (str.equals("USER")) {
                        c = 3;
                    }
                } else if (str.equals("HOME")) {
                    c = 0;
                }
            } else if (str.equals("NOTIFICATION")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    C23487o.m77149b(activity);
                    C43020co.m136532a(activity);
                    return;
                case 1:
                case 2:
                case 3:
                    C23487o.m77149b(activity);
                    C23487o.m77155c(activity);
                    break;
            }
        }
    }

    public C26596c getDiscoverFragment(Style style, boolean z) {
        if (!C43122ff.m136767b() && C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) == 1) {
            return new DiscoverV4CategoryFragment();
        }
        if (C43122ff.m136767b() || (C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) != 2 && C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) != 3)) {
            return DiscoverFragment.m88238a(style, z);
        }
        return new DiscoverV4NavigationFragment();
    }

    public void handleOpenSdk(Intent intent, C23545a aVar) {
        C34682a a = C34683c.m111980a(intent);
        if (a != null) {
            if (a instanceof DYVideoObject) {
                ArrayList<String> arrayList = ((DYVideoObject) a).mVideoPaths;
                if (arrayList != null) {
                    aVar.mo61466a(arrayList);
                } else {
                    return;
                }
            } else if (a instanceof DYImageObject) {
                ArrayList<String> arrayList2 = ((DYImageObject) a).mImagePaths;
                if (arrayList2 != null) {
                    aVar.mo61467b(arrayList2);
                } else {
                    return;
                }
            }
            if (a instanceof TikTokVideoObject) {
                ArrayList<String> arrayList3 = ((TikTokVideoObject) a).mVideoPaths;
                if (arrayList3 != null) {
                    aVar.mo61466a(arrayList3);
                    return;
                }
                return;
            }
            if (a instanceof TikTokImageObject) {
                ArrayList<String> arrayList4 = ((TikTokImageObject) a).mImagePaths;
                if (arrayList4 != null) {
                    aVar.mo61467b(arrayList4);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$getAfterLoginActions$7$BridgeService(final Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        Activity b = AwemeApplication.m21343b();
        User curUser = C6861a.m21337f().getCurUser();
        if ("mobile".equalsIgnoreCase(bundle.getString("platform")) || curUser == null || b == null || curUser.isPhoneBinded() || !C7213d.m22500a().mo18803bo().isBindPhoneAfterThirdPartyLogin() || C43122ff.m136767b()) {
            C22731a.m75106b(bundle);
            return;
        }
        C6907h.m21524a("phone_bundling_click", (Map) C22984d.m75611a().mo59973a("enter_from", "log_in").f60753a);
        C6861a.m21335d().keepCallback().bindMobile(b, "third_party_login", null, new C21083g() {
            /* renamed from: a */
            public final void mo56868a(int i, int i2, Object obj) {
                C22731a.m75106b(bundle);
            }
        });
    }

    public void pushOrNoticeShowLinkAccountDialog(C0608j jVar, String str) {
        if (C21115b.m71197a().isLogin() && !C43122ff.m136767b() && ((C21115b.m71197a().getCurUser().isHasEmail() || C21115b.m71197a().getCurUser().isPhoneBinded()) && C7213d.m22500a().mo18724R() && !C6861a.m21335d().hasPlatformBound())) {
            showLinkAccountDialog(jVar, str, null);
        }
    }

    public void checkForUpdate(Activity activity, boolean z, String str) {
        C37543ad.m120267a(activity, z, str);
    }

    public void jumpToH5(String str, Context context, Intent intent) {
        C33633c.m108532a(str, context, intent);
    }

    public void showLinkAccountDialog(C0608j jVar, String str, C36403cq cqVar) {
        MusLinkAccountDialog musLinkAccountDialog = new MusLinkAccountDialog();
        musLinkAccountDialog.f94770a = cqVar;
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        musLinkAccountDialog.setArguments(bundle);
        musLinkAccountDialog.show(jVar, "MusLinkAccountDialog");
    }

    public void startAuthNativeActivity(Context context, Bundle bundle, AuthClickCallBackWeb authClickCallBackWeb) {
        Intent intent = new Intent();
        intent.setClass(context, AwemeAuthorizedActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
        C34653a.m111948a(authClickCallBackWeb);
    }

    public void startThirdSocialActivity(Context context, User user, int i) {
        switch (i) {
            case 1:
                C37991as.m121305a(context, user.getInsId());
                return;
            case 2:
                C37991as.m121306b(context, user.getYoutubeChannelId());
                break;
            case 3:
                C37991as.m121307c(context, user.getTwitterId());
                return;
        }
    }

    public void openAgreement(Activity activity, String str, boolean z, String str2) {
        CommunityAgreementActivity.m88226a(activity, str, z, str2);
    }

    public void onReturnThirdPlatformFailed(Activity activity, ShareContext shareContext, String str, int i) {
        if (activity == null) {
            activity = C6405d.m19984g();
        }
        new C34685e(activity, shareContext).mo88009a(str, i);
    }

    public Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2) {
        return IAddFriendsActivity.m98617a(context, i, i2, str);
    }

    public void bindUserTermsOfPrivacy(Context context, TextView textView, final OnClickListener onClickListener, final OnClickListener onClickListener2, boolean z) {
        int i;
        if (!z) {
            textView.setPadding((int) C9738o.m28708b(context, 22.0f), 0, (int) C9738o.m28708b(context, 22.0f), 0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        sb.append(C23481i.m77091b(R.string.cf0));
        sb.append(" ");
        String sb2 = sb.toString();
        String b = C23481i.m77091b(R.string.cf1);
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(C23481i.m77091b(R.string.cf2));
        sb3.append(" ");
        String sb4 = sb3.toString();
        String b2 = C23481i.m77091b(R.string.cf3);
        spannableStringBuilder.append(sb2).append(b).append(sb4).append(b2);
        int color = context.getResources().getColor(R.color.a4p);
        Resources resources = context.getResources();
        if (C6399b.m19946v()) {
            i = R.color.y3;
        } else {
            i = R.color.abr;
        }
        int color2 = resources.getColor(i);
        C304252 r5 = new C22367e(color, color2) {
            public final void onClick(View view) {
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        };
        C304263 r9 = new C22367e(color, color2) {
            public final void onClick(View view) {
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        };
        spannableStringBuilder.setSpan(r5, sb2.length(), sb2.length() + b.length(), 34);
        spannableStringBuilder.setSpan(r9, sb2.length() + b.length() + sb4.length(), sb2.length() + b.length() + sb4.length() + b2.length(), 34);
        textView.setHighlightColor(C23481i.m77088a(17170445));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C23808t.m78017a());
    }

    public C36340al createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        if (C7213d.m22500a().mo18789ba()) {
            return JediMTAwemeListFragment.m115886b(i, i2, str, str2, z, z2);
        }
        return MTAwemeListFragment.m116663a(i, i2, str, z, new Bundle());
    }
}
