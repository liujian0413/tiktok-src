package com.bytedance.crash.upload;

import android.content.Context;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p501j.C9943d;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p504l.C9972a;

/* renamed from: com.bytedance.crash.upload.e */
public final class C10024e implements Runnable {

    /* renamed from: a */
    private Context f27288a;

    /* renamed from: a */
    public static boolean m29788a() {
        if (C9943d.m29423a().f27134a || !C9972a.m29506b(C9918j.m29342g())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        if (com.bytedance.crash.p501j.C9954g.m29460b().f27195d == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (com.bytedance.crash.p501j.C9954g.m29460b().f27195d != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        com.bytedance.crash.p503k.C9971d.m29496a(com.bytedance.crash.p501j.C9954g.m29460b().f27195d, r3.f27288a).mo24604a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f27288a     // Catch:{ Throwable -> 0x0068, all -> 0x0040 }
            boolean r0 = com.bytedance.crash.p504l.C9972a.m29506b(r0)     // Catch:{ Throwable -> 0x0068, all -> 0x0040 }
            if (r0 == 0) goto L_0x0016
            com.bytedance.crash.j.d r0 = com.bytedance.crash.p501j.C9943d.m29423a()     // Catch:{ Throwable -> 0x0068, all -> 0x0040 }
            android.content.Context r1 = r3.f27288a     // Catch:{ Throwable -> 0x0068, all -> 0x0040 }
            boolean r1 = com.bytedance.crash.p504l.C9993n.m29622b(r1)     // Catch:{ Throwable -> 0x0068, all -> 0x0040 }
            r0.mo24563a(r1)     // Catch:{ Throwable -> 0x0068, all -> 0x0040 }
            goto L_0x0019
        L_0x0016:
            com.bytedance.crash.nativecrash.NativeImpl.m29699i()     // Catch:{ Throwable -> 0x0068, all -> 0x0040 }
        L_0x0019:
            com.bytedance.crash.j.i r0 = com.bytedance.crash.p501j.C9957i.m29466a()
            com.bytedance.crash.j.a r1 = com.bytedance.crash.C9918j.m29332a()
            java.util.Map r1 = r1.mo24526b()
            r0.mo24584a(r1)
            com.bytedance.crash.j.k r0 = com.bytedance.crash.p501j.C9954g.m29460b()
            android.os.Handler r0 = r0.f27195d
            if (r0 == 0) goto L_0x0081
        L_0x0030:
            com.bytedance.crash.j.k r0 = com.bytedance.crash.p501j.C9954g.m29460b()
            android.os.Handler r0 = r0.f27195d
            android.content.Context r1 = r3.f27288a
            com.bytedance.crash.k.d r0 = com.bytedance.crash.p503k.C9971d.m29496a(r0, r1)
            r0.mo24604a()
            return
        L_0x0040:
            r0 = move-exception
            com.bytedance.crash.j.i r1 = com.bytedance.crash.p501j.C9957i.m29466a()
            com.bytedance.crash.j.a r2 = com.bytedance.crash.C9918j.m29332a()
            java.util.Map r2 = r2.mo24526b()
            r1.mo24584a(r2)
            com.bytedance.crash.j.k r1 = com.bytedance.crash.p501j.C9954g.m29460b()
            android.os.Handler r1 = r1.f27195d
            if (r1 == 0) goto L_0x0067
            com.bytedance.crash.j.k r1 = com.bytedance.crash.p501j.C9954g.m29460b()
            android.os.Handler r1 = r1.f27195d
            android.content.Context r2 = r3.f27288a
            com.bytedance.crash.k.d r1 = com.bytedance.crash.p503k.C9971d.m29496a(r1, r2)
            r1.mo24604a()
        L_0x0067:
            throw r0
        L_0x0068:
            com.bytedance.crash.j.i r0 = com.bytedance.crash.p501j.C9957i.m29466a()
            com.bytedance.crash.j.a r1 = com.bytedance.crash.C9918j.m29332a()
            java.util.Map r1 = r1.mo24526b()
            r0.mo24584a(r1)
            com.bytedance.crash.j.k r0 = com.bytedance.crash.p501j.C9954g.m29460b()
            android.os.Handler r0 = r0.f27195d
            if (r0 == 0) goto L_0x0081
            goto L_0x0030
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.C10024e.run():void");
    }

    private C10024e(Context context) {
        this.f27288a = context;
    }

    /* renamed from: a */
    public static void m29786a(Context context) {
        m29787a(context, 0);
    }

    /* renamed from: a */
    private static void m29787a(Context context, int i) {
        C9954g.m29460b().mo24597a((Runnable) new C10024e(context), 0);
    }
}
