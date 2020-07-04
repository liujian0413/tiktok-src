package com.toutiao.proxyserver.speed;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.toutiao.proxyserver.speed.b */
public final class C46546b {

    /* renamed from: b */
    public static long f119955b = 1000;

    /* renamed from: h */
    private static long f119956h = -1;

    /* renamed from: i */
    private static final C46553f f119957i = new C46552e();

    /* renamed from: a */
    public C46553f f119958a;

    /* renamed from: c */
    private final C46543a f119959c;

    /* renamed from: d */
    private AtomicInteger f119960d;

    /* renamed from: e */
    private C46549b f119961e;

    /* renamed from: f */
    private HandlerThread f119962f;

    /* renamed from: g */
    private long f119963g;

    /* renamed from: com.toutiao.proxyserver.speed.b$a */
    static class C46548a {

        /* renamed from: a */
        public static final C46546b f119964a = new C46546b(C46543a.m146292a());
    }

    /* renamed from: com.toutiao.proxyserver.speed.b$b */
    class C46549b extends Handler {
        /* renamed from: a */
        public final void mo115725a() {
            sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void mo115726b() {
            removeMessages(1);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C46546b.this.mo115723d();
                sendEmptyMessageDelayed(1, C46546b.f119955b);
                return;
            }
            StringBuilder sb = new StringBuilder("Unknown what=");
            sb.append(message.what);
            throw new IllegalArgumentException(sb.toString());
        }

        public C46549b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public static C46546b m146298a() {
        return C46548a.f119964a;
    }

    /* renamed from: f */
    private void m146300f() {
        mo115723d();
        f119956h = -1;
    }

    /* renamed from: e */
    public final void mo115724e() {
        this.f119958a = f119957i;
    }

    /* renamed from: b */
    public final void mo115721b() {
        if (this.f119960d.getAndIncrement() == 0) {
            this.f119961e.mo115725a();
            this.f119963g = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public final void mo115722c() {
        if (this.f119960d.decrementAndGet() == 0) {
            this.f119961e.mo115726b();
            m146300f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo115723d() {
        if (this.f119958a != null) {
            long a = this.f119958a.mo115728a();
            long j = a - f119956h;
            if (f119956h >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f119959c.mo115719a(j, elapsedRealtime - this.f119963g);
                    this.f119963g = elapsedRealtime;
                }
            }
            f119956h = a;
        }
    }

    /* renamed from: a */
    public static void m146299a(long j) {
        f119955b = 300;
    }

    private C46546b(C46543a aVar) {
        this.f119958a = f119957i;
        this.f119959c = aVar;
        this.f119960d = new AtomicInteger();
        this.f119962f = new HandlerThread("ParseThread");
        this.f119962f.start();
        this.f119961e = new C46549b(this.f119962f.getLooper());
    }
}
