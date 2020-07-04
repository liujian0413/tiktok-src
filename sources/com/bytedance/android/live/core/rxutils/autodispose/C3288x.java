package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.p155b.C3252d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C7322c;
import p346io.reactivex.observers.C47865a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.x */
final class C3288x<T> extends AtomicInteger implements C3252d<T> {

    /* renamed from: a */
    final AtomicReference<C48294d> f10016a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C7321c> f10017b = new AtomicReference<>();

    /* renamed from: c */
    private final C3253c f10018c = new C3253c();

    /* renamed from: d */
    private final AtomicReference<C48294d> f10019d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicLong f10020e = new AtomicLong();

    /* renamed from: f */
    private final C7322c f10021f;

    /* renamed from: g */
    private final C48293c<? super T> f10022g;

    public final void dispose() {
        cancel();
    }

    public final void cancel() {
        C3254d.m12292a(this.f10017b);
        C3290y.m12350a(this.f10016a);
    }

    public final boolean isDisposed() {
        if (this.f10016a.get() == C3290y.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (!isDisposed()) {
            this.f10016a.lazySet(C3290y.CANCELLED);
            C3254d.m12292a(this.f10017b);
            C3243ab.m12278a(this.f10022g, (AtomicInteger) this, this.f10018c);
        }
    }

    public final void request(long j) {
        C3290y.m12348a(this.f10019d, this.f10020e, j);
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f10016a.lazySet(C3290y.CANCELLED);
            C3254d.m12292a(this.f10017b);
            C3243ab.m12277a(this.f10022g, th, (AtomicInteger) this, this.f10018c);
        }
    }

    public final void onNext(T t) {
        if (!isDisposed() && C3243ab.m12280a(this.f10022g, t, (AtomicInteger) this, this.f10018c)) {
            this.f10016a.lazySet(C3290y.CANCELLED);
            C3254d.m12292a(this.f10017b);
        }
    }

    public final void onSubscribe(C48294d dVar) {
        C32891 r0 = new C47865a() {
            public final void onComplete() {
                C3288x.this.f10017b.lazySet(C3254d.DISPOSED);
                C3290y.m12350a(C3288x.this.f10016a);
            }

            public final void onError(Throwable th) {
                C3288x.this.f10017b.lazySet(C3254d.DISPOSED);
                C3288x.this.onError(th);
            }
        };
        if (C3275n.m12338a(this.f10017b, (C7321c) r0, getClass())) {
            this.f10022g.onSubscribe(this);
            this.f10021f.mo10176a(r0);
            if (C3275n.m12339a(this.f10016a, dVar, getClass())) {
                C3290y.m12351a(this.f10019d, this.f10020e, dVar);
            }
        }
    }

    C3288x(C7322c cVar, C48293c<? super T> cVar2) {
        this.f10021f = cVar;
        this.f10022g = cVar2;
    }
}
