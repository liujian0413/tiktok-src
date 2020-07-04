package com.p280ss.android.ugc.aweme.web.p1703a;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.p280ss.android.sdk.webview.C20140h.C20141a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.web.a.a */
public abstract class C43433a implements C20141a {
    /* renamed from: b */
    private static String m137828b() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo105370a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract InputStream mo105371b(String str);

    /* renamed from: a */
    public WebResourceResponse mo53904a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m137830d(str);
    }

    /* renamed from: d */
    private WebResourceResponse m137830d(String str) {
        if (m137831e(str)) {
            return m137827a(m137829c(str), m137828b(), mo105371b(str));
        }
        return null;
    }

    /* renamed from: e */
    private boolean m137831e(String str) {
        String a = mo105370a();
        if (!TextUtils.isEmpty(a)) {
            return Pattern.compile(a).matcher(str).find();
        }
        return false;
    }

    /* renamed from: c */
    protected static String m137829c(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }

    /* renamed from: a */
    protected static WebResourceResponse m137827a(String str, String str2, InputStream inputStream) {
        WebResourceResponse webResourceResponse;
        if (inputStream != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (VERSION.SDK_INT < 21 || !"font/ttf".equals(str)) {
                    webResourceResponse = new WebResourceResponse(str, str2, inputStream);
                    if (VERSION.SDK_INT >= 21) {
                        webResourceResponse.setResponseHeaders(hashMap);
                    } else {
                        try {
                            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                            field.setAccessible(true);
                            field.set(webResourceResponse, hashMap);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    webResourceResponse = new WebResourceResponse(str, str2, C34943c.f91127w, "OK", hashMap, inputStream);
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
