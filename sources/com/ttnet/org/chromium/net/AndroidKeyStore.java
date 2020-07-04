package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

@JNINamespace("net::android")
public class AndroidKeyStore {
    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Exception while checking support for ");
            sb.append(str);
            sb.append(": ");
            sb.append(e);
            Log.m146394e("AndroidKeyStore", sb.toString(), new Object[0]);
            return false;
        }
    }

    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Exception while checking support for ");
            sb.append(str);
            sb.append(": ");
            sb.append(e);
            Log.m146394e("AndroidKeyStore", sb.toString(), new Object[0]);
            return false;
        }
    }

    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(str);
            try {
                instance.init(1, privateKey);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Exception while encrypting input with ");
                sb.append(str);
                sb.append(" and ");
                sb.append(privateKey.getAlgorithm());
                sb.append(" private key (");
                sb.append(privateKey.getClass().getName());
                sb.append("): ");
                sb.append(e);
                Log.m146394e("AndroidKeyStore", sb.toString(), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            StringBuilder sb2 = new StringBuilder("Cipher ");
            sb2.append(str);
            sb2.append(" not supported: ");
            sb2.append(e2);
            Log.m146394e("AndroidKeyStore", sb2.toString(), new Object[0]);
            return null;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature instance = Signature.getInstance(str);
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                return instance.sign();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Exception while signing message with ");
                sb.append(str);
                sb.append(" and ");
                sb.append(privateKey.getAlgorithm());
                sb.append(" private key (");
                sb.append(privateKey.getClass().getName());
                sb.append("): ");
                sb.append(e);
                Log.m146394e("AndroidKeyStore", sb.toString(), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder sb2 = new StringBuilder("Signature algorithm ");
            sb2.append(str);
            sb2.append(" not supported: ");
            sb2.append(e2);
            Log.m146394e("AndroidKeyStore", sb2.toString(), new Object[0]);
            return null;
        }
    }
}
