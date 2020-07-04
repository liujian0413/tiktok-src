package com.bytedance.p255e;

import android.content.Context;

/* renamed from: com.bytedance.e.a */
public class C6326a {

    /* renamed from: a */
    static Context f18571a;

    /* renamed from: b */
    static volatile String f18572b;

    /* renamed from: c */
    static C6346e f18573c;

    /* renamed from: d */
    private static final Object f18574d = new Object();

    /* renamed from: a */
    public static UnsatisfiedLinkError[] m19644a() {
        return C6347f.m19681a();
    }

    /* renamed from: a */
    public static void m19641a(String str) {
        m19643a(str, false, false, null);
    }

    /* renamed from: a */
    public static void m19642a(String str, Context context) {
        m19643a(str, false, true, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        f18571a = r1;
        f18572b = r2;
        f18573c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        throw new java.lang.IllegalStateException("context or version is null in init");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19640a(android.content.Context r1, java.lang.String r2, com.bytedance.p255e.C6346e r3) {
        /*
            java.lang.Object r3 = f18574d
            monitor-enter(r3)
            java.lang.String r0 = f18572b     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            return
        L_0x0009:
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0016
            if (r2 == 0) goto L_0x0016
            f18571a = r1
            f18572b = r2
            r1 = 0
            f18573c = r1
            return
        L_0x0016:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "context or version is null in init"
            r1.<init>(r2)
            throw r1
        L_0x001e:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p255e.C6326a.m19640a(android.content.Context, java.lang.String, com.bytedance.e.e):void");
    }

    /* renamed from: a */
    private static void m19643a(String str, boolean z, boolean z2, Context context) {
        if (z2 && f18571a == null) {
            f18571a = context;
        }
        C6342c cVar = C6342c.f18595a;
        if (cVar != null) {
            cVar.mo15175a(str, false);
        } else {
            C6341b.m19663a(str);
        }
    }
}
