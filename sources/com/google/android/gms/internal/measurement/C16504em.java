package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.em */
public final class C16504em extends C16679kp<C16504em> {

    /* renamed from: f */
    private static volatile C16504em[] f46243f;

    /* renamed from: a */
    public Long f46244a;

    /* renamed from: b */
    public String f46245b;

    /* renamed from: c */
    public String f46246c;

    /* renamed from: d */
    public Long f46247d;

    /* renamed from: e */
    public Double f46248e;

    /* renamed from: g */
    private Float f46249g;

    /* renamed from: a */
    public static C16504em[] m53799a() {
        if (f46243f == null) {
            synchronized (C16683kt.f46606b) {
                if (f46243f == null) {
                    f46243f = new C16504em[0];
                }
            }
        }
        return f46243f;
    }

    public C16504em() {
        this.f46244a = null;
        this.f46245b = null;
        this.f46246c = null;
        this.f46247d = null;
        this.f46249g = null;
        this.f46248e = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16504em)) {
            return false;
        }
        C16504em emVar = (C16504em) obj;
        if (this.f46244a == null) {
            if (emVar.f46244a != null) {
                return false;
            }
        } else if (!this.f46244a.equals(emVar.f46244a)) {
            return false;
        }
        if (this.f46245b == null) {
            if (emVar.f46245b != null) {
                return false;
            }
        } else if (!this.f46245b.equals(emVar.f46245b)) {
            return false;
        }
        if (this.f46246c == null) {
            if (emVar.f46246c != null) {
                return false;
            }
        } else if (!this.f46246c.equals(emVar.f46246c)) {
            return false;
        }
        if (this.f46247d == null) {
            if (emVar.f46247d != null) {
                return false;
            }
        } else if (!this.f46247d.equals(emVar.f46247d)) {
            return false;
        }
        if (this.f46249g == null) {
            if (emVar.f46249g != null) {
                return false;
            }
        } else if (!this.f46249g.equals(emVar.f46249g)) {
            return false;
        }
        if (this.f46248e == null) {
            if (emVar.f46248e != null) {
                return false;
            }
        } else if (!this.f46248e.equals(emVar.f46248e)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return emVar.f46593L == null || emVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(emVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46244a == null ? 0 : this.f46244a.hashCode())) * 31) + (this.f46245b == null ? 0 : this.f46245b.hashCode())) * 31) + (this.f46246c == null ? 0 : this.f46246c.hashCode())) * 31) + (this.f46247d == null ? 0 : this.f46247d.hashCode())) * 31) + (this.f46249g == null ? 0 : this.f46249g.hashCode())) * 31) + (this.f46248e == null ? 0 : this.f46248e.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46244a != null) {
            koVar.mo43142b(1, this.f46244a.longValue());
        }
        if (this.f46245b != null) {
            koVar.mo43139a(2, this.f46245b);
        }
        if (this.f46246c != null) {
            koVar.mo43139a(3, this.f46246c);
        }
        if (this.f46247d != null) {
            koVar.mo43142b(4, this.f46247d.longValue());
        }
        if (this.f46249g != null) {
            koVar.mo43134a(5, this.f46249g.floatValue());
        }
        if (this.f46248e != null) {
            koVar.mo43133a(6, this.f46248e.doubleValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46244a != null) {
            b += C16678ko.m54764c(1, this.f46244a.longValue());
        }
        if (this.f46245b != null) {
            b += C16678ko.m54761b(2, this.f46245b);
        }
        if (this.f46246c != null) {
            b += C16678ko.m54761b(3, this.f46246c);
        }
        if (this.f46247d != null) {
            b += C16678ko.m54764c(4, this.f46247d.longValue());
        }
        if (this.f46249g != null) {
            this.f46249g.floatValue();
            b += C16678ko.m54758b(5) + 4;
        }
        if (this.f46248e == null) {
            return b;
        }
        this.f46248e.doubleValue();
        return b + C16678ko.m54758b(6) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46244a = Long.valueOf(kmVar.mo43126e());
            } else if (a == 18) {
                this.f46245b = kmVar.mo43122c();
            } else if (a == 26) {
                this.f46246c = kmVar.mo43122c();
            } else if (a == 32) {
                this.f46247d = Long.valueOf(kmVar.mo43126e());
            } else if (a == 45) {
                this.f46249g = Float.valueOf(Float.intBitsToFloat(kmVar.mo43127f()));
            } else if (a == 49) {
                this.f46248e = Double.valueOf(Double.longBitsToDouble(kmVar.mo43128g()));
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
