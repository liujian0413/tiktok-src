package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1594a;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.support.p029v7.widget.ViewStubCompat;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.shortvideo.model.Face;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.C40419c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.C40420d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui.FaceMattingAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui.FaceMattingLoadAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui.FaceMattingNormalAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.a.a */
public final class C40401a implements C40419c {

    /* renamed from: a */
    private RecyclerView f105009a;

    /* renamed from: b */
    private FaceMattingAdapter f105010b;

    /* renamed from: c */
    private FaceMattingLoadAdapter f105011c = new FaceMattingLoadAdapter();

    /* renamed from: d */
    private FaceMattingNormalAdapter f105012d;

    /* renamed from: a */
    public final void mo100400a() {
        this.f105009a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo100402b() {
        this.f105009a.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo100405e() {
        this.f105012d.mo100514b();
    }

    /* renamed from: d */
    public final void mo100404d() {
        this.f105012d.mo100511a();
        this.f105009a.mo5541b(0);
    }

    /* renamed from: c */
    public final void mo100403c() {
        if (this.f105012d.getItemCount() == 0) {
            mo100402b();
            C10761a.m31409e(this.f105009a.getContext(), (int) R.string.cnp).mo25750a();
            return;
        }
        this.f105011c.f105186a = false;
        this.f105010b.notifyItemRemoved(this.f105010b.getItemCount());
        this.f105009a.mo5541b(0);
    }

    /* renamed from: a */
    public final void mo100401a(List<Face> list) {
        this.f105012d.mo100513a(list);
        this.f105009a.mo5541b(0);
    }

    public C40401a(ViewStubCompat viewStubCompat, C40420d dVar) {
        this.f105009a = (RecyclerView) viewStubCompat.mo6224a();
        this.f105009a.setLayoutManager(new LinearLayoutManager(this.f105009a.getContext(), 0, false));
        this.f105012d = new FaceMattingNormalAdapter(dVar);
        this.f105010b = new FaceMattingAdapter(this.f105011c, this.f105012d);
        this.f105009a.setAdapter(this.f105010b);
        ((SimpleItemAnimator) this.f105009a.getItemAnimator()).f5112m = false;
    }
}
