package p346io.reactivex.p354j;

import p346io.reactivex.C7498y;
import p346io.reactivex.internal.util.C47832a;
import p346io.reactivex.internal.util.C47832a.C7485a;
import p346io.reactivex.internal.util.NotificationLite;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.j.d */
final class C7488d<T> extends C7489f<T> implements C7485a<Object> {

    /* renamed from: a */
    final C7489f<T> f20844a;

    /* renamed from: b */
    boolean f20845b;

    /* renamed from: c */
    C47832a<Object> f20846c;

    /* renamed from: d */
    volatile boolean f20847d;

    /* renamed from: a */
    private void m23230a() {
        C47832a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f20846c;
                if (aVar == null) {
                    this.f20845b = false;
                    return;
                }
                this.f20846c = null;
            }
            aVar.mo119910a((C7485a<? super T>) this);
        }
        while (true) {
        }
    }

    public final void onComplete() {
        if (!this.f20847d) {
            synchronized (this) {
                if (!this.f20847d) {
                    this.f20847d = true;
                    if (this.f20845b) {
                        C47832a<Object> aVar = this.f20846c;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f20846c = aVar;
                        }
                        aVar.mo119911a(NotificationLite.complete());
                        return;
                    }
                    this.f20845b = true;
                    this.f20844a.onComplete();
                }
            }
        }
    }

    C7488d(C7489f<T> fVar) {
        this.f20844a = fVar;
    }

    /* renamed from: a */
    public final boolean mo9283a(Object obj) {
        return NotificationLite.acceptFull(obj, (C7498y<? super T>) this.f20844a);
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20844a.mo19189a(yVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p346io.reactivex.p350f.C7332a.m23029a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f20844a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f20847d
            if (r0 == 0) goto L_0x0008
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f20847d     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f20847d = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f20845b     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f20846c     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f20846c = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p346io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x003b }
            r0.mo119914b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f20845b = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x0035:
            io.reactivex.j.f<T> r0 = r2.f20844a
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.p354j.C7488d.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f20847d) {
            synchronized (this) {
                if (!this.f20847d) {
                    if (this.f20845b) {
                        C47832a<Object> aVar = this.f20846c;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f20846c = aVar;
                        }
                        aVar.mo119911a(NotificationLite.next(t));
                        return;
                    }
                    this.f20845b = true;
                    this.f20844a.onNext(t);
                    m23230a();
                }
            }
        }
    }

    public final void onSubscribe(C7321c cVar) {
        boolean z = true;
        if (!this.f20847d) {
            synchronized (this) {
                if (!this.f20847d) {
                    if (this.f20845b) {
                        C47832a<Object> aVar = this.f20846c;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f20846c = aVar;
                        }
                        aVar.mo119911a(NotificationLite.disposable(cVar));
                        return;
                    }
                    this.f20845b = true;
                    z = false;
                }
            }
        }
        if (z) {
            cVar.dispose();
            return;
        }
        this.f20844a.onSubscribe(cVar);
        m23230a();
    }
}
