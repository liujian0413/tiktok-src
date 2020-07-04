package com.bytedance.crash.p496e;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9897b;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p501j.C9961k;
import com.bytedance.crash.p501j.p502a.C9930f;
import com.bytedance.crash.p504l.C9999s;
import com.bytedance.crash.upload.C10018c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.e.a */
public final class C9882a {
    /* renamed from: a */
    private static String m29158a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            C9999s.m29646a(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m29159a(Map<String, String> map, C9897b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                bVar.mo24492a("custom", (Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m29161a(StackTraceElement[] stackTraceElementArr, int i, Throwable th, String str, boolean z) {
        m29162a(stackTraceElementArr, i, th, str, z, null);
    }

    /* renamed from: a */
    public static void m29160a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, Map<String, String> map) {
        try {
            C9961k b = C9954g.m29460b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final String str3 = str;
            final String str4 = str2;
            final Map<String, String> map2 = map;
            C98842 r0 = new Runnable(5) {
                public final void run() {
                    C9882a.m29165b(stackTraceElementArr2, 5, str3, str4, map2);
                }
            };
            b.mo24596a(r0);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m29165b(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (stackTraceElement != null) {
                        String a = m29158a(stackTraceElementArr, i);
                        if (!TextUtils.isEmpty(a)) {
                            C9897b a2 = C9897b.m29246a(stackTraceElement, a, str, Thread.currentThread().getName(), true, str2);
                            m29159a(map, a2);
                            C9930f.m29397a().mo24554a(CrashType.ENSURE, a2);
                            C10018c.m29777a(a2);
                            new StringBuilder("[report] ").append(str);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29163a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, int i) {
        try {
            C9961k b = C9954g.m29460b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final Throwable th2 = th;
            final String str3 = str;
            final String str4 = str2;
            final int i2 = i;
            C98853 r1 = new Runnable() {
                public final void run() {
                    C9882a.m29167b(stackTraceElementArr2, th2, str3, str4, i2);
                }
            };
            b.mo24596a(r1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m29167b(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, int i) {
        String str3;
        if (th != null || stackTraceElementArr != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[0];
                if (stackTraceElement != null) {
                    if (th == null) {
                        str3 = m29158a(stackTraceElementArr, i);
                    } else {
                        str3 = C9999s.m29644a(th);
                    }
                    String str4 = str3;
                    if (!TextUtils.isEmpty(str4)) {
                        C9897b a = C9897b.m29246a(stackTraceElement, str4, str, Thread.currentThread().getName(), true, str2);
                        C9930f.m29397a().mo24554a(CrashType.ENSURE, a);
                        a.mo24487a("err_type", str);
                        C10018c.m29775a();
                        C10018c.m29776a((C9896a) a);
                        new StringBuilder("[report] ").append(str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29162a(StackTraceElement[] stackTraceElementArr, int i, Throwable th, String str, boolean z, Map<String, String> map) {
        try {
            C9961k b = C9954g.m29460b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final int i2 = i;
            final Throwable th2 = th;
            final String str2 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            C98831 r1 = new Runnable() {
                public final void run() {
                    C9882a.m29166b(stackTraceElementArr2, i2, th2, str2, z2, map2);
                }
            };
            b.mo24596a(r1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m29166b(StackTraceElement[] stackTraceElementArr, int i, Throwable th, String str, boolean z, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1) {
                    if (th != null) {
                        StackTraceElement stackTraceElement = stackTraceElementArr[i];
                        if (stackTraceElement != null) {
                            String a = C9999s.m29644a(th);
                            if (!TextUtils.isEmpty(a)) {
                                C9897b a2 = C9897b.m29246a(stackTraceElement, a, str, Thread.currentThread().getName(), z, "EnsureNotReachHere");
                                m29159a(map, a2);
                                C9930f.m29397a().mo24554a(CrashType.ENSURE, a2);
                                C10018c.m29777a(a2);
                                new StringBuilder("[reportException] ").append(str);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29164a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, String str3, int i) {
        try {
            C9961k b = C9954g.m29460b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final Throwable th2 = th;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final int i2 = i;
            C98864 r1 = new Runnable() {
                public final void run() {
                    C9882a.m29168b(stackTraceElementArr2, th2, str4, str5, str6, i2);
                }
            };
            b.mo24596a(r1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m29168b(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, String str3, int i) {
        String str4;
        if (th != null || stackTraceElementArr != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[0];
                if (stackTraceElement != null) {
                    if (th == null) {
                        str4 = m29158a(stackTraceElementArr, i);
                    } else {
                        str4 = C9999s.m29644a(th);
                    }
                    String str5 = str4;
                    if (!TextUtils.isEmpty(str5)) {
                        C9897b a = C9897b.m29247a(stackTraceElement, str5, str, Thread.currentThread().getName(), true, str2, str3);
                        C9930f.m29397a().mo24554a(CrashType.ENSURE, a);
                        a.mo24487a("err_type", str);
                        C10018c.m29777a(a);
                        new StringBuilder("[report] ").append(str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
