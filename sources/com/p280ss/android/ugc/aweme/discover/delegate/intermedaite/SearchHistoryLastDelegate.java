package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchHistoryLastItemHolder;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.search.C37380c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate */
public final class SearchHistoryLastDelegate extends C25647a<List<? extends Object>> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f70203a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchHistoryLastDelegate.class), "mtSearchFoldCount", "getMtSearchFoldCount()I"))};

    /* renamed from: b */
    public static final C26622a f70204b = new C26622a(null);

    /* renamed from: c */
    private final C7541d f70205c = C7546e.m23569a(C26623b.f70207a);

    /* renamed from: d */
    private C27014c f70206d;

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate$HistoryLast */
    public enum HistoryLast {
        TYPE_NULL,
        TYPE_NONE,
        TYPE_SHOW_MORE,
        TYPE_CLEAR_ALL
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate$a */
    public static final class C26622a {
        private C26622a() {
        }

        public /* synthetic */ C26622a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate$b */
    static final class C26623b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C26623b f70207a = new C26623b();

        C26623b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m87472a();
        }

        /* renamed from: a */
        private static Integer m87472a() {
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                return a.getMtSearchHistoryFoldCount();
            } catch (Exception unused) {
                return Integer.valueOf(3);
            }
        }
    }

    /* renamed from: a */
    private int m87461a() {
        return ((Number) this.f70205c.getValue()).intValue();
    }

    /* renamed from: a */
    public final void mo68317a(C27014c cVar) {
        C7573i.m23587b(cVar, "handler");
        this.f70206d = cVar;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        SearchHistoryLastItemHolder a = SearchHistoryLastItemHolder.m86994a(viewGroup, this.f70206d);
        C7573i.m23582a((Object) a, "SearchHistoryLastItemHol….create(parent, mHandler)");
        return a;
    }

    /* renamed from: a */
    private static boolean m87463a(List<? extends Object> list, int i) {
        C7573i.m23587b(list, "items");
        return list.get(i) instanceof HistoryLast;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87463a((List) obj, i);
    }

    /* renamed from: c */
    private static HistoryLast m87465c(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, HistoryLast historyLast) {
        arrayList.addAll(list);
        if (list.size() <= 2) {
            return HistoryLast.TYPE_NONE;
        }
        return HistoryLast.TYPE_CLEAR_ALL;
    }

    /* renamed from: b */
    private final HistoryLast m87464b(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, HistoryLast historyLast) {
        int i;
        if (C6399b.m19944t()) {
            i = m87461a();
        } else {
            i = 2;
        }
        if (list.size() <= i) {
            arrayList.addAll(list);
            return HistoryLast.TYPE_NONE;
        } else if (historyLast == HistoryLast.TYPE_NONE || historyLast == HistoryLast.TYPE_SHOW_MORE) {
            arrayList.addAll(list.subList(0, i));
            return HistoryLast.TYPE_SHOW_MORE;
        } else {
            arrayList.addAll(list);
            return HistoryLast.TYPE_CLEAR_ALL;
        }
    }

    /* renamed from: d */
    private static HistoryLast m87466d(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, HistoryLast historyLast) {
        if (list.size() <= 3) {
            arrayList.addAll(list);
            return HistoryLast.TYPE_CLEAR_ALL;
        } else if (historyLast == HistoryLast.TYPE_NONE || historyLast == HistoryLast.TYPE_SHOW_MORE) {
            arrayList.addAll(list.subList(0, 3));
            return HistoryLast.TYPE_SHOW_MORE;
        } else {
            arrayList.addAll(list);
            return HistoryLast.TYPE_CLEAR_ALL;
        }
    }

    /* renamed from: a */
    public final HistoryLast mo68316a(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, HistoryLast historyLast) {
        C7573i.m23587b(arrayList, "resultList");
        C7573i.m23587b(historyLast, "defLast");
        if (C6307b.m19566a((Collection<T>) list)) {
            return HistoryLast.TYPE_NONE;
        }
        if (!C6399b.m19944t() || (C26654b.m87579g() && !C26654b.m87580h())) {
            if (list == null) {
                C7573i.m23580a();
            }
            return m87464b(list, arrayList, historyLast);
        } else if (C37380c.m119974a()) {
            if (list == null) {
                C7573i.m23580a();
            }
            return m87466d(list, arrayList, historyLast);
        } else {
            if (list == null) {
                C7573i.m23580a();
            }
            return m87465c(list, arrayList, historyLast);
        }
    }

    /* renamed from: a */
    private static void m87462a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            ((SearchHistoryLastItemHolder) vVar).mo68039a((HistoryLast) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate.HistoryLast");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87462a((List) obj, i, vVar, list);
    }
}
