package com.bytedance.frameworks.encryptor;

public class EncryptorUtil {
    private static native byte[] ttEncrypt(byte[] bArr, int i);

    static {
        try {
            C6375a.m19811a("Encryptor");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* renamed from: a */
    public static byte[] m19810a(byte[] bArr, int i) {
        if (bArr != null && i > 0) {
            try {
                if (bArr.length == i) {
                    return ttEncrypt(bArr, i);
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
