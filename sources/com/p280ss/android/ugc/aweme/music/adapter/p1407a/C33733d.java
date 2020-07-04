package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.C33729a;
import com.p280ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33758i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.d */
public final class C33733d extends C25647a<List<C33757h>> {

    /* renamed from: a */
    private C33729a f88093a;

    public C33733d(C33729a aVar) {
        this.f88093a = aVar;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new MusicCollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zg, viewGroup, false), this.f88093a);
    }

    /* renamed from: a */
    private static boolean m108832a(List<C33757h> list, int i) {
        return list.get(i) instanceof C33758i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108832a((List) obj, i);
    }

    /* renamed from: a */
    private static void m108831a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        ((MusicCollectionViewHolder) vVar).mo86126a(((C33758i) list.get(i)).f88108a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m108831a((List) obj, i, vVar, list);
    }
}
