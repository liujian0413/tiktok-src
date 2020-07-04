package com.p280ss.android.ttve.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ttve.utils.c */
public final class C20505c {

    /* renamed from: a */
    public static final boolean f55415a;

    /* renamed from: b */
    public static C20506a f55416b = new C20506a();

    /* renamed from: c */
    private static int f55417c = -1;

    /* renamed from: com.ss.android.ttve.utils.c$a */
    public static class C20506a {
    }

    static {
        boolean z;
        if (VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f55415a = z;
    }

    /* renamed from: a */
    public static final int m68011a(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static final int m68012b(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static final int m68014c(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    /* renamed from: a */
    public static float m68010a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static int m68013b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
