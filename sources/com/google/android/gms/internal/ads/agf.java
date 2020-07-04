package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class agf implements Runnable {

    /* renamed from: a */
    private final agu f40175a;

    /* renamed from: b */
    private final agj f40176b;

    agf(agu agu, agj agj) {
        this.f40175a = agu;
        this.f40176b = agj;
    }

    public final void run() {
        agu agu = this.f40175a;
        try {
            agu.mo39333b(this.f40176b.get());
        } catch (ExecutionException e) {
            agu.mo39332a(e.getCause());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            agu.mo39332a(e2);
        } catch (Exception e3) {
            agu.mo39332a(e3);
        }
    }
}
