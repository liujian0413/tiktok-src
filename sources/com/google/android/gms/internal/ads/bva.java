package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

final class bva implements ValueCallback<String> {

    /* renamed from: a */
    private final /* synthetic */ buz f43687a;

    bva(buz buz) {
        this.f43687a = buz;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.f43687a.f43683d.mo41376a(this.f43687a.f43680a, this.f43687a.f43681b, (String) obj, this.f43687a.f43682c);
    }
}
