package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bjr implements bjm {

    /* renamed from: a */
    private final int f42331a = 262144;

    /* renamed from: b */
    private int f42332b;

    /* renamed from: c */
    private int f42333c;

    /* renamed from: d */
    private bjl[] f42334d = new bjl[100];

    public bjr(int i) {
        bke.m49058a(true);
    }

    /* renamed from: a */
    public final synchronized bjl mo40793a() {
        this.f42332b++;
        if (this.f42333c > 0) {
            bjl[] bjlArr = this.f42334d;
            int i = this.f42333c - 1;
            this.f42333c = i;
            return bjlArr[i];
        }
        return new bjl(new byte[this.f42331a], 0);
    }

    /* renamed from: a */
    public final synchronized void mo40794a(bjl bjl) {
        bke.m49058a(bjl.f42315a.length == this.f42331a);
        this.f42332b--;
        if (this.f42333c == this.f42334d.length) {
            this.f42334d = (bjl[]) Arrays.copyOf(this.f42334d, this.f42334d.length << 1);
        }
        bjl[] bjlArr = this.f42334d;
        int i = this.f42333c;
        this.f42333c = i + 1;
        bjlArr[i] = bjl;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void mo40797a(int i) {
        int max = Math.max(0, bkn.m49083a(0, this.f42331a) - this.f42332b);
        if (max < this.f42333c) {
            Arrays.fill(this.f42334d, max, this.f42333c, null);
            this.f42333c = max;
        }
    }

    /* renamed from: c */
    private final synchronized int m49021c() {
        return this.f42332b * this.f42331a;
    }

    /* renamed from: b */
    public final int mo40795b() {
        return this.f42331a;
    }

    /* renamed from: b */
    public final synchronized void mo40798b(int i) throws InterruptedException {
        while (m49021c() > i) {
            wait();
        }
    }
}
