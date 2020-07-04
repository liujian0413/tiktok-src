package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.t */
final class C17074t<TResult> implements C17076v<TResult> {

    /* renamed from: a */
    private final Executor f47757a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f47758b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17056e<? super TResult> f47759c;

    public C17074t(Executor executor, C17056e<? super TResult> eVar) {
        this.f47757a = executor;
        this.f47759c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f47757a.execute(new com.google.android.gms.tasks.C17075u(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44305a(com.google.android.gms.tasks.C17057f<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo44294b()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f47758b
            monitor-enter(r0)
            com.google.android.gms.tasks.e<? super TResult> r1 = r2.f47759c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f47757a
            com.google.android.gms.tasks.u r1 = new com.google.android.gms.tasks.u
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C17074t.mo44305a(com.google.android.gms.tasks.f):void");
    }
}
