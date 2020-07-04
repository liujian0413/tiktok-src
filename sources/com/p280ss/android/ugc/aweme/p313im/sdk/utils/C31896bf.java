package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.WindowManager;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bf */
public final class C31896bf {
    /* renamed from: a */
    public static int m103623a(Context context) {
        if (!m103626d(context) || m103627e(context)) {
            return 0;
        }
        return m103628f(context);
    }

    /* renamed from: b */
    private static int m103624b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    private static int m103625c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: d */
    private static boolean m103626d(Context context) {
        if (VERSION.SDK_INT < 17) {
            boolean hasPermanentMenuKey = ViewConfiguration.get(context).hasPermanentMenuKey();
            boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
            if (hasPermanentMenuKey || deviceHasKey) {
                return false;
            }
            return true;
        } else if (m103625c(context) != m103624b(context)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m103627e(Context context) {
        int i;
        int i2 = Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0);
        if (VERSION.SDK_INT >= 17) {
            i = Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        } else {
            i = 0;
        }
        if (i2 == 0 && i == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static int m103628f(Context context) {
        if (VERSION.SDK_INT >= 17) {
            return m103625c(context) - m103624b(context);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
