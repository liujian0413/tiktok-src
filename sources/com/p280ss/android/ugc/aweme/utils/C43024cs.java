package com.p280ss.android.ugc.aweme.utils;

import android.util.Pair;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.ugc.aweme.utils.cs */
public final class C43024cs {
    /* renamed from: a */
    private static byte[] m136545a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public static Pair<byte[], Integer> m136544a(byte[] bArr, String str) throws Exception {
        byte[] a = m136546a(Arrays.copyOfRange(bArr, 0, 12), m136545a(str), Arrays.copyOfRange(bArr, 12, bArr.length));
        return new Pair<>(a, Integer.valueOf(a.length));
    }

    /* renamed from: a */
    private static byte[] m136546a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr3);
    }
}
