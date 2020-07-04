package com.bytedance.android.live.core.utils.p158a;

import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.bytedance.android.live.core.utils.a.d */
final /* synthetic */ class C3348d implements Runnable {

    /* renamed from: a */
    private final Throwable f10162a;

    /* renamed from: b */
    private final ImageRequest f10163b;

    C3348d(Throwable th, ImageRequest imageRequest) {
        this.f10162a = th;
        this.f10163b = imageRequest;
    }

    public final void run() {
        C3347c.m12494a(this.f10162a, this.f10163b);
    }
}
