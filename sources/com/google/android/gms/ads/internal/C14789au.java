package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.bds;
import com.google.android.gms.internal.ads.bdt;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.au */
final class C14789au implements Callable<bdt> {

    /* renamed from: a */
    private final /* synthetic */ C14786ar f38207a;

    C14789au(C14786ar arVar) {
        this.f38207a = arVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        return new bdt(bds.m48500a(this.f38207a.f38196a.f45677a, this.f38207a.f38199d, false));
    }
}
