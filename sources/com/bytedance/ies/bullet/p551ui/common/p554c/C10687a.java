package com.bytedance.ies.bullet.p551ui.common.p554c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.ui.common.c.a */
public final class C10687a {
    /* renamed from: a */
    private static boolean m31223a() {
        if (!TextUtils.equals("vivo", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(cls, new Object[]{Integer.valueOf(32)})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m31225b(Context context) {
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m31226c(Context context) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.equals("huawei", lowerCase) && !TextUtils.equals("honor", lowerCase)) {
            return false;
        }
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m31228e(Context context) {
        String str;
        if (context == null || VERSION.SDK_INT < 27) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier > 0) {
                str = resources.getString(identifier);
            } else {
                str = null;
            }
            if (str == null || TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m31227d(Context context) {
        if (!(context instanceof Activity) || VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = ((Activity) context).getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m31224a(Context context) {
        if (m31225b(context) || m31223a() || m31226c(context) || m31222a("ro.miui.notch", context) == 1 || m31227d(context) || m31228e(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m31222a(String str, Context context) {
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) loadClass.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(loadClass, new Object[]{new String(str), new Integer(0)})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return 0;
    }
}
