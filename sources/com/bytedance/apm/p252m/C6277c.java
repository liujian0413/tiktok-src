package com.bytedance.apm.p252m;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.apm.util.C6292i;
import com.bytedance.apm.util.C6292i.C6293a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.apm.m.c */
public final class C6277c {

    /* renamed from: e */
    static final C6293a<C6282c, Runnable> f18501e = new C6293a<C6282c, Runnable>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo15075a(Object obj, Object obj2) {
            return m19489a((C6282c) obj, (Runnable) obj2);
        }

        /* renamed from: a */
        private static boolean m19489a(C6282c cVar, Runnable runnable) {
            if (runnable == null) {
                if (cVar == null || cVar.f18510a == null || cVar.f18510a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar == null || cVar.f18510a == null || !runnable.equals(cVar.f18510a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: f */
    static final C6293a<Message, Runnable> f18502f = new C6293a<Message, Runnable>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo15075a(Object obj, Object obj2) {
            return m19491a((Message) obj, (Runnable) obj2);
        }

        /* renamed from: a */
        private static boolean m19491a(Message message, Runnable runnable) {
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
    public final Queue<C6282c> f18503a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Queue<Message> f18504b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public volatile Handler f18505c;

    /* renamed from: d */
    public final Object f18506d = new Object();

    /* renamed from: g */
    private final HandlerThread f18507g;

    /* renamed from: com.bytedance.apm.m.c$a */
    class C6280a implements Runnable {
        public final void run() {
            m19494b();
            m19493a();
        }

        /* renamed from: a */
        private void m19493a() {
            while (!C6277c.this.f18503a.isEmpty()) {
                C6282c cVar = (C6282c) C6277c.this.f18503a.poll();
                if (C6277c.this.f18505c != null) {
                    C6277c.this.f18505c.sendMessageAtTime(cVar.f18510a, cVar.f18511b);
                }
            }
        }

        /* renamed from: b */
        private void m19494b() {
            while (!C6277c.this.f18504b.isEmpty()) {
                if (C6277c.this.f18505c != null) {
                    C6277c.this.f18505c.sendMessageAtFrontOfQueue((Message) C6277c.this.f18504b.poll());
                }
            }
        }

        C6280a() {
        }
    }

    /* renamed from: com.bytedance.apm.m.c$b */
    class C6281b extends HandlerThread {
        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (C6277c.this.f18506d) {
                C6277c.this.f18505c = new Handler();
            }
            C6277c.this.f18505c.post(new C6280a());
        }

        C6281b(String str) {
            super(str);
        }

        C6281b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.bytedance.apm.m.c$c */
    static class C6282c {

        /* renamed from: a */
        Message f18510a;

        /* renamed from: b */
        long f18511b;

        C6282c(Message message, long j) {
            this.f18510a = message;
            this.f18511b = j;
        }
    }

    /* renamed from: a */
    public final void mo15070a() {
        this.f18507g.start();
    }

    /* renamed from: b */
    public final boolean mo15074b() {
        if (this.f18505c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private Message m19483c(Runnable runnable) {
        return Message.obtain(this.f18505c, runnable);
    }

    /* renamed from: a */
    public final boolean mo15071a(Runnable runnable) {
        return m19481a(m19483c(runnable), 0);
    }

    public C6277c(String str) {
        this.f18507g = new C6281b(str);
    }

    /* renamed from: b */
    public final void mo15073b(Runnable runnable) {
        if (!this.f18503a.isEmpty() || !this.f18504b.isEmpty()) {
            C6292i.m19524a(this.f18503a, runnable, f18501e);
            C6292i.m19524a(this.f18504b, runnable, f18502f);
        }
        if (this.f18505c != null) {
            this.f18505c.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    private boolean m19481a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m19482b(message, SystemClock.uptimeMillis() + j);
    }

    public C6277c(String str, int i) {
        this.f18507g = new C6281b(str, 10);
    }

    /* renamed from: b */
    private boolean m19482b(Message message, long j) {
        if (this.f18505c == null) {
            synchronized (this.f18506d) {
                if (this.f18505c == null) {
                    this.f18503a.add(new C6282c(message, j));
                    return true;
                }
            }
        }
        return this.f18505c.sendMessageAtTime(message, j);
    }

    /* renamed from: a */
    public final boolean mo15072a(Runnable runnable, long j) {
        return m19481a(m19483c(runnable), j);
    }
}
