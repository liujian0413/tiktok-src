package com.p280ss.android.ugc.aweme.p1355k.p1357b;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.support.p022v4.app.C0581aa;
import com.bytedance.common.utility.reflect.C6322b;

/* renamed from: com.ss.android.ugc.aweme.k.b.a */
public final class C32265a {
    /* renamed from: a */
    public static boolean m104780a(Context context) {
        try {
            if (VERSION.SDK_INT > 19) {
                return C0581aa.m2444a(context).mo2561a();
            }
            if (m104781b(context) == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static int m104781b(Context context) {
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
