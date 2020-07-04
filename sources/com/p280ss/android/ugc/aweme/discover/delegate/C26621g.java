package com.p280ss.android.ugc.aweme.discover.delegate;

import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.g */
public final class C26621g extends C25647a<List<DiscoverItemData>> {

    /* renamed from: a */
    public boolean f70201a;

    /* renamed from: b */
    private Fragment f70202b;

    public C26621g() {
    }

    public C26621g(Fragment fragment) {
        this.f70202b = fragment;
    }

    /* renamed from: b */
    public final void mo66519b(C1293v vVar) {
        super.mo66519b(vVar);
        ((RankingListCoverViewHolder) vVar).mo67997a();
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        if (this.f70201a) {
            return new RankingListCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1_, viewGroup, false), true, this.f70202b);
        }
        return new RankingListCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a19, viewGroup, false), false);
    }

    /* renamed from: a */
    private static boolean m87456a(List<DiscoverItemData> list, int i) {
        if (((DiscoverItemData) list.get(i)).getType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87456a((List) obj, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87455a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m87455a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        ((RankingListCoverViewHolder) vVar).mo67999a(((DiscoverItemData) list.get(i)).getRankingListCover());
    }
}
