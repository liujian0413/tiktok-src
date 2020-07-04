package com.p280ss.android.ugc.aweme.sdk.iap.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.c */
public final class C37371c {
    /* renamed from: a */
    private static PublicKey m119962a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static boolean m119963a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return false;
        }
        return m119964a(m119962a(str), str2, str3);
    }

    /* renamed from: a */
    private static boolean m119964a(PublicKey publicKey, String str, String str2) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                if (!instance.verify(decode)) {
                    return false;
                }
                return true;
            } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException unused) {
                return false;
            }
        } catch (IllegalArgumentException unused2) {
            return false;
        }
    }
}
