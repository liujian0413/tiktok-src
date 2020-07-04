package com.google.common.primitives;

import com.google.common.base.C17439m;

/* renamed from: com.google.common.primitives.g */
public final class C18149g {
    /* renamed from: a */
    public static int m59990a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static byte m59989a(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57973a(z, "out of range: %s", j);
        return (byte) ((int) j);
    }
}
