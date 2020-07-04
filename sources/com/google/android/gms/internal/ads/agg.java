package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class agg implements Runnable {

    /* renamed from: a */
    private final agj f40177a;

    /* renamed from: b */
    private final Future f40178b;

    agg(agj agj, Future future) {
        this.f40177a = agj;
        this.f40178b = future;
    }

    public final void run() {
        agj agj = this.f40177a;
        Future future = this.f40178b;
        if (agj.isCancelled()) {
            future.cancel(true);
        }
    }
}
