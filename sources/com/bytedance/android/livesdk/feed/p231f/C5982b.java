package com.bytedance.android.livesdk.feed.p231f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.f.b */
public final class C5982b {

    /* renamed from: a */
    private static C5982b f17728a = new C5982b();

    /* renamed from: a */
    public static void m18723a(Map<String, String> map, Context context) {
        if (context instanceof Activity) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("gd_label");
                if (!TextUtils.isEmpty(stringExtra)) {
                    map.put("gd_label", stringExtra);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18721a(Context context, Bundle bundle) {
        if ((context instanceof Activity) && bundle != null) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("gd_label");
                if (!TextUtils.isEmpty(stringExtra)) {
                    bundle.putString("gd_label", stringExtra);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18722a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("livesdk_") && !"live_enter".equals(str)) {
            StringBuilder sb = new StringBuilder("livesdk_");
            sb.append(str);
            str = sb.toString();
        }
        map.put("sdk_version", "1380");
        map.put("_param_live_platform", "live");
        C5951b.m18637b().mo14565e().mo23269a(str, map);
    }
}
