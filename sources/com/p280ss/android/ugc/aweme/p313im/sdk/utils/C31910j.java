package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.j */
public class C31910j {
    /* renamed from: a */
    private static Intent m103656a() {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", "com.ss.android.ugc.aweme.im.sdk");
        return intent;
    }

    /* renamed from: b */
    private static Intent m103658b() {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.putExtra("packageName", "com.ss.android.ugc.aweme.im.sdk");
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        return intent;
    }

    /* renamed from: c */
    private static Intent m103660c() {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", "com.ss.android.ugc.aweme.im.sdk");
        return intent;
    }

    /* renamed from: d */
    private static boolean m103662d(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m103657a(Context context) {
        if (context != null && !m103659b(context) && !m103661c(context)) {
            m103662d(context);
        }
    }

    /* renamed from: c */
    private static boolean m103661c(Context context) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static Intent m103663e(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        intent.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
        intent.putExtra("class_name", C31910j.class.getName());
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: b */
    private static boolean m103659b(Context context) {
        Intent intent = null;
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") && VERSION.SDK_INT <= 23) {
                intent = m103663e(context);
            } else if (TextUtils.equals(lowerCase, "huawei")) {
                intent = m103658b();
            } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                intent = m103660c();
            } else if (TextUtils.equals(lowerCase, "meizu")) {
                intent = m103656a();
            }
            if (intent != null) {
                context.startActivity(intent);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
