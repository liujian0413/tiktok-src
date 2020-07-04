package com.facebook.fresco.animation.p709d;

import com.facebook.fresco.animation.p702a.C13460a;

/* renamed from: com.facebook.fresco.animation.d.c */
public final class C13489c implements C13487a {

    /* renamed from: a */
    private final C13460a f35767a;

    /* renamed from: b */
    private long f35768b = -1;

    /* renamed from: c */
    private int f35769c;

    /* renamed from: d */
    private int f35770d = -1;

    /* renamed from: e */
    private long f35771e = -1;

    /* renamed from: f */
    private long f35772f = -1;

    /* renamed from: b */
    private boolean m39677b() {
        if (this.f35767a.mo32996e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long mo29883a() {
        if (this.f35768b != -1) {
            return this.f35768b;
        }
        this.f35768b = 0;
        int d = this.f35767a.mo32995d();
        for (int i = 0; i < d; i++) {
            this.f35768b += (long) this.f35767a.mo32994c(i);
        }
        return this.f35768b;
    }

    public C13489c(C13460a aVar) {
        this.f35767a = aVar;
    }

    /* renamed from: b */
    private int m39676b(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += (long) this.f35767a.mo32994c(i);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    /* renamed from: a */
    public final long mo29884a(long j) {
        if (mo29883a() == 0) {
            return -1;
        }
        if (!m39677b() && this.f35769c >= this.f35767a.mo32996e()) {
            return -1;
        }
        long c = (long) this.f35767a.mo32994c(this.f35770d);
        long j2 = this.f35771e + c;
        if (j2 >= j) {
            return j2;
        }
        return j + c;
    }

    /* renamed from: a */
    public final int mo29882a(long j, long j2) {
        if (!m39677b() && j / mo29883a() >= ((long) this.f35767a.mo32996e())) {
            return -1;
        }
        int b = m39676b(j % mo29883a());
        if (this.f35770d == -1 || j2 != this.f35772f) {
            this.f35771e = j;
            this.f35772f = j;
            this.f35770d = b;
            return b;
        }
        this.f35772f = j;
        if (this.f35771e + ((long) this.f35767a.mo32994c(this.f35770d)) > j) {
            return this.f35770d;
        }
        this.f35771e = j;
        int i = this.f35770d + 1;
        if (i >= this.f35767a.mo32995d()) {
            this.f35769c++;
            i = 0;
        }
        if (!this.f35767a.mo32992b(i)) {
            return this.f35770d;
        }
        this.f35770d = i;
        return this.f35770d;
    }
}
