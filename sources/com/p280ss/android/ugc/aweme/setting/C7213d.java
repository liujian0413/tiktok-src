package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.dataplatform.C6324d;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.p293di.push.C6804a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.experiment.PeopleInterestdInExperimentMT;
import com.p280ss.android.ugc.aweme.experiment.ProfileCollectionTabExperiment;
import com.p280ss.android.ugc.aweme.experiment.ProfileCollectionTabNewStyleExperiment;
import com.p280ss.android.ugc.aweme.experiment.TiktokDiscoveryPageExperiment;
import com.p280ss.android.ugc.aweme.feed.guide.C6915f;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7164b;
import com.p280ss.android.ugc.aweme.setting.C7208as.C7209a;
import com.p280ss.android.ugc.aweme.setting.api.AbTestApi;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.p280ss.android.ugc.aweme.setting.p337ui.C7216i;
import com.p280ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p280ss.android.ugc.aweme.video.local.C7277g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.setting.d */
public class C7213d implements C7209a, C7218y {

    /* renamed from: a */
    private static final AbTestModel f20157a = new AbTestModel();

    /* renamed from: b */
    private static volatile C7213d f20158b;

    /* renamed from: c */
    private Integer f20159c;

    /* renamed from: d */
    private Integer f20160d;

    /* renamed from: e */
    private Boolean f20161e;

    /* renamed from: f */
    private Boolean f20162f;

    /* renamed from: g */
    private Boolean f20163g;

    /* renamed from: h */
    private Boolean f20164h;

    /* renamed from: i */
    private volatile AbTestModel f20165i;

    /* renamed from: j */
    private LocalAbTestModel f20166j;

    /* renamed from: k */
    private Boolean f20167k;

    /* renamed from: l */
    private Boolean f20168l;

    /* renamed from: m */
    private Integer f20169m;

    /* renamed from: n */
    private Integer f20170n;

    /* renamed from: o */
    private Integer f20171o;

    /* renamed from: p */
    private Integer f20172p;

    /* renamed from: q */
    private Boolean f20173q;

    /* renamed from: r */
    private Integer f20174r;

    /* renamed from: s */
    private Integer f20175s;

    /* renamed from: t */
    private C6308d<C7217x> f20176t = new C6308d<>();

    /* renamed from: bp */
    private void m22504bp() {
        C7277g.m22828a(this.f20165i.useSurfaceView);
    }

    /* renamed from: bq */
    private static Context m22505bq() {
        return C6399b.m19921a();
    }

    /* renamed from: aN */
    public final boolean mo18751aN() {
        return mo18803bo().isLazyFragmentPager;
    }

    /* renamed from: aO */
    public final boolean mo18752aO() {
        return mo18803bo().disableAsyncAccountOnChange;
    }

    /* renamed from: b */
    public final void mo18707b() {
        m22508c();
        C6324d.m19638b();
    }

