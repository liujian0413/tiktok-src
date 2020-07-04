package com.p280ss.android.deviceregister.p290b.p291a.p292a;

import android.text.TextUtils;
import android.util.Base64;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* renamed from: com.ss.android.deviceregister.b.a.a.c */
public final class C6785c {

    /* renamed from: a */
    private static String f19327a;

    /* renamed from: a */
    public static String m21010a() {
        if (TextUtils.isEmpty(f19327a)) {
            f19327a = m21011a("Ynl0ZWRhbmNl");
        }
        return f19327a;
    }

    /* renamed from: a */
    private static Key m21013a(byte[] bArr) throws Exception {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr));
    }

    /* renamed from: a */
    public static String m21011a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m21012a(byte[] bArr, String str) throws Exception {
        byte[] decode = Base64.decode(bArr, 0);
        SecureRandom secureRandom = new SecureRandom();
        Key a = m21013a(str.getBytes());
        Cipher instance = Cipher.getInstance("DES");
        instance.init(2, a, secureRandom);
        return new String(instance.doFinal(decode), "UTF-8");
    }

    /* renamed from: a */
    public static byte[] m21014a(String str, String str2) throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        Key a = m21013a(str2.getBytes());
        Cipher instance = Cipher.getInstance("DES");
        instance.init(1, a, secureRandom);
        return Base64.encode(instance.doFinal(str.getBytes("UTF-8")), 0);
    }
}
