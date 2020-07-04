package com.google.android.gms.internal.ads;

import com.C1642a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class auk implements apo {

    /* renamed from: a */
    private final SecretKey f41043a;

    public auk(byte[] bArr) throws GeneralSecurityException {
        avs.m47385a(bArr.length);
        this.f41043a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo39926a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a = avp.m47382a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            Cipher cipher = (Cipher) avc.f41094a.mo40070a("AES/GCM/NoPadding");
            cipher.init(1, this.f41043a, m47313a(a, 0, a.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                cipher.updateAAD(bArr2);
            }
            int doFinal = cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(C1642a.m8034a("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{Integer.valueOf(16), Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    private static AlgorithmParameterSpec m47313a(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (avr.m47384a()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }
}
