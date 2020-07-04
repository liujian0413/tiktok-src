package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fi */
final class C16527fi extends C16526fh<Long> {
    C16527fi(C16532fn fnVar, String str, Long l) {
        super(fnVar, str, l, null);
    }

    /* renamed from: b */
    private static Long m53866b(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo42716a(Object obj) {
        return m53866b(obj);
    }
}
