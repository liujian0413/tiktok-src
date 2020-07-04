package android.support.p022v4.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.app.b */
public final class C0597b {
    /* renamed from: a */
    public static boolean m2482a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
