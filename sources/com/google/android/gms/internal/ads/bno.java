package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

final class bno implements bnr {

    /* renamed from: a */
    private final byte[] f42737a = new byte[8];

    /* renamed from: b */
    private final Stack<bnq> f42738b = new Stack<>();

    /* renamed from: c */
    private final bny f42739c = new bny();

    /* renamed from: d */
    private bns f42740d;

    /* renamed from: e */
    private int f42741e;

    /* renamed from: f */
    private int f42742f;

    /* renamed from: g */
    private long f42743g;

    bno() {
    }

    /* renamed from: a */
    public final void mo41029a(bns bns) {
        this.f42740d = bns;
    }

    /* renamed from: a */
    public final void mo41028a() {
        this.f42741e = 0;
        this.f42738b.clear();
        this.f42739c.mo41048a();
    }

    /* renamed from: a */
    public final boolean mo41030a(bne bne) throws IOException, InterruptedException {
        String str;
        double d;
        brr.m49873b(this.f42740d != null);
        while (true) {
            if (this.f42738b.isEmpty() || bne.mo41007b() < ((bnq) this.f42738b.peek()).f42745b) {
                if (this.f42741e == 0) {
                    long a = this.f42739c.mo41047a(bne, true, false, 4);
                    if (a == -2) {
                        bne.mo41005a();
                        while (true) {
                            bne.mo41012c(this.f42737a, 0, 4);
                            int a2 = bny.m49516a(this.f42737a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                int a3 = (int) bny.m49517a(this.f42737a, a2, false);
                                if (this.f42740d.mo41037b(a3)) {
                                    bne.mo41008b(a2);
                                    a = (long) a3;
                                }
                            }
                            bne.mo41008b(1);
                        }
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f42742f = (int) a;
                    this.f42741e = 1;
                }
                if (this.f42741e == 1) {
                    this.f42743g = this.f42739c.mo41047a(bne, false, true, 8);
                    this.f42741e = 2;
                }
                int a4 = this.f42740d.mo41031a(this.f42742f);
                switch (a4) {
                    case 0:
                        bne.mo41008b((int) this.f42743g);
                        this.f42741e = 0;
                    case 1:
                        long b = bne.mo41007b();
                        this.f42738b.add(new bnq(this.f42742f, this.f42743g + b));
                        this.f42740d.mo41035a(this.f42742f, b, this.f42743g);
                        this.f42741e = 0;
                        return true;
                    case 2:
                        if (this.f42743g <= 8) {
                            this.f42740d.mo41034a(this.f42742f, m49463a(bne, (int) this.f42743g));
                            this.f42741e = 0;
                            return true;
                        }
                        long j = this.f42743g;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j);
                        throw new zzll(sb.toString());
                    case 3:
                        if (this.f42743g <= 2147483647L) {
                            bns bns = this.f42740d;
                            int i = this.f42742f;
                            int i2 = (int) this.f42743g;
                            if (i2 == 0) {
                                str = "";
                            } else {
                                byte[] bArr = new byte[i2];
                                bne.mo41009b(bArr, 0, i2);
                                str = new String(bArr);
                            }
                            bns.mo41036a(i, str);
                            this.f42741e = 0;
                            return true;
                        }
                        long j2 = this.f42743g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw new zzll(sb2.toString());
                    case 4:
                        this.f42740d.mo41033a(this.f42742f, (int) this.f42743g, bne);
                        this.f42741e = 0;
                        return true;
                    case 5:
                        if (this.f42743g == 4 || this.f42743g == 8) {
                            bns bns2 = this.f42740d;
                            int i3 = this.f42742f;
                            int i4 = (int) this.f42743g;
                            long a5 = m49463a(bne, i4);
                            if (i4 == 4) {
                                d = (double) Float.intBitsToFloat((int) a5);
                            } else {
                                d = Double.longBitsToDouble(a5);
                            }
                            bns2.mo41032a(i3, d);
                            this.f42741e = 0;
                            return true;
                        }
                        long j3 = this.f42743g;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw new zzll(sb3.toString());
                    default:
                        StringBuilder sb4 = new StringBuilder(32);
                        sb4.append("Invalid element type ");
                        sb4.append(a4);
                        throw new zzll(sb4.toString());
                }
            } else {
                this.f42740d.mo41038c(((bnq) this.f42738b.pop()).f42744a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private final long m49463a(bne bne, int i) throws IOException, InterruptedException {
        bne.mo41009b(this.f42737a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f42737a[i2] & 255));
        }
        return j;
    }
}
