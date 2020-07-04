package com.bytedance.ies.dmt.p262ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.c */
public final class C10774c {
    /* renamed from: a */
    public static int m31444a(Context context) {
        int i;
        if (C6394b.m19907b(context)) {
            i = R.color.fs;
        } else {
            i = R.color.au1;
        }
        return m31445a(context, i);
    }

    /* renamed from: b */
    public static int m31446b(Context context) {
        int i;
        if (C6394b.m19907b(context)) {
            i = R.color.az3;
        } else {
            i = R.color.mw;
        }
        return m31445a(context, i);
    }

    /* renamed from: c */
    public static int m31447c(Context context) {
        int i;
        if (C6394b.m19907b(context)) {
            i = R.color.auz;
        } else {
            i = R.color.ayf;
        }
        return m31445a(context, i);
    }

    /* renamed from: d */
    public static int m31448d(Context context) {
        int i;
        if (C6394b.m19907b(context)) {
            i = R.color.auy;
        } else {
            i = R.color.ayg;
        }
        return m31445a(context, i);
    }

    /* renamed from: e */
    public static Drawable m31449e(Context context) {
        int i;
        Resources resources = context.getResources();
        if (C6394b.m19907b(context)) {
            i = R.drawable.cm1;
        } else {
            i = R.drawable.cm0;
        }
        return resources.getDrawable(i);
    }

    /* renamed from: a */
    private static int m31445a(Context context, int i) {
        return context.getResources().getColor(i);
    }
}
