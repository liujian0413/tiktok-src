package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gs */
final class C16564gs {

    /* renamed from: a */
    private static final Class<?> f46367a = m54080c();

    /* renamed from: c */
    private static Class<?> m54080c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C16565gt m54077a() {
        if (f46367a != null) {
            try {
                return m54078a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C16565gt.f46368a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C16565gt m54079b() {
        /*
            java.lang.Class<?> r0 = f46367a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.measurement.gt r0 = m54078a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.measurement.gt r0 = com.google.android.gms.internal.measurement.C16565gt.m54083c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.gt r0 = m54077a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16564gs.m54079b():com.google.android.gms.internal.measurement.gt");
    }

    /* renamed from: a */
    private static final C16565gt m54078a(String str) throws Exception {
        return (C16565gt) f46367a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
