package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11502e.C11503a;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11592h.C11593a;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.C21647ag;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.arch.C23274b;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23755a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23765c;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23765c.C23766a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23783h;
import com.p280ss.android.ugc.aweme.challenge.service.C23701a;
import com.p280ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;
import com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel.C23812a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.p280ss.android.ugc.aweme.detail.C26060f;
import com.p280ss.android.ugc.aweme.detail.C26116k;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33267i;
import com.p280ss.android.ugc.aweme.metrics.C33277s;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import kotlin.C7541d;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment */
public class ChallengeDetailFragment extends BaseDetailFragment implements C11497af<C23274b>, C11592h {

    /* renamed from: h */
    static final /* synthetic */ C7595j[] f62502h = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mStatusBar", "getMStatusBar()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mRecordView", "getMRecordView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mRefreshLayout", "getMRefreshLayout()Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeSwipeRefreshLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mShareButton", "getMShareButton()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mHeaderContainer", "getMHeaderContainer()Landroid/widget/LinearLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mJediViewModel", "getMJediViewModel()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailJediViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChallengeDetailFragment.class), "mTabViews", "getMTabViews()Ljava/util/HashMap;"))};

    /* renamed from: q */
    public static final C23711a f62503q = new C23711a(null);

    /* renamed from: J */
    private final C7541d f62504J = C23754h.m77885a(new C23722l(this));

    /* renamed from: K */
    private final C7541d f62505K = C23754h.m77885a(new C23719i(this));

    /* renamed from: L */
    private final C7541d f62506L = C23754h.m77885a(new C23720j(this));

    /* renamed from: M */
    private final C7541d f62507M = C23754h.m77885a(new C23723m(this));

    /* renamed from: N */
    private final C7541d f62508N = C23754h.m77885a(new C23721k(this));

    /* renamed from: O */
    private final C7541d f62509O = C23754h.m77885a(new C23718h(this));

    /* renamed from: P */
    private C23755a f62510P;

    /* renamed from: Q */
    private C23765c f62511Q;

    /* renamed from: R */
    private ChallengeDetail f62512R;

    /* renamed from: S */
    private int f62513S = -1;

    /* renamed from: T */
    private DetailAwemeListFragment f62514T;

    /* renamed from: U */
    private final lifecycleAwareLazy f62515U;

    /* renamed from: V */
    private final C7541d f62516V;

    /* renamed from: W */
    private final C7541d f62517W;

    /* renamed from: X */
    private float f62518X;

    /* renamed from: Y */
    private float f62519Y;

    /* renamed from: Z */
    private int f62520Z;

    /* renamed from: aa */
    private HashMap f62521aa;

    /* renamed from: i */
    public C23701a f62522i;

    /* renamed from: j */
    public DetailAwemeListFragment f62523j;

    /* renamed from: k */
    public ChallengeDetailParam f62524k;

    /* renamed from: l */
    public String f62525l;

    /* renamed from: m */
    public Challenge f62526m;

    /* renamed from: n */
    public String f62527n;

    /* renamed from: o */
    public String f62528o;

    /* renamed from: p */
    public C23274b f62529p = new C23274b();

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$a */
    public static final class C23711a {
        private C23711a() {
        }

        public /* synthetic */ C23711a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ChallengeDetailFragment m77780a(ChallengeDetailParam challengeDetailParam) {
            C7573i.m23587b(challengeDetailParam, "param");
            ChallengeDetailFragment challengeDetailFragment = new ChallengeDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("challenge_detail_param", challengeDetailParam);
            challengeDetailFragment.setArguments(bundle);
            return challengeDetailFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$b */
    static final class C23712b implements C26116k {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62530a;

        C23712b(ChallengeDetailFragment challengeDetailFragment) {
            this.f62530a = challengeDetailFragment;
        }

        /* renamed from: a */
        public final void mo61715a(boolean z, boolean z2) {
            if (z && !TextUtils.isEmpty(ChallengeDetailFragment.m77742b(this.f62530a).getFromToken())) {
                C33277s p = new C33277s().mo85334k(ChallengeDetailFragment.m77743c(this.f62530a)).mo85336p(ChallengeDetailFragment.m77744d(this.f62530a).mo61753m());
                String fromToken = ChallengeDetailFragment.m77742b(this.f62530a).getFromToken();
                if (fromToken == null) {
                    C7573i.m23580a();
                }
                p.mo85330f(fromToken).mo85252e();
            }
            if (!z && this.f62530a.mo61703j().f61506b) {
                this.f62530a.mo61703j().setRefreshing(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$c */
    static final class C23713c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62531a;

        /* renamed from: b */
        final /* synthetic */ C7562b f62532b;

        C23713c(ChallengeDetailFragment challengeDetailFragment, C7562b bVar) {
            this.f62531a = challengeDetailFragment;
            this.f62532b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                C23701a a = ChallengeDetailFragment.m77739a(this.f62531a);
                C7573i.m23582a((Object) view, "it");
                if (!a.mo61667a(view.getId())) {
                    this.f62532b.invoke(view);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$d */
    static final class C23714d implements C23386b {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62533a;

        C23714d(ChallengeDetailFragment challengeDetailFragment) {
            this.f62533a = challengeDetailFragment;
        }

        /* renamed from: a */
        public final void mo60744a() {
            this.f62533a.mo61699a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$e */
    static final class C23715e extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62534a;

        C23715e(ChallengeDetailFragment challengeDetailFragment) {
            this.f62534a = challengeDetailFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m77783a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m77783a(View view) {
            C7573i.m23587b(view, "it");
            if (this.f62534a.f62526m != null) {
                this.f62534a.mo61714s();
                if (C6399b.m19944t()) {
                    C33267i d = new C33267i().mo85268d("challenge_hot");
                    String awemeId = ChallengeDetailFragment.m77742b(this.f62534a).getAwemeId();
                    if (awemeId == null) {
                        awemeId = "";
                    }
                    d.mo85274j(awemeId).mo85252e();
                    C6907h.m21524a("share_challenge", (Map) C22984d.m75611a().mo59973a("enter_from", "challenge_hot").mo59973a("group_id", ChallengeDetailFragment.m77742b(this.f62534a).getAwemeId()).mo59973a("challenge_id", ChallengeDetailFragment.m77743c(this.f62534a)).mo59973a("process_id", this.f62534a.f62528o).f60753a);
                }
                if (!C6399b.m19944t()) {
                    ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("share");
                }
                C21647ag T = C6903bc.m21479T();
                FragmentActivity activity = this.f62534a.getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                T.mo57874a(activity, this.f62534a.f62526m, this.f62534a.mo61708o(), ChallengeDetailFragment.m77743c(this.f62534a), ChallengeDetailFragment.m77742b(this.f62534a).isHashTag(), ChallengeDetailFragment.m77744d(this.f62534a).mo61752l().toString(), this.f62534a.f62528o);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$f */
    static final class C23716f extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62535a;

        C23716f(ChallengeDetailFragment challengeDetailFragment) {
            this.f62535a = challengeDetailFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m77784a((View) obj);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:87:0x01ef  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x020a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m77784a(android.view.View r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23587b(r10, r0)
                com.ss.android.ugc.aweme.antiaddic.lock.b r10 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
                boolean r10 = r10.mo59240a()
                if (r10 == 0) goto L_0x0028
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r10 = r9.f62535a
                android.support.v4.app.FragmentActivity r10 = r10.getActivity()
                android.content.Context r10 = (android.content.Context) r10
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r9.f62535a
                r1 = 2131827224(0x7f111a18, float:1.9287355E38)
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.c.a r10 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r10, r0)
                r10.mo25750a()
                return
            L_0x0028:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r10 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r10 = r10.f62526m
                r0 = 0
                if (r10 == 0) goto L_0x0034
                java.lang.String r10 = r10.getSpringGameId()
                goto L_0x0035
            L_0x0034:
                r10 = r0
            L_0x0035:
                boolean r10 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r10)
                if (r10 == 0) goto L_0x0061
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r10 = r9.f62535a
                android.content.Context r10 = r10.getContext()
                if (r10 == 0) goto L_0x0060
                com.ss.android.ugc.aweme.ak r1 = com.p280ss.android.ugc.aweme.C21780t.m72807a()
                java.lang.String r2 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r10, r2)
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r2 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r2 = r2.f62526m
                if (r2 == 0) goto L_0x0056
                java.lang.String r0 = r2.getSpringGameId()
            L_0x0056:
                if (r0 != 0) goto L_0x005b
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x005b:
                r2 = -1
                r1.mo57892a(r10, r0, r2)
                return
            L_0x0060:
                return
            L_0x0061:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r10 = r9.f62535a
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                r10.f62527n = r1
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r10 = r9.f62535a
                r10.aj_()
                com.ss.android.ugc.aweme.framework.services.ServiceManager r10 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r10 = r10.getService(r1)
                com.ss.android.ugc.aweme.services.IAVService r10 = (com.p280ss.android.ugc.aweme.services.IAVService) r10
                if (r10 == 0) goto L_0x00b2
                boolean r1 = r10.needLoginBeforeRecord()
                if (r1 == 0) goto L_0x00b2
                boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r1 != 0) goto L_0x00b2
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r10 = r9.f62535a
                r0 = 2131826770(0x7f111852, float:1.9286434E38)
                java.lang.String r10 = r10.getString(r0)
                java.lang.String r0 = "getString(R.string.shoot_after_login)"
                kotlin.jvm.internal.C7573i.m23582a(r10, r0)
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r9.f62535a
                android.support.v4.app.Fragment r0 = (android.support.p022v4.app.Fragment) r0
                java.lang.String r1 = "challenge"
                java.lang.String r2 = "click_challenge_shoot"
                com.ss.android.ugc.aweme.utils.ab r3 = com.p280ss.android.ugc.aweme.utils.C42914ab.m136242a()
                java.lang.String r4 = "login_title"
                com.ss.android.ugc.aweme.utils.ab r10 = r3.mo104633a(r4, r10)
                android.os.Bundle r10 = r10.f111445a
                com.p280ss.android.ugc.aweme.login.C32656f.m105747a(r0, r1, r2, r10)
                return
            L_0x00b2:
                java.lang.String r1 = "avService"
                kotlin.jvm.internal.C7573i.m23582a(r10, r1)
                com.ss.android.ugc.aweme.services.publish.IPublishService r1 = r10.getPublishService()
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r2 = r9.f62535a
                android.content.Context r2 = r2.getContext()
                boolean r1 = r1.checkIsAlreadyPublished(r2)
                if (r1 != 0) goto L_0x00c8
                return
            L_0x00c8:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r1 = r1.f62526m
                if (r1 != 0) goto L_0x00cf
                return
            L_0x00cf:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r2 = r9.f62535a
                android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                boolean r3 = r2 instanceof com.p280ss.android.ugc.aweme.base.AmeActivity
                if (r3 != 0) goto L_0x00da
                r2 = r0
            L_0x00da:
                com.ss.android.ugc.aweme.base.AmeActivity r2 = (com.p280ss.android.ugc.aweme.base.AmeActivity) r2
                if (r2 != 0) goto L_0x00df
                return
            L_0x00df:
                com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r4 = com.p280ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r3 = r3.getService(r4)
                com.ss.android.ugc.aweme.services.IAVService r3 = (com.p280ss.android.ugc.aweme.services.IAVService) r3
                com.ss.android.ugc.aweme.services.video.IAVPublishService r3 = r3.publishService()
                r3.addChallenge(r1)
                com.ss.android.ugc.aweme.services.video.IAVPublishService r3 = r10.publishService()
                r3.setCurMusic(r0)
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r5 = com.p280ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r4 = r4.getService(r5)
                com.ss.android.ugc.aweme.services.IAVService r4 = (com.p280ss.android.ugc.aweme.services.IAVService) r4
                com.ss.android.ugc.aweme.services.settings.IAVSettingsService r4 = r4.avSettingsService()
                boolean r4 = r4.enableStatusMode()
                int r5 = r1.getStatus()
                r6 = 0
                r7 = 1
                if (r5 != r7) goto L_0x011e
                if (r4 == 0) goto L_0x011e
                r4 = 1
                goto L_0x011f
            L_0x011e:
                r4 = 0
            L_0x011f:
                java.lang.String r5 = "extra_to_status"
                r3.putExtra(r5, r4)
                if (r4 != 0) goto L_0x013b
                java.lang.String r4 = r1.getMvId()
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 != 0) goto L_0x013b
                java.lang.String r4 = "extra_bind_mv_id"
                java.lang.String r5 = r1.getMvId()
                r3.putExtra(r4, r5)
            L_0x013b:
                java.lang.String r4 = "shoot_way"
                java.lang.String r5 = "challenge"
                r3.putExtra(r4, r5)
                java.lang.String r4 = "creation_id"
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r5 = r9.f62535a
                java.lang.String r5 = r5.f62527n
                r3.putExtra(r4, r5)
                java.lang.String r4 = "translation_type"
                r5 = 3
                r3.putExtra(r4, r5)
                java.lang.String r4 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
                r3.putExtra(r4, r7)
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r4 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r4 = r4.f62526m
                if (r4 == 0) goto L_0x016a
                com.ss.android.ugc.aweme.shortvideo.r.a r4 = new com.ss.android.ugc.aweme.shortvideo.r.a
                r4.<init>()
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r4 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r4 = r4.f62526m
                com.ss.android.ugc.aweme.shortvideo.AVChallenge r4 = com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40248a.m128593a(r4)
                goto L_0x016b
            L_0x016a:
                r4 = r0
            L_0x016b:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r5 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r5 = r5.f62526m
                if (r5 == 0) goto L_0x0176
                java.lang.String r5 = r5.getCid()
                goto L_0x0177
            L_0x0176:
                r5 = r0
            L_0x0177:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x0190
                java.lang.String r5 = "tag_id"
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r8 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r8 = r8.f62526m
                if (r8 == 0) goto L_0x018c
                java.lang.String r8 = r8.getCid()
                goto L_0x018d
            L_0x018c:
                r8 = r0
            L_0x018d:
                r3.putExtra(r5, r8)
            L_0x0190:
                java.lang.String r5 = "challenge"
                java.io.Serializable r4 = (java.io.Serializable) r4
                r3.putExtra(r5, r4)
                java.util.List r4 = r1.getConnectMusics()
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r4)
                if (r4 != 0) goto L_0x01d5
                boolean r4 = r1.isCommerce()
                if (r4 == 0) goto L_0x01d5
                java.lang.String r4 = "music_id"
                java.util.List r1 = r1.getConnectMusics()
                java.lang.Object r1 = r1.get(r6)
                com.ss.android.ugc.aweme.music.model.Music r1 = (com.p280ss.android.ugc.aweme.music.model.Music) r1
                if (r1 == 0) goto L_0x01bc
                java.lang.String r1 = r1.getMid()
                goto L_0x01bd
            L_0x01bc:
                r1 = r0
            L_0x01bd:
                r3.putExtra(r4, r1)
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r1 = r1.f62526m
                if (r1 == 0) goto L_0x01cb
                com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r1 = r1.getCommerceChallengeTask()
                goto L_0x01cc
            L_0x01cb:
                r1 = r0
            L_0x01cc:
                if (r1 == 0) goto L_0x01d5
                java.lang.String r1 = "is_forced_music_from_show_way"
                java.lang.String r4 = "challenge"
                r3.putExtra(r1, r4)
            L_0x01d5:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r1 = r1.f62526m
                if (r1 == 0) goto L_0x01e6
                com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r1 = r1.getCommerceChallengeTask()
                if (r1 == 0) goto L_0x01e6
                java.lang.String r1 = r1.getId()
                goto L_0x01e7
            L_0x01e6:
                r1 = r0
            L_0x01e7:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0204
                java.lang.String r1 = "task_id"
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r4 = r9.f62535a
                com.ss.android.ugc.aweme.discover.model.Challenge r4 = r4.f62526m
                if (r4 == 0) goto L_0x0201
                com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r4 = r4.getCommerceChallengeTask()
                if (r4 == 0) goto L_0x0201
                java.lang.String r0 = r4.getId()
            L_0x0201:
                r3.putExtra(r1, r0)
            L_0x0204:
                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r0 == 0) goto L_0x020f
                java.lang.String r0 = "reverse_video_record_show_planD"
                r3.putExtra(r0, r7)
            L_0x020f:
                android.app.Activity r2 = (android.app.Activity) r2
                r10.startToolPermissionActivity(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailFragment.C23716f.m77784a(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$g */
    static final class C23717g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62536a;

        C23717g(ChallengeDetailFragment challengeDetailFragment) {
            this.f62536a = challengeDetailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f62536a.mo61699a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$h */
    static final class C23718h extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62537a;

        C23718h(ChallengeDetailFragment challengeDetailFragment) {
            this.f62537a = challengeDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f62537a.mo61701b((int) R.id.auq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$i */
    static final class C23719i extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62538a;

        C23719i(ChallengeDetailFragment challengeDetailFragment) {
            this.f62538a = challengeDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f62538a.mo61701b((int) R.id.da5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$j */
    static final class C23720j extends Lambda implements C7561a<ChallengeSwipeRefreshLayout> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62539a;

        C23720j(ChallengeDetailFragment challengeDetailFragment) {
            this.f62539a = challengeDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ChallengeSwipeRefreshLayout invoke() {
            return (ChallengeSwipeRefreshLayout) this.f62539a.mo61701b((int) R.id.bj_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$k */
    static final class C23721k extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62540a;

        C23721k(ChallengeDetailFragment challengeDetailFragment) {
            this.f62540a = challengeDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f62540a.mo61701b((int) R.id.d4t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$l */
    static final class C23722l extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62541a;

        C23722l(ChallengeDetailFragment challengeDetailFragment) {
            this.f62541a = challengeDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f62541a.mo61701b((int) R.id.dal);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$m */
    static final class C23723m extends Lambda implements C7561a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62542a;

        C23723m(ChallengeDetailFragment challengeDetailFragment) {
            this.f62542a = challengeDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtStatusView invoke() {
            return (DmtStatusView) this.f62542a.mo61701b((int) R.id.dav);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$n */
    static final class C23724n extends Lambda implements C7561a<HashMap<Integer, View>> {

        /* renamed from: a */
        public static final C23724n f62543a = new C23724n();

        C23724n() {
            super(0);
        }

        /* renamed from: a */
        private static HashMap<Integer, View> m77791a() {
            return new HashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m77791a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$o */
    static final class C23725o extends Lambda implements C7561a<ChallengeDetailViewModel> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62544a;

        C23725o(ChallengeDetailFragment challengeDetailFragment) {
            this.f62544a = challengeDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ChallengeDetailViewModel invoke() {
            FragmentActivity activity = this.f62544a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            return C23812a.m78027a(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$p */
    static final class C23726p extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62545a;

        C23726p(ChallengeDetailFragment challengeDetailFragment) {
            this.f62545a = challengeDetailFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m77793a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m77793a(View view) {
            C7573i.m23587b(view, "it");
            FragmentActivity activity = this.f62545a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$q */
    static final class C23727q extends Lambda implements C7563m<C11585f, ChallengeDetail, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62546a;

        C23727q(ChallengeDetailFragment challengeDetailFragment) {
            this.f62546a = challengeDetailFragment;
            super(2);
        }

        /* renamed from: a */
        private void m77794a(C11585f fVar, ChallengeDetail challengeDetail) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(challengeDetail, "it");
            this.f62546a.mo61697a(challengeDetail);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m77794a((C11585f) obj, (ChallengeDetail) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$r */
    static final class C23728r extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62547a;

        C23728r(ChallengeDetailFragment challengeDetailFragment) {
            this.f62547a = challengeDetailFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m77795a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m77795a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f62547a.mo61704k().mo25940d(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$s */
    static final class C23729s extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62548a;

        C23729s(ChallengeDetailFragment challengeDetailFragment) {
            this.f62548a = challengeDetailFragment;
            super(2);
        }

        /* renamed from: a */
        private void m77796a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f62548a.mo61698a(th);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m77796a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment$t */
    static final class C23730t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailFragment f62549a;

        C23730t(ChallengeDetailFragment challengeDetailFragment) {
            this.f62549a = challengeDetailFragment;
        }

        public final void run() {
            this.f62549a.f68829t.setMaxScrollHeight(Integer.MAX_VALUE);
        }
    }

    /* renamed from: A */
    private final LinearLayout m77725A() {
        return (LinearLayout) this.f62509O.getValue();
    }

    /* renamed from: B */
    private final ChallengeDetailJediViewModel m77726B() {
        return (ChallengeDetailJediViewModel) this.f62515U.getValue();
    }

    /* renamed from: D */
    private final HashMap<Integer, View> m77727D() {
        return (HashMap) this.f62517W.getValue();
    }

    /* renamed from: O */
    private void m77738O() {
        if (this.f62521aa != null) {
            this.f62521aa.clear();
        }
    }

    /* renamed from: x */
    private final View m77745x() {
        return (View) this.f62504J.getValue();
    }

    /* renamed from: y */
    private final View m77746y() {
        return (View) this.f62505K.getValue();
    }

    /* renamed from: z */
    private final ImageView m77747z() {
        return (ImageView) this.f62508N.getValue();
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final String mo61693a(int i) {
        switch (i) {
            case 0:
                return "challenge";
            case 1:
                return "challenge_fresh";
            default:
                return "";
        }
    }

    /* renamed from: b */
    public final View mo61701b(int i) {
        if (this.f62521aa == null) {
            this.f62521aa = new HashMap();
        }
        View view = (View) this.f62521aa.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f62521aa.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final String bp_() {
        return "challenge";
    }

    /* renamed from: j */
    public final ChallengeSwipeRefreshLayout mo61703j() {
        return (ChallengeSwipeRefreshLayout) this.f62506L.getValue();
    }

    /* renamed from: k */
    public final DmtStatusView mo61704k() {
        return (DmtStatusView) this.f62507M.getValue();
    }

    /* renamed from: m */
    public final int mo61706m() {
        return R.layout.nc;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m77738O();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo61696a(Bundle bundle) {
        Serializable serializable = bundle != null ? bundle.getSerializable("challenge_detail_param") : null;
        this.f62524k = serializable instanceof ChallengeDetailParam ? (ChallengeDetailParam) serializable : new ChallengeDetailParam(null, null, null, null, false, 0, 0, null, 0, null, 1023, null);
        ChallengeDetailParam challengeDetailParam = this.f62524k;
        if (challengeDetailParam == null) {
            C7573i.m23583a("mDetailParam");
        }
        String cid = challengeDetailParam.getCid();
        if (cid == null) {
            cid = "";
        }
        this.f62525l = cid;
        ChallengeDetailParam challengeDetailParam2 = this.f62524k;
        if (challengeDetailParam2 == null) {
            C7573i.m23583a("mDetailParam");
        }
        this.f62513S = challengeDetailParam2.getShowTabIndex();
        ChallengeDetailParam challengeDetailParam3 = this.f62524k;
        if (challengeDetailParam3 == null) {
            C7573i.m23583a("mDetailParam");
        }
        String processId = challengeDetailParam3.getProcessId();
        if (processId == null) {
            processId = "";
        }
        this.f62528o = processId;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61676a(Intent intent) {
        C7573i.m23587b(intent, "intent");
        if (TextUtils.isEmpty(this.f62527n)) {
            this.f62527n = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.f62527n);
    }

    /* renamed from: a */
    public final void mo61699a(boolean z) {
        if (mo61704k().mo25940d(true)) {
            ChallengeDetailJediViewModel B = m77726B();
            ChallengeDetailParam challengeDetailParam = this.f62524k;
            if (challengeDetailParam == null) {
                C7573i.m23583a("mDetailParam");
            }
            String cid = challengeDetailParam.getCid();
            ChallengeDetailParam challengeDetailParam2 = this.f62524k;
            if (challengeDetailParam2 == null) {
                C7573i.m23583a("mDetailParam");
            }
            int clickReason = challengeDetailParam2.getClickReason();
            ChallengeDetailParam challengeDetailParam3 = this.f62524k;
            if (challengeDetailParam3 == null) {
                C7573i.m23583a("mDetailParam");
            }
            B.mo61853a(cid, clickReason, challengeDetailParam3.isHashTag());
            List<C26060f> list = this.f68822D;
            if (!z) {
                list = null;
            }
            if (list != null) {
                for (C26060f d : list) {
                    d.mo61748d();
                }
            }
        } else {
            mo61703j().setRefreshing(false);
        }
    }

    /* renamed from: a */
    public final void mo61697a(ChallengeDetail challengeDetail) {
        if (isViewValid()) {
            mo61703j().setRefreshing(false);
            if (challengeDetail == null || challengeDetail.challenge == null) {
                mo61704k().mo25938c(false);
                return;
            }
            Challenge challenge = challengeDetail.challenge;
            this.f62512R = challengeDetail;
            this.f62526m = challenge;
            DetailAwemeListFragment detailAwemeListFragment = this.f62514T;
            if (detailAwemeListFragment != null) {
                detailAwemeListFragment.f62596o = this.f62526m;
            }
            m77734K();
            String str = this.f62525l;
            if (str == null) {
                C7573i.m23583a("mChallengeId");
            }
            CharSequence charSequence = str;
            C7573i.m23582a((Object) challenge, "challenge");
            if (!TextUtils.equals(charSequence, challenge.getCid())) {
                String cid = challenge.getCid();
                C7573i.m23582a((Object) cid, "challenge.cid");
                this.f62525l = cid;
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    ChallengeDetailActivity challengeDetailActivity = (ChallengeDetailActivity) activity;
                    String str2 = this.f62525l;
                    if (str2 == null) {
                        C7573i.m23583a("mChallengeId");
                    }
                    challengeDetailActivity.mo61684a(str2);
                    List<C26060f> list = this.f68822D;
                    C7573i.m23582a((Object) list, "mFragments");
                    for (C26060f fVar : list) {
                        String str3 = this.f62525l;
                        if (str3 == null) {
                            C7573i.m23583a("mChallengeId");
                        }
                        fVar.mo61741a(str3);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity");
                }
            }
            C23701a aVar = this.f62522i;
            if (aVar == null) {
                C7573i.m23583a("mCommerceDelegate");
            }
            aVar.mo61663a();
            C23701a aVar2 = this.f62522i;
            if (aVar2 == null) {
                C7573i.m23583a("mCommerceDelegate");
            }
            aVar2.mo61666a(challengeDetail, this.f62513S);
            this.f62513S = -1;
        }
    }

    /* renamed from: a */
    public final void mo61698a(Throwable th) {
        if (isViewValid()) {
            mo61703j().setRefreshing(false);
            mo61704k().mo25934a(true);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C22814a.m75244a((Context) activity, th);
        }
    }

    /* renamed from: a */
    public final void mo61695a(int i, int i2) {
        super.mo61695a(i, i2);
        Set<Entry> entrySet = m77727D().entrySet();
        if (!C6399b.m19944t()) {
            entrySet = null;
        }
        if (entrySet != null) {
            for (Entry entry : entrySet) {
                Object value = entry.getValue();
                C7573i.m23582a(value, "it.value");
                Integer num = (Integer) entry.getKey();
                ((View) value).setSelected(num != null && num.intValue() == i);
            }
        }
        if (this.f68822D != null) {
            Object obj = this.f68822D.get(i);
            C26060f fVar = (C26060f) obj;
            C7573i.m23582a((Object) fVar, "it");
            if (!fVar.mo61744a()) {
                obj = null;
            }
            C26060f fVar2 = (C26060f) obj;
            if (fVar2 != null) {
                fVar2.mo61748d();
            }
        }
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
        super.mo61694a(f, f2);
        C23701a aVar = this.f62522i;
        if (aVar == null) {
            C7573i.m23583a("mCommerceDelegate");
        }
        aVar.mo61664a(f, f2);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C11593a.m34075b(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C11593a.m34078e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C11593a.m34076c(this);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0067b mo29056f() {
        return this.f62529p;
    }

    /* renamed from: l */
    public final List<C26060f> mo61705l() {
        List<C26060f> list = this.f68822D;
        C7573i.m23582a((Object) list, "mFragments");
        return list;
    }

    /* renamed from: n */
    public final String mo61707n() {
        String str = this.f62525l;
        if (str == null) {
            C7573i.m23583a("mChallengeId");
        }
        return str;
    }

    /* renamed from: p */
    public final void mo61712p() {
        super.mo61712p();
        DmtTabLayout dmtTabLayout = this.f68833x;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackgroundResource(R.color.el);
        }
    }

    /* renamed from: G */
    private final void m77730G() {
        m77746y().setEnabled(false);
        m77740a(m77746y(), (C7562b<? super View, C7581n>) new C23716f<Object,C7581n>(this));
    }

    /* renamed from: s */
    public final void mo61714s() {
        Context context = getContext();
        String str = "click_share_button";
        String str2 = "challenge_hot";
        Challenge challenge = this.f62526m;
        if (challenge == null) {
            C7573i.m23580a();
        }
        C6907h.m21518a(context, str, str2, challenge.getCid(), 0);
    }

    /* renamed from: F */
    private final void m77729F() {
        m77740a((View) m77747z(), (C7562b<? super View, C7581n>) new C23715e<Object,C7581n>(this));
        if (C6399b.m19944t()) {
            C6903bc.m21479T().mo57877a(m77747z());
        } else {
            m77747z().setImageResource(R.drawable.alb);
        }
    }

    /* renamed from: H */
    private final void m77731H() {
        mo61704k().setBuilder(C10803a.m31631a(getContext()).mo25964b(C43361b.m137644a(getContext(), new C23717g(this))));
    }

    /* renamed from: I */
    private final void m77732I() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cw);
        mo61703j().setEnabled(false);
        mo61703j().mo60699a(true, dimensionPixelSize * 2, dimensionPixelSize * 4);
        mo61703j().setOnRefreshListener(new C23714d(this));
    }

    /* renamed from: M */
    private final void m77736M() {
        if (this.f62510P != null) {
            DmtTabLayout dmtTabLayout = this.f68833x;
            if (dmtTabLayout == null || dmtTabLayout.getVisibility() != 0) {
                C23755a aVar = this.f62510P;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                aVar.mo61775d();
            }
            C23755a aVar2 = this.f62510P;
            if (aVar2 == null) {
                C7573i.m23580a();
            }
            if (aVar2.getHasBgCoverMask()) {
                DmtTabLayout dmtTabLayout2 = this.f68833x;
                if (dmtTabLayout2 != null) {
                    dmtTabLayout2.setBackgroundResource(R.color.h5);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0 == null) goto L_0x0027;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> mo61708o() {
        /*
            r2 = this;
            java.util.List r0 = r2.f68822D
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r2.f68822D
            int r1 = r2.f68820B
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r2.f68822D
            int r1 = r2.f68820B
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment
            if (r1 != 0) goto L_0x001d
            r0 = 0
        L_0x001d:
            com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r0 = (com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment) r0
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r0.mo61754n()
            if (r0 != 0) goto L_0x002b
        L_0x0027:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
        L_0x002b:
            return r0
        L_0x002c:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailFragment.mo61708o():java.util.List");
    }

    /* renamed from: E */
    private final void m77728E() {
        if (VERSION.SDK_INT >= 19) {
            int a = C10994a.m32204a((Context) getActivity());
            float dimension = getResources().getDimension(R.dimen.x5);
            m77745x().getLayoutParams().height = a;
            m77745x().setAlpha(1.0f);
            ScrollableLayout scrollableLayout = this.f68829t;
            C7573i.m23582a((Object) scrollableLayout, "mScrollableLayout");
            int i = (int) (((float) a) + dimension);
            scrollableLayout.setTabsMarginTop(i);
            LayoutParams layoutParams = mo61704k().getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = i;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: L */
    private final void m77735L() {
        ChallengeDetailParam challengeDetailParam = this.f62524k;
        if (challengeDetailParam == null) {
            C7573i.m23583a("mDetailParam");
        }
        C23783h hVar = new C23783h(null, null, null, challengeDetailParam.getEnterFrom(), this.f62528o, 7, null);
        C23765c cVar = this.f62511Q;
        if (cVar == null) {
            C7573i.m23583a("mHeaderFactory");
        }
        ChallengeDetail challengeDetail = this.f62512R;
        if (challengeDetail == null) {
            C7573i.m23580a();
        }
        C23755a a = cVar.mo61801a(challengeDetail, hVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (this.f62510P != null && (!C7573i.m23585a((Object) this.f62510P, (Object) a))) {
            m77725A().removeView(this.f62510P);
            m77725A().addView(a, layoutParams);
        } else if (this.f62510P == null) {
            m77725A().addView(a, layoutParams);
            a.post(new C23730t(this));
        }
        this.f62510P = a;
    }

    /* renamed from: q */
    public final FragmentPagerAdapter mo61713q() {
        this.f68822D = new ArrayList();
        this.f68823E = new ArrayList();
        this.f62485e = new ArrayList();
        this.f62523j = m77733J();
        List list = this.f68822D;
        DetailAwemeListFragment detailAwemeListFragment = this.f62523j;
        if (detailAwemeListFragment == null) {
            C7573i.m23583a("mHotFragment");
        }
        list.add(detailAwemeListFragment);
        List list2 = this.f68823E;
        DetailAwemeListFragment detailAwemeListFragment2 = this.f62523j;
        if (detailAwemeListFragment2 == null) {
            C7573i.m23583a("mHotFragment");
        }
        list2.add(detailAwemeListFragment2);
        this.f62485e.add(Integer.valueOf(2));
        return new ProfileFragmentAdapter(getChildFragmentManager(), this.f68823E, this.f62485e);
    }

    public ChallengeDetailFragment() {
        C7584c a = C7575l.m23595a(ChallengeDetailJediViewModel.class);
        C7561a challengeDetailFragment$$special$$inlined$viewModel$1 = new ChallengeDetailFragment$$special$$inlined$viewModel$1(a);
        this.f62515U = new lifecycleAwareLazy(this, challengeDetailFragment$$special$$inlined$viewModel$1, new ChallengeDetailFragment$$special$$inlined$viewModel$3(this, challengeDetailFragment$$special$$inlined$viewModel$1, a, ChallengeDetailFragment$$special$$inlined$viewModel$2.INSTANCE));
        this.f62516V = C23754h.m77885a(new C23725o(this));
        this.f62517W = C23754h.m77885a(C23724n.f62543a);
        this.f62520Z = -1;
    }

    /* renamed from: J */
    private final DetailAwemeListFragment m77733J() {
        String str;
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractDetailFragment.f68818r);
        boolean z = false;
        sb.append(0);
        Fragment a = childFragmentManager.mo2644a(sb.toString());
        if (!(a instanceof DetailAwemeListFragment)) {
            String str2 = "challenge";
            String str3 = this.f62525l;
            if (str3 == null) {
                C7573i.m23583a("mChallengeId");
            }
            ChallengeDetailParam challengeDetailParam = this.f62524k;
            if (challengeDetailParam == null) {
                C7573i.m23583a("mDetailParam");
            }
            boolean isHashTag = challengeDetailParam.isHashTag();
            ChallengeDetailParam challengeDetailParam2 = this.f62524k;
            if (challengeDetailParam2 == null) {
                C7573i.m23583a("mDetailParam");
            }
            if (challengeDetailParam2.isHashTag()) {
                str = this.f62525l;
                if (str == null) {
                    C7573i.m23583a("mChallengeId");
                }
            } else {
                str = "";
            }
            String str4 = str;
            ChallengeDetailParam challengeDetailParam3 = this.f62524k;
            if (challengeDetailParam3 == null) {
                C7573i.m23583a("mDetailParam");
            }
            a = DetailAwemeListFragment.m77809a(2, str2, str3, isHashTag, str4, challengeDetailParam3.getEnterFrom(), this.f62528o, new ChallengeDetailAwemeListProvider());
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) a;
            detailAwemeListFragment.mo61740a((C26116k) new C23712b(this));
            if (this.f68820B == 0) {
                z = true;
            }
            detailAwemeListFragment.f62597p = z;
            detailAwemeListFragment.f62598q = true;
            this.f62514T = detailAwemeListFragment;
        }
        if (a != null) {
            return (DetailAwemeListFragment) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
    }

    /* renamed from: K */
    private final void m77734K() {
        mo61704k().mo25938c(true);
        m77745x().setAlpha(0.0f);
        View view = this.f68831v;
        C7573i.m23582a((Object) view, "mTitleColorCtrl");
        view.setAlpha(0.0f);
        TextView textView = this.f68830u;
        textView.setVisibility(0);
        if (C6399b.m19944t()) {
            StringBuilder sb = new StringBuilder("#");
            Challenge challenge = this.f62526m;
            if (challenge == null) {
                C7573i.m23580a();
            }
            sb.append(challenge.getChallengeName());
            textView.setText(sb.toString());
            textView.setTextColor(textView.getResources().getColor(R.color.a5d));
            if (textView != null) {
                ((DmtTextView) textView).setFontType(C10834d.f29332b);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
            }
        } else {
            Challenge challenge2 = this.f62526m;
            if (challenge2 == null) {
                C7573i.m23580a();
            }
            textView.setText(challenge2.getChallengeName());
        }
        m77746y().setEnabled(true);
        mo61703j().setEnabled(true);
        m77735L();
        m77736M();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aj_() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r6.f62524k
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            java.lang.String r0 = r0.getEnterFrom()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "from_message"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "click_join_button"
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "click_tag_publish"
        L_0x001e:
            com.p280ss.android.ugc.aweme.metrics.C33242an.m107318c(r0)
            java.lang.String r0 = r6.bp_()
            com.p280ss.android.ugc.aweme.metrics.C33242an.m107315a(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "route"
            java.lang.String r2 = "1"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02db }
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r2 = r6.f62524k     // Catch:{ JSONException -> 0x02db }
            if (r2 != 0) goto L_0x003f
            java.lang.String r3 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r3)     // Catch:{ JSONException -> 0x02db }
        L_0x003f:
            java.lang.String r2 = r2.getAwemeId()     // Catch:{ JSONException -> 0x02db }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02db }
            java.lang.String r1 = "impr_type"
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ JSONException -> 0x02db }
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r3 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r2 = r2.getService(r3)     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r2 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r2     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r6.f62524k     // Catch:{ JSONException -> 0x02db }
            if (r3 != 0) goto L_0x005d
            java.lang.String r4 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r4)     // Catch:{ JSONException -> 0x02db }
        L_0x005d:
            java.lang.String r3 = r3.getAwemeId()     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAwemeById(r3)     // Catch:{ JSONException -> 0x02db }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107245t(r2)     // Catch:{ JSONException -> 0x02db }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r1 = r6.f62524k     // Catch:{ JSONException -> 0x02db }
            if (r1 != 0) goto L_0x0075
            java.lang.String r2 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r2)     // Catch:{ JSONException -> 0x02db }
        L_0x0075:
            java.lang.String r1 = r1.getEnterFrom()     // Catch:{ JSONException -> 0x02db }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ JSONException -> 0x02db }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x02db }
            if (r1 != 0) goto L_0x0093
            java.lang.String r1 = "challenge_from"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r2 = r6.f62524k     // Catch:{ JSONException -> 0x02db }
            if (r2 != 0) goto L_0x008c
            java.lang.String r3 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r3)     // Catch:{ JSONException -> 0x02db }
        L_0x008c:
            java.lang.String r2 = r2.getEnterFrom()     // Catch:{ JSONException -> 0x02db }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02db }
        L_0x0093:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r1 = r6.f62524k     // Catch:{ JSONException -> 0x02db }
            if (r1 != 0) goto L_0x009c
            java.lang.String r2 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r2)     // Catch:{ JSONException -> 0x02db }
        L_0x009c:
            java.lang.String r1 = r1.getEnterpriseUid()     // Catch:{ JSONException -> 0x02db }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ JSONException -> 0x02db }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x02db }
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = "page_uid"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r2 = r6.f62524k     // Catch:{ JSONException -> 0x02db }
            if (r2 != 0) goto L_0x00b3
            java.lang.String r3 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r3)     // Catch:{ JSONException -> 0x02db }
        L_0x00b3:
            java.lang.String r2 = r2.getEnterpriseUid()     // Catch:{ JSONException -> 0x02db }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02db }
        L_0x00ba:
            java.lang.String r1 = "impr_type"
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ JSONException -> 0x02db }
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r3 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r2 = r2.getService(r3)     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r2 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r2     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r6.f62524k     // Catch:{ JSONException -> 0x02db }
            if (r3 != 0) goto L_0x00d1
            java.lang.String r4 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r4)     // Catch:{ JSONException -> 0x02db }
        L_0x00d1:
            java.lang.String r3 = r3.getAwemeId()     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAwemeById(r3)     // Catch:{ JSONException -> 0x02db }
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107245t(r2)     // Catch:{ JSONException -> 0x02db }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02db }
            com.ss.android.ugc.aweme.common.MobClick r1 = new com.ss.android.ugc.aweme.common.MobClick
            r1.<init>()
            java.lang.String r2 = "shoot"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "challenge"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            java.lang.String r2 = r6.f62525l
            if (r2 != 0) goto L_0x00fa
            java.lang.String r3 = "mChallengeId"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00fa:
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            com.ss.android.ugc.aweme.common.MobClick r0 = r1.setJsonObject(r0)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "creation_id"
            java.lang.String r2 = r6.f62527n
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "shoot_way"
            java.lang.String r2 = "challenge"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "_staging_flag"
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            r2 = r2 ^ 1
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
            java.lang.String r1 = "tag_id"
            java.lang.String r2 = r6.f62525l
            if (r2 != 0) goto L_0x0130
            java.lang.String r3 = "mChallengeId"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0130:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "impr_type"
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r3 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r2 = r2.getService(r3)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r2 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r2
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r6.f62524k
            if (r3 != 0) goto L_0x014b
            java.lang.String r4 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x014b:
            java.lang.String r3 = r3.getAwemeId()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAwemeById(r3)
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107245t(r2)
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r2 = r6.f62524k
            if (r2 != 0) goto L_0x0166
            java.lang.String r3 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0166:
            java.lang.String r2 = r2.getAwemeId()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r1 = r6.f62524k
            if (r1 != 0) goto L_0x0177
            java.lang.String r2 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0177:
            java.lang.String r1 = r1.getEnterFrom()
            boolean r1 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107230h(r1)
            if (r1 == 0) goto L_0x019f
            java.lang.String r1 = "log_pb"
            com.ss.android.ugc.aweme.feed.ae r2 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r6.f62524k
            if (r3 != 0) goto L_0x0190
            java.lang.String r4 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0190:
            java.lang.String r3 = r3.getAwemeId()
            java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107232i(r3)
            java.lang.String r2 = r2.mo71791a(r3)
            r0.mo59973a(r1, r2)
        L_0x019f:
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r6.f62526m
            r2 = 0
            if (r1 == 0) goto L_0x01af
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r1 = r1.getCommerceChallengeTask()
            if (r1 == 0) goto L_0x01af
            java.lang.String r1 = r1.getId()
            goto L_0x01b0
        L_0x01af:
            r1 = r2
        L_0x01b0:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01cb
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r6.f62526m
            if (r3 == 0) goto L_0x01c8
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r3 = r3.getCommerceChallengeTask()
            if (r3 == 0) goto L_0x01c8
            java.lang.String r2 = r3.getId()
        L_0x01c8:
            r0.mo59973a(r1, r2)
        L_0x01cb:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 == 0) goto L_0x01d8
            java.lang.String r1 = "process_id"
            java.lang.String r2 = r6.f62528o
            r0.mo59973a(r1, r2)
        L_0x01d8:
            java.lang.String r1 = "shoot"
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r0)
            java.lang.String r0 = "general_search"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r1 = r6.f62524k
            if (r1 != 0) goto L_0x01ec
            java.lang.String r2 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x01ec:
            java.lang.String r1 = r1.getEnterFrom()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            java.lang.String r1 = "search_result"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r2 = r6.f62524k
            if (r2 != 0) goto L_0x0203
            java.lang.String r3 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0203:
            java.lang.String r2 = r2.getEnterFrom()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            java.lang.String r2 = "search_for_you_list"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r6.f62524k
            if (r3 != 0) goto L_0x021a
            java.lang.String r4 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x021a:
            java.lang.String r3 = r3.getEnterFrom()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r0 != 0) goto L_0x022a
            if (r1 != 0) goto L_0x022a
            if (r2 == 0) goto L_0x0279
        L_0x022a:
            java.lang.String r1 = "search_shoot"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "creation_id"
            java.lang.String r4 = r6.f62527n
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "shoot_way"
            java.lang.String r4 = "challenge"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "tag_id"
            java.lang.String r4 = r6.f62525l
            if (r4 != 0) goto L_0x024b
            java.lang.String r5 = "mChallengeId"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x024b:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "search_type"
            if (r0 == 0) goto L_0x0256
            java.lang.String r4 = "general"
            goto L_0x0258
        L_0x0256:
            java.lang.String r4 = "tag"
        L_0x0258:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "previous_page"
            if (r0 == 0) goto L_0x0263
            java.lang.String r0 = "search_result"
            goto L_0x0270
        L_0x0263:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r6.f62524k
            if (r0 != 0) goto L_0x026c
            java.lang.String r4 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x026c:
            java.lang.String r0 = r0.getEnterFrom()
        L_0x0270:
            com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r0)
        L_0x0279:
            android.support.v4.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x02da
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L_0x0286
            goto L_0x02da
        L_0x0286:
            java.lang.String r1 = "from_notification"
            r2 = 0
            boolean r1 = r0.getBooleanExtra(r1, r2)
            if (r1 == 0) goto L_0x02d9
            java.lang.String r1 = "rule_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02d9
            java.lang.String r1 = "shoot_from_push"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "tag_id"
            java.lang.String r4 = r6.f62525l
            if (r4 != 0) goto L_0x02af
            java.lang.String r5 = "mChallengeId"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x02af:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "route"
            java.lang.String r4 = "1"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r6.f62524k
            if (r4 != 0) goto L_0x02c6
            java.lang.String r5 = "mDetailParam"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x02c6:
            java.lang.String r4 = r4.getAwemeId()
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "rule_id"
            com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r0)
        L_0x02d9:
            return
        L_0x02da:
            return
        L_0x02db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailFragment.aj_():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ C23701a m77739a(ChallengeDetailFragment challengeDetailFragment) {
        C23701a aVar = challengeDetailFragment.f62522i;
        if (aVar == null) {
            C7573i.m23583a("mCommerceDelegate");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ChallengeDetailParam m77742b(ChallengeDetailFragment challengeDetailFragment) {
        ChallengeDetailParam challengeDetailParam = challengeDetailFragment.f62524k;
        if (challengeDetailParam == null) {
            C7573i.m23583a("mDetailParam");
        }
        return challengeDetailParam;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m77743c(ChallengeDetailFragment challengeDetailFragment) {
        String str = challengeDetailFragment.f62525l;
        if (str == null) {
            C7573i.m23583a("mChallengeId");
        }
        return str;
    }

    /* renamed from: d */
    public static final /* synthetic */ DetailAwemeListFragment m77744d(ChallengeDetailFragment challengeDetailFragment) {
        DetailAwemeListFragment detailAwemeListFragment = challengeDetailFragment.f62523j;
        if (detailAwemeListFragment == null) {
            C7573i.m23583a("mHotFragment");
        }
        return detailAwemeListFragment;
    }

    @C7709l
    public final void onAntiCrawlerEvent(C23281a aVar) {
        C7573i.m23587b(aVar, "event");
        String str = aVar.f61317a;
        if (str != null && C7634n.m23776c((CharSequence) str, (CharSequence) "/aweme/v1/challenge/detail/?", false)) {
            C42961az.m136385f(aVar);
            mo61699a(true);
        }
    }

    @C7709l
    public final void onMusicCollectEvent(C33769d dVar) {
        C7573i.m23587b(dVar, "event");
        if (isViewValid()) {
            MusicModel musicModel = dVar.f88125b;
            if (musicModel != null) {
                Music music = musicModel.getMusic();
                if (music != null) {
                    int i = dVar.f88124a;
                    music.setCollectStatus(i);
                    m77741a(music, i);
                }
            }
        }
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
        if (anVar.f74631a == 2 && isViewValid() && this.f62526m != null) {
            Object obj = anVar.f74632b;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
                if (awemeById != null) {
                    List<Challenge> challengeList = awemeById.getChallengeList();
                    if (challengeList != null) {
                        for (Challenge challenge : challengeList) {
                            C7573i.m23582a((Object) challenge, "it");
                            String cid = challenge.getCid();
                            Challenge challenge2 = this.f62526m;
                            if (challenge2 == null) {
                                C7573i.m23580a();
                            }
                            if (C6319n.m19594a(cid, challenge2.getCid())) {
                                Challenge challenge3 = this.f62526m;
                                if (challenge3 == null) {
                                    C7573i.m23580a();
                                }
                                if (challenge3.getUserCount() > 0) {
                                    Challenge challenge4 = this.f62526m;
                                    if (challenge4 == null) {
                                        C7573i.m23580a();
                                    }
                                    Challenge challenge5 = this.f62526m;
                                    if (challenge5 == null) {
                                        C7573i.m23580a();
                                    }
                                    challenge4.setUserCount(challenge5.getUserCount() - 1);
                                    mo61697a(this.f62512R);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m77740a(View view, C7562b<? super View, C7581n> bVar) {
        view.setOnClickListener(new C23713c(this, bVar));
    }

    /* renamed from: a */
    private final void m77741a(Music music, int i) {
        Object obj;
        if (this.f62526m != null) {
            Challenge challenge = this.f62526m;
            if (challenge == null) {
                C7573i.m23580a();
            }
            if (challenge.getConnectMusics() != null) {
                Challenge challenge2 = this.f62526m;
                if (challenge2 == null) {
                    C7573i.m23580a();
                }
                List connectMusics = challenge2.getConnectMusics();
                C7573i.m23582a((Object) connectMusics, "mChallenge!!.connectMusics");
                Iterator it = connectMusics.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Music music2 = (Music) obj;
                    C7573i.m23582a((Object) music2, "it");
                    if (C7573i.m23585a((Object) music2.getMid(), (Object) music.getMid())) {
                        break;
                    }
                }
                Music music3 = (Music) obj;
                if (music3 != null) {
                    music3.setCollectStatus(i);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        C23701a aVar = this.f62522i;
        if (aVar == null) {
            C7573i.m23583a("mCommerceDelegate");
        }
        aVar.mo61665a(i, i2);
        mo61703j().setChildScrollY(i);
        C23755a aVar2 = this.f62510P;
        if (aVar2 != null) {
            if (this.f62520Z != m77725A().getBottom()) {
                int bottom = m77725A().getBottom();
                View view = this.f68831v;
                C7573i.m23582a((Object) view, "mTitleColorCtrl");
                this.f62518X = (float) ((bottom - view.getBottom()) - m77745x().getHeight());
                this.f62519Y = this.f62518X - C9738o.m28708b(getContext(), 20.0f);
                if (this.f62519Y < 0.0f) {
                    this.f62519Y = 0.0f;
                }
                this.f62520Z = m77725A().getBottom();
            }
            float f = (((float) i) - this.f62519Y) / (this.f62518X - this.f62519Y);
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            TextView textView = this.f68830u;
            C7573i.m23582a((Object) textView, "mTitle");
            textView.setAlpha(f);
            aVar2.setHeaderAlpha(f);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        ChallengeDetailParam challengeDetailParam = this.f62524k;
        if (challengeDetailParam == null) {
            C7573i.m23583a("mDetailParam");
        }
        if (TextUtils.isEmpty(challengeDetailParam.getCid())) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        DmtTabLayout dmtTabLayout = this.f68833x;
        C7573i.m23582a((Object) dmtTabLayout, "mTabLayout");
        dmtTabLayout.setVisibility(8);
        TextView textView = this.f68830u;
        C7573i.m23582a((Object) textView, "mTitle");
        textView.setVisibility(0);
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo61701b((int) R.id.jo);
        C7573i.m23582a((Object) autoRTLImageView, "back_btn");
        m77740a((View) autoRTLImageView, (C7562b<? super View, C7581n>) new C23726p<Object,C7581n>(this));
        m77728E();
        m77729F();
        m77731H();
        m77730G();
        m77732I();
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context, "context!!");
        this.f62511Q = C23766a.m77918a(context);
        C23701a createCommerceDelegate = ((IChallengeDetailProvider) ServiceManager.get().getService(IChallengeDetailProvider.class)).createCommerceDelegate(view, this);
        C7573i.m23582a((Object) createCommerceDelegate, "ServiceManager.get().get…merceDelegate(view, this)");
        this.f62522i = createCommerceDelegate;
        JediViewModel B = m77726B();
        C7599l lVar = C23753g.f62665a;
        C7563m qVar = new C23727q(this);
        C11503a.m33919a(this, B, lVar, null, new C23729s(this), new C23728r(this), qVar, 2, null);
        mo61699a(false);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34070a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C11593a.m34072a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C11593a.m34073a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
