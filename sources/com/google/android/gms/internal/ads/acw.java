package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final /* synthetic */ class acw implements Callable {

    /* renamed from: a */
    private final Context f40023a;

    /* renamed from: b */
    private final WebSettings f40024b;

    acw(Context context, WebSettings webSettings) {
        this.f40023a = context;
        this.f40024b = webSettings;
    }

    public final Object call() {
        Context context = this.f40023a;
        WebSettings webSettings = this.f40024b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}
