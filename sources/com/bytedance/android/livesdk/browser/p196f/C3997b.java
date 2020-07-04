package com.bytedance.android.livesdk.browser.p196f;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.C3847a;
import com.bytedance.android.livesdk.commerce.C5854h;

/* renamed from: com.bytedance.android.livesdk.browser.f.b */
public final class C3997b implements C3996a {
    /* renamed from: a */
    public final boolean mo11588a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && C3847a.f11538a.booleanValue() && (str.startsWith("market://details?id=") || str.startsWith("https://play.google.com"))) {
            return C5854h.m18321a(str);
        }
        return false;
    }
}
