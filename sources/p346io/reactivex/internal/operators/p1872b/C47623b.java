package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.TimeUnit;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.b.b */
public final class C47623b<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<? extends T> f122077a;

    /* renamed from: b */
    final long f122078b;

    /* renamed from: c */
    final TimeUnit f122079c;

    /* renamed from: d */
    final C7499z f122080d;

    /* renamed from: e */
    final boolean f122081e;

    /* renamed from: io.reactivex.internal.operators.b.b$a */
    final class C47624a implements C47557ad<T> {

        /* renamed from: a */
        final C47557ad<? super T> f122082a;

        /* renamed from: c */
        private final SequentialDisposable f122084c;

        /* renamed from: io.reactivex.internal.operators.b.b$a$a */
        final class C47625a implements Runnable {

            /* renamed from: b */
            private final Throwable f122086b;

            public final void run() {
                C47624a.this.f122082a.onError(this.f122086b);
            }

            C47625a(Throwable th) {
                this.f122086b = th;
            }
        }

        /* renamed from: io.reactivex.internal.operators.b.b$a$b */
        final class C47626b implements Runnable {

            /* renamed from: b */
            private final T f122088b;

            public final void run() {
                C47624a.this.f122082a.onSuccess(this.f122088b);
            }

            C47626b(T t) {
                this.f122088b = t;
            }
        }

        public final void onSubscribe(C7321c cVar) {
            this.f122084c.replace(cVar);
        }

        public final void onSuccess(T t) {
            this.f122084c.replace(C47623b.this.f122080d.mo19337a(new C47626b(t), C47623b.this.f122078b, C47623b.this.f122079c));
        }

        public final void onError(Throwable th) {
            long j;
            SequentialDisposable sequentialDisposable = this.f122084c;
            C7499z zVar = C47623b.this.f122080d;
            C47625a aVar = new C47625a(th);
            if (C47623b.this.f122081e) {
                j = C47623b.this.f122078b;
            } else {
                j = 0;
            }
            sequentialDisposable.replace(zVar.mo19337a(aVar, j, C47623b.this.f122079c));
        }

        C47624a(SequentialDisposable sequentialDisposable, C47557ad<? super T> adVar) {
            this.f122084c = sequentialDisposable;
            this.f122082a = adVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        adVar.onSubscribe(sequentialDisposable);
        this.f122077a.mo19137b(new C47624a(sequentialDisposable, adVar));
    }

    public C47623b(C7320af<? extends T> afVar, long j, TimeUnit timeUnit, C7499z zVar, boolean z) {
        this.f122077a = afVar;
        this.f122078b = j;
        this.f122079c = timeUnit;
        this.f122080d = zVar;
        this.f122081e = z;
    }
}
