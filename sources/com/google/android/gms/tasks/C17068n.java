package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.n */
final class C17068n<TResult> implements C17076v<TResult> {

    /* renamed from: a */
    private final Executor f47743a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f47744b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17053b f47745c;

    public C17068n(Executor executor, C17053b bVar) {
        this.f47743a = executor;
        this.f47745c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f47743a.execute(new com.google.android.gms.tasks.C17069o(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44305a(com.google.android.gms.tasks.C17057f r2) {
        /*
            r1 = this;
            boolean r2 = r2.mo44295c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f47744b
            monitor-enter(r2)
            com.google.android.gms.tasks.b r0 = r1.f47745c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f47743a
            com.google.android.gms.tasks.o r0 = new com.google.android.gms.tasks.o
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C17068n.mo44305a(com.google.android.gms.tasks.f):void");
    }
}
