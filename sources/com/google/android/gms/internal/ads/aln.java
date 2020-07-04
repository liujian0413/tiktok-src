package com.google.android.gms.internal.ads;

@C6505uv
public final class aln extends alb {
    public aln(aik aik) {
        super(aik);
    }

    /* renamed from: a */
    public final void mo39647a() {
    }

    /* renamed from: a */
    public final boolean mo39656a(String str) {
        aik aik = (aik) this.f40538c.get();
        if (aik != null) {
            aik.mo39461a(mo39658b(str), (alb) this);
        }
        acd.m45783e("VideoStreamNoopCache is doing nothing.");
        mo39655a(str, mo39658b(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
