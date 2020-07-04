package com.bytedance.crash.p498g;

import com.bytedance.crash.p501j.C9954g;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.bytedance.crash.g.d */
public final class C9905d {

    /* renamed from: a */
    public static volatile boolean f27024a;

    /* renamed from: b */
    private static volatile boolean f27025b;

    /* renamed from: com.bytedance.crash.g.d$a */
    static class C9907a implements Runnable, UncaughtExceptionHandler {

        /* renamed from: a */
        private volatile UncaughtExceptionHandler f27026a;

        private C9907a() {
        }

        public final void run() {
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != this && defaultUncaughtExceptionHandler != C9901a.m29272a()) {
                this.f27026a = defaultUncaughtExceptionHandler;
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
            if (r2.f27026a != r2) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
            if (r2.f27026a != r2) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
            r2.f27026a.uncaughtException(r3, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                r0 = 1
                com.bytedance.crash.p498g.C9905d.f27024a = r0     // Catch:{ Throwable -> 0x0020, all -> 0x0011 }
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f27026a
                if (r0 == 0) goto L_0x0029
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f27026a
                if (r0 == r2) goto L_0x0029
            L_0x000b:
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f27026a
                r0.uncaughtException(r3, r4)
                return
            L_0x0011:
                r0 = move-exception
                java.lang.Thread$UncaughtExceptionHandler r1 = r2.f27026a
                if (r1 == 0) goto L_0x001f
                java.lang.Thread$UncaughtExceptionHandler r1 = r2.f27026a
                if (r1 == r2) goto L_0x001f
                java.lang.Thread$UncaughtExceptionHandler r1 = r2.f27026a
                r1.uncaughtException(r3, r4)
            L_0x001f:
                throw r0
            L_0x0020:
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f27026a
                if (r0 == 0) goto L_0x0029
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f27026a
                if (r0 == r2) goto L_0x0029
                goto L_0x000b
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p498g.C9905d.C9907a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }

    /* renamed from: a */
    public static void m29293a(int i) {
        if (!f27025b) {
            f27025b = true;
            C9954g.m29460b().mo24597a((Runnable) new C9907a(), 60000);
        }
    }
}
