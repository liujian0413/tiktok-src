package com.p280ss.android.ttvecamera.p919f;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20604f;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p919f.C20613c.C20614a;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.f.f */
public final class C20619f extends C20610b {

    /* renamed from: a */
    SurfaceTexture f55692a;

    /* renamed from: h */
    Surface f55693h;

    /* renamed from: i */
    float[] f55694i = new float[16];

    /* renamed from: j */
    int f55695j;

    /* renamed from: a */
    public final Surface mo55744a() {
        return this.f55693h;
    }

    /* renamed from: b */
    public final SurfaceTexture mo55747b() {
        return this.f55692a;
    }

    /* renamed from: c */
    public final int mo55748c() {
        return 1;
    }

    /* renamed from: d */
    public final void mo55752d() {
        super.mo55752d();
        if (this.f55693h != null) {
            this.f55693h.release();
            this.f55693h = null;
        }
    }

    /* renamed from: a */
    private void m68331a(OnFrameAvailableListener onFrameAvailableListener) {
        if (VERSION.SDK_INT >= 21) {
            this.f55692a.setOnFrameAvailableListener(onFrameAvailableListener, this.f55671e.f55651k);
        } else {
            this.f55692a.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    /* renamed from: a */
    public final int mo55750a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return mo55743a(m68298a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    public C20619f(C20614a aVar, C20604f fVar) {
        super(aVar, fVar);
        this.f55692a = aVar.f55680d;
        this.f55695j = aVar.f55681e;
        this.f55693h = new Surface(this.f55692a);
    }

    /* renamed from: a */
    public final int mo55743a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f55670d = C20642j.m68410a(list, this.f55670d);
        }
        this.f55692a.setDefaultBufferSize(this.f55670d.f55535a, this.f55670d.f55536b);
        m68331a(new OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C20619f.this.f55671e != null) {
                    surfaceTexture.getTransformMatrix(C20619f.this.f55694i);
                    TECameraFrame tECameraFrame = new TECameraFrame(C20619f.this.f55670d.f55535a, C20619f.this.f55670d.f55536b, surfaceTexture.getTimestamp());
                    tECameraFrame.mo55504a(C20619f.this.f55695j, C20619f.this.f55671e.mo55739r(), C20619f.this.f55694i, C20619f.this.f55669c, C20619f.this.f55671e.f55655o);
                    C20619f.this.mo55751a(tECameraFrame);
                }
            }
        });
        return 0;
    }
}
