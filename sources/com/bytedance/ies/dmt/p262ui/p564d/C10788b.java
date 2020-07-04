package com.bytedance.ies.dmt.p262ui.p564d;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: com.bytedance.ies.dmt.ui.d.b */
public final class C10788b {

    /* renamed from: a */
    private static int f28933a;

    /* renamed from: b */
    private static int f28934b;

    /* renamed from: a */
    public static int m31500a(Context context) {
        if (f28933a != 0) {
            return f28933a;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f28933a = point.x;
            f28934b = point.y;
        }
        if (f28933a == 0 || f28934b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f28933a = displayMetrics.widthPixels;
            f28934b = displayMetrics.heightPixels;
        }
        return f28933a;
    }

    /* renamed from: b */
    public static int m31501b(Context context) {
        if (f28934b != 0) {
            return f28934b;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f28933a = point.x;
            f28934b = point.y;
        }
        if (f28933a == 0 || f28934b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f28933a = displayMetrics.widthPixels;
            f28934b = displayMetrics.heightPixels;
        }
        return f28934b;
    }
}
