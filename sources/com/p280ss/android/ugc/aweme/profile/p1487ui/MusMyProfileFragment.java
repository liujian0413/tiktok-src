package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.p1058c.C23284c;
import com.p280ss.android.ugc.aweme.base.p1058c.C23285d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24570j;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28786aj;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowRelationTabActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33278t;
import com.p280ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.C35662a;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35666d;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35668f;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36342b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36327a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.C36580a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.presenter.C36050x;
import com.p280ss.android.ugc.aweme.profile.util.C36728am;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.p280ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget;
import com.p280ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37710c;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.C43150p;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;
import com.p280ss.android.ugc.aweme.viewmodel.Resource.Status;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusMyProfileFragment */
public class MusMyProfileFragment extends MusAbsProfileFragment implements C0053p<Resource<NewUserCount>>, C28343z, C33278t, C36039m, C36046t, C36327a, C36342b, C37708a, C37709b {

    /* renamed from: at */
    private static final boolean f94780at = C7163a.m22363a();

    /* renamed from: aA */
    private ImageView f94781aA;

    /* renamed from: aB */
    private View f94782aB;

    /* renamed from: aC */
    private boolean f94783aC = true;

    /* renamed from: aD */
    private C37716e f94784aD;

    /* renamed from: aE */
    private boolean f94785aE;

    /* renamed from: aF */
    private WidgetManager f94786aF;

    /* renamed from: aG */
    private MChooseAccountWidget f94787aG;

    /* renamed from: aH */
    private ImageView f94788aH;

    /* renamed from: aI */
    private Handler f94789aI = new Handler(Looper.getMainLooper());

    /* renamed from: aJ */
    private View f94790aJ;

    /* renamed from: al */
    protected View f94791al;

    /* renamed from: am */
    AnimationImageView f94792am;

    /* renamed from: an */
    RecommendPointView f94793an;

    /* renamed from: ao */
    C36340al f94794ao;

    /* renamed from: ap */
    protected C37710c f94795ap;

    /* renamed from: aq */
    protected String f94796aq;

    /* renamed from: ar */
    protected boolean f94797ar;

    /* renamed from: as */
    protected C28786aj f94798as;

    /* renamed from: au */
    private C36050x f94799au;

    /* renamed from: av */
    private C36011ai f94800av;

    /* renamed from: aw */
    private C35999a f94801aw;

    /* renamed from: ax */
    private boolean f94802ax;

    /* renamed from: ay */
    private int f94803ay;

    /* renamed from: az */
    private MyProfileViewModel f94804az;

    /* renamed from: N */
    public final void mo92082N() {
    }

    /* renamed from: O */
    public final void mo92083O() {
    }

