package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.gl */
final class C16557gl implements C16631iz {

    /* renamed from: a */
    private final C16554gi f46358a;

    /* renamed from: b */
    private int f46359b;

    /* renamed from: c */
    private int f46360c;

    /* renamed from: d */
    private int f46361d;

    /* renamed from: a */
    public static C16557gl m53978a(C16554gi giVar) {
        if (giVar.f46348c != null) {
            return giVar.f46348c;
        }
        return new C16557gl(giVar);
    }

    private C16557gl(C16554gi giVar) {
        this.f46358a = (C16554gi) C16586hh.m54188a(giVar, "input");
    }

    /* renamed from: a */
    public final int mo42801a() throws IOException {
        if (this.f46361d != 0) {
            this.f46359b = this.f46361d;
            this.f46361d = 0;
        } else {
            this.f46359b = this.f46358a.mo42773a();
        }
        if (this.f46359b == 0 || this.f46359b == this.f46360c) {
            return Integer.MAX_VALUE;
        }
        return this.f46359b >>> 3;
    }

    /* renamed from: b */
    public final int mo42806b() {
        return this.f46359b;
    }

    /* renamed from: c */
    public final boolean mo42811c() throws IOException {
        if (this.f46358a.mo42799t() || this.f46359b == this.f46360c) {
            return false;
        }
        return this.f46358a.mo42777b(this.f46359b);
    }

    /* renamed from: a */
    private final void m53980a(int i) throws IOException {
        if ((this.f46359b & 7) != i) {
            throw zzuv.zzwu();
        }
    }

    /* renamed from: d */
    public final double mo42812d() throws IOException {
        m53980a(1);
        return this.f46358a.mo42776b();
    }

    /* renamed from: e */
    public final float mo42814e() throws IOException {
        m53980a(5);
        return this.f46358a.mo42778c();
    }

    /* renamed from: f */
    public final long mo42816f() throws IOException {
        m53980a(0);
        return this.f46358a.mo42781d();
    }

    /* renamed from: g */
    public final long mo42818g() throws IOException {
        m53980a(0);
        return this.f46358a.mo42782e();
    }

    /* renamed from: h */
    public final int mo42820h() throws IOException {
        m53980a(0);
        return this.f46358a.mo42784f();
    }

    /* renamed from: i */
    public final long mo42822i() throws IOException {
        m53980a(1);
        return this.f46358a.mo42786g();
    }

    /* renamed from: j */
    public final int mo42824j() throws IOException {
        m53980a(5);
        return this.f46358a.mo42787h();
    }

    /* renamed from: k */
    public final boolean mo42827k() throws IOException {
        m53980a(0);
        return this.f46358a.mo42788i();
    }

    /* renamed from: l */
    public final String mo42828l() throws IOException {
        m53980a(2);
        return this.f46358a.mo42789j();
    }

    /* renamed from: m */
    public final String mo42830m() throws IOException {
        m53980a(2);
        return this.f46358a.mo42790k();
    }

    /* renamed from: a */
    public final <T> T mo42802a(C16633ja<T> jaVar, C16565gt gtVar) throws IOException {
        m53980a(2);
        return m53983c(jaVar, gtVar);
    }

    /* renamed from: b */
    public final <T> T mo42807b(C16633ja<T> jaVar, C16565gt gtVar) throws IOException {
        m53980a(3);
        return m53985d(jaVar, gtVar);
    }

    /* renamed from: c */
    private final <T> T m53983c(C16633ja<T> jaVar, C16565gt gtVar) throws IOException {
        int m = this.f46358a.mo42792m();
        if (this.f46358a.f46346a < this.f46358a.f46347b) {
            int d = this.f46358a.mo42780d(m);
            T a = jaVar.mo42991a();
            this.f46358a.f46346a++;
            jaVar.mo42992a(a, this, gtVar);
            jaVar.mo42997c(a);
            this.f46358a.mo42775a(0);
            this.f46358a.f46346a--;
            this.f46358a.mo42783e(d);
            return a;
        }
        throw zzuv.zzwv();
    }

