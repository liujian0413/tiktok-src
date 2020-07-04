package com.bytedance.lighten.loader;

import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p709d.C13487a;

/* renamed from: com.bytedance.lighten.loader.f */
final class C12152f implements C13487a {

    /* renamed from: a */
    public int f32381a = -1;

    /* renamed from: b */
    private final C13460a f32382b;

    /* renamed from: c */
    private long f32383c = -1;

    /* renamed from: d */
    private int f32384d;

    /* renamed from: e */
    private long f32385e = -1;

    /* renamed from: f */
    private long f32386f = -1;

    /* renamed from: g */
    private int[] f32387g;

    /* renamed from: b */
    public final int mo29885b() {
        return this.f32382b.mo32995d();
    }

    /* renamed from: c */
    private boolean m35386c() {
        if (this.f32382b.mo32996e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long mo29883a() {
        if (this.f32383c != -1) {
            return this.f32383c;
        }
        this.f32383c = 0;
        for (int a : this.f32387g) {
            this.f32383c += (long) m35384a(a);
        }
        return this.f32383c;
    }

    /* renamed from: a */
    private int m35384a(int i) {
        if (i >= this.f32382b.mo32995d()) {
            return this.f32382b.mo32994c(0);
        }
        return this.f32382b.mo32994c(i);
    }

    /* renamed from: b */
    private int m35385b(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += (long) m35384a(this.f32387g[i]);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    /* renamed from: a */
    public final long mo29884a(long j) {
        if (mo29883a() == 0) {
            return -1;
        }
        if (!m35386c() && this.f32384d >= this.f32382b.mo32996e()) {
            return -1;
        }
        long a = (long) m35384a(this.f32387g[this.f32381a]);
        long j2 = this.f32385e + a;
        if (j2 >= j) {
            return j2;
        }
        return j + a;
    }

    public C12152f(C13460a aVar, int[] iArr) {
        this.f32382b = aVar;
        this.f32387g = iArr;
    }

    /* renamed from: a */
    public final int mo29882a(long j, long j2) {
        if (!m35386c() && j / mo29883a() >= ((long) this.f32382b.mo32996e())) {
            return -1;
        }
        int b = m35385b(j % mo29883a());
        if (this.f32381a == -1 || j2 != this.f32386f) {
            this.f32385e = j;
            this.f32386f = j;
            this.f32381a = b;
            return this.f32387g[b];
        }
        this.f32386f = j;
        if (this.f32385e + ((long) m35384a(this.f32387g[this.f32381a])) > j) {
            return this.f32387g[this.f32381a];
        }
        this.f32385e = j;
        int i = this.f32381a + 1;
        if (i >= this.f32387g.length) {
            this.f32384d++;
            i = 0;
        }
        if (!this.f32382b.mo32992b(this.f32387g[i])) {
            return this.f32387g[this.f32381a];
        }
        this.f32381a = i;
        return this.f32387g[this.f32381a];
    }
}
