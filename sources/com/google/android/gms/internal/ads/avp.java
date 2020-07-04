package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class avp {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f41111a = new avq();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static SecureRandom m47383b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: a */
    public static byte[] m47382a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f41111a.get()).nextBytes(bArr);
        return bArr;
    }
}
