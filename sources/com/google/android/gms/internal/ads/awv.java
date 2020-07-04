package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

class awv extends awu {

    /* renamed from: a */
    protected final byte[] f41142a;

    awv(byte[] bArr) {
        if (bArr != null) {
            this.f41142a = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo40117a() {
        return 0;
    }

    public byte zzfi(int i) {
        return this.f41142a[i];
    }

    /* access modifiers changed from: 0000 */
    public byte zzfj(int i) {
        return this.f41142a[i];
    }

    public int size() {
        return this.f41142a.length;
    }

    public final zzcce zzw(int i, int i2) {
        int zzg = zzg(0, i2, size());
        if (zzg == 0) {
            return zzcce.zzfuo;
        }
        return new awq(this.f41142a, mo40117a(), zzg);
    }

    /* access modifiers changed from: protected */
    public void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f41142a, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: 0000 */
    public final void zza(awl awl) throws IOException {
        awl.mo40110a(this.f41142a, mo40117a(), size());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.f41142a, mo40117a(), size(), charset);
    }

    public final boolean zzarf() {
        int a = mo40117a();
        return bas.m48227a(this.f41142a, a, size() + a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcce) || size() != ((zzcce) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof awv)) {
            return obj.equals(this);
        }
        awv awv = (awv) obj;
        int i = this.zzftx;
        int i2 = awv.zzftx;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo40123a(awv, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo40123a(zzcce zzcce, int i, int i2) {
        if (i2 > zzcce.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzcce.size()) {
            int size2 = zzcce.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzcce instanceof awv)) {
            return zzcce.zzw(0, i2).equals(zzw(0, i2));
        } else {
            awv awv = (awv) zzcce;
            byte[] bArr = this.f41142a;
            byte[] bArr2 = awv.f41142a;
            int a = mo40117a() + i2;
            int a2 = mo40117a();
            int a3 = awv.mo40117a();
            while (a2 < a) {
                if (bArr[a2] != bArr2[a3]) {
                    return false;
                }
                a2++;
                a3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int zzf(int i, int i2, int i3) {
        return axw.m47740a(i, this.f41142a, mo40117a(), i3);
    }

    public final awx zzarg() {
        return awx.m47454a(this.f41142a, mo40117a(), size(), true);
    }
}
