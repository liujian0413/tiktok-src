package com.p280ss.android.account.token;

import android.os.Build.VERSION;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: com.ss.android.account.token.i */
public final class C18908i {

    /* renamed from: a */
    private static String f50971a = "RSA";

    /* renamed from: b */
    private static String f50972b = "RSA/ECB/PKCS1Padding";

    /* renamed from: c */
    private static String f50973c = "MIICXAIBAAKBgQCyEFRPAsPPveGVFOB1pdduJpiNMghV1vlADTtncJxefJ9M2vg9\nT1ghyVYg4HlYeT8AxOv926Ex83tdEiiHhf9o43s05REzFmL+ew+lp3HZPDdTeWuH\nNX46aUcODhnXTZUm00I4+0BJrqbj34pRlKXpJAfLmsp5CsAEN7qMPpg2QwIDAQAB\nAoGBAKXLOITcwS+D0C+8YYaJZP5F55LIPCSY5jkyWNZmbuI3TSgFVk/XueqziYNR\nHws20WfI8ybKQdu9pmaxSpVtObKFNh4QOs3utDmNCWj5VZQQ1CrKjotchsCUyJdG\nfG5IcuORAoGGfTGi2OZ2HBEYnbyS9qkcm7iIeHoPi6hiOl7ZAkEA2hpE+g9U85R/\nSt20XAnV3ub01r4aErrm1o4zgpNSrXDrxt8vcgsRME+AzNVN2gkn0FNWgBxdXvUu\ndi6Ke9rz1QJBANEBCUOwB5708PefN4ZJ9N0p/iyzXf6nXU7hKWL0RHngLMBVpu4h\ncqPPsqc68qsIIeuYC/T09ibiyr9e6G8txbcCQAW9nUUrtCO5K+SPk1i81YlJcPZa\nCJunmb3Z/lcYg5uXFk2kwD3zNp+b6Br8HlF33jloiCVVGcwPDgsETJbX+4UCQAnx\nkK1FvLcVVDmTu6KJ9jpnew5JYllxQQE1uTBaCr/5qGdmK9D8imW8xfUq2szEUEjT\nLQ50cRmchKTiMRDJDrUCQB9x1+tXAaDMiV/3mzHFqCafIMAASo51cLfuV7XS+r/2\n53L/BRf/4c2m0Zq9pJ5kuKoH//WIiXgNzYeHnqgEayk=";

    /* renamed from: d */
    private static String f50974d = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCyEFRPAsPPveGVFOB1pdduJpiN\nMghV1vlADTtncJxefJ9M2vg9T1ghyVYg4HlYeT8AxOv926Ex83tdEiiHhf9o43s0\n5REzFmL+ew+lp3HZPDdTeWuHNX46aUcODhnXTZUm00I4+0BJrqbj34pRlKXpJAfL\nmsp5CsAEN7qMPpg2QwIDAQAB";

    /* renamed from: a */
    public static PrivateKey m61722a() throws Exception {
        return m61725b(f50973c);
    }

    /* renamed from: a */
    public static byte[] m61723a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: b */
    private static PrivateKey m61725b(String str) throws Exception {
        KeyFactory keyFactory;
        try {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode(str, 0));
            if (VERSION.SDK_INT >= 28) {
                keyFactory = KeyFactory.getInstance("RSA");
            } else {
                keyFactory = KeyFactory.getInstance("RSA", "BC");
            }
            return (RSAPrivateKey) keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        } catch (NoSuchAlgorithmException unused) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused2) {
            throw new Exception("私钥非法");
        } catch (NullPointerException unused3) {
            throw new Exception("私钥数据为空");
        }
    }

    /* renamed from: a */
    public static byte[] m61724a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher instance = Cipher.getInstance(f50972b);
            instance.init(2, privateKey);
            return instance.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
