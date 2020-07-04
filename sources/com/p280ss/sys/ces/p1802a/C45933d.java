package com.p280ss.sys.ces.p1802a;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.ss.sys.ces.a.d */
public final class C45933d {

    /* renamed from: a */
    public static int f117400a;

    /* renamed from: b */
    public static int f117401b;

    /* renamed from: c */
    public static int f117402c;

    /* renamed from: d */
    private static int f117403d;

    /* renamed from: e */
    private static int f117404e;

    /* renamed from: f */
    private static int f117405f;

    /* renamed from: a */
    public static String m144059a(Context context) {
        try {
            m144060b(context);
            m144061c(context);
            m144062d(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f117402c);
        sb.append("[<!>]");
        sb.append(f117400a);
        sb.append("*");
        sb.append(f117401b);
        sb.append("[<!>]");
        return sb.toString();
    }

    /* renamed from: b */
    private static void m144060b(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
                f117400a = point.x;
            } else if (VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
                f117400a = point.x;
            } else {
                f117400a = defaultDisplay.getWidth();
                f117401b = defaultDisplay.getHeight();
                return;
            }
            f117401b = point.y;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m144061c(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                f117403d = (int) displayMetrics.density;
                f117402c = displayMetrics.densityDpi;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m144062d(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f117404e = (int) displayMetrics.xdpi;
            f117405f = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }
}
