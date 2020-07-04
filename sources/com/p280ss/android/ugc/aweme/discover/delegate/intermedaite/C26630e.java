package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryLinesViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryLinesViewHolder.C26511a;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.e */
public final class C26630e extends C25647a<List<? extends Object>> {

    /* renamed from: a */
    private C27014c f70218a;

    /* renamed from: a */
    public final void mo68323a(C27014c cVar) {
        C7573i.m23587b(cVar, "handler");
        this.f70218a = cVar;
    }

    /* renamed from: a */
    private static boolean m87504a(Object obj) {
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null && !C6307b.m19566a((Collection<T>) list) && (list.get(0) instanceof SearchHistory)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        return C26511a.m87183a(viewGroup, this.f70218a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo62253a(List<? extends Object> list, int i) {
        C7573i.m23587b(list, "items");
        return m87504a(list.get(i));
    }

    /* renamed from: a */
    private static void m87503a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        Object obj = list.get(i);
        SearchHistoryLinesViewHolder searchHistoryLinesViewHolder = (SearchHistoryLinesViewHolder) vVar;
        if (obj != null) {
            searchHistoryLinesViewHolder.mo68138a((List) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87503a((List) obj, i, vVar, list);
    }
}
