package p346io.reactivex.internal.operators.maybe;

import com.C1642a;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47855m;
import p346io.reactivex.C47856n;
import p346io.reactivex.C47857o;
import p346io.reactivex.C7490k;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.maybe.b */
public final class C47741b<T> extends C7490k<T> {

    /* renamed from: a */
    final C47857o<T> f122392a;

    /* renamed from: io.reactivex.internal.operators.maybe.b$a */
    static final class C47742a<T> extends AtomicReference<C7321c> implements C7321c, C47855m<T> {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C47856n<? super T> f122393a;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final String toString() {
            return C1642a.m8034a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C47742a(C47856n<? super T> nVar) {
            this.f122393a = nVar;
        }

        /* renamed from: a */
        public final void mo119770a(Throwable th) {
            if (!m148576b(th)) {
                C7332a.m23029a(th);
            }
        }

        /* renamed from: b */
        private boolean m148576b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != DisposableHelper.DISPOSED) {
                C7321c cVar = (C7321c) getAndSet(DisposableHelper.DISPOSED);
                if (cVar != DisposableHelper.DISPOSED) {
                    try {
                        this.f122393a.onError(th);
                        return true;
                    } finally {
                        if (cVar != null) {
                            cVar.dispose();
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo119769a(T t) {
            if (get() != DisposableHelper.DISPOSED) {
                C7321c cVar = (C7321c) getAndSet(DisposableHelper.DISPOSED);
                if (cVar != DisposableHelper.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f122393a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (cVar != null) {
                                cVar.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f122393a.onSuccess(t);
                    }
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }
    }

    public C47741b(C47857o<T> oVar) {
        this.f122392a = oVar;
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        C47742a aVar = new C47742a(nVar);
        nVar.onSubscribe(aVar);
        try {
            this.f122392a.mo58382a(aVar);
        } catch (Throwable th) {
            C7331a.m23009b(th);
            aVar.mo119770a(th);
        }
    }
}