    /* renamed from: P */
    public final void mo92084P() {
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo92085a(Aweme aweme) {
    }

    /* renamed from: a */
    public final void mo64929a(Object obj) {
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    /* renamed from: a */
    public final void mo91704a(boolean z, boolean z2, boolean z3) {
    }

    public final void bI_() {
    }

    public final void bJ_() {
    }

    /* renamed from: c_ */
    public final void mo83182c_(Exception exc) {
    }

    /* renamed from: d */
    public final void mo91715d() {
    }

    /* renamed from: e */
    public final void mo91720e() {
        super.mo91720e();
    }

    /* renamed from: e */
    public final void mo91723e(boolean z) {
    }

    /* renamed from: f */
    public final void mo91724f(int i) {
    }

    /* renamed from: f */
    public final void mo91725f(User user) {
    }

    /* renamed from: g */
    public final void mo91727g(int i) {
    }

    /* renamed from: k */
    public final void mo91947k(int i) {
    }

    @C7709l
    public void onHidePerfectInfoGuideEvent(C35666d dVar) {
    }

    /* renamed from: r */
    public final boolean mo62081r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo91958z() {
        return R.layout.pc;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92087a(Boolean bool) {
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            if (this.f94794ao != null && this.f94540z.get(this.f94528N) == this.f94794ao) {
                this.f94794ao.mo90829d(bool.booleanValue());
            }
            if (bool.booleanValue()) {
                onPageSelected(this.f94528N);
            }
        }
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        if (this.f94801aw != null) {
            this.f94801aw.mo91617g();
        }
        if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
            C6906g.m21511a(getActivity(), "profile_image_setting", "review_failure");
        }
        C22814a.m75245a(getActivity(), exc, R.string.d0);
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        if (this.f94801aw != null) {
            this.f94801aw.mo91615e();
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (i == 4) {
            if (this.f94801aw != null) {
                this.f94801aw.mo91617g();
            }
            C22814a.m75245a(getActivity(), exc, R.string.d80);
        }
    }

    /* renamed from: y */
    public final boolean mo91957y() {
        return super.mo91957y();
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

    public void onStop() {
        super.onStop();
        C21115b.m71197a().updateLeaveTime(System.currentTimeMillis());
    }

    /* renamed from: U */
    private WidgetManager m116774U() {
        if (this.f94786aF == null) {
            this.f94786aF = WidgetManager.m75867a((Fragment) this, getView());
        }
        return this.f94786aF;
    }

    /* renamed from: V */
    private C36011ai m116775V() {
        if (this.f94800av == null) {
            this.f94800av = new C36011ai();
            this.f94800av.f94200a = this;
        }
        return this.f94800av;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo91939E() {
        return C21085a.m71117a().mo56926b() + this.f94791al.getHeight() + this.mStatusView.getHeight();
    }

    public final void bC_() {
        if (this.f94739k != null && this.f94739k.getCurrentItem() != 0) {
            this.f94739k.setCurrentItem(0, false);
        }
    }

    public String getUserId() {
        if (TextUtils.isEmpty(C33230ac.m107217b(this.f94531Q))) {
            return C21115b.m71197a().getCurUserId();
        }
        return C33230ac.m107217b(this.f94531Q);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f94799au != null) {
            this.f94799au.mo59134U_();
        }
        if (this.f94795ap != null) {
            this.f94795ap.mo59134U_();
        }
        if (this.f94784aD != null) {
            this.f94784aD.mo59134U_();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f94797ar) {
            mo92045J();
        }
        if (this.f94804az != null) {
            this.f94804az.f96539c.setValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: Q */
    private OriginMusicListFragment m116771Q() {
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f94515y);
        sb.append(0);
        Fragment a = childFragmentManager.mo2644a(sb.toString());
        if (a instanceof OriginMusicListFragment) {
            return (OriginMusicListFragment) a;
        }
        return OriginMusicListFragment.m108624a(C21115b.m71197a().getCurUserId(), true);
    }

    /* renamed from: T */
    private void m116773T() {
        if (af_() && !this.f94783aC) {
            if (!C36370bk.m117620a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            } else {
                this.f94799au.mo56976a(new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo91936A() {
        if (isViewValid()) {
            C6907h.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("personal_homepage"));
            C6907h.m21524a("click_follow_count", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").f60753a);
            FollowRelationTabActivity.m97191a(getActivity(), this.f94531Q, "following_relation");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo91937B() {
        if (isViewValid()) {
            C6907h.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("personal_homepage"));
            C6907h.m21524a("click_fans_count", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").f60753a);
            FollowRelationTabActivity.m97191a(getActivity(), this.f94531Q, "follower_relation");
        }
    }

    /* renamed from: K */
    public final void mo92079K() {
        if (this.f94799au != null) {
            this.f94531Q = C21115b.m71197a().getCurUser();
            m116777o(this.f94531Q);
            mo92055i(this.f94531Q);
            if (C21115b.m71197a().shouldRefresh() || this.f94802ax) {
                m116773T();
            }
            this.f94802ax = false;
        }
    }

    /* renamed from: L */
    public final void mo92080L() {
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            Context context = getContext();
            if (isViewValid() && this.f94525K != null && this.f94531Q != null && context != null) {
                UserVerify userVerify = new UserVerify(null, this.f94531Q.getCustomVerify(), this.f94531Q.getEnterpriseVerifyReason(), null, null);
                C43126fg.m136800a(context, userVerify, this.f94525K);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo91938D() {
        if (isViewValid() && this.f94531Q != null && !this.f94531Q.isLive()) {
            if (this.f94782aB.getVisibility() == 0) {
                if (this.f94801aw == null) {
                    this.f94801aw = new C35999a();
                    this.f94801aw.f94183c = this;
                    this.f94801aw.mo80250b(getActivity(), this);
                }
                this.f94801aw.mo91612a(0, getActivity(), this.f94736h, this.f94531Q);
                return;
            }
            C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("author_id", this.f94531Q.getUid()).mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_head").f60753a);
            HeaderDetailActivity.m116638a(getActivity(), this.f94736h, this.f94531Q, true, mo92058n());
        }
    }

    /* renamed from: M */
    public final void mo92081M() {
        if (this.f94781aA != null && !C43122ff.m136767b()) {
            try {
                UgProfileActivityButton profileActivityButton = C30199h.m98861a().getAwemeActivitySetting().getProfileActivityButton();
                if (profileActivityButton != null) {
                    final String h5Link = profileActivityButton.getH5Link();
                    if (!C35662a.m115265a().mo90513f() || TextUtils.isEmpty(h5Link)) {
                        this.f94781aA.setVisibility(8);
                        return;
                    }
                    this.f94781aA.setVisibility(0);
                    C6907h.m21524a("gift_entrance_show", (Map) new C22984d().mo59973a("bubble_type", "coupon_fission").mo59973a("enter_from", "personal_homepage").f60753a);
                    this.f94781aA.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            Intent intent = new Intent(MusMyProfileFragment.this.getContext(), CrossPlatformActivity.class);
                            intent.setFlags(268435456);
                            C6907h.m21524a("gift_entrance_click", (Map) new C22984d().mo59973a("bubble_type", "coupon_fission").mo59973a("enter_from", "personal_homepage").f60753a);
                            intent.setData(Uri.parse(h5Link));
                            C6399b.m19921a().startActivity(intent);
                        }
                    });
                }
            } catch (NullValueException unused) {
            }
        }
    }

    /* renamed from: S */
    private void m116772S() {
        if (isViewValid() && this.f94525K != null && this.f94531Q != null) {
            if (!this.f94531Q.isSecret() && this.f94531Q.nicknameUpdateReminder()) {
                String str = " T";
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(this.f94525K.getText());
                spannableStringBuilder.append(str);
                spannableStringBuilder.setSpan(new C36728am(getContext(), R.drawable.a6w, 1), (spannableStringBuilder.length() - str.length()) + 1, spannableStringBuilder.length(), 17);
                this.f94525K.setText(spannableStringBuilder);
                if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
                    this.f94525K.setTextColor(getResources().getColor(R.color.ab0));
                } else {
                    this.f94525K.setTextColor(getResources().getColor(R.color.ac9));
                }
            } else if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
                this.f94525K.setTextColor(getResources().getColor(R.color.ab0));
            } else {
                this.f94525K.setTextColor(getResources().getColor(R.color.ac8));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo91875g() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f94796aq = arguments.getString("enter_from");
            this.f94535U.mo93198b(this.f94796aq);
        }
        this.f94531Q = C21115b.m71197a().getCurUser();
        super.mo91875g();
        if (!((Boolean) SharePrefCache.inst().getHasEnterBindPhone().mo59877d()).booleanValue()) {
            C21115b.m71197a().queryUser();
        }
        this.f94799au = new C36050x();
        this.f94799au.mo66537a(this);
        this.f94799au.mo56976a(new Object[0]);
        this.f94799au.f94286a = this.f94527M;
        this.f94804az = (MyProfileViewModel) C0069x.m157a((Fragment) this).mo147a(MyProfileViewModel.class);
        this.f94804az.f96537a.observe(this, this);
        this.f94804az.f96539c.observe(this, new C36369bj(this));
        this.f94804az.mo93148a();
        this.f94795ap = new C37710c();
        this.f94795ap.mo66537a(this);
        this.f94784aD = new C37716e();
        this.f94784aD.mo66537a(this);
        this.f94784aD.mo56976a(new Object[0]);
        mo92043G();
    }

    public void onResume() {
        super.onResume();
        mo92079K();
        if (this.f94793an.f95226a) {
            this.f94793an.mo92331a();
        }
        if (this.f94794ao != null && !this.f94783aC) {
            this.f94794ao.mo71270t();
        }
        this.f94783aC = false;
        if (this.f94804az != null && this.f94797ar) {
            this.f94804az.f96539c.setValue(Boolean.valueOf(true));
        }
        if (this.f94785aE) {
            this.f94785aE = false;
            for (Fragment fragment : this.f94540z) {
                if (fragment instanceof C36346ao) {
                    ((C36346ao) fragment).mo90811A();
                }
            }
        }
        if (this.f94797ar) {
            if (!TextUtils.isEmpty(this.f94531Q.getBioEmail())) {
                C36580a.m118031a("personal_homepage", "email", this.f94531Q);
            }
            if (!TextUtils.isEmpty(this.f94531Q.getBioUrl())) {
                C36580a.m118031a("personal_homepage", "weblink", this.f94531Q);
            }
            C36580a.m118029a(mo92790p(this.f94528N));
        }
    }

    /* renamed from: c */
    public final void mo91711c(int i) {
        super.mo91711c(i);
    }

    @C7709l
    public void onSaveUserDataEvent(C35668f fVar) {
        this.f94802ax = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91873a(View view) {
        super.mo91873a(view);
        this.f94790aJ = view;
    }

    @C7709l
    public void onUpdateUserSuccessEvent(C23285d dVar) {
        C21115b.m71197a().queryUser();
    }

    /* renamed from: d */
    public void mo91717d(User user) {
        super.mo91717d(user);
        this.f94746r.mo92000a(this.f94531Q, (Aweme) null);
    }

    public void onMore(View view) {
        if (!C27326a.m89578a(view)) {
            mo92067s();
        }
    }

    @C7709l
    public void onMyEnterpriseProfileEvent(C24570j jVar) {
        if (jVar.f64814a == 1) {
            this.f94785aE = true;
        }
    }

    @C7709l
    public void onUpdateUserEvent(C23284c cVar) {
        this.f94802ax = false;
        this.f94531Q = cVar.f61319a;
        m116777o(this.f94531Q);
    }

    /* renamed from: a */
    public final void mo91701a(UrlModel urlModel) {
        super.mo91701a(urlModel);
        if (this.f94531Q.avatarUpdateReminder()) {
            this.f94782aB.setVisibility(0);
        } else {
            this.f94782aB.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo91706b(User user) {
        if (user == null || !user.isSecret()) {
            this.f94788aH.setVisibility(8);
        } else {
            this.f94788aH.setVisibility(0);
        }
    }

    /* renamed from: c */
    public void mo91713c(String str) {
        super.mo91713c(str);
        mo92080L();
        m116772S();
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/user/?")) {
            C42961az.m136385f(aVar);
            m116773T();
        }
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("user", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getActivity(), this.f94791al, shareCompleteEvent);
        }
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        if (this.f94794ao != null && this.f94794ao == this.f94540z.get(this.f94528N) && !this.f94783aC) {
            this.f94794ao.mo71270t();
        }
    }

    public void setUserVisibleHint(boolean z) {
        this.f94797ar = z;
        super.setUserVisibleHint(z);
        if (z) {
            C36580a.m118029a(mo92790p(this.f94528N));
        }
    }

    /* renamed from: o */
    private void m116777o(User user) {
        if (this.f94799au != null && user != null) {
            this.f94535U.mo93194a(user);
            this.f94799au.mo91623a(user);
            this.f94749u.setVisibility(8);
            if (ProfileNewStyleExperiment.INSTANCE.getCOMMOM_M()) {
                this.f94787aG.mo93213a(user);
            }
        }
    }

    /* renamed from: p */
    private String mo92790p(int i) {
        String str = "";
        if (this.f94516A == null || this.f94516A.size() == 0 || i >= this.f94516A.size()) {
            return str;
        }
        return C43105eq.m136725a(((Integer) this.f94516A.get(i)).intValue());
    }

    /* renamed from: a */
    public final void mo92086a(C28786aj ajVar) {
        this.f94798as = ajVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92050b(View view) {
        if (this.f94531Q.nicknameUpdateReminder()) {
            C6907h.m21524a("enter_profile_username", (Map) C22984d.m75611a().mo59973a("enter_method", "click_edit_username").f60753a);
            mo92047a(C42914ab.m136242a().mo104630a("need_focus_id_input", 1).f111445a);
            return;
        }
        super.mo92050b(view);
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, C21115b.m71197a().getCurUserId()) || !followStatus.isFollowSucess) {
            return;
        }
        if (followStatus.followStatus == 0) {
            C21115b.m71197a().updateCurFollowingCount(-1);
        } else {
            C21115b.m71197a().updateCurFollowingCount(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Resource<NewUserCount> resource) {
        if (!(resource == null || resource.f112150b == null || resource.f112149a != Status.SUCCESS)) {
            int i = ((NewUserCount) resource.f112150b).count;
            if (i <= 0) {
                this.f94793an.setVisibility(8);
                return;
            }
            C6907h.onEvent(MobClick.obtain().setEventName("tip_show").setLabelName("recommend_friends"));
            C6907h.m21524a("add_friends_notice", (Map) C22984d.m75611a().mo59973a("action_type", "show").f60753a);
            this.f94803ay = i;
            this.f94793an.mo92331a();
        }
    }

    public void addFriends(View view) {
        this.f94793an.setShouldHide(true);
        Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), this.f94803ay, 1, "", "personal_homepage");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
        }
        C33228ab.m107200a("click_add_friends").mo85057b("enter_from", "personal_homepage").mo85252e();
        if (this.f94803ay > 0) {
            C6907h.m21524a("add_friends_notice", (Map) C22984d.m75611a().mo59973a("action_type", "click").f60753a);
        }
        this.f94803ay = 0;
    }

    /* renamed from: i */
    public final void mo92090i(View view) {
        User curUser = C21115b.m71197a().getCurUser();
        QRCodeActivityV2.m119235a(getContext(), new C36995a().mo93428a(4, C43122ff.m136788s(curUser), "personal_homepage").mo93433a(C43122ff.m136789t(curUser), C43122ff.m136790u(curUser), C43122ff.m136783n(curUser)).f96920a);
        if (curUser != null) {
            C25652b bVar = new C25652b();
            bVar.mo66536a(new C28442a());
            bVar.mo56976a(curUser.getUid(), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(4), "qr_code");
        }
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if ("USER".equals(this.mTag)) {
            int i = anVar.f74631a;
            if (i != 2) {
                if (i != 13) {
                    if (i == 15) {
                        if (anVar.f74633c == 0) {
                            C21115b.m71197a().updateCurAwemeCount(1);
                        }
                    } else {
                        return;
                    }
                } else if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById((String) anVar.f74632b).getUserDigg() == 1) {
                    C21115b.m71197a().updateCurFavoritingCount(1);
                } else {
                    C21115b.m71197a().updateCurFavoritingCount(-1);
                }
            } else if (anVar.f74633c == 0) {
                C21115b.m71197a().updateCurAwemeCount(-1);
            }
            User curUser = C21115b.m71197a().getCurUser();
            mo91711c(curUser.getAwemeCount());
            mo91716d(curUser.getFavoritingCount());
        }
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (getActivity() != null) {
            if (this.f94801aw != null) {
                this.f94801aw.mo91617g();
            }
            if (avatarUri == null) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.d0).mo25750a();
            } else {
                m116775V().mo91648d(avatarUri.uri);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo91944c(View view) {
        super.mo91944c(view);
        this.f94782aB = view.findViewById(R.id.c58);
        View findViewById = view.findViewById(R.id.jo);
        View findViewById2 = view.findViewById(R.id.e7);
        View findViewById3 = view.findViewById(R.id.c2r);
        findViewById3.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    MusMyProfileFragment.this.mo92090i(view);
                }
            }
        });
        this.f94792am = (AnimationImageView) view.findViewById(R.id.ew);
        this.f94791al = view.findViewById(R.id.djz);
        this.f94793an = (RecommendPointView) view.findViewById(R.id.cp4);
        if ("from_main".equals(this.f94527M)) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
        } else {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (MusMyProfileFragment.this.f94798as != null) {
                        MusMyProfileFragment.this.f94798as.mo74012a();
                        return;
                    }
                    if (MusMyProfileFragment.this.getActivity() != null && !MusMyProfileFragment.this.getActivity().isFinishing()) {
                        MusMyProfileFragment.this.getActivity().finish();
                    }
                }
            });
            findViewById2.setVisibility(8);
            if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE() && this.f94750v != null) {
                this.f94750v.setVisibility(4);
            }
        }
        if (C43122ff.m136767b()) {
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        }
        if (getView() != null && ProfileNewStyleExperiment.INSTANCE.getCOMMOM_M()) {
            MChooseAccountWidget mChooseAccountWidget = new MChooseAccountWidget(getView(), findViewById3, this.f94791al, view.findViewById(R.id.title), view.findViewById(R.id.a0), view.findViewById(R.id.cr1));
            this.f94787aG = mChooseAccountWidget;
            m116774U().mo60152a(LayoutInflater.from(getContext()).inflate(R.layout.a0w, (ViewGroup) getView(), false), (Widget) this.f94787aG);
        }
        this.f94736h.setBorderColor(R.color.ye);
        this.f94788aH = (ImageView) view.findViewById(R.id.bv4);
        this.f94781aA = (ImageView) view.findViewById(R.id.c2l);
        mo92081M();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z && this.f94804az != null) {
            this.f94804az.mo93148a();
        }
        if (z) {
            mo92045J();
        } else {
            mo92044I();
        }
        if (this.f94716ab != null) {
            this.f94716ab.mo60573a(z);
        }
        if (this.f94804az != null) {
            this.f94804az.f96539c.setValue(Boolean.valueOf(!z));
        }
        if (!z) {
            if (!TextUtils.isEmpty(this.f94531Q.getBioEmail())) {
                C36580a.m118031a("personal_homepage", "email", this.f94531Q);
            }
            if (!TextUtils.isEmpty(this.f94531Q.getBioUrl())) {
                C36580a.m118031a("personal_homepage", "weblink", this.f94531Q);
            }
        }
        this.f94535U.mo93201d(z);
        for (Fragment fragment : getChildFragmentManager().mo2658f()) {
            if (fragment instanceof OriginMusicListFragment) {
                fragment.onHiddenChanged(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo91702a(User user) {
        super.mo91702a(user);
        mo91925h(this.f94531Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo91949l(int i) {
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            C0608j childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append(MusAbsProfileFragment.f94515y);
            sb.append(1);
            C36340al alVar = (C36340al) childFragmentManager.mo2644a(sb.toString());
            if (alVar == null) {
                alVar = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment(C21085a.m71117a().mo56926b(), 0, C21115b.m71197a().getCurUserId(), C6861a.m21337f().getCurUser().getSecUid(), true, false);
            }
            mo91942a((ProfileListFragment) alVar, Integer.valueOf(0));
            alVar.mo90817a(this.f94722ah);
            if (this.f94528N != this.f94516A.indexOf(Integer.valueOf(0))) {
                z2 = false;
            }
            alVar.mo90832e(z2);
            alVar.mo92454h(C43105eq.m136725a(0));
        } else if (i == 2) {
            C0608j childFragmentManager2 = getChildFragmentManager();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(MusAbsProfileFragment.f94515y);
            sb2.append(2);
            this.f94794ao = (C36340al) childFragmentManager2.mo2644a(sb2.toString());
            if (this.f94794ao == null) {
                this.f94794ao = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment(C21085a.m71117a().mo56926b(), 1, C21115b.m71197a().getCurUserId(), C6861a.m21337f().getCurUser().getSecUid(), true, false);
            }
            mo91942a((ProfileListFragment) this.f94794ao, Integer.valueOf(1));
            this.f94794ao.mo90831e(this.f94796aq);
            this.f94794ao.mo90817a(this.f94722ah);
            C36340al alVar2 = this.f94794ao;
            if (this.f94528N == this.f94516A.indexOf(Integer.valueOf(1))) {
                z = true;
            }
            alVar2.mo90832e(z);
            this.f94794ao.mo92454h(C43105eq.m136725a(1));
        } else {
            if (i == 3) {
                OriginMusicListFragment Q = m116771Q();
                mo91942a((ProfileListFragment) Q, Integer.valueOf(3));
                Q.mo92306h(C43105eq.m136725a(3));
                Q.mo92305g(true);
                Q.f87866e = this;
                Q.mo65501a(C21115b.m71197a().getCurUserId(), C6861a.m21337f().getCurUser().getSecUid());
            }
        }
    }

    /* renamed from: a */
    public final void mo83181a(C37723b bVar) {
        if (bVar != null && bVar.f98281q == 1) {
            this.f94535U.mo93197b(bVar.f98280p);
        }
    }

    /* renamed from: a */
    public final void mo91698a(int i, int i2) {
        mo91947k(i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo91954v().mo31605a(new MyProfileGuideWidget((ViewGroup) view));
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        if (i == 4) {
            if (this.f94801aw != null) {
                this.f94801aw.mo91617g();
            }
            mo91701a(C43150p.m136858b(this.f94531Q));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) getActivity(), i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 20001) {
            if (i2 == -1) {
                int intExtra = intent.getIntExtra("recommend_count", -1);
                if (intExtra == -1) {
                    intExtra = this.f94803ay;
                }
                this.f94803ay = intExtra;
                if (this.f94803ay == 0) {
                    this.f94793an.setShouldHide(true);
                }
            }
        } else if (this.f94801aw != null) {
            this.f94801aw.mo80249a(i, i2, intent);
        }
    }

    /* renamed from: b */
    public final void mo91710b(boolean z, boolean z2, boolean z3) {
        if (this.f94792am != null) {
            if (!z || !C41983b.m133444a()) {
                this.f94736h.setBorderColor(R.color.dy);
                this.f94792am.mo7085f();
                this.f94792am.setVisibility(8);
                return;
            }
            C41989d.m133476a(getContext(), true, 0, this.f94531Q.getRequestId(), this.f94531Q.getUid(), this.f94531Q.roomId);
            this.f94736h.setBorderColor(R.color.a79);
            this.f94736h.setBorderWidth(2);
            this.f94792am.setVisibility(0);
            this.f94792am.setAnimation("tag_profile_live.json");
            this.f94792am.mo7078b();
        }
    }
}
