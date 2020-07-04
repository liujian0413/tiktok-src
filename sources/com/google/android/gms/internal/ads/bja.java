package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Stack;

final class bja implements bje {

    /* renamed from: a */
    private final byte[] f42255a = new byte[8];

    /* renamed from: b */
    private final Stack<bjd> f42256b = new Stack<>();

    /* renamed from: c */
    private final bjg f42257c = new bjg();

    /* renamed from: d */
    private bjf f42258d;

    /* renamed from: e */
    private int f42259e;

    /* renamed from: f */
    private int f42260f;

    /* renamed from: g */
    private long f42261g;

    bja() {
    }

    /* renamed from: a */
    public final void mo40775a(bjf bjf) {
        this.f42258d = bjf;
    }

    /* renamed from: a */
    public final void mo40774a() {
        this.f42259e = 0;
        this.f42256b.clear();
        this.f42257c.mo40786a();
    }

    /* renamed from: a */
    public final boolean mo40776a(bie bie) throws IOException, InterruptedException {
        double d;
        bke.m49060b(this.f42258d != null);
        while (true) {
            if (this.f42256b.isEmpty() || bie.mo40730a() < ((bjd) this.f42256b.peek()).f42264b) {
                if (this.f42259e == 0) {
                    long a = this.f42257c.mo40785a(bie, true, false);
                    if (a == -1) {
                        return false;
                    }
                    this.f42260f = (int) a;
                    this.f42259e = 1;
                }
                if (this.f42259e == 1) {
                    this.f42261g = this.f42257c.mo40785a(bie, false, true);
                    this.f42259e = 2;
                }
                int a2 = this.f42258d.mo40778a(this.f42260f);
                switch (a2) {
                    case 0:
                        bie.mo40731a((int) this.f42261g);
                        this.f42259e = 0;
                    case 1:
                        long a3 = bie.mo40730a();
                        this.f42256b.add(new bjd(this.f42260f, this.f42261g + a3));
                        this.f42258d.mo40782a(this.f42260f, a3, this.f42261g);
                        this.f42259e = 0;
                        return true;
                    case 2:
                        if (this.f42261g <= 8) {
                            this.f42258d.mo40781a(this.f42260f, m48971a(bie, (int) this.f42261g));
                            this.f42259e = 0;
                            return true;
                        }
                        long j = this.f42261g;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j);
                        throw new IllegalStateException(sb.toString());
                    case 3:
                        if (this.f42261g <= 2147483647L) {
                            bjf bjf = this.f42258d;
                            int i = this.f42260f;
                            int i2 = (int) this.f42261g;
                            byte[] bArr = new byte[i2];
                            bie.mo40732a(bArr, 0, i2);
                            bjf.mo40783a(i, new String(bArr, Charset.forName("UTF-8")));
                            this.f42259e = 0;
                            return true;
                        }
                        long j2 = this.f42261g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw new IllegalStateException(sb2.toString());
                    case 4:
                        this.f42258d.mo40780a(this.f42260f, (int) this.f42261g, bie);
                        this.f42259e = 0;
                        return true;
                    case 5:
                        if (this.f42261g == 4 || this.f42261g == 8) {
                            bjf bjf2 = this.f42258d;
                            int i3 = this.f42260f;
                            int i4 = (int) this.f42261g;
                            long a4 = m48971a(bie, i4);
                            if (i4 == 4) {
                                d = (double) Float.intBitsToFloat((int) a4);
                            } else {
                                d = Double.longBitsToDouble(a4);
                            }
                            bjf2.mo40779a(i3, d);
                            this.f42259e = 0;
                            return true;
                        }
                        long j3 = this.f42261g;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw new IllegalStateException(sb3.toString());
                    default:
                        StringBuilder sb4 = new StringBuilder(32);
                        sb4.append("Invalid element type ");
                        sb4.append(a2);
                        throw new IllegalStateException(sb4.toString());
                }
            } else {
                this.f42258d.mo40784b(((bjd) this.f42256b.pop()).f42263a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private final long m48971a(bie bie, int i) throws IOException, InterruptedException {
        bie.mo40732a(this.f42255a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f42255a[i2] & 255));
        }
        return j;
    }
}
