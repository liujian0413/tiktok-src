package com.p280ss.android.p817ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ad.splash.core.video2.BDASplashVideoView */
public class BDASplashVideoView extends FrameLayout implements SurfaceTextureListener, C19104e {

    /* renamed from: a */
    private BDASplashVideoTextureView f51652a;

    /* renamed from: b */
    private C19105f f51653b;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public Context getApplicationContext() {
        return getContext().getApplicationContext();
    }

    public Surface getSurface() {
        if (this.f51652a != null) {
            return this.f51652a.getSurface();
        }
        return null;
    }

    public void setVideoViewCallback(C19105f fVar) {
        this.f51653b = fVar;
    }

    public BDASplashVideoView(Context context) {
        super(context);
        m62589a(context);
    }

    public void setSurfaceLayoutParams(LayoutParams layoutParams) {
        if (layoutParams != null) {
            this.f51652a.setLayoutParams(layoutParams);
        }
    }

    public void setTextureViewOnTouchListener(OnTouchListener onTouchListener) {
        this.f51652a.setOnTouchListener(onTouchListener);
    }

    /* renamed from: a */
    public final void mo50773a(boolean z) {
        if (this.f51652a != null) {
            this.f51652a.mo50763a(false);
        }
    }

    public void setSurfaceViewVisibility(int i) {
        if (this.f51652a != null) {
            this.f51652a.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m62589a(Context context) {
        this.f51652a = new BDASplashVideoTextureView(context);
        this.f51652a.setSurfaceTextureListener(this);
        addView(this.f51652a, new FrameLayout.LayoutParams(-1, -1));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f51652a.setKeepScreenOn(false);
        if (!this.f51652a.mo50764a()) {
            return true;
        }
        return false;
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m62589a(context);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f51652a.setKeepScreenOn(true);
        if (this.f51653b != null) {
            this.f51653b.mo50786a(surfaceTexture, i, i2);
        }
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62589a(context);
    }
}
