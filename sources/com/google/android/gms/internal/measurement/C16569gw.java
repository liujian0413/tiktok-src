package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gw */
final class C16569gw {

    /* renamed from: a */
    private static final C16567gu<?> f46374a = new C16568gv();

    /* renamed from: b */
    private static final C16567gu<?> f46375b = m54108c();

    /* renamed from: c */
    private static C16567gu<?> m54108c() {
        try {
            return (C16567gu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C16567gu<?> m54106a() {
        return f46374a;
    }

    /* renamed from: b */
    static C16567gu<?> m54107b() {
        if (f46375b != null) {
            return f46375b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