    /* renamed from: d */
    private final <T> T m53985d(C16633ja<T> jaVar, C16565gt gtVar) throws IOException {
        int i = this.f46360c;
        this.f46360c = ((this.f46359b >>> 3) << 3) | 4;
        try {
            T a = jaVar.mo42991a();
            jaVar.mo42992a(a, this, gtVar);
            jaVar.mo42997c(a);
            if (this.f46359b == this.f46360c) {
                return a;
            }
            throw zzuv.zzww();
        } finally {
            this.f46360c = i;
        }
    }

    /* renamed from: n */
    public final zzte mo42832n() throws IOException {
        m53980a(2);
        return this.f46358a.mo42791l();
    }

    /* renamed from: o */
    public final int mo42834o() throws IOException {
        m53980a(0);
        return this.f46358a.mo42792m();
    }

    /* renamed from: p */
    public final int mo42836p() throws IOException {
        m53980a(0);
        return this.f46358a.mo42793n();
    }

    /* renamed from: q */
    public final int mo42838q() throws IOException {
        m53980a(5);
        return this.f46358a.mo42794o();
    }

    /* renamed from: r */
    public final long mo42840r() throws IOException {
        m53980a(1);
        return this.f46358a.mo42795p();
    }

    /* renamed from: s */
    public final int mo42841s() throws IOException {
        m53980a(0);
        return this.f46358a.mo42796q();
    }

    /* renamed from: t */
    public final long mo42842t() throws IOException {
        m53980a(0);
        return this.f46358a.mo42797r();
    }

