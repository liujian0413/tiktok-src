package com.bytedance.android.livesdk.browser.p195e;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import java.io.InputStream;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.android.livesdk.browser.e.c */
public final class C3991c implements C3990b {
    /* renamed from: a */
    public final WebResourceResponse mo11586a(Uri uri, WebView webView) {
        String str;
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(webView, "webView");
        C3338l<Boolean> lVar = LiveConfigSettingKeys.WEBVIEW_NATIVE_IMAGE_LOADING;
        C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.WEBVIEW_NATIVE_IMAGE_LOADING");
        WebResourceResponse webResourceResponse = null;
        if (!((Boolean) lVar.mo10240a()).booleanValue()) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        if (C7634n.m23724c(path, "jpg", false, 2, null) || C7634n.m23724c(path, "jpeg", false, 2, null)) {
            str = "image/jpeg";
        } else if (C7634n.m23724c(path, "png", false, 2, null)) {
            str = "image/png";
        } else if (C7634n.m23724c(path, "gif", false, 2, null)) {
            str = "image/gif";
        } else if (!C7634n.m23724c(path, "ico", false, 2, null)) {
            return null;
        } else {
            str = "image/x-icon";
        }
        InputStream a = C3393m.m12615a(uri);
        if (a != null) {
            webResourceResponse = new WebResourceResponse(str, "", a);
        }
        return webResourceResponse;
    }
}
