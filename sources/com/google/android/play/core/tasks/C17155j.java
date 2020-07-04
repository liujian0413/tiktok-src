package com.google.android.play.core.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.play.core.tasks.j */
final class C17155j<TResult> {

    /* renamed from: a */
    private final Object f47884a = new Object();

    /* renamed from: b */
    private Queue<C17156k<TResult>> f47885b;

    /* renamed from: c */
    private boolean f47886c;

    C17155j() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f47884a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (com.google.android.play.core.tasks.C17156k) r2.f47885b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f47886c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo44424a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44426a(com.google.android.play.core.tasks.C17147c<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f47884a
            monitor-enter(r0)
            java.util.Queue<com.google.android.play.core.tasks.k<TResult>> r1 = r2.f47885b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f47886c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f47886c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f47884a
            monitor-enter(r1)
            java.util.Queue<com.google.android.play.core.tasks.k<TResult>> r0 = r2.f47885b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            com.google.android.play.core.tasks.k r0 = (com.google.android.play.core.tasks.C17156k) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f47886c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo44424a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.tasks.C17155j.mo44426a(com.google.android.play.core.tasks.c):void");
    }

    /* renamed from: a */
    public final void mo44427a(C17156k<TResult> kVar) {
        synchronized (this.f47884a) {
            if (this.f47885b == null) {
                this.f47885b = new ArrayDeque();
            }
            this.f47885b.add(kVar);
        }
    }
}
