package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.C33742b;
import com.p280ss.android.ugc.aweme.music.adapter.ShowLessViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33759j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.l */
public final class C33741l extends C25647a<List<C33757h>> {

    /* renamed from: a */
    private C33742b f88104a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
    }

    public C33741l(C33742b bVar) {
        this.f88104a = bVar;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new ShowLessViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zo, viewGroup, false), this.f88104a);
    }

    /* renamed from: a */
    private static boolean m108873a(List<C33757h> list, int i) {
        return list.get(i) instanceof C33759j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108873a((List) obj, i);
    }
}
