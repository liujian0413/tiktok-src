package com.bytedance.crash.p501j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.crash.j.k */
public final class C9961k {

    /* renamed from: f */
    static final C9965b<C9967d, Runnable> f27190f = new C9965b<C9967d, Runnable>() {
    };

    /* renamed from: g */
    static final C9965b<Message, Runnable> f27191g = new C9965b<Message, Runnable>() {
    };

    /* renamed from: a */
    public final HandlerThread f27192a;

    /* renamed from: b */
    public final Queue<C9967d> f27193b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final Queue<Message> f27194c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public volatile Handler f27195d;

    /* renamed from: e */
    public final Object f27196e = new Object();

    /* renamed from: com.bytedance.crash.j.k$a */
    class C9964a implements Runnable {
        public final void run() {
            m29493b();
            m29492a();
        }

        /* renamed from: a */
        private void m29492a() {
            while (!C9961k.this.f27193b.isEmpty()) {
                C9967d dVar = (C9967d) C9961k.this.f27193b.poll();
                if (C9961k.this.f27195d != null) {
                    try {
                        C9961k.this.f27195d.sendMessageAtTime(dVar.f27201a, dVar.f27202b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        private void m29493b() {
            while (!C9961k.this.f27194c.isEmpty()) {
                if (C9961k.this.f27195d != null) {
                    try {
                        C9961k.this.f27195d.sendMessageAtFrontOfQueue((Message) C9961k.this.f27194c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        C9964a() {
        }
    }

    /* renamed from: com.bytedance.crash.j.k$b */
    public interface C9965b<A, B> {
    }

    /* renamed from: com.bytedance.crash.j.k$c */
    class C9966c extends HandlerThread {

        /* renamed from: a */
        volatile int f27198a;

        /* renamed from: b */
        volatile boolean f27199b;

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (C9961k.this.f27196e) {
                C9961k.this.f27195d = new Handler();
            }
            C9961k.this.f27195d.post(new C9964a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable unused) {
                }
            }
            this.f27198a++;
        }

        C9966c(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.crash.j.k$d */
    static class C9967d {

        /* renamed from: a */
        Message f27201a;

        /* renamed from: b */
        long f27202b;

        C9967d(Message message, long j) {
            this.f27201a = message;
            this.f27202b = j;
        }
    }

    /* renamed from: a */
    public final void mo24595a() {
        this.f27192a.start();
    }

    /* renamed from: b */
    private Message m29487b(Runnable runnable) {
        return Message.obtain(this.f27195d, runnable);
    }

    /* renamed from: a */
    public final boolean mo24596a(Runnable runnable) {
        return m29486a(m29487b(runnable), 0);
    }

    public C9961k(String str) {
        this.f27192a = new C9966c(str);
    }

    /* renamed from: a */
    private boolean m29486a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m29488b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m29488b(Message message, long j) {
        if (this.f27195d == null) {
            synchronized (this.f27196e) {
                if (this.f27195d == null) {
                    this.f27193b.add(new C9967d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f27195d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo24597a(Runnable runnable, long j) {
        return m29486a(m29487b(runnable), j);
    }
}
