package com.p280ss.android.ugc.aweme.mix;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
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
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.detail.DetailViewModel;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.share.improve.pkg.C38236c.C38237a;
import com.p280ss.android.ugc.aweme.utils.C43060dk;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.video.preload.C43304i;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment */
public final class MixDetailFragment extends AmeBaseFragment implements OnClickListener, C11497af<C33560n>, C11592h, C6905a, C28532n, C33537c {

    /* renamed from: A */
    public static final C33480a f87438A = new C33480a(null);

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f87439e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MixDetailFragment.class), "mMixDetailModel", "getMMixDetailModel()Lcom/ss/android/ugc/aweme/mix/MixDetailViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MixDetailFragment.class), "mMixListAdapter", "getMMixListAdapter()Lcom/ss/android/ugc/aweme/mix/MixListAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MixDetailFragment.class), "smoothScroller", "getSmoothScroller()Landroid/support/v7/widget/RecyclerView$SmoothScroller;"))};

    /* renamed from: B */
    private String f87440B;

    /* renamed from: C */
    private View f87441C;

    /* renamed from: D */
    private View f87442D;

    /* renamed from: E */
    private CheckableImageView f87443E;

    /* renamed from: F */
    private DmtTextView f87444F;

    /* renamed from: G */
    private RelativeLayout f87445G;

    /* renamed from: H */
    private int f87446H;

    /* renamed from: J */
    private int f87447J;

    /* renamed from: K */
    private final lifecycleAwareLazy f87448K;

    /* renamed from: L */
    private final C7541d f87449L;

    /* renamed from: M */
    private long f87450M;

    /* renamed from: N */
    private boolean f87451N;

    /* renamed from: O */
    private final C7541d f87452O;

    /* renamed from: P */
    private HashMap f87453P;

    /* renamed from: f */
    public boolean f87454f = true;

    /* renamed from: g */
    public Long f87455g;

    /* renamed from: h */
    public String f87456h;

    /* renamed from: i */
    public String f87457i;

    /* renamed from: j */
    public String f87458j;

    /* renamed from: k */
    public MixRefreshLayout f87459k;

    /* renamed from: l */
    public RecyclerView f87460l;

    /* renamed from: m */
    public C33549k f87461m;

    /* renamed from: n */
    public DmtStatusView f87462n;

    /* renamed from: o */
    public DmtTextView f87463o;

    /* renamed from: p */
    public C33539e f87464p;

    /* renamed from: q */
    public int f87465q;

    /* renamed from: r */
    public String f87466r = "";

    /* renamed from: s */
    public MixStruct f87467s;

    /* renamed from: t */
    public DetailViewModel f87468t;

    /* renamed from: u */
    public long f87469u;

    /* renamed from: v */
    public final C33560n f87470v = new C33560n();

    /* renamed from: w */
    public final C33487g f87471w;

    /* renamed from: x */
    public MixInfo f87472x;

    /* renamed from: y */
    public volatile boolean f87473y;

    /* renamed from: z */
    public final C33571x f87474z;

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$a */
    public static final class C33480a {
        private C33480a() {
        }

        public /* synthetic */ C33480a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MixDetailFragment m108296a(String str, String str2, String str3, String str4, Long l) {
            C7573i.m23587b(str, "mixId");
            C7573i.m23587b(str2, "uid");
            C7573i.m23587b(str3, "eventType");
            C7573i.m23587b(str4, "orderFrom");
            MixDetailFragment mixDetailFragment = new MixDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mix_id", str);
            bundle.putString("uid", str2);
            bundle.putString("event_type", str3);
            bundle.putString("mix_from_order", str4);
            if (l != null) {
                bundle.putLong("mix_enter_episode_num", l.longValue());
            }
            mixDetailFragment.setArguments(bundle);
            return mixDetailFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$b */
    static final class C33481b extends Lambda implements C7563m<View, Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87475a;

        /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$b$a */
        static final class C33482a extends Lambda implements C7562b<MixDetailState, Boolean> {

            /* renamed from: a */
            final /* synthetic */ List f87476a;

            /* renamed from: b */
            final /* synthetic */ int f87477b;

            C33482a(List list, int i) {
                this.f87476a = list;
                this.f87477b = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m108298a((MixDetailState) obj));
            }

            /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private boolean m108298a(com.p280ss.android.ugc.aweme.mix.MixDetailState r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                    java.util.List r0 = r4.f87476a
                    boolean r0 = r0.isEmpty()
                    r1 = 1
                    if (r0 != 0) goto L_0x0030
                    java.util.List r0 = r4.f87476a
                    java.util.List r2 = r4.f87476a
                    int r2 = r2.size()
                    int r2 = r2 - r1
                    java.lang.Object r0 = r0.get(r2)
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r0
                    com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r0.getMixInfo()
                    if (r0 == 0) goto L_0x0030
                    com.ss.android.ugc.aweme.feed.model.MixStatisStruct r0 = r0.statis
                    if (r0 == 0) goto L_0x0030
                    long r2 = r0.currentEpisode
                    int r0 = (int) r2
                    int r0 = r0 - r1
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    goto L_0x0031
                L_0x0030:
                    r0 = 0
                L_0x0031:
                    if (r0 != 0) goto L_0x0043
                    com.bytedance.jedi.arch.ext.list.ListState r5 = r5.getListState()
                    com.bytedance.jedi.arch.ext.list.n r5 = r5.getPayload()
                    com.ss.android.ugc.aweme.mix.t r5 = (com.p280ss.android.ugc.aweme.mix.C33567t) r5
                    int r5 = r5.f31255b
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L_0x0043:
                    int r5 = r4.f87477b
                    r2 = -1
                    r3 = 0
                    if (r5 != r2) goto L_0x004a
                    return r3
                L_0x004a:
                    int r5 = r0.intValue()
                    int r0 = r4.f87477b
                    if (r5 < r0) goto L_0x0053
                    return r1
                L_0x0053:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailFragment.C33481b.C33482a.m108298a(com.ss.android.ugc.aweme.mix.MixDetailState):boolean");
            }
        }

        C33481b(MixDetailFragment mixDetailFragment) {
            this.f87475a = mixDetailFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108297a((View) obj, ((Number) obj2).longValue());
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[LOOP:0: B:1:0x0015->B:12:0x0038, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[EDGE_INSN: B:24:0x003c->B:14:0x003c ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m108297a(android.view.View r8, long r9) {
            /*
                r7 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.C7573i.m23587b(r8, r0)
                com.ss.android.ugc.aweme.mix.MixDetailFragment r8 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixListAdapter r8 = r8.mo85821k()
                java.util.List r8 = r8.mo60561d()
                java.util.Iterator r0 = r8.iterator()
                r1 = 0
                r2 = 0
            L_0x0015:
                boolean r3 = r0.hasNext()
                r4 = 1
                if (r3 == 0) goto L_0x003b
                java.lang.Object r3 = r0.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r3
                com.ss.android.ugc.aweme.feed.model.MixStruct r3 = r3.getMixInfo()
                if (r3 == 0) goto L_0x0034
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r3 = r3.statis
                if (r3 == 0) goto L_0x0034
                long r5 = r3.currentEpisode
                int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r3 != 0) goto L_0x0034
                r3 = 1
                goto L_0x0035
            L_0x0034:
                r3 = 0
            L_0x0035:
                if (r3 == 0) goto L_0x0038
                goto L_0x003c
            L_0x0038:
                int r2 = r2 + 1
                goto L_0x0015
            L_0x003b:
                r2 = -1
            L_0x003c:
                com.ss.android.ugc.aweme.mix.MixDetailFragment r0 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixDetailFragment r1 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixDetailViewModel r1 = r1.mo85820j()
                com.bytedance.jedi.arch.JediViewModel r1 = (com.bytedance.jedi.arch.JediViewModel) r1
                com.ss.android.ugc.aweme.mix.MixDetailFragment$b$a r3 = new com.ss.android.ugc.aweme.mix.MixDetailFragment$b$a
                r3.<init>(r8, r2)
                kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
                java.lang.Object r8 = r0.mo29066a(r1, r3)
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                com.ss.android.ugc.aweme.mix.MixDetailFragment r0 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixListAdapter r0 = r0.mo85821k()
                r0.f87554c = r9
                com.ss.android.ugc.aweme.mix.MixDetailFragment r0 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixListAdapter r0 = r0.mo85821k()
                r0.f87555d = r9
                java.lang.String r0 = "compilation_detail"
                com.ss.android.ugc.aweme.mix.MixDetailFragment r1 = r7.f87475a
                java.lang.String r1 = r1.f87457i
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r7.f87475a
                java.lang.String r3 = r3.f87456h
                java.lang.Long r5 = java.lang.Long.valueOf(r9)
                com.p280ss.android.ugc.aweme.feed.p1234j.C28506u.m93703a(r0, r1, r3, r5)
                if (r8 == 0) goto L_0x008e
                com.ss.android.ugc.aweme.mix.MixDetailFragment r8 = r7.f87475a     // Catch:{ Exception -> 0x0084 }
                com.ss.android.ugc.aweme.mix.MixListAdapter r8 = r8.mo85821k()     // Catch:{ Exception -> 0x0084 }
                r8.notifyDataSetChanged()     // Catch:{ Exception -> 0x0084 }
                goto L_0x0088
            L_0x0084:
                r8 = move-exception
                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r8)
            L_0x0088:
                com.ss.android.ugc.aweme.mix.MixDetailFragment r8 = r7.f87475a
                r8.mo85816a(r2)
                return
            L_0x008e:
                com.ss.android.ugc.aweme.mix.MixDetailFragment r8 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixDetailViewModel r8 = r8.mo85820j()
                int r9 = (int) r9
                int r9 = r9 - r4
                r8.mo85861b(r9)
                com.ss.android.ugc.aweme.mix.MixDetailFragment r8 = r7.f87475a
                r8.mo85829p()
                com.ss.android.ugc.aweme.mix.MixDetailFragment r8 = r7.f87475a
                r8.mo85833t()
                com.ss.android.ugc.aweme.mix.MixDetailFragment r8 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixDetailFragment r9 = r7.f87475a
                com.ss.android.ugc.aweme.mix.MixInfo r9 = r9.f87472x
                r8.mo85817a(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailFragment.C33481b.m108297a(android.view.View, long):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$c */
    static final class C33483c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87478a;

        C33483c(MixDetailFragment mixDetailFragment) {
            this.f87478a = mixDetailFragment;
        }

        public final void run() {
            this.f87478a.mo85821k().ah_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$d */
    static final class C33484d extends Lambda implements C7562b<MixDetailState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ BooleanRef f87479a;

        C33484d(BooleanRef booleanRef) {
            this.f87479a = booleanRef;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m108299a((MixDetailState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108299a(MixDetailState mixDetailState) {
            C7573i.m23587b(mixDetailState, "it");
            this.f87479a.element = ((C33567t) mixDetailState.getListState().getPayload()).f31254a.f31214a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$e */
    static final class C33485e extends Lambda implements C7563m<MixDetailState, Bundle, MixDetailState> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87480a;

        C33485e(MixDetailFragment mixDetailFragment) {
            this.f87480a = mixDetailFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MixDetailState invoke(MixDetailState mixDetailState, Bundle bundle) {
            C7573i.m23587b(mixDetailState, "$receiver");
            this.f87480a.mo85822l();
            return MixDetailState.copy$default(mixDetailState, this.f87480a.f87456h, null, null, this.f87480a.f87455g, 0, 22, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$f */
    static final class C33486f extends Lambda implements C7561a<MixListAdapter> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87481a;

        C33486f(MixDetailFragment mixDetailFragment) {
            this.f87481a = mixDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MixListAdapter invoke() {
            MixListAdapter mixListAdapter = new MixListAdapter(this.f87481a, this.f87481a.f87471w, this.f87481a, null, 8, null);
            Long l = this.f87481a.f87455g;
            if (l != null) {
                mixListAdapter.f87554c = l.longValue();
            }
            mixListAdapter.mo66506d(R.string.am0);
            return mixListAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$g */
    public static final class C33487g implements C23685d {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87482a;

        C33487g(MixDetailFragment mixDetailFragment) {
            this.f87482a = mixDetailFragment;
        }

        /* renamed from: a */
        public final void mo61615a(View view, Aweme aweme, String str) {
            C7573i.m23587b(view, "view");
            C7573i.m23587b(aweme, "aweme");
            C28503s.m93678a((JediViewModel) this.f87482a.mo85820j());
            this.f87482a.mo85821k().mo85865b(true);
            this.f87482a.mo85821k().f87554c = 0;
            MixStruct mixInfo = aweme.getMixInfo();
            if (mixInfo != null) {
                MixStatusStruct mixStatusStruct = mixInfo.status;
                if (mixStatusStruct != null) {
                    mixStatusStruct.setViewedInMix(1);
                }
            }
            C7195s a = C7195s.m22438a();
            Activity activity = this.f87482a.getActivity();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aweme.getAid());
            a.mo18681a(activity, C7203u.m22460a(sb.toString()).mo18694a("refer", "compilation_detail").mo18694a("video_from", "from_mix_detail").mo18693a("profile_enterprise_type", aweme.getEnterpriseType()).mo18693a("page_type", 9).mo18694a("previous_page", this.f87482a.f87457i).mo18694a("mix_from_order", this.f87482a.f87458j).mo18695a(), view);
            C43304i.m137380a(aweme);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$h */
    static final class C33488h extends Lambda implements C7562b<MixDetailState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87483a;

        C33488h(MixDetailFragment mixDetailFragment) {
            this.f87483a = mixDetailFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m108303a((MixDetailState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108303a(MixDetailState mixDetailState) {
            String str;
            C7573i.m23587b(mixDetailState, "state");
            if (TextUtils.isEmpty(this.f87483a.f87457i)) {
                str = "";
            } else {
                str = String.valueOf(this.f87483a.f87457i);
            }
            C38237a.m122172a(this.f87483a.requireActivity(), this.f87483a.f87467s, mixDetailState.getListState().getList(), "enter_compilation_detail", str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$i */
    static final class C33489i implements C23386b {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87484a;

        C33489i(MixDetailFragment mixDetailFragment) {
            this.f87484a = mixDetailFragment;
        }

        /* renamed from: a */
        public final void mo60744a() {
            if (!C33547i.m108417a(this.f87484a.getActivity())) {
                C10761a.m31399c((Context) this.f87484a.getActivity(), (int) R.string.cjs).mo25750a();
                MixRefreshLayout mixRefreshLayout = this.f87484a.f87459k;
                if (mixRefreshLayout != null) {
                    mixRefreshLayout.setRefreshing(false);
                    return;
                }
                return;
            }
            this.f87484a.mo85819g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$j */
    public static final class C33490j implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87485a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f87486b;

        public final void onGlobalLayout() {
            this.f87485a.mo85832s();
            ViewTreeObserver viewTreeObserver = this.f87486b.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }

        C33490j(MixDetailFragment mixDetailFragment, FrameLayout frameLayout) {
            this.f87485a = mixDetailFragment;
            this.f87486b = frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$k */
    public static final class C33491k implements C11557c<Aweme, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f87487a;

        /* renamed from: b */
        final /* synthetic */ C7563m f87488b;

        /* renamed from: c */
        final /* synthetic */ C7563m f87489c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f87490d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f87491e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Aweme>, C7581n> f87492f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f87490d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f87491e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Aweme>, C7581n> mo29140c() {
            return this.f87492f;
        }

        public C33491k(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f87487a = bVar;
            this.f87488b = mVar;
            this.f87489c = mVar2;
            this.f87490d = bVar;
            this.f87491e = mVar;
            this.f87492f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$l */
    public static final class C33492l implements C11557c<Aweme, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f87493a;

        /* renamed from: b */
        final /* synthetic */ C7563m f87494b;

        /* renamed from: c */
        final /* synthetic */ C7563m f87495c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f87496d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f87497e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Aweme>, C7581n> f87498f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f87496d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f87497e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Aweme>, C7581n> mo29140c() {
            return this.f87498f;
        }

        public C33492l(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f87493a = bVar;
            this.f87494b = mVar;
            this.f87495c = mVar2;
            this.f87496d = bVar;
            this.f87497e = mVar;
            this.f87498f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$m */
    static final class C33493m extends Lambda implements C7563m<C11585f, MixInfo, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87499a;

        C33493m(MixDetailFragment mixDetailFragment) {
            this.f87499a = mixDetailFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108311a((C11585f) obj, (MixInfo) obj2);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            if (r4 != null) goto L_0x004c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m108311a(com.bytedance.jedi.arch.C11585f r3, com.p280ss.android.ugc.aweme.mix.MixInfo r4) {
            /*
                r2 = this;
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r3, r0)
                java.lang.String r3 = "it"
                kotlin.jvm.internal.C7573i.m23587b(r4, r3)
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r2.f87499a
                r3.f87472x = r4
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r2.f87499a
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r4.mixInfo
                r3.f87467s = r0
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r2.f87499a
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r4.mixInfo
                if (r0 == 0) goto L_0x0021
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r0 = r0.statis
                if (r0 == 0) goto L_0x0021
                long r0 = r0.lastReadEpisode
                goto L_0x0023
            L_0x0021:
                r0 = 0
            L_0x0023:
                r3.f87469u = r0
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r2.f87499a
                com.ss.android.ugc.aweme.mix.k r3 = r3.f87461m
                if (r3 == 0) goto L_0x0030
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r4.mixInfo
                r3.mo85883a(r0)
            L_0x0030:
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r2.f87499a
                com.ss.android.ugc.aweme.mix.e r3 = r3.f87464p
                if (r3 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r4.mixInfo
                r3.mo85876a(r0)
            L_0x003b:
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r2.f87499a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r3.f87463o
                if (r3 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r4.mixInfo
                if (r4 == 0) goto L_0x004a
                java.lang.String r4 = r4.mixName
                if (r4 == 0) goto L_0x004a
                goto L_0x004c
            L_0x004a:
                java.lang.String r4 = ""
            L_0x004c:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
            L_0x0051:
                com.ss.android.ugc.aweme.mix.MixDetailFragment r3 = r2.f87499a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r3.f87463o
                if (r3 == 0) goto L_0x0062
                com.ss.android.ugc.aweme.mix.MixDetailFragment$m$1 r4 = new com.ss.android.ugc.aweme.mix.MixDetailFragment$m$1
                r4.<init>(r2)
                android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
                r3.setOnClickListener(r4)
                return
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailFragment.C33493m.m108311a(com.bytedance.jedi.arch.f, com.ss.android.ugc.aweme.mix.MixInfo):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$n */
    static final class C33495n extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        public static final C33495n f87501a = new C33495n();

        C33495n() {
            super(2);
        }

        /* renamed from: a */
        private static void m108312a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108312a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$o */
    static final class C33496o extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        public static final C33496o f87502a = new C33496o();

        C33496o() {
            super(1);
        }

        /* renamed from: a */
        private static void m108313a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m108313a((C11585f) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$p */
    static final class C33497p extends Lambda implements C7563m<C11585f, List<? extends Aweme>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87503a;

        C33497p(MixDetailFragment mixDetailFragment) {
            this.f87503a = mixDetailFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108314a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108314a(C11585f fVar, List<? extends Aweme> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (!list.isEmpty()) {
                DmtStatusView dmtStatusView = this.f87503a.f87462n;
                if (dmtStatusView != null) {
                    dmtStatusView.setVisibility(8);
                }
                fVar.mo29066a(this.f87503a.mo85820j(), new C7562b<MixDetailState, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C33497p f87504a;

                    {
                        this.f87504a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m108315a((MixDetailState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m108315a(MixDetailState mixDetailState) {
                        C7573i.m23587b(mixDetailState, "it");
                        if (((C33567t) mixDetailState.getListState().getPayload()).f87662c == 0) {
                            this.f87504a.f87503a.mo85818b(true);
                            return;
                        }
                        MixRefreshLayout mixRefreshLayout = this.f87504a.f87503a.f87459k;
                        if (mixRefreshLayout != null) {
                            FragmentActivity activity = this.f87504a.f87503a.getActivity();
                            if (activity == null) {
                                C7573i.m23580a();
                            }
                            C7573i.m23582a((Object) activity, "activity!!");
                            mixRefreshLayout.setRefreshHeader(new C33569v(activity));
                        }
                        this.f87504a.f87503a.mo85833t();
                    }
                });
            } else {
                this.f87503a.mo85818b(true);
                this.f87503a.mo85821k().mo66505c("暂无内容");
                this.f87503a.mo59100a(false);
            }
            this.f87503a.mo85817a(this.f87503a.f87472x);
            DmtStatusView dmtStatusView2 = this.f87503a.f87462n;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setVisibility(8);
            }
            DmtStatusView dmtStatusView3 = this.f87503a.f87462n;
            if (dmtStatusView3 != null) {
                dmtStatusView3.mo25950n();
            }
            if (this.f87503a.f87473y) {
                this.f87503a.mo85821k().mo85864a(true);
                RecyclerView recyclerView = this.f87503a.f87460l;
                if (recyclerView != null) {
                    C1273i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.mo5437e(0);
                    }
                }
                this.f87503a.f87473y = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$q */
    static final class C33499q extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        public static final C33499q f87505a = new C33499q();

        C33499q() {
            super(2);
        }

        /* renamed from: a */
        private static void m108316a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108316a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$r */
    static final class C33500r extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87506a;

        C33500r(MixDetailFragment mixDetailFragment) {
            this.f87506a = mixDetailFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m108317a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108317a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            fVar.mo29066a(this.f87506a.mo85820j(), new C7562b<MixDetailState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33500r f87507a;

                {
                    this.f87507a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m108318a((MixDetailState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108318a(MixDetailState mixDetailState) {
                    C7573i.m23587b(mixDetailState, "it");
                    if (mixDetailState.getPullType() == 2) {
                        this.f87507a.f87506a.mo85821k().ag_();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$s */
    static final class C33502s extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87508a;

        C33502s(MixDetailFragment mixDetailFragment) {
            this.f87508a = mixDetailFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108319a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108319a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f87508a.mo85821k().mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$t */
    static final class C33503t extends Lambda implements C7563m<C11585f, List<? extends Aweme>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87509a;

        C33503t(MixDetailFragment mixDetailFragment) {
            this.f87509a = mixDetailFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108320a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108320a(C11585f fVar, List<? extends Aweme> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f87509a.mo85820j(), new C7562b<MixDetailState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33503t f87510a;

                {
                    this.f87510a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C7581n invoke(MixDetailState mixDetailState) {
                    boolean z;
                    C7573i.m23587b(mixDetailState, "it");
                    if (((C33567t) mixDetailState.getListState().getPayload()).f87662c == 0) {
                        MixRefreshLayout mixRefreshLayout = this.f87510a.f87509a.f87459k;
                        if (mixRefreshLayout != null) {
                            mixRefreshLayout.setRefreshing(false);
                        }
                    }
                    if (mixDetailState.getPullType() == 2) {
                        return C7581n.f20898a;
                    }
                    if (((C33567t) mixDetailState.getListState().getPayload()).f87662c != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        MixRefreshLayout mixRefreshLayout2 = this.f87510a.f87509a.f87459k;
                        if (mixRefreshLayout2 == null) {
                            return null;
                        }
                        mixRefreshLayout2.setRefreshing(false);
                        return C7581n.f20898a;
                    }
                    this.f87510a.f87509a.mo85825o();
                    return C7581n.f20898a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$u */
    static final class C33505u extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87511a;

        C33505u(MixDetailFragment mixDetailFragment) {
            this.f87511a = mixDetailFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108322a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108322a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            fVar.mo29066a(this.f87511a.mo85820j(), new C7562b<MixDetailState, Object>(this) {

                /* renamed from: a */
                final /* synthetic */ C33505u f87512a;

                {
                    this.f87512a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Object invoke(MixDetailState mixDetailState) {
                    Object obj;
                    C7573i.m23587b(mixDetailState, "state");
                    if (mixDetailState.getPullType() == 2) {
                        if (((C33567t) mixDetailState.getListState().getPayload()).f87663d) {
                            this.f87512a.f87511a.mo59100a(true);
                        } else {
                            this.f87512a.f87511a.mo59100a(false);
                            RecyclerView recyclerView = this.f87512a.f87511a.f87460l;
                            if (recyclerView == null) {
                                return null;
                            }
                            obj = Boolean.valueOf(recyclerView.postDelayed(new Runnable(this) {

                                /* renamed from: a */
                                final /* synthetic */ C335061 f87513a;

                                {
                                    this.f87513a = r1;
                                }

                                public final void run() {
                                    this.f87513a.f87512a.f87511a.mo85821k().ah_();
                                }
                            }, 500));
                            return obj;
                        }
                    }
                    obj = C7581n.f20898a;
                    return obj;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$v */
    static final class C33508v extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        public static final C33508v f87514a = new C33508v();

        C33508v() {
            super(2);
        }

        /* renamed from: a */
        private static void m108324a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            C6921a.m21552a(4, "MixDetailFragment", "onEmpty called!");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108324a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$w */
    static final class C33509w extends Lambda implements C7562b<MixDetailState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87515a;

        C33509w(MixDetailFragment mixDetailFragment) {
            this.f87515a = mixDetailFragment;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n invoke(MixDetailState mixDetailState) {
            C7573i.m23587b(mixDetailState, "it");
            if (((C33567t) mixDetailState.getListState().getPayload()).f87662c == 0) {
                this.f87515a.mo85830q().f4993g = 0;
                RecyclerView recyclerView = this.f87515a.f87460l;
                if (recyclerView != null) {
                    C1273i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.mo5755a(this.f87515a.mo85830q());
                        return C7581n.f20898a;
                    }
                }
                return null;
            } else if (this.f87515a.f87473y) {
                return C7581n.f20898a;
            } else {
                this.f87515a.f87473y = true;
                this.f87515a.mo85824n();
                this.f87515a.mo85823m();
                this.f87515a.mo85820j().mo85861b(0);
                this.f87515a.mo85821k().mo85864a(false);
                return C7581n.f20898a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$x */
    static final class C33510x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87516a;

        C33510x(MixDetailFragment mixDetailFragment) {
            this.f87516a = mixDetailFragment;
        }

        public final void run() {
            this.f87516a.mo85818b(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$y */
    static final class C33511y extends Lambda implements C7561a<MixDetailFragment$smoothScroller$2$1> {

        /* renamed from: a */
        final /* synthetic */ MixDetailFragment f87517a;

        C33511y(MixDetailFragment mixDetailFragment) {
            this.f87517a = mixDetailFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MixDetailFragment$smoothScroller$2$1 invoke() {
            return new MixDetailFragment$smoothScroller$2$1(this, this.f87517a.getContext());
        }
    }

    /* renamed from: A */
    private void m108259A() {
        if (this.f87453P != null) {
            this.f87453P.clear();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: j */
    public final MixDetailViewModel mo85820j() {
        return (MixDetailViewModel) this.f87448K.getValue();
    }

    /* renamed from: k */
    public final MixListAdapter mo85821k() {
        return (MixListAdapter) this.f87449L.getValue();
    }

    /* renamed from: q */
    public final C1287r mo85830q() {
        return (C1287r) this.f87452O.getValue();
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        StringBuilder sb = new StringBuilder("handleHasMore:");
        sb.append(z);
        sb.append(',');
        sb.append(Log.getStackTraceString(new Throwable()));
        C6921a.m21562b("MixDetailFragment", sb.toString());
        if (!z) {
            this.f87454f = false;
            mo85821k().mo66504a((C6905a) null);
            RecyclerView recyclerView = this.f87460l;
            if (recyclerView != null) {
                recyclerView.postDelayed(new C33483c(this), 500);
            }
            mo85821k().mo66516d(true);
            return;
        }
        this.f87454f = true;
        mo85821k().mo66504a((C6905a) this);
        mo85821k().ai_();
        mo85821k().mo66516d(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r5.isCollected() == 1) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85817a(com.p280ss.android.ugc.aweme.mix.MixInfo r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r4.f87451N
            if (r0 == 0) goto L_0x0008
            return
        L_0x0008:
            com.ss.android.ugc.aweme.feed.model.MixStruct r5 = r5.mixInfo
            if (r5 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.feed.model.MixStatusStruct r5 = r5.status
            if (r5 == 0) goto L_0x0017
            int r5 = r5.isCollected()
            r0 = 1
            if (r5 == r0) goto L_0x003c
        L_0x0017:
            java.lang.Long r5 = r4.f87455g
            if (r5 == 0) goto L_0x003c
            java.lang.Long r5 = r4.f87455g
            if (r5 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            long r0 = r5.longValue()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x003c
        L_0x002a:
            com.ss.android.ugc.aweme.mix.x r5 = r4.f87474z
            r0 = 0
            r5.f87669b = r0
            com.ss.android.ugc.aweme.mix.x r5 = r4.f87474z
            r0 = 4634766966517661696(0x4052000000000000, double:72.0)
            int r0 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r0)
            r5.f87670c = r0
            r4.m108263y()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailFragment.mo85817a(com.ss.android.ugc.aweme.mix.MixInfo):void");
    }

    /* renamed from: w */
    private final C7563m<View, Long, C7581n> m108261w() {
        return new C33481b<>(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
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
        return this.f87470v;
    }

    /* renamed from: p */
    public final void mo85829p() {
        mo85818b(false);
    }

    /* renamed from: x */
    private final void m108262x() {
        RelativeLayout relativeLayout = this.f87445G;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(this.f87474z.f87668a);
        }
    }

    public final void aP_() {
        if (this.f87454f) {
            bd_();
        }
    }

    public final void bd_() {
        mo85820j().mo85858a(2);
    }

    /* renamed from: g */
    public final void mo85819g() {
        mo85820j().mo85858a(1);
    }

    /* renamed from: m */
    public final void mo85823m() {
        this.f87474z.f87668a = 0.0f;
        m108262x();
    }

    public final void onResume() {
        super.onResume();
        mo85821k().notifyDataSetChanged();
    }

    public final void onStart() {
        super.onStart();
        this.f87450M = SystemClock.elapsedRealtime();
    }

    /* renamed from: t */
    public final void mo85833t() {
        if (!this.f87451N) {
            this.f87474z.f87668a = 1.0f;
            m108262x();
        }
    }

    public final boolean aR_() {
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = false;
        mo29066a((VM1) mo85820j(), (C7562b<? super S1, ? extends R>) new C33484d<Object,Object>(booleanRef));
        return booleanRef.element;
    }

    /* renamed from: n */
    public final void mo85824n() {
        this.f87474z.f87669b = -C23486n.m77122a(72.0d);
        this.f87474z.f87670c = 0;
        m108263y();
    }

    /* renamed from: o */
    public final void mo85825o() {
        MixRefreshLayout mixRefreshLayout = this.f87459k;
        if (mixRefreshLayout != null) {
            mixRefreshLayout.postDelayed(new C33510x(this), 50);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C33539e eVar = this.f87464p;
        if (eVar != null) {
            eVar.mo85879d();
        }
        C33549k kVar = this.f87461m;
        if (kVar != null) {
            kVar.mo85885c();
        }
        m108259A();
    }

    public final void onStop() {
        String str;
        super.onStop();
        String str2 = this.f87456h;
        MixStruct mixStruct = this.f87467s;
        if (mixStruct != null) {
            User user = mixStruct.author;
            if (user != null) {
                str = user.getUid();
                C28506u.m93701a(str2, str, SystemClock.elapsedRealtime() - this.f87450M, "compilation_detail");
            }
        }
        str = null;
        C28506u.m93701a(str2, str, SystemClock.elapsedRealtime() - this.f87450M, "compilation_detail");
    }

    /* renamed from: r */
    public final void mo85831r() {
        C28506u.m93707b("compilation_detail", this.f87457i, this.f87456h);
        mo29066a((VM1) mo85820j(), (C7562b<? super S1, ? extends R>) new C33509w<Object,Object>(this));
    }

    /* renamed from: y */
    private final void m108263y() {
        LayoutParams layoutParams;
        int i;
        View view = this.f87442D;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = this.f87474z.f87669b;
            }
            View view2 = this.f87442D;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            MixRefreshLayout mixRefreshLayout = this.f87459k;
            if (mixRefreshLayout != null) {
                MixRefreshLayout mixRefreshLayout2 = this.f87459k;
                if (mixRefreshLayout2 != null) {
                    i = mixRefreshLayout2.getPaddingTop();
                } else {
                    i = 0;
                }
                mixRefreshLayout.setPadding(0, i, 0, this.f87474z.f87670c);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: s */
    public final void mo85832s() {
        LayoutParams layoutParams;
        int i;
        DmtStatusView dmtStatusView = this.f87462n;
        if (dmtStatusView != null) {
            layoutParams = dmtStatusView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            C33549k kVar = this.f87461m;
            if (kVar != null) {
                i = kVar.mo85882a();
            } else {
                i = C23486n.m77122a(40.0d) + C34943c.f91128x;
            }
            layoutParams2.topMargin = i;
            DmtStatusView dmtStatusView2 = this.f87462n;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setLayoutParams(layoutParams2);
            }
            DmtStatusView dmtStatusView3 = this.f87462n;
            if (dmtStatusView3 != null) {
                dmtStatusView3.setPadding(0, C23486n.m77122a(40.0d), 0, 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85835v() {
        /*
            r3 = this;
            r0 = 4634204016564240384(0x4050000000000000, double:64.0)
            int r0 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r0)
            com.ss.android.ugc.aweme.mix.k r1 = r3.f87461m
            r2 = 0
            if (r1 == 0) goto L_0x0014
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.f87616b
            if (r1 == 0) goto L_0x0014
            int r1 = r1.getHeight()
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            int r0 = r0 + r1
            r3.f87446H = r0
            com.ss.android.ugc.aweme.mix.k r0 = r3.f87461m
            if (r0 == 0) goto L_0x0024
            android.view.View r0 = r0.f87615a
            if (r0 == 0) goto L_0x0024
            int r2 = r0.getHeight()
        L_0x0024:
            r3.f87447J = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailFragment.mo85835v():void");
    }

    public MixDetailFragment() {
        C7563m eVar = new C33485e(this);
        C7584c a = C7575l.m23595a(MixDetailViewModel.class);
        C7561a mixDetailFragment$$special$$inlined$viewModel$1 = new MixDetailFragment$$special$$inlined$viewModel$1(a);
        this.f87448K = new lifecycleAwareLazy(this, mixDetailFragment$$special$$inlined$viewModel$1, new MixDetailFragment$$special$$inlined$viewModel$2(this, mixDetailFragment$$special$$inlined$viewModel$1, a, eVar));
        this.f87449L = C7546e.m23569a(new C33486f(this));
        this.f87471w = new C33487g(this);
        this.f87452O = C7546e.m23569a(new C33511y(this));
        this.f87474z = new C33571x();
    }

    /* renamed from: l */
    public final void mo85822l() {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle arguments = getArguments();
        Long l = null;
        if (arguments != null) {
            str = arguments.getString("mix_id");
        } else {
            str = null;
        }
        this.f87456h = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("uid");
        } else {
            str2 = null;
        }
        this.f87440B = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("event_type");
        } else {
            str3 = null;
        }
        this.f87457i = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str4 = arguments4.getString("mix_from_order");
        } else {
            str4 = null;
        }
        this.f87458j = str4;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            l = Long.valueOf(arguments5.getLong("mix_enter_episode_num"));
        }
        if (l != null && l.longValue() > 0) {
            this.f87455g = l;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85834u() {
        /*
            r8 = this;
            boolean r0 = r8.f87451N
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r8.f87446H
            r1 = 4634204016564240384(0x4050000000000000, double:64.0)
            int r1 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r1)
            if (r0 <= r1) goto L_0x00bc
            int r0 = r8.f87447J
            if (r0 > 0) goto L_0x0015
            goto L_0x00bc
        L_0x0015:
            int r0 = r8.f87465q
            float r0 = (float) r0
            r1 = 4627448617123184640(0x4038000000000000, double:24.0)
            int r1 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r1)
            float r1 = (float) r1
            float r0 = r0 - r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 4631389266797133824(0x4046000000000000, double:44.0)
            r5 = 0
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0048
            int r6 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r3)
            float r6 = (float) r6
            com.ss.android.ugc.aweme.mix.k r7 = r8.f87461m
            if (r7 == 0) goto L_0x003c
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r7.f87616b
            if (r7 == 0) goto L_0x003c
            int r7 = r7.getHeight()
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            float r7 = (float) r7
            float r6 = r6 + r7
            float r0 = r0 / r6
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            com.ss.android.ugc.aweme.mix.x r1 = r8.f87474z
            r1.f87668a = r0
            r8.m108262x()
            int r0 = r8.f87465q
            float r0 = (float) r0
            int r1 = r8.f87447J
            float r1 = (float) r1
            int r3 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r3)
            float r3 = (float) r3
            float r1 = r1 - r3
            float r0 = r0 - r1
            android.view.View r1 = r8.f87442D
            if (r1 == 0) goto L_0x0066
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 == 0) goto L_0x00b4
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            com.ss.android.ugc.aweme.mix.e r3 = r8.f87464p
            r6 = 4634766966517661696(0x4052000000000000, double:72.0)
            if (r3 == 0) goto L_0x0075
            boolean r3 = r3.f87589a
            if (r3 == 0) goto L_0x0081
        L_0x0075:
            if (r1 == 0) goto L_0x0081
            int r1 = r1.bottomMargin
            int r3 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r6)
            int r3 = -r3
            if (r1 != r3) goto L_0x0081
            return
        L_0x0081:
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b0
            int r1 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r6)
            float r1 = (float) r1
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x009b
            com.ss.android.ugc.aweme.mix.x r0 = r8.f87474z
            r0.f87669b = r2
            com.ss.android.ugc.aweme.mix.x r0 = r8.f87474z
            int r1 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r6)
            r0.f87670c = r1
            goto L_0x00ac
        L_0x009b:
            com.ss.android.ugc.aweme.mix.x r1 = r8.f87474z
            int r2 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r6)
            float r2 = (float) r2
            float r2 = r2 - r0
            int r2 = (int) r2
            int r2 = -r2
            r1.f87669b = r2
            com.ss.android.ugc.aweme.mix.x r1 = r8.f87474z
            int r0 = (int) r0
            r1.f87670c = r0
        L_0x00ac:
            r8.m108263y()
            return
        L_0x00b0:
            r8.mo85824n()
            return
        L_0x00b4:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailFragment.mo85834u():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85818b(boolean r4) {
        /*
            r3 = this;
            java.lang.String r0 = "MixDetailFragment"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "changeRealHeaderView called "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 4
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r0, r1)
            r3.f87451N = r4
            com.ss.android.ugc.aweme.mix.MixRefreshLayout r0 = r3.f87459k
            if (r0 == 0) goto L_0x001f
            r1 = r4 ^ 1
            r0.setEnabled(r1)
        L_0x001f:
            com.ss.android.ugc.aweme.mix.MixListAdapter r0 = r3.mo85821k()
            if (r4 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.mix.k r1 = r3.f87461m
            if (r1 == 0) goto L_0x002c
            android.view.View r1 = r1.f87615a
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            r0.mo60562b_(r1)
            if (r4 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.mix.MixListAdapter r4 = r3.mo85821k()
            r4.notifyDataSetChanged()
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailFragment.mo85818b(boolean):void");
    }

    @C7709l
    public final void onEvent(ShareCompleteEvent shareCompleteEvent) {
        View view;
        C7573i.m23587b(shareCompleteEvent, "event");
        if (isViewValid() && TextUtils.equals("mix", shareCompleteEvent.itemType)) {
            Context context = getContext();
            C33549k kVar = this.f87461m;
            if (kVar != null) {
                view = kVar.f87615a;
            } else {
                view = null;
            }
            C43091ed.m136696a(context, view, shareCompleteEvent);
        }
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
        if (anVar.f74631a == 21) {
            Object obj = anVar.f74632b;
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                if (TextUtils.equals(aweme.getMixId(), this.f87456h)) {
                    mo85821k().mo85865b(false);
                    aweme.getMixInfo();
                }
            }
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.jo) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (num != null && num.intValue() == R.id.d4t) {
            MixStruct mixStruct = this.f87467s;
            if (mixStruct != null) {
                MixStatusStruct mixStatusStruct = mixStruct.status;
                if (mixStatusStruct != null) {
                    if (mixStatusStruct.getStatus() == 1) {
                        C10761a.m31399c((Context) C6405d.m19984g(), (int) R.string.c_e).mo25750a();
                    } else if (mixStatusStruct.getStatus() == 3 || mixStatusStruct.getStatus() == 4) {
                        C10761a.m31399c((Context) C6405d.m19984g(), (int) R.string.c_d).mo25750a();
                    } else {
                        IAccountUserService a = C21115b.m71197a();
                        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                        User curUser = a.getCurUser();
                        if (curUser != null && curUser.isSecret()) {
                            C10761a.m31399c((Context) C6405d.m19984g(), (int) R.string.c_c).mo25750a();
                        }
                        String str2 = this.f87456h;
                        MixStruct mixStruct2 = this.f87467s;
                        if (mixStruct2 != null) {
                            User user = mixStruct2.author;
                            if (user != null) {
                                str = user.getUid();
                            }
                        }
                        C28506u.m93704a(str2, str, this.f87457i, "compilation_detail");
                        mo29066a((VM1) mo85820j(), (C7562b<? super S1, ? extends R>) new C33488h<Object,Object>(this));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo85816a(int i) {
        StringBuilder sb = new StringBuilder("scrollToPosition:");
        sb.append(i);
        C6921a.m21552a(4, "MixDetailFragment", sb.toString());
        if (i >= 0) {
            mo85830q().f4993g = i + 1;
            RecyclerView recyclerView = this.f87460l;
            if (recyclerView != null) {
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.mo5755a(mo85830q());
                }
            }
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: a */
    private static DmtTextView m108260a(Context context, int i) {
        C7573i.m23587b(context, "context");
        DmtTextView dmtTextView = new DmtTextView(context);
        dmtTextView.setTextColor(context.getResources().getColor(R.color.aze));
        dmtTextView.setTextSize(15.0f);
        dmtTextView.setText(R.string.c_b);
        return dmtTextView;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        C33539e eVar = new C33539e(this.f87441C, this.f87443E, this.f87444F, "inner_down", this.f87457i, null, true);
        this.f87464p = eVar;
        mo85820j().mo85859a(this.f87456h);
        RecyclerView recyclerView = this.f87460l;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setAdapter(mo85821k());
            mo85820j().f87522e = mo85821k();
            recyclerView.setLayoutManager(MixCellStyleExperiment.INSTANCE.createLayoutManager(getActivity(), recyclerView));
            MixCellStyleExperiment mixCellStyleExperiment = MixCellStyleExperiment.INSTANCE;
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            C1272h decoration = mixCellStyleExperiment.getDecoration(activity);
            if (decoration != null) {
                recyclerView.mo5525a(decoration);
            }
            recyclerView.mo5528a((C1281m) new MixDetailFragment$onViewCreated$$inlined$apply$lambda$1(this));
        }
        C43060dk.m136608a(this.f87460l, this);
        DmtStatusView dmtStatusView = this.f87462n;
        if (dmtStatusView != null) {
            dmtStatusView.mo25942f();
        }
        ListMiddleware.m33938a(mo85820j().f87523f, this, mo85821k(), false, false, new C33491k(C33496o.f87502a, C33499q.f87505a, new C33497p(this)), new C33492l(new C33500r(this), new C33502s(this), new C33503t(this)), new C33505u(this), C33508v.f87514a, null, null, 780, null);
        C11503a.m33919a(this, mo85820j(), C33548j.f87611a, null, C33495n.f87501a, null, new C33493m(this), 10, null);
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            this.f87468t = (DetailViewModel) C0069x.m159a(activity2).mo147a(DetailViewModel.class);
        }
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.oz, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.f87460l = (RecyclerView) frameLayout.findViewById(R.id.bzi);
            RecyclerView recyclerView = this.f87460l;
            if (!(recyclerView instanceof FpsRecyclerView)) {
                recyclerView = null;
            }
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) recyclerView;
            if (fpsRecyclerView != null) {
                fpsRecyclerView.setLabel("mix_detail_list");
            }
            MixRefreshLayout mixRefreshLayout = (MixRefreshLayout) frameLayout.findViewById(R.id.cr5);
            mixRefreshLayout.setEnabled(true);
            mixRefreshLayout.setRecyclerView(this.f87460l);
            mixRefreshLayout.setOnRefreshListener(new C33489i(this));
            this.f87459k = mixRefreshLayout;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C7573i.m23582a((Object) activity, "it");
                C33549k kVar = new C33549k(activity, this.f87440B, this.f87457i, this.f87456h, m108261w());
                this.f87461m = kVar;
                ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new C33490j(this, frameLayout));
                }
            }
            OnClickListener onClickListener = this;
            frameLayout.findViewById(R.id.jo).setOnClickListener(onClickListener);
            frameLayout.findViewById(R.id.d4t).setOnClickListener(onClickListener);
            this.f87462n = (DmtStatusView) frameLayout.findViewById(R.id.dav);
            C10803a a = C10803a.m31631a((Context) getActivity());
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                C7573i.m23582a((Object) activity2, "it");
                a.mo25963b((View) m108260a((Context) activity2, (int) R.string.c_b));
            }
            DmtStatusView dmtStatusView = this.f87462n;
            if (dmtStatusView != null) {
                dmtStatusView.setBuilder(a);
            }
            this.f87442D = frameLayout.findViewById(R.id.bz1);
            this.f87441C = frameLayout.findViewById(R.id.bz0);
            this.f87443E = (CheckableImageView) frameLayout.findViewById(R.id.bzg);
            this.f87444F = (DmtTextView) frameLayout.findViewById(R.id.bzl);
            this.f87445G = (RelativeLayout) frameLayout.findViewById(R.id.dk9);
            RelativeLayout relativeLayout = this.f87445G;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(0.0f);
            }
            this.f87463o = (DmtTextView) frameLayout.findViewById(R.id.title);
            return frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
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