    /* renamed from: A */
    public final boolean mo18708A() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.isFacebookShareLinkEnable) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final int mo18709B() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.visibleGoods;
    }

    /* renamed from: C */
    public final boolean mo18710C() {
        if (mo18803bo().showLoginDialogWhenClickPublishTab == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final int mo18711D() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.recNum;
    }

    /* renamed from: E */
    public final boolean mo18712E() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.openCommentFilter;
    }

    /* renamed from: F */
    public final boolean mo18713F() {
        if (m22507bs() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean mo18715H() {
        AbTestModel d = mo18803bo();
        if (d != null && d.outAppShareDirect == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final boolean mo18716I() {
        AbTestModel d = mo18803bo();
        if (d != null && d.imQrcodeShareDirect == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final int mo18717J() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.useLiveWallpaper;
    }

    /* renamed from: L */
    public final int mo18719L() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 21;
        }
        return d.bindPhoneForPostAweme;
    }

    /* renamed from: M */
    public final boolean mo18720M() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.blockV1;
    }

    /* renamed from: N */
    public final boolean mo18721N() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.blockV3DoubleSend;
    }

    /* renamed from: P */
    public final int mo18723P() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 10;
        }
        return d.bindPhoneForIm;
    }

    /* renamed from: R */
    public final boolean mo18724R() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.isFtcBindEnable();
    }

    /* renamed from: S */
    public final int mo18725S() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return -1;
        }
        return d.bindFGGuideTextIndex;
    }

    /* renamed from: T */
    public final int mo18726T() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 1;
        }
        return d.userFollowingListSortType;
    }

    /* renamed from: U */
    public final boolean mo18727U() {
        AbTestModel d = mo18803bo();
        if (d != null && d.hotSpotUseUv == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final int mo18728V() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.mtGuessWordStyle;
    }

    /* renamed from: W */
    public final boolean mo18729W() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.isSearchFragmentReactNative;
    }

    /* renamed from: X */
    public final boolean mo18730X() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.isSearchMixFeedStyle;
    }

    /* renamed from: Y */
    public final boolean mo18731Y() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.isEffectLikeShow();
    }

    /* renamed from: Z */
    public final int mo18732Z() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.getFindFascinatingMode();
    }

    /* renamed from: aA */
    public final boolean mo18738aA() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.getPhoneChangeEnable()) {
            return false;
        }
        return true;
    }

    /* renamed from: aB */
    public final boolean mo18739aB() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.splashVideoTransit) {
            return false;
        }
        return true;
    }

    /* renamed from: aC */
    public final int mo18740aC() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 1;
        }
        return d.showAds;
    }

    /* renamed from: aD */
    public final String mo18741aD() {
        AbTestModel d = mo18803bo();
        if (d != null) {
            return d.feedbackHost;
        }
        return "";
    }

    /* renamed from: aE */
    public final boolean mo18742aE() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.privacyReminder;
    }

    /* renamed from: aF */
    public final boolean mo18743aF() {
        AbTestModel d = mo18803bo();
        if (d == null || d.enableTransitionToProfileGuid == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: aG */
    public final boolean mo18744aG() {
        AbTestModel d = mo18803bo();
        if (d == null || d.enableLongPressGuid == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: aH */
    public final boolean mo18745aH() {
        AbTestModel d = mo18803bo();
        if (d != null && d.enableNewUserDetailShareIcon == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: aI */
    public final int mo18746aI() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.profileFollowRelationStyle;
    }

    /* renamed from: aJ */
    public final boolean mo18747aJ() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.enableVerifyUserRecommendReason;
    }

    /* renamed from: aL */
    public final String mo18749aL() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return "";
        }
        return d.loginDeviceManagerUrl;
    }

    /* renamed from: aM */
    public final boolean mo18750aM() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.awemeSplashFirstLaunchEnabled;
    }

    /* renamed from: aP */
    public final boolean mo18753aP() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.commentReplyGroupedByConversation();
    }

    /* renamed from: aQ */
    public final boolean mo18754aQ() {
        AbTestModel d = mo18803bo();
        if (d != null && d.groupChatSwitch == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: aS */
    public final boolean mo18756aS() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.showNewAddFriendsIcon;
    }

    /* renamed from: aT */
    public final int mo18757aT() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 3;
        }
        return d.recommendContactPosition - 1;
    }

    /* renamed from: aU */
    public final int mo18758aU() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.imInnerPushOpen;
    }

    /* renamed from: aW */
    public final boolean mo18759aW() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.enableConcernLiveSlide;
    }

    /* renamed from: aX */
    public final boolean mo18760aX() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.awesomeSplashInitProfileDelayDisable;
    }

    /* renamed from: aY */
    public final int mo18761aY() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.userProfileInitMethod;
    }

    /* renamed from: aZ */
    public final boolean mo18762aZ() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.enableProfileNotifyMethod;
    }

    /* renamed from: aa */
    public final boolean mo18763aa() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.showGDPRDialog;
    }

    /* renamed from: ab */
    public final boolean mo18764ab() {
        AbTestModel d = mo18803bo();
        if (d != null) {
            return d.isShowVideoMix;
        }
        return false;
    }

    /* renamed from: ad */
    public final int mo18766ad() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.spotListStyle;
    }

    /* renamed from: ae */
    public final int mo18767ae() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.hotLiveEnterNewStyle;
    }

    /* renamed from: af */
    public final boolean mo18768af() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.skyLightRecommendLive;
    }

    /* renamed from: ag */
    public final int mo18769ag() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.underageProtect;
    }

    /* renamed from: ah */
    public final boolean mo18770ah() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.remindSystemPush;
    }

    /* renamed from: aj */
    public final boolean mo18772aj() {
        AbTestModel d = mo18803bo();
        if (d != null && d.imFansVsStyle == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: ak */
    public final boolean mo18773ak() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.i18nReplyBuildingStyle;
    }

    /* renamed from: al */
    public final boolean mo18774al() {
        AbTestModel d = mo18803bo();
        if (d == null || d.enableTeenagerModeNew == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: am */
    public final int mo18775am() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.deeplinkRetargetEnable;
    }

    /* renamed from: an */
    public final boolean mo18776an() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.isShowSayHelloMsg;
    }

    /* renamed from: ao */
    public final int mo18777ao() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.profileNavbarShareStyle;
    }

    /* renamed from: ap */
    public final boolean mo18778ap() {
        int i;
        AbTestModel d = mo18803bo();
        if (d != null) {
            i = d.dongtaiStrategy;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: ar */
    public final boolean mo18779ar() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.isInstagramShareShowToastTip()) {
            return false;
        }
        return true;
    }

    /* renamed from: as */
    public final boolean mo18780as() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.isInstagramShareShowDialogTip()) {
            return false;
        }
        return true;
    }

    /* renamed from: at */
    public final int mo18781at() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 4;
        }
        return d.searchEggMaxWaitToShowTime;
    }

    /* renamed from: au */
    public final boolean mo18782au() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.isMonitorFrescoImageLoading;
    }

    /* renamed from: av */
    public final boolean mo18783av() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.isReplaceAwemeManagerWithLRUCache;
    }

    /* renamed from: aw */
    public final boolean mo18784aw() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.isContainsKeyWithLruEntries;
    }

    /* renamed from: ax */
    public final int mo18785ax() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.showRemarkIconStyle;
    }

    /* renamed from: ay */
    public final boolean mo18786ay() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.isFollowListRecommand()) {
            return false;
        }
        return true;
    }

    /* renamed from: az */
    public final boolean mo18787az() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.isEnableALogUpload) {
            return false;
        }
        return true;
    }

    /* renamed from: ba */
    public final boolean mo18789ba() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.useJediAwemelistFragment;
    }

    /* renamed from: bb */
    public final boolean mo18790bb() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.enableSymphonySdk;
    }

    /* renamed from: bc */
    public final boolean mo18791bc() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.enableNormalSplashAdAb;
    }

    /* renamed from: bg */
    public final boolean mo18795bg() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.commerceSplashOptimizeEnable;
    }

    /* renamed from: bh */
    public final int mo18796bh() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.normalSplashAdDelayMillis;
    }

    /* renamed from: bi */
    public final int mo18797bi() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.awesomeSplashAdDelayMillis;
    }

    /* renamed from: bj */
    public final int mo18798bj() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.publishPrivacySettingStyle;
    }

    /* renamed from: bk */
    public final boolean mo18799bk() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return true;
        }
        return d.mainUseFragmentsCache;
    }

    /* renamed from: bl */
    public final boolean mo18800bl() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.feedAdAsyncLog;
    }

    /* renamed from: bm */
    public final boolean mo18801bm() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.commonVideoOptimize;
    }

    /* renamed from: bn */
    public final boolean mo18802bn() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.enableTrackerSDK;
    }

    /* renamed from: f */
    public final int mo18806f() {
        if (mo18803bo() != null) {
            return mo18803bo().newProfileLiveAvatarAnimation;
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo18810j() {
        AbTestModel d = mo18803bo();
        if (C6399b.m19944t()) {
            return 0;
        }
        return d.profileRecommendUserUnreadStrategy;
    }

    /* renamed from: q */
    public final boolean mo18817q() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.starAtlasCooperationEntryOpen;
    }

    /* renamed from: r */
    public final boolean mo18818r() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.enableFriendsEnhanceFollowBack;
    }

    /* renamed from: s */
    public final boolean mo18819s() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.enableLeadShareAfterDownload) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo18822v() {
        AbTestModel d = mo18803bo();
        if (d != null && d.commentSupportGifEmoji == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo18825y() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.enableFollowTabRecommendUser) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean mo18826z() {
        AbTestModel d = mo18803bo();
        if (d == null || !d.isFacebookStoryEnable) {
            return false;
        }
        return true;
    }

    public C7213d() {
        C7208as.m22479a().mo18703a(3, (C7209a) this);
    }

    /* renamed from: Q */
    public static boolean m22499Q() {
        AbTestModel d = m22500a().mo18803bo();
        if (d != null) {
            return d.showReportButton();
        }
        return false;
    }

    /* renamed from: a */
    public static C7213d m22500a() {
        if (f20158b == null) {
            synchronized (C7213d.class) {
                if (f20158b == null) {
                    f20158b = new C7213d();
                }
            }
        }
        return f20158b;
    }

    /* renamed from: aV */
    public static int m22501aV() {
        return C6384b.m19835a().mo15287a(TiktokDiscoveryPageExperiment.class, true, "tiktok_discovery_page", C6384b.m19835a().mo15295d().tiktok_discovery_page, 0);
    }

    /* renamed from: br */
    private static boolean m22506br() {
        if (!C7164b.m22364a() || !C7214e.m22629b().mo16909b(m22505bq(), "ENABLED", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: bs */
    private int m22507bs() {
        if (C6399b.m19944t()) {
            return 1;
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.replyStrategy;
    }

    /* renamed from: c */
    public static void m22508c() {
        boolean z;
        if (TextUtils.isEmpty(C6789d.m21080d()) || TextUtils.equals(C6789d.m21080d(), "0")) {
            z = false;
        } else {
            z = true;
        }
        AbTestApi.m22476a(z);
    }

    /* renamed from: G */
    public final boolean mo18714G() {
        if (!C6399b.m19944t()) {
            return false;
        }
        AbTestModel d = mo18803bo();
        if (d == null || !d.likeListDetail) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final int mo18718K() {
        if (C6399b.m19944t()) {
            return 0;
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            return 0;
        }
        return d.closeWeiboEntry;
    }

    /* renamed from: aK */
    public final boolean mo18748aK() {
        if (C6399b.m19944t()) {
            return false;
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.topviewFeedGapOptimizeEnabled;
    }

    /* renamed from: ai */
    public final boolean mo18771ai() {
        if (C6399b.m19944t()) {
            return false;
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        return d.miniEmojiPanelEnabled;
    }

    /* renamed from: bd */
    public final Integer mo18792bd() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20174r = Integer.valueOf(1);
        } else {
            this.f20174r = Integer.valueOf(d.oppoRedPointAppearModel);
        }
        return this.f20174r;
    }

    /* renamed from: be */
    public final Integer mo18793be() {
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20175s = Integer.valueOf(0);
        } else {
            this.f20175s = Integer.valueOf(d.oppoRedPointAppearAgainTimeInterval);
        }
        return this.f20175s;
    }

    /* renamed from: e */
    public final LocalAbTestModel mo18805e() {
        if (this.f20166j == null) {
            return (LocalAbTestModel) C7216i.m22633b().mo16895a(m22505bq(), "local_ab_test_model", LocalAbTestModel.class);
        }
        return this.f20166j;
    }

    /* renamed from: g */
    public final boolean mo18807g() {
        if (!C6399b.m19944t() && mo18803bo() != null) {
            return mo18803bo().enableCompanyProfilePageOptimize;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo18809i() {
        if (!C6399b.m19944t() && mo18803bo() != null && mo18803bo().userRecommendCardEnhance == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final int mo18816p() {
        this.f20170n = Integer.valueOf(0);
        AbTestModel d = mo18803bo();
        if (d != null) {
            this.f20170n = Integer.valueOf(d.xiGuaTaskPosition);
        }
        return this.f20170n.intValue();
    }

    /* renamed from: aq */
    public static boolean m22502aq() {
        int a = C6384b.m19835a().mo15287a(ProfileCollectionTabNewStyleExperiment.class, true, "use_profile_collection_tab_new_syle", C6384b.m19835a().mo15295d().use_profile_collection_tab_new_syle, 0);
        int a2 = C6384b.m19835a().mo15287a(ProfileCollectionTabExperiment.class, true, "use_profile_collection_tab", C6384b.m19835a().mo15295d().use_profile_collection_tab, 0);
        if (a == 1 || a == 2 || a2 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final boolean mo18722O() {
        AbTestModel d = mo18803bo();
        if (d != null && C6399b.m19944t() && d.isEnableMultiAccountLogin() && !C6861a.m21337f().isChildrenMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: aR */
    public final int mo18755aR() {
        if (!C6399b.m19944t()) {
            return 0;
        }
        if (this.f20172p == null) {
            AbTestModel d = mo18803bo();
            if (d == null) {
                this.f20172p = Integer.valueOf(0);
            } else {
                this.f20172p = Integer.valueOf(d.mtLocationPopupType);
            }
        }
        return this.f20172p.intValue();
    }

    /* renamed from: ac */
    public final int mo18765ac() {
        if (this.f20169m != null) {
            return this.f20169m.intValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20169m = Integer.valueOf(1);
        } else {
            this.f20169m = Integer.valueOf(d.followFeedLiveType);
        }
        return this.f20169m.intValue();
    }

    /* renamed from: bf */
    public final boolean mo18794bf() {
        if (this.f20173q != null) {
            return this.f20173q.booleanValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20173q = Boolean.valueOf(false);
        } else {
            this.f20173q = Boolean.valueOf(d.geckoPerformanceState);
        }
        return this.f20173q.booleanValue();
    }

    /* renamed from: h */
    public final boolean mo18808h() {
        if (!C6399b.m19944t()) {
            if (mo18803bo() == null || mo18803bo().userRecommend == 1) {
                return true;
            }
            return false;
        } else if (C6384b.m19835a().mo15287a(PeopleInterestdInExperimentMT.class, true, "other_page_recommend_users", C6384b.m19835a().mo15295d().other_page_recommend_users, 0) == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo18811k() {
        if (this.f20162f != null) {
            return this.f20162f.booleanValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20162f = Boolean.valueOf(false);
            return this.f20162f.booleanValue();
        }
        this.f20162f = Boolean.valueOf(d.isUseFrescoFastImage);
        return this.f20162f.booleanValue();
    }

    /* renamed from: l */
    public final boolean mo18812l() {
        if (this.f20163g != null) {
            return this.f20163g.booleanValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20163g = Boolean.valueOf(false);
            return this.f20163g.booleanValue();
        }
        this.f20163g = Boolean.valueOf(d.isTTNetInterceptWebview);
        return this.f20163g.booleanValue();
    }

    /* renamed from: m */
    public final boolean mo18813m() {
        if (this.f20164h != null) {
            return this.f20164h.booleanValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20164h = Boolean.valueOf(false);
            return this.f20164h.booleanValue();
        }
        this.f20164h = Boolean.valueOf(d.isTTNetInterceptAll);
        return this.f20164h.booleanValue();
    }

    /* renamed from: n */
    public final boolean mo18814n() {
        if (this.f20161e != null) {
            return this.f20161e.booleanValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20161e = Boolean.valueOf(true);
            return this.f20161e.booleanValue();
        }
        this.f20161e = Boolean.valueOf(d.isUseCookieSync);
        return this.f20161e.booleanValue();
    }

    /* renamed from: o */
    public final int mo18815o() {
        if (this.f20171o != null) {
            return this.f20171o.intValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20171o = Integer.valueOf(0);
            return this.f20171o.intValue();
        }
        this.f20171o = Integer.valueOf(d.isShowLongVideoOperation);
        return this.f20171o.intValue();
    }

    /* renamed from: t */
    public final int mo18820t() {
        if (this.f20159c != null) {
            return this.f20159c.intValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20159c = Integer.valueOf(1);
        } else {
            this.f20159c = Integer.valueOf(d.showPushPrePermissionViewMaxTimes);
        }
        if (this.f20159c.intValue() <= 0) {
            this.f20159c = Integer.valueOf(1);
        }
        return this.f20159c.intValue();
    }

    /* renamed from: u */
    public final int mo18821u() {
        if (this.f20160d != null) {
            return this.f20160d.intValue();
        }
        AbTestModel d = mo18803bo();
        if (d == null) {
            this.f20160d = Integer.valueOf(0);
        } else {
            this.f20160d = Integer.valueOf(d.showPushPrePermissionViewInterval);
        }
        return this.f20160d.intValue();
    }

    /* renamed from: w */
    public final boolean mo18823w() {
        if (this.f20167k != null) {
            return this.f20167k.booleanValue();
        }
        AbTestModel d = mo18803bo();
        if (d != null) {
            this.f20167k = Boolean.valueOf(d.isShareDialogShowForward());
            return this.f20167k.booleanValue();
        }
        this.f20167k = Boolean.valueOf(false);
        return false;
    }

    /* renamed from: x */
    public final boolean mo18824x() {
        if (this.f20168l != null) {
            return this.f20168l.booleanValue();
        }
        AbTestModel d = mo18803bo();
        if (d != null) {
            this.f20168l = Boolean.valueOf(d.isBigselfIntroduce);
            return this.f20168l.booleanValue();
        }
        this.f20168l = Boolean.valueOf(false);
        return false;
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.ab.a.b(java.lang.String, boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e().mo16827b("method_ab_init_duration", false);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.setting.model.AbTestModel mo18803bo() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r6.f20165i
            if (r0 != 0) goto L_0x00a0
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 != r1) goto L_0x0018
            com.ss.android.ugc.aweme.ab.a r0 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r1 = "method_ab_init_duration"
            r0.mo16822a(r1, r2)
        L_0x0018:
            monitor-enter(r6)
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r6.f20165i     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0088
            r0 = 0
            boolean r1 = m22506br()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.setting.e r0 = com.p280ss.android.ugc.aweme.setting.C7214e.m22629b()     // Catch:{ all -> 0x009d }
            android.content.Context r1 = m22505bq()     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "ab_test_model"
            java.lang.Class<com.ss.android.ugc.aweme.setting.model.AbTestModel> r4 = com.p280ss.android.ugc.aweme.setting.model.AbTestModel.class
            java.lang.Object r0 = r0.mo16895a(r1, r3, r4)     // Catch:{ all -> 0x009d }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = (com.p280ss.android.ugc.aweme.setting.model.AbTestModel) r0     // Catch:{ all -> 0x009d }
        L_0x0036:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19928c()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.setting.f r1 = com.p280ss.android.ugc.aweme.setting.C7215f.m22631b()     // Catch:{ all -> 0x009d }
            android.content.Context r3 = m22505bq()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = "ab_test_model_jsonobject"
            java.lang.Class<com.google.gson.m> r5 = com.google.gson.C6711m.class
            java.lang.Object r1 = r1.mo16895a(r3, r4, r5)     // Catch:{ all -> 0x009d }
            com.google.gson.m r1 = (com.google.gson.C6711m) r1     // Catch:{ all -> 0x009d }
            com.p280ss.android.ugc.aweme.setting.C7211b.m22489a(r1)     // Catch:{ all -> 0x009d }
        L_0x0051:
            if (r0 != 0) goto L_0x0065
            com.ss.android.ugc.aweme.setting.f r0 = com.p280ss.android.ugc.aweme.setting.C7215f.m22631b()     // Catch:{ all -> 0x009d }
            android.content.Context r1 = m22505bq()     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "ab_test_model"
            java.lang.Class<com.ss.android.ugc.aweme.setting.model.AbTestModel> r4 = com.p280ss.android.ugc.aweme.setting.model.AbTestModel.class
            java.lang.Object r0 = r0.mo16895a(r1, r3, r4)     // Catch:{ all -> 0x009d }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = (com.p280ss.android.ugc.aweme.setting.model.AbTestModel) r0     // Catch:{ all -> 0x009d }
        L_0x0065:
            r6.f20165i = r0     // Catch:{ all -> 0x009d }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r6.f20165i     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x006f
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = f20157a     // Catch:{ all -> 0x009d }
            r6.f20165i = r0     // Catch:{ all -> 0x009d }
        L_0x006f:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r6.f20165i     // Catch:{ all -> 0x009d }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x009d }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x009d }
            if (r0 != r1) goto L_0x0084
            com.ss.android.ugc.aweme.ab.a r0 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()     // Catch:{ all -> 0x009d }
            java.lang.String r1 = "method_ab_init_duration"
            r0.mo16827b(r1, r2)     // Catch:{ all -> 0x009d }
        L_0x0084:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r6.f20165i     // Catch:{ all -> 0x009d }
            monitor-exit(r6)     // Catch:{ all -> 0x009d }
            return r0
        L_0x0088:
            monitor-exit(r6)     // Catch:{ all -> 0x009d }
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x00a0
            com.ss.android.ugc.aweme.ab.a r0 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r1 = "method_ab_init_duration"
            r0.mo16827b(r1, r2)
            goto L_0x00a0
        L_0x009d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x009d }
            throw r0
        L_0x00a0:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r6.f20165i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.C7213d.mo18803bo():com.ss.android.ugc.aweme.setting.model.AbTestModel");
    }

    /* renamed from: a */
    public final void mo18734a(LocalAbTestModel localAbTestModel) {
        this.f20166j = localAbTestModel;
    }

    /* renamed from: a */
    public final void mo18735a(C7217x xVar) {
        this.f20176t.mo15143a(xVar);
    }

    /* renamed from: b */
    public final void mo18788b(C7217x xVar) {
        this.f20176t.mo15144b(xVar);
    }

    /* renamed from: b */
    private void m22503b(AbTestModel abTestModel) {
        if (this.f20165i == f20157a) {
            synchronized (this) {
                if (this.f20165i == f20157a) {
                    this.f20165i = abTestModel;
                }
            }
        }
    }

    /* renamed from: a */
    public final C7213d mo18733a(AbTestModel abTestModel) {
        C7215f.m22631b().mo16907b((Context) AwemeApplication.m21341a(), "ab_test_model", (Object) abTestModel);
        if (!m22506br()) {
            this.f20165i = abTestModel;
        }
        m22504bp();
        if (abTestModel != null) {
            m22503b(abTestModel);
            C6887b.m21436b().mo16901a((Context) AwemeApplication.m21341a(), "last_ab_setting_version", abTestModel.settingsVersion);
        }
        return this;
    }

    /* renamed from: a */
    public final boolean mo18737a(int i) {
        AbTestModel d = mo18803bo();
        if (d == null) {
            return false;
        }
        switch (d.showKeyboardStrategy) {
            case 1:
                if (i == 0) {
                    return true;
                }
                break;
            case 2:
                if (i < 3) {
                    return true;
                }
                break;
            case 3:
                if (i < 5) {
                    return true;
                }
                break;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo18736a(boolean z, boolean z2) {
        C7208as.m22479a().mo18704a(3, z);
        if (z) {
            if (z2) {
                C6915f.f19589a = true;
            }
            VideoBitRateABManager.m22786c().mo19003d();
            try {
                Iterator it = this.f20176t.iterator();
                while (it.hasNext()) {
                    C7217x xVar = (C7217x) it.next();
                    if (xVar != null) {
                        xVar.onChanged();
                    }
                }
            } catch (ConcurrentModificationException unused) {
            }
            C6804a.m21138a().initNotificationChannel();
            if (C6399b.m19944t()) {
                C6804a.m21138a().initPushAccountService(C6861a.m21337f().isLogin());
            }
        }
    }
}
