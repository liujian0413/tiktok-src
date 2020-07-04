package com.p280ss.android.ugc.aweme.discover.delegate;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.e */
public final class C26619e extends C25647a<List<DiscoverItemData>> {
    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return HotVideoViewHolder.m86871a(viewGroup);
    }

    /* renamed from: a */
    private static boolean m87445a(List<DiscoverItemData> list, int i) {
        if (((DiscoverItemData) list.get(i)).getType() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87445a((List) obj, i);
    }

    /* renamed from: a */
    private static void m87444a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        ((HotVideoViewHolder) vVar).mo67977a(((DiscoverItemData) list.get(i)).getHotSearchVideos());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87444a((List) obj, i, vVar, list);
    }
}
