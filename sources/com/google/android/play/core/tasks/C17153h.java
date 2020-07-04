package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.h */
final class C17153h<TResult> implements C17156k<TResult> {

    /* renamed from: a */
    private final Executor f47879a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f47880b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17146b<? super TResult> f47881c;

    public C17153h(Executor executor, C17146b<? super TResult> bVar) {
        this.f47879a = executor;
        this.f47881c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f47879a.execute(new com.google.android.play.core.tasks.C17154i(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44424a(com.google.android.play.core.tasks.C17147c<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo44419b()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f47880b
            monitor-enter(r0)
            com.google.android.play.core.tasks.b<? super TResult> r1 = r2.f47881c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f47879a
            com.google.android.play.core.tasks.i r1 = new com.google.android.play.core.tasks.i
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.tasks.C17153h.mo44424a(com.google.android.play.core.tasks.c):void");
    }
}
