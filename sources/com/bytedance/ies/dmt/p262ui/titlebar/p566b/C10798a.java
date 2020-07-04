package com.bytedance.ies.dmt.p262ui.titlebar.p566b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.p022v4.content.res.C0700e;
import android.support.p022v4.graphics.drawable.C0727a;
import android.widget.ImageView;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.b.a */
public final class C10798a {
    /* renamed from: a */
    private static Drawable m31570a(Context context, int i, int i2) {
        try {
            VectorDrawableCompat a = VectorDrawableCompat.m1855a(context.getResources(), i, context.getTheme());
            if (a != null) {
                a.setTint(context.getResources().getColor(i2));
            }
            return a;
        } catch (Exception unused) {
            Drawable a2 = C0700e.m2981a(context.getResources(), i, context.getTheme());
            if (a2 != null) {
                C0727a.m3103a(a2, context.getResources().getColor(i2));
            }
            return a2;
        }
    }

    /* renamed from: a */
    public static void m31571a(Context context, ImageView imageView, int i, int i2) {
        Drawable a = m31570a(context, i, i2);
        if (a != null) {
            imageView.setImageDrawable(a);
        }
    }
}
