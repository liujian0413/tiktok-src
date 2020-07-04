package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class bth implements buq {

    /* renamed from: a */
    private WeakReference<C15632dp> f43544a;

    public bth(C15632dp dpVar) {
        this.f43544a = new WeakReference<>(dpVar);
    }

    /* renamed from: a */
    public final View mo41307a() {
        C15632dp dpVar = (C15632dp) this.f43544a.get();
        if (dpVar != null) {
            return dpVar.mo41602o();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo41308b() {
        return this.f43544a.get() == null;
    }

    /* renamed from: c */
    public final buq mo41309c() {
        return new btj((C15632dp) this.f43544a.get());
    }
}
