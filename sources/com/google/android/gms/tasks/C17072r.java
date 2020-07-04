package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.r */
final class C17072r<TResult> implements C17076v<TResult> {

    /* renamed from: a */
    private final Executor f47752a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f47753b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17055d f47754c;

    public C17072r(Executor executor, C17055d dVar) {
        this.f47752a = executor;
        this.f47754c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.f47752a.execute(new com.google.android.gms.tasks.C17073s(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44305a(com.google.android.gms.tasks.C17057f<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo44294b()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.mo44295c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.f47753b
            monitor-enter(r0)
            com.google.android.gms.tasks.d r1 = r2.f47754c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.f47752a
            com.google.android.gms.tasks.s r1 = new com.google.android.gms.tasks.s
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C17072r.mo44305a(com.google.android.gms.tasks.f):void");
    }
}
