package com.p280ss.android.ttvecamera.p919f;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20604f;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p919f.C20610b.C20612a;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.f.c */
public class C20613c {

    /* renamed from: a */
    public static final String f55675a = "c";

    /* renamed from: b */
    public C20610b f55676b;

    /* renamed from: com.ss.android.ttvecamera.f.c$a */
    public static class C20614a {

        /* renamed from: a */
        public boolean f55677a = true;

        /* renamed from: b */
        public TEFrameSizei f55678b;

        /* renamed from: c */
        public C20612a f55679c;

        /* renamed from: d */
        public SurfaceTexture f55680d;

        /* renamed from: e */
        public int f55681e;

        /* renamed from: f */
        public int f55682f;

        /* renamed from: g */
        public ETEPixelFormat f55683g = ETEPixelFormat.PIXEL_FORMAT_Count;

        /* renamed from: a */
        public final boolean mo55765a(C20614a aVar) {
            if (aVar != null && this.f55677a == aVar.f55677a && this.f55678b.f55535a == aVar.f55678b.f55535a && this.f55678b.f55536b == aVar.f55678b.f55536b && this.f55679c == aVar.f55679c && this.f55680d == aVar.f55680d && this.f55681e == aVar.f55681e && this.f55682f == aVar.f55682f) {
                return true;
            }
            return false;
        }

        public C20614a(TEFrameSizei tEFrameSizei, C20612a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f55678b = tEFrameSizei;
            this.f55679c = aVar;
            this.f55680d = surfaceTexture;
            this.f55681e = i;
            this.f55677a = z;
            this.f55683g = ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }

        public C20614a(TEFrameSizei tEFrameSizei, C20612a aVar, boolean z, SurfaceTexture surfaceTexture, ETEPixelFormat eTEPixelFormat, int i) {
            this.f55678b = tEFrameSizei;
            this.f55679c = aVar;
            this.f55680d = surfaceTexture;
            this.f55677a = z;
            this.f55683g = eTEPixelFormat;
            this.f55682f = i;
        }
    }

    /* renamed from: b */
    public final int mo55759b() {
        if (this.f55676b != null) {
            return this.f55676b.mo55748c();
        }
        return 0;
    }

    /* renamed from: c */
    public final Surface mo55760c() {
        if (this.f55676b != null) {
            return this.f55676b.mo55744a();
        }
        return null;
    }

    /* renamed from: d */
    public final Surface[] mo55761d() {
        if (this.f55676b != null) {
            return this.f55676b.mo55753e();
        }
        return null;
    }

    /* renamed from: e */
    public final SurfaceTexture mo55762e() {
        if (this.f55676b != null) {
            return this.f55676b.mo55747b();
        }
        return null;
    }

    /* renamed from: f */
    public final TEFrameSizei mo55763f() {
        if (this.f55676b.f55672f) {
            return this.f55676b.f55670d;
        }
        return null;
    }

    /* renamed from: g */
    public final TEFrameSizei mo55764g() {
        if (!this.f55676b.f55672f) {
            return this.f55676b.f55670d;
        }
        return new TEFrameSizei(1080, 1920);
    }

    /* renamed from: a */
    public final void mo55757a() {
        if (this.f55676b != null) {
            this.f55676b.mo55752d();
            this.f55676b = null;
        }
    }

    /* renamed from: a */
    public final int mo55756a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (this.f55676b != null) {
            return this.f55676b.mo55743a(list, tEFrameSizei);
        }
        return -112;
    }

    /* renamed from: a */
    public final int mo55755a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        if (this.f55676b == null || this.f55676b == null) {
            return -112;
        }
        return this.f55676b.mo55750a(streamConfigurationMap, tEFrameSizei);
    }

    /* renamed from: a */
    public final void mo55758a(C20614a aVar, C20604f fVar) {
        if (this.f55676b != null) {
            this.f55676b.mo55752d();
        }
        if (aVar.f55683g == ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.f55676b = new C20619f(aVar, fVar);
        } else if (!(fVar instanceof C20599e) || VERSION.SDK_INT < 19) {
            this.f55676b = new C20608a(aVar, fVar);
        } else if (aVar.f55682f > 0) {
            this.f55676b = new C20617e(aVar, fVar);
        } else {
            this.f55676b = new C20615d(aVar, fVar);
        }
        fVar.f55654n = this;
    }
}
