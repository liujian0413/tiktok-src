package com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.view.C1156d;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.adapter.DiscoverV4PlayListAdapter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverStateV4;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4PlayListViewModel;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment */
public final class DiscoverV4PlayListFragment extends JediBaseFragment implements C27189a {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71624f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4PlayListViewModel;"))};

    /* renamed from: g */
    public DiscoverV4PlayListAdapter f71625g;

    /* renamed from: h */
    public String f71626h;

    /* renamed from: i */
    private final lifecycleAwareLazy f71627i;

    /* renamed from: j */
    private String f71628j;

    /* renamed from: k */
    private HashMap f71629k;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$a */
    public static final class C27176a implements C11557c<DiscoverPlayListStructV4, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f71630a;

        /* renamed from: b */
        final /* synthetic */ C7563m f71631b;

        /* renamed from: c */
        final /* synthetic */ C7563m f71632c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f71633d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f71634e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends DiscoverPlayListStructV4>, C7581n> f71635f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f71633d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f71634e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends DiscoverPlayListStructV4>, C7581n> mo29140c() {
            return this.f71635f;
        }

        public C27176a(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f71630a = bVar;
            this.f71631b = mVar;
            this.f71632c = mVar2;
            this.f71633d = bVar;
            this.f71634e = mVar;
            this.f71635f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$b */
    public static final class C27177b implements C11557c<DiscoverPlayListStructV4, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f71636a;

        /* renamed from: b */
        final /* synthetic */ C7563m f71637b;

        /* renamed from: c */
        final /* synthetic */ C7563m f71638c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f71639d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f71640e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends DiscoverPlayListStructV4>, C7581n> f71641f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f71639d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f71640e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends DiscoverPlayListStructV4>, C7581n> mo29140c() {
            return this.f71641f;
        }

        public C27177b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f71636a = bVar;
            this.f71637b = mVar;
            this.f71638c = mVar2;
            this.f71639d = bVar;
            this.f71640e = mVar;
            this.f71641f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$c */
    static final class C27178c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71642a;

        C27178c(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71642a = discoverV4PlayListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71642a.mo69938j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$d */
    static final class C27179d implements C1032b {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71643a;

        C27179d(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71643a = discoverV4PlayListFragment;
        }

        public final void onRefresh() {
            this.f71643a.mo69896i().mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$e */
    static final class C27180e implements C6905a {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71644a;

        C27180e(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71644a = discoverV4PlayListFragment;
        }

        public final void bd_() {
            this.f71644a.mo69896i().f71710f.mo29085c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$f */
    static final class C27181f extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71645a;

        C27181f(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71645a = discoverV4PlayListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m89107a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89107a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            DiscoverV4PlayListFragment.m89085a(this.f71645a).mo66516d(true);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f71645a.mo60553a((int) R.id.daj);
            if (dmtStatusView != null && dmtStatusView.mo25947k()) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.f71645a.mo60553a((int) R.id.daj);
                if (dmtStatusView2 != null) {
                    dmtStatusView2.mo25942f();
                }
            }
            if (DiscoverV4PlayListFragment.m89085a(this.f71645a).getItemCount() <= 0) {
                DmtStatusView dmtStatusView3 = (DmtStatusView) this.f71645a.mo60553a((int) R.id.daj);
                if (dmtStatusView3 != null) {
                    dmtStatusView3.mo25942f();
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f71645a.mo60553a((int) R.id.ded);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$g */
    static final class C27182g extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71646a;

        C27182g(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71646a = discoverV4PlayListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m89108a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89108a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f71646a.mo60553a((int) R.id.ded);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f71646a.mo60553a((int) R.id.daj);
            if (dmtStatusView != null) {
                dmtStatusView.mo25944h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$h */
    static final class C27183h extends Lambda implements C7563m<C11585f, List<? extends DiscoverPlayListStructV4>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71647a;

        C27183h(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71647a = discoverV4PlayListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m89109a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89109a(C11585f fVar, List<DiscoverPlayListStructV4> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f71647a.mo60553a((int) R.id.ded);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f71647a.mo60553a((int) R.id.daj);
            if (dmtStatusView != null) {
                dmtStatusView.mo25938c(true);
            }
            DiscoverV4PlayListViewModel i = this.f71647a.mo69896i();
            if (i == null) {
                C7573i.m23580a();
            }
            fVar.mo29066a(i, new C7562b<DiscoverStateV4, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27183h f71648a;

                {
                    this.f71648a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m89110a((DiscoverStateV4) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m89110a(DiscoverStateV4 discoverStateV4) {
                    C7573i.m23587b(discoverStateV4, "it");
                    if (!discoverStateV4.getCells().getPayload().f31254a.f31214a && discoverStateV4.getCells().getList().isEmpty()) {
                        DmtStatusView dmtStatusView = (DmtStatusView) this.f71648a.f71647a.mo60553a((int) R.id.daj);
                        if (dmtStatusView != null) {
                            dmtStatusView.mo25943g();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$i */
    static final class C27185i extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71649a;

        C27185i(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71649a = discoverV4PlayListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m89111a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89111a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            DiscoverV4PlayListFragment.m89085a(this.f71649a).ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$j */
    static final class C27186j extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71650a;

        C27186j(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71650a = discoverV4PlayListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m89112a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89112a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            DiscoverV4PlayListFragment.m89085a(this.f71650a).mo66507h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$k */
    static final class C27187k extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListFragment f71651a;

        C27187k(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
            this.f71651a = discoverV4PlayListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m89113a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89113a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                DiscoverV4PlayListFragment.m89085a(this.f71651a).ai_();
            } else {
                DiscoverV4PlayListFragment.m89085a(this.f71651a).mo66516d(false);
            }
        }
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f71629k == null) {
            this.f71629k = new HashMap();
        }
        View view = (View) this.f71629k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71629k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f71629k != null) {
            this.f71629k.clear();
        }
    }

    /* renamed from: i */
    public final DiscoverV4PlayListViewModel mo69896i() {
        return (DiscoverV4PlayListViewModel) this.f71627i.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    /* renamed from: k */
    public final void mo69939k() {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f71626h;
        if (str == null) {
            C7573i.m23583a("tabName");
        }
        instance.setPageState(str, false);
        m89088o();
    }

    public DiscoverV4PlayListFragment() {
        C7584c a = C7575l.m23595a(DiscoverV4PlayListViewModel.class);
        C7561a discoverV4PlayListFragment$$special$$inlined$viewModel$1 = new DiscoverV4PlayListFragment$$special$$inlined$viewModel$1(a);
        this.f71627i = new lifecycleAwareLazy(this, discoverV4PlayListFragment$$special$$inlined$viewModel$1, new DiscoverV4PlayListFragment$$special$$inlined$viewModel$3(this, discoverV4PlayListFragment$$special$$inlined$viewModel$1, a, DiscoverV4PlayListFragment$$special$$inlined$viewModel$2.INSTANCE));
    }

    /* renamed from: j */
    public final void mo69938j() {
        if (((FpsRecyclerView) mo60553a((int) R.id.cqd)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
            if (fpsRecyclerView == null || !fpsRecyclerView.canScrollVertically(-1)) {
                mo69896i().mo29069f();
                return;
            }
            FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
            if (fpsRecyclerView2 != null) {
                fpsRecyclerView2.mo5541b(0);
            }
        }
    }

    /* renamed from: l */
    public final void mo69940l() {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f71626h;
        if (str == null) {
            C7573i.m23583a("tabName");
        }
        if (instance.getData(str) == null) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.daj);
            if (dmtStatusView == null || !dmtStatusView.mo25945i()) {
                mo69896i().mo29069f();
            }
        }
    }

    /* renamed from: m */
    public final void mo69941m() {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f71626h;
        if (str == null) {
            C7573i.m23583a("tabName");
        }
        if (instance.getData(str) == null) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.daj);
            if (dmtStatusView == null || !dmtStatusView.mo25945i()) {
                mo69896i().mo29069f();
            }
        }
    }

    /* renamed from: o */
    private final void m89088o() {
        if (((FpsRecyclerView) mo60553a((int) R.id.cqd)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
            C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
            if (fpsRecyclerView.getLayoutManager() != null) {
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                C7573i.m23582a((Object) fpsRecyclerView2, "recyclerView");
                C1273i layoutManager = fpsRecyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int j = ((GridLayoutManager) layoutManager).mo5445j();
                    FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                    C7573i.m23582a((Object) fpsRecyclerView3, "recyclerView");
                    C1273i layoutManager2 = fpsRecyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int l = ((GridLayoutManager) layoutManager2).mo5447l();
                        if (j <= l) {
                            while (true) {
                                C1293v e = ((FpsRecyclerView) mo60553a((int) R.id.cqd)).mo5572e(j);
                                if (e instanceof C27190b) {
                                    ((C27190b) e).aM_();
                                }
                                if (j != l) {
                                    j++;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                }
            }
        }
    }

    /* renamed from: p */
    private final float m89089p() {
        float f;
        try {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
            C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
            C1273i layoutManager = fpsRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                int j = ((GridLayoutManager) layoutManager).mo5445j();
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                C7573i.m23582a((Object) fpsRecyclerView2, "recyclerView");
                C1273i layoutManager2 = fpsRecyclerView2.getLayoutManager();
                if (layoutManager2 != null) {
                    View c = ((GridLayoutManager) layoutManager2).mo5432c(j);
                    if (j >= 0) {
                        if (c != null) {
                            String str = this.f71626h;
                            if (str == null) {
                                C7573i.m23583a("tabName");
                            }
                            if (!TextUtils.equals(str, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                                float f2 = (float) (j / 2);
                                DiscoverV4PlayListAdapter discoverV4PlayListAdapter = this.f71625g;
                                if (discoverV4PlayListAdapter == null) {
                                    C7573i.m23583a("adapter");
                                }
                                f = (f2 * discoverV4PlayListAdapter.mo69924k()) + 0.0f;
                            } else if (j > 0) {
                                float f3 = (float) ((j - 1) / 2);
                                DiscoverV4PlayListAdapter discoverV4PlayListAdapter2 = this.f71625g;
                                if (discoverV4PlayListAdapter2 == null) {
                                    C7573i.m23583a("adapter");
                                }
                                float k = (f3 * discoverV4PlayListAdapter2.mo69924k()) + 0.0f;
                                DiscoverV4PlayListAdapter discoverV4PlayListAdapter3 = this.f71625g;
                                if (discoverV4PlayListAdapter3 == null) {
                                    C7573i.m23583a("adapter");
                                }
                                f = k + discoverV4PlayListAdapter3.mo69925l();
                            } else {
                                f = 0.0f;
                            }
                            return f - c.getY();
                        }
                    }
                    return 0.0f;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: n */
    public final void mo69942n() {
        float f;
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
        C1273i layoutManager = fpsRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            int j = ((GridLayoutManager) layoutManager).mo5445j();
            String str = this.f71626h;
            if (str == null) {
                C7573i.m23583a("tabName");
            }
            if (C7573i.m23585a((Object) str, (Object) DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                float p = m89089p();
                DiscoverV4PlayListAdapter discoverV4PlayListAdapter = this.f71625g;
                if (discoverV4PlayListAdapter == null) {
                    C7573i.m23583a("adapter");
                }
                float l = p - discoverV4PlayListAdapter.mo69925l();
                DiscoverV4PlayListAdapter discoverV4PlayListAdapter2 = this.f71625g;
                if (discoverV4PlayListAdapter2 == null) {
                    C7573i.m23583a("adapter");
                }
                f = l % discoverV4PlayListAdapter2.mo69924k();
                if (j == 0) {
                    return;
                }
            } else {
                float p2 = m89089p();
                DiscoverV4PlayListAdapter discoverV4PlayListAdapter3 = this.f71625g;
                if (discoverV4PlayListAdapter3 == null) {
                    C7573i.m23583a("adapter");
                }
                f = p2 % discoverV4PlayListAdapter3.mo69924k();
            }
            C1293v e = ((FpsRecyclerView) mo60553a((int) R.id.cqd)).mo5572e(j);
            C1293v e2 = ((FpsRecyclerView) mo60553a((int) R.id.cqd)).mo5572e(j + 1);
            DiscoverV4PlayListAdapter discoverV4PlayListAdapter4 = this.f71625g;
            if (discoverV4PlayListAdapter4 == null) {
                C7573i.m23583a("adapter");
            }
            if (f >= discoverV4PlayListAdapter4.mo69924k() / 2.0f) {
                if (e instanceof C27190b) {
                    ((C27190b) e).aK_();
                }
                if (e2 instanceof C27190b) {
                    ((C27190b) e2).aK_();
                    return;
                }
            } else {
                if (e instanceof C27190b) {
                    ((C27190b) e).aL_();
                }
                if (e2 instanceof C27190b) {
                    ((C27190b) e2).aL_();
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
    }

    /* renamed from: a */
    public static final /* synthetic */ DiscoverV4PlayListAdapter m89085a(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
        DiscoverV4PlayListAdapter discoverV4PlayListAdapter = discoverV4PlayListFragment.f71625g;
        if (discoverV4PlayListAdapter == null) {
            C7573i.m23583a("adapter");
        }
        return discoverV4PlayListAdapter;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m89086b(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
        String str = discoverV4PlayListFragment.f71626h;
        if (str == null) {
            C7573i.m23583a("tabName");
        }
        return str;
    }

    /* renamed from: b */
    public final void mo69937b(boolean z) {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f71626h;
        if (str == null) {
            C7573i.m23583a("tabName");
        }
        instance.setPageState(str, !z);
        if (!z) {
            String str2 = this.f71626h;
            if (str2 == null) {
                C7573i.m23583a("tabName");
            }
            C26781b.m87964a(str2);
        }
        m89087c(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3 == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r3 == null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x0011
            java.lang.String r0 = "tabName"
            java.lang.String r3 = r3.getString(r0)
            if (r3 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r3 = ""
        L_0x0013:
            r2.f71626h = r3
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x0023
            java.lang.String r0 = "tabText"
            java.lang.String r3 = r3.getString(r0)
            if (r3 != 0) goto L_0x0025
        L_0x0023:
            java.lang.String r3 = ""
        L_0x0025:
            r2.f71628j = r3
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel r3 = r2.mo69896i()
            java.lang.String r0 = r2.f71626h
            if (r0 != 0) goto L_0x0034
            java.lang.String r1 = "tabName"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0034:
            r3.mo69978a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4PlayListFragment.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo69936a(boolean z) {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f71626h;
        if (str == null) {
            C7573i.m23583a("tabName");
        }
        instance.setPageState(str, !z);
        StringBuilder sb = new StringBuilder();
        String str2 = this.f71626h;
        if (str2 == null) {
            C7573i.m23583a("tabName");
        }
        sb.append(str2);
        sb.append(",");
        sb.append(z);
        if (!z) {
            String str3 = this.f71626h;
            if (str3 == null) {
                C7573i.m23583a("tabName");
            }
            C26781b.m87964a(str3);
        }
        m89087c(z);
    }

    /* renamed from: c */
    private final void m89087c(boolean z) {
        if (((FpsRecyclerView) mo60553a((int) R.id.cqd)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
            C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
            if (fpsRecyclerView.getLayoutManager() != null) {
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                C7573i.m23582a((Object) fpsRecyclerView2, "recyclerView");
                C1273i layoutManager = fpsRecyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int j = ((GridLayoutManager) layoutManager).mo5445j();
                    FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                    C7573i.m23582a((Object) fpsRecyclerView3, "recyclerView");
                    C1273i layoutManager2 = fpsRecyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int l = ((GridLayoutManager) layoutManager2).mo5447l();
                        float p = m89089p();
                        DiscoverV4PlayListAdapter discoverV4PlayListAdapter = this.f71625g;
                        if (discoverV4PlayListAdapter == null) {
                            C7573i.m23583a("adapter");
                        }
                        float k = p % discoverV4PlayListAdapter.mo69924k();
                        FpsRecyclerView fpsRecyclerView4 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                        C7573i.m23582a((Object) fpsRecyclerView4, "recyclerView");
                        C1273i layoutManager3 = fpsRecyclerView4.getLayoutManager();
                        if (layoutManager3 != null) {
                            int j2 = ((GridLayoutManager) layoutManager3).mo5445j();
                            if (j <= l) {
                                while (true) {
                                    C1293v e = ((FpsRecyclerView) mo60553a((int) R.id.cqd)).mo5572e(j);
                                    if (e instanceof C27190b) {
                                        DiscoverV4PlayListAdapter discoverV4PlayListAdapter2 = this.f71625g;
                                        if (discoverV4PlayListAdapter2 == null) {
                                            C7573i.m23583a("adapter");
                                        }
                                        boolean z2 = true;
                                        if (k >= discoverV4PlayListAdapter2.mo69924k() / 2.0f) {
                                            String str = this.f71626h;
                                            if (str == null) {
                                                C7573i.m23583a("tabName");
                                            }
                                            if (!C7573i.m23585a((Object) str, (Object) DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                                                C27190b bVar = (C27190b) e;
                                                if (j == j2 || j == j2 + 1) {
                                                    z2 = false;
                                                }
                                                bVar.mo69947a(z, z2);
                                            } else if (j2 != 0) {
                                                C27190b bVar2 = (C27190b) e;
                                                if (j == j2 || j == j2 + 1) {
                                                    z2 = false;
                                                }
                                                bVar2.mo69947a(z, z2);
                                            }
                                        }
                                        ((C27190b) e).mo69947a(z, true);
                                    }
                                    if (j == l) {
                                        break;
                                    }
                                    j++;
                                }
                            }
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A[LOOP:0: B:15:0x005a->B:27:0x0092, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69935a(com.p280ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam r6) {
        /*
            r5 = this;
            java.lang.String r0 = "param"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            boolean r0 = r5.f18759c
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = r6.tabName
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = r5.f71626h
            if (r1 != 0) goto L_0x0016
            java.lang.String r2 = "tabName"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0016:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x00e2
        L_0x0020:
            r0 = 2131300993(0x7f091281, float:1.8220031E38)
            android.view.View r1 = r5.mo60553a(r0)
            com.ss.android.ugc.aweme.views.FpsRecyclerView r1 = (com.p280ss.android.ugc.aweme.views.FpsRecyclerView) r1
            java.lang.String r2 = "recyclerView"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.support.v7.widget.RecyclerView$a r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter r1 = (com.p280ss.android.ugc.aweme.discover.p1189v4.adapter.DiscoverV4PlayListAdapter) r1
            java.util.List r1 = r1.mo60558d()
            java.lang.String r2 = r5.f71626h
            if (r2 != 0) goto L_0x0043
            java.lang.String r3 = "tabName"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0043:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion r3 = com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.Companion
            java.lang.String r3 = r3.getTRENDING_PLAYLIST()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0095
            r2 = 0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x005a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00d8
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r3 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r3
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.awemes
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = kotlin.collections.C7525m.m23511f(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r3
            if (r3 == 0) goto L_0x0077
            java.lang.String r3 = r3.getAid()
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.aweme
            java.lang.String r4 = r4.getAid()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0092
            android.view.View r6 = r5.mo60553a(r0)
            com.ss.android.ugc.aweme.views.FpsRecyclerView r6 = (com.p280ss.android.ugc.aweme.views.FpsRecyclerView) r6
            r6.mo5541b(r2)
            return
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x005a
        L_0x0095:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            int r3 = r6.index
            if (r3 < 0) goto L_0x00d9
            if (r2 > r3) goto L_0x00a3
            return
        L_0x00a3:
            int r2 = r6.index
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r1
            java.lang.String r1 = r1.cellID
            java.lang.String r2 = r6.cellID
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel r1 = r5.mo69896i()
            android.view.View r0 = r5.mo60553a(r0)
            com.ss.android.ugc.aweme.views.FpsRecyclerView r0 = (com.p280ss.android.ugc.aweme.views.FpsRecyclerView) r0
            java.lang.String r2 = "recyclerView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.support.v7.widget.RecyclerView$a r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter r0 = (com.p280ss.android.ugc.aweme.discover.p1189v4.adapter.DiscoverV4PlayListAdapter) r0
            r1.mo69977a(r6, r0)
            goto L_0x00d8
        L_0x00d0:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter"
            r6.<init>(r0)
            throw r6
        L_0x00d8:
            return
        L_0x00d9:
            return
        L_0x00da:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter"
            r6.<init>(r0)
            throw r6
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4PlayListFragment.mo69935a(com.ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        StringBuilder sb = new StringBuilder("Fragment onViewCreated ");
        String str = this.f71626h;
        if (str == null) {
            C7573i.m23583a("tabName");
        }
        sb.append(str);
        int c = C0683b.m2912c(view.getContext(), R.color.ab4);
        DmtTextView dmtTextView = new DmtTextView(new C1156d(view.getContext(), R.style.ss));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.c46);
        dmtTextView.setOnClickListener(new C27178c(this));
        DmtTextView dmtTextView2 = new DmtTextView(new C1156d(view.getContext(), R.style.ss));
        dmtTextView2.setTextColor(c);
        dmtTextView2.setText(R.string.cm4);
        DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.daj);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10803a.m31631a((Context) getActivity()).mo25963b((View) dmtTextView2).mo25966c((View) dmtTextView));
        }
        if (C6399b.m19946v()) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo60553a((int) R.id.daj);
            if (dmtStatusView2 != null) {
                Context context = getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                dmtStatusView2.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.ml));
            }
        } else if (C6399b.m19947w()) {
            DmtStatusView dmtStatusView3 = (DmtStatusView) mo60553a((int) R.id.daj);
            if (dmtStatusView3 != null) {
                dmtStatusView3.setUseScreenHeight(0);
            }
        }
        C0043i iVar = this;
        C11569b bVar = mo69896i().f71710f;
        String str2 = this.f71626h;
        if (str2 == null) {
            C7573i.m23583a("tabName");
        }
        String str3 = this.f71628j;
        if (str3 == null) {
            C7573i.m23583a("tabText");
        }
        this.f71625g = new DiscoverV4PlayListAdapter(iVar, bVar, str2, str3);
        DiscoverV4PlayListAdapter discoverV4PlayListAdapter = this.f71625g;
        if (discoverV4PlayListAdapter == null) {
            C7573i.m23583a("adapter");
        }
        discoverV4PlayListAdapter.mo66504a((C6905a) new C27180e(this));
        ListMiddleware<DiscoverStateV4, DiscoverPlayListStructV4, C11583n> listMiddleware = mo69896i().f71710f;
        C11502e eVar = this;
        DiscoverV4PlayListAdapter discoverV4PlayListAdapter2 = this.f71625g;
        if (discoverV4PlayListAdapter2 == null) {
            C7573i.m23583a("adapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, discoverV4PlayListAdapter2, false, false, new C27176a(new C27181f(this), new C27182g(this), new C27183h(this)), new C27177b(new C27185i(this), new C27186j(this), DiscoverV4PlayListFragment$onViewCreated$$inlined$ListListener$2.INSTANCE), new C27187k(this), null, null, null, 908, null);
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        if (fpsRecyclerView != null) {
            DiscoverV4PlayListAdapter discoverV4PlayListAdapter3 = this.f71625g;
            if (discoverV4PlayListAdapter3 == null) {
                C7573i.m23583a("adapter");
            }
            fpsRecyclerView.setAdapter(discoverV4PlayListAdapter3);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.f4721g = new DiscoverV4PlayListFragment$onViewCreated$9(this);
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        if (fpsRecyclerView2 != null) {
            fpsRecyclerView2.setLayoutManager(gridLayoutManager);
        }
        FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        if (fpsRecyclerView3 != null) {
            fpsRecyclerView3.mo5528a((C1281m) new DiscoverV4PlayListFragment$onViewCreated$10(this));
        }
        FpsRecyclerView fpsRecyclerView4 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        if (fpsRecyclerView4 != null) {
            fpsRecyclerView4.mo5525a((C1272h) new DiscoveryV4ItemDecoration());
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60553a((int) R.id.ded);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new C27179d(this));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nz, viewGroup, false);
    }
}
