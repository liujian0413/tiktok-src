package com.google.android.gms.internal.ads;

final class axl {

    /* renamed from: a */
    private static final axj<?> f41173a = new axk();

    /* renamed from: b */
    private static final axj<?> f41174b = m47656c();

    /* renamed from: c */
    private static axj<?> m47656c() {
        try {
            return (axj) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static axj<?> m47654a() {
        return f41173a;
    }

    /* renamed from: b */
    static axj<?> m47655b() {
        if (f41174b != null) {
            return f41174b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
