package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.p280ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle;
import com.p280ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26755e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel */
public final class SearchJediViewModel extends JediViewModel<SearchState> {

    /* renamed from: c */
    public final ListMiddleware<SearchState, C26754d, C26733e> f70431c;

    /* renamed from: d */
    public List<C26754d> f70432d;

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$a */
    static final class C26719a extends Lambda implements C7562b<SearchState, C7492s<Pair<? extends List<? extends C26754d>, ? extends C26733e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchJediViewModel f70433a;

        C26719a(SearchJediViewModel searchJediViewModel) {
            this.f70433a = searchJediViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<C26754d>, C26733e>> invoke(SearchState searchState) {
            C7573i.m23587b(searchState, "state");
            final C26734f searchParam = searchState.getSearchParam();
            searchParam.f70452f = ((C26733e) searchState.getListState().getPayload()).f70445c;
            C7492s<Pair<List<C26754d>, C26733e>> d = SearchApiNew.m87312a(searchParam, ((C26733e) searchState.getListState().getPayload()).f31255b, 10).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C26719a f70434a;

                {
                    this.f70434a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C26755e apply(C26755e eVar) {
                    C7573i.m23587b(eVar, "it");
                    this.f70434a.f70433a.mo68450b(eVar.f70555d);
                    return eVar;
                }
            }).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C26754d>, C26733e> apply(C26755e eVar) {
                    C7573i.m23587b(eVar, "it");
                    List<C26754d> list = eVar.f70555d;
                    String str = searchParam.f70452f;
                    if (str == null) {
                        str = "";
                    }
                    return C7579l.m23633a(list, new C26733e(str, eVar.f70554c, eVar.f70553b, eVar));
                }
            });
            C7573i.m23582a((Object) d, "SearchApiNew.searchMTMix…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$b */
    static final class C26722b extends Lambda implements C7562b<SearchState, C7492s<Pair<? extends List<? extends C26754d>, ? extends C26733e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchJediViewModel f70436a;

        C26722b(SearchJediViewModel searchJediViewModel) {
            this.f70436a = searchJediViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<C26754d>, C26733e>> invoke(SearchState searchState) {
            C7573i.m23587b(searchState, "state");
            C7492s<Pair<List<C26754d>, C26733e>> d = SearchApiNew.m87312a(searchState.getSearchParam(), 0, 10).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C26722b f70437a;

                {
                    this.f70437a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C26755e apply(C26755e eVar) {
                    C7573i.m23587b(eVar, "it");
                    this.f70437a.f70436a.mo68451c(eVar.f70555d);
                    this.f70437a.f70436a.mo68449a(eVar.f70555d);
                    return eVar;
                }
            }).mo19317d((C7327h<? super T, ? extends R>) C267242.f70438a);
            C7573i.m23582a((Object) d, "SearchApiNew.searchMTMix…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$c */
    static final class C26725c extends Lambda implements C7563m<List<? extends C26754d>, List<? extends C26754d>, List<? extends C26754d>> {

        /* renamed from: a */
        public static final C26725c f70439a = new C26725c();

        C26725c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m87766a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<C26754d> m87766a(List<? extends C26754d> list, List<? extends C26754d> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            return C7525m.m23522l(C7525m.m23506c((Collection<? extends T>) list, (Iterable<? extends T>) list2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$d */
    static final class C26726d extends Lambda implements C7562b<SearchState, SearchState> {

        /* renamed from: a */
        final /* synthetic */ C26734f f70440a;

        C26726d(C26734f fVar) {
            this.f70440a = fVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SearchState invoke(SearchState searchState) {
            C7573i.m23587b(searchState, "$receiver");
            return SearchState.copy$default(searchState, null, this.f70440a, 1, null);
        }
    }

    /* renamed from: f */
    private static SearchState m87753f() {
        return new SearchState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m87753f();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        new SearchJediViewModelMiddlewareBinding().binding(this);
    }

    public SearchJediViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C26722b(this), new C26719a(this), null, C26725c.f70439a, 4, null);
        this.f70431c = listMiddleware;
    }

    /* renamed from: a */
    public final void mo68448a(C26734f fVar) {
        C7573i.m23587b(fVar, "param");
        mo29038c(new C26726d(fVar));
    }

    /* renamed from: a */
    private static boolean m87751a(C26754d dVar) {
        if (dVar == null) {
            return false;
        }
        int feedType = dVar.getFeedType();
        if (feedType == 65280) {
            return true;
        }
        int a = C6384b.m19835a().mo15287a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", C6384b.m19835a().mo15295d().general_related_search_style, 0);
        if (feedType == 65459 && a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final int m87752d(List<C26754d> list) {
        if (list == null) {
            return 0;
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (m87751a((C26754d) next)) {
                arrayList.add(next);
            }
        }
        return ((List) arrayList).size();
    }

    /* renamed from: b */
    public final void mo68450b(List<C26754d> list) {
        if (this.f70432d != null) {
            List<C26754d> list2 = this.f70432d;
            if (list2 == null || list2.size() != 0) {
                if (list != null) {
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (m87751a((C26754d) it.next())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0 && i < list.size()) {
                        list.add(0, (C26754d) list.remove(i));
                        List<C26754d> list3 = this.f70432d;
                        if (list3 == null) {
                            C7573i.m23580a();
                        }
                        list.addAll(1, list3);
                    }
                }
                this.f70432d = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo68449a(List<C26754d> list) {
        if (list != null && (!list.isEmpty())) {
            this.f70432d = new ArrayList();
            List<C26754d> d = C7525m.m23509d((Collection<? extends T>) C7525m.m23512f((Iterable<? extends T>) list));
            for (C26754d dVar : d) {
                if (m87751a(dVar)) {
                    break;
                }
                List<C26754d> list2 = this.f70432d;
                if (list2 != null) {
                    list2.add(dVar);
                }
            }
            if (this.f70432d != null) {
                List<C26754d> list3 = this.f70432d;
                if (list3 == null || list3.size() != 0) {
                    List<C26754d> list4 = this.f70432d;
                    if (list4 == null) {
                        C7573i.m23580a();
                    }
                    d.removeAll(list4);
                    if (m87752d(d) % 2 == 0) {
                        List<C26754d> list5 = this.f70432d;
                        if (list5 != null) {
                            list5.clear();
                        }
                        this.f70432d = null;
                        return;
                    }
                    List<C26754d> list6 = this.f70432d;
                    if (list6 == null) {
                        C7573i.m23580a();
                    }
                    list.removeAll(list6);
                    List<C26754d> list7 = this.f70432d;
                    if (list7 != null) {
                        C7525m.m23486e(list7);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo68451c(List<C26754d> list) {
        if (list != null && (!list.isEmpty())) {
            int a = C6384b.m19835a().mo15287a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", C6384b.m19835a().mo15295d().general_related_search_style, 0);
            Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                C26754d dVar = (C26754d) it.next();
                if (dVar.mo68495a()) {
                    i++;
                } else if (dVar.getFeedType() == 65459) {
                    break;
                } else {
                    i = 0;
                }
                i2++;
            }
            if (i2 > 0 && i2 < list.size()) {
                if (a == 0) {
                    list.remove(i2);
                } else if (a == 2 && i % 2 != 0 && i2 < list.size() - 1) {
                    int i3 = i2 + 1;
                    int size = list.size();
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        } else if (m87751a((C26754d) list.get(i3))) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 <= i2 || i3 >= list.size()) {
                        list.remove(i2);
                    } else {
                        Collections.swap(list, i2, i3);
                    }
                }
            }
        }
    }
}
