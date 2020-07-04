package com.p280ss.android.ugc.playerkit.videoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.p280ss.android.ugc.playerkit.model.C44917a;

/* renamed from: com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView */
public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: k */
    public SurfaceTexture f115575k;

    /* renamed from: l */
    public Surface f115576l;

    /* renamed from: m */
    public boolean f115577m;

    /* renamed from: n */
    public SurfaceTextureListener f115578n;

    public Surface getSurface() {
        return this.f115576l;
    }

    /* renamed from: f */
    public final void mo107423f() {
        m141740a(true);
    }

    /* renamed from: a */
    private void mo89630a() {
        super.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f115578n != null) {
                    KeepSurfaceTextureView.this.f115578n.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                boolean z2 = false;
                KeepSurfaceTextureView.this.f115577m = false;
                if (KeepSurfaceTextureView.this.f115578n == null || !KeepSurfaceTextureView.this.f115578n.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && !KeepSurfaceTextureView.m141741g()) {
                    z2 = true;
                }
                if (z2) {
                    KeepSurfaceTextureView.this.mo107423f();
                }
                return z2;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (KeepSurfaceTextureView.this.f115578n != null) {
                    KeepSurfaceTextureView.this.f115578n.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                KeepSurfaceTextureView.this.mo107423f();
                if (KeepSurfaceTextureView.this.f115575k == null) {
                    KeepSurfaceTextureView.this.f115575k = surfaceTexture;
                    KeepSurfaceTextureView.this.f115576l = new Surface(KeepSurfaceTextureView.this.f115575k);
                }
                KeepSurfaceTextureView.this.f115577m = true;
                if (KeepSurfaceTextureView.this.f115578n != null) {
                    KeepSurfaceTextureView.this.f115578n.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f115575k, i, i2);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m141741g()) {
            mo107423f();
        }
    }

    /* renamed from: g */
    public static boolean m141741g() {
        if (VERSION.SDK_INT > 19 || !C44917a.m141692r().mo105111n()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo107422e() {
        if (this.f115575k == null || this.f115576l == null || !this.f115576l.isValid()) {
            m141740a(!m141741g());
        } else if (!this.f115577m) {
            if (this.f115575k != getSurfaceTexture()) {
                setSurfaceTexture(this.f115575k);
                this.f115577m = true;
                if (this.f115578n != null) {
                    this.f115578n.onSurfaceTextureAvailable(this.f115575k, getWidth(), getHeight());
                }
            } else {
                m141740a(!m141741g());
            }
        }
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f115578n = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            mo107422e();
        }
    }

    /* renamed from: a */
    private void m141740a(boolean z) {
        if (this.f115575k != null && z) {
            this.f115575k.release();
            this.f115575k = null;
        }
        if (this.f115576l != null) {
            this.f115576l.release();
            this.f115576l = null;
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo89630a();
    }
}
