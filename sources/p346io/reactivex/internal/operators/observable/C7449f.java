package p346io.reactivex.internal.operators.observable;

import com.C1642a;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.f */
public final class C7449f<T> extends C7492s<T> {

    /* renamed from: a */
    final C7495v<T> f20719a;

    /* renamed from: io.reactivex.internal.operators.observable.f$a */
    static final class C7450a<T> extends AtomicReference<C7321c> implements C7321c, C47870u<T> {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: a */
        final C7498y<? super T> f20720a;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        /* renamed from: a */
        public final void mo19238a() {
            if (!isDisposed()) {
                try {
                    this.f20720a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public final String toString() {
            return C1642a.m8034a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C7450a(C7498y<? super T> yVar) {
            this.f20720a = yVar;
        }

        /* renamed from: a */
        public final void mo19240a(Throwable th) {
            if (!m23187b(th)) {
                C7332a.m23029a(th);
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        private boolean m23187b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f20720a.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        /* renamed from: a */
        public final void mo19239a(T t) {
            if (t == null) {
                mo19240a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!isDisposed()) {
                this.f20720a.onNext(t);
            }
        }
    }

    public C7449f(C7495v<T> vVar) {
        this.f20719a = vVar;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7450a aVar = new C7450a(yVar);
        yVar.onSubscribe(aVar);
        try {
            this.f20719a.subscribe(aVar);
        } catch (Throwable th) {
            C7331a.m23009b(th);
            aVar.mo19240a(th);
        }
    }
}
