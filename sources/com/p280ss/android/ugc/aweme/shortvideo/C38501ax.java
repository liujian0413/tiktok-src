package com.p280ss.android.ugc.aweme.shortvideo;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ax */
public final class C38501ax {
    /* renamed from: a */
    public static Drawable m123069a(int[] iArr) {
        return m123070a(iArr, Orientation.TR_BL);
    }

    /* renamed from: a */
    private static Drawable m123070a(int[] iArr, Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m123065a(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m123066a(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        gradientDrawable.setCornerRadius((float) i4);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m123068a(int i, int i2, int i3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m123067a(int i, int i2, int i3, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setSize(i4, i5);
        return gradientDrawable;
    }
}
