package com.bytedance.ies.util.thread;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.bytedance.ies.util.thread.a */
public final class C11081a {

    /* renamed from: a */
    public static final Executor f30132a = new ScheduledThreadPoolExecutor(4);

    /* renamed from: b */
    public static C11081a f30133b;

    /* renamed from: c */
    private static Handler f30134c;

    /* renamed from: d */
    private boolean f30135d;

    /* renamed from: e */
    private Executor f30136e;

    /* renamed from: com.bytedance.ies.util.thread.a$a */
    public static class C11083a {

        /* renamed from: a */
        public Executor f30140a;

        /* renamed from: a */
        public final C11083a mo27015a(Executor executor) {
            if (executor == null) {
                executor = C11081a.f30132a;
            }
            this.f30140a = executor;
            return this;
        }
    }

    /* renamed from: a */
    public static synchronized C11081a m32463a() {
        C11081a aVar;
        synchronized (C11081a.class) {
            if (f30133b == null) {
                f30133b = new C11081a();
            }
            aVar = f30133b;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo27013a(Callable callable) {
        mo27011a(null, callable, 0);
    }

    /* renamed from: a */
    private static void m32464a(C11081a aVar) {
        if (!aVar.f30135d) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    /* renamed from: a */
    public final void mo27012a(C11083a aVar) {
        this.f30136e = aVar.f30140a;
        f30134c = new Handler(Looper.getMainLooper());
        this.f30135d = true;
    }

    /* renamed from: b */
    private static Runnable m32465b(final Handler handler, final Callable callable, final int i) {
        return new Runnable() {
            public final void run() {
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception unused) {
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(i);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e) {
                        obtainMessage.obj = e;
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo27011a(Handler handler, Callable callable, int i) {
        m32464a(this);
        this.f30136e.execute(m32465b(handler, callable, i));
    }
}
