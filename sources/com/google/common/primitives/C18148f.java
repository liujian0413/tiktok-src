package com.google.common.primitives;

import com.google.common.base.C17439m;

/* renamed from: com.google.common.primitives.f */
public final class C18148f {
    /* renamed from: a */
    public static byte m59988a(long j) {
        boolean z;
        byte b = (byte) ((int) j);
        if (((long) b) == j) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57973a(z, "Out of range: %s", j);
        return b;
    }
}
