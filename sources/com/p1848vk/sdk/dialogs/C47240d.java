package com.p1848vk.sdk.dialogs;

import android.app.Dialog;
import android.os.Looper;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.lancet.C32278e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.vk.sdk.dialogs.d */
final class C47240d {
    /* renamed from: a */
    static void m147711a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static void m147712a(WebView webView, String str) {
        C32278e.m104800a(str);
        webView.loadUrl(str);
    }
}
