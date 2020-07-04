package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14785aq;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14816bu;

@C6505uv
public final class aoc {
    /* renamed from: a */
    public static ami m46717a(Context context, anv anv, String str, boolean z, boolean z2, bdt bdt, zzbgz zzbgz, C15600ck ckVar, C14785aq aqVar, C14816bu buVar, bwl bwl) throws zzbnv {
        try {
            aod aod = new aod(context, anv, str, z, z2, bdt, zzbgz, ckVar, aqVar, buVar);
            return (ami) aet.m45703a(aod);
        } catch (Throwable th) {
            C14793ay.m42898d().mo39089a(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbnv("Webview initialization failed.", th);
        }
    }
}
