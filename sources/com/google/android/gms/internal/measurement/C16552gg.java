package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.gg */
class C16552gg extends C16551gf {

    /* renamed from: a */
    protected final byte[] f46345a;

    C16552gg(byte[] bArr) {
        if (bArr != null) {
            this.f46345a = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo42761a() {
        return 0;
    }

    public byte zzam(int i) {
        return this.f46345a[i];
    }

    /* access modifiers changed from: 0000 */
    public byte zzan(int i) {
        return this.f46345a[i];
    }

    public int size() {
        return this.f46345a.length;
    }

    public final zzte zzb(int i, int i2) {
        int zzb = zzb(0, i2, size());
        if (zzb == 0) {
            return zzte.zzbtq;
        }
        return new C16547gb(this.f46345a, mo42761a(), zzb);
    }

    /* access modifiers changed from: 0000 */
    public final void zza(C16541fw fwVar) throws IOException {
        fwVar.mo42752a(this.f46345a, mo42761a(), size());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.f46345a, mo42761a(), size(), charset);
    }

    public final boolean zzue() {
        int a = mo42761a();
        return C16664ka.m54647a(this.f46345a, a, size() + a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzte) || size() != ((zzte) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C16552gg)) {
            return obj.equals(this);
        }
        C16552gg ggVar = (C16552gg) obj;
        int i = this.zzbsi;
        int i2 = ggVar.zzbsi;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo42766a(ggVar, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo42766a(zzte zzte, int i, int i2) {
        if (i2 > zzte.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzte.size()) {
            int size2 = zzte.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzte instanceof C16552gg)) {
            return zzte.zzb(0, i2).equals(zzb(0, i2));
        } else {
            C16552gg ggVar = (C16552gg) zzte;
            byte[] bArr = this.f46345a;
            byte[] bArr2 = ggVar.f46345a;
            int a = mo42761a() + i2;
            int a2 = mo42761a();
            int a3 = ggVar.mo42761a();
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
    public final int zza(int i, int i2, int i3) {
        return C16586hh.m54183a(i, this.f46345a, mo42761a(), i3);
    }
}
