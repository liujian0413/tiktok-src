package com.p280ss.android.ugc.aweme.p1052b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;

/* renamed from: com.ss.android.ugc.aweme.b.a */
public final class C23146a {

    /* renamed from: a */
    public static final C23146a f61091a = new C23146a();

    /* renamed from: b */
    private static final HandlerThread f61092b;

    /* renamed from: c */
    private static final Handler f61093c = new Handler(f61092b.getLooper());

    private C23146a() {
    }

    /* renamed from: a */
    public static Handler m76058a() {
        return f61093c;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("AsyncInflateHandler");
        f61092b = handlerThread;
        handlerThread.start();
        Process.setThreadPriority(f61092b.getThreadId(), -20);
    }
}
