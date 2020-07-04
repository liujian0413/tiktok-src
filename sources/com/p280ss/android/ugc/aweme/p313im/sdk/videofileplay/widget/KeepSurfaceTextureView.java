package com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.widget;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.widget.KeepSurfaceTextureView */
public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a */
    public SurfaceTexture f83481a;

    /* renamed from: b */
    public Surface f83482b;

    /* renamed from: c */
    public boolean f83483c;

    /* renamed from: d */
    public SurfaceTextureListener f83484d;

    public Surface getSurface() {
        return this.f83482b;
    }

    /* renamed from: b */
    private void m103803b() {
        super.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f83484d != null) {
                    KeepSurfaceTextureView.this.f83484d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z = false;
                KeepSurfaceTextureView.this.f83483c = false;
                if (KeepSurfaceTextureView.this.f83484d != null && KeepSurfaceTextureView.this.f83484d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = true;
                }
                if (z) {
                    KeepSurfaceTextureView.this.mo82794a();
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (KeepSurfaceTextureView.this.f83484d != null) {
                    KeepSurfaceTextureView.this.f83484d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                KeepSurfaceTextureView.this.mo82794a();
                if (KeepSurfaceTextureView.this.f83481a == null) {
                    KeepSurfaceTextureView.this.f83481a = surfaceTexture;
                    KeepSurfaceTextureView.this.f83482b = new Surface(KeepSurfaceTextureView.this.f83481a);
                }
                KeepSurfaceTextureView.this.f83483c = true;
                if (KeepSurfaceTextureView.this.f83484d != null) {
                    KeepSurfaceTextureView.this.f83484d.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f83481a, i, i2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo82794a() {
        if (this.f83481a != null) {
            this.f83481a.release();
            this.f83481a = null;
        }
        if (this.f83482b != null) {
            this.f83482b.release();
            this.f83482b = null;
        }
    }

    /* renamed from: c */
    private void m103804c() {
        if (this.f83481a == null || this.f83482b == null || !this.f83482b.isValid()) {
            mo82794a();
        } else if (!this.f83483c) {
            if (this.f83481a != getSurfaceTexture()) {
                setSurfaceTexture(this.f83481a);
                this.f83483c = true;
                if (this.f83484d != null) {
                    this.f83484d.onSurfaceTextureAvailable(this.f83481a, getWidth(), getHeight());
                }
            } else {
                mo82794a();
            }
        }
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f83484d = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            m103804c();
        }
    }

    public void setClipBorder(final float f) {
        if (VERSION.SDK_INT > 20) {
            setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), f);
                }
            });
            setClipToOutline(true);
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103803b();
    }
}
