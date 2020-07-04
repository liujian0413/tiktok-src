package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cr */
final class C16872cr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f47168a;

    /* renamed from: b */
    private final /* synthetic */ C16870cp f47169b;

    /* renamed from: c */
    private final /* synthetic */ C16870cp f47170c;

    /* renamed from: d */
    private final /* synthetic */ C16871cq f47171d;

    C16872cr(C16871cq cqVar, boolean z, C16870cp cpVar, C16870cp cpVar2) {
        this.f47171d = cqVar;
        this.f47168a = z;
        this.f47169b = cpVar;
        this.f47170c = cpVar2;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.f47171d.mo43587s().mo44074t(this.f47171d.mo43574f().mo44135v())) {
            z = this.f47168a && this.f47171d.f47162a != null;
            if (z) {
                this.f47171d.m55659a(this.f47171d.f47162a, true);
            }
        } else {
            if (this.f47168a && this.f47171d.f47162a != null) {
                this.f47171d.m55659a(this.f47171d.f47162a, true);
            }
            z = false;
        }
        if (this.f47169b == null || this.f47169b.f47160c != this.f47170c.f47160c || !C16922em.m55972c(this.f47169b.f47159b, this.f47170c.f47159b) || !C16922em.m55972c(this.f47169b.f47158a, this.f47170c.f47158a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            C16871cq.m55658a(this.f47170c, bundle, true);
            if (this.f47169b != null) {
                if (this.f47169b.f47158a != null) {
                    bundle.putString("_pn", this.f47169b.f47158a);
                }
                bundle.putString("_pc", this.f47169b.f47159b);
                bundle.putLong("_pi", this.f47169b.f47160c);
            }
            if (this.f47171d.mo43587s().mo44074t(this.f47171d.mo43574f().mo44135v()) && z) {
                long w = this.f47171d.mo43578j().mo43831w();
                if (w > 0) {
                    this.f47171d.mo43583o().mo43901a(bundle, w);
                }
            }
            this.f47171d.mo43573e().mo43738b("auto", "_vs", bundle);
        }
        this.f47171d.f47162a = this.f47170c;
        this.f47171d.mo43575g().mo43773a(this.f47170c);
    }
}
