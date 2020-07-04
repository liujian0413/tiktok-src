package com.p280ss.android.ugc.aweme.photomovie.edit.player;

import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.b */
public final class C34919b implements C34856c {

    /* renamed from: a */
    public C34860g f91083a;

    /* renamed from: b */
    private FrameLayout f91084b;

    /* renamed from: c */
    private View f91085c;

    /* renamed from: d */
    private View f91086d;

    /* renamed from: e */
    private View f91087e;

    /* renamed from: f */
    private int f91088f;

    /* renamed from: g */
    private int f91089g;

    /* renamed from: h */
    private float f91090h;

    /* renamed from: i */
    private int f91091i = C39805en.m127450c(this.f91085c.getContext());

    /* renamed from: b */
    public final void mo74847b() {
    }

    /* renamed from: c */
    public final void mo74769c() {
    }

    /* renamed from: a */
    public final void mo74767a() {
        if (this.f91086d != null) {
            this.f91086d.setVisibility(4);
        }
        if (this.f91087e != null) {
            this.f91087e.setVisibility(4);
        }
        if (this.f91083a != null) {
            this.f91083a.mo74767a();
        }
    }

    /* renamed from: d */
    public final void mo74768d() {
        if (this.f91086d != null) {
            this.f91086d.setVisibility(0);
        }
        if (this.f91087e != null) {
            this.f91087e.setVisibility(0);
        }
        if (this.f91083a != null) {
            this.f91083a.mo74768d();
        }
    }

    /* renamed from: a */
    private void m112552a(int i) {
        if (this.f91088f == 0) {
            this.f91088f = this.f91085c.getHeight();
            this.f91089g = this.f91085c.getWidth();
            this.f91085c.setPivotX((float) (this.f91089g / 2));
            this.f91090h = (((float) ((this.f91088f - i) - this.f91091i)) * 1.0f) / ((float) this.f91088f);
            this.f91085c.setPivotY(((float) this.f91091i) / (1.0f - this.f91090h));
        }
    }

    C34919b(FrameLayout frameLayout, View view) {
        this.f91084b = frameLayout;
        this.f91085c = view;
        this.f91086d = frameLayout.findViewById(R.id.cbc);
        this.f91087e = frameLayout.findViewById(R.id.cbb);
    }

    /* renamed from: a */
    public final void mo74844a(float f, int i, int i2) {
        m112552a(i2);
        m112553c(f, i, i2);
    }

    /* renamed from: b */
    public final void mo74848b(float f, int i, int i2) {
        m112552a(i2);
        m112553c(1.0f - f, i, i2);
    }

    /* renamed from: c */
    private void m112553c(float f, int i, int i2) {
        this.f91085c.setScaleY(((((float) this.f91088f) - (((float) (i2 + this.f91091i)) * f)) * 1.0f) / ((float) this.f91088f));
        this.f91085c.setScaleX(((((float) this.f91089g) - ((((float) this.f91089g) * (1.0f - this.f91090h)) * f)) * 1.0f) / ((float) this.f91089g));
    }
}
