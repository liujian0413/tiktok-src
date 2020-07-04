package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p022v4.graphics.C0721a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.ar */
final class C1361ar {

    /* renamed from: a */
    static final int[] f5328a = {-16842910};

    /* renamed from: b */
    static final int[] f5329b = {16842908};

    /* renamed from: c */
    static final int[] f5330c = {16843518};

    /* renamed from: d */
    static final int[] f5331d = {16842919};

    /* renamed from: e */
    static final int[] f5332e = {16842912};

    /* renamed from: f */
    static final int[] f5333f = {16842913};

    /* renamed from: g */
    static final int[] f5334g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f5335h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f5336i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f5337j = new int[1];

    /* renamed from: a */
    private static TypedValue m6736a() {
        TypedValue typedValue = (TypedValue) f5336i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f5336i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    public static int m6734a(Context context, int i) {
        f5337j[0] = i;
        C1365av a = C1365av.m6743a(context, (AttributeSet) null, f5337j);
        try {
            return a.mo6395b(0, 0);
        } finally {
            a.mo6393a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m6737b(Context context, int i) {
        f5337j[0] = i;
        C1365av a = C1365av.m6743a(context, (AttributeSet) null, f5337j);
        try {
            return a.mo6402e(0);
        } finally {
            a.mo6393a();
        }
    }

    /* renamed from: c */
    public static int m6738c(Context context, int i) {
        ColorStateList b = m6737b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f5328a, b.getDefaultColor());
        }
        TypedValue a = m6736a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m6735a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static int m6735a(Context context, int i, float f) {
        int a = m6734a(context, i);
        return C0721a.m3067b(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
