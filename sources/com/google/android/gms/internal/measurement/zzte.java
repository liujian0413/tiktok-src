package com.google.android.gms.internal.measurement;

import com.C1642a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzte implements Serializable, Iterable<Byte> {
    public static final zzte zzbtq = new C16552gg(C16586hh.f46425b);
    private static final C16548gc zzbtr = (C16539fu.m53895a() ? new C16553gh(null) : new C16546ga(null));
    private static final Comparator<zzte> zzbts = new C16543fy();
    public int zzbsi;

    zzte() {
    }

    /* access modifiers changed from: private */
    public static int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract int zza(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void zza(C16541fw fwVar) throws IOException;

    public abstract byte zzam(int i);

    /* access modifiers changed from: 0000 */
    public abstract byte zzan(int i);

    public abstract zzte zzb(int i, int i2);

    public abstract boolean zzue();

    public static zzte zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new C16552gg(zzbtr.mo42760a(bArr, i, i2));
    }

    static zzte zzi(byte[] bArr) {
        return new C16552gg(bArr);
    }

    public static zzte zzga(String str) {
        return new C16552gg(str.getBytes(C16586hh.f46424a));
    }

    public final String zzud() {
        return size() == 0 ? "" : zza(C16586hh.f46424a);
    }

    public final int hashCode() {
        int i = this.zzbsi;
        if (i == 0) {
            int size = size();
            i = zza(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzbsi = i;
        }
        return i;
    }

    static C16550ge zzao(int i) {
        return new C16550ge(i, null);
    }

    static int zzb(int i, int i2, int i3) {
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
        return new C16542fx(this);
    }
}
