package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class brh implements brc {

    /* renamed from: a */
    private final boolean f43321a;

    /* renamed from: b */
    private final int f43322b;

    /* renamed from: c */
    private final byte[] f43323c;

    /* renamed from: d */
    private final brb[] f43324d;

    /* renamed from: e */
    private int f43325e;

    /* renamed from: f */
    private int f43326f;

    /* renamed from: g */
    private int f43327g;

    /* renamed from: h */
    private brb[] f43328h;

    public brh(boolean z, int i) {
        this(true, 65536, 0);
    }

    private brh(boolean z, int i, int i2) {
        brr.m49871a(true);
        brr.m49871a(true);
        this.f43321a = true;
        this.f43322b = 65536;
        this.f43327g = 0;
        this.f43328h = new brb[100];
        this.f43323c = null;
        this.f43324d = new brb[1];
    }

    /* renamed from: d */
    public final synchronized void mo41197d() {
        if (this.f43321a) {
            mo41196a(0);
        }
    }

    /* renamed from: a */
    public final synchronized void mo41196a(int i) {
        boolean z = i < this.f43325e;
        this.f43325e = i;
        if (z) {
            mo41192b();
        }
    }

    /* renamed from: a */
    public final synchronized brb mo41189a() {
        brb brb;
        this.f43326f++;
        if (this.f43327g > 0) {
            brb[] brbArr = this.f43328h;
            int i = this.f43327g - 1;
            this.f43327g = i;
            brb = brbArr[i];
            this.f43328h[this.f43327g] = null;
        } else {
            brb = new brb(new byte[this.f43322b], 0);
        }
        return brb;
    }

    /* renamed from: a */
    public final synchronized void mo41190a(brb brb) {
        this.f43324d[0] = brb;
        mo41191a(this.f43324d);
    }

    /* renamed from: a */
    public final synchronized void mo41191a(brb[] brbArr) {
        boolean z;
        if (this.f43327g + brbArr.length >= this.f43328h.length) {
            this.f43328h = (brb[]) Arrays.copyOf(this.f43328h, Math.max(this.f43328h.length << 1, this.f43327g + brbArr.length));
        }
        for (brb brb : brbArr) {
            if (brb.f43308a != null) {
                if (brb.f43308a.length != this.f43322b) {
                    z = false;
                    brr.m49871a(z);
                    brb[] brbArr2 = this.f43328h;
                    int i = this.f43327g;
                    this.f43327g = i + 1;
                    brbArr2[i] = brb;
                }
            }
            z = true;
            brr.m49871a(z);
            brb[] brbArr22 = this.f43328h;
            int i2 = this.f43327g;
            this.f43327g = i2 + 1;
            brbArr22[i2] = brb;
        }
        this.f43326f -= brbArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo41192b() {
        int max = Math.max(0, bsf.m49933a(this.f43325e, this.f43322b) - this.f43326f);
        if (max < this.f43327g) {
            Arrays.fill(this.f43328h, max, this.f43327g, null);
            this.f43327g = max;
        }
    }

    /* renamed from: e */
    public final synchronized int mo41198e() {
        return this.f43326f * this.f43322b;
    }

    /* renamed from: c */
    public final int mo41193c() {
        return this.f43322b;
    }
}
