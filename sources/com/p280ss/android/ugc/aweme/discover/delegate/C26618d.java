package com.p280ss.android.ugc.aweme.discover.delegate;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryNewViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.d */
public final class C26618d extends C25647a<List<DiscoverItemData>> {

    /* renamed from: a */
    public boolean f70198a = true;

    /* renamed from: a */
    public final void mo66517a(C1293v vVar) {
        super.mo66517a(vVar);
        if (this.f70198a) {
            ((CategoryNewViewHolder) vVar).mo67926a();
        }
    }

    /* renamed from: b */
    public final void mo66519b(C1293v vVar) {
        super.mo66519b(vVar);
        ((CategoryNewViewHolder) vVar).mo67930b();
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new CategoryNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uq, viewGroup, false), (RecyclerView) viewGroup);
    }

    /* renamed from: a */
    private static boolean m87438a(List<DiscoverItemData> list, int i) {
        DiscoverItemData discoverItemData = (DiscoverItemData) list.get(i);
        if (discoverItemData.getType() == 5) {
            return discoverItemData.getCategoryOrAd().isCategory();
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87438a((List) obj, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87437a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m87437a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        CategoryOrAd categoryOrAd = ((DiscoverItemData) list.get(i)).getCategoryOrAd();
        CategoryNewViewHolder categoryNewViewHolder = (CategoryNewViewHolder) vVar;
        categoryNewViewHolder.mo67911a(categoryOrAd.category, i);
        if (categoryOrAd.category != null && categoryOrAd.category.isAd()) {
            categoryNewViewHolder.f69449c = C25352e.m83355c(list);
        }
    }
}
