package com.p280ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0043i;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.C26533a;
import com.p280ss.android.ugc.aweme.discover.base.MultiTypeAdapter;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26624a;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26626b;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26629d;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26630e;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26632g;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate.HistoryLast;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.SearchSuggestFirstDelegate;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.SearchSuggestFirstDelegate.SuggestFirst;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.p280ss.android.ugc.aweme.search.C37380c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.C7541d;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter */
public final class SearchSquareAdapter<SuggestType> extends MultiTypeAdapter<Object> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f69780a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchSquareAdapter.class), "mDataStore", "getMDataStore()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter$DataStore;"))};

    /* renamed from: b */
    public final C0043i f69781b;

    /* renamed from: c */
    private final C26629d f69782c = new C26629d();

    /* renamed from: d */
    private final C26630e f69783d = new C26630e();

    /* renamed from: e */
    private SearchHistoryLastDelegate f69784e = new SearchHistoryLastDelegate();

    /* renamed from: f */
    private C26624a f69785f = new C26624a(this.f69781b);

    /* renamed from: g */
    private C26632g f69786g = new C26632g(this);

    /* renamed from: i */
    private SearchSuggestFirstDelegate f69787i = new SearchSuggestFirstDelegate(this);

    /* renamed from: j */
    private C26626b f69788j = new C26626b(this.f69781b);

    /* renamed from: k */
    private final C7541d f69789k = C26479ad.m87144a(new C26468b(this));

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$a */
    final class C26462a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f69790a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26462a.class), "rawHistoryList", "getRawHistoryList()Ljava/util/ArrayList;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26462a.class), "viewHistoryList", "getViewHistoryList()Ljava/util/ArrayList;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26462a.class), "hotSearchList", "getHotSearchList()Ljava/util/ArrayList;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26462a.class), "guessWordList", "getGuessWordList()Ljava/util/ArrayList;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26462a.class), "suggestList", "getSuggestList()Ljava/util/ArrayList;"))};

        /* renamed from: b */
        public HistoryLast f69791b = HistoryLast.TYPE_NULL;

        /* renamed from: d */
        private final C7541d f69793d = C26479ad.m87144a(C26465c.f69800a);

        /* renamed from: e */
        private final C7541d f69794e = C26479ad.m87144a(C26467e.f69802a);

        /* renamed from: f */
        private final C7541d f69795f = C26479ad.m87144a(C26464b.f69799a);

        /* renamed from: g */
        private final C7541d f69796g = C26479ad.m87144a(C26463a.f69798a);

        /* renamed from: h */
        private final C7541d f69797h = C26479ad.m87144a(C26466d.f69801a);

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$a$a */
        static final class C26463a extends Lambda implements C7561a<ArrayList<Word>> {

            /* renamed from: a */
            public static final C26463a f69798a = new C26463a();

            C26463a() {
                super(0);
            }

            /* renamed from: a */
            private static ArrayList<Word> m87085a() {
                return new ArrayList<>();
            }

            public final /* synthetic */ Object invoke() {
                return m87085a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$a$b */
        static final class C26464b extends Lambda implements C7561a<ArrayList<HotSearchItem>> {

            /* renamed from: a */
            public static final C26464b f69799a = new C26464b();

            C26464b() {
                super(0);
            }

            /* renamed from: a */
            private static ArrayList<HotSearchItem> m87086a() {
                return new ArrayList<>();
            }

            public final /* synthetic */ Object invoke() {
                return m87086a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$a$c */
        static final class C26465c extends Lambda implements C7561a<ArrayList<SearchHistory>> {

            /* renamed from: a */
            public static final C26465c f69800a = new C26465c();

            C26465c() {
                super(0);
            }

            /* renamed from: a */
            private static ArrayList<SearchHistory> m87087a() {
                return new ArrayList<>();
            }

            public final /* synthetic */ Object invoke() {
                return m87087a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$a$d */
        static final class C26466d extends Lambda implements C7561a<ArrayList<SuggestType>> {

            /* renamed from: a */
            public static final C26466d f69801a = new C26466d();

            C26466d() {
                super(0);
            }

            /* renamed from: a */
            private static ArrayList<SuggestType> m87088a() {
                return new ArrayList<>();
            }

            public final /* synthetic */ Object invoke() {
                return m87088a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$a$e */
        static final class C26467e extends Lambda implements C7561a<ArrayList<SearchHistory>> {

            /* renamed from: a */
            public static final C26467e f69802a = new C26467e();

            C26467e() {
                super(0);
            }

            /* renamed from: a */
            private static ArrayList<SearchHistory> m87089a() {
                return new ArrayList<>();
            }

            public final /* synthetic */ Object invoke() {
                return m87089a();
            }
        }

        /* renamed from: c */
        private ArrayList<SearchHistory> m87073c() {
            return (ArrayList) this.f69793d.getValue();
        }

        /* renamed from: d */
        private ArrayList<HotSearchItem> m87074d() {
            return (ArrayList) this.f69795f.getValue();
        }

        /* renamed from: e */
        private ArrayList<Word> m87075e() {
            return (ArrayList) this.f69796g.getValue();
        }

        /* renamed from: a */
        public final ArrayList<SearchHistory> mo68080a() {
            return (ArrayList) this.f69794e.getValue();
        }

        /* renamed from: b */
        public final ArrayList<SuggestType> mo68083b() {
            return (ArrayList) this.f69797h.getValue();
        }

        /* renamed from: f */
        private final void m87076f() {
            ArrayList arrayList = new ArrayList();
            boolean h = C26654b.m87580h();
            if (h && !m87075e().isEmpty()) {
                arrayList.add(m87075e());
            }
            if (!m87073c().isEmpty()) {
                arrayList.add(m87073c());
            }
            if (!mo68080a().isEmpty()) {
                arrayList.add(mo68080a());
            }
            if (this.f69791b != HistoryLast.TYPE_NULL) {
                arrayList.add(this.f69791b);
            }
            if (!m87074d().isEmpty()) {
                arrayList.add(m87074d());
            }
            if (!h && !m87075e().isEmpty()) {
                arrayList.add(m87075e());
            }
            if (!mo68083b().isEmpty()) {
                arrayList.add(SuggestFirst.TYPE_LIST);
                arrayList.addAll(mo68083b());
            }
            SearchSquareAdapter.this.f70134h.clear();
            SearchSquareAdapter.this.f70134h.addAll(arrayList);
            SearchSquareAdapter.this.notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo68081a(HistoryLast historyLast) {
            C7573i.m23587b(historyLast, "last");
            this.f69791b = historyLast;
            m87076f();
        }

        /* renamed from: c */
        public final void mo68085c(List<HotSearchItem> list) {
            C7573i.m23587b(list, "list");
            m87074d().clear();
            m87074d().addAll(list);
            m87076f();
        }

        /* renamed from: d */
        public final void mo68086d(List<Word> list) {
            C7573i.m23587b(list, "list");
            m87075e().clear();
            m87075e().addAll(list);
            m87076f();
        }

        /* renamed from: e */
        public final void mo68087e(List<? extends SuggestType> list) {
            C7573i.m23587b(list, "list");
            mo68083b().clear();
            mo68083b().addAll(list);
            m87076f();
        }

        public C26462a() {
        }

        /* renamed from: b */
        public final void mo68084b(List<? extends SearchHistory> list) {
            C7573i.m23587b(list, "list");
            mo68080a().clear();
            Collection collection = list;
            mo68080a().addAll(collection);
            C26533a.m87228a(!collection.isEmpty());
            m87076f();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r3 != false) goto L_0x003f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo68082a(java.util.List<? extends com.p280ss.android.ugc.aweme.discover.model.SearchHistory> r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter r0 = com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.this
                java.util.List<T> r0 = r0.f70134h
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
                r2 = 0
            L_0x000a:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0028
                java.lang.Object r3 = r0.next()
                boolean r4 = r3 instanceof java.util.List
                if (r4 == 0) goto L_0x0021
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r3 = kotlin.collections.C7525m.m23513g(r3)
                boolean r3 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchHistory
                goto L_0x0022
            L_0x0021:
                r3 = 0
            L_0x0022:
                if (r3 == 0) goto L_0x0025
                goto L_0x0029
            L_0x0025:
                int r2 = r2 + 1
                goto L_0x000a
            L_0x0028:
                r2 = -1
            L_0x0029:
                r0 = 1
                if (r2 < 0) goto L_0x003e
                r3 = r6
                java.util.Collection r3 = (java.util.Collection) r3
                if (r3 == 0) goto L_0x003a
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r3 = 0
                goto L_0x003b
            L_0x003a:
                r3 = 1
            L_0x003b:
                if (r3 == 0) goto L_0x003e
                goto L_0x003f
            L_0x003e:
                r0 = 0
            L_0x003f:
                java.util.ArrayList r1 = r5.m87073c()
                r1.clear()
                if (r0 == 0) goto L_0x0055
                com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter r6 = com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.this
                java.util.List<T> r6 = r6.f70134h
                r6.remove(r2)
                com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter r6 = com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.this
                r6.notifyItemRemoved(r2)
                return
            L_0x0055:
                if (r6 == 0) goto L_0x0060
                java.util.ArrayList r0 = r5.m87073c()
                java.util.Collection r6 = (java.util.Collection) r6
                r0.addAll(r6)
            L_0x0060:
                r5.m87076f()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.C26462a.mo68082a(java.util.List):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$b */
    static final class C26468b extends Lambda implements C7561a<C26462a> {

        /* renamed from: a */
        final /* synthetic */ SearchSquareAdapter f69803a;

        C26468b(SearchSquareAdapter searchSquareAdapter) {
            this.f69803a = searchSquareAdapter;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C26462a invoke() {
            return new C26462a<>();
        }
    }

    /* renamed from: c */
    private final C26462a m87061c() {
        return (C26462a) this.f69789k.getValue();
    }

    /* renamed from: a */
    public final int mo68069a() {
        return m87061c().mo68080a().size();
    }

    /* renamed from: b */
    public final ArrayList<SuggestType> mo68077b() {
        return m87061c().mo68083b();
    }

    /* renamed from: a */
    public final void mo68070a(C27012a aVar) {
        C7573i.m23587b(aVar, "handler");
        this.f69785f.mo68318a(aVar);
    }

    /* renamed from: a */
    public final void mo68071a(C27013b bVar) {
        C7573i.m23587b(bVar, "handler");
        this.f69788j.mo68319a(bVar);
    }

    /* renamed from: b */
    public final void mo68078b(List<Word> list) {
        C26462a aVar;
        List<Word> list2;
        this.f69785f.f70210a = true;
        if (C6307b.m19566a((Collection<T>) list)) {
            aVar = m87061c();
            list2 = Collections.emptyList();
            C7573i.m23582a((Object) list2, "Collections.emptyList()");
        } else {
            C26462a c = m87061c();
            if (list == null) {
                C7573i.m23580a();
            }
            C26462a aVar2 = c;
            list2 = list;
            aVar = aVar2;
        }
        aVar.mo68086d(list2);
    }

    /* renamed from: c */
    public final void mo68079c(List<? extends SuggestType> list) {
        C26462a aVar;
        List<? extends SuggestType> list2;
        if (C6307b.m19566a((Collection<T>) list)) {
            aVar = m87061c();
            list2 = Collections.emptyList();
            C7573i.m23582a((Object) list2, "Collections.emptyList()");
        } else {
            C26462a c = m87061c();
            if (list == null) {
                C7573i.m23580a();
            }
            C26462a aVar2 = c;
            list2 = list;
            aVar = aVar2;
        }
        aVar.mo68087e(list2);
    }

    /* renamed from: a */
    public final void mo68072a(C27014c cVar) {
        C7573i.m23587b(cVar, "handler");
        this.f69783d.mo68323a(cVar);
        this.f69782c.mo68322a(cVar);
        this.f69784e.mo68317a(cVar);
    }

    public SearchSquareAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        this.f69781b = iVar;
        if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) != 0 || C26654b.m87582j() || C37380c.m119978e()) {
            mo68272a(this.f69782c);
        }
        mo68272a(this.f69783d);
        mo68272a(this.f69784e);
        mo68272a(this.f69788j);
        mo68272a(this.f69785f);
        mo68272a(this.f69786g);
        mo68272a(this.f69787i);
    }

    /* renamed from: a */
    public final void mo68073a(List<HotSearchItem> list) {
        C26462a aVar;
        List<HotSearchItem> list2;
        this.f69788j.f70214a = true;
        if (C6307b.m19566a((Collection<T>) list)) {
            aVar = m87061c();
            list2 = Collections.emptyList();
            C7573i.m23582a((Object) list2, "Collections.emptyList()");
        } else {
            C26462a c = m87061c();
            if (list == null) {
                C7573i.m23580a();
            }
            C26462a aVar2 = c;
            list2 = list;
            aVar = aVar2;
        }
        aVar.mo68085c(list2);
    }

    /* renamed from: a */
    public final void mo68076a(boolean z) {
        this.f69785f.f70210a = true;
        this.f69788j.f70214a = true;
    }

    /* renamed from: a */
    public final void mo68074a(List<? extends SearchHistory> list, HistoryLast historyLast) {
        C7573i.m23587b(list, "rawHistoryList");
        C7573i.m23587b(historyLast, "last");
        ArrayList arrayList = new ArrayList();
        this.f69784e.mo68316a(list, arrayList, historyLast);
        m87061c().mo68084b(arrayList);
        m87061c().mo68081a(historyLast);
    }

    /* renamed from: a */
    public final void mo68075a(List<? extends SearchHistory> list, boolean z) {
        HistoryLast historyLast;
        if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) != 0 || C26654b.m87582j() || C37380c.m119978e()) {
            m87061c().mo68082a(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            historyLast = HistoryLast.TYPE_NONE;
        } else {
            historyLast = m87061c().f69791b;
        }
        HistoryLast a = this.f69784e.mo68316a(list, arrayList, historyLast);
        m87061c().mo68084b(arrayList);
        m87061c().mo68081a(a);
    }
}
