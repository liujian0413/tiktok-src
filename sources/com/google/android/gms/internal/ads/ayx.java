package com.google.android.gms.internal.ads;

final class ayx {

    /* renamed from: a */
    private static final ayv f41244a = m47822c();

    /* renamed from: b */
    private static final ayv f41245b = new ayw();

    /* renamed from: a */
    static ayv m47820a() {
        return f41244a;
    }

    /* renamed from: b */
    static ayv m47821b() {
        return f41245b;
    }

    /* renamed from: c */
    private static ayv m47822c() {
        try {
            return (ayv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
