package com.bytedance.polaris.p634b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: com.bytedance.polaris.b.n */
public final class C12363n {
    /* renamed from: a */
    public static boolean m35908a(Context context) {
        boolean a;
        if (C12348e.m35860j()) {
            return m35909a(context, "com.coloros.safecenter", "com.coloros.privacypermissionsentry.PermissionTopActivity");
        }
        if (C12348e.m35858h()) {
            return m35909a(context, "com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity");
        }
        if (C12348e.m35848a()) {
            if (C12348e.m35851b() || C12348e.m35853c()) {
                return m35910a(context, "com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity", "miui.intent.action.APP_PERM_EDITOR");
            }
            if (C12348e.m35854d() || C12348e.m35855e() || C12348e.m35856f()) {
                return m35910a(context, "com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity", "miui.intent.action.APP_PERM_EDITOR");
            }
        } else if (C12348e.m35859i()) {
            try {
                if (C12348e.m35863m() == 3.1d) {
                    a = m35909a(context, "com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity");
                } else {
                    a = m35909a(context, "com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");
                }
                return a;
            } catch (SecurityException unused) {
                return m35909a(context, "com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");
            } catch (ActivityNotFoundException unused2) {
                return m35909a(context, "com.Android.settings", "com.android.settings.permission.TabItem");
            } catch (Exception unused3) {
            }
        } else if (C12348e.m35857g()) {
            return m35910a(context, "com.meizu.safe", "com.meizu.safe.security.AppSecActivity", "com.meizu.safe.security.SHOW_APPSEC");
        } else {
            if (C12348e.m35861k()) {
                return m35909a(context, "com.android.settings", "com.android.settings.Settings$OverlaySettingsActivity");
            }
            if (C12348e.m35862l()) {
                return m35909a(context, "com.smartisanos.security", "com.smartisanos.security.PermissionsActivity");
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m35911a(Intent intent, Context context) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m35909a(Context context, String str, String str2) {
        return m35910a(context, str, str2, "");
    }

    /* renamed from: a */
    private static boolean m35910a(Context context, String str, String str2, String str3) {
        Intent intent;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (TextUtils.isEmpty(str3)) {
            intent = new Intent();
        } else {
            intent = new Intent(str3);
        }
        intent.setClassName(str, str2);
        intent.setFlags(268435456);
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("package", context.getPackageName());
        intent.putExtra("extra_pkgname", context.getPackageName());
        if (m35911a(intent, context)) {
            context.startActivity(intent);
            z = true;
        }
        return z;
    }
}
