package com.p280ss.android.ugc.aweme.i18n;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.n */
public final class C6927n {

    /* renamed from: a */
    private static Callable<Boolean> f19615a;

    /* renamed from: b */
    private static Boolean f19616b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m21573a() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.i18n.n> r0 = com.p280ss.android.ugc.aweme.i18n.C6927n.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f19616b     // Catch:{ all -> 0x0029 }
            r2 = 0
            if (r1 != 0) goto L_0x001d
            java.util.concurrent.Callable<java.lang.Boolean> r1 = f19615a     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            java.util.concurrent.Callable<java.lang.Boolean> r1 = f19615a     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r1 = r1.call()     // Catch:{ Exception -> 0x0017 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0017 }
            f19616b = r1     // Catch:{ Exception -> 0x0017 }
            goto L_0x001d
        L_0x0017:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0029 }
            f19616b = r1     // Catch:{ all -> 0x0029 }
        L_0x001d:
            java.lang.Boolean r1 = f19616b     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027
            java.lang.Boolean r1 = f19616b     // Catch:{ all -> 0x0029 }
            boolean r2 = r1.booleanValue()     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r0)
            return r2
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.i18n.C6927n.m21573a():boolean");
    }

    /* renamed from: a */
    public static void m21572a(Callable<Boolean> callable) {
        f19615a = callable;
    }
}
