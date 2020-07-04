package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.view.Surface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.MusMediaSurface */
public class MusMediaSurface extends Surface {

    /* renamed from: a */
    private C32591k f84937a;

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        m105512a();
        super.finalize();
    }

    public void release() {
        super.release();
        m105512a();
    }

    /* renamed from: a */
    private synchronized void m105512a() {
        if (this.f84937a != null) {
            this.f84937a.mo83916a();
            this.f84937a = null;
        }
    }
}
