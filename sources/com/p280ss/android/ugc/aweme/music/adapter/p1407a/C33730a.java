package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.music.adapter.C33744d;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.p1408b.C33770e;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.a */
public final class C33730a extends C25647a<List<C33757h>> {

    /* renamed from: a */
    public String f88083a;

    /* renamed from: b */
    public C33746f<C33770e> f88084b;

    /* renamed from: c */
    public int f88085c = -1;

    /* renamed from: d */
    private MusicUnitViewHolder f88086d;

    /* renamed from: e */
    private C33744d f88087e;

    /* renamed from: f */
    private int f88088f;

    /* renamed from: g */
    private Style f88089g;

    /* renamed from: h */
    private int f88090h;

    /* renamed from: a */
    public final C33730a mo86167a(int i) {
        this.f88088f = i;
        return this;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        MusicUnitViewHolder musicUnitViewHolder = new MusicUnitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x9, viewGroup, false), this.f88087e, this.f88090h, this.f88089g, this.f88084b);
        return musicUnitViewHolder;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108816a((List) obj, i);
    }

    /* renamed from: a */
    private static boolean m108816a(List<C33757h> list, int i) {
        C33757h hVar = (C33757h) list.get(i);
        if (!(hVar instanceof MusicModel) || ((MusicModel) hVar).getDataType() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        boolean z;
        this.f88086d = (MusicUnitViewHolder) vVar;
        MusicUnitViewHolder musicUnitViewHolder = this.f88086d;
        MusicModel musicModel = (MusicModel) list.get(i);
        String str = this.f88083a;
        if (this.f88085c == i) {
            z = true;
        } else {
            z = false;
        }
        musicUnitViewHolder.mo86149a(musicModel, str, z, this.f88088f);
        C6907h.m21524a("show_music", (Map) C22984d.m75611a().mo59973a("music_id", ((MusicModel) list.get(i)).getMusicId()).mo59973a("enter_from", "challenge_bonding").f60753a);
    }

    public C33730a(C33744d dVar, int i, Style style, C33746f<C33770e> fVar, int i2) {
        this.f88087e = dVar;
        this.f88088f = i;
        this.f88089g = style;
        this.f88084b = fVar;
        this.f88090h = i2;
    }
}
