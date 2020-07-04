package p346io.reactivex.p1869g;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.internal.util.C47832a;
import p346io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.g.c */
final class C47584c<T> extends C47581a<T> {

    /* renamed from: a */
    final C47581a<T> f122024a;

    /* renamed from: c */
    boolean f122025c;

    /* renamed from: d */
    C47832a<Object> f122026d;

    /* renamed from: e */
    volatile boolean f122027e;

    /* renamed from: h */
    private void m148374h() {
        C47832a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f122026d;
                if (aVar == null) {
                    this.f122025c = false;
                    return;
                }
                this.f122026d = null;
            }
            aVar.mo119913a((C48293c<? super U>) this.f122024a);
        }
        while (true) {
        }
    }

    public final void onComplete() {
        if (!this.f122027e) {
            synchronized (this) {
                if (!this.f122027e) {
                    this.f122027e = true;
                    if (this.f122025c) {
                        C47832a<Object> aVar = this.f122026d;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f122026d = aVar;
                        }
                        aVar.mo119911a(NotificationLite.complete());
                        return;
                    }
                    this.f122025c = true;
                    this.f122024a.onComplete();
                }
            }
        }
    }

    C47584c(C47581a<T> aVar) {
        this.f122024a = aVar;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f122024a.mo19155a(cVar);
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
        r2.f122024a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f122027e
            if (r0 == 0) goto L_0x0008
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f122027e     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f122027e = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f122025c     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f122026d     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f122026d = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p346io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x003b }
            r0.mo119914b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f122025c = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x0035:
            io.reactivex.g.a<T> r0 = r2.f122024a
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.p1869g.C47584c.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f122027e) {
            synchronized (this) {
                if (!this.f122027e) {
                    if (this.f122025c) {
                        C47832a<Object> aVar = this.f122026d;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f122026d = aVar;
                        }
                        aVar.mo119911a(NotificationLite.next(t));
                        return;
                    }
                    this.f122025c = true;
                    this.f122024a.onNext(t);
                    m148374h();
                }
            }
        }
    }

    public final void onSubscribe(C48294d dVar) {
        boolean z = true;
        if (!this.f122027e) {
            synchronized (this) {
                if (!this.f122027e) {
                    if (this.f122025c) {
                        C47832a<Object> aVar = this.f122026d;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f122026d = aVar;
                        }
                        aVar.mo119911a(NotificationLite.subscription(dVar));
                        return;
                    }
                    this.f122025c = true;
                    z = false;
                }
            }
        }
        if (z) {
            dVar.cancel();
            return;
        }
        this.f122024a.onSubscribe(dVar);
        m148374h();
    }
}
