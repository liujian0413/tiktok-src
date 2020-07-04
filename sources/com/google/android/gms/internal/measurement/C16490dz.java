package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dz */
public final class C16490dz extends C16679kp<C16490dz> {

    /* renamed from: f */
    private static volatile C16490dz[] f46143f;

    /* renamed from: a */
    public Integer f46144a;

    /* renamed from: b */
    public String f46145b;

    /* renamed from: c */
    public C16488dx f46146c;

    /* renamed from: d */
    public Boolean f46147d;

    /* renamed from: e */
    public Boolean f46148e;

    /* renamed from: a */
    public static C16490dz[] m53749a() {
        if (f46143f == null) {
            synchronized (C16683kt.f46606b) {
                if (f46143f == null) {
                    f46143f = new C16490dz[0];
                }
            }
        }
        return f46143f;
    }

    public C16490dz() {
        this.f46144a = null;
        this.f46145b = null;
        this.f46146c = null;
        this.f46147d = null;
        this.f46148e = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16490dz)) {
            return false;
        }
        C16490dz dzVar = (C16490dz) obj;
        if (this.f46144a == null) {
            if (dzVar.f46144a != null) {
                return false;
            }
        } else if (!this.f46144a.equals(dzVar.f46144a)) {
            return false;
        }
        if (this.f46145b == null) {
            if (dzVar.f46145b != null) {
                return false;
            }
        } else if (!this.f46145b.equals(dzVar.f46145b)) {
            return false;
        }
        if (this.f46146c == null) {
            if (dzVar.f46146c != null) {
                return false;
            }
        } else if (!this.f46146c.equals(dzVar.f46146c)) {
            return false;
        }
        if (this.f46147d == null) {
            if (dzVar.f46147d != null) {
                return false;
            }
        } else if (!this.f46147d.equals(dzVar.f46147d)) {
            return false;
        }
        if (this.f46148e == null) {
            if (dzVar.f46148e != null) {
                return false;
            }
        } else if (!this.f46148e.equals(dzVar.f46148e)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return dzVar.f46593L == null || dzVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(dzVar.f46593L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + (this.f46144a == null ? 0 : this.f46144a.hashCode())) * 31) + (this.f46145b == null ? 0 : this.f46145b.hashCode());
        C16488dx dxVar = this.f46146c;
        int i3 = hashCode * 31;
        if (dxVar == null) {
            i = 0;
        } else {
            i = dxVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f46147d == null ? 0 : this.f46147d.hashCode())) * 31) + (this.f46148e == null ? 0 : this.f46148e.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i2 = this.f46593L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46144a != null) {
            koVar.mo43135a(1, this.f46144a.intValue());
        }
        if (this.f46145b != null) {
            koVar.mo43139a(2, this.f46145b);
        }
        if (this.f46146c != null) {
            koVar.mo43138a(3, (C16684ku) this.f46146c);
        }
        if (this.f46147d != null) {
            koVar.mo43140a(4, this.f46147d.booleanValue());
        }
        if (this.f46148e != null) {
            koVar.mo43140a(5, this.f46148e.booleanValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46144a != null) {
            b += C16678ko.m54759b(1, this.f46144a.intValue());
        }
        if (this.f46145b != null) {
            b += C16678ko.m54761b(2, this.f46145b);
        }
        if (this.f46146c != null) {
            b += C16678ko.m54760b(3, (C16684ku) this.f46146c);
        }
        if (this.f46147d != null) {
            this.f46147d.booleanValue();
            b += C16678ko.m54758b(4) + 1;
        }
        if (this.f46148e == null) {
            return b;
        }
        this.f46148e.booleanValue();
        return b + C16678ko.m54758b(5) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46144a = Integer.valueOf(kmVar.mo43124d());
            } else if (a == 18) {
                this.f46145b = kmVar.mo43122c();
            } else if (a == 26) {
                if (this.f46146c == null) {
                    this.f46146c = new C16488dx();
                }
                kmVar.mo43115a((C16684ku) this.f46146c);
            } else if (a == 32) {
                this.f46147d = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 40) {
                this.f46148e = Boolean.valueOf(kmVar.mo43121b());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
