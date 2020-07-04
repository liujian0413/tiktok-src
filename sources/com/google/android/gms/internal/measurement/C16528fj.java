package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fj */
final class C16528fj extends C16526fh<Integer> {
    C16528fj(C16532fn fnVar, String str, Integer num) {
        super(fnVar, str, num, null);
    }

    /* renamed from: b */
    private static Integer m53868b(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo42716a(Object obj) {
        return m53868b(obj);
    }
}
