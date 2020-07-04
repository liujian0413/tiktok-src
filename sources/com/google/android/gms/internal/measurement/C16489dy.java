package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dy */
public final class C16489dy extends C16679kp<C16489dy> {

    /* renamed from: a */
    public Integer f46138a;

    /* renamed from: b */
    public Boolean f46139b;

    /* renamed from: c */
    public String f46140c;

    /* renamed from: d */
    public String f46141d;

    /* renamed from: e */
    public String f46142e;

    public C16489dy() {
        this.f46138a = null;
        this.f46139b = null;
        this.f46140c = null;
        this.f46141d = null;
        this.f46142e = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16489dy)) {
            return false;
        }
        C16489dy dyVar = (C16489dy) obj;
        if (this.f46138a == null) {
            if (dyVar.f46138a != null) {
                return false;
            }
        } else if (!this.f46138a.equals(dyVar.f46138a)) {
            return false;
        }
        if (this.f46139b == null) {
            if (dyVar.f46139b != null) {
                return false;
            }
        } else if (!this.f46139b.equals(dyVar.f46139b)) {
            return false;
        }
        if (this.f46140c == null) {
            if (dyVar.f46140c != null) {
                return false;
            }
        } else if (!this.f46140c.equals(dyVar.f46140c)) {
            return false;
        }
        if (this.f46141d == null) {
            if (dyVar.f46141d != null) {
                return false;
            }
        } else if (!this.f46141d.equals(dyVar.f46141d)) {
            return false;
        }
        if (this.f46142e == null) {
            if (dyVar.f46142e != null) {
                return false;
            }
        } else if (!this.f46142e.equals(dyVar.f46142e)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return dyVar.f46593L == null || dyVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(dyVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46138a == null ? 0 : this.f46138a.intValue())) * 31) + (this.f46139b == null ? 0 : this.f46139b.hashCode())) * 31) + (this.f46140c == null ? 0 : this.f46140c.hashCode())) * 31) + (this.f46141d == null ? 0 : this.f46141d.hashCode())) * 31) + (this.f46142e == null ? 0 : this.f46142e.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46138a != null) {
            koVar.mo43135a(1, this.f46138a.intValue());
        }
        if (this.f46139b != null) {
            koVar.mo43140a(2, this.f46139b.booleanValue());
        }
        if (this.f46140c != null) {
            koVar.mo43139a(3, this.f46140c);
        }
        if (this.f46141d != null) {
            koVar.mo43139a(4, this.f46141d);
        }
        if (this.f46142e != null) {
            koVar.mo43139a(5, this.f46142e);
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46138a != null) {
            b += C16678ko.m54759b(1, this.f46138a.intValue());
        }
        if (this.f46139b != null) {
            this.f46139b.booleanValue();
            b += C16678ko.m54758b(2) + 1;
        }
        if (this.f46140c != null) {
            b += C16678ko.m54761b(3, this.f46140c);
        }
        if (this.f46141d != null) {
            b += C16678ko.m54761b(4, this.f46141d);
        }
        return this.f46142e != null ? b + C16678ko.m54761b(5, this.f46142e) : b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C16489dy mo42654a(C16676km kmVar) throws IOException {
        int d;
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = kmVar.mo43124d();
                    if (d < 0 || d > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(d);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.f46138a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    kmVar.mo43125d(kmVar.mo43130i());
                    mo43146a(kmVar, a);
                }
            } else if (a == 16) {
                this.f46139b = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 26) {
                this.f46140c = kmVar.mo43122c();
            } else if (a == 34) {
                this.f46141d = kmVar.mo43122c();
            } else if (a == 42) {
                this.f46142e = kmVar.mo43122c();
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(d);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
