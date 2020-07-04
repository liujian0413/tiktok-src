package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.FavoriteEmptyViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33756g;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.e */
public final class C33734e extends C25647a<List<C33757h>> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new FavoriteEmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zh, viewGroup, false));
    }

    /* renamed from: a */
    private static boolean m108836a(List<C33757h> list, int i) {
        return list.get(i) instanceof C33756g;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108836a((List) obj, i);
    }
}
