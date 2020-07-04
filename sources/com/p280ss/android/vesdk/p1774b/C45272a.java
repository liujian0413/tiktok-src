package com.p280ss.android.vesdk.p1774b;

import android.graphics.SurfaceTexture;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.vesdk.p1774b.C45273b.C45274a;

/* renamed from: com.ss.android.vesdk.b.a */
public final class C45272a extends C45273b {

    /* renamed from: a */
    public int f116497a;

    /* renamed from: h */
    private SurfaceTexture f116498h;

    /* renamed from: a */
    public final SurfaceTexture mo108313a() {
        return this.f116498h;
    }

    /* renamed from: b */
    public final boolean mo108314b() {
        return super.mo108314b();
    }

    public C45272a(TEFrameSizei tEFrameSizei, C45274a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
        super(ETEPixelFormat.PIXEL_FORMAT_BUFFER, tEFrameSizei, aVar, true, surfaceTexture);
        this.f116498h = surfaceTexture;
        this.f116497a = i;
    }
}
