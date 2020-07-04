package com.p280ss.android.ugc.aweme.captcha.p1080c;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.ugc.aweme.captcha.c.a */
public final class C23644a {
    /* renamed from: a */
    private static String m77544a() {
        return "eagleye_9fd&fwfl";
    }

    /* renamed from: b */
    public static String m77547b(String str) {
        try {
            return m77548b(m77546a(str.getBytes()));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static byte[] m77546a(byte[] bArr) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(m77544a().getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
        Cipher instance = Cipher.getInstance("AES/CFB/NoPadding ");
        instance.init(1, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr);
    }

    /* renamed from: b */
    private static String m77548b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = charArray[b >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: c */
    private static byte[] m77549c(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m77545a(String str) throws Exception {
        byte[] c = m77549c(str);
        SecretKeySpec secretKeySpec = new SecretKeySpec(m77544a().getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
        Cipher instance = Cipher.getInstance("AES/CFB/NoPadding ");
        instance.init(2, secretKeySpec, ivParameterSpec);
        return new String(instance.doFinal(c), "UTF-8");
    }
}
