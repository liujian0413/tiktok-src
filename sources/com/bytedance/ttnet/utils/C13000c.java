package com.bytedance.ttnet.utils;

import android.util.Base64;
import com.C1642a;
import com.bytedance.common.utility.C6312h;
import com.bytedance.ttnet.hostmonitor.Logger;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.bytedance.ttnet.utils.c */
public final class C13000c {

    /* renamed from: a */
    private static final char[] f34427a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private static byte[] m37930a(byte[] bArr) {
        return Base64.encode(bArr, 2);
    }

    /* renamed from: b */
    private static byte[] m37935b(byte[] bArr) {
        return Base64.decode(bArr, 2);
    }

    /* renamed from: a */
    public static byte[] m37931a(byte[] bArr, byte[] bArr2) {
        return m37932a(bArr, bArr2, "HmacSHA256");
    }

    /* renamed from: a */
    public static byte[] m37929a(int i, String str) {
        byte[] bArr = {72, 75, 50, 65, 33, 53, 60, 42, 44, 46, 35, 50, 42, 63, 55, 48};
        try {
            byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("TtTokenConfig".toCharArray(), "[B@3d4eac69".getBytes(), i, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH)).getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, str);
            byte[] bArr2 = new byte[encoded.length];
            try {
                for (byte valueOf : secretKeySpec.getEncoded()) {
                    int abs = (Math.abs(Integer.parseInt(C1642a.m8034a("%d", new Object[]{Byte.valueOf(valueOf)}))) % 54) + 40;
                    if (abs == 47) {
                        abs = 33;
                    } else if (abs == 61 || abs == 92) {
                        abs = 35;
                    }
                    bArr2[0] = (byte) abs;
                }
                if (!C6312h.m19578b()) {
                    return bArr2;
                }
                StringBuilder sb = new StringBuilder("generateSecretKey for ");
                sb.append(str);
                sb.append(" key = ");
                sb.append(bArr2);
                Logger.m37870c("TtTokenEncrypt", sb.toString());
                return bArr2;
            } catch (Throwable unused) {
                return bArr2;
            }
        } catch (Throwable unused2) {
            return bArr;
        }
    }

    /* renamed from: a */
    private static byte[] m37932a(byte[] bArr, byte[] bArr2, String str) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Mac instance = Mac.getInstance(str);
            instance.init(secretKeySpec);
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m37936b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return m37933a(bArr, bArr2, "AES", str, bArr3, true);
    }

    /* renamed from: c */
    public static byte[] m37937c(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return m37938d(m37935b(bArr), bArr2, str, bArr3);
    }

    /* renamed from: d */
    public static byte[] m37938d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return m37933a(bArr, bArr2, "AES", str, bArr3, false);
    }

    /* renamed from: a */
    public static byte[] m37934a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return m37930a(m37936b(bArr, bArr2, str, bArr3));
    }

    /* renamed from: a */
    private static byte[] m37933a(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, boolean z) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Cipher instance = Cipher.getInstance(str2);
            int i = 2;
            if (bArr3 != null) {
                if (bArr3.length != 0) {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                    if (z) {
                        i = 1;
                    }
                    instance.init(i, secretKeySpec, ivParameterSpec);
                    return instance.doFinal(bArr);
                }
            }
            if (z) {
                i = 1;
            }
            instance.init(i, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
