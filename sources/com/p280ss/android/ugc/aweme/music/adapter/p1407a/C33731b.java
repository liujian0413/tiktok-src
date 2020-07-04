package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.music.adapter.ChallengeTitleViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33750a;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.b */
public final class C33731b extends C25647a<List<C33757h>> {

    /* renamed from: a */
    private Challenge f88091a;

    public C33731b(Challenge challenge) {
        this.f88091a = challenge;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new ChallengeTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ia, viewGroup, false));
    }

    /* renamed from: a */
    private static boolean m108822a(List<C33757h> list, int i) {
        return list.get(i) instanceof C33750a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108822a((List) obj, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        ((ChallengeTitleViewHolder) vVar).mo86125a(this.f88091a);
    }
}
