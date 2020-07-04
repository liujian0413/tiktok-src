package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import kotlinx.coroutines.C48086ay.C48088b;
import kotlinx.coroutines.C48086ay.C48089c;

/* renamed from: kotlinx.coroutines.ah */
public final class C48060ah extends C48086ay implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: b */
    public static final C48060ah f122908b;

    /* renamed from: c */
    private static final long f122909c;
    private static volatile int debugStatus;

    private C48060ah() {
    }

    /* renamed from: j */
    private static boolean m149024j() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Thread mo120265a() {
        Thread thread = _thread;
        if (thread == null) {
            return m149025k();
        }
        return thread;
    }

    /* renamed from: k */
    private final synchronized Thread m149025k() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: l */
    private final synchronized boolean m149026l() {
        if (m149024j()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: m */
    private final synchronized void m149027m() {
        if (m149024j()) {
            debugStatus = 3;
            mo120308i();
            notifyAll();
        }
    }

    static {
        Long l;
        C48060ah ahVar = new C48060ah();
        f122908b = ahVar;
        ahVar.mo120297a(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = Long.valueOf(1000);
        }
        C7573i.m23582a((Object) l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f122909c = timeUnit.toNanos(l.longValue());
    }

    public final void run() {
        C48128cc.m149248a(this);
        try {
            if (m149026l()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long b = mo120298b();
                    if (b == Long.MAX_VALUE) {
                        if (j == Long.MAX_VALUE) {
                            long a = C48130ce.m149255a().mo120268a();
                            if (j == Long.MAX_VALUE) {
                                j = f122909c + a;
                            }
                            long j2 = j - a;
                            if (j2 <= 0) {
                                _thread = null;
                                m149027m();
                                if (!mo120300c()) {
                                    mo120265a();
                                }
                                return;
                            }
                            b = C7551d.m23564b(b, j2);
                        } else {
                            b = C7551d.m23564b(b, f122909c);
                        }
                    }
                    if (b > 0) {
                        if (m149024j()) {
                            _thread = null;
                            m149027m();
                            if (!mo120300c()) {
                                mo120265a();
                            }
                            return;
                        }
                        C48130ce.m149255a().mo120270a(this, b);
                    }
                }
            }
        } finally {
            _thread = null;
            m149027m();
            if (!mo120300c()) {
                mo120265a();
            }
        }
    }

    /* renamed from: a */
    public final C48081at mo120266a(long j, Runnable runnable) {
        C7573i.m23587b(runnable, "block");
        C48088b bVar = new C48088b(j, runnable);
        f122908b.mo120307a((C48089c) bVar);
        return bVar;
    }
}
