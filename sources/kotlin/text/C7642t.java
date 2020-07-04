package kotlin.text;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.text.t */
public class C7642t extends C7641s {
    /* renamed from: b */
    public static final Float m23702b(String str) {
        C7573i.m23587b(str, "$this$toFloatOrNull");
        try {
            if (C7633m.f20926a.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static final Double m23703c(String str) {
        C7573i.m23587b(str, "$this$toDoubleOrNull");
        try {
            if (C7633m.f20926a.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
