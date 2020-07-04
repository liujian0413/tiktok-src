package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.be */
final class C14800be implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ C14797bb f38301a;

    C14800be(C14797bb bbVar) {
        this.f38301a = bbVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        String str = "";
        CookieManager c = C14793ay.m42896b().mo39204c(this.f38301a.f38140e.f38268c);
        return c != null ? c.getCookie("googleads.g.doubleclick.net") : str;
    }
}
