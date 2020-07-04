package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11554a.C11555a;
import com.bytedance.jedi.arch.ext.list.C11556b;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import com.bytedance.widget.C13031a;
import com.bytedance.widget.C13031a.C13033a;
import com.bytedance.widget.Widget;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.jedi.adapter.Differ;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26730b;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26733e;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.n */
public final class C26154n implements C26134am {

    /* renamed from: a */
    public boolean f68983a;

    /* renamed from: b */
    public final SearchJediViewModel f68984b;

    /* renamed from: c */
    private C11592h f68985c;

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$a */
    public static final class C26155a implements C11557c<C26754d, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f68986a;

        /* renamed from: b */
        final /* synthetic */ C7563m f68987b;

        /* renamed from: c */
        final /* synthetic */ C7563m f68988c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f68989d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f68990e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C26754d>, C7581n> f68991f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f68989d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f68990e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C26754d>, C7581n> mo29140c() {
            return this.f68991f;
        }

        public C26155a(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f68986a = bVar;
            this.f68987b = mVar;
            this.f68988c = mVar2;
            this.f68989d = bVar;
            this.f68990e = mVar;
            this.f68991f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$b */
    public static final class C26156b implements C11557c<C26754d, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f68992a;

        /* renamed from: b */
        final /* synthetic */ C7563m f68993b;

        /* renamed from: c */
        final /* synthetic */ C7563m f68994c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f68995d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f68996e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C26754d>, C7581n> f68997f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f68995d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f68996e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C26754d>, C7581n> mo29140c() {
            return this.f68997f;
        }

        public C26156b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f68992a = bVar;
            this.f68993b = mVar;
            this.f68994c = mVar2;
            this.f68995d = bVar;
            this.f68996e = mVar;
            this.f68997f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$c */
    public static final class C26157c implements C11554a<C26754d> {
        C26157c() {
        }

        /* renamed from: a */
        public final void mo29136a(List<? extends C26754d> list, C7561a<C7581n> aVar) {
            C7573i.m23587b(list, "list");
        }

        public final C11561b<C26754d> aC_() {
            C11561b bVar = new C11561b(new DetailJediOperator$bindView$1$mDiffer$1(), new Differ(), null, 4, null);
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C26754d mo29135a(int i, boolean z) {
            return (C26754d) C11555a.m34005a((C11554a<T>) this, i, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$d */
    static final class C26158d extends Lambda implements C7563m<C11585f, List<? extends C26754d>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C26154n f68998a;

        /* renamed from: b */
        final /* synthetic */ C25675c f68999b;

        C26158d(C26154n nVar, C25675c cVar) {
            this.f68998a = nVar;
            this.f68999b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m86011a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m86011a(C11585f fVar, List<? extends C26754d> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            fVar.mo29066a(this.f68998a.f68984b, new C7562b<SearchState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C26158d f69000a;

                {
                    this.f69000a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m86012a((SearchState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m86012a(SearchState searchState) {
                    boolean z;
                    C7573i.m23587b(searchState, "it");
                    C11556b bVar = ((C26733e) searchState.getListState().getPayload()).f31254a;
                    Iterable list = searchState.getListState().getList();
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (((C26754d) next).getFeedType() == 65280) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<C26754d> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (C26754d aweme : iterable) {
                        arrayList2.add(aweme.getAweme());
                    }
                    this.f69000a.f68999b.mo59099a((List) arrayList2, bVar.f31214a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$e */
    static final class C26160e extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C26154n f69001a;

        /* renamed from: b */
        final /* synthetic */ C25675c f69002b;

        C26160e(C26154n nVar, C25675c cVar) {
            this.f69001a = nVar;
            this.f69002b = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m86013a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m86013a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f69002b.aD_();
            this.f69001a.f68983a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$f */
    static final class C26161f extends Lambda implements C7563m<C11585f, List<? extends C26754d>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C26154n f69003a;

        /* renamed from: b */
        final /* synthetic */ C25675c f69004b;

        C26161f(C26154n nVar, C25675c cVar) {
            this.f69003a = nVar;
            this.f69004b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m86014a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m86014a(C11585f fVar, List<? extends C26754d> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            SearchJediViewModel searchJediViewModel = this.f69003a.f68984b;
            if (searchJediViewModel == null) {
                C7573i.m23580a();
            }
            fVar.mo29066a(searchJediViewModel, new C7562b<SearchState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C26161f f69005a;

                {
                    this.f69005a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m86015a((SearchState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m86015a(SearchState searchState) {
                    boolean z;
                    C7573i.m23587b(searchState, "it");
                    C11556b bVar = ((C26733e) searchState.getListState().getPayload()).f31254a;
                    Iterable list = searchState.getListState().getList();
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (((C26754d) next).getFeedType() == 65280) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<C26754d> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (C26754d aweme : iterable) {
                        arrayList2.add(aweme.getAweme());
                    }
                    this.f69005a.f69004b.mo59108b((List) arrayList2, bVar.f31214a);
                }
            });
            this.f69003a.f68983a = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$g */
    static final class C26163g extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C26154n f69006a;

        /* renamed from: b */
        final /* synthetic */ C25675c f69007b;

        C26163g(C26154n nVar, C25675c cVar) {
            this.f69006a = nVar;
            this.f69007b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m86016a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m86016a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "throwable");
            this.f69007b.mo59107b(new Exception(th));
            this.f69006a.f68983a = false;
        }
    }

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 9;
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        C7573i.m23587b(str, "aid");
        return false;
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f68983a;
    }

    /* renamed from: e */
    public final void mo67691e() {
    }

    /* renamed from: f */
    public final boolean mo67692f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo67693g() {
        return false;
    }

    /* renamed from: a */
    public final Object mo67683a() {
        return this.f68984b;
    }

    public C26154n(SearchJediViewModel searchJediViewModel) {
        this.f68984b = searchJediViewModel;
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        C7573i.m23587b(aoVar, "panel");
        C25675c cVar = aoVar;
        SearchJediViewModel searchJediViewModel = this.f68984b;
        if (searchJediViewModel == null) {
            C7573i.m23580a();
        }
        C11592h hVar = this.f68985c;
        if (hVar == null) {
            C7573i.m23583a("jediView");
        }
        C26730b.m87771a(searchJediViewModel, hVar, new C26157c(), new C26155a(DetailJediOperator$bindView$$inlined$ListListener$1.INSTANCE, DetailJediOperator$bindView$$inlined$ListListener$2.INSTANCE, new C26158d(this, cVar)), new C26156b(new C26160e(this, cVar), new C26163g(this, cVar), new C26161f(this, cVar)), null);
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        C7573i.m23587b(fragment, "owner");
        if (this.f68984b == null) {
            return false;
        }
        this.f68985c = new JediWidget();
        C13033a aVar = C13031a.f34476e;
        View view = fragment.getView();
        if (view == null) {
            C7573i.m23580a();
        }
        C13031a a = aVar.mo31608a(fragment, view);
        C11592h hVar = this.f68985c;
        if (hVar == null) {
            C7573i.m23583a("jediView");
        }
        if (hVar != null) {
            a.mo31605a((Widget) hVar);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.widget.Widget");
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        if (i == 1) {
            SearchJediViewModel searchJediViewModel = this.f68984b;
            if (searchJediViewModel == null) {
                C7573i.m23580a();
            }
            C26730b.m87773b(searchJediViewModel);
        } else if (i == 4) {
            SearchJediViewModel searchJediViewModel2 = this.f68984b;
            if (searchJediViewModel2 == null) {
                C7573i.m23580a();
            }
            C26730b.m87770a(searchJediViewModel2);
        }
    }
}
