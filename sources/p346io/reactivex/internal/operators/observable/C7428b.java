package p346io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.observers.C47613f;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.queue.C47789a;
import p346io.reactivex.internal.util.C47842j;
import p346io.reactivex.observers.C47867c;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.b */
public final class C7428b<T, U extends Collection<? super T>> extends C7376a<T, U> {

    /* renamed from: b */
    final long f20597b;

    /* renamed from: c */
    final long f20598c;

    /* renamed from: d */
    final TimeUnit f20599d;

    /* renamed from: e */
    final C7499z f20600e;

    /* renamed from: f */
    final Callable<U> f20601f;

    /* renamed from: g */
    final int f20602g;

    /* renamed from: h */
    final boolean f20603h;

    /* renamed from: io.reactivex.internal.operators.observable.b$a */
    static final class C7429a<T, U extends Collection<? super T>> extends C47613f<T, U, U> implements C7321c, Runnable {

        /* renamed from: g */
        final Callable<U> f20604g;

        /* renamed from: h */
        final long f20605h;

        /* renamed from: i */
        final TimeUnit f20606i;

        /* renamed from: j */
        final int f20607j;

        /* renamed from: k */
        final boolean f20608k;

        /* renamed from: l */
        final C7502c f20609l;

        /* renamed from: m */
        U f20610m;

        /* renamed from: n */
        C7321c f20611n;

        /* renamed from: o */
        C7321c f20612o;

        /* renamed from: p */
        long f20613p;

        /* renamed from: q */
        long f20614q;

        public final boolean isDisposed() {
            return this.f122066c;
        }

        public final void dispose() {
            if (!this.f122066c) {
                this.f122066c = true;
                this.f20612o.dispose();
                this.f20609l.dispose();
                synchronized (this) {
                    this.f20610m = null;
                }
            }
        }

        public final void onComplete() {
            U u;
            this.f20609l.dispose();
            synchronized (this) {
                u = this.f20610m;
                this.f20610m = null;
            }
            this.f122065b.offer(u);
            this.f122067d = true;
            if (mo119712c()) {
                C47842j.m148738a(this.f122065b, this.f122064a, false, this, this);
            }
        }

