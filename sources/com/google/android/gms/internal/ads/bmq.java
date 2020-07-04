package com.google.android.gms.internal.ads;

public class bmq {

    /* renamed from: a */
    public int f42687a;

    /* renamed from: a */
    public void mo40982a() {
        this.f42687a = 0;
    }

    /* renamed from: b */
    public final boolean mo40984b() {
        return mo40985b(Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public final boolean mo40986c() {
        return mo40985b(4);
    }

    /* renamed from: d */
    public final boolean mo40987d() {
        return mo40985b(1);
    }

    /* renamed from: a */
    public final void mo40983a(int i) {
        this.f42687a |= Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo40985b(int i) {
        return (this.f42687a & i) == i;
    }
}
