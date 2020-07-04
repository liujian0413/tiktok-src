package com.google.android.gms.common.p746a;

/* renamed from: com.google.android.gms.common.a.a */
public abstract class C15010a<T> {

    /* renamed from: c */
    private static final Object f38859c = new Object();

    /* renamed from: d */
    private static C15011a f38860d = null;

    /* renamed from: e */
    private static int f38861e = 0;

    /* renamed from: a */
    protected final String f38862a;

    /* renamed from: b */
    protected final T f38863b;

    /* renamed from: com.google.android.gms.common.a.a$a */
    interface C15011a {
    }

    protected C15010a(String str, T t) {
        this.f38862a = str;
        this.f38863b = t;
    }

    /* renamed from: a */
    public static C15010a<Boolean> m43544a(String str, boolean z) {
        return new C15012b(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static C15010a<Long> m43542a(String str, Long l) {
        return new C15013c(str, l);
    }

    /* renamed from: a */
    public static C15010a<Integer> m43541a(String str, Integer num) {
        return new C15014d(str, num);
    }

    /* renamed from: a */
    public static C15010a<Float> m43540a(String str, Float f) {
        return new C15015e(str, f);
    }

    /* renamed from: a */
    public static C15010a<String> m43543a(String str, String str2) {
        return new C15016f(str, str2);
    }
}
