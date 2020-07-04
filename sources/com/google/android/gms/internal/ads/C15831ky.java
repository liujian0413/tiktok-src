package com.google.android.gms.internal.ads;

import android.os.Bundle;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ky */
public final class C15831ky {

    /* renamed from: e */
    private static C15831ky f44573e = new C15831ky();

    /* renamed from: a */
    public int f44574a;

    /* renamed from: b */
    public int f44575b;

    /* renamed from: c */
    public int f44576c;

    /* renamed from: d */
    public int f44577d;

    /* renamed from: f */
    private int f44578f;

    /* renamed from: a */
    public static C15831ky m51208a() {
        return f44573e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41711a(int i) {
        this.f44578f += i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo41712b() {
        this.f44574a++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo41713c() {
        this.f44575b++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo41714d() {
        this.f44576c++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo41715e() {
        this.f44577d++;
    }

    /* renamed from: f */
    public final Bundle mo41716f() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f44578f);
        bundle.putInt("ipds", this.f44574a);
        bundle.putInt("ipde", this.f44575b);
        bundle.putInt("iph", this.f44576c);
        bundle.putInt("ipm", this.f44577d);
        return bundle;
    }
}
