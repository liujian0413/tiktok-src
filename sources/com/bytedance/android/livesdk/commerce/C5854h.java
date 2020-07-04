package com.bytedance.android.livesdk.commerce;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.C3847a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.utils.C9020a;

/* renamed from: com.bytedance.android.livesdk.commerce.h */
public final class C5854h {
    /* renamed from: a */
    private static boolean m18320a() {
        return C9020a.m26961b("com.android.vending");
    }

    /* renamed from: a */
    public static boolean m18321a(String str) {
        if (!C3847a.f11538a.booleanValue() || TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith("market://details?id=") && !str.startsWith("https://play.google.com")) || !m18320a()) {
            return false;
        }
        Context context = TTLiveSDKContext.getHostService().mo22360a().context();
        if (context == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
