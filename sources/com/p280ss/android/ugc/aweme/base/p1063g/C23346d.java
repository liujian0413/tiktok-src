package com.p280ss.android.ugc.aweme.base.p1063g;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.base.g.d */
public final class C23346d extends Resources {

    /* renamed from: a */
    private static Field f61428a;

    /* renamed from: a */
    public static boolean m76602a(Activity activity) {
        if (!activity.isFinishing() || VERSION.SDK_INT < 24 || VERSION.SDK_INT >= 28 || m76603b(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m76603b(Activity activity) {
        if (f61428a != null) {
            return ((Boolean) f61428a.get(activity)).booleanValue();
        }
        try {
            Field declaredField = Class.forName("android.app.Activity").getDeclaredField("mResumed");
            f61428a = declaredField;
            declaredField.setAccessible(true);
            return ((Boolean) f61428a.get(activity)).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public C23346d(AssetManager assetManager, DisplayMetrics displayMetrics, Configuration configuration) {
        super(assetManager, displayMetrics, configuration);
    }
}
