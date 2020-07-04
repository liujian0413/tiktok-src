package com.google.p268a.p269a.p270a.p271a.p272a;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: com.google.a.a.a.a.a.a */
public final class C6497a {

    /* renamed from: a */
    static final C6498a f18813a;

    /* renamed from: b */
    static final int f18814b;

    /* renamed from: com.google.a.a.a.a.a.a$a */
    static abstract class C6498a {

        /* renamed from: a */
        protected static final Throwable[] f18815a = new Throwable[0];

        C6498a() {
        }

        /* renamed from: a */
        public abstract void mo15861a(Throwable th, PrintStream printStream);

        /* renamed from: a */
        public abstract void mo15862a(Throwable th, PrintWriter printWriter);

        /* renamed from: a */
        public abstract void mo15863a(Throwable th, Throwable th2);

        /* renamed from: a */
        public abstract Throwable[] mo15864a(Throwable th);

        /* renamed from: b */
        public abstract void mo15865b(Throwable th);
    }

    /* renamed from: com.google.a.a.a.a.a.a$b */
    static final class C6499b extends C6498a {
        C6499b() {
        }

        /* renamed from: a */
        public final void mo15863a(Throwable th, Throwable th2) {
        }

        /* renamed from: b */
        public final void mo15865b(Throwable th) {
            th.printStackTrace();
        }

        /* renamed from: a */
        public final Throwable[] mo15864a(Throwable th) {
            return f18815a;
        }

        /* renamed from: a */
        public final void mo15861a(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        /* renamed from: a */
        public final void mo15862a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    /* renamed from: com.google.a.a.a.a.a.a$c */
    static final class C6500c extends C6498a {
        C6500c() {
        }

        /* renamed from: b */
        public final void mo15865b(Throwable th) {
            th.printStackTrace();
        }

        /* renamed from: a */
        public final Throwable[] mo15864a(Throwable th) {
            return th.getSuppressed();
        }

        /* renamed from: a */
        public final void mo15861a(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        /* renamed from: a */
        public final void mo15862a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }

        /* renamed from: a */
        public final void mo15863a(Throwable th, Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: a */
    private static boolean m20182a() {
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Integer m20184b() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    static {
        /*
            java.lang.Integer r0 = m20184b()     // Catch:{ Throwable -> 0x0028 }
            if (r0 == 0) goto L_0x0016
            int r1 = r0.intValue()     // Catch:{ Throwable -> 0x0014 }
            r2 = 19
            if (r1 < r2) goto L_0x0016
            com.google.a.a.a.a.a.a$c r1 = new com.google.a.a.a.a.a.a$c     // Catch:{ Throwable -> 0x0014 }
            r1.<init>()     // Catch:{ Throwable -> 0x0014 }
            goto L_0x0052
        L_0x0014:
            r1 = move-exception
            goto L_0x002a
        L_0x0016:
            boolean r1 = m20182a()     // Catch:{ Throwable -> 0x0014 }
            if (r1 == 0) goto L_0x0022
            com.google.a.a.a.a.a.a$b r1 = new com.google.a.a.a.a.a.a$b     // Catch:{ Throwable -> 0x0014 }
            r1.<init>()     // Catch:{ Throwable -> 0x0014 }
            goto L_0x0052
        L_0x0022:
            com.google.a.a.a.a.a.a$b r1 = new com.google.a.a.a.a.a.a$b     // Catch:{ Throwable -> 0x0014 }
            r1.<init>()     // Catch:{ Throwable -> 0x0014 }
            goto L_0x0052
        L_0x0028:
            r1 = move-exception
            r0 = 0
        L_0x002a:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r3.<init>(r4)
            java.lang.Class<com.google.a.a.a.a.a.a$b> r4 = com.google.p268a.p269a.p270a.p271a.p272a.C6497a.C6499b.class
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.a.a.a.a.a.a$b r1 = new com.google.a.a.a.a.a.a$b
            r1.<init>()
        L_0x0052:
            f18813a = r1
            if (r0 != 0) goto L_0x0058
            r0 = 1
            goto L_0x005c
        L_0x0058:
            int r0 = r0.intValue()
        L_0x005c:
            f18814b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p268a.p269a.p270a.p271a.p272a.C6497a.<clinit>():void");
    }

    /* renamed from: b */
    public static void m20185b(Throwable th) {
        f18813a.mo15865b(th);
    }

    /* renamed from: a */
    public static Throwable[] m20183a(Throwable th) {
        return f18813a.mo15864a(th);
    }

    /* renamed from: a */
    public static void m20179a(Throwable th, PrintStream printStream) {
        f18813a.mo15861a(th, printStream);
    }

    /* renamed from: a */
    public static void m20180a(Throwable th, PrintWriter printWriter) {
        f18813a.mo15862a(th, printWriter);
    }

    /* renamed from: a */
    public static void m20181a(Throwable th, Throwable th2) {
        f18813a.mo15863a(th, th2);
    }
}
