package com.p280ss.android.ugc.aweme.p1045aw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.aw.a */
public final class C23112a {
    /* renamed from: a */
    public static boolean m75954a(Context context, String str) {
        String str2;
        int i;
        Context context2;
        String str3 = "unknown";
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(2097152);
        intent.addFlags(1048576);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 1);
        int i2 = 0;
        while (true) {
            if (i2 >= queryIntentActivities.size()) {
                str2 = null;
                i = 0;
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivities.get(i2);
            if (resolveInfo.activityInfo.packageName.equals(str)) {
                str3 = resolveInfo.loadLabel(packageManager).toString();
                str2 = resolveInfo.activityInfo.name;
                i = resolveInfo.activityInfo.applicationInfo.icon;
                break;
            }
            i2++;
        }
        if (str2 == null) {
            return false;
        }
        Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent2.putExtra("android.intent.extra.shortcut.NAME", str3);
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent.setComponent(new ComponentName(str, str2)));
        if (context.getPackageName().equals(str)) {
            context2 = context;
        } else {
            try {
                context2 = context.createPackageContext(str, 3);
            } catch (NameNotFoundException unused) {
                context2 = null;
            }
        }
        if (context2 != null) {
            intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ShortcutIconResource.fromContext(context2, i));
        }
        context.sendBroadcast(intent2);
        return true;
    }
}
