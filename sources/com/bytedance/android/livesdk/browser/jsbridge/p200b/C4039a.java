package com.bytedance.android.livesdk.browser.jsbridge.p200b;

import com.bytedance.android.livesdk.TTLiveSDKContext;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.b.a */
public final class C4039a {
    /* renamed from: a */
    public static String m14106a(String str) {
        String str2;
        if (str.indexOf("?") > 0) {
            str2 = "&";
        } else {
            str2 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("live_sdk_version=");
        sb.append(TTLiveSDKContext.getHostService().mo22360a().getVersionCode());
        return sb.toString();
    }
}
