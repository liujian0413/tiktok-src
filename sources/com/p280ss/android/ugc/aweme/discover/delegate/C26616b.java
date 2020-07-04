package com.p280ss.android.ugc.aweme.discover.delegate;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adpater.CategoryAdViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.b */
public final class C26616b extends C25647a<List<DiscoverItemData>> {
    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new CategoryAdViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tl, viewGroup, false), (RecyclerView) viewGroup);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87426a((List) obj, i);
    }

    /* renamed from: a */
    private static boolean m87426a(List<DiscoverItemData> list, int i) {
        DiscoverItemData discoverItemData = (DiscoverItemData) list.get(i);
        if (discoverItemData.getType() == 5) {
            return discoverItemData.getCategoryOrAd().isAd();
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87425a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m87425a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        CategoryOrAd categoryOrAd = ((DiscoverItemData) list.get(i)).getCategoryOrAd();
        CategoryAdViewHolder categoryAdViewHolder = (CategoryAdViewHolder) vVar;
        categoryAdViewHolder.mo68161a(categoryOrAd.f70737ad, i);
        if (categoryOrAd.f70737ad != null) {
            categoryAdViewHolder.mo68162b(C25352e.m83355c(list));
        }
    }
}
