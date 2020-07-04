package com.bytedance.android.live.core.utils;

import android.graphics.Bitmap;
import com.bytedance.android.live.core.utils.C3404s.C3406b;

/* renamed from: com.bytedance.android.live.core.utils.n */
final /* synthetic */ class C3398n implements Runnable {

    /* renamed from: a */
    private final C3406b f10204a;

    /* renamed from: b */
    private final Bitmap f10205b;

    C3398n(C3406b bVar, Bitmap bitmap) {
        this.f10204a = bVar;
        this.f10205b = bitmap;
    }

    public final void run() {
        this.f10204a.mo10311a(this.f10205b);
    }
}
