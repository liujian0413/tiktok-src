package com.google.android.gms.internal.ads;

import android.content.Context;

final class acr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f40018a;

    /* renamed from: b */
    private final /* synthetic */ acl f40019b;

    acr(acl acl, Context context) {
        this.f40019b = acl;
        this.f40018a = context;
    }

    public final void run() {
        synchronized (this.f40019b.f40007e) {
            this.f40019b.f40008f = acl.m45554d(this.f40018a);
            this.f40019b.f40007e.notifyAll();
        }
    }
}
