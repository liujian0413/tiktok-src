package com.p280ss.android.ttvecamera.p919f;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20604f;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p919f.C20613c.C20614a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.f.b */
public abstract class C20610b {

    /* renamed from: a */
    private C20612a f55667a = new C20612a() {
        public final void onFrameCaptured(TECameraFrame tECameraFrame) {
        }
    };

    /* renamed from: b */
    C20612a f55668b;

    /* renamed from: c */
    public ETEPixelFormat f55669c;

    /* renamed from: d */
    public TEFrameSizei f55670d = new TEFrameSizei();

    /* renamed from: e */
    C20604f f55671e;

    /* renamed from: f */
    public boolean f55672f = true;

    /* renamed from: g */
    public int f55673g = 1;

    /* renamed from: com.ss.android.ttvecamera.f.b$a */
    public interface C20612a {
        void onFrameCaptured(TECameraFrame tECameraFrame);
    }

    /* renamed from: a */
    public int mo55750a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo55743a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract Surface mo55744a();

    /* renamed from: b */
    public abstract SurfaceTexture mo55747b();

    /* renamed from: c */
    public abstract int mo55748c();

    /* renamed from: e */
    public Surface[] mo55753e() {
        return null;
    }

    /* renamed from: d */
    public void mo55752d() {
        this.f55668b = this.f55667a;
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m68298a(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo55751a(TECameraFrame tECameraFrame) {
        if (this.f55668b != null) {
            this.f55668b.onFrameCaptured(tECameraFrame);
        }
    }

    public C20610b(C20614a aVar, C20604f fVar) {
        this.f55669c = aVar.f55683g;
        this.f55668b = aVar.f55679c;
        this.f55670d = aVar.f55678b;
        this.f55671e = fVar;
        this.f55672f = aVar.f55677a;
        this.f55673g = aVar.f55682f;
    }
}
