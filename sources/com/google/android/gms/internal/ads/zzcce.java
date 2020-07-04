package com.google.android.gms.internal.ads;

import com.C1642a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzcce implements Serializable, Iterable<Byte> {
    public static final zzcce zzfuo = new awv(axw.f41217b);
    private static final awr zzfup = (awg.m47418a() ? new aww(null) : new awp(null));
    private static final Comparator<zzcce> zzfuq = new awn();
    public int zzftx;

    zzcce() {
    }

    /* access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void zza(awl awl) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract boolean zzarf();

    public abstract awx zzarg();

    /* access modifiers changed from: protected */
    public abstract int zzf(int i, int i2, int i3);

    public abstract byte zzfi(int i);

    /* access modifiers changed from: 0000 */
    public abstract byte zzfj(int i);

    public abstract zzcce zzw(int i, int i2);

    public static zzcce zzi(byte[] bArr, int i, int i2) {
        zzg(i, i + i2, bArr.length);
        return new awv(zzfup.mo40116a(bArr, i, i2));
    }

    public static zzcce zzy(byte[] bArr) {
        return zzi(bArr, 0, bArr.length);
    }

    static zzcce zzz(byte[] bArr) {
        return new awv(bArr);
    }

    public static zzcce zzgt(String str) {
        return new awv(str.getBytes(axw.f41216a));
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return axw.f41217b;
        }
        byte[] bArr = new byte[size];
        zza(bArr, 0, 0, size);
        return bArr;
    }

    public final String zzare() {
        return size() == 0 ? "" : zza(axw.f41216a);
    }

    public final int hashCode() {
        int i = this.zzftx;
        if (i == 0) {
            int size = size();
            i = zzf(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzftx = i;
        }
        return i;
    }

    static awt zzfk(int i) {
        return new awt(i, null);
    }

    static int zzg(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return C1642a.m8034a("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public /* synthetic */ Iterator iterator() {
        return new awm(this);
    }
}
