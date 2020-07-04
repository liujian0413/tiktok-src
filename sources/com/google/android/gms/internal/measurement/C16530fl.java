package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fl */
final class C16530fl extends C16526fh<Double> {
    C16530fl(C16532fn fnVar, String str, Double d) {
        super(fnVar, str, d, null);
    }

    /* renamed from: b */
    private static Double m53871b(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo42716a(Object obj) {
        return m53871b(obj);
    }
}
