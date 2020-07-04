package p346io.reactivex.internal.operators.p1872b;

import com.C1642a;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C7319aa;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.b.a */
public final class C47621a<T> extends C7319aa<T> {

    /* renamed from: a */
    final C47558ae<T> f122075a;

    /* renamed from: io.reactivex.internal.operators.b.a$a */
    static final class C47622a<T> extends AtomicReference<C7321c> implements C47556ac<T>, C7321c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C47557ad<? super T> f122076a;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final String toString() {
            return C1642a.m8034a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C47622a(C47557ad<? super T> adVar) {
            this.f122076a = adVar;
        }

        /* renamed from: a */
        public final void mo119655a(Throwable th) {
            if (!mo119656b(th)) {
                C7332a.m23029a(th);
            }
        }

        /* renamed from: a */
        public final void mo119654a(T t) {
            if (get() != DisposableHelper.DISPOSED) {
                C7321c cVar = (C7321c) getAndSet(DisposableHelper.DISPOSED);
                if (cVar != DisposableHelper.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f122076a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (cVar != null) {
                                cVar.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f122076a.onSuccess(t);
                    }
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }

        /* renamed from: b */
        public final boolean mo119656b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != DisposableHelper.DISPOSED) {
                C7321c cVar = (C7321c) getAndSet(DisposableHelper.DISPOSED);
                if (cVar != DisposableHelper.DISPOSED) {
                    try {
                        this.f122076a.onError(th);
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
    }

    public C47621a(C47558ae<T> aeVar) {
        this.f122075a = aeVar;
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        C47622a aVar = new C47622a(adVar);
        adVar.onSubscribe(aVar);
        try {
            this.f122075a.mo22262a(aVar);
        } catch (Throwable th) {
            C7331a.m23009b(th);
            aVar.mo119655a(th);
        }
    }
}
