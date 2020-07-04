package com.bytedance.crash.nativecrash;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9900g;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p504l.C9999s;
import java.util.Map.Entry;

public class NativeCrashCollector {
    /* renamed from: a */
    public static String m29672a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("main".equalsIgnoreCase(str)) {
            return C9999s.m29645a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < enumerate; i++) {
            String name = threadArr[i].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return C9999s.m29645a(threadArr[i].getStackTrace());
            }
        }
        try {
            for (Entry entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = ((Thread) entry.getKey()).getName();
                if (name2.equals(str) || name2.startsWith(str)) {
                    return C9999s.m29645a((StackTraceElement[]) entry.getValue());
                }
                if (name2.endsWith(str)) {
                    return C9999s.m29645a((StackTraceElement[]) entry.getValue());
                }
            }
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
        return "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onNativeCrash(java.lang.String r15) {
        /*
            long r7 = java.lang.System.currentTimeMillis()
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.NATIVE
            java.lang.String r1 = com.bytedance.crash.C9871c.C9872a.f26933e
            r9 = 0
            com.bytedance.crash.event.Event r0 = com.bytedance.crash.event.C9887a.m29169a(r0, r1, r7, r9)
            com.bytedance.crash.event.C9888b.m29186b(r0)
            java.lang.String r1 = com.bytedance.crash.C9871c.C9872a.f26936h
            com.bytedance.crash.event.Event r10 = r0.eventType(r1)
            com.bytedance.crash.event.Event r3 = r0.clone()
            com.bytedance.crash.event.Event r0 = r0.clone()
            java.lang.String r1 = com.bytedance.crash.C9871c.C9872a.f26935g
            com.bytedance.crash.event.Event r6 = r0.eventType(r1)
            com.bytedance.crash.j.d r0 = com.bytedance.crash.p501j.C9943d.m29423a()     // Catch:{ Throwable -> 0x00c6 }
            r0.mo24564b()     // Catch:{ Throwable -> 0x00c6 }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x00c6 }
            java.io.File r1 = com.bytedance.crash.p504l.C9992m.m29590a()     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r2 = com.bytedance.crash.C9918j.m29341f()     // Catch:{ Throwable -> 0x00c6 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x00c6 }
            java.io.File r11 = com.bytedance.crash.p504l.C9992m.m29610g(r0)     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.j.a.f r12 = com.bytedance.crash.p501j.p502a.C9930f.m29397a()     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.CrashType r13 = com.bytedance.crash.CrashType.NATIVE     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.nativecrash.NativeCrashCollector$1 r14 = new com.bytedance.crash.nativecrash.NativeCrashCollector$1     // Catch:{ Throwable -> 0x00c6 }
            r0 = r14
            r1 = r15
            r2 = r11
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r6)     // Catch:{ Throwable -> 0x00c6 }
            r15 = 1
            com.bytedance.crash.f.a r15 = r12.mo24555a(r13, r9, r14, r15)     // Catch:{ Throwable -> 0x00c6 }
            org.json.JSONObject r0 = r15.f26984a     // Catch:{ Throwable -> 0x00c6 }
            if (r0 == 0) goto L_0x00a8
            int r1 = r0.length()     // Catch:{ Throwable -> 0x00c6 }
            if (r1 == 0) goto L_0x00a8
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c6 }
            r3 = 0
            long r3 = r1 - r7
            r5 = 0
            java.lang.String r6 = "java_end"
            r0.put(r6, r1)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r1 = "crash_cost"
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0088 }
            r15.mo24494b(r1, r2)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r1 = "crash_cost"
            r6 = 1000(0x3e8, double:4.94E-321)
            long r6 = r3 / r6
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0088 }
            r15.mo24487a(r1, r2)     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.crash.event.Event r15 = r10.state(r5)     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.crash.event.Event r15 = r15.crashTime(r3)     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.crash.event.C9888b.m29186b(r15)     // Catch:{ Throwable -> 0x0088 }
        L_0x0088:
            java.io.File r15 = new java.io.File     // Catch:{ Throwable -> 0x00c6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c6 }
            r1.<init>()     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r2 = r11.getAbsolutePath()     // Catch:{ Throwable -> 0x00c6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r2 = ".tmp"
            r1.append(r2)     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00c6 }
            r15.<init>(r1)     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.p504l.C9982g.m29543a(r15, r0, r5)     // Catch:{ Throwable -> 0x00c6 }
            r15.renameTo(r11)     // Catch:{ Throwable -> 0x00c6 }
        L_0x00a8:
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r15 = ""
            m29673a(r15, r9)
            java.lang.String r15 = com.bytedance.crash.C9871c.C9872a.f26942n
            com.bytedance.crash.event.Event r15 = r10.eventType(r15)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r0
            com.bytedance.crash.event.Event r15 = r15.crashTime(r2)
            com.bytedance.crash.event.C9888b.m29186b(r15)
            return
        L_0x00c4:
            r15 = move-exception
            goto L_0x00de
        L_0x00c6:
            r15 = move-exception
            com.bytedance.crash.e r0 = com.bytedance.crash.C9875d.m29130a()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "NPTH_CATCH"
            r0.mo24453a(r1, r15)     // Catch:{ all -> 0x00c4 }
            r0 = 301(0x12d, float:4.22E-43)
            com.bytedance.crash.event.Event r0 = r10.state(r0)     // Catch:{ all -> 0x00c4 }
            com.bytedance.crash.event.Event r15 = r0.errorInfo(r15)     // Catch:{ all -> 0x00c4 }
            com.bytedance.crash.event.C9888b.m29186b(r15)     // Catch:{ all -> 0x00c4 }
            goto L_0x00a8
        L_0x00de:
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = ""
            m29673a(r2, r9)
            java.lang.String r2 = com.bytedance.crash.C9871c.C9872a.f26942n
            com.bytedance.crash.event.Event r2 = r10.eventType(r2)
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r0
            com.bytedance.crash.event.Event r0 = r2.crashTime(r3)
            com.bytedance.crash.event.C9888b.m29186b(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.NativeCrashCollector.onNativeCrash(java.lang.String):void");
    }

    /* renamed from: a */
    private static void m29673a(String str, Thread thread) {
        for (C9900g a : C9918j.m29337b().f26862d) {
            try {
                a.mo24413a(CrashType.NATIVE, "", null);
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
    }
}
