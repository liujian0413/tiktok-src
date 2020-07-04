package p346io.reactivex.p1873k;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47832a;
import p346io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.k.b */
public final class C47853b<T> implements C47597i<T>, C48294d {

    /* renamed from: a */
    final C48293c<? super T> f122667a;

    /* renamed from: b */
    final boolean f122668b;

    /* renamed from: c */
    C48294d f122669c;

    /* renamed from: d */
    boolean f122670d;

    /* renamed from: e */
    C47832a<Object> f122671e;

    /* renamed from: f */
    volatile boolean f122672f;

    public final void cancel() {
        this.f122669c.cancel();
    }

    /* renamed from: a */
    private void m148770a() {
        C47832a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f122671e;
                if (aVar == null) {
                    this.f122670d = false;
                    return;
                }
                this.f122671e = null;
            }
        } while (!aVar.mo119913a(this.f122667a));
    }

    public final void onComplete() {
        if (!this.f122672f) {
            synchronized (this) {
                if (!this.f122672f) {
                    if (this.f122670d) {
                        C47832a<Object> aVar = this.f122671e;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f122671e = aVar;
                        }
                        aVar.mo119911a(NotificationLite.complete());
                        return;
                    }
                    this.f122672f = true;
                    this.f122670d = true;
                    this.f122667a.onComplete();
                }
            }
        }
    }

    public C47853b(C48293c<? super T> cVar) {
        this(cVar, false);
    }

    public final void request(long j) {
        this.f122669c.request(j);
    }

    public final void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.validate(this.f122669c, dVar)) {
            this.f122669c = dVar;
            this.f122667a.onSubscribe(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p346io.reactivex.p350f.C7332a.m23029a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f122667a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f122672f
            if (r0 == 0) goto L_0x0008
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f122672f     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f122670d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f122672f = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f122671e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f122671e = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p346io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f122668b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo119911a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo119914b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f122672f = r1     // Catch:{ all -> 0x0044 }
            r2.f122670d = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x003e:
            org.a.c<? super T> r0 = r2.f122667a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.p1873k.C47853b.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f122672f) {
            if (t == null) {
                this.f122669c.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f122672f) {
                    if (this.f122670d) {
                        C47832a<Object> aVar = this.f122671e;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f122671e = aVar;
                        }
                        aVar.mo119911a(NotificationLite.next(t));
                        return;
                    }
                    this.f122670d = true;
                    this.f122667a.onNext(t);
                    m148770a();
                }
            }
        }
    }

    private C47853b(C48293c<? super T> cVar, boolean z) {
        this.f122667a = cVar;
        this.f122668b = false;
    }
}
