package com.p280ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d */
public final class C44945d implements C44961g {

    /* renamed from: a */
    public boolean f115613a;

    /* renamed from: b */
    public Set<C44963i> f115614b;

    /* renamed from: c */
    public int f115615c;

    /* renamed from: d */
    public int f115616d;

    /* renamed from: e */
    private final SurfaceView f115617e;

    /* renamed from: f */
    private boolean f115618f;

    /* renamed from: a */
    public final View mo107454a() {
        return this.f115617e;
    }

    /* renamed from: c */
    public final boolean mo107459c() {
        return this.f115613a;
    }

    /* renamed from: d */
    public final void mo107460d() {
    }

    /* renamed from: e */
    public final void mo107461e() {
    }

    /* renamed from: f */
    public final void mo107462f() {
    }

    /* renamed from: g */
    public final int mo107463g() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo107464h() {
        return this.f115618f;
    }

    /* renamed from: b */
    public final Surface mo107457b() {
        return this.f115617e.getHolder().getSurface();
    }

    /* renamed from: a */
    public final void mo107455a(C44963i iVar) {
        this.f115614b.add(iVar);
    }

    /* renamed from: b */
    public final void mo107458b(C44963i iVar) {
        this.f115614b.remove(iVar);
    }

    /* renamed from: a */
    public final void mo107456a(boolean z) {
        this.f115618f = z;
    }

    public C44945d(ViewGroup viewGroup) {
        this.f115617e = new SurfaceView(viewGroup.getContext());
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(this.f115617e, 0, new LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(this.f115617e, 0, layoutParams);
        } else {
            viewGroup.addView(this.f115617e, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f115614b = new LinkedHashSet();
        this.f115617e.getHolder().addCallback(new Callback() {
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C44945d.this.f115613a = false;
                for (C44963i aA_ : C44945d.this.f115614b) {
                    aA_.aA_();
                }
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C44945d.this.f115613a = true;
                for (C44963i a : C44945d.this.f115614b) {
                    a.mo63037a(C44945d.this.f115615c, C44945d.this.f115616d);
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C44945d.this.f115615c = i2;
                C44945d.this.f115616d = i3;
                for (C44963i b : C44945d.this.f115614b) {
                    b.mo63039b(i2, i3);
                }
            }
        });
    }
}
