package com.p280ss.android.vesdk.p1777e;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

/* renamed from: com.ss.android.vesdk.e.b */
public final class C45309b extends C45310c implements SurfaceTextureListener {

    /* renamed from: a */
    public TextureView f116619a;

    /* renamed from: b */
    public SurfaceTextureListener f116620b;

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f116620b != null) {
            this.f116620b.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z;
        if (this.f116620b != null) {
            z = this.f116620b.onSurfaceTextureDestroyed(surfaceTexture);
        } else {
            z = false;
        }
        if (this.f116624e != null) {
            this.f116624e.release();
            this.f116624e = null;
        }
        return z;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f116620b != null) {
            this.f116620b.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        mo108236a(this.f116624e, 0, i, i2);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f116620b != null) {
            this.f116620b.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        this.f116622c = i;
        this.f116623d = i2;
        mo108235a(new Surface(surfaceTexture));
    }
}
