package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.MusicTabViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33760k;
import com.p280ss.android.ugc.aweme.music.p1408b.C33773h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.j */
public final class C33739j extends C25647a<List<C33757h>> {

    /* renamed from: a */
    private int f88095a;

    /* renamed from: b */
    private boolean f88096b;

    public C33739j() {
    }

    public C33739j(boolean z) {
        this.f88096b = z;
    }

    /* renamed from: b */
    public final void mo66520b(RecyclerView recyclerView) {
        super.mo66520b(recyclerView);
        C42961az.m136383d(this);
    }

    @C7709l
    public final void onSwitchMusicFragmentEvent(C33773h hVar) {
        this.f88095a = hVar.f88131a;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        return new MusicTabViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zi, viewGroup, false), this.f88096b);
    }

    /* renamed from: a */
    public final void mo66518a(RecyclerView recyclerView) {
        super.mo66518a(recyclerView);
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    private static boolean m108861a(List<C33757h> list, int i) {
        return list.get(i) instanceof C33760k;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108861a((List) obj, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        ((MusicTabViewHolder) vVar).mo86146a(this.f88095a);
    }
}
