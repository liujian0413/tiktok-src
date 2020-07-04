package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ig */
final class C16612ig {

    /* renamed from: a */
    private static final C16610ie f46454a = m54262c();

    /* renamed from: b */
    private static final C16610ie f46455b = new C16611if();

    /* renamed from: a */
    static C16610ie m54260a() {
        return f46454a;
    }

    /* renamed from: b */
    static C16610ie m54261b() {
        return f46455b;
    }

    /* renamed from: c */
    private static C16610ie m54262c() {
        try {
            return (C16610ie) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
