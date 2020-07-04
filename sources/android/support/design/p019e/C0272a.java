package android.support.design.p019e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p029v7.p030a.p031a.C1065a;

/* renamed from: android.support.design.e.a */
public final class C0272a {
    /* renamed from: a */
    static int m1074a(TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(11)) {
            return 11;
        }
        return 10;
    }

    /* renamed from: a */
    public static ColorStateList m1075a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1065a.m4638a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m1076b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = C1065a.m4641b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }
}
