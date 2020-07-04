package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder.C26512a;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder.C26516a;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.d */
public final class C26629d extends C25647a<List<? extends Object>> {

    /* renamed from: a */
    private C27014c f70217a;

    /* renamed from: a */
    public final void mo68322a(C27014c cVar) {
        C7573i.m23587b(cVar, "handler");
        this.f70217a = cVar;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        if (C26654b.m87582j()) {
            return C26512a.m87185a(viewGroup, this.f70217a);
        }
        return C26516a.m87193a(viewGroup, this.f70217a);
    }

    /* renamed from: a */
    private static boolean m87498a(List<? extends Object> list, int i) {
        C7573i.m23587b(list, "items");
        Object obj = list.get(i);
        if (!(obj instanceof List) || !(C7525m.m23513g((List) obj) instanceof SearchHistory)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87498a((List) obj, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87497a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m87497a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        Object obj = list.get(i);
        if (vVar instanceof SearchHistoryMvpViewHolder) {
            SearchHistoryMvpViewHolder searchHistoryMvpViewHolder = (SearchHistoryMvpViewHolder) vVar;
            if (obj != null) {
                searchHistoryMvpViewHolder.mo68139a((List) obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
        }
        if (vVar instanceof SearchHistoryTwoColumnViewHolder) {
            SearchHistoryTwoColumnViewHolder searchHistoryTwoColumnViewHolder = (SearchHistoryTwoColumnViewHolder) vVar;
            if (obj != null) {
                searchHistoryTwoColumnViewHolder.mo68141a((List) obj);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
            }
        }
    }
}
