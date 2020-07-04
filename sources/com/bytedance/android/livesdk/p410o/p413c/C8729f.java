package com.bytedance.android.livesdk.p410o.p413c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.android.livesdk.o.c.f */
public class C8729f extends C8723a {
    /* renamed from: a */
    public final boolean mo21730a() {
        if (VERSION.SDK_INT == 23) {
            return true;
        }
        return super.mo21730a();
    }

    /* renamed from: b */
    private static String m26087b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        return context.getString(i);
    }

    /* renamed from: a */
    public final Intent mo21729a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        intent.putExtra("app_name", m26087b(context));
        intent.putExtra("class_name", C8729f.class.getSimpleName());
        return intent;
    }
}
