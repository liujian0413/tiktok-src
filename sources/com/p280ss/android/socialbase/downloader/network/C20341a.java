package com.p280ss.android.socialbase.downloader.network;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.network.a */
public class C20341a {

    /* renamed from: a */
    private static final String f54986a = "a";

    /* renamed from: f */
    private static long f54987f = -1;

    /* renamed from: g */
    private static volatile C20341a f54988g;

    /* renamed from: b */
    private final C20348g f54989b = C20348g.m67505a();

    /* renamed from: c */
    private final AtomicInteger f54990c = new AtomicInteger();

    /* renamed from: d */
    private final C20342a f54991d;

    /* renamed from: e */
    private long f54992e;

    /* renamed from: com.ss.android.socialbase.downloader.network.a$a */
    class C20342a extends Handler {
        /* renamed from: a */
        public final void mo54902a() {
            sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void mo54903b() {
            removeMessages(1);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C20341a.this.mo54901d();
                sendEmptyMessageDelayed(1, 1000);
            }
        }

        public C20342a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: f */
    private void m67490f() {
        mo54901d();
        f54987f = -1;
    }

    /* renamed from: e */
    private static long m67489e() {
        return TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
    }

    /* renamed from: a */
    public static C20341a m67488a() {
        if (f54988g == null) {
            synchronized (C20341a.class) {
                if (f54988g == null) {
                    f54988g = new C20341a();
                }
            }
        }
        return f54988g;
    }

    /* renamed from: b */
    public final void mo54899b() {
        try {
            if (this.f54990c.getAndIncrement() == 0) {
                this.f54991d.mo54902a();
                this.f54992e = SystemClock.uptimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo54900c() {
        try {
            if (this.f54990c.decrementAndGet() == 0) {
                this.f54991d.mo54903b();
                m67490f();
            }
        } catch (Throwable unused) {
        }
    }

    private C20341a() {
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        handlerThread.start();
        this.f54991d = new C20342a(handlerThread.getLooper());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54901d() {
        long j;
        try {
            if (C20359e.m67562a(C20269b.m66765x())) {
                j = m67489e();
            } else {
                j = TrafficStats.getMobileRxBytes();
            }
            long j2 = j - f54987f;
            if (f54987f >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f54989b.mo54906a(j2, uptimeMillis - this.f54992e);
                    this.f54992e = uptimeMillis;
                }
            }
            f54987f = j;
        } catch (Exception unused) {
        }
    }
}
