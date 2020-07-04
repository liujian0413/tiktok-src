package com.bytedance.android.livesdk.p410o.p413c;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.bytedance.android.livesdk.o.c.d */
public final class C8726d extends C8723a {
    /* renamed from: a */
    public final boolean mo21730a() {
        return true;
    }

    /* renamed from: a */
    public final Intent mo21729a(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
        return intent;
    }
}
