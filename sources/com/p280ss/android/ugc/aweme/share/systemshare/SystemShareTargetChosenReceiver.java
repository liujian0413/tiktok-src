package com.p280ss.android.ugc.aweme.share.systemshare;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C6319n;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.systemshare.SystemShareTargetChosenReceiver */
public class SystemShareTargetChosenReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private static String m122215a(Context context, ComponentName componentName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo a = C38257c.m122217a(packageManager, componentName.getPackageName(), 0);
            if (a == null) {
                return "";
            }
            return a.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            C2077a.m9161a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!(intent == null || context == null || VERSION.SDK_INT < 22)) {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (componentName != null) {
                String str = null;
                String stringExtra = intent.getStringExtra("extra_type");
                if (!C6319n.m19593a(stringExtra)) {
                    str = m122216a(context, componentName, stringExtra);
                }
                if (C6319n.m19593a(str)) {
                    str = m122215a(context, componentName);
                }
                C6907h.m21524a("share_video_more_track", (Map) new C22984d().mo59973a("platform", str).mo59973a("package_name", componentName.getPackageName()).mo59973a("component_name", componentName.getClassName()).f60753a);
            }
        }
    }

    /* renamed from: a */
    private static String m122216a(Context context, ComponentName componentName, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
                if (resolveInfo.activityInfo != null && C6319n.m19594a(resolveInfo.activityInfo.name, componentName.getClassName()) && C6319n.m19594a(resolveInfo.activityInfo.packageName, componentName.getPackageName())) {
                    return resolveInfo.loadLabel(packageManager).toString();
                }
            }
        } catch (Throwable th) {
            C2077a.m9161a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
        }
        return "";
    }
}
