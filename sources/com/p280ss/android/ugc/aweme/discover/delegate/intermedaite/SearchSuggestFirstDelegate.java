package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSuggestFirstItemHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSuggestFirstItemHolder.C26471a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchSuggestFirstDelegate */
public final class SearchSuggestFirstDelegate extends C25647a<List<? extends Object>> {

    /* renamed from: a */
    public final SearchSquareAdapter<?> f70208a;

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchSuggestFirstDelegate$SuggestFirst */
    public enum SuggestFirst {
        TYPE_LIST
    }

    public SearchSuggestFirstDelegate(SearchSquareAdapter<?> searchSquareAdapter) {
        C7573i.m23587b(searchSquareAdapter, "adapter");
        this.f70208a = searchSquareAdapter;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        return C26471a.m87103a(viewGroup, this.f70208a);
    }

    /* renamed from: a */
    private static boolean m87474a(List<? extends Object> list, int i) {
        C7573i.m23587b(list, "items");
        return list.get(i) instanceof SuggestFirst;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87474a((List) obj, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87473a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m87473a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        ((SearchSuggestFirstItemHolder) vVar).mo68093a();
    }
}
