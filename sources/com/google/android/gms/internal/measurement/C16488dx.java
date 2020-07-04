package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dx */
public final class C16488dx extends C16679kp<C16488dx> {

    /* renamed from: e */
    private static volatile C16488dx[] f46133e;

    /* renamed from: a */
    public C16492ea f46134a;

    /* renamed from: b */
    public C16489dy f46135b;

    /* renamed from: c */
    public Boolean f46136c;

    /* renamed from: d */
    public String f46137d;

    /* renamed from: a */
    public static C16488dx[] m53741a() {
        if (f46133e == null) {
            synchronized (C16683kt.f46606b) {
                if (f46133e == null) {
                    f46133e = new C16488dx[0];
                }
            }
        }
        return f46133e;
    }

    public C16488dx() {
        this.f46134a = null;
        this.f46135b = null;
        this.f46136c = null;
        this.f46137d = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16488dx)) {
            return false;
        }
        C16488dx dxVar = (C16488dx) obj;
        if (this.f46134a == null) {
            if (dxVar.f46134a != null) {
                return false;
            }
        } else if (!this.f46134a.equals(dxVar.f46134a)) {
            return false;
        }
        if (this.f46135b == null) {
            if (dxVar.f46135b != null) {
                return false;
            }
        } else if (!this.f46135b.equals(dxVar.f46135b)) {
            return false;
        }
        if (this.f46136c == null) {
            if (dxVar.f46136c != null) {
                return false;
            }
        } else if (!this.f46136c.equals(dxVar.f46136c)) {
            return false;
        }
        if (this.f46137d == null) {
            if (dxVar.f46137d != null) {
                return false;
            }
        } else if (!this.f46137d.equals(dxVar.f46137d)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return dxVar.f46593L == null || dxVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(dxVar.f46593L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = getClass().getName().hashCode() + 527;
        C16492ea eaVar = this.f46134a;
        int i3 = hashCode * 31;
        int i4 = 0;
        if (eaVar == null) {
            i = 0;
        } else {
            i = eaVar.hashCode();
        }
        int i5 = i3 + i;
        C16489dy dyVar = this.f46135b;
        int i6 = i5 * 31;
        if (dyVar == null) {
            i2 = 0;
        } else {
            i2 = dyVar.hashCode();
        }
        int hashCode2 = (((((i6 + i2) * 31) + (this.f46136c == null ? 0 : this.f46136c.hashCode())) * 31) + (this.f46137d == null ? 0 : this.f46137d.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i4 = this.f46593L.hashCode();
        }
        return hashCode2 + i4;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46134a != null) {
            koVar.mo43138a(1, (C16684ku) this.f46134a);
        }
        if (this.f46135b != null) {
            koVar.mo43138a(2, (C16684ku) this.f46135b);
        }
        if (this.f46136c != null) {
            koVar.mo43140a(3, this.f46136c.booleanValue());
        }
        if (this.f46137d != null) {
            koVar.mo43139a(4, this.f46137d);
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46134a != null) {
            b += C16678ko.m54760b(1, (C16684ku) this.f46134a);
        }
        if (this.f46135b != null) {
            b += C16678ko.m54760b(2, (C16684ku) this.f46135b);
        }
        if (this.f46136c != null) {
            this.f46136c.booleanValue();
            b += C16678ko.m54758b(3) + 1;
        }
        return this.f46137d != null ? b + C16678ko.m54761b(4, this.f46137d) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f46134a == null) {
                    this.f46134a = new C16492ea();
                }
                kmVar.mo43115a((C16684ku) this.f46134a);
            } else if (a == 18) {
                if (this.f46135b == null) {
                    this.f46135b = new C16489dy();
                }
                kmVar.mo43115a((C16684ku) this.f46135b);
            } else if (a == 24) {
                this.f46136c = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 34) {
                this.f46137d = kmVar.mo43122c();
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
