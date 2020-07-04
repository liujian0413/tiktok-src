package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.t */
public final class C32604t extends C32584e {

    /* renamed from: b */
    private Surface f85016b;

    /* renamed from: c */
    private boolean f85017c;

    public C32604t(C32583d dVar, SurfaceTexture surfaceTexture) {
        super(dVar);
        mo83888a((Object) surfaceTexture);
    }

    public C32604t(C32583d dVar, Surface surface, boolean z) {
        super(dVar);
        mo83888a((Object) surface);
        this.f85016b = surface;
        this.f85017c = true;
    }
}
