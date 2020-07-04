package com.p280ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.ss.android.ugc.aweme.base.p */
public final class C23397p {

    /* renamed from: a */
    public static final Executor f61596a = new ScheduledThreadPoolExecutor(4);

    /* renamed from: b */
    public static C23397p f61597b;

    /* renamed from: c */
    private boolean f61598c;

    /* renamed from: d */
    private Executor f61599d;

    /* renamed from: com.ss.android.ugc.aweme.base.p$a */
    public static class C23399a {

        /* renamed from: a */
        public Executor f61603a;

        /* renamed from: a */
        public final C23399a mo60810a(Executor executor) {
            if (executor == null) {
                executor = C23397p.f61596a;
            }
            this.f61603a = executor;
            return this;
        }
    }

    /* renamed from: a */
    public static synchronized C23397p m76735a() {
        C23397p pVar;
        synchronized (C23397p.class) {
            if (f61597b == null) {
                f61597b = new C23397p();
            }
            pVar = f61597b;
        }
        return pVar;
    }

    /* renamed from: a */
    public final void mo60808a(C23399a aVar) {
        this.f61599d = aVar.f61603a;
        this.f61598c = true;
    }

    /* renamed from: a */
    private static void m76736a(C23397p pVar) {
        if (!pVar.f61598c) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    /* renamed from: b */
    private static Runnable m76737b(final Handler handler, final Callable callable, final int i) {
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
    public final void mo60807a(Handler handler, Callable callable, int i) {
        m76736a(this);
        this.f61599d.execute(m76737b(handler, callable, i));
    }
}
