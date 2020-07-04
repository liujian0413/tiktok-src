package com.google.android.play.core.internal;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;

/* renamed from: com.google.android.play.core.internal.ak */
public final class C6514ak {

    /* renamed from: a */
    private static final C6513aj f18824a;

    /* renamed from: b */
    private static final int f18825b;

    /* renamed from: com.google.android.play.core.internal.ak$a */
    static final class C6515a extends C6513aj {
        C6515a() {
        }

        /* renamed from: a */
        public final void mo15881a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m20230a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0017
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x0015 }
            r3 = 19
            if (r2 < r3) goto L_0x0017
            com.google.android.play.core.internal.ao r2 = new com.google.android.play.core.internal.ao     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x0015:
            r2 = move-exception
            goto L_0x002e
        L_0x0017:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ Throwable -> 0x0015 }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0026
            com.google.android.play.core.internal.an r2 = new com.google.android.play.core.internal.an     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x0026:
            com.google.android.play.core.internal.ak$a r2 = new com.google.android.play.core.internal.ak$a     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.play.core.internal.ak$a> r4 = com.google.android.play.core.internal.C6514ak.C6515a.class
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20179a(r2, r3)
            com.google.android.play.core.internal.ak$a r2 = new com.google.android.play.core.internal.ak$a
            r2.<init>()
        L_0x0063:
            f18824a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f18825b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C6514ak.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m20230a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            C6497a.m20179a((Throwable) e, System.err);
            return null;
        }
    }

    /* renamed from: a */
    public static void m20231a(Throwable th, Throwable th2) {
        f18824a.mo15881a(th, th2);
    }
}
