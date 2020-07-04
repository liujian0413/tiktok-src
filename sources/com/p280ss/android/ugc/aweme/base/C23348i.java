package com.p280ss.android.ugc.aweme.base;

import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.ss.android.ugc.aweme.base.i */
final /* synthetic */ class C23348i implements Runnable {

    /* renamed from: a */
    private final ImageRequest f61433a;

    /* renamed from: b */
    private final Throwable f61434b;

    C23348i(ImageRequest imageRequest, Throwable th) {
        this.f61433a = imageRequest;
        this.f61434b = th;
    }

    public final void run() {
        C23347h.m76607a(this.f61433a, this.f61434b);
    }
}
