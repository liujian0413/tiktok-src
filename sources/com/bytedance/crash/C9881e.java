package com.bytedance.crash;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.crash.p496e.C9882a;
import com.bytedance.crash.p504l.C9983h;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.apm.api.C6476a;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Map;

/* renamed from: com.bytedance.crash.e */
public final class C9881e {

    /* renamed from: a */
    private static long f26952a = -1;

    public C9881e() {
        try {
            EnsureImpl$1 ensureImpl$1 = new EnsureImpl$1(this);
            C6446c.m20129a(IEnsure.class, ensureImpl$1);
            C6476a.m20158a((IEnsure) ensureImpl$1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24452a(String str) {
        m29150a(str, "EnsureNotReachHere", null);
    }

    /* renamed from: b */
    public final void mo24455b(String str) {
        m29148a(str, "EnsureNotReachHere");
    }

    /* renamed from: c */
    private static boolean m29152c(String str) {
        if (C9918j.m29344i().mo24559b() == null || !C9918j.m29344i().mo24559b().getLogTypeSwitch(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m29151a(Throwable th) {
        if (!C9918j.m29344i().mo24558a() || C9983h.m29564a(th)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo24453a(String str, Throwable th) {
        m29149a(str, "EnsureNotReachHere", th);
    }

    /* renamed from: a */
    private static void m29148a(String str, String str2) {
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            if (uptimeMillis - f26952a >= 1000) {
                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                if (stackTrace != null) {
                    if (stackTrace.length != 0) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                        if (m29152c(str)) {
                            f26952a = uptimeMillis;
                            C9882a.m29163a(stackTrace, (Throwable) null, str, str2, i);
                            return;
                        }
                        if (C9918j.m29344i().mo24559b() == null) {
                            C9882a.m29164a(stackTrace, (Throwable) null, str, str2, str, i);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24454a(Throwable th, String str) {
        if (m29151a(th)) {
            C9882a.m29161a(Thread.currentThread().getStackTrace(), 5, th, str, true);
        }
    }

    /* renamed from: a */
    public static void m29150a(String str, String str2, Map<String, String> map) {
        if (C9918j.m29344i().mo24558a()) {
            C9882a.m29160a(Thread.currentThread().getStackTrace(), 5, str, str2, map);
        }
    }

    /* renamed from: a */
    private static void m29149a(String str, String str2, Throwable th) {
        try {
            if (m29152c("ensure_err_npth")) {
                C9882a.m29163a(th.getStackTrace(), th, str, str2, 0);
                return;
            }
            if (C9918j.m29344i().mo24559b() == null) {
                C9882a.m29164a(th.getStackTrace(), th, str, str2, "ensure_err_npth", 0);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24451a(int i, Throwable th, String str) {
        if (m29151a(th)) {
            C9882a.m29161a(Thread.currentThread().getStackTrace(), i + 2, th, str, false);
        }
    }
}