        public final void run() {
            try {
                U u = (Collection) C7364b.m23081a(this.f20604g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.f20610m;
                    if (u2 != null) {
                        if (this.f20613p == this.f20614q) {
                            this.f20610m = u;
                            mo119710b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                dispose();
                this.f122064a.onError(th);
            }
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.f20610m = null;
            }
            this.f122064a.onError(th);
            this.f20609l.dispose();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.f20608k == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.f20611n.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            mo119710b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = (java.util.Collection) p346io.reactivex.internal.p352a.C7364b.m23081a(r7.f20604g.call(), "The buffer supplied is null");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.f20610m = r8;
            r7.f20614q++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
            if (r7.f20608k == false) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r7.f20611n = r7.f20609l.mo19343a(r7, r7.f20605h, r7.f20605h, r7.f20606i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
            p346io.reactivex.exceptions.C7331a.m23009b(r8);
            r7.f122064a.onError(r8);
            dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.f20610m     // Catch:{ all -> 0x0068 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0068 }
                int r8 = r0.size()     // Catch:{ all -> 0x0068 }
                int r1 = r7.f20607j     // Catch:{ all -> 0x0068 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                return
            L_0x0014:
                r8 = 0
                r7.f20610m = r8     // Catch:{ all -> 0x0068 }
                long r1 = r7.f20613p     // Catch:{ all -> 0x0068 }
                r3 = 1
                long r1 = r1 + r3
                r7.f20613p = r1     // Catch:{ all -> 0x0068 }
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                boolean r8 = r7.f20608k
                if (r8 == 0) goto L_0x0028
                io.reactivex.b.c r8 = r7.f20611n
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.mo119710b(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.f20604g     // Catch:{ Throwable -> 0x005b }
                java.lang.Object r8 = r8.call()     // Catch:{ Throwable -> 0x005b }
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = p346io.reactivex.internal.p352a.C7364b.m23081a(r8, r0)     // Catch:{ Throwable -> 0x005b }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ Throwable -> 0x005b }
                monitor-enter(r7)
                r7.f20610m = r8     // Catch:{ all -> 0x0058 }
                long r0 = r7.f20614q     // Catch:{ all -> 0x0058 }
                r8 = 0
                long r0 = r0 + r3
                r7.f20614q = r0     // Catch:{ all -> 0x0058 }
                monitor-exit(r7)     // Catch:{ all -> 0x0058 }
                boolean r8 = r7.f20608k
                if (r8 == 0) goto L_0x0057
                io.reactivex.z$c r0 = r7.f20609l
                long r2 = r7.f20605h
                long r4 = r7.f20605h
                java.util.concurrent.TimeUnit r6 = r7.f20606i
                r1 = r7
                io.reactivex.b.c r8 = r0.mo19343a(r1, r2, r4, r6)
                r7.f20611n = r8
            L_0x0057:
                return
            L_0x0058:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0058 }
                throw r8
            L_0x005b:
                r8 = move-exception
                p346io.reactivex.exceptions.C7331a.m23009b(r8)
                io.reactivex.y r0 = r7.f122064a
                r0.onError(r8)
                r7.dispose()
                return
            L_0x0068:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.operators.observable.C7428b.C7429a.onNext(java.lang.Object):void");
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20612o, cVar)) {
                this.f20612o = cVar;
                try {
                    this.f20610m = (Collection) C7364b.m23081a(this.f20604g.call(), "The buffer supplied is null");
                    this.f122064a.onSubscribe(this);
                    this.f20611n = this.f20609l.mo19343a(this, this.f20605h, this.f20605h, this.f20606i);
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    cVar.dispose();
                    EmptyDisposable.error(th, this.f122064a);
                    this.f20609l.dispose();
                }
            }
        }

        /* renamed from: a */
        private static void m23149a(C7498y<? super U> yVar, U u) {
            yVar.onNext(u);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo19216a(C7498y yVar, Object obj) {
            m23149a(yVar, (U) (Collection) obj);
        }

        C7429a(C7498y<? super U> yVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, C7502c cVar) {
            super(yVar, new C47789a());
            this.f20604g = callable;
            this.f20605h = j;
            this.f20606i = timeUnit;
            this.f20607j = i;
            this.f20608k = z;
            this.f20609l = cVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.b$b */
    static final class C7430b<T, U extends Collection<? super T>> extends C47613f<T, U, U> implements C7321c, Runnable {

        /* renamed from: g */
        final Callable<U> f20615g;

        /* renamed from: h */
        final long f20616h;

        /* renamed from: i */
        final TimeUnit f20617i;

        /* renamed from: j */
        final C7499z f20618j;

        /* renamed from: k */
        C7321c f20619k;

        /* renamed from: l */
        U f20620l;

        /* renamed from: m */
        final AtomicReference<C7321c> f20621m = new AtomicReference<>();

        public final void dispose() {
            DisposableHelper.dispose(this.f20621m);
            this.f20619k.dispose();
        }

        public final boolean isDisposed() {
            if (this.f20621m.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.f20620l;
                this.f20620l = null;
            }
            if (u != null) {
                this.f122065b.offer(u);
                this.f122067d = true;
                if (mo119712c()) {
                    C47842j.m148738a(this.f122065b, this.f122064a, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f20621m);
        }

        public final void run() {
            U u;
            try {
                U u2 = (Collection) C7364b.m23081a(this.f20615g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.f20620l;
                    if (u != null) {
                        this.f20620l = u2;
                    }
                }
                if (u == null) {
                    DisposableHelper.dispose(this.f20621m);
                } else {
                    mo119708a(u, false, this);
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f122064a.onError(th);
                dispose();
            }
        }

        public final void onNext(T t) {
            synchronized (this) {
                U u = this.f20620l;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.f20620l = null;
            }
            this.f122064a.onError(th);
            DisposableHelper.dispose(this.f20621m);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20619k, cVar)) {
                this.f20619k = cVar;
                try {
                    this.f20620l = (Collection) C7364b.m23081a(this.f20615g.call(), "The buffer supplied is null");
                    this.f122064a.onSubscribe(this);
                    if (!this.f122066c) {
                        C7321c a = this.f20618j.mo19336a(this, this.f20616h, this.f20616h, this.f20617i);
                        if (!this.f20621m.compareAndSet(null, a)) {
                            a.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    dispose();
                    EmptyDisposable.error(th, this.f122064a);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo19216a(C7498y<? super U> yVar, U u) {
            this.f122064a.onNext(u);
        }

        C7430b(C7498y<? super U> yVar, Callable<U> callable, long j, TimeUnit timeUnit, C7499z zVar) {
            super(yVar, new C47789a());
            this.f20615g = callable;
            this.f20616h = j;
            this.f20617i = timeUnit;
            this.f20618j = zVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.b$c */
    static final class C7431c<T, U extends Collection<? super T>> extends C47613f<T, U, U> implements C7321c, Runnable {

        /* renamed from: g */
        final Callable<U> f20622g;

        /* renamed from: h */
        final long f20623h;

        /* renamed from: i */
        final long f20624i;

        /* renamed from: j */
        final TimeUnit f20625j;

        /* renamed from: k */
        final C7502c f20626k;

        /* renamed from: l */
        final List<U> f20627l = new LinkedList();

        /* renamed from: m */
        C7321c f20628m;

        /* renamed from: io.reactivex.internal.operators.observable.b$c$a */
        final class C7432a implements Runnable {

            /* renamed from: b */
            private final U f20630b;

            public final void run() {
                synchronized (C7431c.this) {
                    C7431c.this.f20627l.remove(this.f20630b);
                }
                C7431c.this.mo119710b(this.f20630b, false, C7431c.this.f20626k);
            }

            C7432a(U u) {
                this.f20630b = u;
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.b$c$b */
        final class C7433b implements Runnable {

            /* renamed from: b */
            private final U f20632b;

            public final void run() {
                synchronized (C7431c.this) {
                    C7431c.this.f20627l.remove(this.f20632b);
                }
                C7431c.this.mo119710b(this.f20632b, false, C7431c.this.f20626k);
            }

            C7433b(U u) {
                this.f20632b = u;
            }
        }

        public final boolean isDisposed() {
            return this.f122066c;
        }

        /* renamed from: e */
        private void m23154e() {
            synchronized (this) {
                this.f20627l.clear();
            }
        }

        public final void dispose() {
            if (!this.f122066c) {
                this.f122066c = true;
                m23154e();
                this.f20628m.dispose();
                this.f20626k.dispose();
            }
        }

        public final void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.f20627l);
                this.f20627l.clear();
            }
            for (Collection offer : arrayList) {
                this.f122065b.offer(offer);
            }
            this.f122067d = true;
            if (mo119712c()) {
                C47842j.m148738a(this.f122065b, this.f122064a, false, this.f20626k, this);
            }
        }

        public final void run() {
            if (!this.f122066c) {
                try {
                    Collection collection = (Collection) C7364b.m23081a(this.f20622g.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (!this.f122066c) {
                            this.f20627l.add(collection);
                            this.f20626k.mo19344a(new C7432a(collection), this.f20623h, this.f20625j);
                        }
                    }
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    this.f122064a.onError(th);
                    dispose();
                }
            }
        }

        public final void onError(Throwable th) {
            this.f122067d = true;
            m23154e();
            this.f122064a.onError(th);
            this.f20626k.dispose();
        }

        public final void onNext(T t) {
            synchronized (this) {
                for (U add : this.f20627l) {
                    add.add(t);
                }
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20628m, cVar)) {
                this.f20628m = cVar;
                try {
                    Collection collection = (Collection) C7364b.m23081a(this.f20622g.call(), "The buffer supplied is null");
                    this.f20627l.add(collection);
                    this.f122064a.onSubscribe(this);
                    this.f20626k.mo19343a(this, this.f20624i, this.f20624i, this.f20625j);
                    this.f20626k.mo19344a(new C7433b(collection), this.f20623h, this.f20625j);
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    cVar.dispose();
                    EmptyDisposable.error(th, this.f122064a);
                    this.f20626k.dispose();
                }
            }
        }

        /* renamed from: a */
        private static void m23153a(C7498y<? super U> yVar, U u) {
            yVar.onNext(u);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo19216a(C7498y yVar, Object obj) {
            m23153a(yVar, (U) (Collection) obj);
        }

        C7431c(C7498y<? super U> yVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, C7502c cVar) {
            super(yVar, new C47789a());
            this.f20622g = callable;
            this.f20623h = j;
            this.f20624i = j2;
            this.f20625j = timeUnit;
            this.f20626k = cVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super U> yVar) {
        if (this.f20597b == this.f20598c && this.f20602g == Integer.MAX_VALUE) {
            C7496w wVar = this.f20473a;
            C7430b bVar = new C7430b(new C47867c(yVar), this.f20601f, this.f20597b, this.f20599d, this.f20600e);
            wVar.mo19189a(bVar);
            return;
        }
        C7502c a = this.f20600e.mo19338a();
        if (this.f20597b == this.f20598c) {
            C7496w wVar2 = this.f20473a;
            C7429a aVar = new C7429a(new C47867c(yVar), this.f20601f, this.f20597b, this.f20599d, this.f20602g, this.f20603h, a);
            wVar2.mo19189a(aVar);
            return;
        }
        C7496w wVar3 = this.f20473a;
        C7431c cVar = new C7431c(new C47867c(yVar), this.f20601f, this.f20597b, this.f20598c, this.f20599d, a);
        wVar3.mo19189a(cVar);
    }

    public C7428b(C7496w<T> wVar, long j, long j2, TimeUnit timeUnit, C7499z zVar, Callable<U> callable, int i, boolean z) {
        super(wVar);
        this.f20597b = j;
        this.f20598c = j2;
        this.f20599d = timeUnit;
        this.f20600e = zVar;
        this.f20601f = callable;
        this.f20602g = i;
        this.f20603h = z;
    }
}
