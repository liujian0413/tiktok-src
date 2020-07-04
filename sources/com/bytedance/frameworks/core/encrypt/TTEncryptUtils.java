package com.bytedance.frameworks.core.encrypt;

import com.bytedance.frameworks.encryptor.EncryptorUtil;

public class TTEncryptUtils {

    /* renamed from: a */
    public static volatile boolean f18651a = false;

    private static native byte[] handleData(byte[] bArr, int i);

    static {
        try {
            C6369b.m19800a("ttEncrypt");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* renamed from: a */
    public static byte[] m19789a(byte[] bArr, int i) {
        if (bArr != null && i > 0) {
            try {
                if (bArr.length == i) {
                    if (f18651a) {
                        return EncryptorUtil.m19810a(bArr, i);
                    }
                    return handleData(bArr, i);
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
