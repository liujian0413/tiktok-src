package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.webkit.WebView;
import com.p280ss.android.agilelogger.utils.C19207k;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42967ba;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cb */
public final class C25342cb {
    /* renamed from: a */
    public static void m83274a(Throwable th) {
        if (!C7163a.m22363a()) {
            C6877n.m21407a("webview_anr_log", "destroy_exception", C42967ba.m136396a().mo104680a("stacktrace", C19207k.m62944a(th)).mo104681b());
        }
    }

    /* renamed from: a */
    public static void m83273a(WebView webView) {
        if (!C7163a.m22363a()) {
            C6877n.m21407a("webview_anr_log", "common_msg", C42967ba.m136396a().mo104679a("layerType", Integer.valueOf(webView.getLayerType())).mo104680a("stackTrace", C19207k.m62944a(new Throwable())).mo104681b());
        }
    }
}
