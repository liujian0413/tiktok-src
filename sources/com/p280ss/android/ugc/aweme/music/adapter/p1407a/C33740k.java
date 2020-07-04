package com.p280ss.android.ugc.aweme.music.adapter.p1407a;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
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

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.k */
public final class C33740k extends C25647a<List<C33757h>> {

    /* renamed from: a */
    public String f88097a;

    /* renamed from: b */
    public C33746f<C33770e> f88098b;

    /* renamed from: c */
    public int f88099c = -1;

    /* renamed from: d */
    private C33744d f88100d;

    /* renamed from: e */
    private int f88101e;

    /* renamed from: f */
    private Style f88102f;

    /* renamed from: g */
    private int f88103g;

    /* renamed from: a */
    public final C33740k mo86169a(int i) {
        this.f88101e = i;
        return this;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        MusicUnitViewHolder musicUnitViewHolder = new MusicUnitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x9, viewGroup, false), this.f88100d, this.f88103g, this.f88102f, this.f88098b);
        return musicUnitViewHolder;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m108868a((List) obj, i);
    }

    /* renamed from: a */
    private static boolean m108868a(List<C33757h> list, int i) {
        C33757h hVar = (C33757h) list.get(i);
        if (!(hVar instanceof MusicModel) || ((MusicModel) hVar).getDataType() != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<C33757h> list, int i, C1293v vVar, List<Object> list2) {
        boolean z;
        MusicUnitViewHolder musicUnitViewHolder = (MusicUnitViewHolder) vVar;
        MusicModel musicModel = (MusicModel) list.get(i);
        String str = this.f88097a;
        if (i == this.f88099c) {
            z = true;
        } else {
            z = false;
        }
        musicUnitViewHolder.mo86149a(musicModel, str, z, this.f88101e);
    }

    public C33740k(C33744d dVar, int i, Style style, C33746f<C33770e> fVar, int i2) {
        this.f88100d = dVar;
        this.f88101e = i;
        this.f88102f = style;
        this.f88098b = fVar;
        this.f88103g = i2;
    }
}
