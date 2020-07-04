package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class btl implements buq {

    /* renamed from: a */
    private final WeakReference<View> f43549a;

    /* renamed from: b */
    private final WeakReference<abj> f43550b;

    public btl(View view, abj abj) {
        this.f43549a = new WeakReference<>(view);
        this.f43550b = new WeakReference<>(abj);
    }

    /* renamed from: a */
    public final View mo41307a() {
        return (View) this.f43549a.get();
    }

    /* renamed from: b */
    public final boolean mo41308b() {
        return this.f43549a.get() == null || this.f43550b.get() == null;
    }

    /* renamed from: c */
    public final buq mo41309c() {
        return new btk((View) this.f43549a.get(), (abj) this.f43550b.get());
    }
}
