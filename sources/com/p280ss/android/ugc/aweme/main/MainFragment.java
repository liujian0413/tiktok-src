package com.p280ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.audio.C23095b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.CustomInterceptTouchEventFrameLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.FlippableViewPager;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.captcha.C23627a;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25060e;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25156h;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.experiment.C27689c;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.BaseCellFeedFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.BaseFeedListFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedTimeLineFragment;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.festival.christmas.FestivalHomePageView;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.data.C30245a;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.C30280e;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.C30283g;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.MainPagerAdapter;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.PreDrawableInflate;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip.C30311b;
import com.p280ss.android.ugc.aweme.language.C32325g;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.C32326h.C32327a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.login.p1371a.C32645a;
import com.p280ss.android.ugc.aweme.main.experiment.C33002a;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p280ss.android.ugc.aweme.main.guide.C33045d;
import com.p280ss.android.ugc.aweme.main.p1382d.C32954c;
import com.p280ss.android.ugc.aweme.main.p1382d.C32955d;
import com.p280ss.android.ugc.aweme.main.p1384f.C33009a;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.metrics.C33258c;
import com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.p1042as.C23089a.C23090a;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42695c;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.qrcode.C37067d;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnGetRecoverDraftCallback;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39327e;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41700j;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42970bd;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;
import kotlin.Triple;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.main.MainFragment */
public class MainFragment extends AmeBaseFragment implements C30311b, C33055k {

    /* renamed from: A */
    private boolean f85659A = false;

    /* renamed from: e */
    public int f85660e = 1;

    /* renamed from: f */
    AnimationImageView f85661f;

    /* renamed from: g */
    ImageView f85662g;

    /* renamed from: h */
    ImageView f85663h;

    /* renamed from: i */
    FestivalHomePageView f85664i;

    /* renamed from: j */
    public C41700j f85665j;

    /* renamed from: k */
    MainPagerAdapter f85666k;

    /* renamed from: l */
    public boolean f85667l;

    /* renamed from: m */
    protected C38267a f85668m;
    ViewGroup mFlContainerStoryPanel;
    CustomInterceptTouchEventFrameLayout mFlContentContainer;
    ViewGroup mFlRootContainer;
    MainTabStrip mPagerTabStrip;
    FrameLayout mRlTabContainer;
    View mStatusBarView;
    SwipeRefreshLayout mSwipeRefreshLayoutWhenStoryOpen;
    ViewStub mTeenagerModeTitleBarStub;
    LinearLayout mTitleBarContainer;
    ImageView mTitleShadow;
    View mVTabBg;
    FlippableViewPager mViewPager;
    ViewStub mVolumeBtnStub;
    ViewStub mXmasTreeViewStub;

    /* renamed from: n */
    public C30245a f85669n;

    /* renamed from: o */
    public ScrollSwitchStateManager f85670o;

    /* renamed from: p */
    boolean f85671p = false;

    /* renamed from: q */
    public boolean f85672q = false;

    /* renamed from: r */
    private C32838a f85673r = new C32838a(this);

    /* renamed from: s */
    private C23095b f85674s;

    /* renamed from: t */
    private C30280e f85675t = new C30280e();

    /* renamed from: u */
    private HomePageDataViewModel f85676u;

    /* renamed from: v */
    private boolean f85677v = false;

    /* renamed from: w */
    private boolean f85678w = false;

    /* renamed from: x */
    private FeedRecommendFragment f85679x;

    /* renamed from: y */
    private C23627a f85680y;

    /* renamed from: z */
    private boolean f85681z = false;

    /* renamed from: com.ss.android.ugc.aweme.main.MainFragment$MobDotTask */
    class MobDotTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private MobDotTask() {
        }