    /* renamed from: a */
    public final void mo42803a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16561gp) {
            C16561gp gpVar = (C16561gp) list;
            switch (this.f46359b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f46358a.mo42792m();
                    m53982b(m);
                    int u = this.f46358a.mo42800u() + m;
                    do {
                        gpVar.mo42884a(this.f46358a.mo42776b());
                    } while (this.f46358a.mo42800u() < u);
                    return;
                default:
                    throw zzuv.zzwu();
            }
            do {
                gpVar.mo42884a(this.f46358a.mo42776b());
                if (!this.f46358a.mo42799t()) {
                    a2 = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a2 == this.f46359b);
            this.f46361d = a2;
            return;
        }
        switch (this.f46359b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f46358a.mo42792m();
                m53982b(m2);
                int u2 = this.f46358a.mo42800u() + m2;
                do {
                    list.add(Double.valueOf(this.f46358a.mo42776b()));
                } while (this.f46358a.mo42800u() < u2);
                return;
            default:
                throw zzuv.zzwu();
        }
        do {
            list.add(Double.valueOf(this.f46358a.mo42776b()));
            if (!this.f46358a.mo42799t()) {
                a = this.f46358a.mo42773a();
            } else {
                return;
            }
        } while (a == this.f46359b);
        this.f46361d = a;
    }

    /* renamed from: b */
    public final void mo42808b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16576hc) {
            C16576hc hcVar = (C16576hc) list;
            int i = this.f46359b & 7;
            if (i == 2) {
                int m = this.f46358a.mo42792m();
                m53984c(m);
                int u = this.f46358a.mo42800u() + m;
                do {
                    hcVar.mo42921a(this.f46358a.mo42778c());
                } while (this.f46358a.mo42800u() < u);
            } else if (i == 5) {
                do {
                    hcVar.mo42921a(this.f46358a.mo42778c());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 2) {
                int m2 = this.f46358a.mo42792m();
                m53984c(m2);
                int u2 = this.f46358a.mo42800u() + m2;
                do {
                    list.add(Float.valueOf(this.f46358a.mo42778c()));
                } while (this.f46358a.mo42800u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f46358a.mo42778c()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: c */
    public final void mo42810c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    hyVar.mo42972a(this.f46358a.mo42781d());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    hyVar.mo42972a(this.f46358a.mo42781d());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f46358a.mo42781d()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Long.valueOf(this.f46358a.mo42781d()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: d */
    public final void mo42813d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    hyVar.mo42972a(this.f46358a.mo42782e());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    hyVar.mo42972a(this.f46358a.mo42782e());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f46358a.mo42782e()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Long.valueOf(this.f46358a.mo42782e()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: e */
    public final void mo42815e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    hgVar.mo42945c(this.f46358a.mo42784f());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    hgVar.mo42945c(this.f46358a.mo42784f());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42784f()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42784f()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: f */
    public final void mo42817f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            switch (this.f46359b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f46358a.mo42792m();
                    m53982b(m);
                    int u = this.f46358a.mo42800u() + m;
                    do {
                        hyVar.mo42972a(this.f46358a.mo42786g());
                    } while (this.f46358a.mo42800u() < u);
                    return;
                default:
                    throw zzuv.zzwu();
            }
            do {
                hyVar.mo42972a(this.f46358a.mo42786g());
                if (!this.f46358a.mo42799t()) {
                    a2 = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a2 == this.f46359b);
            this.f46361d = a2;
            return;
        }
        switch (this.f46359b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f46358a.mo42792m();
                m53982b(m2);
                int u2 = this.f46358a.mo42800u() + m2;
                do {
                    list.add(Long.valueOf(this.f46358a.mo42786g()));
                } while (this.f46358a.mo42800u() < u2);
                return;
            default:
                throw zzuv.zzwu();
        }
        do {
            list.add(Long.valueOf(this.f46358a.mo42786g()));
            if (!this.f46358a.mo42799t()) {
                a = this.f46358a.mo42773a();
            } else {
                return;
            }
        } while (a == this.f46359b);
        this.f46361d = a;
    }

    /* renamed from: g */
    public final void mo42819g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            int i = this.f46359b & 7;
            if (i == 2) {
                int m = this.f46358a.mo42792m();
                m53984c(m);
                int u = this.f46358a.mo42800u() + m;
                do {
                    hgVar.mo42945c(this.f46358a.mo42787h());
                } while (this.f46358a.mo42800u() < u);
            } else if (i == 5) {
                do {
                    hgVar.mo42945c(this.f46358a.mo42787h());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 2) {
                int m2 = this.f46358a.mo42792m();
                m53984c(m2);
                int u2 = this.f46358a.mo42800u() + m2;
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42787h()));
                } while (this.f46358a.mo42800u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42787h()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: h */
    public final void mo42821h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16540fv) {
            C16540fv fvVar = (C16540fv) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    fvVar.mo42748a(this.f46358a.mo42788i());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    fvVar.mo42748a(this.f46358a.mo42788i());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f46358a.mo42788i()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Boolean.valueOf(this.f46358a.mo42788i()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: i */
    public final void mo42823i(List<String> list) throws IOException {
        m53981a(list, false);
    }

    /* renamed from: j */
    public final void mo42825j(List<String> list) throws IOException {
        m53981a(list, true);
    }

    /* renamed from: a */
    private final void m53981a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.f46359b & 7) != 2) {
            throw zzuv.zzwu();
        } else if (!(list instanceof C16598ht) || z) {
            do {
                list.add(z ? mo42830m() : mo42828l());
                if (!this.f46358a.mo42799t()) {
                    a = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a == this.f46359b);
            this.f46361d = a;
        } else {
            C16598ht htVar = (C16598ht) list;
            do {
                htVar.mo42963a(mo42832n());
                if (!this.f46358a.mo42799t()) {
                    a2 = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a2 == this.f46359b);
            this.f46361d = a2;
        }
    }

    /* renamed from: a */
    public final <T> void mo42804a(List<T> list, C16633ja<T> jaVar, C16565gt gtVar) throws IOException {
        int a;
        if ((this.f46359b & 7) == 2) {
            int i = this.f46359b;
            do {
                list.add(m53983c(jaVar, gtVar));
                if (!this.f46358a.mo42799t() && this.f46361d == 0) {
                    a = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a == i);
            this.f46361d = a;
            return;
        }
        throw zzuv.zzwu();
    }

    /* renamed from: b */
    public final <T> void mo42809b(List<T> list, C16633ja<T> jaVar, C16565gt gtVar) throws IOException {
        int a;
        if ((this.f46359b & 7) == 3) {
            int i = this.f46359b;
            do {
                list.add(m53985d(jaVar, gtVar));
                if (!this.f46358a.mo42799t() && this.f46361d == 0) {
                    a = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a == i);
            this.f46361d = a;
            return;
        }
        throw zzuv.zzwu();
    }

    /* renamed from: k */
    public final void mo42826k(List<zzte> list) throws IOException {
        int a;
        if ((this.f46359b & 7) == 2) {
            do {
                list.add(mo42832n());
                if (!this.f46358a.mo42799t()) {
                    a = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a == this.f46359b);
            this.f46361d = a;
            return;
        }
        throw zzuv.zzwu();
    }

    /* renamed from: l */
    public final void mo42829l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    hgVar.mo42945c(this.f46358a.mo42792m());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    hgVar.mo42945c(this.f46358a.mo42792m());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42792m()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42792m()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: m */
    public final void mo42831m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    hgVar.mo42945c(this.f46358a.mo42793n());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    hgVar.mo42945c(this.f46358a.mo42793n());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42793n()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42793n()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: n */
    public final void mo42833n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            int i = this.f46359b & 7;
            if (i == 2) {
                int m = this.f46358a.mo42792m();
                m53984c(m);
                int u = this.f46358a.mo42800u() + m;
                do {
                    hgVar.mo42945c(this.f46358a.mo42794o());
                } while (this.f46358a.mo42800u() < u);
            } else if (i == 5) {
                do {
                    hgVar.mo42945c(this.f46358a.mo42794o());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 2) {
                int m2 = this.f46358a.mo42792m();
                m53984c(m2);
                int u2 = this.f46358a.mo42800u() + m2;
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42794o()));
                } while (this.f46358a.mo42800u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42794o()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: o */
    public final void mo42835o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            switch (this.f46359b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f46358a.mo42792m();
                    m53982b(m);
                    int u = this.f46358a.mo42800u() + m;
                    do {
                        hyVar.mo42972a(this.f46358a.mo42795p());
                    } while (this.f46358a.mo42800u() < u);
                    return;
                default:
                    throw zzuv.zzwu();
            }
            do {
                hyVar.mo42972a(this.f46358a.mo42795p());
                if (!this.f46358a.mo42799t()) {
                    a2 = this.f46358a.mo42773a();
                } else {
                    return;
                }
            } while (a2 == this.f46359b);
            this.f46361d = a2;
            return;
        }
        switch (this.f46359b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f46358a.mo42792m();
                m53982b(m2);
                int u2 = this.f46358a.mo42800u() + m2;
                do {
                    list.add(Long.valueOf(this.f46358a.mo42795p()));
                } while (this.f46358a.mo42800u() < u2);
                return;
            default:
                throw zzuv.zzwu();
        }
        do {
            list.add(Long.valueOf(this.f46358a.mo42795p()));
            if (!this.f46358a.mo42799t()) {
                a = this.f46358a.mo42773a();
            } else {
                return;
            }
        } while (a == this.f46359b);
        this.f46361d = a;
    }

    /* renamed from: p */
    public final void mo42837p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    hgVar.mo42945c(this.f46358a.mo42796q());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    hgVar.mo42945c(this.f46358a.mo42796q());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42796q()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Integer.valueOf(this.f46358a.mo42796q()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: q */
    public final void mo42839q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            int i = this.f46359b & 7;
            if (i == 0) {
                do {
                    hyVar.mo42972a(this.f46358a.mo42797r());
                    if (!this.f46358a.mo42799t()) {
                        a2 = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46359b);
                this.f46361d = a2;
            } else if (i == 2) {
                int u = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    hyVar.mo42972a(this.f46358a.mo42797r());
                } while (this.f46358a.mo42800u() < u);
                m53986d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f46359b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f46358a.mo42797r()));
                    if (!this.f46358a.mo42799t()) {
                        a = this.f46358a.mo42773a();
                    } else {
                        return;
                    }
                } while (a == this.f46359b);
                this.f46361d = a;
            } else if (i2 == 2) {
                int u2 = this.f46358a.mo42800u() + this.f46358a.mo42792m();
                do {
                    list.add(Long.valueOf(this.f46358a.mo42797r()));
                } while (this.f46358a.mo42800u() < u2);
                m53986d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: b */
    private static void m53982b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzuv.zzww();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo42811c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.measurement.zzuv("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo42805a(java.util.Map<K, V> r6, com.google.android.gms.internal.measurement.C16609id<K, V> r7, com.google.android.gms.internal.measurement.C16565gt r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.m53980a(r0)
            com.google.android.gms.internal.measurement.gi r0 = r5.f46358a
            int r0 = r0.mo42792m()
            com.google.android.gms.internal.measurement.gi r1 = r5.f46358a
            int r0 = r1.mo42780d(r0)
            K r1 = r7.f46451b
            V r2 = r7.f46453d
        L_0x0014:
            int r3 = r5.mo42801a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.measurement.gi r4 = r5.f46358a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo42799t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo42811c()     // Catch:{ zzuw -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.measurement.zzxs r3 = r7.f46452c     // Catch:{ zzuw -> 0x004f }
            V r4 = r7.f46453d     // Catch:{ zzuw -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ zzuw -> 0x004f }
            java.lang.Object r3 = r5.m53979a(r3, r4, r8)     // Catch:{ zzuw -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.measurement.zzxs r3 = r7.f46450a     // Catch:{ zzuw -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m53979a(r3, r4, r4)     // Catch:{ zzuw -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.measurement.zzuv r3 = new com.google.android.gms.internal.measurement.zzuv     // Catch:{ zzuw -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ zzuw -> 0x004f }
            throw r3     // Catch:{ zzuw -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo42811c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.measurement.zzuv r6 = new com.google.android.gms.internal.measurement.zzuv     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.measurement.gi r6 = r5.f46358a
            r6.mo42783e(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.measurement.gi r7 = r5.f46358a
            r7.mo42783e(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16557gl.mo42805a(java.util.Map, com.google.android.gms.internal.measurement.id, com.google.android.gms.internal.measurement.gt):void");
    }

    /* renamed from: a */
    private final Object m53979a(zzxs zzxs, Class<?> cls, C16565gt gtVar) throws IOException {
        switch (zzxs) {
            case BOOL:
                return Boolean.valueOf(mo42827k());
            case BYTES:
                return mo42832n();
            case DOUBLE:
                return Double.valueOf(mo42812d());
            case ENUM:
                return Integer.valueOf(mo42836p());
            case FIXED32:
                return Integer.valueOf(mo42824j());
            case FIXED64:
                return Long.valueOf(mo42822i());
            case FLOAT:
                return Float.valueOf(mo42814e());
            case INT32:
                return Integer.valueOf(mo42820h());
            case INT64:
                return Long.valueOf(mo42818g());
            case MESSAGE:
                m53980a(2);
                return m53983c(C16628iw.m54340a().mo43001a(cls), gtVar);
            case SFIXED32:
                return Integer.valueOf(mo42838q());
            case SFIXED64:
                return Long.valueOf(mo42840r());
            case SINT32:
                return Integer.valueOf(mo42841s());
            case SINT64:
                return Long.valueOf(mo42842t());
            case STRING:
                return mo42830m();
            case UINT32:
                return Integer.valueOf(mo42834o());
            case UINT64:
                return Long.valueOf(mo42816f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m53984c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzuv.zzww();
        }
    }

    /* renamed from: d */
    private final void m53986d(int i) throws IOException {
        if (this.f46358a.mo42800u() != i) {
            throw zzuv.zzwq();
        }
    }
}
