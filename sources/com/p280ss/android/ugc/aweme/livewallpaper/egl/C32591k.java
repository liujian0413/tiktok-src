package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.k */
public final class C32591k extends SurfaceTexture {

    /* renamed from: a */
    public C32587h f84976a;

    /* renamed from: b */
    public boolean f84977b = true;

    /* renamed from: c */
    public boolean f84978c = false;

    public final void releaseTexImage() {
        super.releaseTexImage();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        mo83916a();
        super.finalize();
    }

    public final void release() {
        mo83916a();
        super.release();
    }

    /* renamed from: a */
    public final void mo83916a() {
        if (!this.f84978c) {
            this.f84976a.mo83896b();
            this.f84978c = true;
        }
    }

    public C32591k(C32587h hVar) {
        super(hVar.mo83897c());
        hVar.mo83895a();
        this.f84976a = hVar;
        this.f84976a.mo83898d();
    }
}
