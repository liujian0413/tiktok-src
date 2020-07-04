package com.p280ss.android.ugc.playerkit.videoview;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.playerkit.videoview.e */
public final class C44958e implements C44961g {

    /* renamed from: a */
    public Set<C44963i> f115631a = new LinkedHashSet(1);

    /* renamed from: b */
    public boolean f115632b;

    /* renamed from: c */
    private final KeepSurfaceTextureView f115633c;

    /* renamed from: a */
    public final View mo107454a() {
        return this.f115633c;
    }

    /* renamed from: a */
    public final void mo107456a(boolean z) {
    }

    /* renamed from: e */
    public final void mo107461e() {
        this.f115632b = true;
    }

    /* renamed from: f */
    public final void mo107462f() {
        this.f115632b = false;
    }

    /* renamed from: g */
    public final int mo107463g() {
        return 0;
    }

    /* renamed from: h */
    public final boolean mo107464h() {
        return false;
    }

    /* renamed from: b */
    public final Surface mo107457b() {
        return this.f115633c.getSurface();
    }

    /* renamed from: c */
    public final boolean mo107459c() {
        return this.f115633c.f115577m;
    }

    /* renamed from: d */
    public final void mo107460d() {
        this.f115633c.mo107422e();
    }

    /* renamed from: i */
    private void m141850i() {
        this.f115633c.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                for (C44963i aA_ : C44958e.this.f115631a) {
                    aA_.aA_();
                }
                if (!C44958e.this.f115632b) {
                    return true;
                }
                return false;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C44958e.this.f115632b = false;
                for (C44963i a : C44958e.this.f115631a) {
                    a.mo63037a(i, i2);
                }
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                for (C44963i b : C44958e.this.f115631a) {
                    b.mo63039b(i, i2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo107455a(C44963i iVar) {
        this.f115631a.add(iVar);
    }

    /* renamed from: b */
    public final void mo107458b(C44963i iVar) {
        this.f115631a.remove(iVar);
    }

    public C44958e(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f115633c = keepSurfaceTextureView;
        m141850i();
    }

    public C44958e(ViewGroup viewGroup) {
        this.f115633c = new KeepSurfaceTextureView(viewGroup.getContext());
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(this.f115633c, 0, new LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(this.f115633c, 0, layoutParams);
        } else {
            viewGroup.addView(this.f115633c, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        m141850i();
    }
}
