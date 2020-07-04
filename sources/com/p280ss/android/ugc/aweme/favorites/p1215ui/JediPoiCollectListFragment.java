package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import com.p280ss.android.ugc.aweme.favorites.adapter.PoiCollectListAdapter;
import com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState;
import com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27704h;
import com.p280ss.android.ugc.aweme.music.p1408b.C33772g;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
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
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment */
public final class JediPoiCollectListFragment extends JediBaseFragment {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f73224f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediPoiCollectListFragment.class), "poiCollectListViewModel", "getPoiCollectListViewModel()Lcom/ss/android/ugc/aweme/favorites/model/PoiCollectListViewModel;"))};

    /* renamed from: g */
    public PoiCollectListAdapter f73225g;

    /* renamed from: h */
    private final lifecycleAwareLazy f73226h;

    /* renamed from: i */
    private HashMap f73227i;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$ItemDecorationSpace */
    public static final class ItemDecorationSpace extends C1272h {

        /* renamed from: a */
        public final int f73228a = 1;

        public ItemDecorationSpace(int i) {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            C7573i.m23587b(rect, "outRect");
            C7573i.m23587b(view, "view");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            rect.bottom = this.f73228a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$a */
    public static final class C27771a implements C11557c<C27733b, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f73229a;

        /* renamed from: b */
        final /* synthetic */ C7563m f73230b;

        /* renamed from: c */
        final /* synthetic */ C7563m f73231c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f73232d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f73233e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C27733b>, C7581n> f73234f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f73232d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f73233e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C27733b>, C7581n> mo29140c() {
            return this.f73234f;
        }

        public C27771a(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f73229a = bVar;
            this.f73230b = mVar;
            this.f73231c = mVar2;
            this.f73232d = bVar;
            this.f73233e = mVar;
            this.f73234f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$b */
    public static final class C27772b implements C11557c<C27733b, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f73235a;

        /* renamed from: b */
        final /* synthetic */ C7563m f73236b;

        /* renamed from: c */
        final /* synthetic */ C7563m f73237c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f73238d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f73239e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C27733b>, C7581n> f73240f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f73238d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f73239e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C27733b>, C7581n> mo29140c() {
            return this.f73240f;
        }

        public C27772b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f73235a = bVar;
            this.f73236b = mVar;
            this.f73237c = mVar2;
            this.f73238d = bVar;
            this.f73239e = mVar;
            this.f73240f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$c */
    static final class C27773c extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73241a;

        C27773c(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73241a = jediPoiCollectListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91075a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91075a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                JediPoiCollectListFragment.m91061a(this.f73241a).ai_();
            } else {
                JediPoiCollectListFragment.m91061a(this.f73241a).ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$d */
    static final class C27774d extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73242a;

        C27774d(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73242a = jediPoiCollectListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91076a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91076a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            JediPoiCollectListFragment.m91061a(this.f73242a).mo60555a(C7525m.m23461a());
            ((DmtStatusView) this.f73242a.mo60553a((int) R.id.dav)).mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$e */
    static final class C27775e extends Lambda implements C7563m<C11585f, List<? extends C27733b>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73243a;

        C27775e(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73243a = jediPoiCollectListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91077a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91077a(C11585f fVar, List<C27733b> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            this.f73243a.mo69896i().f73193d = true;
            if (!C6307b.m19566a((Collection<T>) list)) {
                ((DmtStatusView) this.f73243a.mo60553a((int) R.id.dav)).mo25939d();
            } else {
                ((DmtStatusView) this.f73243a.mo60553a((int) R.id.dav)).mo25943g();
            }
            fVar.mo29066a(this.f73243a.mo69896i(), new C7562b<PoiCollectListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27775e f73244a;

                {
                    this.f73244a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m91078a((PoiCollectListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m91078a(PoiCollectListState poiCollectListState) {
                    C7573i.m23587b(poiCollectListState, "it");
                    if (C6307b.m19566a((Collection<T>) poiCollectListState.getListState().getList())) {
                        ((DmtStatusView) this.f73244a.f73243a.mo60553a((int) R.id.dav)).mo25943g();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$f */
    static final class C27777f extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73245a;

        C27777f(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73245a = jediPoiCollectListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91079a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91079a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f73245a.mo69896i().f73194e = false;
            ((DmtStatusView) this.f73245a.mo60553a((int) R.id.dav)).mo25944h();
            JediPoiCollectListFragment.m91061a(this.f73245a).ah_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$g */
    static final class C27778g extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73246a;

        C27778g(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73246a = jediPoiCollectListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91080a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91080a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f73246a.mo60553a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            if (!dmtStatusView.mo25945i()) {
                JediPoiCollectListFragment.m91061a(this.f73246a).ag_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$h */
    static final class C27779h extends Lambda implements C7563m<C11585f, List<? extends C27733b>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73247a;

        C27779h(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73247a = jediPoiCollectListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91081a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91081a(C11585f fVar, List<C27733b> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f73247a.mo69896i(), new C7562b<PoiCollectListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27779h f73248a;

                {
                    this.f73248a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m91082a((PoiCollectListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m91082a(PoiCollectListState poiCollectListState) {
                    C7573i.m23587b(poiCollectListState, "it");
                    if (C6307b.m19566a((Collection<T>) poiCollectListState.getListState().getList())) {
                        ((DmtStatusView) this.f73248a.f73247a.mo60553a((int) R.id.dav)).mo25943g();
                    } else {
                        ((DmtStatusView) this.f73248a.f73247a.mo60553a((int) R.id.dav)).mo25939d();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$i */
    static final class C27781i extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73249a;

        C27781i(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73249a = jediPoiCollectListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91083a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91083a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            JediPoiCollectListFragment.m91061a(this.f73249a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$j */
    static final class C27782j implements C6905a {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73250a;

        C27782j(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73250a = jediPoiCollectListFragment;
        }

        public final void bd_() {
            this.f73250a.mo29066a(this.f73250a.mo69896i(), new C7562b<PoiCollectListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27782j f73251a;

                {
                    this.f73251a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m91084a((PoiCollectListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m91084a(PoiCollectListState poiCollectListState) {
                    C7573i.m23587b(poiCollectListState, "it");
                    this.f73251a.f73250a.mo69896i().f73195f.mo29085c();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.JediPoiCollectListFragment$k */
    static final class C27784k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JediPoiCollectListFragment f73252a;

        C27784k(JediPoiCollectListFragment jediPoiCollectListFragment) {
            this.f73252a = jediPoiCollectListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f73252a.mo69896i().f73195f.mo29082b();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f73227i == null) {
            this.f73227i = new HashMap();
        }
        View view = (View) this.f73227i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f73227i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f73227i != null) {
            this.f73227i.clear();
        }
    }

    /* renamed from: i */
    public final PoiCollectListViewModel mo69896i() {
        return (PoiCollectListViewModel) this.f73226h.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    /* renamed from: l */
    private final View m91064l() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b2q, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…lection_empty_list, null)");
        return inflate;
    }

    public JediPoiCollectListFragment() {
        C7584c a = C7575l.m23595a(PoiCollectListViewModel.class);
        C7561a jediPoiCollectListFragment$$special$$inlined$viewModel$1 = new JediPoiCollectListFragment$$special$$inlined$viewModel$1(a);
        this.f73226h = new lifecycleAwareLazy(this, jediPoiCollectListFragment$$special$$inlined$viewModel$1, new JediPoiCollectListFragment$$special$$inlined$viewModel$3(this, jediPoiCollectListFragment$$special$$inlined$viewModel$1, a, JediPoiCollectListFragment$$special$$inlined$viewModel$2.INSTANCE));
    }

    /* renamed from: j */
    private final void m91062j() {
        ListMiddleware<PoiCollectListState, C27733b, C11583n> listMiddleware = mo69896i().f73195f;
        C11502e eVar = this;
        PoiCollectListAdapter poiCollectListAdapter = this.f73225g;
        if (poiCollectListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        C11554a aVar = poiCollectListAdapter;
        C7563m cVar = new C27773c(this);
        ListMiddleware.m33938a(listMiddleware, eVar, aVar, false, false, new C27771a(new C27774d(this), new C27777f(this), new C27775e(this)), new C27772b(new C27778g(this), new C27781i(this), new C27779h(this)), cVar, null, null, null, 908, null);
        PoiCollectListAdapter poiCollectListAdapter2 = this.f73225g;
        if (poiCollectListAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        poiCollectListAdapter2.mo66504a((C6905a) new C27782j(this));
    }

    /* renamed from: k */
    private final void m91063k() {
        this.f73225g = new PoiCollectListAdapter(this);
        RecyclerView recyclerView = (RecyclerView) mo60553a((int) R.id.y4);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
        recyclerView.mo5525a((C1272h) new ItemDecorationSpace(1));
        PoiCollectListAdapter poiCollectListAdapter = this.f73225g;
        if (poiCollectListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView.setAdapter(poiCollectListAdapter);
        ((DmtStatusView) mo60553a((int) R.id.dav)).setBuilder(new C10803a(getContext()).mo25953a().mo25963b(m91064l()).mo25964b(C43361b.m137644a(getContext(), new C27784k(this))));
    }

    /* renamed from: a */
    public static final /* synthetic */ PoiCollectListAdapter m91061a(JediPoiCollectListFragment jediPoiCollectListFragment) {
        PoiCollectListAdapter poiCollectListAdapter = jediPoiCollectListFragment.f73225g;
        if (poiCollectListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        return poiCollectListAdapter;
    }

    @C7709l
    public final void onEvent(C27704h hVar) {
        C7573i.m23587b(hVar, "event");
        PoiCollectListAdapter poiCollectListAdapter = this.f73225g;
        if (poiCollectListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        poiCollectListAdapter.mo60555a(new ArrayList());
        mo69896i().mo71246h();
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && getActivity() != null) {
            mo69896i().mo71245g();
        }
    }

    @C7709l
    public final void onEvent(C33772g gVar) {
        C7573i.m23587b(gVar, "event");
        PoiCollectListAdapter poiCollectListAdapter = this.f73225g;
        if (poiCollectListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        poiCollectListAdapter.mo60555a(new ArrayList());
        mo69896i().mo71246h();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m91063k();
        m91062j();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nh, viewGroup, false);
    }
}
