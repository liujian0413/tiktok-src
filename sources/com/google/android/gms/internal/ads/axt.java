package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15550e;

final class axt implements ayz {

    /* renamed from: a */
    private static final axt f41194a = new axt();

    private axt() {
    }

    /* renamed from: a */
    public static axt m47691a() {
        return f41194a;
    }

    /* renamed from: a */
    public final boolean mo40279a(Class<?> cls) {
        return axu.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final ayy mo40280b(Class<?> cls) {
        if (!axu.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (ayy) axu.m47700a(cls.asSubclass(axu.class)).mo39285a(C15550e.f41201c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
