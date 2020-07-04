package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.ax */
final class C16824ax extends Thread {

    /* renamed from: a */
    private final Object f46994a = new Object();

    /* renamed from: b */
    private final BlockingQueue<C16823aw<?>> f46995b;

    /* renamed from: c */
    private final /* synthetic */ C16820at f46996c;

    public C16824ax(C16820at atVar, String str, BlockingQueue<C16823aw<?>> blockingQueue) {
        this.f46996c = atVar;
        C15267r.m44384a(str);
        C15267r.m44384a(blockingQueue);
        this.f46995b = blockingQueue;
        setName(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        r1 = r6.f46996c.f46985g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.f46996c.f46986h.release();
        r6.f46996c.f46985g.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r6 != r6.f46996c.f46979a) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        r6.f46996c.f46979a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (r6 != r6.f46996c.f46980b) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        r6.f46996c.f46980b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r6.f46996c.mo43585q().f47487a.mo44160a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.at r1 = r6.f46996c     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f46986h     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r6.m55495a(r1)
            goto L_0x0001
        L_0x0013:
            r0 = 0
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x00b5 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x00b5 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.aw<?>> r2 = r6.f46995b     // Catch:{ all -> 0x00b5 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.aw r2 = (com.google.android.gms.measurement.internal.C16823aw) r2     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f46990a     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002e
        L_0x002c:
            r3 = 10
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x00b5 }
            r2.run()     // Catch:{ all -> 0x00b5 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f46994a     // Catch:{ all -> 0x00b5 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.aw<?>> r3 = r6.f46995b     // Catch:{ all -> 0x00b2 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x0054
            com.google.android.gms.measurement.internal.at r3 = r6.f46996c     // Catch:{ all -> 0x00b2 }
            boolean r3 = r3.f46987i     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x0054
            java.lang.Object r3 = r6.f46994a     // Catch:{ InterruptedException -> 0x0050 }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6.m55495a(r3)     // Catch:{ all -> 0x00b2 }
        L_0x0054:
            monitor-exit(r2)     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c     // Catch:{ all -> 0x00b5 }
            java.lang.Object r2 = r2.f46985g     // Catch:{ all -> 0x00b5 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.aw<?>> r3 = r6.f46995b     // Catch:{ all -> 0x00af }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00af }
            if (r3 != 0) goto L_0x00ac
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            com.google.android.gms.measurement.internal.at r1 = r6.f46996c
            java.lang.Object r1 = r1.f46985g
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.Semaphore r2 = r2.f46986h     // Catch:{ all -> 0x00a9 }
            r2.release()     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c     // Catch:{ all -> 0x00a9 }
            java.lang.Object r2 = r2.f46985g     // Catch:{ all -> 0x00a9 }
            r2.notifyAll()     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.measurement.internal.ax r2 = r2.f46979a     // Catch:{ all -> 0x00a9 }
            if (r6 != r2) goto L_0x008c
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c     // Catch:{ all -> 0x00a9 }
            r2.f46979a = null     // Catch:{ all -> 0x00a9 }
            goto L_0x00a7
        L_0x008c:
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.measurement.internal.ax r2 = r2.f46980b     // Catch:{ all -> 0x00a9 }
            if (r6 != r2) goto L_0x009a
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c     // Catch:{ all -> 0x00a9 }
            r2.f46980b = null     // Catch:{ all -> 0x00a9 }
            goto L_0x00a7
        L_0x009a:
            com.google.android.gms.measurement.internal.at r0 = r6.f46996c     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r0.mo44160a(r2)     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            goto L_0x001c
        L_0x00af:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            com.google.android.gms.measurement.internal.at r2 = r6.f46996c
            java.lang.Object r2 = r2.f46985g
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.at r3 = r6.f46996c     // Catch:{ all -> 0x00fa }
            java.util.concurrent.Semaphore r3 = r3.f46986h     // Catch:{ all -> 0x00fa }
            r3.release()     // Catch:{ all -> 0x00fa }
            com.google.android.gms.measurement.internal.at r3 = r6.f46996c     // Catch:{ all -> 0x00fa }
            java.lang.Object r3 = r3.f46985g     // Catch:{ all -> 0x00fa }
            r3.notifyAll()     // Catch:{ all -> 0x00fa }
            com.google.android.gms.measurement.internal.at r3 = r6.f46996c     // Catch:{ all -> 0x00fa }
            com.google.android.gms.measurement.internal.ax r3 = r3.f46979a     // Catch:{ all -> 0x00fa }
            if (r6 == r3) goto L_0x00f3
            com.google.android.gms.measurement.internal.at r3 = r6.f46996c     // Catch:{ all -> 0x00fa }
            com.google.android.gms.measurement.internal.ax r3 = r3.f46980b     // Catch:{ all -> 0x00fa }
            if (r6 != r3) goto L_0x00e5
            com.google.android.gms.measurement.internal.at r3 = r6.f46996c     // Catch:{ all -> 0x00fa }
            r3.f46980b = null     // Catch:{ all -> 0x00fa }
            goto L_0x00f8
        L_0x00e5:
            com.google.android.gms.measurement.internal.at r0 = r6.f46996c     // Catch:{ all -> 0x00fa }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x00fa }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "Current scheduler thread is neither worker nor network"
            r0.mo44160a(r3)     // Catch:{ all -> 0x00fa }
            goto L_0x00f8
        L_0x00f3:
            com.google.android.gms.measurement.internal.at r3 = r6.f46996c     // Catch:{ all -> 0x00fa }
            r3.f46979a = null     // Catch:{ all -> 0x00fa }
        L_0x00f8:
            monitor-exit(r2)     // Catch:{ all -> 0x00fa }
            throw r1
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16824ax.run():void");
    }

    /* renamed from: a */
    public final void mo43652a() {
        synchronized (this.f46994a) {
            this.f46994a.notifyAll();
        }
    }

    /* renamed from: a */
    private final void m55495a(InterruptedException interruptedException) {
        this.f46996c.mo43585q().f47490d.mo44161a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
