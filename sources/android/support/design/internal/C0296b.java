package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.R$styleable;
import android.support.p029v7.widget.C1365av;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.design.internal.b */
public final class C0296b {

    /* renamed from: a */
    private static final int[] f1184a = {R.attr.g8};

    /* renamed from: b */
    private static final int[] f1185b = {R.attr.ga};

    /* renamed from: a */
    public static void m1169a(Context context) {
        m1171a(context, f1184a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m1174b(Context context) {
        m1171a(context, f1185b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static boolean m1172a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: a */
    private static void m1171a(Context context, int[] iArr, String str) {
        if (!m1172a(context, iArr)) {
            StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m1170a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m1174b(context);
        }
        m1169a(context);
    }

    /* renamed from: a */
    public static TypedArray m1168a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1170a(context, attributeSet, i, i2);
        m1175c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static C1365av m1173b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1170a(context, attributeSet, i, i2);
        m1175c(context, attributeSet, iArr, i, i2, iArr2);
        return C1365av.m6744a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    private static boolean m1176d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    private static void m1175c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = m1176d(context, attributeSet, iArr, i, i2, iArr2);
        } else if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        } else {
            z = false;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }
}
