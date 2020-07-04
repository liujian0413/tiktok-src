package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class avn implements aqb {

    /* renamed from: a */
    private Mac f41107a;

    /* renamed from: b */
    private final int f41108b;

    /* renamed from: c */
    private final String f41109c;

    /* renamed from: d */
    private final Key f41110d;

    public avn(String str, Key key, int i) throws GeneralSecurityException {
        String str2;
        if (i >= 10) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (i > 20) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 1:
                    if (i > 32) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 2:
                    if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                default:
                    String str3 = "unknown Hmac algorithm: ";
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        str2 = str3.concat(valueOf);
                    } else {
                        str2 = new String(str3);
                    }
                    throw new NoSuchAlgorithmException(str2);
            }
            this.f41109c = str;
            this.f41108b = i;
            this.f41110d = key;
            this.f41107a = (Mac) avc.f41095b.mo40070a(str);
            this.f41107a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo39947a(byte[] bArr) throws GeneralSecurityException {
        Mac mac;
        try {
            mac = (Mac) this.f41107a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) avc.f41095b.mo40070a(this.f41109c);
            mac.init(this.f41110d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f41108b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f41108b);
        return bArr2;
    }
}