        public void run(Context context) {
            MainFragment.m106237a("follow_notice_show", "yellow_dot");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainFragment$SendDotShowEventTask */
    class SendDotShowEventTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private SendDotShowEventTask() {
        }

        public void run(Context context) {
            C42970bd.m136412a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainFragment$a */
    static class C32838a extends C32998dr<MainFragment> {
        C32838a(MainFragment mainFragment) {
            super(mainFragment);
        }

        /* renamed from: a */
        private static void m106294a(MainFragment mainFragment) {
            if (mainFragment != null) {
                mainFragment.mo84463l();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo84484a(Object obj) {
            m106294a((MainFragment) obj);
        }
    }

    /* renamed from: z */
    private static String m106260z() {
        return "homepage_fresh";
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: e */
    public final C30245a mo84457e() {
        return this.f85669n;
    }

    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84444a(Triple triple) {
        if (((Integer) triple.getThird()).intValue() != 0) {
            this.f85660e = 2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84443a(Integer num) {
        int i = this.f85676u.f79572k;
        this.f85676u.f79572k = num.intValue();
        if (MainTabStripSwipeSwitchExperiment.INSTANCE.getEnableSwipeMode() && this.f85660e == 2) {
            C32960dc.m106543k(false);
            m106240b(i, num.intValue());
            m106233a(num.intValue(), 2);
        }
        FeedFragment feedFragment = null;
        if (MainTabStripSwipeSwitchExperiment.INSTANCE.getEnableSwipeMode()) {
            Fragment f = m106247f(num.intValue());
            if (f instanceof FeedFragment) {
                feedFragment = (FeedFragment) f;
            }
        } else {
            Fragment a = this.f85666k.mo79773a();
            if (a instanceof FeedFragment) {
                feedFragment = (FeedFragment) a;
            }
        }
        if (feedFragment != null) {
            if (num.intValue() <= 1 && (feedFragment instanceof BaseFeedListFragment)) {
                feedFragment.mo73814c(false);
                if (num.intValue() == 0 && this.f85667l) {
                    feedFragment.mo73772d_(false);
                    this.f85667l = false;
                }
            } else if (num.intValue() == 2 || (feedFragment instanceof BaseCellFeedFragment)) {
                feedFragment.mo73814c(false);
            }
            if (num.intValue() == 0 && (feedFragment instanceof FeedFollowFragment)) {
                m106223B();
                if (this.mPagerTabStrip.mo79829f()) {
                    m106237a("follow_notice_dis", "yellow_dot");
                }
                C28580o.m93830a(PAGE.FOLLOW);
            }
            this.f85678w = feedFragment instanceof FeedRecommendFragment;
            if (this.f85678w && this.f85679x == null) {
                this.f85679x = (FeedRecommendFragment) feedFragment;
            }
            if (this.f85663h != null) {
                this.f85663h.setVisibility(this.f85678w && this.f85677v ? 0 : 4);
            }
            if (feedFragment instanceof BaseFeedListFragment) {
                ((BaseFeedListFragment) feedFragment).mo73776m();
            }
            if (feedFragment instanceof FeedTimeLineFragment) {
                this.mVTabBg.setVisibility(0);
            } else {
                this.mVTabBg.setVisibility(4);
            }
            if (this.f85678w) {
                C28580o.m93830a(PAGE.FEED);
            }
        }
        this.f85660e = 1;
    }

    /* renamed from: a */
    public final boolean mo79847a(int i) {
        FeedFragment feedFragment = (FeedFragment) this.f85666k.mo79773a();
        if (feedFragment == null) {
            return false;
        }
        this.f85660e = 1;
        if (this.f85668m != null && this.f85668m.mo95909h()) {
            return true;
        }
        if (this.mViewPager.getCurrentItemCompat() != i) {
            if (i == 0) {
                m106233a(i, 1);
                if (!MainTabStripSwipeSwitchExperiment.INSTANCE.getEnableSwipeMode() && !C27689c.m90842b() && m106239a("click_follow_tab")) {
                    return true;
                }
            }
            if (i == 1) {
                m106233a(i, 1);
            }
            feedFragment.mo73815d(false);
            m106244e(i);
            m106243d(i);
            m106242c(i);
            if (i == 2) {
                C23090a.f60960b = "toplist_homepage_fresh";
                C6857a.m21312e().mo16818a();
                C6857a.m21312e().mo16824b();
            } else if (i == 1) {
                C23090a.f60960b = "toplist_homepage_hot";
            } else {
                C6857a.m21312e().mo16818a();
                C6857a.m21312e().mo16824b();
                C23090a.f60960b = "toplist_homepage_hot";
            }
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null && mainActivity.isViewValid()) {
                if (i != 0) {
                    C33009a.m106661b(getActivity());
                } else {
                    C33009a.m106659a(getActivity());
                }
            }
            return false;
        }
        m106244e(i);
        if ((this.f85666k.mo79773a() instanceof FeedRecommendFragment) || (this.f85666k.mo79773a() instanceof FeedFollowFragment)) {
            C42961az.m136380a(new C42695c(2));
            mo84446a(false, "refresh");
        } else {
            mo84446a(false, "refresh");
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo84446a(boolean z, String str) {
        if (!(this.f85666k == null || this.mViewPager == null)) {
            FeedFragment feedFragment = (FeedFragment) this.f85666k.mo79773a();
            if (feedFragment != null) {
                switch (this.mViewPager.getCurrentItemCompat()) {
                    case 0:
                        m106223B();
                        C19282c.m63182a(getContext(), str, "homepage_follow");
                        break;
                    case 1:
                        C19282c.m63182a(getContext(), str, "homepage_hot");
                        if (C33003b.m106651a() && !C28344a.m93114e()) {
                            C6907h.m21524a("homepage_hot_click", (Map) C22984d.m75611a().mo59973a("click_method", "refresh").f60753a);
                            break;
                        }
                    case 2:
                        C19282c.m63182a(getContext(), str, m106260z());
                        if (C33003b.m106651a()) {
                            C6907h.m21524a("homepage_fresh_click", (Map) C22984d.m75611a().mo59973a("click_method", "refresh").f60753a);
                            break;
                        }
                        break;
                }
                return feedFragment.mo73772d_(z);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84441a(TextView textView, View view) {
        C32326h.m104875a((Activity) getActivity(), C32326h.m104885g(), (C32327a) new C32883as(this, textView));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84442a(TextView textView, String str) {
        if (getActivity() != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo84445a(boolean z) {
        if (z) {
            this.f85681z = true;
        }
        if (m106231K()) {
            this.f85664i.mo74596b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo84466o() {
        this.f85681z = true;
        mo84445a(true);
    }

    public void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
    }

    /* renamed from: G */
    private void m106227G() {
        if (C7163a.m22363a() || C32325g.m104870a()) {
            m106228H();
        }
    }

    /* renamed from: I */
    private Aweme m106229I() {
        return AwemeChangeCallBack.m106763a(getActivity());
    }

    /* renamed from: r */
    private void m106252r() {
        if (C43122ff.m136767b()) {
            this.mPagerTabStrip.mo79830g();
        }
    }

    /* renamed from: x */
    private void m106258x() {
        if (this.mPagerTabStrip != null) {
            this.mPagerTabStrip.mo79817a();
        }
    }

    /* renamed from: y */
    private void m106259y() {
        if (this.mPagerTabStrip != null) {
            this.mPagerTabStrip.mo79824b();
        }
    }

    /* renamed from: a */
    public final void mo84439a() {
        if (!this.f85681z && this.f85664i != null) {
            this.f85664i.mo74593a();
        }
    }

    /* renamed from: c */
    public final boolean mo84452c() {
        FlippableViewPager flippableViewPager = this.mViewPager;
        if (flippableViewPager == null || flippableViewPager.getCurrentItemCompat() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final FeedFragment mo84447b() {
        if (this.f85666k == null) {
            return null;
        }
        return (FeedFragment) this.f85666k.mo79773a();
    }

    /* renamed from: i */
    public final boolean mo84460i() {
        FeedFragment g = mo84447b();
        if (g == null) {
            return false;
        }
        return g instanceof FeedFollowFragment;
    }

    /* renamed from: l */
    public final void mo84463l() {
        C6726a.m20843a(this.f85673r, (int) C23486n.m77124a(2));
    }

    public void onDestroyView() {
        super.onDestroyView();
        C42961az.m136383d(this);
        if (this.f85674s != null) {
            this.f85674s.mo60176b();
        }
    }

    /* renamed from: B */
    private void m106223B() {
        this.mPagerTabStrip.setShowDot(false);
        if (C34315c.m110982b(5)) {
            C34315c.m110984c(5);
        }
    }

    /* renamed from: D */
    private static boolean m106224D() {
        return ((Boolean) SharePrefCache.inst().getIsChangeFollowTab().mo59877d()).booleanValue();
    }

    /* renamed from: F */
    private void m106226F() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).handleNav(this.mPagerTabStrip);
    }

    /* renamed from: J */
    private void m106230J() {
        if (this.f85664i != null) {
            File a = C29125d.m95518a();
            if (a != null) {
                this.f85664i.mo74595a(a);
                m106248f(true);
                return;
            }
            m106248f(false);
        }
    }

    /* renamed from: K */
    private boolean m106231K() {
        if (this.f85664i != null && this.f85664i.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private void m106232L() {
        this.f85674s = new C23095b(getActivity(), this.mVolumeBtnStub);
        this.f85674s.mo60172a(1, "homepage_hot");
    }

    /* renamed from: j */
    public final boolean mo84461j() {
        if (this.f85666k == null || this.mViewPager == null || this.mViewPager.getCurrentItemCompat() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo84462k() {
        if (this.f85666k != null) {
            FeedFragment feedFragment = (FeedFragment) this.f85666k.mo79773a();
            if (feedFragment != null) {
                feedFragment.mo73842u();
            }
        }
    }

    /* renamed from: m */
    public final void mo84464m() {
        Aweme I = m106229I();
        if (!this.f85672q && this.f85678w && I != null) {
            m106236a(I);
        }
    }

    /* renamed from: A */
    private void m106222A() {
        if (!this.mPagerTabStrip.mo79829f()) {
            if (C7213d.m22500a().mo18711D() == 0) {
                C7121a.m22248b().mo18559a(new MobDotTask()).mo18560a();
            }
            C7121a.m22248b().mo18559a(new SendDotShowEventTask()).mo18560a();
        }
        this.mPagerTabStrip.setShowDot(true);
    }

    /* renamed from: E */
    private void m106225E() {
        LayoutParams layoutParams = (LayoutParams) this.mTitleShadow.getLayoutParams();
        layoutParams.height = C10994a.m32204a(getContext()) + C23486n.m77122a(99.0d);
        this.mTitleShadow.setLayoutParams(layoutParams);
        this.mTitleShadow.setVisibility(0);
    }

    /* renamed from: q */
    private void m106251q() {
        if (TimeLockRuler.isRuleValid() && TimeLockRuler.isInTeenagerModeNewVersion()) {
            C23487o.m77146a(false, this.mRlTabContainer);
            C23487o.m77146a(true, this.mTeenagerModeTitleBarStub);
        }
    }

    /* renamed from: f */
    public final void mo84458f() {
        FeedFragment g = mo84447b();
        if (g != null && (g instanceof FeedRecommendFragment)) {
            g.f75689r = "press_back";
            g.mo73821p();
            C6907h.m21517a(getContext(), "click_back_fresh", "homepage_hot", 0, 0);
        }
    }

    /* renamed from: n */
    public final void mo84465n() {
        if (C29135b.m95582a()) {
            if (this.f85664i != null || this.mXmasTreeViewStub == null) {
                if (!m106231K()) {
                    m106230J();
                }
                return;
            }
            this.f85664i = (FestivalHomePageView) this.mXmasTreeViewStub.inflate();
            this.mXmasTreeViewStub = null;
            m106230J();
        }
    }

    public void onResume() {
        super.onResume();
        if (C33002a.m106650a() == 0 || C33002a.m106650a() == 1) {
            if (C34315c.m110982b(5)) {
                m106222A();
            } else {
                m106223B();
            }
        }
        if (this.f85671p && this.f85680y != null) {
            this.f85680y.accept(this);
            this.f85680y = null;
            this.f85671p = false;
        }
        if (this.f85674s != null) {
            this.f85674s.mo60171a();
        }
    }

    /* renamed from: H */
    private void m106228H() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            DmtTextView dmtTextView = new DmtTextView(activity);
            dmtTextView.setText(C32326h.m104885g());
            dmtTextView.setTextSize(16.0f);
            dmtTextView.setTextColor(-1);
            dmtTextView.setAlpha(0.6f);
            dmtTextView.setPadding(10, 10, 10, 10);
            dmtTextView.setBackgroundColor(Color.parseColor("#9915FA2C"));
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            layoutParams.rightMargin = (int) C9738o.m28708b((Context) activity, 60.0f);
            this.mRlTabContainer.addView(dmtTextView, layoutParams);
            dmtTextView.setOnClickListener(new C32886av(this, dmtTextView));
            dmtTextView.setOnLongClickListener(new C32887aw(this));
        }
    }

    /* renamed from: p */
    private void m106250p() {
        this.mSwipeRefreshLayoutWhenStoryOpen.setOnRefreshListener(new C23386b() {
            /* renamed from: a */
            public final void mo60744a() {
                FeedFragment feedFragment = (FeedFragment) MainFragment.this.f85666k.mo79773a();
                if (feedFragment != null) {
                    feedFragment.mo73772d_(false);
                }
            }
        });
        boolean z = false;
        this.mSwipeRefreshLayoutWhenStoryOpen.setEnabled(false);
        C32891b.m106468a().mo84616a(false);
        if (C33003b.m106651a() || C33002a.m106650a() == 2) {
            m106253s();
        }
        if (C37067d.m119194a().mo93525b().booleanValue()) {
            m106254t();
        }
        if (C6399b.m19947w()) {
            C7213d.m22500a();
            if (C7213d.m22499Q()) {
                z = true;
            }
        }
        this.f85677v = z;
        if (this.f85677v && this.f85678w) {
            m106255u();
        }
        m106252r();
        m106251q();
        mo84465n();
        m106232L();
    }

    /* renamed from: s */
    private void m106253s() {
        this.f85661f = new AnimationImageView(getContext());
        int a = C23486n.m77122a(9.0d);
        this.f85661f.setPadding(a, a, a, a);
        this.f85661f.setScaleType(ScaleType.CENTER_INSIDE);
        this.f85661f.setImageResource(R.drawable.a8r);
        LayoutParams layoutParams = new LayoutParams(C23486n.m77122a(55.0d), C23486n.m77122a(55.0d));
        layoutParams.setMargins(0, 0, C23486n.m77122a(6.0d), 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(C23486n.m77122a(6.0d));
        }
        layoutParams.gravity = 16;
        if (C33003b.m106651a()) {
            layoutParams.gravity |= 8388611;
        } else {
            layoutParams.gravity |= 8388613;
        }
        this.f85661f.setLayoutParams(layoutParams);
        this.mRlTabContainer.addView(this.f85661f);
        this.f85661f.setOnClickListener(new C32881aq(this));
    }

    /* renamed from: t */
    private void m106254t() {
        this.f85662g = new ImageView(getContext());
        int a = C23486n.m77122a(12.0d);
        this.f85662g.setPadding(a, a, a, a);
        this.f85662g.setImageResource(R.drawable.ala);
        LayoutParams layoutParams = new LayoutParams(C23486n.m77122a(44.0d), C23486n.m77122a(44.0d));
        layoutParams.gravity = 8388629;
        this.f85662g.setLayoutParams(layoutParams);
        this.mRlTabContainer.addView(this.f85662g);
        this.f85662g.setOnClickListener(new C32882ar(this));
    }

    /* renamed from: u */
    private void m106255u() {
        this.f85663h = new ImageView(getContext());
        this.f85663h.setScaleType(ScaleType.CENTER_INSIDE);
        this.f85663h.setImageResource(R.drawable.a8q);
        LayoutParams layoutParams = new LayoutParams(C23486n.m77122a(44.0d), C23486n.m77122a(44.0d));
        layoutParams.setMargins(0, 0, C23486n.m77122a(6.0d), 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(C23486n.m77122a(6.0d));
        }
        layoutParams.gravity = 8388629;
        this.f85663h.setLayoutParams(layoutParams);
        this.mRlTabContainer.addView(this.f85663h);
        this.f85663h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainFragment.this.mo84464m();
            }
        });
    }

    /* renamed from: v */
    private void m106256v() {
        if (!this.f85668m.mo95909h()) {
            ((C32961dd) C23336d.m76560a(getContext(), C32961dd.class)).mo60463c(true);
            m106245e((View) this.f85661f);
            if (!C33003b.m106651a()) {
                HotSearchAndDiscoveryActivity.m86689a(getActivity(), false);
            } else if (this.mViewPager != null) {
                this.f85676u.f79565d = true;
                this.f85670o.mo79713a("page_discover", true);
            }
            C6907h.m21521a(C6399b.m19921a(), "click", "discovery", "0", "0", (JSONObject) null);
        }
    }

    /* renamed from: w */
    private void m106257w() {
        Bundle arguments = getArguments();
        int i = -1;
        if (arguments != null) {
            i = arguments.getInt("tab", -1);
        }
        if (i >= 0) {
            if (this.f85666k.mo79776d(i)) {
                m106223B();
                C30245a aVar = new C30245a();
                if (getActivity() instanceof MainActivity) {
                    C30245a aVar2 = this.f85676u.f79563b;
                    aVar.f79577a = aVar2.mo79697a();
                    aVar.f79578b = aVar2.mo79698b();
                    aVar.f79579c = aVar2.mo79699c();
                }
                this.f85669n = aVar;
                if (!C21115b.m71197a().isLogin()) {
                    String str = null;
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        Intent intent = activity.getIntent();
                        if (intent != null) {
                            str = intent.getStringExtra("gd_label");
                        }
                    }
                    m106239a(str);
                    return;
                }
            }
            this.f85670o.mo79702a(i, false);
        }
    }

    /* renamed from: d */
    public final boolean mo84456d() {
        if (this.f85666k == null || this.mViewPager == null || this.f85666k.mo79775c(this.mViewPager.getCurrentItemCompat()) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo84454d(View view) {
        m106256v();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @C7709l
    public void onAfterLoginEvent(C32645a aVar) {
        mo84448b(1);
        m106251q();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42961az.m136382c(this);
    }

    @C7709l
    public void onHideUploadRecoverEvent(C39327e eVar) {
        m106246e(eVar.f102146a);
    }

    /* renamed from: f */
    private Fragment m106247f(int i) {
        try {
            return this.f85666k.mo79774b(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        C6726a.m20843a(new Runnable() {
            public final void run() {
                if (MainFragment.this.isViewValid() && !MainFragment.m106238a((Context) TrillApplication.m21341a()) && (activity instanceof MainActivity) && !C33003b.m106651a()) {
                    MainFragment.this.mo84450b(false);
                }
            }
        }, 3000);
    }

    @C7709l
    public void onScrollToFeedFollowGuideEvent(C33045d dVar) {
        if (dVar.f86013a) {
            m106258x();
        } else {
            m106259y();
        }
    }

    @C7709l
    public void onSwipeRefreshInMainFragmentEvent(C32954c cVar) {
        if (this.mSwipeRefreshLayoutWhenStoryOpen != null) {
            cVar.accept(this.mSwipeRefreshLayoutWhenStoryOpen);
        }
    }

    /* renamed from: g */
    private int m106249g(int i) {
        if (TimeLockRuler.isInTeenagerModeNewVersion() && i == 0 && this.mViewPager.getCurrentItemCompat() == 1) {
            return this.mViewPager.getCurrentItemCompat();
        }
        return i;
    }

    /* renamed from: b */
    public final void mo84448b(int i) {
        int i2 = i * 2;
        if (this.mViewPager != null) {
            int g = m106249g(i2);
            if (this.mViewPager.getCurrentItemCompat() != g) {
                mo84455d(true);
                this.f85670o.mo79702a(g, false);
            }
        }
    }

    /* renamed from: c */
    public final void mo84451c(boolean z) {
        if (this.f85666k != null) {
            FeedFragment feedFragment = (FeedFragment) this.f85666k.mo79773a();
            if (feedFragment != null) {
                feedFragment.setUserVisibleHint(true);
                feedFragment.mo73814c(true);
            }
            if (this.f85674s != null) {
                this.f85674s.mo60171a();
            }
        }
    }

    /* renamed from: d */
    public final void mo84455d(boolean z) {
        if (this.f85666k != null) {
            FeedFragment feedFragment = (FeedFragment) this.f85666k.mo79773a();
            if (feedFragment != null) {
                feedFragment.mo73815d(true);
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        if (this.f85666k.mo79773a() != null && !z) {
            this.f85666k.mo79773a().setUserVisibleHint(true);
        }
        if (this.f85665j != null) {
            this.f85665j.mo102476a(!z);
        }
    }

    @C7709l
    public void onPublishStatusUpdate(C39328f fVar) {
        if (isViewValid() && fVar.f102148b == 9 && fVar.f102152f) {
            mo84450b(fVar.f102153g);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void toggleReportButton(C25156h hVar) {
        int i;
        if (this.f85663h != null) {
            ImageView imageView = this.f85663h;
            if (this.f85663h.getVisibility() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static boolean m106238a(Context context) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(context);
    }

    /* renamed from: c */
    private static void m106242c(int i) {
        if (C33003b.m106651a()) {
            if (i == 1 && !C28344a.m93114e()) {
                C6907h.m21524a("homepage_hot_click", (Map) C22984d.m75611a().mo59973a("click_method", "enter").f60753a);
            } else if (i == 2) {
                C6907h.m21524a("homepage_fresh_click", (Map) C22984d.m75611a().mo59973a("click_method", "enter").f60753a);
            }
        }
    }

    /* renamed from: d */
    private void m106243d(int i) {
        if (i == 1) {
            C19282c.m63182a(getContext(), "homepage_hot", "show");
        } else if (i == 0) {
            C19282c.m63182a(getContext(), "homepage_follow", "show");
        } else {
            if (i == 2) {
                C19282c.m63182a(getContext(), m106260z(), "show");
            }
        }
    }

    /* renamed from: e */
    private void m106244e(int i) {
        if (i == 1) {
            C19282c.m63182a(getContext(), "homepage_hot", "click");
        } else if (i == 0) {
            C19282c.m63182a(getContext(), "homepage_follow", "click");
        } else {
            if (i == 2) {
                C19282c.m63182a(getContext(), m106260z(), "click");
            }
        }
    }

    @C7709l
    public void onAwesomeSplashEvent(C25053a aVar) {
        C25060e.m82533a(aVar.f66130a, this.f85662g);
        C25060e.m82533a(aVar.f66130a, this.mTitleBarContainer, this.f85661f);
        if (aVar.f66130a == 4 && this.f85661f != null) {
            this.f85661f.setAlpha(0.6f);
        }
    }

    @C7709l
    public void onCaptchaConsumerEvent(C23627a aVar) {
        if (aVar != null) {
            Activity b = AwemeApplication.m21343b();
            if (b != null && (b instanceof MainActivity)) {
                Fragment curFragment = ((MainActivity) b).getCurFragment();
                if (curFragment != null && (curFragment instanceof MainFragment)) {
                    aVar.accept(this);
                    this.f85680y = null;
                    return;
                }
            }
            this.f85671p = true;
            this.f85680y = aVar;
        }
    }

    @C7709l
    public void onDislikeAwemeEvent(C28324g gVar) {
        if (gVar.f74651b == 1) {
            if (gVar.f74650a) {
                C41540at.m132301a(this.mPagerTabStrip, this.mPagerTabStrip.getAlpha(), 0.0f);
                return;
            }
            C41540at.m132301a(this.mPagerTabStrip, this.mPagerTabStrip.getAlpha(), 1.0f);
        }
    }

    @C7709l
    public void onNotificationIndicatorEvent(C34314g gVar) {
        if (isViewValid() && gVar.f89465a == 5 && C33002a.m106650a() != 2) {
            if (C34315c.m110982b(5)) {
                m106222A();
            } else {
                m106223B();
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onTimeLineTabEvent(C32955d dVar) {
        boolean z;
        if (isViewValid()) {
            if (!((Boolean) SharePrefCache.inst().getShowTimeLineTab().mo59877d()).booleanValue() || C33003b.m106651a()) {
                z = false;
            } else {
                z = true;
            }
            this.f85666k.f79618c = z;
            this.f85666k.notifyDataSetChanged();
            this.mPagerTabStrip.mo79828e();
        }
    }

    /* renamed from: e */
    private void m106245e(final View view) {
        if (view != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }

    /* renamed from: f */
    private void m106248f(boolean z) {
        if (!z) {
            this.f85664i.mo74596b();
        } else if (!this.f85681z && !this.f85659A) {
            this.f85664i.mo74593a();
            this.f85659A = true;
            C6907h.m21524a("xmas_plugin_show", (Map) new C22984d().mo59973a("enter_from", C22704b.f60414c).f60753a);
            C29135b.m95585c();
            this.f85664i.mo74597c();
            this.f85664i.setOnClickListener(new C32888ax(this));
            this.f85664i.setCloseClickListener(new C32889ay(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo84449b(View view) {
        C29135b.m95579a(getContext());
        C6907h.m21524a("enter_activity_page", (Map) new C22984d().mo59973a("enter_from", C22704b.f60414c).f60753a);
        C6907h.m21524a("xmas_plugin_click", (Map) new C22984d().mo59973a("enter_from", C22704b.f60414c).f60753a);
    }

    /* renamed from: e */
    private void m106246e(boolean z) {
        if (!C33003b.m106651a() && isViewValid() && this.f85665j != null && this.f85665j.isShowing()) {
            if (z) {
                C10761a.m31399c(getContext(), (int) R.string.ow).mo25750a();
            }
            this.f85665j.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo84450b(final boolean z) {
        if (!C33003b.m106651a()) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().getRecoverDraftIfHave(AwemeApplication.m21341a(), new OnGetRecoverDraftCallback() {
                public final void onFail() {
                }

                public final void onSuccess(C27311c cVar) {
                    if (MainFragment.this.isViewValid()) {
                        MainFragment.this.f85665j = new C41700j(MainFragment.this.getActivity(), cVar, z);
                        if (MainFragment.this.mHidden) {
                            MainFragment.this.f85665j.mo102476a(false);
                        }
                        MainFragment.this.f85665j.mo102477b();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ boolean mo84453c(View view) {
        C1081a aVar = new C1081a(getContext());
        StringBuilder sb = new StringBuilder("现金裂变test：\n");
        try {
            StringBuilder sb2 = new StringBuilder("DeepLink-activityId:");
            sb2.append(C33634a.m108554b().f87781d);
            sb.append(sb2.toString());
            if (C33634a.m108554b().f87778a != null) {
                StringBuilder sb3 = new StringBuilder("\nsetting-activityId:");
                sb3.append(C33634a.m108554b().f87778a.getActivityId());
                sb.append(sb3.toString());
            } else {
                sb.append("\nsetting-activityId: null");
            }
            StringBuilder sb4 = new StringBuilder("\nfeed弹窗是否展示过:");
            sb4.append(C33634a.m108554b().f87780c.f87771a);
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder("\n弹窗素材是否已准备好:");
            sb5.append(C33634a.m108554b().mo86016a(C33634a.m108554b().f87778a.getChannelPopup().getResourceUrl()));
            sb.append(sb5.toString());
        } catch (NullValueException unused) {
        }
        aVar.mo4240b((CharSequence) sb.toString());
        aVar.mo4241b((CharSequence) "重置弹窗展示标记", C32890az.f85829a);
        aVar.mo4234a((CharSequence) "ok", C32894ba.f85833a);
        aVar.mo4245c();
        return true;
    }

    /* renamed from: a */
    private void m106236a(final Aweme aweme) {
        this.f85672q = true;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f85663h, View.SCALE_X, new float[]{1.0f, 1.2f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f85663h, View.SCALE_Y, new float[]{1.0f, 1.2f}).setDuration(150);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration).with(duration2);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f85663h, View.SCALE_X, new float[]{1.2f, 1.0f}).setDuration(150);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f85663h, View.SCALE_Y, new float[]{1.2f, 1.0f}).setDuration(150);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(duration3).with(duration4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet).before(animatorSet2);
        animatorSet3.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                MainFragment.this.f85672q = false;
                if (!aweme.isAd() || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().isReportEnable()) {
                    ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog((Activity) MainFragment.this.getContext(), "video", aweme.getAid(), aweme.getAuthorUid(), null);
                } else {
                    C37196b.m119559a(MainFragment.this.getActivity(), C25244aq.m82987a(aweme, "creative", "ad"));
                }
            }
        });
        animatorSet3.start();
    }

    /* renamed from: a */
    private boolean m106239a(String str) {
        String str2;
        if (C21115b.m71197a().isLogin()) {
            return false;
        }
        if (this.mViewPager.getCurrentItemCompat() == 1) {
            str2 = "homepage_hot";
        } else if (this.mViewPager.getCurrentItemCompat() == 2) {
            str2 = "homepage_fresh";
        } else {
            str2 = "";
        }
        C32656f.m105748a((Fragment) this, str2, str, (Bundle) null, (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58663a() {
                boolean z;
                if (MainFragment.this.mViewPager != null && MainFragment.this.isViewValid()) {
                    MainFragment mainFragment = MainFragment.this;
                    if (MainFragment.this.mViewPager.getCurrentItemCompat() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mainFragment.f85667l = z;
                    if (MainFragment.this.f85667l) {
                        FeedFragment feedFragment = (FeedFragment) MainFragment.this.f85666k.mo79773a();
                        if (feedFragment != null) {
                            feedFragment.mo73815d(false);
                        }
                    }
                    MainFragment.this.f85670o.mo79702a(0, false);
                }
                MainFragment.this.f85669n = null;
            }

            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
                MainFragment.this.f85669n = null;
            }
        });
        return true;
    }

    /* renamed from: a */
    public final void mo84440a(View view) {
        C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_hot").f60753a);
        QRCodePermissionActivity.m119022a(getContext(), false);
    }

    /* renamed from: a */
    public static void m106237a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notice_type", str2);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName(str).setLabelName("follow_bottom_tab").setJsonObject(jSONObject));
    }

    /* renamed from: b */
    private void m106240b(int i, int i2) {
        Fragment f = m106247f(i);
        if (f instanceof FeedFragment) {
            if (C32904bi.m106496a()) {
                f.setUserVisibleHint(true);
            }
            ((FeedFragment) f).mo73815d(false);
            f.setUserVisibleHint(false);
        }
        Fragment f2 = m106247f(i2);
        if (f2 != null) {
            f2.setUserVisibleHint(true);
        }
    }

    /* renamed from: a */
    private static void m106233a(int i, int i2) {
        String str;
        String str2;
        String str3;
        if (i == 0) {
            str = "enter_homepage_follow";
        } else {
            str = "enter_homepage_hot";
        }
        if (i == 0) {
            str2 = "homepage_hot";
        } else {
            str2 = "homepage_follow";
        }
        String str4 = "click_follow_tab";
        if (i2 == 2) {
            str3 = "slide";
        } else {
            if (i2 == 1) {
                if (i == 0) {
                    str3 = "click_follow_tab";
                } else {
                    str3 = "click_hot_tab";
                }
            }
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("previous_page", str2).mo59973a("enter_method", str4).mo59973a("group_id", C33258c.m107471a()).mo59973a("author_id", C33258c.m107473b()).f60753a);
        }
        str4 = str3;
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("previous_page", str2).mo59973a("enter_method", str4).mo59973a("group_id", C33258c.m107471a()).mo59973a("author_id", C33258c.m107473b()).f60753a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f85670o = ScrollSwitchStateManager.m98918a(getActivity());
        this.f85676u = HomePageDataViewModel.m98904a(getActivity());
        this.mPagerTabStrip.setEnableAnimation(false);
        m106235a(view, bundle);
        m106250p();
        m106225E();
        m106226F();
        m106227G();
        this.mPagerTabStrip.setEnableAnimation(true);
        if (getActivity() != null) {
            this.f85668m = C38267a.m122239a((Context) getActivity());
        }
        m106257w();
    }

    /* renamed from: a */
    private void m106235a(View view, Bundle bundle) {
        if (VERSION.SDK_INT >= 19) {
            Object value = ((PreDrawableInflate) C7121a.m22249b(PreDrawableInflate.class)).getValue("status_bar_height");
            if (value instanceof Integer) {
                this.mStatusBarView.getLayoutParams().height = ((Integer) value).intValue();
            } else {
                this.mStatusBarView.getLayoutParams().height = C10994a.m32204a((Context) getActivity());
            }
        }
        this.f85675t.mo79781a(this, view, bundle);
        this.mViewPager = C30283g.m99037b();
        this.f85666k = (MainPagerAdapter) C30283g.m99034a();
        this.mPagerTabStrip = this.f85675t.f79640a;
        this.f85670o.mo79746l(getActivity(), new C32884at(this));
        this.f85670o.mo79745k(getActivity(), new C32885au(this));
        int i = 1;
        if (!m106224D() || !C21115b.m71197a().isLogin()) {
            this.f85678w = true;
        } else {
            i = 0;
        }
        this.f85670o.mo79702a(i, false);
        this.f85676u.f79572k = this.mViewPager.getCurrentItemCompat();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C30280e.m99030a(this, layoutInflater, viewGroup, bundle);
    }
}
