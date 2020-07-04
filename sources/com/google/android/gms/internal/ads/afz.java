package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class afz implements Runnable {

    /* renamed from: a */
    private final afv f40160a;

    /* renamed from: b */
    private final agj f40161b;

    afz(afv afv, agj agj) {
        this.f40160a = afv;
        this.f40161b = agj;
    }

    public final void run() {
        Throwable e;
        afv afv = this.f40160a;
        try {
            afv.mo39020a(this.f40161b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            afv.mo39021a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            afv.mo39021a(e);
        } catch (Exception e4) {
            e = e4;
            afv.mo39021a(e);
        }
    }
}
