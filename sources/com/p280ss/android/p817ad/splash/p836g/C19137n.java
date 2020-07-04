package com.p280ss.android.p817ad.splash.p836g;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ss.android.ad.splash.g.n */
public final class C19137n {

    /* renamed from: a */
    private static int f51730a = -1;

    /* renamed from: a */
    private static boolean m62750a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* renamed from: a */
    public static int m62746a(Context context) {
        if (f51730a == -1 && context != null) {
            f51730a = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return f51730a;
    }

    /* renamed from: b */
    public static final int m62751b(Context context) {
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

    /* renamed from: c */
    public static boolean m62752c(Context context) {
        try {
            if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
                return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m62747a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    /* renamed from: a */
    public static float m62745a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: a */
    public static final void m62748a(View view, int i) {
        if (view != null && view.getVisibility() != i && m62750a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m62749a(View view, ViewGroup viewGroup) {
        if (view != null && viewGroup != null) {
            ViewParent parent = view.getParent();
            if (parent != viewGroup) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                viewGroup.addView(view);
            }
        }
    }
}
