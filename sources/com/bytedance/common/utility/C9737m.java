package com.bytedance.common.utility;

import com.C1642a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bytedance.common.utility.m */
public final class C9737m {
    /* renamed from: a */
    private static String m28689a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : bArr) {
                sb.append(C1642a.m8034a("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m28688a(String str, String str2) {
        byte[] bytes = str.getBytes();
        try {
            if (C6319n.m19593a(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes);
            return m28689a(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
