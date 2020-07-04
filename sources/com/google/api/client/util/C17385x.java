package com.google.api.client.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: com.google.api.client.util.x */
public final class C17385x {
    /* renamed from: a */
    public static Signature m57855a() throws NoSuchAlgorithmException {
        return Signature.getInstance("SHA256withRSA");
    }

    /* renamed from: a */
    public static byte[] m57856a(Signature signature, PrivateKey privateKey, byte[] bArr) throws InvalidKeyException, SignatureException {
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }
}
