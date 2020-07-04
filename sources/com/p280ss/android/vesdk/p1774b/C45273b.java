package com.p280ss.android.vesdk.p1774b;

import android.graphics.SurfaceTexture;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p919f.C20610b.C20612a;

/* renamed from: com.ss.android.vesdk.b.b */
public class C45273b {

    /* renamed from: b */
    public ETEPixelFormat f116499b;

    /* renamed from: c */
    public TEFrameSizei f116500c;

    /* renamed from: d */
    public C45274a f116501d;

    /* renamed from: e */
    public boolean f116502e;

    /* renamed from: f */
    public boolean f116503f;

    /* renamed from: g */
    SurfaceTexture f116504g;

    /* renamed from: com.ss.android.vesdk.b.b$a */
    public interface C45274a extends C20612a {
        /* renamed from: a */
        void mo108315a(TEFrameSizei tEFrameSizei);

        void onFrameCaptured(TECameraFrame tECameraFrame);
    }

    /* renamed from: a */
    public SurfaceTexture mo108313a() {
        return this.f116504g;
    }

    /* renamed from: b */
    public boolean mo108314b() {
        if (this.f116500c == null || this.f116500c.f55535a <= 0 || this.f116500c.f55536b <= 0 || this.f116501d == null) {
            return false;
        }
        return true;
    }

    public C45273b(ETEPixelFormat eTEPixelFormat, TEFrameSizei tEFrameSizei, C45274a aVar, boolean z, SurfaceTexture surfaceTexture) {
        this.f116499b = eTEPixelFormat;
        this.f116500c = tEFrameSizei;
        this.f116501d = aVar;
        this.f116502e = z;
        this.f116504g = surfaceTexture;
    }
}
