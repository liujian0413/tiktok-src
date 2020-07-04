package android.support.p022v4.p027os;

import android.os.Build.VERSION;
import android.os.CancellationSignal;

/* renamed from: android.support.v4.os.b */
public final class C0879b {

    /* renamed from: a */
    private boolean f3101a;

    /* renamed from: b */
    private C0880a f3102b;

    /* renamed from: c */
    private Object f3103c;

    /* renamed from: d */
    private boolean f3104d;

    /* renamed from: android.support.v4.os.b$a */
    public interface C0880a {
        /* renamed from: a */
        void mo3282a();
    }

    /* renamed from: a */
    public final boolean mo3278a() {
        boolean z;
        synchronized (this) {
            z = this.f3101a;
        }
        return z;
    }

    /* renamed from: e */
    private void m3741e() {
        while (this.f3104d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo3279b() {
        if (mo3278a()) {
            throw new OperationCanceledException();
        }
    }

    /* renamed from: d */
    public final Object mo3281d() {
        Object obj;
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f3103c == null) {
                this.f3103c = new CancellationSignal();
                if (this.f3101a) {
                    ((CancellationSignal) this.f3103c).cancel();
                }
            }
            obj = this.f3103c;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo3282a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f3104d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f3104d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3280c() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f3101a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f3101a = r0     // Catch:{ all -> 0x003e }
            r4.f3104d = r0     // Catch:{ all -> 0x003e }
            android.support.v4.os.b$a r0 = r4.f3102b     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f3103c     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.mo3282a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.f3104d = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.f3104d = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.p027os.C0879b.mo3280c():void");
    }

    /* renamed from: a */
    public final void mo3277a(C0880a aVar) {
        synchronized (this) {
            m3741e();
            if (this.f3102b != aVar) {
                this.f3102b = aVar;
                if (this.f3101a) {
                    if (aVar != null) {
                        aVar.mo3282a();
                    }
                }
            }
        }
    }
}
