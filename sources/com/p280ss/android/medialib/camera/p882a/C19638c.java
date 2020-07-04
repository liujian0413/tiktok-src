package com.p280ss.android.medialib.camera.p882a;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.p280ss.android.medialib.camera.C19643b;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.medialib.camera.C19700k;
import com.p280ss.android.medialib.camera.IESCameraInterface;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19631c;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.medialib.presenter.C19763c;

/* renamed from: com.ss.android.medialib.camera.a.c */
public final class C19638c extends C19635a {

    /* renamed from: h */
    public C19700k f53157h = new C19700k();

    /* renamed from: i */
    private boolean f53158i;

    /* renamed from: b */
    public final void mo52266b() {
        this.f53157h.mo52400b();
    }

    /* renamed from: d */
    public final void mo52263d() {
        if (this.f53151b != null) {
            this.f53151b.mo52236f();
        }
    }

    /* renamed from: c */
    public final int mo52267c() {
        C19763c cVar = this.f53150a;
        if (this.f53151b == null || cVar == null) {
            return 0;
        }
        if (this.f53153d) {
            synchronized (this.f53154e) {
                boolean z = true;
                if (this.f53151b.mo52243m() != 1) {
                    z = false;
                }
                cVar.mo52879a(this.f53156g, z);
                this.f53153d = false;
            }
        }
        if (this.f53158i) {
            SurfaceTexture surfaceTexture = this.f53157h.f53430b;
            if (surfaceTexture != null) {
                try {
                    surfaceTexture.updateTexImage();
                    cVar.mo52874a(this.f53157h.mo52402d());
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo52265a() {
        int i;
        if (this.f53150a != null) {
            if (this.f53151b.mo52245o() == 17) {
                i = 0;
            } else {
                i = 1;
            }
            this.f53150a.mo52875a(i);
        }
        this.f53157h.mo52399a();
        this.f53151b.mo52230b(this.f53157h.f53430b);
        if (C19667g.m64797b().f53287k.f53266o != 4) {
            this.f53157h.f53431c = new OnFrameAvailableListener() {
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    if (C19638c.this.f53155f != C19638c.this.f53151b.mo52243m() || C19638c.this.f53156g != C19638c.this.f53151b.mo52237g()) {
                        synchronized (C19638c.this.f53154e) {
                            C19638c.this.f53155f = C19638c.this.f53151b.mo52243m();
                            C19638c.this.f53156g = C19638c.this.f53151b.mo52237g();
                            C19638c.this.f53153d = true;
                        }
                    }
                }
            };
        }
        if (this.f53150a != null) {
            this.f53150a.mo52880a(this.f53157h.f53430b);
        }
    }

    public C19638c(final IESCameraInterface iESCameraInterface) {
        super(iESCameraInterface);
        this.f53158i = iESCameraInterface instanceof C19643b;
        iESCameraInterface.mo52218a((C19631c) new C19631c() {
            /* renamed from: a */
            public final void mo52248a(int i, ImageFrame imageFrame) {
                if (!(C19667g.m64797b().f53287k.f53266o == 1 || (C19638c.this.f53155f == iESCameraInterface.mo52243m() && C19638c.this.f53156g == iESCameraInterface.mo52237g()))) {
                    synchronized (C19638c.this.f53154e) {
                        C19638c.this.f53155f = iESCameraInterface.mo52243m();
                        C19638c.this.f53156g = iESCameraInterface.mo52237g();
                        C19638c.this.f53153d = true;
                    }
                }
                if (!(C19638c.this.f53150a == null || iESCameraInterface == null)) {
                    if (C19667g.m64797b().f53287k.f53266o == 4) {
                        C19638c.this.f53150a.mo52878a(imageFrame, C19638c.this.f53157h.f53429a);
                    } else {
                        C19638c.this.f53150a.mo52877a(imageFrame);
                    }
                }
                if (C19638c.this.f53152c != null) {
                    C19638c.this.f53152c.mo52264a();
                }
            }
        });
    }
}
