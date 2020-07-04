package com.p280ss.android.vesdk.p1777e;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

/* renamed from: com.ss.android.vesdk.e.a */
public final class C45308a extends C45310c implements Callback {

    /* renamed from: a */
    public SurfaceView f116618a;

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        mo108264b(surfaceHolder.getSurface());
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f116618a != null) {
            this.f116622c = this.f116618a.getWidth();
            this.f116623d = this.f116618a.getHeight();
        }
        mo108235a(surfaceHolder.getSurface());
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mo108236a(surfaceHolder.getSurface(), i, i2, i3);
    }
}
