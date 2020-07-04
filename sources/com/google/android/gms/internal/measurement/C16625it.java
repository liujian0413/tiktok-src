package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.it */
final class C16625it {

    /* renamed from: a */
    private static final C16623ir f46479a = m54338c();

    /* renamed from: b */
    private static final C16623ir f46480b = new C16624is();

    /* renamed from: a */
    static C16623ir m54336a() {
        return f46479a;
    }

    /* renamed from: b */
    static C16623ir m54337b() {
        return f46480b;
    }

    /* renamed from: c */
    private static C16623ir m54338c() {
        try {
            return (C16623ir) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
