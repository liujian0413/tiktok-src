package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.lighten.core.CircleOptions;
import com.facebook.drawee.generic.RoundingParams.RoundingMethod;

/* renamed from: com.bytedance.lighten.loader.x */
final class C12190x {
    /* renamed from: a */
    static RoundingMethod m35446a(CircleOptions.RoundingMethod roundingMethod) {
        if (roundingMethod == CircleOptions.RoundingMethod.OVERLAY_COLOR) {
            return RoundingMethod.OVERLAY_COLOR;
        }
        return RoundingMethod.BITMAP_ONLY;
    }

    /* renamed from: b */
    private static int m35448b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels * displayMetrics.heightPixels * 4 * 4;
    }

    /* renamed from: a */
    static int m35445a(Context context) {
        boolean z;
        int i;
        ActivityManager activityManager = (ActivityManager) m35447a(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = activityManager.getLargeMemoryClass();
        } else {
            i = activityManager.getMemoryClass();
        }
        int i2 = (int) ((((long) i) * 1048576) / 10);
        int b = m35448b(context);
        if (i2 > b) {
            return b;
        }
        if (i2 < 6291456) {
            return 6291456;
        }
        return i2;
    }

    /* renamed from: a */
    private static <T> T m35447a(Context context, String str) {
        return context.getSystemService(str);
    }
}
