package com.bytedance.android.livesdk.browser.p195e;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.browser.e.e */
public final class C3995e implements C3990b {
    /* renamed from: a */
    public final WebResourceResponse mo11586a(Uri uri, WebView webView) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(webView, "webView");
        C3338l<Boolean> lVar = LiveConfigSettingKeys.WEB_OFFLINE_ENABLED;
        C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.WEB_OFFLINE_ENABLED");
        if (!((Boolean) lVar.mo10240a()).booleanValue()) {
            return null;
        }
        return TTLiveSDKContext.getHostService().mo22368i().mo23275c(uri.toString());
    }
}
