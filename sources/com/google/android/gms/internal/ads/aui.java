package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class aui implements avm {

    /* renamed from: a */
    private final SecretKeySpec f41036a;

    /* renamed from: b */
    private final int f41037b;

    /* renamed from: c */
    private final int f41038c = ((Cipher) avc.f41094a.mo40070a("AES/CTR/NoPadding")).getBlockSize();

    public aui(byte[] bArr, int i) throws GeneralSecurityException {
        avs.m47385a(bArr.length);
        this.f41036a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f41038c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f41037b = i;
    }

    /* renamed from: a */
    public final byte[] mo40050a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - this.f41037b) {
            byte[] bArr2 = new byte[(this.f41037b + bArr.length)];
            byte[] a = avp.m47382a(this.f41037b);
            System.arraycopy(a, 0, bArr2, 0, this.f41037b);
            int length = bArr.length;
            int i = this.f41037b;
            Cipher cipher = (Cipher) avc.f41094a.mo40070a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.f41038c];
            System.arraycopy(a, 0, bArr3, 0, this.f41037b);
            cipher.init(1, this.f41036a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i2 = Integer.MAX_VALUE - this.f41037b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
