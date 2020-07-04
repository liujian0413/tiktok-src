package com.bytedance.frameworks.apm.trace;

import android.app.Activity;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.apm.api.C6478c;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.frameworks.apm.trace.e */
public final class C10063e implements C6478c {

    /* renamed from: a */
    public static boolean f27374a = false;

    /* renamed from: b */
    public static Handler f27375b = new Handler(f27386m.getLooper(), new Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                C10063e.m29894b();
                if (!C10063e.f27374a) {
                    C10063e.f27375b.sendEmptyMessageDelayed(1, 5);
                } else {
                    C10060d.m29879b("MethodCollector", "stop time update!", new Object[0]);
                }
            }
            return true;
        }
    });

    /* renamed from: c */
    private static C10063e f27376c = new C10063e();

    /* renamed from: d */
    private static int f27377d = 0;

    /* renamed from: e */
    private static boolean f27378e = false;

    /* renamed from: f */
    private static boolean f27379f = false;

    /* renamed from: g */
    private static boolean f27380g = false;

    /* renamed from: h */
    private static Thread f27381h = Looper.getMainLooper().getThread();

    /* renamed from: i */
    private static volatile long f27382i;

    /* renamed from: j */
    private static volatile long f27383j;

    /* renamed from: k */
    private static long[] f27384k;

    /* renamed from: l */
    private static List<C10059c> f27385l = new LinkedList();

    /* renamed from: m */
    private static HandlerThread f27386m = m29902i();

    /* renamed from: a */
    public static C10063e m29890a() {
        return f27376c;
    }

    /* renamed from: c */
    public static long m29897c() {
        return f27383j;
    }

    /* renamed from: d */
    public static void m29898d() {
        f27377d = 0;
    }

    /* renamed from: e */
    static int m29899e() {
        return f27377d;
    }

    /* renamed from: f */
    static long[] m29901f() {
        return f27384k;
    }

    /* renamed from: b */
    public static void m29894b() {
        f27382i = (System.nanoTime() / 1000000) - f27383j;
    }

    /* renamed from: i */
    private static HandlerThread m29902i() {
        HandlerThread handlerThread = new HandlerThread("trace_time_update_thread");
        handlerThread.start();
        return handlerThread;
    }

    /* renamed from: g */
    public final void mo24707g() {
        if (!f27379f) {
            f27375b.removeMessages(1);
            f27375b.sendEmptyMessage(1);
            ActivityLifeObserver.getInstance().register(this);
            f27384k = new long[C28539a.f75176k];
            f27379f = true;
        }
    }

    /* renamed from: h */
    public final void mo24708h() {
        if (f27379f) {
            f27379f = false;
            C10060d.m29880c("MethodCollector", "[onDestroy]", new Object[0]);
            f27385l.clear();
            f27377d = 0;
            f27384k = null;
            f27375b.removeMessages(1);
            ActivityLifeObserver.getInstance().unregister(this);
        }
    }

    static {
        long nanoTime = System.nanoTime() / 1000000;
        f27383j = nanoTime;
        f27382i = nanoTime;
    }

    /* renamed from: a */
    public static void m29893a(boolean z) {
        f27380g = z;
    }

    /* renamed from: b */
    public static void m29896b(C10059c cVar) {
        f27385l.remove(cVar);
    }

    /* renamed from: a */
    public static void m29892a(C10059c cVar) {
        if (!f27385l.contains(cVar)) {
            f27385l.add(cVar);
        }
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
        f27374a = false;
        if (!f27375b.hasMessages(1)) {
            f27375b.sendEmptyMessage(1);
        }
    }

    /* renamed from: c */
    public final void mo14870c(Activity activity) {
        if (f27374a && !f27375b.hasMessages(1)) {
            f27375b.sendEmptyMessage(1);
        }
    }

    /* renamed from: d */
    public final void mo14871d(Activity activity) {
        if (f27374a && !f27375b.hasMessages(1)) {
            f27375b.sendEmptyMessage(1);
        }
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        f27375b.removeMessages(1);
        f27374a = true;
    }

    /* renamed from: b */
    public static void m29895b(int i) {
        if (Thread.currentThread() == f27381h && f27379f && f27380g && !f27374a) {
            if (f27378e) {
                C10060d.m29878a("MethodCollector", "ERROR!!! MethodCollector.b(int method) Recursive calls!!!", new Object[0]);
                return;
            }
            f27378e = true;
            if (f27377d < 1000000) {
                m29891a(i, f27377d, true);
            } else {
                for (C10059c pushFullBuffer : f27385l) {
                    pushFullBuffer.pushFullBuffer(0, 999999, f27384k);
                }
                f27377d = 0;
            }
            f27377d++;
            f27378e = false;
        }
    }

    /* renamed from: e */
    public static void m29900e(int i) {
        if (Thread.currentThread() == f27381h && f27379f && f27380g && !f27374a) {
            if (f27377d < 1000000) {
                m29891a(i, f27377d, false);
            } else {
                for (C10059c pushFullBuffer : f27385l) {
                    pushFullBuffer.pushFullBuffer(0, 999999, f27384k);
                }
                f27377d = 0;
            }
            f27377d++;
        }
    }

    /* renamed from: a */
    private static void m29891a(int i, int i2, boolean z) {
        long j;
        if (z) {
            j = Long.MIN_VALUE;
        } else {
            j = 0;
        }
        f27384k[i2] = j | (((long) i) << 43) | (f27382i & 8796093022207L);
    }
}
