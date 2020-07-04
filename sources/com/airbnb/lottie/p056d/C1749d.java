package com.airbnb.lottie.p056d;

/* renamed from: com.airbnb.lottie.d.d */
public final class C1749d {

    /* renamed from: a */
    private float f6302a;

    /* renamed from: b */
    private int f6303b;

    /* renamed from: a */
    public final void mo7199a(float f) {
        this.f6302a += f;
        this.f6303b++;
        if (this.f6303b == Integer.MAX_VALUE) {
            this.f6302a /= 2.0f;
            this.f6303b /= 2;
        }
    }
}
