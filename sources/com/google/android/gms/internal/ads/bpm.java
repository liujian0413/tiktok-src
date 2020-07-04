package com.google.android.gms.internal.ads;

final class bpm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bpp f43157a;

    /* renamed from: b */
    private final /* synthetic */ bpj f43158b;

    bpm(bpj bpj, bpp bpp) {
        this.f43158b = bpj;
        this.f43157a = bpp;
    }

    public final void run() {
        this.f43157a.mo41110a();
        int size = this.f43158b.f43144p.size();
        for (int i = 0; i < size; i++) {
            ((bqc) this.f43158b.f43144p.valueAt(i)).mo41134b();
        }
    }
}
