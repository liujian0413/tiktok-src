package com.p280ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11580m;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27702g;
import com.p280ss.android.ugc.aweme.favorites.p1213d.C27751c;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a;
import com.p280ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder.C27825a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel */
public final class PoiCollectListViewModel extends JediBaseViewModel<PoiCollectListState> {

    /* renamed from: g */
    public static final C27755a f73191g = new C27755a(null);

    /* renamed from: c */
    public final C27751c f73192c = new C27751c();

    /* renamed from: d */
    public boolean f73193d;

    /* renamed from: e */
    public boolean f73194e;

    /* renamed from: f */
    public final ListMiddleware<PoiCollectListState, C27733b, C11583n> f73195f;

    /* renamed from: h */
    private final C7561a<C7581n> f73196h;

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$a */
    public static final class C27755a {
        private C27755a() {
        }

        public /* synthetic */ C27755a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$b */
    static final class C27756b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ PoiCollectListViewModel f73197a;

        C27756b(PoiCollectListViewModel poiCollectListViewModel) {
            this.f73197a = poiCollectListViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m91008a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91008a() {
            C27752a.m90965a();
            this.f73197a.f73195f.mo29078a(this.f73197a.f73192c.f73187b + 1, new C27733b(3, new C27825a(1, null, 2, null)));
            int i = this.f73197a.f73192c.f73187b;
            this.f73197a.f73195f.mo29080a(i + 1, this.f73197a.f73192c.mo71234a(10));
            this.f73197a.f73195f.mo29078a(this.f73197a.f73192c.f73187b + 1, this.f73197a.mo29069f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$c */
    static final class C27757c extends Lambda implements C7563m<PoiCollectListState, ListState<C27733b, C11583n>, PoiCollectListState> {

        /* renamed from: a */
        public static final C27757c f73198a = new C27757c();

        C27757c() {
            super(2);
        }

        /* renamed from: a */
        private static PoiCollectListState m91009a(PoiCollectListState poiCollectListState, ListState<C27733b, C11583n> listState) {
            C7573i.m23587b(poiCollectListState, "$receiver");
            C7573i.m23587b(listState, "it");
            return poiCollectListState.copy(listState);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m91009a((PoiCollectListState) obj, (ListState) obj2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$d */
    static final class C27758d extends Lambda implements C7562b<PoiCollectListState, C7319aa<Pair<? extends List<? extends C27733b>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ PoiCollectListViewModel f73199a;

        C27758d(PoiCollectListViewModel poiCollectListViewModel) {
            this.f73199a = poiCollectListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7319aa<Pair<List<C27733b>, C11583n>> invoke(PoiCollectListState poiCollectListState) {
            C7573i.m23587b(poiCollectListState, "state");
            C7319aa<Pair<List<C27733b>, C11583n>> b = this.f73199a.f73192c.mo71233a(12, poiCollectListState.getListState().getPayload().f31255b).mo19134b((C7327h<? super T, ? extends R>) C277591.f73200a);
            C7573i.m23582a((Object) b, "repo.getPoiCollectionLis…                        }");
            return b;
        }
    }

    /* renamed from: i */
    private static PoiCollectListState m91001i() {
        return new PoiCollectListState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m91001i();
    }

    /* renamed from: h */
    public final void mo71246h() {
        this.f73192c.mo71236c();
        this.f73195f.mo29082b();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        this.f73195f.mo29186a(C27766d.f73210a, (C7563m<? super S, ? super PROP, ? extends S>) C27757c.f73198a);
        mo29033a(this.f73195f);
    }

    /* renamed from: f */
    public final C27733b mo29069f() {
        return new C27733b(3, new C27825a(this.f73192c.mo71235b(), this.f73196h));
    }

    /* renamed from: g */
    public final void mo71245g() {
        if (!this.f73193d && !this.f73194e) {
            this.f73195f.mo29082b();
            this.f73194e = true;
        }
    }

    public PoiCollectListViewModel() {
        C7562b dVar = new C27758d(this);
        this.f73195f = new ListMiddleware<>(new PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$1(this), new PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$2(dVar), C11580m.m34045a(), C11580m.m34046b());
        this.f73196h = new C27756b(this);
    }

    /* renamed from: a */
    public final List<C27733b> mo71244a(List<C27702g> list, List<C27702g> list2) {
        if (list2 == null || list2.isEmpty()) {
            Iterable<C27702g> iterable = list;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (C27702g bVar : iterable) {
                arrayList.add(new C27733b(1, bVar));
            }
            return (List) arrayList;
        }
        C27752a.m90966a(list2.size());
        ArrayList arrayList2 = new ArrayList();
        this.f73192c.f73186a.addAll(list2);
        arrayList2.add(new C27733b(2, Integer.valueOf(0)));
        arrayList2.addAll(this.f73192c.mo71234a(2));
        if (list2.size() > 2) {
            arrayList2.add(new C27733b(3, new C27825a(this.f73192c.mo71235b(), this.f73196h)));
        }
        arrayList2.add(new C27733b(2, Integer.valueOf(1)));
        Iterable<C27702g> iterable2 = list;
        Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable2, 10));
        for (C27702g bVar2 : iterable2) {
            arrayList3.add(new C27733b(1, bVar2));
        }
        arrayList2.addAll((List) arrayList3);
        return arrayList2;
    }
}
