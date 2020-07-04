package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13316a;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.C13325j;

/* renamed from: com.facebook.imagepipeline.memory.ac */
public final class C13802ac {

    /* renamed from: a */
    private final C13799ab f36631a;

    /* renamed from: b */
    private C13806c f36632b;

    /* renamed from: c */
    private C13814i f36633c;

    /* renamed from: d */
    private C13820o f36634d;

    /* renamed from: e */
    private C13831x f36635e;

    /* renamed from: f */
    private C13322g f36636f;

    /* renamed from: g */
    private C13325j f36637g;

    /* renamed from: h */
    private C13316a f36638h;

    /* renamed from: c */
    public final int mo33430c() {
        return this.f36631a.f36611c.f36645g;
    }

    /* renamed from: d */
    public final C13322g mo33431d() {
        return mo33427a(0);
    }

    /* renamed from: g */
    private C13814i m40736g() {
        if (this.f36633c == null) {
            this.f36633c = new C13814i(this.f36631a.f36612d, this.f36631a.f36613e, this.f36631a.f36614f);
        }
        return this.f36633c;
    }

    /* renamed from: h */
    private C13831x m40737h() {
        if (this.f36635e == null) {
            this.f36635e = new C13831x(this.f36631a.f36612d, this.f36631a.f36613e, this.f36631a.f36614f);
        }
        return this.f36635e;
    }

    /* renamed from: e */
    public final C13325j mo33432e() {
        if (this.f36637g == null) {
            this.f36637g = new C13325j(mo33433f());
        }
        return this.f36637g;
    }

    /* renamed from: f */
    public final C13316a mo33433f() {
        if (this.f36638h == null) {
            this.f36638h = new C13823p(this.f36631a.f36612d, this.f36631a.f36615g, this.f36631a.f36616h);
        }
        return this.f36638h;
    }

    /* renamed from: b */
    public final C13820o mo33429b() {
        if (this.f36634d == null) {
            this.f36634d = new C13820o(this.f36631a.f36612d, this.f36631a.f36611c);
        }
        return this.f36634d;
    }

    /* renamed from: a */
    public final C13806c mo33428a() {
        if (this.f36632b == null) {
            String str = this.f36631a.f36617i;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1868884870) {
                if (hashCode != -1106578487) {
                    if (hashCode != -404562712) {
                        if (hashCode == 95945896 && str.equals("dummy")) {
                            c = 0;
                        }
                    } else if (str.equals("experimental")) {
                        c = 1;
                    }
                } else if (str.equals("legacy")) {
                    c = 3;
                }
            } else if (str.equals("legacy_default_params")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    this.f36632b = new C13819n();
                    break;
                case 1:
                    this.f36632b = new C13824q(this.f36631a.f36618j, this.f36631a.f36619k, C13832y.m40855a());
                    break;
                case 2:
                    this.f36632b = new C13812g(this.f36631a.f36612d, C13815j.m40784a(), this.f36631a.f36610b);
                    break;
                default:
                    this.f36632b = new C13812g(this.f36631a.f36612d, this.f36631a.f36609a, this.f36631a.f36610b);
                    break;
            }
        }
        return this.f36632b;
    }

    public C13802ac(C13799ab abVar) {
        this.f36631a = (C13799ab) C13307g.m38940a(abVar);
    }

    /* renamed from: b */
    private C13827t m40735b(int i) {
        switch (i) {
            case 0:
                return m40737h();
            case 1:
                return m40736g();
            default:
                throw new IllegalArgumentException("Invalid MemoryChunkType");
        }
    }

    /* renamed from: a */
    public final C13322g mo33427a(int i) {
        if (this.f36636f == null) {
            this.f36636f = new C13830w(m40735b(i), mo33432e());
        }
        return this.f36636f;
    }
}
