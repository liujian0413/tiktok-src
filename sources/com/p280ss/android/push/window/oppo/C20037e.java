package com.p280ss.android.push.window.oppo;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.common.utility.reflect.C6322b;

/* renamed from: com.ss.android.push.window.oppo.e */
public final class C20037e {
    /* renamed from: a */
    public static int m65993a(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            C6322b a = C6322b.m19610a((Object) appOpsManager);
            if (((Integer) a.mo15158a("checkOpNoThrow", (Class<?>[]) new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(((Integer) a.mo15161b("OP_POST_NOTIFICATION", Integer.TYPE).f18556a).intValue()), Integer.valueOf(i), packageName).f18556a).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
