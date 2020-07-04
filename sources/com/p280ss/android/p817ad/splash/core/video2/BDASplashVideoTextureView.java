package com.p280ss.android.p817ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

/* renamed from: com.ss.android.ad.splash.core.video2.BDASplashVideoTextureView */
public class BDASplashVideoTextureView extends TextureView {

    /* renamed from: a */
    public SurfaceTextureListener f51640a;

    /* renamed from: b */
    public boolean f51641b;

    /* renamed from: c */
    public boolean f51642c;

    /* renamed from: d */
    public boolean f51643d;

    /* renamed from: e */
    public boolean f51644e;

    /* renamed from: f */
    public Surface f51645f;

    /* renamed from: g */
    public SurfaceTexture f51646g;

    /* renamed from: h */
    private final String f51647h;

    /* renamed from: i */
    private Context f51648i;

    /* renamed from: j */
    private int f51649j;

    /* renamed from: k */
    private int f51650k;

    public Surface getSurface() {
        return this.f51645f;
    }

    /* renamed from: b */
    private void m62586b() {
        super.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (BDASplashVideoTextureView.this.f51640a != null) {
                    BDASplashVideoTextureView.this.f51640a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                if (BDASplashVideoTextureView.this.f51641b && !BDASplashVideoTextureView.this.f51642c && BDASplashVideoTextureView.this.f51645f != null) {
                    BDASplashVideoTextureView.this.f51645f.release();
                    BDASplashVideoTextureView.this.f51645f = null;
                    BDASplashVideoTextureView.this.f51646g = null;
                }
                BDASplashVideoTextureView.this.f51644e = false;
                if (BDASplashVideoTextureView.this.f51640a == null || !BDASplashVideoTextureView.this.f51640a.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    BDASplashVideoTextureView.this.mo50763a(false);
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (BDASplashVideoTextureView.this.f51640a != null) {
                    BDASplashVideoTextureView.this.f51640a.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (BDASplashVideoTextureView.this.f51641b) {
                    BDASplashVideoTextureView.this.f51643d = true;
                    if (BDASplashVideoTextureView.this.f51645f != null && (!BDASplashVideoTextureView.this.f51642c || !BDASplashVideoTextureView.this.f51645f.isValid())) {
                        BDASplashVideoTextureView.this.f51645f.release();
                        BDASplashVideoTextureView.this.f51645f = null;
                        BDASplashVideoTextureView.this.f51646g = null;
                    }
                    if (BDASplashVideoTextureView.this.f51645f == null) {
                        BDASplashVideoTextureView.this.f51645f = new Surface(surfaceTexture);
                        BDASplashVideoTextureView.this.f51646g = surfaceTexture;
                    } else {
                        try {
                            if (VERSION.SDK_INT >= 16) {
                                if (BDASplashVideoTextureView.this.f51646g != null) {
                                    BDASplashVideoTextureView.this.setSurfaceTexture(BDASplashVideoTextureView.this.f51646g);
                                }
                            } else if (BDASplashVideoTextureView.this.f51646g != null) {
                                BDASplashVideoTextureView.this.f51645f = new Surface(surfaceTexture);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    BDASplashVideoTextureView.this.f51644e = true;
                    BDASplashVideoTextureView.this.f51642c = true;
                } else {
                    BDASplashVideoTextureView.this.f51645f = new Surface(surfaceTexture);
                    BDASplashVideoTextureView.this.f51646g = surfaceTexture;
                }
                if (BDASplashVideoTextureView.this.f51640a != null) {
                    BDASplashVideoTextureView.this.f51640a.onSurfaceTextureAvailable(BDASplashVideoTextureView.this.f51646g, i, i2);
                }
            }
        });
    }

    /* renamed from: a */
    public final boolean mo50764a() {
        if (!this.f51641b || !this.f51643d) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f51640a = surfaceTextureListener;
    }

    public BDASplashVideoTextureView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m62585a(Context context) {
        this.f51648i = context;
        DisplayMetrics displayMetrics = this.f51648i.getResources().getDisplayMetrics();
        this.f51650k = displayMetrics.heightPixels;
        this.f51649j = displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public final void mo50763a(boolean z) {
        if (z && this.f51641b) {
            if (this.f51646g != null) {
                this.f51646g.release();
                this.f51646g = null;
            }
            if (this.f51645f != null) {
                this.f51645f.release();
                this.f51645f = null;
            }
        }
        this.f51642c = false;
        this.f51643d = false;
        this.f51645f = null;
        this.f51646g = null;
    }

    public BDASplashVideoTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51647h = "TextureVideoView";
        this.f51641b = true;
        m62585a(context);
        m62586b();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
