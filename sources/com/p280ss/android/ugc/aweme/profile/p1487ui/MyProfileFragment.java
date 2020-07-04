package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10826g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.p941d.C21166a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.p1058c.C23284c;
import com.p280ss.android.ugc.aweme.base.p1058c.C23285d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commerce.service.p1110d.C24440a;
import com.p280ss.android.ugc.aweme.commerce.service.p1110d.C24441b;
import com.p280ss.android.ugc.aweme.commercialize.link.C24769b;
import com.p280ss.android.ugc.aweme.commercialize.link.C24775d;
import com.p280ss.android.ugc.aweme.commercialize.link.C24777f;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24564e;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24570j;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24573m;
import com.p280ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.BrandTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.experiment.C27691f;
import com.p280ss.android.ugc.aweme.experiment.C27693h;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.ProfileCollectionFragmentForJedi;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28786aj;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.base.C32895a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33250au;
import com.p280ss.android.ugc.aweme.metrics.C33278t;
import com.p280ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p280ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p1708y.C43578b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.experiment.C35778a;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35666d;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35668f;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36342b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EffectListFragment.C36143a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.AbsMyCommonHeaderLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36481a.C36485a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36531bc;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36532bd;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36327a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36682q;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36050x;
import com.p280ss.android.ugc.aweme.profile.util.C36701ad;
import com.p280ss.android.ugc.aweme.profile.util.C36701ad.C36702a;
import com.p280ss.android.ugc.aweme.profile.util.C36725aj;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.p280ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p337ui.C37897ax;
import com.p280ss.android.ugc.aweme.story.api.p1653a.C41968a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;
import com.p280ss.android.ugc.aweme.viewmodel.Resource.Status;
import com.p280ss.android.ugc.aweme.views.SpecifiedNumberAnimatedImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MyProfileFragment */
public class MyProfileFragment extends AbsProfileFragment implements C0053p<Resource<NewUserCount>>, C6310a, C28343z, C33278t, C36327a, C36342b {

    /* renamed from: W */
    public static String f94911W;

    /* renamed from: ak */
    private static final boolean f94912ak = C7163a.m22363a();

    /* renamed from: X */
    protected C28786aj f94913X;

    /* renamed from: Y */
    protected Aweme f94914Y;

    /* renamed from: Z */
    protected long f94915Z = -1;

    /* renamed from: aA */
    private boolean f94916aA;

    /* renamed from: aB */
    private boolean f94917aB;

    /* renamed from: aC */
    private boolean f94918aC = true;

    /* renamed from: aD */
    private Handler f94919aD = new Handler(Looper.getMainLooper());

    /* renamed from: aE */
    private View f94920aE;

    /* renamed from: aF */
    private boolean f94921aF;

    /* renamed from: aG */
    private boolean f94922aG;

    /* renamed from: aH */
    private C10751a f94923aH;

    /* renamed from: aI */
    private C35481c f94924aI;

    /* renamed from: aJ */
    private C36682q f94925aJ;

    /* renamed from: aK */
    private C36340al f94926aK;

    /* renamed from: aL */
    private EnterpriseTabFragment f94927aL;

    /* renamed from: aM */
    private boolean f94928aM = false;

    /* renamed from: aN */
    private boolean f94929aN = false;

    /* renamed from: aa */
    protected String f94930aa;

    /* renamed from: ab */
    protected ProfileListFragment f94931ab;

    /* renamed from: ac */
    protected ProfileCollectionFragmentForJedi f94932ac;

    /* renamed from: ad */
    public boolean f94933ad;

    /* renamed from: ae */
    ProfileQuickShopContainer f94934ae;

    /* renamed from: af */
    DmtTextView f94935af;

    /* renamed from: ag */
    View f94936ag;

    /* renamed from: ah */
    public boolean f94937ah;

    /* renamed from: ai */
    public C43578b f94938ai = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDouLabService();

    /* renamed from: aj */
    boolean f94939aj;

    /* renamed from: al */
    private C36050x f94940al;

    /* renamed from: am */
    private C35999a f94941am;

    /* renamed from: an */
    private boolean f94942an;

    /* renamed from: ao */
    private C35481c f94943ao;

    /* renamed from: ap */
    private C35481c f94944ap;

    /* renamed from: aq */
    private C33061p f94945aq;

    /* renamed from: ar */
    private ScrollSwitchStateManager f94946ar;

    /* renamed from: as */
    private String f94947as;

    /* renamed from: at */
    private C36340al f94948at;

    /* renamed from: au */
    private AnalysisStayTimeFragmentComponent f94949au;

    /* renamed from: av */
    private MyProfileViewModel f94950av;

    /* renamed from: aw */
    private boolean f94951aw;

    /* renamed from: ax */
    private boolean f94952ax = true;

    /* renamed from: ay */
    private boolean f94953ay;

    /* renamed from: az */
    private boolean f94954az;
    ImageView ivBindPhone;
    RelativeLayout mMoreView;
    public View mYellowPoint;

