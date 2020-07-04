package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.security.KeyPairGeneratorSpec.Builder;
import android.util.Base64;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.snapchat.kit.sdk.core.security.e */
public final class C18696e implements EncryptDecryptAlgorithm {

    /* renamed from: a */
    private final KeyPair f50497a;

    /* renamed from: com.snapchat.kit.sdk.core.security.e$a */
    public static class C18698a {

        /* renamed from: a */
        String f50498a;

        /* renamed from: b */
        String f50499b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C18698a)) {
                return false;
            }
            C18698a aVar = (C18698a) obj;
            if (!Objects.equals(this.f50498a, aVar.f50498a) || !Objects.equals(this.f50499b, aVar.f50499b)) {
                return false;
            }
            return true;
        }

        private C18698a(String str, String str2) {
            this.f50498a = str;
            this.f50499b = str2;
        }
    }

    /* renamed from: a */
    public final C18698a mo49188a() {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f50497a.getPublic();
        return new C18698a(rSAPublicKey.getModulus().toString(), rSAPublicKey.getPublicExponent().toString());
    }

    public final String decrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m61248b(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public final String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m61246a(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private String m61246a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(1, this.f50497a.getPublic());
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
    }

    /* renamed from: b */
    private String m61248b(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(2, this.f50497a.getPrivate());
        return new String(instance.doFinal(Base64.decode(str, 0)));
    }

    public C18696e(KeyStore keyStore, Context context, C18698a aVar) throws NoSuchAlgorithmException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException, KeyStoreException {
        this.f50497a = m61247a(keyStore, context, aVar);
    }

    /* renamed from: a */
    private static KeyPair m61247a(KeyStore keyStore, Context context, C18698a aVar) throws NoSuchAlgorithmException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException, KeyStoreException {
        if (!(aVar == null || aVar.f50498a == null || aVar.f50499b == null || !keyStore.containsAlias("SnapConnectSDK.RSA"))) {
            try {
                return new KeyPair(KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(aVar.f50498a), new BigInteger(aVar.f50499b))), ((PrivateKeyEntry) keyStore.getEntry("SnapConnectSDK.RSA", null)).getPrivateKey());
            } catch (InvalidKeySpecException unused) {
            }
        }
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        instance.add(1, 1);
        Date time2 = instance.getTime();
        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", keyStore.getType());
        instance2.initialize(new Builder(context).setAlias("SnapConnectSDK.RSA").setStartDate(time).setEndDate(time2).setSubject(new X500Principal("CN=SnapConnectSDK.RSA")).setSerialNumber(BigInteger.ONE).setKeySize(VideoCacheReadBuffersizeExperiment.DEFAULT).build());
        return instance2.generateKeyPair();
    }
}
