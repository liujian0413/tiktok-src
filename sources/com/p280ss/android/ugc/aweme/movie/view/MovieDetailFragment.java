package com.p280ss.android.ugc.aweme.movie.view;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.CircleOptions.C12089a;
import com.bytedance.lighten.core.p613d.C12123c;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.BaseDetailFragment;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.movie.p1402a.C33645c;
import com.p280ss.android.ugc.aweme.movie.p1403b.C33647a;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p1288h.C30221c.C30223b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C38265v;
import com.p280ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment */
public final class MovieDetailFragment extends BaseDetailFragment implements C33665a {

    /* renamed from: h */
    static final /* synthetic */ C7595j[] f87838h = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MovieDetailFragment.class), "mRecordView", "getMRecordView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MovieDetailFragment.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MovieDetailFragment.class), "titleTextView", "getTitleTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MovieDetailFragment.class), "mHeadLayout", "getMHeadLayout()Landroid/view/View;"))};

    /* renamed from: l */
    public static final C33656a f87839l = new C33656a(null);

    /* renamed from: J */
    private C33647a f87840J;

    /* renamed from: K */
    private float f87841K;

    /* renamed from: L */
    private float f87842L;

    /* renamed from: M */
    private String f87843M;

    /* renamed from: N */
    private String f87844N;

    /* renamed from: O */
    private FrameLayout f87845O;

    /* renamed from: P */
    private SmartImageView f87846P;

    /* renamed from: Q */
    private DmtTextView f87847Q;

    /* renamed from: R */
    private HashMap f87848R;

    /* renamed from: i */
    public String f87849i;

    /* renamed from: j */
    public String f87850j;

    /* renamed from: k */
    public final LogPbBean f87851k = new LogPbBean();

    /* renamed from: m */
    private DetailAwemeListFragment f87852m;

    /* renamed from: n */
    private final C7541d f87853n = C7546e.m23569a(new C33659d(this));

    /* renamed from: o */
    private final C7541d f87854o = C7546e.m23569a(new C33660e(this));

    /* renamed from: p */
    private final C7541d f87855p = C7546e.m23569a(new C33663h(this));

    /* renamed from: q */
    private final C7541d f87856q = C7546e.m23569a(new C33658c(this));

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$a */
    public static final class C33656a {
        private C33656a() {
        }

        public /* synthetic */ C33656a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MovieDetailFragment m108617a(String str, String str2, String str3) {
            C7573i.m23587b(str, "mvId");
            C7573i.m23587b(str2, "enterFrom");
            C7573i.m23587b(str3, "groupId");
            MovieDetailFragment movieDetailFragment = new MovieDetailFragment();
            Bundle bundle = new Bundle(3);
            bundle.putString("mv_id", str);
            bundle.putString("enter_from", str2);
            bundle.putString("group_id", str3);
            movieDetailFragment.setArguments(bundle);
            return movieDetailFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$b */
    static final class C33657b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87857a;

        C33657b(MovieDetailFragment movieDetailFragment) {
            this.f87857a = movieDetailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (TimeLockRuler.isTeenModeON()) {
                C10761a.m31410e((Context) this.f87857a.getActivity(), this.f87857a.getString(R.string.e5p)).mo25750a();
                return;
            }
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService == null || !iAVService.needLoginBeforeRecord() || C6399b.m19944t()) {
                C7573i.m23582a((Object) iAVService, "avService");
                if (iAVService.getPublishService().checkIsAlreadyPublished(this.f87857a.getContext())) {
                    new C38265v(this.f87857a.getActivity()).mo95892a(this.f87857a.f87849i, "mv_page", "mv_page");
                    C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("shoot_way", "mv_page").mo59973a("enter_from", "mv_page").mo59973a("enter_method", "click_mv_publish").mo59973a("mv_id", this.f87857a.f87849i).mo59973a("log_pb", C28199ae.m92689a().mo71790a(this.f87857a.f87851k)).mo59973a("group_id", this.f87857a.f87850j).mo59973a("content_type", "mv").mo59973a("content_source", "upload").f60753a);
                    return;
                }
                return;
            }
            String string = this.f87857a.getString(R.string.dtg);
            C7573i.m23582a((Object) string, "getString(R.string.shoot_after_login)");
            C32656f.m105747a((Fragment) this.f87857a, "movie", "click_movie_shoot", C42914ab.m136242a().mo104633a("login_title", string).f111445a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$c */
    static final class C33658c extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87858a;

        C33658c(MovieDetailFragment movieDetailFragment) {
            this.f87858a = movieDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f87858a.mo86056b((int) R.id.aue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$d */
    static final class C33659d extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87859a;

        C33659d(MovieDetailFragment movieDetailFragment) {
            this.f87859a = movieDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f87859a.mo86056b((int) R.id.da5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$e */
    static final class C33660e extends Lambda implements C7561a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87860a;

        C33660e(MovieDetailFragment movieDetailFragment) {
            this.f87860a = movieDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtStatusView invoke() {
            return (DmtStatusView) this.f87860a.mo86056b((int) R.id.dav);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$f */
    static final class C33661f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87861a;

        C33661f(MovieDetailFragment movieDetailFragment) {
            this.f87861a = movieDetailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f87861a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$g */
    static final class C33662g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87862a;

        C33662g(MovieDetailFragment movieDetailFragment) {
            this.f87862a = movieDetailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87862a.mo29060a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$h */
    static final class C33663h extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87863a;

        C33663h(MovieDetailFragment movieDetailFragment) {
            this.f87863a = movieDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f87863a.mo86056b((int) R.id.c0b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailFragment$i */
    static final class C33664i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MovieDetailFragment f87864a;

        /* renamed from: b */
        final /* synthetic */ C30221c f87865b;

        C33664i(MovieDetailFragment movieDetailFragment, C30221c cVar) {
            this.f87864a = movieDetailFragment;
            this.f87865b = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("xmas_banner_click", (Map) C22984d.m75611a().mo59973a("enter_from", "mv_page").mo59973a("gen", C29132a.m95567d()).mo59973a("mv_id", this.f87864a.f87849i).f60753a);
            Context context = this.f87864a.getContext();
            C30223b bVar = this.f87865b.f79529s;
            C7573i.m23582a((Object) bVar, "entry.bannerDetail");
            C29135b.m95580a(context, bVar.f79533b);
        }
    }

    /* renamed from: d */
    private final View m108599d() {
        return (View) this.f87853n.getValue();
    }

    /* renamed from: e */
    private final DmtStatusView m108600e() {
        return (DmtStatusView) this.f87854o.getValue();
    }

    /* renamed from: f */
    private final DmtTextView m108601f() {
        return (DmtTextView) this.f87855p.getValue();
    }

    /* renamed from: j */
    private final View m108602j() {
        return (View) this.f87856q.getValue();
    }

    /* renamed from: o */
    private void m108605o() {
        if (this.f87848R != null) {
            this.f87848R.clear();
        }
    }

    /* renamed from: a */
    public final String mo61693a(int i) {
        return "movie";
    }

    /* renamed from: b */
    public final View mo86056b(int i) {
        if (this.f87848R == null) {
            this.f87848R = new HashMap();
        }
        View view = (View) this.f87848R.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f87848R.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: m */
    public final int mo61706m() {
        return R.layout.p1;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m108605o();
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
    }

    /* renamed from: n */
    public final String mo61707n() {
        String str = this.f87849i;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: l */
    private final void m108604l() {
        m108599d().setOnClickListener(new C33657b(this));
    }

    /* renamed from: a */
    public final void mo29060a() {
        if (m108600e().mo25940d(true)) {
            C33647a aVar = this.f87840J;
            if (aVar != null) {
                aVar.mo56976a("", this.f87849i);
            }
        }
    }

    /* renamed from: k */
    private final DetailAwemeListFragment m108603k() {
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractDetailFragment.f68818r);
        boolean z = false;
        sb.append(0);
        Fragment a = childFragmentManager.mo2644a(sb.toString());
        if (!(a instanceof DetailAwemeListFragment)) {
            a = DetailAwemeListFragment.m77808a(20, "movie", this.f87849i, false, "", "from_detail_activity", new MovieDetailAwemeListProvider());
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) a;
            if (this.f68820B == 0) {
                z = true;
            }
            detailAwemeListFragment.f62597p = z;
            detailAwemeListFragment.f62598q = true;
        }
        if (a != null) {
            return (DetailAwemeListFragment) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
    }

    /* renamed from: q */
    public final FragmentPagerAdapter mo61713q() {
        this.f68822D = new ArrayList();
        this.f68823E = new ArrayList();
        this.f62485e = new ArrayList();
        this.f87852m = m108603k();
        List list = this.f68822D;
        DetailAwemeListFragment detailAwemeListFragment = this.f87852m;
        if (detailAwemeListFragment == null) {
            C7573i.m23583a("mHotFragment");
        }
        list.add(detailAwemeListFragment);
        List list2 = this.f68823E;
        DetailAwemeListFragment detailAwemeListFragment2 = this.f87852m;
        if (detailAwemeListFragment2 == null) {
            C7573i.m23583a("mHotFragment");
        }
        list2.add(detailAwemeListFragment2);
        this.f62485e.add(Integer.valueOf(20));
        return new ProfileFragmentAdapter(getChildFragmentManager(), this.f68823E, this.f62485e);
    }

    /* renamed from: a */
    private static CircleOptions m108596a(Context context) {
        CircleOptions a = new C12089a().mo29783b(C12123c.m35292a(context, 2.0f)).mo29780a(C12123c.m35292a(context, 0.0f)).mo29782a();
        C7573i.m23582a((Object) a, "builder.build()");
        return a;
    }

    /* renamed from: a */
    private final void m108597a(MvModel mvModel) {
        long j;
        TextView textView = this.f68830u;
        C7573i.m23582a((Object) textView, "mTitle");
        textView.setText(mvModel.getName());
        DmtTextView dmtTextView = (DmtTextView) mo86056b((int) R.id.c0b);
        C7573i.m23582a((Object) dmtTextView, "movie_title");
        dmtTextView.setText(mvModel.getName());
        DmtTextView dmtTextView2 = (DmtTextView) mo86056b((int) R.id.c2g);
        C7573i.m23582a((Object) dmtTextView2, "mv_used_count");
        StringBuilder sb = new StringBuilder();
        Long userCount = mvModel.getUserCount();
        if (userCount != null) {
            j = userCount.longValue();
        } else {
            j = 0;
        }
        sb.append(C30537o.m99741b(j));
        sb.append(" ");
        dmtTextView2.setText(sb.toString());
        C23323e.m76524b((ShapedRemoteImageView) mo86056b((int) R.id.c0a), mvModel.getIconUrl());
    }

    /* renamed from: b */
    private final void m108598b(C33645c cVar) {
        String str;
        if (!C6399b.m19944t() || !C29132a.m95560a()) {
            FrameLayout frameLayout = this.f87845O;
            if (frameLayout == null) {
                C7573i.m23583a("activityBannerContainer");
            }
            frameLayout.setVisibility(8);
        } else {
            C30221c g = C29132a.m95572g();
            if (!(g == null || g.f79529s == null || g.f79522l == null)) {
                List<String> list = g.f79522l;
                MvModel mvModel = cVar.f87811c;
                if (mvModel != null) {
                    str = mvModel.getMvId();
                } else {
                    str = null;
                }
                if (list.contains(str)) {
                    if (!TextUtils.isEmpty(g.f79524n)) {
                        DmtTextView dmtTextView = this.f87847Q;
                        if (dmtTextView == null) {
                            C7573i.m23583a("detailPageText");
                        }
                        dmtTextView.setVisibility(0);
                        DmtTextView dmtTextView2 = this.f87847Q;
                        if (dmtTextView2 == null) {
                            C7573i.m23583a("detailPageText");
                        }
                        dmtTextView2.setText(g.f79524n);
                        FrameLayout frameLayout2 = this.f87845O;
                        if (frameLayout2 == null) {
                            C7573i.m23583a("activityBannerContainer");
                        }
                        frameLayout2.setVisibility(0);
                    } else {
                        DmtTextView dmtTextView3 = this.f87847Q;
                        if (dmtTextView3 == null) {
                            C7573i.m23583a("detailPageText");
                        }
                        dmtTextView3.setVisibility(8);
                    }
                    FrameLayout frameLayout3 = this.f87845O;
                    if (frameLayout3 == null) {
                        C7573i.m23583a("activityBannerContainer");
                    }
                    frameLayout3.setVisibility(0);
                    SmartImageView smartImageView = this.f87846P;
                    if (smartImageView == null) {
                        C7573i.m23583a("activityBannerBg");
                    }
                    smartImageView.setVisibility(0);
                    C6907h.m21524a("xmas_banner_show", (Map) C22984d.m75611a().mo59973a("gen", C29132a.m95567d()).mo59973a("enter_from", "mv_page").mo59973a("mv_id", this.f87849i).f60753a);
                    C30223b bVar = g.f79529s;
                    C7573i.m23582a((Object) bVar, "entry.bannerDetail");
                    C12139r a = C12133n.m35301a(bVar.f79532a).mo29845a("MovieDetailFragment").mo29842a(m108596a((Context) getActivity()));
                    SmartImageView smartImageView2 = this.f87846P;
                    if (smartImageView2 == null) {
                        C7573i.m23583a("activityBannerBg");
                    }
                    a.mo29844a((C12128i) smartImageView2).mo29848a();
                    FrameLayout frameLayout4 = this.f87845O;
                    if (frameLayout4 == null) {
                        C7573i.m23583a("activityBannerContainer");
                    }
                    frameLayout4.setOnClickListener(new C33664i(this, g));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r2 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r0 == null) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 == null) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61696a(android.os.Bundle r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            java.lang.String r0 = "mv_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            r1.f87849i = r0
            r0 = 0
            r1.f68821C = r0
            if (r2 == 0) goto L_0x001b
            java.lang.String r0 = "enter_from"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x001d
        L_0x001b:
            java.lang.String r0 = ""
        L_0x001d:
            r1.f87843M = r0
            if (r2 == 0) goto L_0x0029
            java.lang.String r0 = "group_id"
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r2 = ""
        L_0x002b:
            r1.f87850j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.movie.view.MovieDetailFragment.mo61696a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo67556a(View view) {
        super.mo67556a(view);
        if (view == null) {
            C7573i.m23580a();
        }
        View findViewById = view.findViewById(R.id.a80);
        C7573i.m23582a((Object) findViewById, "view!!.findViewById(R.id.detail_page_info)");
        this.f87847Q = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ar);
        C7573i.m23582a((Object) findViewById2, "view!!.findViewById(R.id.activity_banner_img_bg)");
        this.f87846P = (SmartImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.aq);
        C7573i.m23582a((Object) findViewById3, "view!!.findViewById(R.id.activity_banner_holder)");
        this.f87845O = (FrameLayout) findViewById3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86054a(com.p280ss.android.ugc.aweme.movie.p1402a.C33645c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "mvDetailModel"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            boolean r0 = r5.isViewValid()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r0 = r6.f87811c
            r1 = 1
            if (r0 != 0) goto L_0x0021
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r6 = r5.m108600e()
            r0 = 0
            r6.mo25938c(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r6 = r5.m108600e()
            r6.mo25934a(r1)
            return
        L_0x0021:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r5.m108600e()
            r0.mo25938c(r1)
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r0 = r6.f87811c
            r5.m108597a(r0)
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r6.f87812d
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.getImprId()
            if (r0 != 0) goto L_0x0039
        L_0x0037:
            java.lang.String r0 = ""
        L_0x0039:
            r5.f87844N = r0
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r5.f87851k
            java.lang.String r1 = r5.f87844N
            r0.setImprId(r1)
            java.lang.String r0 = "enter_mv_detail"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r5.f87843M
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.ae r3 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r5.f87851k
            java.lang.String r3 = r3.mo71790a(r4)
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "group_id"
            java.lang.String r3 = r5.f87850j
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "mv_id"
            java.lang.String r3 = r5.f87849i
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            r5.m108598b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.movie.view.MovieDetailFragment.mo86054a(com.ss.android.ugc.aweme.movie.a.c):void");
    }

    /* renamed from: a */
    public final void mo86055a(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (isViewValid()) {
            m108600e().mo25934a(true);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.f87849i)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.f87840J = new C33647a();
        C33647a aVar = this.f87840J;
        if (aVar != null) {
            aVar.mo66537a(this);
        }
        ((AutoRTLImageView) mo86056b((int) R.id.jo)).setOnClickListener(new C33661f(this));
        m108604l();
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        m108600e().setBuilder(C10803a.m31631a(getContext()).mo25964b(new C10806a(context).mo25985a((int) R.drawable.b7_).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, new C33662g(this)).f29135a));
        mo29060a();
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (this.f87842L == 0.0f && m108601f().getVisibility() == 0) {
            int bottom = m108601f().getBottom();
            View view = this.f68831v;
            C7573i.m23582a((Object) view, "mTitleColorCtrl");
            this.f87842L = (float) (bottom - view.getBottom());
        }
        if (this.f87841K == 0.0f) {
            int bottom2 = m108602j().getBottom();
            View view2 = this.f68831v;
            C7573i.m23582a((Object) view2, "mTitleColorCtrl");
            this.f87841K = (float) (bottom2 - view2.getBottom());
        }
        float f = (float) i;
        float f2 = (f - this.f87842L) / (this.f87841K - this.f87842L);
        if (((double) f2) <= 0.2d) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        View view3 = this.f68831v;
        C7573i.m23582a((Object) view3, "mTitleColorCtrl");
        view3.setAlpha(f2);
        if (C6399b.m19944t()) {
            TextView textView = this.f68830u;
            C7573i.m23582a((Object) textView, "mTitle");
            textView.setAlpha(f2);
            m108602j().setAlpha(1.0f - (f / this.f87841K));
            return;
        }
        TextView textView2 = this.f68830u;
        C7573i.m23582a((Object) textView2, "mTitle");
        textView2.setAlpha(f2 * f2 * f2);
        m108602j().setAlpha((float) Math.pow((double) (1.0f - (f / this.f87841K)), 3.0d));
    }
}
