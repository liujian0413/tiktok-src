package com.p280ss.android.vesdk.p1774b;

import android.graphics.SurfaceTexture;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.vesdk.p1774b.C45273b.C45274a;

/* renamed from: com.ss.android.vesdk.b.c */
public final class C45275c extends C45273b {

    /* renamed from: a */
    public int f116505a;

    /* renamed from: h */
    private SurfaceTexture f116506h;

    /* renamed from: a */
    public final SurfaceTexture mo108313a() {
        return this.f116506h;
    }

    /* renamed from: b */
    public final boolean mo108314b() {
        if (!super.mo108314b() || this.f116505a == 0 || this.f116506h == null) {
            return false;
        }
        return true;
    }

    public C45275c(TEFrameSizei tEFrameSizei, C45274a aVar, boolean z, int i, SurfaceTexture surfaceTexture) {
        super(ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES, tEFrameSizei, aVar, true, surfaceTexture);
        this.f116505a = i;
        this.f116506h = surfaceTexture;
    }
}
