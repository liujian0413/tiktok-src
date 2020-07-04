package com.bytedance.frameworks.baselib.network.connectionclass;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.d */
public class C10090d {

    /* renamed from: g */
    private static long f27444g = -1;

    /* renamed from: a */
    private final C10087c f27445a;

    /* renamed from: b */
    private AtomicInteger f27446b;

    /* renamed from: c */
    private C10092b f27447c;

    /* renamed from: d */
    private HandlerThread f27448d;

    /* renamed from: e */
    private boolean f27449e;

    /* renamed from: f */
    private long f27450f;

    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.d$a */
    static class C10091a {

        /* renamed from: a */
        public static final C10090d f27451a = new C10090d(C10087c.m29957b());
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.d$b */
    class C10092b extends Handler {
        /* renamed from: a */
        public final void mo24740a() {
            sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void mo24741b() {
            removeMessages(1);
        }

        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    C10090d.this.mo24739e();
                    sendEmptyMessageDelayed(1, 1000);
                }
            } catch (Throwable unused) {
            }
        }

        public C10092b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: b */
    public static C10090d m29964b() {
        return C10091a.f27451a;
    }

    /* renamed from: a */
    private void m29963a() {
        mo24739e();
        f27444g = -1;
    }

    /* renamed from: c */
    public final void mo24737c() {
        try {
            if (!this.f27449e && this.f27446b.getAndIncrement() == 0) {
                this.f27447c.mo24740a();
                this.f27450f = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public final void mo24738d() {
        try {
            if (!this.f27449e && this.f27446b.decrementAndGet() == 0) {
                this.f27447c.mo24741b();
                m29963a();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo24739e() {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j = totalRxBytes - f27444g;
            if (f27444g >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f27445a.mo24734a(j, elapsedRealtime - this.f27450f);
                    this.f27450f = elapsedRealtime;
                }
            }
            f27444g = totalRxBytes;
        } catch (Throwable unused) {
        }
    }

    protected C10090d(C10087c cVar) {
        this.f27445a = cVar;
        try {
            this.f27446b = new AtomicInteger();
            this.f27448d = new HandlerThread("ParseThread");
            this.f27448d.start();
            this.f27447c = new C10092b(this.f27448d.getLooper());
        } catch (Throwable unused) {
            this.f27449e = true;
        }
    }
}
