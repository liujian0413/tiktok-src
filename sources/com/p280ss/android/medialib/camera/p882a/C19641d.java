package com.p280ss.android.medialib.camera.p882a;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.p280ss.android.medialib.camera.C19700k;
import com.p280ss.android.medialib.camera.IESCameraInterface;
import com.p280ss.android.medialib.common.C19702a;
import com.p280ss.android.medialib.presenter.C19763c;
import com.p280ss.android.vesdk.C45372t;

/* renamed from: com.ss.android.medialib.camera.a.d */
public class C19641d extends C19635a {

    /* renamed from: h */
    public static final String f53162h = "d";

    /* renamed from: i */
    public C19700k f53163i = new C19700k();

    /* renamed from: b */
    public final void mo52266b() {
        this.f53163i.mo52400b();
    }

    /* renamed from: d */
    public final void mo52263d() {
        if (this.f53151b != null) {
            this.f53151b.mo52216a(this.f53163i.f53430b);
        } else {
            C45372t.m143409d(f53162h, "startPreview: camera is null!");
        }
    }

    /* renamed from: a */
    public final void mo52265a() {
        this.f53163i.mo52399a();
        C19702a.m64958a("CreateTexture");
        this.f53163i.f53431c = new OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C19641d.this.f53150a != null) {
                    C19641d.this.f53150a.mo52876a(C19641d.this.f53163i.f53429a, C19641d.this.f53163i.f53432d);
                } else {
                    C45372t.m143407c(C19641d.f53162h, "onFrameAvailable: presenter is null!");
                }
                if (!(C19641d.this.f53155f == C19641d.this.f53151b.mo52243m() && C19641d.this.f53156g == C19641d.this.f53151b.mo52237g())) {
                    synchronized (C19641d.this.f53154e) {
                        C19641d.this.f53155f = C19641d.this.f53151b.mo52243m();
                        C19641d.this.f53156g = C19641d.this.f53151b.mo52237g();
                        C19641d.this.f53153d = true;
                    }
                }
                if (C19641d.this.f53152c != null) {
                    C19641d.this.f53152c.mo52264a();
                }
            }
        };
        if (this.f53150a != null) {
            this.f53150a.mo52880a(this.f53163i.f53430b);
        } else {
            C45372t.m143409d(f53162h, "onOpenGLCreate: presenter is null!");
        }
    }

    /* renamed from: c */
    public final int mo52267c() {
        C19763c cVar = this.f53150a;
        if (this.f53163i.f53430b == null || cVar == null) {
            C45372t.m143409d(f53162h, "SurfaceTexture is null");
            return -1;
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
        try {
            this.f53163i.mo52401c();
            double d = this.f53163i.mo52402d();
            this.f53150a.mo52874a(d);
            cVar.mo52874a(d);
            return 0;
        } catch (RuntimeException e) {
            C45372t.m143409d(f53162h, e.getMessage());
            return -2;
        }
    }

    public C19641d(IESCameraInterface iESCameraInterface) {
        super(iESCameraInterface);
    }
}
