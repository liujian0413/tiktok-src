package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fk */
final class C16529fk extends C16526fh<Boolean> {
    C16529fk(C16532fn fnVar, String str, Boolean bool) {
        super(fnVar, str, bool, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo42716a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C16511et.f46274b.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C16511et.f46275c.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        return null;
    }
}
