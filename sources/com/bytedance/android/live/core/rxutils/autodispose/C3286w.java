package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p155b.C3251c;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7322c;
import p346io.reactivex.observers.C47865a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.w */
final class C3286w<T> implements C3251c<T> {

    /* renamed from: a */
    final AtomicReference<C7321c> f10011a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C7321c> f10012b = new AtomicReference<>();

    /* renamed from: c */
    private final C7322c f10013c;

    /* renamed from: d */
    private final C47557ad<? super T> f10014d;

    public final void dispose() {
        C3254d.m12292a(this.f10012b);
        C3254d.m12292a(this.f10011a);
    }

    public final boolean isDisposed() {
        if (this.f10011a.get() == C3254d.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f10011a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10012b);
            this.f10014d.onError(th);
        }
    }

    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.f10011a.lazySet(C3254d.DISPOSED);
            C3254d.m12292a(this.f10012b);
            this.f10014d.onSuccess(t);
        }
    }

    public final void onSubscribe(C7321c cVar) {
        C32871 r0 = new C47865a() {
            public final void onComplete() {
                C3286w.this.f10012b.lazySet(C3254d.DISPOSED);
                C3254d.m12292a(C3286w.this.f10011a);
            }

            public final void onError(Throwable th) {
                C3286w.this.f10012b.lazySet(C3254d.DISPOSED);
                C3286w.this.onError(th);
            }
        };
        if (C3275n.m12338a(this.f10012b, (C7321c) r0, getClass())) {
            this.f10014d.onSubscribe(this);
            this.f10013c.mo10176a(r0);
            C3275n.m12338a(this.f10011a, cVar, getClass());
        }
    }

    C3286w(C7322c cVar, C47557ad<? super T> adVar) {
        this.f10013c = cVar;
        this.f10014d = adVar;
    }
}
