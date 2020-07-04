package com.p280ss.android.p817ad.splash.core.video;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video.g */
public final class C19095g implements Callback {

    /* renamed from: a */
    private WeakReference<Callback> f51639a;

    /* renamed from: a */
    public final Callback mo50759a() {
        return (Callback) this.f51639a.get();
    }

    public C19095g(Callback callback) {
        this.f51639a = new WeakReference<>(callback);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Callback callback = (Callback) this.f51639a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Callback callback = (Callback) this.f51639a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Callback callback = (Callback) this.f51639a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
