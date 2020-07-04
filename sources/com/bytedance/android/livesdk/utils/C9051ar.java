package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.TypedValue;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.bytedance.android.livesdk.utils.ar */
public final class C9051ar {
    /* renamed from: a */
    public static boolean m27034a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m27032a(int i) {
        return Color.parseColor(C9078p.m27100a("#%06X", Integer.valueOf(i & 16777215)));
    }

    /* renamed from: b */
    public static int m27036b(Context context) {
        if (context == null) {
            return 0;
        }
        int a = C9738o.m28691a(context);
        int b = C9738o.m28709b(context);
        if (b < a) {
            return a;
        }
        return b;
    }

    /* renamed from: a */
    public static int m27033a(Context context) {
        if (context == null) {
            return 0;
        }
        int a = C9738o.m28691a(context);
        int b = C9738o.m28709b(context);
        if (b > a) {
            return a;
        }
        return b;
    }

    /* renamed from: a */
    public static float m27031a(Context context, float f) {
        return TypedValue.applyDimension(2, 24.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static float m27035b(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: c */
    public static int m27037c(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
