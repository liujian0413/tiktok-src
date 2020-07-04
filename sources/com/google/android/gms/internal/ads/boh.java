package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

final class boh implements boe {

    /* renamed from: a */
    private final bsa f42972a;

    /* renamed from: b */
    private final int f42973b = this.f42972a.mo41235m();

    /* renamed from: c */
    private final int f42974c = (this.f42972a.mo41235m() & NormalGiftView.ALPHA_255);

    /* renamed from: d */
    private int f42975d;

    /* renamed from: e */
    private int f42976e;

    public boh(bob bob) {
        this.f42972a = bob.f42947az;
        this.f42972a.mo41223c(12);
    }

    /* renamed from: c */
    public final boolean mo41055c() {
        return false;
    }

    /* renamed from: a */
    public final int mo41053a() {
        return this.f42973b;
    }

    /* renamed from: b */
    public final int mo41054b() {
        if (this.f42974c == 8) {
            return this.f42972a.mo41224d();
        }
        if (this.f42974c == 16) {
            return this.f42972a.mo41226e();
        }
        int i = this.f42975d;
        this.f42975d = i + 1;
        if (i % 2 != 0) {
            return this.f42976e & 15;
        }
        this.f42976e = this.f42972a.mo41224d();
        return (this.f42976e & 240) >> 4;
    }
}
