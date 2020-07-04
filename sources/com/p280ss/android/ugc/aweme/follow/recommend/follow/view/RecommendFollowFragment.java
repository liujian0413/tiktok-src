package com.p280ss.android.ugc.aweme.follow.recommend.follow.view;

import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.C29480e;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment */
public final class RecommendFollowFragment extends JediBaseFragment {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f77743f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendFollowFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/follow/recommend/follow/viewModel/RecommendFollowViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendFollowFragment.class), "recommendFollowAdapter", "getRecommendFollowAdapter()Lcom/ss/android/ugc/aweme/follow/recommend/follow/view/RecommendFollowAdapter;"))};

    /* renamed from: g */
    public String f77744g;

    /* renamed from: h */
    public String f77745h;

    /* renamed from: i */
    public RelationDynamicLabel f77746i;

    /* renamed from: j */
    public String f77747j = "homepage_hot";

    /* renamed from: k */
    private final lifecycleAwareLazy f77748k;

    /* renamed from: l */
    private final C7541d f77749l;

    /* renamed from: m */
    private HashMap f77750m;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$a */
    static final class C29482a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77751a;

        C29482a(RecommendFollowFragment recommendFollowFragment) {
            this.f77751a = recommendFollowFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtStatusView) this.f77751a.mo60553a((int) R.id.dav)).mo25942f();
            this.f77751a.mo69896i().mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$b */
    static final class C29483b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77752a;

        C29483b(RecommendFollowFragment recommendFollowFragment) {
            this.f77752a = recommendFollowFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f77752a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$c */
    public static final class C29484c implements C11557c<C29480e, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f77753a;

        /* renamed from: b */
        final /* synthetic */ C7563m f77754b;

        /* renamed from: c */
        final /* synthetic */ C7563m f77755c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f77756d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f77757e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C29480e>, C7581n> f77758f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f77756d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f77757e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C29480e>, C7581n> mo29140c() {
            return this.f77758f;
        }

        public C29484c(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f77753a = bVar;
            this.f77754b = mVar;
            this.f77755c = mVar2;
            this.f77756d = bVar;
            this.f77757e = mVar;
            this.f77758f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$d */
    public static final class C29485d implements C11557c<C29480e, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f77759a;

        /* renamed from: b */
        final /* synthetic */ C7563m f77760b;

        /* renamed from: c */
        final /* synthetic */ C7563m f77761c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f77762d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f77763e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C29480e>, C7581n> f77764f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f77762d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f77763e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C29480e>, C7581n> mo29140c() {
            return this.f77764f;
        }

        public C29485d(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f77759a = bVar;
            this.f77760b = mVar;
            this.f77761c = mVar2;
            this.f77762d = bVar;
            this.f77763e = mVar;
            this.f77764f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$e */
    static final class C29486e extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77765a;

        C29486e(RecommendFollowFragment recommendFollowFragment) {
            this.f77765a = recommendFollowFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m96996a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m96996a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                this.f77765a.mo75496j().ai_();
            } else {
                this.f77765a.mo75496j().ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$f */
    static final class C29487f extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77766a;

        C29487f(RecommendFollowFragment recommendFollowFragment) {
            this.f77766a = recommendFollowFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m96997a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m96997a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            ((DmtStatusView) this.f77766a.mo60553a((int) R.id.dav)).mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$g */
    static final class C29488g extends Lambda implements C7563m<C11585f, List<? extends C29480e>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77767a;

        C29488g(RecommendFollowFragment recommendFollowFragment) {
            this.f77767a = recommendFollowFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m96998a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m96998a(C11585f fVar, List<C29480e> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (list.isEmpty()) {
                ((DmtStatusView) this.f77767a.mo60553a((int) R.id.dav)).mo25943g();
            } else {
                ((DmtStatusView) this.f77767a.mo60553a((int) R.id.dav)).mo25939d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$h */
    static final class C29489h extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77768a;

        C29489h(RecommendFollowFragment recommendFollowFragment) {
            this.f77768a = recommendFollowFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m96999a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m96999a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            ((DmtStatusView) this.f77768a.mo60553a((int) R.id.dav)).mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$i */
    static final class C29490i extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77769a;

        C29490i(RecommendFollowFragment recommendFollowFragment) {
            this.f77769a = recommendFollowFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97000a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97000a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f77769a.mo75496j().ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$j */
    static final class C29491j extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77770a;

        C29491j(RecommendFollowFragment recommendFollowFragment) {
            this.f77770a = recommendFollowFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97001a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97001a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f77770a.mo75496j().mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$k */
    static final class C29492k extends Lambda implements C7563m<C11585f, Pair<? extends String, ? extends Boolean>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77771a;

        C29492k(RecommendFollowFragment recommendFollowFragment) {
            this.f77771a = recommendFollowFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97002a((C11585f) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97002a(C11585f fVar, Pair<String, Boolean> pair) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(pair, "dislikeSuccess");
            if (!TextUtils.isEmpty((CharSequence) pair.getFirst()) && ((Boolean) pair.getSecond()).booleanValue()) {
                C10761a.m31409e(this.f77771a.getContext(), (int) R.string.tu).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$l */
    static final class C29493l extends Lambda implements C7561a<RecommendFollowAdapter> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77772a;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$l$a */
        static final class C29494a implements C6905a {

            /* renamed from: a */
            final /* synthetic */ C29493l f77773a;

            C29494a(C29493l lVar) {
                this.f77773a = lVar;
            }

            public final void bd_() {
                this.f77773a.f77772a.mo69896i().mo75537g();
            }
        }

        C29493l(RecommendFollowFragment recommendFollowFragment) {
            this.f77772a = recommendFollowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendFollowAdapter invoke() {
            RecommendFollowAdapter recommendFollowAdapter = new RecommendFollowAdapter(this.f77772a, null, 2, null);
            recommendFollowAdapter.mo66504a((C6905a) new C29494a(this));
            recommendFollowAdapter.mo66506d(R.string.am0);
            return recommendFollowAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$m */
    static final class C29495m extends Lambda implements C7562b<RecommendFollowState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77774a;

        /* renamed from: b */
        final /* synthetic */ Aweme f77775b;

        /* renamed from: c */
        final /* synthetic */ IntRef f77776c;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$m$a */
        static final class C29496a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RecyclerView f77777a;

            /* renamed from: b */
            final /* synthetic */ C29495m f77778b;

            C29496a(RecyclerView recyclerView, C29495m mVar) {
                this.f77777a = recyclerView;
                this.f77778b = mVar;
            }

            public final void run() {
                C1273i layoutManager = this.f77777a.getLayoutManager();
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).mo5417a(this.f77778b.f77776c.element, 0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }

        C29495m(RecommendFollowFragment recommendFollowFragment, Aweme aweme, IntRef intRef) {
            this.f77774a = recommendFollowFragment;
            this.f77775b = aweme;
            this.f77776c = intRef;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97004a((RecommendFollowState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97004a(RecommendFollowState recommendFollowState) {
            String str;
            C7573i.m23587b(recommendFollowState, "it");
            Iterator it = recommendFollowState.getListState().getList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C29480e eVar = (C29480e) it.next();
                Aweme aweme = this.f77775b;
                if (aweme != null) {
                    str = aweme.getAuthorUid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, eVar.f77738a)) {
                    this.f77776c.element = recommendFollowState.getListState().getList().indexOf(eVar);
                    break;
                }
            }
            if (this.f77776c.element >= 0) {
                RecyclerView recyclerView = (RecyclerView) this.f77774a.mo60553a((int) R.id.cus);
                recyclerView.postDelayed(new C29496a(recyclerView, this), 500);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment$n */
    static final class C29497n extends Lambda implements C7563m<RecommendFollowState, Bundle, RecommendFollowState> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowFragment f77779a;

        C29497n(RecommendFollowFragment recommendFollowFragment) {
            this.f77779a = recommendFollowFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
            if (r12 == null) goto L_0x003d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState invoke(com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState r11, android.os.Bundle r12) {
            /*
                r10 = this;
                java.lang.String r12 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r11, r12)
                com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment r12 = r10.f77779a
                java.lang.String r12 = r12.f77744g
                if (r12 != 0) goto L_0x000d
                java.lang.String r12 = ""
            L_0x000d:
                r1 = r12
                java.lang.String r12 = r11.getSecUid()
                if (r12 != 0) goto L_0x0016
                java.lang.String r12 = ""
            L_0x0016:
                r2 = r12
                java.lang.String r12 = r11.getPreviousPage()
                if (r12 != 0) goto L_0x001f
                java.lang.String r12 = "homepage_hot"
            L_0x001f:
                r5 = r12
                com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment r12 = r10.f77779a
                com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r12 = r12.f77746i
                if (r12 == 0) goto L_0x002c
                int r12 = r12.getType()
                r3 = r12
                goto L_0x002e
            L_0x002c:
                r12 = 5
                r3 = 5
            L_0x002e:
                com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment r12 = r10.f77779a
                com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r12 = r12.f77746i
                if (r12 == 0) goto L_0x003d
                java.lang.String r12 = r12.getLabelInfo()
                if (r12 != 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r4 = r12
                goto L_0x0040
            L_0x003d:
                java.lang.String r12 = ""
                goto L_0x003b
            L_0x0040:
                r6 = 0
                r7 = 0
                r8 = 96
                r9 = 0
                r0 = r11
                com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState r11 = com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowFragment.C29497n.invoke(com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState, android.os.Bundle):com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState");
        }
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f77750m == null) {
            this.f77750m = new HashMap();
        }
        View view = (View) this.f77750m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f77750m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f77750m != null) {
            this.f77750m.clear();
        }
    }

    /* renamed from: i */
    public final RecommendFollowViewModel mo69896i() {
        return (RecommendFollowViewModel) this.f77748k.getValue();
    }

    /* renamed from: j */
    public final RecommendFollowAdapter mo75496j() {
        return (RecommendFollowAdapter) this.f77749l.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    public final void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
    }

    /* renamed from: m */
    private final void m96983m() {
        View a = mo60553a((int) R.id.edf);
        C7573i.m23582a((Object) a, "view_status");
        a.getLayoutParams().height = C9738o.m28717e(getContext());
    }

    public RecommendFollowFragment() {
        C7563m nVar = new C29497n(this);
        C7584c a = C7575l.m23595a(RecommendFollowViewModel.class);
        C7561a recommendFollowFragment$$special$$inlined$viewModel$1 = new RecommendFollowFragment$$special$$inlined$viewModel$1(a);
        this.f77748k = new lifecycleAwareLazy(this, recommendFollowFragment$$special$$inlined$viewModel$1, new RecommendFollowFragment$$special$$inlined$viewModel$2(this, recommendFollowFragment$$special$$inlined$viewModel$1, a, nVar));
        this.f77749l = C7546e.m23569a(new C29493l(this));
    }

    /* renamed from: k */
    private void m96981k() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f77744g = arguments.getString("uid");
            this.f77745h = arguments.getString(C22689a.f60407a);
            this.f77746i = (RelationDynamicLabel) arguments.getSerializable("relation_label");
            String string = arguments.getString("previous_page");
            C7573i.m23582a((Object) string, "getString(RecommendFollowActivity.PREVIOUS_PAGE)");
            this.f77747j = string;
        }
    }

    /* renamed from: l */
    private void m96982l() {
        m96983m();
        m96984n();
        ((AutoRTLImageView) mo60553a((int) R.id.jo)).setOnClickListener(new C29483b(this));
        RecyclerView recyclerView = (RecyclerView) mo60553a((int) R.id.cus);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(mo75496j());
        }
    }

    /* renamed from: n */
    private void m96984n() {
        ((DmtStatusView) mo60553a((int) R.id.dav)).setBuilder(C10803a.m31631a(getContext()).mo25953a().mo25961a(new C10806a(getActivity()).mo25985a((int) R.drawable.arw).mo25990b((int) R.string.ag9).mo25993c(R.string.ag8).f29135a).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C29482a(this)));
    }

    /* renamed from: o */
    private void m96985o() {
        mo69896i().mo75534a(this, mo75496j(), new C29484c(new C29487f(this), new C29489h(this), new C29488g(this)), new C29485d(new C29490i(this), new C29491j(this), RecommendFollowFragment$initViewModel$$inlined$ListListener$2.INSTANCE), new C29486e(this));
        mo29062a(mo69896i(), C29511a.f77814a, C11640h.m34110a(), new C29492k(this));
        mo69896i().mo29069f();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m96981k();
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    private final void m96980a(Aweme aweme) {
        IntRef intRef = new IntRef();
        intRef.element = -1;
        mo29066a(mo69896i(), new C29495m(this, aweme, intRef));
    }

    @C7709l
    public final void onAnchorEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
        if (anVar.f74631a == 21) {
            m96980a((Aweme) anVar.f74632b);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m96982l();
        m96985o();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.qf, viewGroup, false);
    }
}
