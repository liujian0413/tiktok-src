package com.bytedance.framwork.core.p517a.p521d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.framwork.core.p517a.p522e.C10231c;
import com.bytedance.framwork.core.p517a.p522e.C10231c.C10232a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.framwork.core.a.d.b */
public final class C10223b {

    /* renamed from: e */
    static final C10232a<C10228c, Runnable> f27809e = new C10232a<C10228c, Runnable>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo24938a(Object obj, Object obj2) {
            return m30345a((C10228c) obj, (Runnable) obj2);
        }

        /* renamed from: a */
        private static boolean m30345a(C10228c cVar, Runnable runnable) {
            if (runnable == null) {
                if (cVar == null || cVar.f27818a == null || cVar.f27818a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar == null || cVar.f27818a == null || !runnable.equals(cVar.f27818a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: f */
    static final C10232a<Message, Runnable> f27810f = new C10232a<Message, Runnable>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo24938a(Object obj, Object obj2) {
            return m30347a((Message) obj, (Runnable) obj2);
        }

        /* renamed from: a */
        private static boolean m30347a(Message message, Runnable runnable) {
            if (runnable == null) {
                if (message == null || message.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (message == null || !runnable.equals(message.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: a */
    public final Queue<C10228c> f27811a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Queue<Message> f27812b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public volatile Handler f27813c;

    /* renamed from: d */
    public final Object f27814d = new Object();

    /* renamed from: g */
    private final HandlerThread f27815g;

    /* renamed from: com.bytedance.framwork.core.a.d.b$a */
    class C10226a implements Runnable {
        public final void run() {
            m30350b();
            m30349a();
        }

        /* renamed from: a */
        private void m30349a() {
            while (!C10223b.this.f27811a.isEmpty()) {
                C10228c cVar = (C10228c) C10223b.this.f27811a.poll();
                if (C10223b.this.f27813c != null) {
                    C10223b.this.f27813c.sendMessageAtTime(cVar.f27818a, cVar.f27819b);
                }
            }
        }

        /* renamed from: b */
        private void m30350b() {
            while (!C10223b.this.f27812b.isEmpty()) {
                if (C10223b.this.f27813c != null) {
                    C10223b.this.f27813c.sendMessageAtFrontOfQueue((Message) C10223b.this.f27812b.poll());
                }
            }
        }

        C10226a() {
        }
    }

    /* renamed from: com.bytedance.framwork.core.a.d.b$b */
    class C10227b extends HandlerThread {
        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[LOOP:0: B:6:0x0020->B:7:?, LOOP_START, SYNTHETIC, Splitter:B:6:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLooperPrepared() {
            /*
                r3 = this;
                super.onLooperPrepared()
                com.bytedance.framwork.core.a.d.b r0 = com.bytedance.framwork.core.p517a.p521d.C10223b.this
                java.lang.Object r0 = r0.f27814d
                monitor-enter(r0)
                com.bytedance.framwork.core.a.d.b r1 = com.bytedance.framwork.core.p517a.p521d.C10223b.this     // Catch:{ all -> 0x0024 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0024 }
                r2.<init>()     // Catch:{ all -> 0x0024 }
                r1.f27813c = r2     // Catch:{ all -> 0x0024 }
                monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                com.bytedance.framwork.core.a.d.b r0 = com.bytedance.framwork.core.p517a.p521d.C10223b.this
                android.os.Handler r0 = r0.f27813c
                com.bytedance.framwork.core.a.d.b$a r1 = new com.bytedance.framwork.core.a.d.b$a
                com.bytedance.framwork.core.a.d.b r2 = com.bytedance.framwork.core.p517a.p521d.C10223b.this
                r1.<init>()
                r0.post(r1)
            L_0x0020:
                android.os.Looper.loop()     // Catch:{ Throwable -> 0x0020 }
                goto L_0x0020
            L_0x0024:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p517a.p521d.C10223b.C10227b.onLooperPrepared():void");
        }

        C10227b(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.framwork.core.a.d.b$c */
    static class C10228c {

        /* renamed from: a */
        Message f27818a;

        /* renamed from: b */
        long f27819b;

        C10228c(Message message, long j) {
            this.f27818a = message;
            this.f27819b = j;
        }
    }

    /* renamed from: a */
    public final void mo24934a() {
        this.f27815g.start();
    }

    /* renamed from: c */
    private Message m30340c(Runnable runnable) {
        return Message.obtain(this.f27813c, runnable);
    }

    /* renamed from: a */
    public final boolean mo24935a(Runnable runnable) {
        return m30338a(m30340c(runnable), 0);
    }

    public C10223b(String str) {
        this.f27815g = new C10227b(str);
    }

    /* renamed from: b */
    public final void mo24937b(Runnable runnable) {
        if (!this.f27811a.isEmpty() || !this.f27812b.isEmpty()) {
            C10231c.m30353a(this.f27811a, runnable, f27809e);
            C10231c.m30353a(this.f27812b, runnable, f27810f);
        }
        if (this.f27813c != null) {
            this.f27813c.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    private boolean m30338a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m30339b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m30339b(Message message, long j) {
        if (this.f27813c == null) {
            synchronized (this.f27814d) {
                if (this.f27813c == null) {
                    this.f27811a.add(new C10228c(message, j));
                    return true;
                }
            }
        }
        return this.f27813c.sendMessageAtTime(message, j);
    }

    /* renamed from: a */
    public final boolean mo24936a(Runnable runnable, long j) {
        return m30338a(m30340c(runnable), j);
    }
}
