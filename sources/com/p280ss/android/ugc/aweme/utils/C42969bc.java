package com.p280ss.android.ugc.aweme.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.bc */
public class C42969bc {

    /* renamed from: a */
    private static final List<Intent> f111532a = new ArrayList();

    /* renamed from: a */
    public static void m136401a(Context context) {
        if (context != null) {
            m136403b(context);
            if (!m136404c(context) && !m136405d(context)) {
                m136406e(context);
            }
        }
    }

    /* renamed from: e */
    private static boolean m136406e(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private static Intent m136407f(Context context) {
        for (Intent intent : f111532a) {
            if (m136402a(context, intent)) {
                intent.addFlags(268435456);
                return intent;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static Intent m136408g(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
        return intent;
    }

    /* renamed from: h */
    private static Intent m136409h(Context context) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        return intent;
    }

    /* renamed from: i */
    private static Intent m136410i(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    /* renamed from: d */
    private static boolean m136405d(Context context) {
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

    /* renamed from: b */
    private static void m136403b(Context context) {
        if (f111532a.size() == 0) {
            String packageName = context.getPackageName();
            Intent component = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
            component.putExtra("pkg_name", packageName);
            component.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
            component.putExtra("class_name", C42969bc.class.getName());
            f111532a.add(component);
            Intent component2 = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionAppAllPermissionActivity"));
            component2.putExtra("packageName", packageName);
            f111532a.add(component2);
            Intent component3 = new Intent().setComponent(new ComponentName("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
            component3.putExtra("android.intent.extra.PACKAGE_NAME", packageName);
            f111532a.add(component3);
        }
    }

    /* renamed from: c */
    private static boolean m136404c(Context context) {
        Intent intent = null;
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") && VERSION.SDK_INT <= 23) {
                intent = m136407f(context);
            } else if (TextUtils.equals(lowerCase, "huawei")) {
                intent = m136409h(context);
            } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                intent = m136410i(context);
            } else if (TextUtils.equals(lowerCase, "meizu")) {
                intent = m136408g(context);
            }
            if (intent != null) {
                context.startActivity(intent);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m136402a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 1);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                return false;
            }
            return resolveActivity.activityInfo.exported;
        } catch (Exception unused) {
            return false;
        }
    }
}
