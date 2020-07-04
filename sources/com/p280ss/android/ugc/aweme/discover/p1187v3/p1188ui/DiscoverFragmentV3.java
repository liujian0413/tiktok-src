package com.p280ss.android.ugc.aweme.discover.p1187v3.p1188ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
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
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p280ss.android.ugc.aweme.discover.p1187v3.adapter.DiscoverAdapterV3;
import com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3;
import com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverViewModelV3;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.profile.p1487ui.WrapStaggeredGridLayoutManager;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
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
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3 */
public final class DiscoverFragmentV3 extends JediBaseFragment implements C26596c {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71488f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverFragmentV3.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v3/viewmodel/DiscoverViewModelV3;"))};

    /* renamed from: g */
    public DiscoverAdapterV3 f71489g;

    /* renamed from: h */
    private final lifecycleAwareLazy f71490h;

    /* renamed from: i */
    private HashMap f71491i;

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$a */
    public static final class C27110a implements C11557c<DiscoveryCellStructV3, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f71492a;

        /* renamed from: b */
        final /* synthetic */ C7563m f71493b;

        /* renamed from: c */
        final /* synthetic */ C7563m f71494c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f71495d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f71496e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends DiscoveryCellStructV3>, C7581n> f71497f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f71495d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f71496e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends DiscoveryCellStructV3>, C7581n> mo29140c() {
            return this.f71497f;
        }

