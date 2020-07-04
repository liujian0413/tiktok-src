package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.C14793ay;
import java.io.InputStream;
import java.util.Map;

public class adc extends adb {
    /* renamed from: d */
    public final int mo39205d() {
        return 16974374;
    }

    /* renamed from: c */
    public final CookieManager mo39204c(Context context) {
        if (m45593c()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            acd.m45778b("Failed to obtain CookieManager.", th);
            C14793ay.m42898d().mo39089a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public final amj mo39194a(ami ami, bwl bwl, boolean z) {
        return new ani(ami, bwl, z);
    }

    /* renamed from: a */
    public final WebResourceResponse mo39193a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, i, str3, map, inputStream);
        return webResourceResponse;
    }
}
