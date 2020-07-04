package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p155b.C3249a;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7322c;
import p346io.reactivex.observers.C47865a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.u */
final class C3282u<T> implements C3249a<T> {

    /* renamed from: a */
    final AtomicReference<C7321c> f10000a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C7321c> f10001b = new AtomicReference<>();

    /* renamed from: c */
    private final C7322c f10002c;

    /* renamed from: d */
    private final C47856n<? super T> f10003d;

    public final void dispose() {
        C3254d.m12292a(this.f10001b);
        C3254d.m12292a(this.f10000a);
    }

    public final boolean isDisposed() {
        if (this.f10000a.get() == C3254d.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (!isDisposed()) {
            this.f10000a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10001b);
            this.f10003d.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f10000a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10001b);
            this.f10003d.onError(th);
        }
    }

    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.f10000a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10001b);
            this.f10003d.onSuccess(t);
        }
    }

    public final void onSubscribe(C7321c cVar) {
        C32831 r0 = new C47865a() {
            public final void onComplete() {
                C3282u.this.f10001b.lazySet(C3254d.DISPOSED);
                C3254d.m12292a(C3282u.this.f10000a);
            }

            public final void onError(Throwable th) {
                C3282u.this.f10001b.lazySet(C3254d.DISPOSED);
                C3282u.this.onError(th);
            }
        };
        if (C3275n.m12338a(this.f10001b, (C7321c) r0, getClass())) {
            this.f10003d.onSubscribe(this);
            this.f10002c.mo10176a(r0);
            C3275n.m12338a(this.f10000a, cVar, getClass());
        }
    }

    C3282u(C7322c cVar, C47856n<? super T> nVar) {
        this.f10002c = cVar;
        this.f10003d = nVar;
    }
}
