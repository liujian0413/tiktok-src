package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27699d;
import com.p280ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder;
import com.p280ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder.C27820a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.CollectMediumAdapter */
public final class CollectMediumAdapter extends BaseAdapter<C27699d> {
    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return C27820a.m91227a(viewGroup);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar != null) {
            MediumCollectViewHolder mediumCollectViewHolder = (MediumCollectViewHolder) vVar;
            Object obj = this.f67539l.get(i);
            C7573i.m23582a(obj, "mItems[position]");
            mediumCollectViewHolder.mo71304a((C27699d) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder");
    }
}
