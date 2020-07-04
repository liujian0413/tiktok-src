package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p155b.C3250b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7322c;
import p346io.reactivex.C7498y;
import p346io.reactivex.observers.C47865a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.v */
final class C3284v<T> extends AtomicInteger implements C3250b<T> {

    /* renamed from: a */
    final AtomicReference<C7321c> f10005a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C7321c> f10006b = new AtomicReference<>();

    /* renamed from: c */
    private final C3253c f10007c = new C3253c();

    /* renamed from: d */
    private final C7322c f10008d;

    /* renamed from: e */
    private final C7498y<? super T> f10009e;

    public final void dispose() {
        C3254d.m12292a(this.f10006b);
        C3254d.m12292a(this.f10005a);
    }

    public final boolean isDisposed() {
        if (this.f10005a.get() == C3254d.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (!isDisposed()) {
            this.f10005a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10006b);
            C3243ab.m12276a(this.f10009e, (AtomicInteger) this, this.f10007c);
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f10005a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10006b);
            C3243ab.m12275a(this.f10009e, th, (AtomicInteger) this, this.f10007c);
        }
    }

    public final void onNext(T t) {
        if (!isDisposed() && C3243ab.m12279a(this.f10009e, t, (AtomicInteger) this, this.f10007c)) {
            this.f10005a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10006b);
        }
    }

    public final void onSubscribe(C7321c cVar) {
        C32851 r0 = new C47865a() {
            public final void onComplete() {
                C3284v.this.f10006b.lazySet(C3254d.DISPOSED);
                C3254d.m12292a(C3284v.this.f10005a);
            }

            public final void onError(Throwable th) {
                C3284v.this.f10006b.lazySet(C3254d.DISPOSED);
                C3284v.this.onError(th);
            }
        };
        if (C3275n.m12338a(this.f10006b, (C7321c) r0, getClass())) {
            this.f10009e.onSubscribe(this);
            this.f10008d.mo10176a(r0);
            C3275n.m12338a(this.f10005a, cVar, getClass());
        }
    }

    C3284v(C7322c cVar, C7498y<? super T> yVar) {
        this.f10008d = cVar;
        this.f10009e = yVar;
    }
}
