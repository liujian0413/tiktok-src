package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStore.SecretKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.snapchat.kit.sdk.core.security.g */
public final class C18700g {
    /* renamed from: a */
    private static SecretKey m61253a() throws NoSuchAlgorithmException {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return instance.generateKey();
    }

    /* renamed from: a */
    public static C18699f m61251a(KeyStore keyStore) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            if (keyStore.containsAlias("SnapConnectSDK.AES")) {
                return new C18699f(((SecretKeyEntry) keyStore.getEntry("SnapConnectSDK.AES", null)).getSecretKey(), false);
            }
        } catch (KeyStoreException | UnrecoverableEntryException unused) {
        }
        KeyGenerator instance = KeyGenerator.getInstance("AES", keyStore.getType());
        instance.init(new Builder("SnapConnectSDK.AES", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build());
        return new C18699f(instance.generateKey(), true);
    }

    /* renamed from: a */
    private static String m61252a(SecretKey secretKey, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        return encryptDecryptAlgorithm.encrypt(new String(secretKey.getEncoded()));
    }

    /* renamed from: a */
    public static C18699f m61250a(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, boolean z) throws NoSuchAlgorithmException {
        boolean z2;
        SecretKey secretKey = null;
        if (!z) {
            String string = sharedPreferences.getString("encoded_secret", null);
            if (string != null) {
                secretKey = m61254a(string, 32, encryptDecryptAlgorithm);
            }
        }
        if (secretKey == null) {
            z2 = true;
            secretKey = m61253a();
            sharedPreferences.edit().putString("encoded_secret", m61252a(secretKey, encryptDecryptAlgorithm)).apply();
        } else {
            z2 = false;
        }
        return new C18699f(secretKey, z2);
    }

    /* renamed from: a */
    private static SecretKey m61254a(String str, int i, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        String decrypt = encryptDecryptAlgorithm.decrypt(str);
        if (decrypt == null) {
            return null;
        }
        return new SecretKeySpec(decrypt.getBytes(), decrypt.length() - 32, 32, "AES");
    }
}
