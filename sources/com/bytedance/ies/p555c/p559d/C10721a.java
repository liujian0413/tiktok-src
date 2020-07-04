package com.bytedance.ies.p555c.p559d;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.bytedance.ies.c.d.a */
public final class C10721a {

    /* renamed from: a */
    private static C10721a f28664a = new C10721a();

    /* renamed from: b */
    private Handler f28665b;

    /* renamed from: a */
    public static C10721a m31298a() {
        return f28664a;
    }

    private C10721a() {
        HandlerThread handlerThread = new HandlerThread("web-offline-io");
        handlerThread.setPriority(2);
        handlerThread.start();
        this.f28665b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final void mo25614a(Runnable runnable) {
        this.f28665b.post(runnable);
    }
}
