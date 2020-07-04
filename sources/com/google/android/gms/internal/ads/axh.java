package com.google.android.gms.internal.ads;

final class axh {

    /* renamed from: a */
    private static final Class<?> f41166a = m47628c();

    /* renamed from: c */
    private static Class<?> m47628c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static axi m47625a() {
        if (f41166a != null) {
            try {
                return m47626a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return axi.f41167a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.axi m47627b() {
        /*
            java.lang.Class<?> r0 = f41166a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.ads.axi r0 = m47626a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.ads.axi r0 = com.google.android.gms.internal.ads.axi.m47631c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.ads.axi r0 = m47625a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axh.m47627b():com.google.android.gms.internal.ads.axi");
    }

    /* renamed from: a */
    private static final axi m47626a(String str) throws Exception {
        return (axi) f41166a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