        public C27110a(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f71492a = bVar;
            this.f71493b = mVar;
            this.f71494c = mVar2;
            this.f71495d = bVar;
            this.f71496e = mVar;
            this.f71497f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$b */
    public static final class C27111b implements C11557c<DiscoveryCellStructV3, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f71498a;

        /* renamed from: b */
        final /* synthetic */ C7563m f71499b;

        /* renamed from: c */
        final /* synthetic */ C7563m f71500c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f71501d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f71502e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends DiscoveryCellStructV3>, C7581n> f71503f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f71501d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f71502e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends DiscoveryCellStructV3>, C7581n> mo29140c() {
            return this.f71503f;
        }

        public C27111b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f71498a = bVar;
            this.f71499b = mVar;
            this.f71500c = mVar2;
            this.f71501d = bVar;
            this.f71502e = mVar;
            this.f71503f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$c */
    static final class C27112c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71504a;

        C27112c(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71504a = discoverFragmentV3;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71504a.aJ_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$d */
    static final class C27113d extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71505a;

        C27113d(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71505a = discoverFragmentV3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m88941a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88941a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            if (DiscoverFragmentV3.m88927a(this.f71505a).getItemCount() <= 0) {
                ((DmtStatusView) this.f71505a.mo60553a((int) R.id.daj)).mo25942f();
                return;
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f71505a.mo60553a((int) R.id.ded);
            C7573i.m23582a((Object) swipeRefreshLayout, "swipeRefresh");
            swipeRefreshLayout.setRefreshing(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$e */
    static final class C27114e extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71506a;

        C27114e(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71506a = discoverFragmentV3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88942a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88942a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f71506a.mo60553a((int) R.id.ded);
            C7573i.m23582a((Object) swipeRefreshLayout, "swipeRefresh");
            swipeRefreshLayout.setRefreshing(true);
            ((DmtStatusView) this.f71506a.mo60553a((int) R.id.daj)).mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$f */
    static final class C27115f extends Lambda implements C7563m<C11585f, List<? extends DiscoveryCellStructV3>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71507a;

        C27115f(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71507a = discoverFragmentV3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88943a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88943a(C11585f fVar, List<DiscoveryCellStructV3> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f71507a.mo60553a((int) R.id.ded);
            C7573i.m23582a((Object) swipeRefreshLayout, "swipeRefresh");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) this.f71507a.mo60553a((int) R.id.daj)).mo25938c(true);
            DiscoverViewModelV3 i = this.f71507a.mo69896i();
            if (i == null) {
                C7573i.m23580a();
            }
            fVar.mo29066a(i, new C7562b<DiscoverStateV3, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27115f f71508a;

                {
                    this.f71508a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m88944a((DiscoverStateV3) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m88944a(DiscoverStateV3 discoverStateV3) {
                    C7573i.m23587b(discoverStateV3, "it");
                    if (!discoverStateV3.getCells().getPayload().f31254a.f31214a && discoverStateV3.getCells().getList().isEmpty()) {
                        ((DmtStatusView) this.f71508a.f71507a.mo60553a((int) R.id.daj)).mo25943g();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$g */
    static final class C27117g extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71509a;

        C27117g(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71509a = discoverFragmentV3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m88945a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88945a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            DiscoverAdapterV3 a = DiscoverFragmentV3.m88927a(this.f71509a);
            if (a != null) {
                a.ag_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$h */
    static final class C27118h extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71510a;

        C27118h(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71510a = discoverFragmentV3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88946a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88946a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            DiscoverAdapterV3 a = DiscoverFragmentV3.m88927a(this.f71510a);
            if (a != null) {
                a.mo66507h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$i */
    static final class C27119i extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71511a;

        C27119i(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71511a = discoverFragmentV3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88947a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88947a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                DiscoverAdapterV3 a = DiscoverFragmentV3.m88927a(this.f71511a);
                if (a != null) {
                    a.ai_();
                }
            } else {
                DiscoverAdapterV3 a2 = DiscoverFragmentV3.m88927a(this.f71511a);
                if (a2 != null) {
                    a2.ah_();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.ui.DiscoverFragmentV3$j */
    static final class C27120j implements C1032b {

        /* renamed from: a */
        final /* synthetic */ DiscoverFragmentV3 f71512a;

        C27120j(DiscoverFragmentV3 discoverFragmentV3) {
            this.f71512a = discoverFragmentV3;
        }

        public final void onRefresh() {
            this.f71512a.mo69896i().f71558h.mo29082b();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f71491i == null) {
            this.f71491i = new HashMap();
        }
        View view = (View) this.f71491i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71491i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo68279a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        C7573i.m23587b(loftNestedRefreshLayout, "loftNestedRefreshLayout");
    }

    /* renamed from: b */
    public final void mo68282b(int i) {
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f71491i != null) {
            this.f71491i.clear();
        }
    }

    /* renamed from: i */
    public final DiscoverViewModelV3 mo69896i() {
        return (DiscoverViewModelV3) this.f71490h.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    public DiscoverFragmentV3() {
        C7584c a = C7575l.m23595a(DiscoverViewModelV3.class);
        C7561a discoverFragmentV3$$special$$inlined$viewModel$1 = new DiscoverFragmentV3$$special$$inlined$viewModel$1(a);
        this.f71490h = new lifecycleAwareLazy(this, discoverFragmentV3$$special$$inlined$viewModel$1, new DiscoverFragmentV3$$special$$inlined$viewModel$3(this, discoverFragmentV3$$special$$inlined$viewModel$1, a, DiscoverFragmentV3$$special$$inlined$viewModel$2.INSTANCE));
    }

    public final void aJ_() {
        if (((FpsRecyclerView) mo60553a((int) R.id.cqd)) != null) {
            if (!((FpsRecyclerView) mo60553a((int) R.id.cqd)).canScrollVertically(-1)) {
                mo69896i().f71558h.mo29082b();
            } else {
                ((FpsRecyclerView) mo60553a((int) R.id.cqd)).mo5541b(0);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DiscoverAdapterV3 m88927a(DiscoverFragmentV3 discoverFragmentV3) {
        DiscoverAdapterV3 discoverAdapterV3 = discoverFragmentV3.f71489g;
        if (discoverAdapterV3 == null) {
            C7573i.m23583a("adapter");
        }
        return discoverAdapterV3;
    }

    /* renamed from: a */
    public final void mo68280a(boolean z) {
        if (((FpsRecyclerView) mo60553a((int) R.id.cqd)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
            C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
            if (fpsRecyclerView.getLayoutManager() != null) {
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                C7573i.m23582a((Object) fpsRecyclerView2, "recyclerView");
                C1273i layoutManager = fpsRecyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int[] a = ((WrapStaggeredGridLayoutManager) layoutManager).mo6009a((int[]) null);
                    C7573i.m23582a((Object) a, "(recyclerView.layoutMana…isibleItemPositions(null)");
                    Integer g = C7519g.m23452g(a);
                    FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                    C7573i.m23582a((Object) fpsRecyclerView3, "recyclerView");
                    C1273i layoutManager2 = fpsRecyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int[] c = ((WrapStaggeredGridLayoutManager) layoutManager2).mo6011c((int[]) null);
                        C7573i.m23582a((Object) c, "(recyclerView.layoutMana…isibleItemPositions(null)");
                        Integer f = C7519g.m23450f(c);
                        if (g != null && f != null) {
                            int intValue = g.intValue();
                            int intValue2 = f.intValue();
                            if (intValue <= intValue2) {
                                while (true) {
                                    C1293v e = ((FpsRecyclerView) mo60553a((int) R.id.cqd)).mo5572e(intValue);
                                    if (e instanceof C27122a) {
                                        ((C27122a) e).mo69902a(z);
                                    }
                                    if (intValue != intValue2) {
                                        intValue++;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.WrapStaggeredGridLayoutManager");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.WrapStaggeredGridLayoutManager");
                }
            }
        }
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
        if (anVar.f74631a == 21) {
            Object obj = anVar.f74632b;
            if (obj != null) {
                DiscoveryCellStructV3 discoveryCellStructV3 = (DiscoveryCellStructV3) obj;
                FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
                C1262a adapter = fpsRecyclerView.getAdapter();
                if (adapter != null) {
                    List d = ((DiscoverAdapterV3) adapter).mo60558d();
                    int size = d.size();
                    int i = discoveryCellStructV3.idx;
                    if (i >= 0 && size > i) {
                        DiscoveryCellStructV3 discoveryCellStructV32 = (DiscoveryCellStructV3) d.get(discoveryCellStructV3.idx);
                        if (C7573i.m23585a((Object) discoveryCellStructV32.cellID, (Object) discoveryCellStructV3.cellID) && discoveryCellStructV32.type != 3) {
                            DiscoverViewModelV3 i2 = mo69896i();
                            FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
                            C7573i.m23582a((Object) fpsRecyclerView2, "recyclerView");
                            C1262a adapter2 = fpsRecyclerView2.getAdapter();
                            if (adapter2 != null) {
                                i2.mo69918a(discoveryCellStructV3, (DiscoverAdapterV3) adapter2);
                                if (discoveryCellStructV3.idx == 0) {
                                    DiscoverAdapterV3 discoverAdapterV3 = this.f71489g;
                                    if (discoverAdapterV3 == null) {
                                        C7573i.m23583a("adapter");
                                    }
                                    discoverAdapterV3.notifyDataSetChanged();
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3");
                            }
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3");
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(C43361b.m137644a(getActivity(), new C27112c(this)));
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
        this.f71489g = new DiscoverAdapterV3(this, mo69896i().f71558h);
        ListMiddleware<DiscoverStateV3, DiscoveryCellStructV3, C11583n> listMiddleware = mo69896i().f71558h;
        C11502e eVar = this;
        DiscoverAdapterV3 discoverAdapterV3 = this.f71489g;
        if (discoverAdapterV3 == null) {
            C7573i.m23583a("adapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, discoverAdapterV3, false, false, new C27110a(new C27113d(this), new C27114e(this), new C27115f(this)), new C27111b(new C27117g(this), new C27118h(this), DiscoverFragmentV3$onViewCreated$$inlined$ListListener$2.INSTANCE), new C27119i(this), null, null, null, 908, null);
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
        DiscoverAdapterV3 discoverAdapterV32 = this.f71489g;
        if (discoverAdapterV32 == null) {
            C7573i.m23583a("adapter");
        }
        fpsRecyclerView.setAdapter(discoverAdapterV32);
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        C7573i.m23582a((Object) fpsRecyclerView2, "recyclerView");
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(2, 1);
        wrapStaggeredGridLayoutManager.mo5427b(0);
        fpsRecyclerView2.setLayoutManager(wrapStaggeredGridLayoutManager);
        ((FpsRecyclerView) mo60553a((int) R.id.cqd)).mo5525a((C1272h) new DiscoveryV3ItemDecoration());
        ((SwipeRefreshLayout) mo60553a((int) R.id.ded)).setOnRefreshListener(new C27120j(this));
        FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo60553a((int) R.id.cqd);
        C7573i.m23582a((Object) fpsRecyclerView3, "recyclerView");
        DiscoverAdapterV3 discoverAdapterV33 = this.f71489g;
        if (discoverAdapterV33 == null) {
            C7573i.m23583a("adapter");
        }
        fpsRecyclerView3.setAdapter(discoverAdapterV33);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nw, viewGroup, false);
    }
}
