package com.p280ss.android.ugc.aweme.discover.delegate;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.BaseCategoryNewViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.FallbackDelegate */
public final class FallbackDelegate extends C25647a<List<DiscoverItemData>> {

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.FallbackDelegate$FallbackViewHolder */
    public class FallbackViewHolder extends BaseCategoryNewViewHolder {
        /* renamed from: b */
        public final void mo68312b(int i) {
            mo67910a(i);
        }

        public FallbackViewHolder(View view, RecyclerView recyclerView) {
            super(view, recyclerView);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return false;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new FallbackViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uq, viewGroup, false), (RecyclerView) viewGroup);
    }

    /* renamed from: a */
    private static void m87411a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        ((FallbackViewHolder) vVar).mo68312b(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87411a((List) obj, i, vVar, list);
    }
}
