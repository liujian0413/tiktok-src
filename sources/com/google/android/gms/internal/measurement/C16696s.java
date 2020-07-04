package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.C15167c;

/* renamed from: com.google.android.gms.internal.measurement.s */
public final class C16696s {

    /* renamed from: a */
    public static final String f46636a = String.valueOf(C15167c.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");

    /* renamed from: b */
    public static final String f46637b;

    static {
        String str = "ma";
        String valueOf = String.valueOf(f46636a);
        f46637b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
