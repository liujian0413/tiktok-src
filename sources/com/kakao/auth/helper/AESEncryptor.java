package com.kakao.auth.helper;

import android.content.Context;
import android.provider.Settings.Secure;
import android.util.Base64;
import com.C1642a;
import com.kakao.util.helper.Utility;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

class AESEncryptor implements Encryptor {
    private static final IvParameterSpec IV_PARAMETER_SPEC = new IvParameterSpec(initVector);
    private static final String cipherAlgorithm = Utils.base64DecodeAndXor("Iio+ASgjKE4/ZSIjXDMOCUoCDww=");
    private static final byte[] initVector = {112, 78, 75, 55, -54, -30, -10, 44, 102, -126, -126, 92, -116, -48, -123, -55};
    private static final String keyGenAlgorithm = Utils.base64DecodeAndXor("My0oeSI1IzInbyA+LVFaW2wiNSokPAMiMipOLS4=");
    private Cipher decryptor = Cipher.getInstance(cipherAlgorithm);
    private Cipher encryptor = Cipher.getInstance(cipherAlgorithm);

    static class AndroidIdUtils {
        AndroidIdUtils() {
        }

        private static String stripZeroOrSpace(String str) {
            if (str == null) {
                return null;
            }
            return str.replaceAll("[0\\s]", "");
        }

        private static byte[] hash(String str) throws NoSuchAlgorithmException {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.reset();
            instance.update(str.getBytes());
            return instance.digest();
        }

        static byte[] generateAndroidId(Context context) throws NoSuchAlgorithmException {
            String string = Secure.getString(context.getContentResolver(), "android_id");
            if (string != null) {
                return hash(C1642a.m8034a("SDK-%s", new Object[]{stripZeroOrSpace(string)}));
            }
            throw new NullPointerException("android_id is null.");
        }
    }

    static class Utils {
        private Utils() {
        }

        static String xorMessage(String str) {
            return xorMessage(str, "com.kakao.api");
        }

        static String base64DecodeAndXor(String str) {
            return xorMessage(new String(Base64.decode(str, 0)));
        }

        static String xorMessage(String str, String str2) {
            if (str == null || str2 == null) {
                return null;
            }
            try {
                char[] charArray = str2.toCharArray();
                char[] charArray2 = str.toCharArray();
                int length = charArray2.length;
                int length2 = charArray.length;
                char[] cArr = new char[length];
                for (int i = 0; i < length; i++) {
                    cArr[i] = (char) (charArray2[i] ^ charArray[i % length2]);
                }
                return new String(cArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public String decrypt(String str) throws GeneralSecurityException, IOException {
        if (str == null) {
            return null;
        }
        return new String(this.decryptor.doFinal(Base64.decode(str, 2)), "UTF-8");
    }

    public String encrypt(String str) throws GeneralSecurityException, IOException {
        if (str == null) {
            return null;
        }
        return Base64.encodeToString(this.encryptor.doFinal(str.getBytes("UTF-8")), 2);
    }

    AESEncryptor(Context context, byte[] bArr) throws GeneralSecurityException {
        String keyHash = Utility.getKeyHash(context);
        SecretKey generateSecret = SecretKeyFactory.getInstance(keyGenAlgorithm).generateSecret(new PBEKeySpec(keyHash.substring(0, Math.min(keyHash.length(), 16)).toCharArray(), bArr, 2, 256));
        SecretKeySpec secretKeySpec = new SecretKeySpec(generateSecret.getEncoded(), "AES");
        try {
            this.encryptor.init(1, secretKeySpec, IV_PARAMETER_SPEC);
            this.decryptor.init(2, secretKeySpec, IV_PARAMETER_SPEC);
        } catch (InvalidKeyException unused) {
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(Arrays.copyOfRange(generateSecret.getEncoded(), 0, generateSecret.getEncoded().length / 2), "AES");
            this.encryptor.init(1, secretKeySpec2, IV_PARAMETER_SPEC);
            this.decryptor.init(2, secretKeySpec2, IV_PARAMETER_SPEC);
        }
    }
}
