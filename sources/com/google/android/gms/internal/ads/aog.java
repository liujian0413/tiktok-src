package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
class aog extends WebView {
    public aog(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C14793ay.m42896b().mo39200a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            acd.m45778b("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
    }

    /* renamed from: d */
    public void mo39815d(String str) {
        aom.m46814a(this, str);
    }

    public void loadUrl(String str) {
        try {
            aoh.m46802a(this, str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            C14793ay.m42898d().mo39089a(e, "CoreWebView.loadUrl");
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            acd.m45438a("Ignore addJavascriptInterface due to low Android version.");
        }
    }
}
