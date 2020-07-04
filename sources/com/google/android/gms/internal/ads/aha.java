package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@C6505uv
public class aha<T> implements agw<T> {

    /* renamed from: a */
    private final agu<T> f40203a = new agu<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f40204b = new AtomicInteger(0);

    public aha() {
        afy.m45824a((agj<V>) this.f40203a, (afv<? super V>) new ahb<Object>(this), ago.f40190b);
    }

    /* renamed from: a */
    public final void mo39339a(agz<T> agz, agx agx) {
        afy.m45824a((agj<V>) this.f40203a, (afv<? super V>) new ahc<Object>(this, agz, agx), ago.f40190b);
    }

    /* renamed from: a */
    public final void mo39340a(T t) {
        this.f40203a.mo39333b(t);
    }

    /* renamed from: d */
    public final void mo39343d() {
        this.f40203a.mo39332a(new Exception());
    }

    /* renamed from: e */
    public final int mo39344e() {
        return this.f40204b.get();
    }
}
