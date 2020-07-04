package com.bytedance.android.livesdk.log;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a */
public final class C8409a {
    /* renamed from: a */
    public static void m25578a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("asset_id", str2);
        }
        C8444d.m25673b().mo10003c("ttlive_asset", (Map<String, ?>) hashMap);
    }
}
