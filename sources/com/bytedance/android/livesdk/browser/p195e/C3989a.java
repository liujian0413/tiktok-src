package com.bytedance.android.livesdk.browser.p195e;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.livesdk.browser.e.a */
final class C3989a implements C3990b {
    C3989a() {
    }

    /* renamed from: a */
    public final WebResourceResponse mo11586a(Uri uri, WebView webView) {
        if (!TextUtils.equals(uri.getScheme(), "liveresource") || !TextUtils.equals(uri.getHost(), "file")) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("path");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        File file = new File(queryParameter);
        if (!file.exists()) {
            return null;
        }
        try {
            return new WebResourceResponse("", "", new FileInputStream(file));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
