package p346io.reactivex.internal.operators.maybe;

import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.maybe.i */
public final class C47754i<T> extends C47740a<T, T> {

    /* renamed from: b */
    final C7326g<? super C7321c> f122417b;

    /* renamed from: c */
    final C7326g<? super T> f122418c;

    /* renamed from: d */
    final C7326g<? super Throwable> f122419d;

    /* renamed from: e */
    final C7323a f122420e;

    /* renamed from: f */
    final C7323a f122421f;

    /* renamed from: g */
    final C7323a f122422g;

    /* renamed from: io.reactivex.internal.operators.maybe.i$a */
    static final class C47755a<T> implements C7321c, C47856n<T> {

        /* renamed from: a */
        final C47856n<? super T> f122423a;

        /* renamed from: b */
        final C47754i<T> f122424b;

        /* renamed from: c */
        C7321c f122425c;

        public final boolean isDisposed() {
            return this.f122425c.isDisposed();
        }

        /* renamed from: a */
        private void m148586a() {
            try {
                this.f122424b.f122421f.mo8975a();
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a(th);
            }
        }

        public final void dispose() {
            try {
                this.f122424b.f122422g.mo8975a();
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a(th);
            }
            this.f122425c.dispose();
            this.f122425c = DisposableHelper.DISPOSED;
        }

        public final void onComplete() {
            if (this.f122425c != DisposableHelper.DISPOSED) {
                try {
                    this.f122424b.f122420e.mo8975a();
                    this.f122425c = DisposableHelper.DISPOSED;
                    this.f122423a.onComplete();
                    m148586a();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    m148587a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f122425c == DisposableHelper.DISPOSED) {
                C7332a.m23029a(th);
            } else {
                m148587a(th);
            }
        }

        /* renamed from: a */
        private void m148587a(Throwable th) {
            try {
                this.f122424b.f122419d.accept(th);
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f122425c = DisposableHelper.DISPOSED;
            this.f122423a.onError(th);
            m148586a();
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122425c, cVar)) {
                try {
                    this.f122424b.f122417b.accept(cVar);
                    this.f122425c = cVar;
                    this.f122423a.onSubscribe(this);
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    cVar.dispose();
                    this.f122425c = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, this.f122423a);
                }
            }
        }

        public final void onSuccess(T t) {
            if (this.f122425c != DisposableHelper.DISPOSED) {
                try {
                    this.f122424b.f122418c.accept(t);
                    this.f122425c = DisposableHelper.DISPOSED;
                    this.f122423a.onSuccess(t);
                    m148586a();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    m148587a(th);
                }
            }
        }

        C47755a(C47856n<? super T> nVar, C47754i<T> iVar) {
            this.f122423a = nVar;
            this.f122424b = iVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f122391a.mo19277b(new C47755a(nVar, this));
    }

    public C47754i(C7491p<T> pVar, C7326g<? super C7321c> gVar, C7326g<? super T> gVar2, C7326g<? super Throwable> gVar3, C7323a aVar, C7323a aVar2, C7323a aVar3) {
        super(pVar);
        this.f122417b = gVar;
        this.f122418c = gVar2;
        this.f122419d = gVar3;
        this.f122420e = aVar;
        this.f122421f = aVar2;
        this.f122422g = aVar3;
    }
}
