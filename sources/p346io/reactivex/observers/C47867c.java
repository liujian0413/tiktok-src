package p346io.reactivex.observers;

import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.util.C47832a;
import p346io.reactivex.internal.util.NotificationLite;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.observers.c */
public final class C47867c<T> implements C7321c, C7498y<T> {

    /* renamed from: a */
    final C7498y<? super T> f122675a;

    /* renamed from: b */
    final boolean f122676b;

    /* renamed from: c */
    C7321c f122677c;

    /* renamed from: d */
    boolean f122678d;

    /* renamed from: e */
    C47832a<Object> f122679e;

    /* renamed from: f */
    volatile boolean f122680f;

    public final void dispose() {
        this.f122677c.dispose();
    }

    public final boolean isDisposed() {
        return this.f122677c.isDisposed();
    }

    /* renamed from: a */
    private void m148775a() {
        C47832a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f122679e;
                if (aVar == null) {
                    this.f122678d = false;
                    return;
                }
                this.f122679e = null;
            }
        } while (!aVar.mo119912a(this.f122675a));
    }

    public final void onComplete() {
        if (!this.f122680f) {
            synchronized (this) {
                if (!this.f122680f) {
                    if (this.f122678d) {
                        C47832a<Object> aVar = this.f122679e;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f122679e = aVar;
                        }
                        aVar.mo119911a(NotificationLite.complete());
                        return;
                    }
                    this.f122680f = true;
                    this.f122678d = true;
                    this.f122675a.onComplete();
                }
            }
        }
    }

    public C47867c(C7498y<? super T> yVar) {
        this(yVar, false);
    }

    public final void onSubscribe(C7321c cVar) {
        if (DisposableHelper.validate(this.f122677c, cVar)) {
            this.f122677c = cVar;
            this.f122675a.onSubscribe(this);
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
        r2.f122675a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f122680f
            if (r0 == 0) goto L_0x0008
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f122680f     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f122678d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f122680f = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f122679e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f122679e = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p346io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f122676b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo119911a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo119914b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f122680f = r1     // Catch:{ all -> 0x0044 }
            r2.f122678d = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p346io.reactivex.p350f.C7332a.m23029a(r3)
            return
        L_0x003e:
            io.reactivex.y<? super T> r0 = r2.f122675a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.observers.C47867c.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f122680f) {
            if (t == null) {
                this.f122677c.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f122680f) {
                    if (this.f122678d) {
                        C47832a<Object> aVar = this.f122679e;
                        if (aVar == null) {
                            aVar = new C47832a<>(4);
                            this.f122679e = aVar;
                        }
                        aVar.mo119911a(NotificationLite.next(t));
                        return;
                    }
                    this.f122678d = true;
                    this.f122675a.onNext(t);
                    m148775a();
                }
            }
        }
    }

    private C47867c(C7498y<? super T> yVar, boolean z) {
        this.f122675a = yVar;
        this.f122676b = false;
    }
}
