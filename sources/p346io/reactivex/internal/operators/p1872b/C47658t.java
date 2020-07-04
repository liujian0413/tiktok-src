package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.b.t */
public final class C47658t<T, R> extends C7319aa<R> {

    /* renamed from: a */
    final C7320af<? extends T>[] f122147a;

    /* renamed from: b */
    final C7327h<? super Object[], ? extends R> f122148b;

    /* renamed from: io.reactivex.internal.operators.b.t$a */
    final class C47659a implements C7327h<T, R> {
        C47659a() {
        }

        public final R apply(T t) throws Exception {
            return C7364b.m23081a(C47658t.this.f122148b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* renamed from: io.reactivex.internal.operators.b.t$b */
    static final class C47660b<T, R> extends AtomicInteger implements C7321c {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: a */
        final C47557ad<? super R> f122150a;

        /* renamed from: b */
        final C7327h<? super Object[], ? extends R> f122151b;

        /* renamed from: c */
        final C47661c<T>[] f122152c;

        /* renamed from: d */
        final Object[] f122153d;

        public final boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (C47661c<T> a : this.f122152c) {
                    a.mo119723a();
                }
            }
        }

        /* renamed from: a */
        private void m148447a(int i) {
            C47661c<T>[] cVarArr = this.f122152c;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo119723a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo119723a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119721a(T t, int i) {
            this.f122153d[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f122150a.onSuccess(C7364b.m23081a(this.f122151b.apply(this.f122153d), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    this.f122150a.onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119722a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m148447a(i);
                this.f122150a.onError(th);
                return;
            }
            C7332a.m23029a(th);
        }

        C47660b(C47557ad<? super R> adVar, int i, C7327h<? super Object[], ? extends R> hVar) {
            super(i);
            this.f122150a = adVar;
            this.f122151b = hVar;
            C47661c<T>[] cVarArr = new C47661c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C47661c<>(this, i2);
            }
            this.f122152c = cVarArr;
            this.f122153d = new Object[i];
        }
    }

    /* renamed from: io.reactivex.internal.operators.b.t$c */
    static final class C47661c<T> extends AtomicReference<C7321c> implements C47557ad<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: a */
        final C47660b<T, ?> f122154a;

        /* renamed from: b */
        final int f122155b;

        /* renamed from: a */
        public final void mo119723a() {
            DisposableHelper.dispose(this);
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f122154a.mo119722a(th, this.f122155b);
        }

        public final void onSuccess(T t) {
            this.f122154a.mo119721a(t, this.f122155b);
        }

        C47661c(C47660b<T, ?> bVar, int i) {
            this.f122154a = bVar;
            this.f122155b = i;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super R> adVar) {
        C7320af<? extends T>[] afVarArr = this.f122147a;
        int length = afVarArr.length;
        int i = 0;
        if (length == 1) {
            afVarArr[0].mo19137b(new C47643a(adVar, new C47659a()));
            return;
        }
        C47660b bVar = new C47660b(adVar, length, this.f122148b);
        adVar.onSubscribe(bVar);
        while (i < length && !bVar.isDisposed()) {
            C7320af<? extends T> afVar = afVarArr[i];
            if (afVar == null) {
                bVar.mo119722a((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                afVar.mo19137b(bVar.f122152c[i]);
                i++;
            }
        }
    }

    public C47658t(C7320af<? extends T>[] afVarArr, C7327h<? super Object[], ? extends R> hVar) {
        this.f122147a = afVarArr;
        this.f122148b = hVar;
    }
}
