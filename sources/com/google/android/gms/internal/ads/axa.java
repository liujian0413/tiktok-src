package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class axa implements azr {

    /* renamed from: a */
    private final awx f41156a;

    /* renamed from: b */
    private int f41157b;

    /* renamed from: c */
    private int f41158c;

    /* renamed from: d */
    private int f41159d;

    /* renamed from: a */
    public static axa m47526a(awx awx) {
        if (awx.f41145c != null) {
            return awx.f41145c;
        }
        return new axa(awx);
    }

    private axa(awx awx) {
        this.f41156a = (awx) axw.m47745a(awx, "input");
    }

    /* renamed from: a */
    public final int mo40156a() throws IOException {
        if (this.f41159d != 0) {
            this.f41157b = this.f41159d;
            this.f41159d = 0;
        } else {
            this.f41157b = this.f41156a.mo40131a();
        }
        if (this.f41157b == 0 || this.f41157b == this.f41158c) {
            return Integer.MAX_VALUE;
        }
        return this.f41157b >>> 3;
    }

    /* renamed from: b */
    public final int mo40161b() {
        return this.f41157b;
    }

    /* renamed from: c */
    public final boolean mo40166c() throws IOException {
        if (this.f41156a.mo40154t() || this.f41157b == this.f41158c) {
            return false;
        }
        return this.f41156a.mo40134b(this.f41157b);
    }

    /* renamed from: a */
    private final void m47528a(int i) throws IOException {
        if ((this.f41157b & 7) != i) {
            throw zzcdx.zzatz();
        }
    }

    /* renamed from: d */
    public final double mo40167d() throws IOException {
        m47528a(1);
        return this.f41156a.mo40133b();
    }

    /* renamed from: e */
    public final float mo40169e() throws IOException {
        m47528a(5);
        return this.f41156a.mo40135c();
    }

    /* renamed from: f */
    public final long mo40171f() throws IOException {
        m47528a(0);
        return this.f41156a.mo40137d();
    }

    /* renamed from: g */
    public final long mo40173g() throws IOException {
        m47528a(0);
        return this.f41156a.mo40139e();
    }

    /* renamed from: h */
    public final int mo40175h() throws IOException {
        m47528a(0);
        return this.f41156a.mo40140f();
    }

    /* renamed from: i */
    public final long mo40177i() throws IOException {
        m47528a(1);
        return this.f41156a.mo40141g();
    }

    /* renamed from: j */
    public final int mo40179j() throws IOException {
        m47528a(5);
        return this.f41156a.mo40142h();
    }

    /* renamed from: k */
    public final boolean mo40182k() throws IOException {
        m47528a(0);
        return this.f41156a.mo40143i();
    }

    /* renamed from: l */
    public final String mo40183l() throws IOException {
        m47528a(2);
        return this.f41156a.mo40144j();
    }

    /* renamed from: m */
    public final String mo40185m() throws IOException {
        m47528a(2);
        return this.f41156a.mo40145k();
    }

    /* renamed from: a */
    public final <T> T mo40157a(azs<T> azs, axi axi) throws IOException {
        m47528a(2);
        return m47531c(azs, axi);
    }

    /* renamed from: b */
    public final <T> T mo40162b(azs<T> azs, axi axi) throws IOException {
        m47528a(3);
        return m47533d(azs, axi);
    }

    /* renamed from: c */
    private final <T> T m47531c(azs<T> azs, axi axi) throws IOException {
        int m = this.f41156a.mo40147m();
        if (this.f41156a.f41143a < this.f41156a.f41144b) {
            int c = this.f41156a.mo40136c(m);
            T a = azs.mo40345a();
            this.f41156a.f41143a++;
            azs.mo40346a(a, this, axi);
            azs.mo40352c(a);
            this.f41156a.mo40132a(0);
            this.f41156a.f41143a--;
            this.f41156a.mo40138d(c);
            return a;
        }
        throw new zzcdx("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    private final <T> T m47533d(azs<T> azs, axi axi) throws IOException {
        int i = this.f41158c;
        this.f41158c = ((this.f41157b >>> 3) << 3) | 4;
        try {
            T a = azs.mo40345a();
            azs.mo40346a(a, this, axi);
            azs.mo40352c(a);
            if (this.f41157b == this.f41158c) {
                return a;
            }
            throw zzcdx.zzaua();
        } finally {
            this.f41158c = i;
        }
    }

    /* renamed from: n */
    public final zzcce mo40187n() throws IOException {
        m47528a(2);
        return this.f41156a.mo40146l();
    }

    /* renamed from: o */
    public final int mo40189o() throws IOException {
        m47528a(0);
        return this.f41156a.mo40147m();
    }

    /* renamed from: p */
    public final int mo40191p() throws IOException {
        m47528a(0);
        return this.f41156a.mo40148n();
    }

    /* renamed from: q */
    public final int mo40193q() throws IOException {
        m47528a(5);
        return this.f41156a.mo40149o();
    }

    /* renamed from: r */
    public final long mo40195r() throws IOException {
        m47528a(1);
        return this.f41156a.mo40150p();
    }

    /* renamed from: s */
    public final int mo40196s() throws IOException {
        m47528a(0);
        return this.f41156a.mo40151q();
    }

    /* renamed from: t */
    public final long mo40197t() throws IOException {
        m47528a(0);
        return this.f41156a.mo40152r();
    }

    /* renamed from: a */
    public final void mo40158a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axe) {
            axe axe = (axe) list;
            switch (this.f41157b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f41156a.mo40147m();
                    m47530b(m);
                    int u = this.f41156a.mo40155u() + m;
                    do {
                        axe.mo40239a(this.f41156a.mo40133b());
                    } while (this.f41156a.mo40155u() < u);
                    return;
                default:
                    throw zzcdx.zzatz();
            }
            do {
                axe.mo40239a(this.f41156a.mo40133b());
                if (!this.f41156a.mo40154t()) {
                    a2 = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a2 == this.f41157b);
            this.f41159d = a2;
            return;
        }
        switch (this.f41157b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f41156a.mo40147m();
                m47530b(m2);
                int u2 = this.f41156a.mo40155u() + m2;
                do {
                    list.add(Double.valueOf(this.f41156a.mo40133b()));
                } while (this.f41156a.mo40155u() < u2);
                return;
            default:
                throw zzcdx.zzatz();
        }
        do {
            list.add(Double.valueOf(this.f41156a.mo40133b()));
            if (!this.f41156a.mo40154t()) {
                a = this.f41156a.mo40131a();
            } else {
                return;
            }
        } while (a == this.f41157b);
        this.f41159d = a;
    }

    /* renamed from: b */
    public final void mo40163b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axr) {
            axr axr = (axr) list;
            int i = this.f41157b & 7;
            if (i == 2) {
                int m = this.f41156a.mo40147m();
                m47532c(m);
                int u = this.f41156a.mo40155u() + m;
                do {
                    axr.mo40274a(this.f41156a.mo40135c());
                } while (this.f41156a.mo40155u() < u);
            } else if (i == 5) {
                do {
                    axr.mo40274a(this.f41156a.mo40135c());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 2) {
                int m2 = this.f41156a.mo40147m();
                m47532c(m2);
                int u2 = this.f41156a.mo40155u() + m2;
                do {
                    list.add(Float.valueOf(this.f41156a.mo40135c()));
                } while (this.f41156a.mo40155u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f41156a.mo40135c()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: c */
    public final void mo40165c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    ayp.mo40326a(this.f41156a.mo40137d());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    ayp.mo40326a(this.f41156a.mo40137d());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f41156a.mo40137d()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Long.valueOf(this.f41156a.mo40137d()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: d */
    public final void mo40168d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    ayp.mo40326a(this.f41156a.mo40139e());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    ayp.mo40326a(this.f41156a.mo40139e());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f41156a.mo40139e()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Long.valueOf(this.f41156a.mo40139e()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: e */
    public final void mo40170e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axv) {
            axv axv = (axv) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    axv.mo40296d(this.f41156a.mo40140f());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    axv.mo40296d(this.f41156a.mo40140f());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40140f()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40140f()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: f */
    public final void mo40172f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            switch (this.f41157b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f41156a.mo40147m();
                    m47530b(m);
                    int u = this.f41156a.mo40155u() + m;
                    do {
                        ayp.mo40326a(this.f41156a.mo40141g());
                    } while (this.f41156a.mo40155u() < u);
                    return;
                default:
                    throw zzcdx.zzatz();
            }
            do {
                ayp.mo40326a(this.f41156a.mo40141g());
                if (!this.f41156a.mo40154t()) {
                    a2 = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a2 == this.f41157b);
            this.f41159d = a2;
            return;
        }
        switch (this.f41157b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f41156a.mo40147m();
                m47530b(m2);
                int u2 = this.f41156a.mo40155u() + m2;
                do {
                    list.add(Long.valueOf(this.f41156a.mo40141g()));
                } while (this.f41156a.mo40155u() < u2);
                return;
            default:
                throw zzcdx.zzatz();
        }
        do {
            list.add(Long.valueOf(this.f41156a.mo40141g()));
            if (!this.f41156a.mo40154t()) {
                a = this.f41156a.mo40131a();
            } else {
                return;
            }
        } while (a == this.f41157b);
        this.f41159d = a;
    }

    /* renamed from: g */
    public final void mo40174g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axv) {
            axv axv = (axv) list;
            int i = this.f41157b & 7;
            if (i == 2) {
                int m = this.f41156a.mo40147m();
                m47532c(m);
                int u = this.f41156a.mo40155u() + m;
                do {
                    axv.mo40296d(this.f41156a.mo40142h());
                } while (this.f41156a.mo40155u() < u);
            } else if (i == 5) {
                do {
                    axv.mo40296d(this.f41156a.mo40142h());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 2) {
                int m2 = this.f41156a.mo40147m();
                m47532c(m2);
                int u2 = this.f41156a.mo40155u() + m2;
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40142h()));
                } while (this.f41156a.mo40155u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40142h()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: h */
    public final void mo40176h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof awk) {
            awk awk = (awk) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    awk.mo40106a(this.f41156a.mo40143i());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    awk.mo40106a(this.f41156a.mo40143i());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f41156a.mo40143i()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Boolean.valueOf(this.f41156a.mo40143i()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: i */
    public final void mo40178i(List<String> list) throws IOException {
        m47529a(list, false);
    }

    /* renamed from: j */
    public final void mo40180j(List<String> list) throws IOException {
        m47529a(list, true);
    }

    /* renamed from: a */
    private final void m47529a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.f41157b & 7) != 2) {
            throw zzcdx.zzatz();
        } else if (!(list instanceof ayk) || z) {
            do {
                list.add(z ? mo40185m() : mo40183l());
                if (!this.f41156a.mo40154t()) {
                    a = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a == this.f41157b);
            this.f41159d = a;
        } else {
            ayk ayk = (ayk) list;
            do {
                ayk.mo40317a(mo40187n());
                if (!this.f41156a.mo40154t()) {
                    a2 = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a2 == this.f41157b);
            this.f41159d = a2;
        }
    }

    /* renamed from: a */
    public final <T> void mo40159a(List<T> list, azs<T> azs, axi axi) throws IOException {
        int a;
        if ((this.f41157b & 7) == 2) {
            int i = this.f41157b;
            do {
                list.add(m47531c(azs, axi));
                if (!this.f41156a.mo40154t() && this.f41159d == 0) {
                    a = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a == i);
            this.f41159d = a;
            return;
        }
        throw zzcdx.zzatz();
    }

    /* renamed from: b */
    public final <T> void mo40164b(List<T> list, azs<T> azs, axi axi) throws IOException {
        int a;
        if ((this.f41157b & 7) == 3) {
            int i = this.f41157b;
            do {
                list.add(m47533d(azs, axi));
                if (!this.f41156a.mo40154t() && this.f41159d == 0) {
                    a = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a == i);
            this.f41159d = a;
            return;
        }
        throw zzcdx.zzatz();
    }

    /* renamed from: k */
    public final void mo40181k(List<zzcce> list) throws IOException {
        int a;
        if ((this.f41157b & 7) == 2) {
            do {
                list.add(mo40187n());
                if (!this.f41156a.mo40154t()) {
                    a = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a == this.f41157b);
            this.f41159d = a;
            return;
        }
        throw zzcdx.zzatz();
    }

    /* renamed from: l */
    public final void mo40184l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axv) {
            axv axv = (axv) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    axv.mo40296d(this.f41156a.mo40147m());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    axv.mo40296d(this.f41156a.mo40147m());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40147m()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40147m()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: m */
    public final void mo40186m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axv) {
            axv axv = (axv) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    axv.mo40296d(this.f41156a.mo40148n());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    axv.mo40296d(this.f41156a.mo40148n());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40148n()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40148n()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: n */
    public final void mo40188n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axv) {
            axv axv = (axv) list;
            int i = this.f41157b & 7;
            if (i == 2) {
                int m = this.f41156a.mo40147m();
                m47532c(m);
                int u = this.f41156a.mo40155u() + m;
                do {
                    axv.mo40296d(this.f41156a.mo40149o());
                } while (this.f41156a.mo40155u() < u);
            } else if (i == 5) {
                do {
                    axv.mo40296d(this.f41156a.mo40149o());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 2) {
                int m2 = this.f41156a.mo40147m();
                m47532c(m2);
                int u2 = this.f41156a.mo40155u() + m2;
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40149o()));
                } while (this.f41156a.mo40155u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40149o()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: o */
    public final void mo40190o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            switch (this.f41157b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f41156a.mo40147m();
                    m47530b(m);
                    int u = this.f41156a.mo40155u() + m;
                    do {
                        ayp.mo40326a(this.f41156a.mo40150p());
                    } while (this.f41156a.mo40155u() < u);
                    return;
                default:
                    throw zzcdx.zzatz();
            }
            do {
                ayp.mo40326a(this.f41156a.mo40150p());
                if (!this.f41156a.mo40154t()) {
                    a2 = this.f41156a.mo40131a();
                } else {
                    return;
                }
            } while (a2 == this.f41157b);
            this.f41159d = a2;
            return;
        }
        switch (this.f41157b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f41156a.mo40147m();
                m47530b(m2);
                int u2 = this.f41156a.mo40155u() + m2;
                do {
                    list.add(Long.valueOf(this.f41156a.mo40150p()));
                } while (this.f41156a.mo40155u() < u2);
                return;
            default:
                throw zzcdx.zzatz();
        }
        do {
            list.add(Long.valueOf(this.f41156a.mo40150p()));
            if (!this.f41156a.mo40154t()) {
                a = this.f41156a.mo40131a();
            } else {
                return;
            }
        } while (a == this.f41157b);
        this.f41159d = a;
    }

    /* renamed from: p */
    public final void mo40192p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof axv) {
            axv axv = (axv) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    axv.mo40296d(this.f41156a.mo40151q());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    axv.mo40296d(this.f41156a.mo40151q());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40151q()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Integer.valueOf(this.f41156a.mo40151q()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: q */
    public final void mo40194q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            int i = this.f41157b & 7;
            if (i == 0) {
                do {
                    ayp.mo40326a(this.f41156a.mo40152r());
                    if (!this.f41156a.mo40154t()) {
                        a2 = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a2 == this.f41157b);
                this.f41159d = a2;
            } else if (i == 2) {
                int u = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    ayp.mo40326a(this.f41156a.mo40152r());
                } while (this.f41156a.mo40155u() < u);
                m47534d(u);
            } else {
                throw zzcdx.zzatz();
            }
        } else {
            int i2 = this.f41157b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f41156a.mo40152r()));
                    if (!this.f41156a.mo40154t()) {
                        a = this.f41156a.mo40131a();
                    } else {
                        return;
                    }
                } while (a == this.f41157b);
                this.f41159d = a;
            } else if (i2 == 2) {
                int u2 = this.f41156a.mo40155u() + this.f41156a.mo40147m();
                do {
                    list.add(Long.valueOf(this.f41156a.mo40152r()));
                } while (this.f41156a.mo40155u() < u2);
                m47534d(u2);
            } else {
                throw zzcdx.zzatz();
            }
        }
    }

    /* renamed from: b */
    private static void m47530b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzcdx.zzaua();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo40166c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.ads.zzcdx("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo40160a(java.util.Map<K, V> r6, com.google.android.gms.internal.ads.ayu<K, V> r7, com.google.android.gms.internal.ads.axi r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.m47528a(r0)
            com.google.android.gms.internal.ads.awx r0 = r5.f41156a
            int r0 = r0.mo40147m()
            com.google.android.gms.internal.ads.awx r1 = r5.f41156a
            int r0 = r1.mo40136c(r0)
            K r1 = r7.f41241b
            V r2 = r7.f41243d
        L_0x0014:
            int r3 = r5.mo40156a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.ads.awx r4 = r5.f41156a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo40154t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo40166c()     // Catch:{ zzcdy -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.ads.zzcgv r3 = r7.f41242c     // Catch:{ zzcdy -> 0x004f }
            V r4 = r7.f41243d     // Catch:{ zzcdy -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ zzcdy -> 0x004f }
            java.lang.Object r3 = r5.m47527a(r3, r4, r8)     // Catch:{ zzcdy -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.ads.zzcgv r3 = r7.f41240a     // Catch:{ zzcdy -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m47527a(r3, r4, r4)     // Catch:{ zzcdy -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.ads.zzcdx r3 = new com.google.android.gms.internal.ads.zzcdx     // Catch:{ zzcdy -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ zzcdy -> 0x004f }
            throw r3     // Catch:{ zzcdy -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo40166c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.ads.zzcdx r6 = new com.google.android.gms.internal.ads.zzcdx     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.ads.awx r6 = r5.f41156a
            r6.mo40138d(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.ads.awx r7 = r5.f41156a
            r7.mo40138d(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axa.mo40160a(java.util.Map, com.google.android.gms.internal.ads.ayu, com.google.android.gms.internal.ads.axi):void");
    }

    /* renamed from: a */
    private final Object m47527a(zzcgv zzcgv, Class<?> cls, axi axi) throws IOException {
        switch (axb.f41160a[zzcgv.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo40182k());
            case 2:
                return mo40187n();
            case 3:
                return Double.valueOf(mo40167d());
            case 4:
                return Integer.valueOf(mo40191p());
            case 5:
                return Integer.valueOf(mo40179j());
            case 6:
                return Long.valueOf(mo40177i());
            case 7:
                return Float.valueOf(mo40169e());
            case 8:
                return Integer.valueOf(mo40175h());
            case 9:
                return Long.valueOf(mo40173g());
            case 10:
                m47528a(2);
                return m47531c(azo.m47917a().mo40356a(cls), axi);
            case 11:
                return Integer.valueOf(mo40193q());
            case 12:
                return Long.valueOf(mo40195r());
            case 13:
                return Integer.valueOf(mo40196s());
            case 14:
                return Long.valueOf(mo40197t());
            case 15:
                return mo40185m();
            case 16:
                return Integer.valueOf(mo40189o());
            case 17:
                return Long.valueOf(mo40171f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m47532c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzcdx.zzaua();
        }
    }

    /* renamed from: d */
    private final void m47534d(int i) throws IOException {
        if (this.f41156a.mo40155u() != i) {
            throw zzcdx.zzatu();
        }
    }
}
