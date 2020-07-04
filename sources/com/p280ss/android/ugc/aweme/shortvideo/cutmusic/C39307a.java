package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39309c.C39310a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.C39300a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.C39301b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.a */
public final class C39307a implements C39300a, C39301b, C39309c {

    /* renamed from: a */
    private View f102097a;

    /* renamed from: b */
    private FrameLayout f102098b;

    /* renamed from: c */
    private MusicDragView f102099c;

    /* renamed from: d */
    private C39310a f102100d;

    /* renamed from: e */
    private AVMusicWaveBean f102101e;

    /* renamed from: a */
    public final boolean mo97863a() {
        if (this.f102097a == null) {
            return false;
        }
        this.f102098b.removeView(this.f102097a);
        this.f102097a = null;
        return true;
    }

    /* renamed from: a */
    public final void mo97862a(AVMusicWaveBean aVMusicWaveBean) {
        this.f102101e = aVMusicWaveBean;
    }

    /* renamed from: b */
    public final void mo97851b(int i) {
        this.f102100d.mo97871f_(i);
    }

    /* renamed from: a */
    public final void mo97860a(int i) {
        if (this.f102099c != null) {
            this.f102099c.mo97846a(i);
        }
    }

    /* renamed from: c */
    public final void mo97850c(int i) {
        mo97863a();
        this.f102100d.mo97872g_(i);
    }

    public C39307a(FrameLayout frameLayout, C39310a aVar) {
        this.f102098b = frameLayout;
        this.f102100d = aVar;
    }

    /* renamed from: a */
    public final void mo97861a(int i, int i2, int i3) {
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f102098b.getContext());
        if (C39805en.m127445a()) {
            i4 = R.layout.akx;
        } else {
            i4 = R.layout.hf;
        }
        this.f102097a = from.inflate(i4, this.f102098b, false);
        this.f102098b.addView(this.f102097a);
        this.f102099c = MusicDragView.m125578a(this.f102097a, i, i2, i3).mo97843a((C39300a) this).mo97844a((C39301b) this);
        if (this.f102101e != null) {
            this.f102099c.mo97847a(C39312e.m125622a(this.f102101e), i, i2);
        }
        this.f102097a.setAlpha(0.0f);
        this.f102097a.animate().alpha(1.0f).setDuration(200).start();
    }
}
