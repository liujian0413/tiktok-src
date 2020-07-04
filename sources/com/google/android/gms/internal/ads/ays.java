package com.google.android.gms.internal.ads;

final class ays implements ayz {

    /* renamed from: a */
    private ayz[] f41239a;

    ays(ayz... ayzArr) {
        this.f41239a = ayzArr;
    }

    /* renamed from: a */
    public final boolean mo40279a(Class<?> cls) {
        for (ayz a : this.f41239a) {
            if (a.mo40279a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ayy mo40280b(Class<?> cls) {
        ayz[] ayzArr;
        for (ayz ayz : this.f41239a) {
            if (ayz.mo40279a(cls)) {
                return ayz.mo40280b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