    /* renamed from: ac */
    private static void m116957ac() {
        C24769b.m81290e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo91936A() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo91937B() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo91938D() {
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91921a(float f) {
    }

    /* renamed from: a */
    public final void mo91699a(int i, String str) {
    }

    /* renamed from: a */
    public final void mo91701a(UrlModel urlModel) {
    }

    /* renamed from: a */
    public final void mo64929a(Object obj) {
    }

    /* renamed from: a */
    public final void mo91704a(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: b */
    public final void mo91706b(User user) {
    }

    /* renamed from: b */
    public final void mo91710b(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: d */
    public final void mo91717d(User user) {
    }

    /* renamed from: e */
    public final void mo91720e() {
        super.mo91720e();
    }

    /* renamed from: k */
    public final void mo91947k(int i) {
    }

    @C7709l
    public void onBindMobileFinishEvent(C21166a aVar) {
    }

    public void onClick(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo91958z() {
        return R.layout.pb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92156a(Boolean bool) {
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            if (this.f94948at != null) {
                this.f94948at.mo90829d(bool.booleanValue());
            }
            m116965k(bool.booleanValue());
            if (bool.booleanValue()) {
                onPageSelected(this.f94528N);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92155a(Resource resource) {
        LinkInfo linkInfo;
        C32961dd ddVar = (C32961dd) C23336d.m76560a(getContext(), C32961dd.class);
        if (resource == null || resource.f112149a != Status.SUCCESS || resource.f112150b == null) {
            linkInfo = null;
        } else {
            linkInfo = ((ActivityLinkResponse) resource.f112150b).linkInfo;
            if (ddVar != null) {
                if (TextUtils.equals("", ddVar.mo60462c(""))) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(System.currentTimeMillis());
                    instance.set(11, 0);
                    instance.set(12, 0);
                    instance.set(13, 0);
                    instance.set(14, 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(instance.getTimeInMillis());
                    ddVar.mo60465d(sb.toString());
                }
            }
        }
        if (C6399b.m19944t()) {
            this.f94526L.mo92631a(linkInfo);
            return;
        }
        if (ddVar != null && !ddVar.mo60476i(false)) {
            this.f94526L.mo92631a(linkInfo);
        }
    }

    /* renamed from: a */
    public final void mo92157a(boolean z) {
        if (this.f94921aF) {
            this.f94934ae.mo66199c(z);
        }
    }

    /* renamed from: a */
    public final void mo91702a(User user) {
        super.mo91702a(user);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (this.f94929aN && this.f94422g != null) {
                this.f94422g.f93645a = this.f94531Q;
                mo91952m(this.f94531Q);
                if (this.f94927aL != null) {
                    this.f94927aL.f66062e = this.f94531Q;
                    this.f94927aL.mo65515g();
                }
                this.f94422g.notifyDataSetChanged();
            }
            if (!(this.f94934ae == null || this.f94935af == null || this.f94936ag == null || this.f94937ah)) {
                this.f94921aF = this.f94934ae.mo66195a(user, (View) this.mUserCover, this.f94936ag, this.f94935af, this.f94922aG);
                if (this.f94921aF) {
                    mo91956x();
                } else {
                    mo91950l(user);
                }
            }
            if (C43122ff.m136783n(this.f94531Q)) {
                if (this.f94526L == null || (this.f94526L instanceof C36532bd)) {
                    if (this.f94526L != null) {
                        this.mScrollableLayout.removeView(this.f94526L);
                    }
                    this.f94526L = new C36531bc(activity, this, this.f94535U);
                    ((C36531bc) this.f94526L).mo92750j(this.f94921aF);
                    this.mScrollableLayout.addView(this.f94526L, 0);
                    mo91878j();
                }
            } else if (this.f94526L == null || (this.f94526L instanceof C36531bc)) {
                if (this.f94526L != null) {
                    this.mScrollableLayout.removeView(this.f94526L);
                }
                this.mScrollableLayout.removeView(this.f94526L);
                this.f94526L = new C36532bd(activity, this, this.f94535U);
                this.mScrollableLayout.addView(this.f94526L, 0);
                mo91878j();
            }
            this.f94526L.f95706E.mo26054a();
            this.f94526L.f95706E.setupWithViewPager(this.f94502o);
            this.f94526L.f95706E.setOnTabClickListener(this);
            this.f94526L.f95706E.mo26058a((C10820c) this);
            this.f94502o.setCurrentItem(this.f94528N);
            this.f94526L.mo92660h(user);
            this.f94526L.mo91702a(user);
            if (this.f94926aK != null) {
                this.f94926aK.mo90816a(this.f94531Q);
            }
            m116944L();
            if (!this.f94917aB || this.f94928aM) {
                mo91925h(this.f94531Q);
            }
            ((AbsMyCommonHeaderLayout) this.f94526L).mo92540g(this.f94947as == "like");
            this.f94917aB = false;
            this.f94928aM = false;
            this.f94929aN = false;
            this.f94950av.mo93149b();
        }
    }

    /* renamed from: ae */
    private void m116959ae() {
        this.f94915Z = System.currentTimeMillis();
    }

    /* renamed from: y */
    public final boolean mo91957y() {
        return super.mo91957y();
    }

    /* renamed from: S */
    private void m116947S() {
        if (C6399b.m19947w() && this.f94948at != null) {
            this.f94948at.mo90811A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo91939E() {
        return (int) getResources().getDimension(R.dimen.my);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public final /* synthetic */ void mo92152K() {
        f94911W = "click_coupon_bubble";
        onMore(this.mMoreView);
    }

    /* renamed from: P */
    public final void mo92084P() {
        if (this.f94526L instanceof AbsMyCommonHeaderLayout) {
            ((AbsMyCommonHeaderLayout) this.f94526L).mo92561u();
        }
    }

    /* renamed from: c */
    public final String mo85338c() {
        if (this.f94528N == 0) {
            return "personal_homepage";
        }
        return "personal_collection";
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("personal_homepage");
    }

    /* renamed from: U */
    private void m116949U() {
        ProfileListFragment profileListFragment = (ProfileListFragment) mo91876i(mo91934u());
        if (profileListFragment != null && (profileListFragment instanceof EffectListFragment)) {
            ((EffectListFragment) profileListFragment).mo90811A();
        }
    }

    /* renamed from: V */
    private void m116950V() {
        if (this.f94946ar != null) {
            this.f94946ar.mo79736f("page_setting");
        }
        if (m116956ab()) {
            m116957ac();
        }
    }

    /* renamed from: W */
    private void m116951W() {
        if (this.f94923aH != null && this.f94923aH.isShowing()) {
            this.f94923aH.mo25727f();
        }
    }

    /* renamed from: X */
    private void m116952X() {
        if (this.f94924aI != null && this.f94924aI.isShowing()) {
            this.f94924aI.mo90261b();
        }
    }

    /* renamed from: Z */
    private static boolean m116954Z() {
        if (!((Boolean) SharePrefCache.inst().getShowMiniAppFreshGuideBubble().mo59877d()).booleanValue() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        return true;
    }

    /* renamed from: aa */
    private static void m116955aa() {
        SharePrefCache.inst().getShowMiniAppFreshGuideBubble().mo59871a(Boolean.valueOf(false));
    }

    /* renamed from: ab */
    private boolean m116956ab() {
        if (C24769b.m81289d() || !C24769b.m81285a() || m116954Z() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        return true;
    }

    /* renamed from: ad */
    private boolean m116958ad() {
        FragmentActivity activity = getActivity();
        if (activity == null || !(activity instanceof MainActivity) || !activity.getIntent().getBooleanExtra("is_have_intents", false) || !(this.f94526L instanceof AbsMyCommonHeaderLayout)) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final void mo92148G() {
        if (this.f94944ap != null && this.f94944ap.isShowing()) {
            this.f94944ap.mo90261b();
        }
    }

    /* renamed from: J */
    public final C36340al mo92151J() {
        if (C6307b.m19566a((Collection<T>) this.f94540z) || !(this.f94540z.get(0) instanceof C36340al)) {
            return null;
        }
        return (C36340al) this.f94540z.get(0);
    }

    public final void bC_() {
        if (this.f94502o != null && this.f94502o.getCurrentItem() != 0) {
            this.f94502o.setCurrentItem(0, false);
        }
    }

    public String getUserId() {
        if (TextUtils.isEmpty(C33230ac.m107217b(this.f94531Q))) {
            return C21115b.m71197a().getCurUserId();
        }
        return C33230ac.m107217b(this.f94531Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo91927l() {
        if (m116946Q()) {
            this.f94420e.setVisibility(8);
            if (this.f94421f != null) {
                this.f94421f.mo7085f();
            }
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f94526L != null) {
            this.f94526L.mo92538c();
        }
        C21115b.m71197a().updateLeaveTime(System.currentTimeMillis());
    }

    /* renamed from: r */
    public final boolean mo62081r() {
        if (super.mo62081r()) {
            return true;
        }
        if (this.f94921aF) {
            this.f94934ae.mo66196b();
        }
        return false;
    }

    /* renamed from: M */
    private void m116945M() {
        if (getActivity() != null && getView() != null) {
            this.mYellowPoint.setVisibility(8);
            if (C7213d.m22500a().mo18722O() && MultiAccountViewModel.m118560b()) {
                this.mYellowPoint.setVisibility(0);
            }
            C36701ad.m118357a(2, (C36702a) new C36395ci(this));
        }
    }

    /* renamed from: Q */
    private boolean m116946Q() {
        if (this.f94420e == null || (((Integer) C23060u.m75742a().mo60084n().mo59877d()).intValue() <= 3 && ((this.f94531Q == null || this.f94531Q.getCoverUrls() == null || this.f94531Q.getCoverUrls().size() <= 1) && !this.f94509v))) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    private void m116948T() {
        this.f94526L.f95706E.mo26054a();
        this.f94526L.f95706E.setupWithViewPager(this.f94502o);
        this.f94526L.f95706E.setOnTabClickListener(this);
        this.f94526L.f95706E.mo26058a((C10820c) this);
        this.f94502o.setCurrentItem(this.f94528N);
    }

    /* renamed from: Y */
    private void m116953Y() {
        if (af_()) {
            if (!C36402cp.m117631a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                return;
            }
            this.f94917aB = true;
            this.f94940al.mo56976a(new Object[0]);
        }
    }

    /* renamed from: af */
    private void m116960af() {
        if (this.f94915Z > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f94915Z;
            if (currentTimeMillis > 0) {
                C1592h.m7855a((Callable<TResult>) new C36393cg<TResult>(this, currentTimeMillis, this.f94528N), (Executor) C6907h.m21516a());
            }
            this.f94915Z = -1;
        }
    }

    /* renamed from: H */
    public final void mo92149H() {
        m116952X();
        C24440a a = C24441b.m80369a(getContext());
        User curUser = C21115b.m71197a().getCurUser();
        if (a != null && curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
            C24441b.m80371a(a, curUser.getUid(), false);
        }
    }

    /* renamed from: N */
    public final void mo92082N() {
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null && !((Boolean) SharePrefCache.inst().getHasEnterBindPhone().mo59877d()).booleanValue() && TextUtils.isEmpty(curUser.getBindPhone())) {
            C6907h.onEvent(MobClick.obtain().setEventName("tip_show").setLabelName("mobile_link"));
        }
    }

    /* renamed from: O */
    public final void mo92083O() {
        if (this.f94526L instanceof AbsMyCommonHeaderLayout) {
            ((AbsMyCommonHeaderLayout) this.f94526L).mo92562v();
        }
        User user = this.f94531Q;
        if (user == null) {
            user = C21115b.m71197a().getCurUser();
        }
        if (m116448i(user)) {
            C24995f.m82307a(user, "personal_homepage");
        }
        if (!C6399b.m19944t() && this.f94940al != null) {
            m116953Y();
        }
    }

    /* renamed from: i */
    public final void mo91877i() {
        super.mo91877i();
        if (!this.f94916aA) {
            this.f94945aq = C32895a.m106470a(getActivity());
            this.f94946ar = ScrollSwitchStateManager.m98918a(getActivity());
            this.f94945aq.mo84694a((C0935e) new C0935e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageSelected(int i) {
                    MyProfileFragment.this.mo92148G();
                }

                public final void onPageScrolled(int i, float f, int i2) {
                    if (MyProfileFragment.this.mYellowPoint != null && !MyProfileFragment.this.f94933ad) {
                        MyProfileFragment.this.mYellowPoint.setVisibility(8);
                    }
                    MyProfileFragment.this.mo92149H();
                }
            });
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f94949au != null) {
            this.f94949au.onPause();
        }
        if (this.f94421f != null) {
            this.f94421f.mo7086g();
        }
        m116960af();
        if (this.f94950av != null) {
            this.f94950av.f96539c.setValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: L */
    private void m116944L() {
        C22903bl isLike2DynamicBubbleHasShowed = SharePrefCache.inst().getIsLike2DynamicBubbleHasShowed();
        if (!((Boolean) isLike2DynamicBubbleHasShowed.mo59877d()).booleanValue() && C7213d.m22500a().mo18778ap()) {
            int indexOf = this.f94516A.indexOf(Integer.valueOf(5));
            if (indexOf != -1) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.f94540z.get(indexOf);
                if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                    C10825f b = this.f94526L.f95706E.mo26066b(indexOf);
                    if (!(b == null || b.f29294h == null)) {
                        C10826g gVar = b.f29294h;
                        gVar.post(new C36394ch(this, gVar, isLike2DynamicBubbleHasShowed));
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo92150I() {
        User curUser = C21115b.m71197a().getCurUser();
        if (isAdded()) {
            C0608j childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append(f94515y);
            sb.append(bD_());
            C36340al alVar = (C36340al) childFragmentManager.mo2644a(sb.toString());
            if (alVar != null) {
                int g = alVar.mo90835g();
                if (!(curUser == null || curUser.getAwemeCount() == g || curUser.getAwemeCount() >= 20)) {
                    C6877n.m21447a("aweme_post_display_unnormal_log", new C42967ba().mo104680a("post_list_size", String.valueOf(g)).mo104680a("user_aweme_count", String.valueOf(curUser.getAwemeCount())).mo104681b());
                }
            }
        }
    }

    public void onDestroyView() {
        try {
            super.onDestroyView();
            if (this.f94940al != null) {
                this.f94940al.mo59134U_();
            }
            if (this.f94923aH != null) {
                this.f94923aH.mo25722b();
            }
            if (this.f94943ao != null) {
                this.f94943ao.mo90269d();
            }
            if (this.f94944ap != null) {
                this.f94944ap.mo90269d();
            }
            if (this.f94924aI != null) {
                this.f94924aI.mo90269d();
            }
            if (this.f94919aD != null) {
                this.f94919aD.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
        if (this.f94526L != null) {
            this.f94526L.mo92534b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo91875g() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f94930aa = arguments.getString("enter_from");
            this.f94535U.mo93198b(this.f94930aa);
        }
        this.f94531Q = C21115b.m71197a().getCurUser();
        super.mo91875g();
        this.f94526L.setUser(this.f94531Q);
        if (!((Boolean) SharePrefCache.inst().getHasEnterBindPhone().mo59877d()).booleanValue()) {
            C21115b.m71197a().queryUser();
        }
        this.f94940al = new C36050x();
        this.f94940al.mo66537a(this);
        this.f94940al.mo56976a(new Object[0]);
        this.f94526L.mo92542h();
        this.f94950av = (MyProfileViewModel) C0069x.m157a((Fragment) this).mo147a(MyProfileViewModel.class);
        this.f94950av.f96537a.observe(this, this);
        this.f94950av.f96539c.observe(this, new C36391ce(this));
        this.f94950av.mo93148a();
        if (!((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().mo59877d()).booleanValue() || TimeLockRuler.isTeenModeON()) {
            this.f94526L.mo92631a((LinkInfo) null);
        } else {
            this.f94950av.f96538b.observe(this, new C36392cf(this));
        }
    }

    public void onResume() {
        if (C6399b.m19944t()) {
            SharePrefCache.inst().getHasEnterBindPhone().mo59871a(Boolean.valueOf(true));
        }
        super.onResume();
        if (this.f94421f != null) {
            this.f94421f.mo7081c();
        }
        if (this.f94949au != null) {
            this.f94949au.onResume();
        }
        if (this.f94953ay) {
            m116959ae();
        }
        this.f94531Q = C21115b.m71197a().getCurUser();
        this.f94535U.mo93194a(this.f94531Q);
        this.f94940al.mo91623a(this.f94531Q);
        this.f94526L.mo92660h(this.f94531Q);
        if (this.f94954az || this.f94942an) {
            m116953Y();
        }
        this.f94954az = false;
        this.f94942an = false;
        mo91927l();
        this.f94526L.mo92528a();
        if (!C6399b.m19944t()) {
            mo91714c(this.f94531Q.isBindedWeibo());
        }
        if (this.f94951aw) {
            this.f94951aw = false;
            for (Fragment fragment : this.f94540z) {
                if (fragment instanceof C36346ao) {
                    ((C36346ao) fragment).mo90811A();
                }
            }
        }
        if (this.f94948at != null && !this.f94952ax) {
            this.f94948at.mo71270t();
        }
        if (this.f94952ax) {
            m116966l(this.f94953ay);
        }
        this.f94952ax = false;
        m116945M();
        mo92160g(this.f94953ay);
        if (!C6399b.m19944t()) {
            mo92161h(this.f94953ay);
        }
        mo92159f(this.f94953ay);
        mo92162i(this.f94953ay);
        if (this.f94950av != null && this.f94953ay) {
            this.f94950av.f96539c.setValue(Boolean.valueOf(true));
        }
        if (!TextUtils.isEmpty(m116968n(this.f94528N))) {
            C6907h.m21524a("enter_personal_homepage", (Map) C22984d.m75611a().mo59973a("tab_name", m116968n(this.f94528N)).f60753a);
        }
    }

    @C7709l
    public void onLinkAuthSettingsFinishEvent(C24777f fVar) {
        this.f94954az = true;
    }

    @C7709l
    public void onSaveUserDataEvent(C35668f fVar) {
        this.f94942an = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo92158e(View view) {
        m116957ac();
        mo92159f(false);
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        m116970o(i);
    }

    @C7709l
    public void onUpdateUserSuccessEvent(C23285d dVar) {
        C21115b.m71197a().queryUser();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo92163j(boolean z) {
        if (z) {
            this.mYellowPoint.setVisibility(0);
            this.f94933ad = true;
        }
    }

    @C7709l
    public void onHidePerfectInfoGuideEvent(C35666d dVar) {
        if (this.f94526L instanceof AbsMyCommonHeaderLayout) {
            ((AbsMyCommonHeaderLayout) this.f94526L).mo92532a(dVar);
        }
    }

    @C7709l
    public void onMyEnterpriseProfileEvent(C24570j jVar) {
        if (jVar.f64814a == 1) {
            this.f94951aw = true;
        }
    }

    /* renamed from: f */
    private void m116963f(View view) {
        this.f94934ae = (ProfileQuickShopContainer) view.findViewById(R.id.ckl);
        this.f94935af = (DmtTextView) view.findViewById(R.id.ckm);
        this.f94936ag = view.findViewById(R.id.ckv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo91946e(String str) {
        this.f94531Q = C21115b.m71197a().getCurUser();
        this.f94526L.setUser(this.f94531Q);
        super.mo91946e(str);
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/user/?")) {
            C42961az.m136385f(aVar);
            m116953Y();
        }
    }

    @C7709l
    public void onCloseWebViewLoadingJsEvent(C24564e eVar) {
        if (af_() && this.f94921aF) {
            this.f94934ae.mo66198c();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f94533S != configuration.screenWidthDp) {
            m116948T();
            this.f94533S = configuration.screenWidthDp;
        }
    }

    @C7709l
    public void onFakeCoverAction(C24573m mVar) {
        if (af_() && this.f94921aF && mVar.f64817a == 1 && (this.f94526L instanceof C36531bc)) {
            ((C36531bc) this.f94526L).mo92721x();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(C37897ax axVar) {
        boolean z;
        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.f94526L;
        if (this.f94947as == "like") {
            z = true;
        } else {
            z = false;
        }
        absMyCommonHeaderLayout.mo92540g(z);
    }

    /* renamed from: j */
    private static int m116964j(int i) {
        switch (i) {
            case 0:
                return 3;
            case 1:
                return 0;
            case 2:
                if (!SharePrefCache.inst().isOpenForward()) {
                    return 1;
                }
                C7213d.m22500a();
                if (C7213d.m22502aq()) {
                    return 8;
                }
                return 5;
            case 3:
                return 1;
            case 4:
                return 7;
            case 5:
                return 10;
            case 6:
                return 12;
            default:
                return 3;
        }
    }

    /* renamed from: l */
    private void m116966l(boolean z) {
        if (z && getActivity() != null && !getActivity().isFinishing() && !C6399b.m19944t()) {
            if (this.f94941am == null) {
                this.f94941am = new C35999a();
            }
            C36725aj.m118396a(getActivity(), this.f94941am, this, true);
        }
    }

    /* renamed from: n */
    private String m116968n(int i) {
        String str = "";
        if (this.f94516A == null || this.f94516A.size() == 0 || i >= this.f94516A.size()) {
            return str;
        }
        return C43105eq.m136725a(((Integer) this.f94516A.get(i)).intValue());
    }

    /* renamed from: o */
    private void m116970o(int i) {
        if (this.f94540z != null && i >= 0 && i < this.f94540z.size()) {
            ProfileListFragment profileListFragment = (ProfileListFragment) this.f94540z.get(i);
            if (profileListFragment != null && profileListFragment.aO_()) {
                profileListFragment.aQ_();
            }
        }
    }

    public void handleMsg(Message message) {
        if (!(message.obj instanceof Exception) && (message.obj instanceof User)) {
            C21115b.m71197a().setCurUser((User) message.obj);
            if (this.f94940al != null) {
                this.f94940al.mo91623a((User) message.obj);
                this.f94526L.mo92660h((User) message.obj);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intValue = ((Integer) C23060u.m75742a().mo60084n().mo59877d()).intValue();
        if (intValue <= 3) {
            C23060u.m75742a().mo60084n().mo59871a(Integer.valueOf(intValue + 1));
        }
        this.f94916aA = !"from_main".equals(this.f94527M);
        if (getActivity() instanceof UserProfileActivity) {
            this.f94922aG = true;
        }
    }

    @C7709l
    public void onDeleteAllStory(C41968a aVar) {
        if (this.f94526L != null) {
            if (this.f94531Q == null) {
                this.f94531Q = C21115b.m71197a().getCurUser();
            }
            this.f94531Q.setHasStory(false);
            this.f94531Q.setHasUnreadStory(false);
            this.f94526L.mo91710b(this.f94531Q.isLive(), false, false);
        }
    }

    public void onMore(View view) {
        if (!C27326a.m89578a(view)) {
            C6907h.onEvent(MobClick.obtain().setEventName("click_more_setting").setLabelName("personal_homepage"));
            m116950V();
            mo92159f(false);
            mo92148G();
            m116951W();
            if (this.mYellowPoint != null) {
                this.mYellowPoint.setVisibility(8);
            }
            this.f94933ad = false;
            C36701ad.m118356a(2);
        }
    }

    @C7709l
    public void onUpdateUserEvent(C23284c cVar) {
        this.f94942an = false;
        this.f94531Q = cVar.f61319a;
        this.f94535U.mo93194a(this.f94531Q);
        if (this.f94940al != null) {
            this.f94940al.mo91623a(this.f94531Q);
            this.f94526L.mo92660h(this.f94531Q);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onChanged(Resource<NewUserCount> resource) {
        if (!(resource == null || resource.f112150b == null || resource.f112149a != Status.SUCCESS)) {
            int i = ((NewUserCount) resource.f112150b).count;
            if (i <= 0) {
                if (this.f94526L instanceof AbsMyCommonHeaderLayout) {
                    ((AbsMyCommonHeaderLayout) this.f94526L).setRecommendCount(0);
                }
                return;
            }
            C6907h.onEvent(MobClick.obtain().setEventName("tip_show").setLabelName("recommend_friends"));
            C6907h.m21524a("add_friends_notice", (Map) C22984d.m75611a().mo59973a("action_type", "show").f60753a);
            if ((this.f94526L instanceof AbsMyCommonHeaderLayout) && !m116958ad()) {
                ((AbsMyCommonHeaderLayout) this.f94526L).setRecommendCount(i);
            }
        }
    }

    /* renamed from: k */
    private void m116965k(boolean z) {
        ProfileListFragment profileListFragment = (ProfileListFragment) mo91876i(this.f94528N);
        if (profileListFragment instanceof C36340al) {
            C36340al alVar = (C36340al) profileListFragment;
            if (z) {
                if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
                    alVar.mo90848s();
                }
                alVar.mo90821a(false, false);
                return;
            }
            if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
                alVar.mo90849u();
            }
            alVar.mo90850v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91873a(View view) {
        super.mo91873a(view);
        View findViewById = view.findViewById(R.id.jo);
        if (TextUtils.equals("from_main", this.f94527M)) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (MyProfileFragment.this.f94913X != null) {
                        MyProfileFragment.this.f94913X.mo74012a();
                        return;
                    }
                    if (MyProfileFragment.this.getActivity() != null && !MyProfileFragment.this.getActivity().isFinishing()) {
                        MyProfileFragment.this.getActivity().finish();
                    }
                }
            });
        }
        if (m116946Q()) {
            this.f94420e.setVisibility(8);
            if (this.f94421f != null) {
                this.f94421f.mo7085f();
            }
        } else {
            this.f94420e.setVisibility(0);
        }
        C10789c.m31502a(this.mMoreView);
        if (this.f94916aA) {
            this.mMoreView.setVisibility(8);
        }
        this.f94920aE = view;
        m116963f(view);
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (C21115b.m71197a().isLogin() || !TextUtils.equals(followStatus.userId, C21115b.m71197a().getCurUserId())) {
            if (followStatus.followStatus == 0) {
                C6861a.m21337f().updateCurFollowingCount(-1);
                m116947S();
            } else if (followStatus.isFollowChange) {
                C6861a.m21337f().updateCurFollowingCount(1);
            }
            mo91705b(C21115b.m71197a().getCurUser().getFollowingCount());
        }
    }

    @C7709l
    public void onPrivateModelEvent(C28308ad adVar) {
        if (adVar.f74617b != null && C35778a.m115539a() && (getActivity() instanceof MainActivity)) {
            AwemeStatus status = adVar.f74617b.getStatus();
            if (status.getPrivateStatus() == 1) {
                C21115b.m71197a().updateCurAwemeCount(-1);
            } else if (adVar.f74619d == 1 && status.getPrivateStatus() != 1) {
                C21115b.m71197a().updateCurAwemeCount(1);
            }
            User curUser = C21115b.m71197a().getCurUser();
            if (this.f94526L != null) {
                this.f94526L.mo91711c(curUser.getAwemeCount());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void mo92162i(boolean z) {
        if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
            this.f94919aD.postDelayed(new C36396cj(this, z), 500);
        } else if (getView() != null && !TimeLockRuler.isTeenModeON()) {
            if (!z) {
                if (this.f94944ap != null && this.f94944ap.isShowing()) {
                    this.f94944ap.mo90261b();
                }
            } else if (C28410h.m93376p() && !C28410h.m93377q()) {
                if ((this.f94924aI == null || !this.f94924aI.isShowing()) && ((this.f94923aH == null || !this.f94923aH.isShowing()) && ((this.f94943ao == null || !this.f94943ao.isShowing()) && (this.f94944ap == null || !this.f94944ap.isShowing())))) {
                    C6907h.m21524a("show_coupon_bubble", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").f60753a);
                    C28410h.m93361b(true);
                    this.f94944ap = new C35481c(getActivity());
                    this.f94944ap.mo90267c((int) R.string.bdd);
                    this.f94944ap.f93102j = 0;
                    this.f94944ap.mo90258a(false);
                    this.f94944ap.mo90273e();
                    this.f94944ap.f93107o = new C36397ck(this);
                    this.f94944ap.f93096d = -20;
                    float c = (float) ((this.f94944ap.mo90266c() - this.mMoreView.getWidth()) / 2);
                    this.f94944ap.mo90256a(this.mMoreView, (int) c, (int) (-c));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo26116b(C10825f fVar) {
        boolean z;
        int i = fVar.f29291e;
        this.f94947as = m116968n(i);
        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.f94526L;
        if (this.f94947as == "like") {
            z = true;
        } else {
            z = false;
        }
        absMyCommonHeaderLayout.mo92540g(z);
        if (i == mo91934u()) {
            m116949U();
        }
        if (this.f94939aj) {
            this.f94939aj = false;
        } else {
            C6907h.m21524a("change_profile_tab", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "slide").mo59973a("tab_name", this.f94947as).f60753a);
        }
        m116960af();
        m116959ae();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            C0608j childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append(f94515y);
            sb.append(m116964j(0));
            OriginMusicListFragment originMusicListFragment = (OriginMusicListFragment) childFragmentManager.mo2644a(sb.toString());
            if (originMusicListFragment != null) {
                originMusicListFragment.mo86065g();
            }
        }
        if (this.f94949au != null) {
            this.f94949au.mo60573a(z);
        }
        if (this.f94950av != null) {
            this.f94950av.f96539c.setValue(Boolean.valueOf(!z));
        }
        if (z) {
            m116960af();
        } else {
            m116959ae();
        }
        if (!z) {
            if (this.f94950av != null) {
                this.f94950av.mo93148a();
            }
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    MyProfileFragment.this.mo92150I();
                }
            }, 1000);
        }
        if (this.f94526L instanceof C36531bc) {
            ((C36531bc) this.f94526L).mo92749i(z);
        } else if (this.f94526L instanceof C36532bd) {
            ((C36532bd) this.f94526L).mo92751i(z);
        }
        if (!z && this.f94932ac != null) {
            this.f94932ac.mo71289k();
        }
        this.f94526L.mo92642f(z);
        this.f94535U.mo93201d(z);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onMsgFromRnAndH5(C27994k kVar) {
        String str;
        boolean z;
        if (kVar.f73730b == null || !TextUtils.equals(kVar.f73730b.optString("eventName"), "mp_refresh_profile_page")) {
            if (kVar.f73730b != null && TextUtils.equals(kVar.f73730b.optString("eventName"), "talent_video_status_changed") && !C6307b.m19566a((Collection<T>) this.f94540z)) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.f94540z.get(0);
                if (profileListFragment != null) {
                    profileListFragment.aQ_();
                }
            }
            return;
        }
        JSONObject optJSONObject = kVar.f73730b.optJSONObject("data");
        if (optJSONObject != null) {
            str = optJSONObject.optString("userId");
        } else {
            str = null;
        }
        if (optJSONObject == null || !optJSONObject.optBoolean("fixed_tab")) {
            z = false;
        } else {
            z = true;
        }
        if (TextUtils.isEmpty(str)) {
            str = C21115b.m71197a().getCurUserId();
        }
        if (TextUtils.equals(str, getUserId())) {
            this.f94928aM = !z;
            this.f94929aN = true;
            this.f94917aB = true;
            this.f94940al.mo56976a(new Object[0]);
        }
    }

    @C7709l
    public void onShowTTChangeUsernameBubble(C27691f fVar) {
        boolean z;
        if (C6903bc.m21473N().mo71141a() && getActivity() != null && getView() != null && isViewValid()) {
            final TextView textView = (TextView) getView().findViewById(R.id.e9_);
            long a = C27693h.m90844a(this.f94531Q.getUid(), 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - a > 604800000) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ((AbsMyCommonHeaderLayout) this.f94526L).mo92533a(textView.getText().toString(), (int) R.drawable.a6w);
                if (this.f94953ay) {
                    if (this.f94925aJ == null || !this.f94925aJ.isShowing()) {
                        this.f94925aJ = new C36682q(getActivity());
                        this.f94925aJ.setOnDismissListener(new OnDismissListener() {
                            public final void onDismiss() {
                                String trim = textView.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim) && trim.endsWith(" T")) {
                                    ((AbsMyCommonHeaderLayout) MyProfileFragment.this.f94526L).mo92533a(trim.substring(0, trim.indexOf(" T")), (int) R.drawable.a6x);
                                }
                            }
                        });
                        this.f94925aJ.mo93020a((View) textView);
                        C27693h.m90845b(this.f94531Q.getUid(), currentTimeMillis);
                    }
                } else if (this.f94925aJ != null && this.f94925aJ.isShowing()) {
                    this.f94925aJ.dismiss();
                }
            } else if (this.f94925aJ == null || !this.f94925aJ.isShowing()) {
                ((AbsMyCommonHeaderLayout) this.f94526L).mo92533a(textView.getText().toString(), (int) R.drawable.a6x);
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        this.f94953ay = z;
        super.setUserVisibleHint(z);
        if (!z) {
            if (this.f94923aH != null && this.f94923aH.isShowing()) {
                this.f94923aH.dismiss();
            }
            if (this.f94504q != null && this.f94504q.isShowing()) {
                this.f94504q.dismiss();
            }
        }
        if (this.f94540z != null && !this.f94540z.isEmpty()) {
            if (this.f94528N >= 0 && this.f94528N < this.f94540z.size()) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.f94540z.get(this.f94528N);
                if (profileListFragment != null) {
                    profileListFragment.setUserVisibleHint(z);
                }
            } else {
                return;
            }
        }
        if (z) {
            if (this.f94931ab != null && (this.f94931ab instanceof UserStateFragment)) {
                ((UserStateFragment) this.f94931ab).mo86905g();
            }
            if (!TextUtils.isEmpty(m116968n(this.f94528N))) {
                C6907h.m21524a("enter_personal_homepage", (Map) C22984d.m75611a().mo59973a("tab_name", m116968n(this.f94528N)).f60753a);
            }
            C28580o.m93830a(PAGE.PROFILE);
        }
        m116945M();
        mo92160g(z);
        if (!C6399b.m19944t()) {
            mo92161h(z);
        }
        mo92159f(z);
        mo92162i(z);
        if (this.mFansShakeView != null) {
            this.mFansShakeView.mo90668a(z, this.f94531Q);
        }
        if (!z && C6399b.m19944t() && this.f94925aJ != null && this.f94925aJ.isShowing()) {
            this.f94925aJ.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void mo92161h(boolean z) {
        C7213d.m22500a();
        if (!C7213d.m22502aq()) {
            if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
                this.f94919aD.postDelayed(new C36398cl(this, z), 500);
            } else if (getView() != null && !TimeLockRuler.isTeenModeON()) {
                if (z) {
                    if (C27754b.m90997a() && ((Boolean) SharePrefCache.inst().getIsShowFavouritePopup().mo59877d()).booleanValue()) {
                        if (this.f94924aI != null && this.f94924aI.isShowing()) {
                            return;
                        }
                        if (this.f94923aH == null || !this.f94923aH.isShowing()) {
                            this.f94923aH = new C10752a(getActivity()).mo25738b((int) R.string.cig).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25736a(false).mo25742d((int) C9738o.m28708b((Context) getActivity(), -5.0f)).mo25739b(false).mo25737a();
                            this.f94923aH.mo25716a();
                            if (C43127fh.m136806a(getActivity())) {
                                this.f94923aH.mo25717a(this.mMoreView, 80, C9738o.m28708b((Context) getActivity(), 8.0f), ((int) C9738o.m28708b((Context) getActivity(), 13.0f)) - (this.f94923aH.mo25724d() - this.mMoreView.getWidth()));
                            } else {
                                this.f94923aH.mo25717a(this.mMoreView, 80, (float) ((this.f94923aH.mo25726e() - (this.mMoreView.getWidth() / 2)) - C23486n.m77122a(20.0d)), (-((int) C9738o.m28708b((Context) getActivity(), 3.0f))) - (this.f94923aH.mo25726e() - this.mMoreView.getWidth()));
                            }
                            SharePrefCache.inst().getIsShowFavouritePopup().mo59871a(Boolean.valueOf(false));
                        }
                    }
                } else if (this.f94923aH != null && this.f94923aH.isShowing()) {
                    this.f94923aH.mo25727f();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void mo92160g(boolean z) {
        boolean z2;
        boolean z3;
        if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
            this.f94919aD.postDelayed(new C36399cm(this, z), 500);
        } else if (getView() != null && !TimeLockRuler.isTeenModeON() && !C6399b.m19944t()) {
            try {
                z2 = C30199h.m98861a().getEnableCommerceOrder().booleanValue();
            } catch (NullValueException unused) {
                z2 = true;
            }
            if (z2) {
                C24440a a = C24441b.m80369a(getContext());
                if (a != null) {
                    User curUser = C21115b.m71197a().getCurUser();
                    if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
                        long latestOrderTime = curUser.getLatestOrderTime();
                        if (latestOrderTime > C24441b.m80368a(a, curUser.getUid())) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            C24441b.m80370a(a, curUser.getUid(), latestOrderTime);
                            C24441b.m80371a(a, curUser.getUid(), true);
                            C24441b.m80372b(a, curUser.getUid(), true);
                        }
                        if (z3 || C24441b.m80373b(a, curUser.getUid())) {
                            if (!z) {
                                m116952X();
                            } else if (this.f94924aI == null || !this.f94924aI.isShowing()) {
                                if (a.mo60420c(true)) {
                                    this.f94924aI = new C35481c(getActivity());
                                    this.f94924aI.mo90267c((int) R.string.crd);
                                    this.f94924aI.mo90263b(1, 13);
                                    this.f94924aI.f93102j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
                                    this.f94924aI.mo90258a(false);
                                    this.f94924aI.mo90273e();
                                    float c = ((float) (this.f94924aI.mo90266c() - this.mMoreView.getWidth())) / 2.0f;
                                    this.f94924aI.mo90256a(this.mMoreView, (int) c, (int) (-c));
                                    a.mo60422d(false);
                                }
                                if (this.mYellowPoint.getVisibility() != 0) {
                                    this.mYellowPoint.setVisibility(0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void mo92159f(boolean z) {
        if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
            this.f94919aD.postDelayed(new C36400cn(this, z), 500);
        } else if (getView() != null && !TimeLockRuler.isTeenModeON()) {
            View findViewById = getView().findViewById(R.id.bmi);
            if (!z) {
                if (this.f94943ao != null && this.f94943ao.isShowing()) {
                    this.f94943ao.mo90261b();
                }
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            } else if (this.f94924aI != null && this.f94924aI.isShowing()) {
            } else {
                if (this.f94923aH != null && this.f94923aH.isShowing()) {
                    return;
                }
                if (this.f94943ao != null && this.f94943ao.isShowing()) {
                    return;
                }
                if (!this.f94916aA && m116954Z()) {
                    m116955aa();
                    this.f94943ao = new C35481c(getActivity());
                    this.f94943ao.mo90267c((int) R.string.dbu);
                    this.f94943ao.f93102j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
                    this.f94943ao.mo90258a(false);
                    this.f94943ao.mo90273e();
                    float c = (float) ((this.f94943ao.mo90266c() - this.mMoreView.getWidth()) / 2);
                    this.f94943ao.mo90256a(this.mMoreView, (int) c, (int) (-c));
                    C6907h.m21524a("show_mp_bubble", (Map) new HashMap());
                } else if (m116956ab()) {
                    C24775d.m81304a();
                    if (!(C6399b.m19944t() || findViewById == null || this.mYellowPoint.getVisibility() == 0)) {
                        findViewById.setVisibility(0);
                    }
                    this.f94943ao = new C35481c(getActivity());
                    this.f94943ao.mo90267c((int) R.string.bzh);
                    this.f94943ao.f93102j = 0;
                    this.f94943ao.mo90258a(false);
                    this.f94943ao.getContentView().setOnClickListener(new C36401co(this));
                    this.f94943ao.mo90273e();
                    float c2 = (float) ((this.f94943ao.mo90266c() - this.mMoreView.getWidth()) / 2);
                    this.f94943ao.mo90256a(this.mMoreView, (int) c2, (int) (-c2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26115a(C10825f fVar) {
        C6907h.m21524a("change_profile_tab", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click").mo59973a("tab_name", m116968n(fVar.f29291e)).f60753a);
        this.f94939aj = true;
        fVar.mo26137a();
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onVideoEvent(C28318an anVar) {
        int i;
        if ("USER".equals(this.mTag)) {
            int i2 = anVar.f74631a;
            if (i2 != 2) {
                if (i2 != 13) {
                    if (i2 != 15) {
                        if (i2 != 39) {
                            switch (i2) {
                                case 31:
                                    C21115b.m71197a().updateCurDongtaiCount(1);
                                    break;
                                case 32:
                                    C21115b.m71197a().updateCurDongtaiCount(-1);
                                    break;
                            }
                        } else {
                            C21115b.m71197a().getCurUser().setCollectCount(((Integer) anVar.f74632b).intValue());
                        }
                    } else if (anVar.f74633c == 0 && (getActivity() instanceof MainActivity)) {
                        Object obj = anVar.f74632b;
                        if (!C35778a.m115539a() || !(obj instanceof Aweme) || !((Aweme) obj).getStatus().isPrivate()) {
                            C21115b.m71197a().updateCurAwemeCount(1);
                            C21115b.m71197a().updateCurDongtaiCount(1);
                        } else {
                            C21115b.m71197a().updateCurDongtaiCount(1);
                        }
                    }
                } else if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById((String) anVar.f74632b).getUserDigg() == 1) {
                    C21115b.m71197a().updateCurFavoritingCount(1);
                } else {
                    C21115b.m71197a().updateCurFavoritingCount(-1);
                }
            } else if (anVar.f74633c == 0 && (anVar.f74632b instanceof String) && (getActivity() instanceof MainActivity)) {
                C21115b.m71197a().updateCurAwemeCount(-1);
            }
            User curUser = C21115b.m71197a().getCurUser();
            if (this.f94526L != null) {
                this.f94526L.mo91711c(curUser.getAwemeCount());
                this.f94526L.mo91716d(curUser.getFavoritingCount());
                C7213d.m22500a();
                if (C7213d.m22502aq()) {
                    i = curUser.getCollectCount();
                } else {
                    i = curUser.getDongtaiCount();
                }
                this.f94526L.mo91724f(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo92085a(Aweme aweme) {
        this.f94914Y = aweme;
        if (this.f94927aL != null) {
            this.f94927aL.mo65514a(this.f94914Y);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo91949l(int i) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        boolean z3 = false;
        if (i == 5) {
            C0608j childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append(f94515y);
            sb.append(m116964j(4));
            this.f94927aL = (EnterpriseTabFragment) childFragmentManager.mo2644a(sb.toString());
            if (this.f94927aL == null) {
                this.f94927aL = new EnterpriseTabFragment();
                this.f94927aL.f66063f = true;
                this.f94927aL.mo65514a(this.f94914Y);
            }
            mo91942a((ProfileListFragment) this.f94927aL, Integer.valueOf(7));
            this.f94927aL.mo92306h(C43105eq.m136725a(7));
            this.f94927aL.mo65501a(this.f94531Q.getUid(), this.f94531Q.getSecUid());
            EnterpriseTabFragment enterpriseTabFragment = this.f94927aL;
            if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(7))) {
                z3 = true;
            }
            enterpriseTabFragment.mo92305g(z3);
            this.f94927aL.f66062e = this.f94531Q;
        } else if (i == 7) {
            C0608j childFragmentManager2 = getChildFragmentManager();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f94515y);
            sb2.append(m116964j(5));
            BrandTabFragment brandTabFragment = (BrandTabFragment) childFragmentManager2.mo2644a(sb2.toString());
            if (brandTabFragment == null) {
                brandTabFragment = new BrandTabFragment();
                brandTabFragment.f66050f = true;
            }
            mo91942a((ProfileListFragment) brandTabFragment, Integer.valueOf(10));
            if (!(this.f94531Q == null || this.f94531Q.getTabSetting() == null || this.f94531Q.getTabSetting().getBrandTab() == null)) {
                brandTabFragment.f66049e = this.f94531Q.getTabSetting().getBrandTab();
            }
            brandTabFragment.mo92306h(C43105eq.m136725a(10));
            brandTabFragment.mo65501a(this.f94531Q.getUid(), this.f94531Q.getSecUid());
            if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(10))) {
                z3 = true;
            }
            brandTabFragment.mo92305g(z3);
        } else if (i == 9) {
            C0608j childFragmentManager3 = getChildFragmentManager();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f94515y);
            sb3.append(m116964j(6));
            AggregationTabFragment aggregationTabFragment = (AggregationTabFragment) childFragmentManager3.mo2644a(sb3.toString());
            if (aggregationTabFragment == null) {
                aggregationTabFragment = new AggregationTabFragment();
                aggregationTabFragment.f66039f = true;
            }
            mo91942a((ProfileListFragment) aggregationTabFragment, Integer.valueOf(12));
            if (!(this.f94531Q == null || this.f94531Q.getTabSetting() == null || this.f94531Q.getTabSetting().getAggregationTab() == null)) {
                aggregationTabFragment.f66038e = this.f94531Q.getTabSetting().getAggregationTab();
            }
            aggregationTabFragment.mo92306h(C43105eq.m136725a(12));
            aggregationTabFragment.mo65501a(this.f94531Q.getUid(), this.f94531Q.getSecUid());
            if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(12))) {
                z3 = true;
            }
            aggregationTabFragment.mo92305g(z3);
        } else if (i == 4) {
            C0608j childFragmentManager4 = getChildFragmentManager();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(f94515y);
            sb4.append(m116964j(0));
            EffectListFragment effectListFragment = (EffectListFragment) childFragmentManager4.mo2644a(sb4.toString());
            if (effectListFragment == null) {
                int E = mo91939E();
                if (this.f94531Q == null) {
                    str3 = "";
                } else {
                    str3 = this.f94531Q.getUid();
                }
                if (this.f94531Q == null) {
                    str4 = "";
                } else {
                    str4 = this.f94531Q.getSecUid();
                }
                effectListFragment = C36143a.m116588a(E, str3, str4, true);
            }
            mo91942a((ProfileListFragment) effectListFragment, Integer.valueOf(6));
            effectListFragment.mo92306h(C43105eq.m136725a(6));
            effectListFragment.mo65501a(this.f94531Q.getUid(), this.f94531Q.getSecUid());
            if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(6))) {
                z3 = true;
            }
            effectListFragment.mo92305g(z3);
        } else if (i == 3) {
            C0608j childFragmentManager5 = getChildFragmentManager();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(f94515y);
            sb5.append(m116964j(0));
            OriginMusicListFragment originMusicListFragment = (OriginMusicListFragment) childFragmentManager5.mo2644a(sb5.toString());
            if (originMusicListFragment == null) {
                if (this.f94531Q == null) {
                    str2 = "";
                } else {
                    str2 = this.f94531Q.getUid();
                }
                originMusicListFragment = OriginMusicListFragment.m108624a(str2, true);
            }
            mo91942a((ProfileListFragment) originMusicListFragment, Integer.valueOf(3));
            originMusicListFragment.f87866e = this;
            originMusicListFragment.mo86063a(this.f94531Q.getUid());
            if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(3))) {
                z3 = true;
            }
            originMusicListFragment.mo92305g(z3);
            originMusicListFragment.mo92306h(C43105eq.m136725a(3));
        } else if (i == 0) {
            C0608j childFragmentManager6 = getChildFragmentManager();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(f94515y);
            sb6.append(m116964j(1));
            this.f94926aK = (C36340al) childFragmentManager6.mo2644a(sb6.toString());
            if (this.f94926aK == null) {
                this.f94926aK = m116962d((int) getResources().getDimension(R.dimen.my), 0);
            }
            mo91942a((ProfileListFragment) this.f94926aK, Integer.valueOf(0));
            this.f94926aK.mo90817a(this.f94427l);
            this.f94926aK.mo92454h(C43105eq.m136725a(0));
            C36340al alVar = this.f94926aK;
            if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(0))) {
                z2 = true;
            } else {
                z2 = false;
            }
            alVar.mo92453g(z2);
            C36340al alVar2 = this.f94926aK;
            if (this.f94528N == bD_()) {
                z3 = true;
            }
            alVar2.mo90832e(z3);
        } else if (i == 1) {
            C7213d.m22500a();
            if (C7213d.m22502aq()) {
                C0608j childFragmentManager7 = getChildFragmentManager();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(f94515y);
                sb7.append(m116964j(2));
                this.f94932ac = (ProfileCollectionFragmentForJedi) childFragmentManager7.mo2644a(sb7.toString());
                if (this.f94932ac == null) {
                    this.f94932ac = new ProfileCollectionFragmentForJedi();
                    ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi = this.f94932ac;
                    C42914ab a = C42914ab.m136242a();
                    String str5 = "enter_from";
                    if (TextUtils.isEmpty(this.f94930aa)) {
                        str = "personal_homepage";
                    } else {
                        str = this.f94930aa;
                    }
                    profileCollectionFragmentForJedi.setArguments(a.mo104633a(str5, str).f111445a);
                }
                mo91942a((ProfileListFragment) this.f94932ac, Integer.valueOf(8));
                return;
            }
            C0608j childFragmentManager8 = getChildFragmentManager();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(f94515y);
            sb8.append(m116964j(2));
            this.f94931ab = (ProfileListFragment) childFragmentManager8.mo2644a(sb8.toString());
            if (this.f94931ab == null) {
                this.f94931ab = UserStateFragment.m110246a("personal_homepage", C21115b.m71197a().getCurUserId(), C6861a.m21337f().getCurUser().getSecUid());
            }
            mo91942a(this.f94931ab, Integer.valueOf(5));
        } else {
            if (i == 2) {
                C0608j childFragmentManager9 = getChildFragmentManager();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(f94515y);
                sb9.append(m116964j(3));
                C36340al alVar3 = (C36340al) childFragmentManager9.mo2644a(sb9.toString());
                if (alVar3 == null) {
                    alVar3 = m116962d((int) getResources().getDimension(R.dimen.my), 1);
                }
                mo91942a((ProfileListFragment) alVar3, Integer.valueOf(1));
                alVar3.mo90831e(this.f94930aa);
                alVar3.mo90817a(this.f94427l);
                if (this.f94528N == mo91931q()) {
                    z = true;
                } else {
                    z = false;
                }
                alVar3.mo90832e(z);
                alVar3.mo92454h(C43105eq.m136725a(1));
                if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(1))) {
                    z3 = true;
                }
                alVar3.mo92453g(z3);
                this.f94948at = alVar3;
            }
        }
    }

    /* renamed from: a */
    public final void mo92086a(C28786aj ajVar) {
        this.f94913X = ajVar;
    }

    /* renamed from: a */
    public final void mo91698a(int i, int i2) {
        mo91947k(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92153a(long j, int i) throws Exception {
        C33250au auVar = (C33250au) new C33250au().mo85151b("personal_homepage").mo85150a(String.valueOf(j)).mo85283l(m116968n(i));
        if ("trends".equals(m116968n(i))) {
            auVar.mo85152c("list");
        }
        auVar.mo85252e();
        return null;
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (this.f94921aF) {
            this.f94934ae.mo66192a(i);
        }
        int currentItem = this.f94502o.getCurrentItem();
        if (currentItem >= 0 && currentItem < this.f94422g.getCount()) {
            Fragment a = this.f94422g.mo2423a(currentItem);
            if (a instanceof C36340al) {
                ((C36340al) a).mo90814a(i, i2);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94949au = new AnalysisStayTimeFragmentComponent(this, true);
        this.mScrollableLayout.addView(this.f94526L, 0);
        this.mScrollableLayout.f68001J = true;
        this.f94424i = (SpecifiedNumberAnimatedImageView) view.findViewById(R.id.a44);
        mo91872a();
        mo91954v().mo31605a(new MyProfileGuideWidget((ViewGroup) view));
    }

    /* renamed from: d */
    private static C36340al m116962d(int i, int i2) {
        if (C7213d.m22500a().mo18789ba()) {
            return JediAwemeListFragment.m115701a(i, i2, C21115b.m71197a().getCurUserId(), C6861a.m21337f().getCurUser().getSecUid(), true, false);
        }
        return C36102u.f94392a.newBasicAwemeListFragment(i, i2, C21115b.m71197a().getCurUserId(), C6861a.m21337f().getCurUser().getSecUid(), true, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92154a(View view, C22903bl blVar) {
        if (getActivity() != null && !getActivity().isFinishing() && !this.f94504q.isShowing()) {
            this.f94504q.mo90257a(view, 48, true, 0.0f);
            blVar.mo59871a(Boolean.valueOf(true));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) getActivity(), i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f94526L instanceof AbsMyCommonHeaderLayout) {
            ((AbsMyCommonHeaderLayout) this.f94526L).mo92529a(i, i2, intent);
        }
        if (this.f94941am != null) {
            this.f94941am.mo80249a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context activity = getActivity();
        if (activity == null) {
            activity = viewGroup.getContext();
        }
        this.f94526L = new C36532bd(activity, this, this.f94535U);
        this.f94526L.setClickEventListener(new C36485a() {
            /* renamed from: a */
            public final void mo92183a() {
                MyProfileFragment.this.f94535U.mo93199b(true);
            }

            /* renamed from: b */
            public final void mo92184b() {
                MyProfileFragment.this.f94535U.mo93200c(true);
            }
        });
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
