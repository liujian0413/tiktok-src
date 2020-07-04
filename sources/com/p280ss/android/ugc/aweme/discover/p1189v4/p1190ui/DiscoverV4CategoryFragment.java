package com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p280ss.android.ugc.aweme.discover.p1189v4.adapter.DiscoverV4ListAdapter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListState;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel.DiscoverV4ListViewModel;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4CategoryFragment */
public final class DiscoverV4CategoryFragment extends JediBaseFragment implements C26596c {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71597f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4CategoryFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4ListViewModel;"))};

    /* renamed from: g */
    private DiscoverV4ListAdapter f71598g;

    /* renamed from: h */
    private final lifecycleAwareLazy f71599h;

    /* renamed from: i */
    private HashMap f71600i;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4CategoryFragment$a */
    public static final class C27163a implements C11557c<DiscoverCategoryStructV4, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f71601a;

        /* renamed from: b */
        final /* synthetic */ C7563m f71602b;

        /* renamed from: c */
        final /* synthetic */ C7563m f71603c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f71604d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f71605e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends DiscoverCategoryStructV4>, C7581n> f71606f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f71604d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f71605e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends DiscoverCategoryStructV4>, C7581n> mo29140c() {
            return this.f71606f;
        }

        public C27163a(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f71601a = bVar;
            this.f71602b = mVar;
            this.f71603c = mVar2;
            this.f71604d = bVar;
            this.f71605e = mVar;
            this.f71606f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4CategoryFragment$b */
    static final class C27164b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CategoryFragment f71607a;

        C27164b(DiscoverV4CategoryFragment discoverV4CategoryFragment) {
            this.f71607a = discoverV4CategoryFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71607a.mo69896i().f71702c.mo29082b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4CategoryFragment$c */
    static final class C27165c extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CategoryFragment f71608a;

        C27165c(DiscoverV4CategoryFragment discoverV4CategoryFragment) {
            this.f71608a = discoverV4CategoryFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m89066a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89066a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            ((DmtStatusView) this.f71608a.mo60553a((int) R.id.daj)).mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4CategoryFragment$d */
    static final class C27166d extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CategoryFragment f71609a;

        C27166d(DiscoverV4CategoryFragment discoverV4CategoryFragment) {
            this.f71609a = discoverV4CategoryFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m89067a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89067a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            ((DmtStatusView) this.f71609a.mo60553a((int) R.id.daj)).mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4CategoryFragment$e */
    static final class C27167e extends Lambda implements C7563m<C11585f, List<? extends DiscoverCategoryStructV4>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CategoryFragment f71610a;

        C27167e(DiscoverV4CategoryFragment discoverV4CategoryFragment) {
            this.f71610a = discoverV4CategoryFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m89068a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89068a(C11585f fVar, List<DiscoverCategoryStructV4> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            ((DmtStatusView) this.f71610a.mo60553a((int) R.id.daj)).mo25938c(true);
            DiscoverV4ListViewModel i = this.f71610a.mo69896i();
            if (i == null) {
                C7573i.m23580a();
            }
            fVar.mo29066a(i, new C7562b<DiscoverV4ListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27167e f71611a;

                {
                    this.f71611a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m89069a((DiscoverV4ListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m89069a(DiscoverV4ListState discoverV4ListState) {
                    C7573i.m23587b(discoverV4ListState, "it");
                    if (!discoverV4ListState.getCells().getPayload().f31254a.f31214a && discoverV4ListState.getCells().getList().isEmpty()) {
                        ((DmtStatusView) this.f71611a.f71610a.mo60553a((int) R.id.daj)).mo25943g();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f71600i == null) {
            this.f71600i = new HashMap();
        }
        View view = (View) this.f71600i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71600i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo68279a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        C7573i.m23587b(loftNestedRefreshLayout, "loftNestedRefreshLayout");
    }

    /* renamed from: a */
    public final void mo68280a(boolean z) {
    }

    public final void aJ_() {
    }

    /* renamed from: b */
    public final void mo68282b(int i) {
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f71600i != null) {
            this.f71600i.clear();
        }
    }

    /* renamed from: i */
    public final DiscoverV4ListViewModel mo69896i() {
        return (DiscoverV4ListViewModel) this.f71599h.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    public DiscoverV4CategoryFragment() {
        C7584c a = C7575l.m23595a(DiscoverV4ListViewModel.class);
        C7561a discoverV4CategoryFragment$$special$$inlined$viewModel$1 = new DiscoverV4CategoryFragment$$special$$inlined$viewModel$1(a);
        this.f71599h = new lifecycleAwareLazy(this, discoverV4CategoryFragment$$special$$inlined$viewModel$1, new DiscoverV4CategoryFragment$$special$$inlined$viewModel$3(this, discoverV4CategoryFragment$$special$$inlined$viewModel$1, a, DiscoverV4CategoryFragment$$special$$inlined$viewModel$2.INSTANCE));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(C43361b.m137644a(getActivity(), new C27164b(this)));
        MtEmptyView a = MtEmptyView.m31657a((Context) getActivity());
        a.setStatus(new C10806a(getActivity()).mo25990b((int) R.string.bzv).f29135a);
        ((DmtStatusView) mo60553a((int) R.id.daj)).setBuilder(C10803a.m31631a((Context) getActivity()).mo25963b((View) a).mo25966c((View) dmtDefaultView));
        DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.daj);
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context, "context!!");
        dmtStatusView.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.ml));
        this.f71598g = new DiscoverV4ListAdapter(this, mo69896i().f71702c);
        ListMiddleware<DiscoverV4ListState, DiscoverCategoryStructV4, C11583n> listMiddleware = mo69896i().f71702c;
        C11502e eVar = this;
        DiscoverV4ListAdapter discoverV4ListAdapter = this.f71598g;
        if (discoverV4ListAdapter == null) {
            C7573i.m23583a("adapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, discoverV4ListAdapter, false, false, new C27163a(new C27165c(this), new C27166d(this), new C27167e(this)), null, null, null, null, null, LiveRoomStruct.ROOM_LONGTIME_NO_NET, null);
        DiscoverV4ListAdapter discoverV4ListAdapter2 = this.f71598g;
        if (discoverV4ListAdapter2 == null) {
            C7573i.m23583a("adapter");
        }
        discoverV4ListAdapter2.mo60555a(C7525m.m23457a(new DiscoverCategoryStructV4("", "")));
        RecyclerView recyclerView = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.mo5427b(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView2, "rv_list");
        DiscoverV4ListAdapter discoverV4ListAdapter3 = this.f71598g;
        if (discoverV4ListAdapter3 == null) {
            C7573i.m23583a("adapter");
        }
        recyclerView2.setAdapter(discoverV4ListAdapter3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nx, viewGroup, false);
    }
}
