package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.C33729a;
import com.p280ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.c */
public final class C33732c extends C25647a<List<C33757h>> {

    /* renamed from: a */
    private C33729a f88092a;

    public C33732c(C33729a aVar) {
        this.f88092a = aVar;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new MusicCollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zg, viewGroup, false), this.f88092a);
    }

    /* renamed from: a */
    private static boolean m108827a(List<C33757h> list, int i) {
        return list.get(i) instanceof MusicCollectionItem;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108827a((List) obj, i);
    }

    /* renamed from: a */
    private static void m108826a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        ((MusicCollectionViewHolder) vVar).mo86127a((MusicCollectionItem) list.get(i));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m108826a((List) obj, i, vVar, list);
    }
}
