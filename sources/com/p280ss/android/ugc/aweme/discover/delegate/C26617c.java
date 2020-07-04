package com.p280ss.android.ugc.aweme.discover.delegate;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.c */
public final class C26617c extends C25647a<List<DiscoverItemData>> {

    /* renamed from: a */
    public boolean f70197a = true;

    /* renamed from: b */
    public final void mo66519b(C1293v vVar) {
        ((CategoryViewHolder) vVar).mo67935c();
    }

    /* renamed from: a */
    public final void mo66517a(C1293v vVar) {
        if (this.f70197a) {
            ((CategoryViewHolder) vVar).mo67933b();
        }
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new CategoryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uo, viewGroup, false));
    }

    /* renamed from: a */
    private static boolean m87431a(List<DiscoverItemData> list, int i) {
        DiscoverItemData discoverItemData = (DiscoverItemData) list.get(i);
        if (discoverItemData.getType() == 5) {
            return discoverItemData.getCategoryOrAd().isCategory();
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87431a((List) obj, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        CategoryViewHolder categoryViewHolder = (CategoryViewHolder) vVar;
        categoryViewHolder.mo67931a(((DiscoverItemData) list.get(i)).getCategoryOrAd().category, i - C25352e.m83355c(list));
        categoryViewHolder.mo67934b(this.f70197a);
    }
}
