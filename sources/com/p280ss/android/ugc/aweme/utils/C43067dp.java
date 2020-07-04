package com.p280ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.utils.dp */
public final class C43067dp {
    /* renamed from: a */
    public static void m136625a() {
        if (C6399b.m19921a() != null) {
            ActivityManager activityManager = (ActivityManager) C6399b.m19921a().getSystemService("activity");
            if (activityManager != null) {
                try {
                    for (RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(10)) {
                        m136626a(runningTaskInfo.topActivity, "topActivity");
                        m136626a(runningTaskInfo.baseActivity, "baseActivity");
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m136626a(ComponentName componentName, String str) {
        if (C6399b.m19921a() != null) {
            String packageName = C6399b.m19921a().getPackageName();
            if (componentName != null && componentName.getPackageName().equals(packageName)) {
                C6921a.m21562b(str, componentName.toString());
            }
        }
    }
}
