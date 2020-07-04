package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16584e;

/* renamed from: com.google.android.gms.internal.measurement.he */
final class C16578he implements C16614ii {

    /* renamed from: a */
    private static final C16578he f46402a = new C16578he();

    private C16578he() {
    }

    /* renamed from: a */
    public static C16578he m54144a() {
        return f46402a;
    }

    /* renamed from: a */
    public final boolean mo42926a(Class<?> cls) {
        return C16579hf.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final C16613ih mo42927b(Class<?> cls) {
        if (!C16579hf.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C16613ih) C16579hf.m54148a(cls.asSubclass(C16579hf.class)).mo42928a(C16584e.f46409c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
