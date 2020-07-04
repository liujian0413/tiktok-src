package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.eh */
public final class C16499eh extends C16679kp<C16499eh> {

    /* renamed from: e */
    private static volatile C16499eh[] f46187e;

    /* renamed from: a */
    public String f46188a;

    /* renamed from: b */
    public String f46189b;

    /* renamed from: c */
    public Long f46190c;

    /* renamed from: d */
    public Double f46191d;

    /* renamed from: f */
    private Float f46192f;

    /* renamed from: a */
    public static C16499eh[] m53781a() {
        if (f46187e == null) {
            synchronized (C16683kt.f46606b) {
                if (f46187e == null) {
                    f46187e = new C16499eh[0];
                }
            }
        }
        return f46187e;
    }

    public C16499eh() {
        this.f46188a = null;
        this.f46189b = null;
        this.f46190c = null;
        this.f46192f = null;
        this.f46191d = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16499eh)) {
            return false;
        }
        C16499eh ehVar = (C16499eh) obj;
        if (this.f46188a == null) {
            if (ehVar.f46188a != null) {
                return false;
            }
        } else if (!this.f46188a.equals(ehVar.f46188a)) {
            return false;
        }
        if (this.f46189b == null) {
            if (ehVar.f46189b != null) {
                return false;
            }
        } else if (!this.f46189b.equals(ehVar.f46189b)) {
            return false;
        }
        if (this.f46190c == null) {
            if (ehVar.f46190c != null) {
                return false;
            }
        } else if (!this.f46190c.equals(ehVar.f46190c)) {
            return false;
        }
        if (this.f46192f == null) {
            if (ehVar.f46192f != null) {
                return false;
            }
        } else if (!this.f46192f.equals(ehVar.f46192f)) {
            return false;
        }
        if (this.f46191d == null) {
            if (ehVar.f46191d != null) {
                return false;
            }
        } else if (!this.f46191d.equals(ehVar.f46191d)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return ehVar.f46593L == null || ehVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(ehVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46188a == null ? 0 : this.f46188a.hashCode())) * 31) + (this.f46189b == null ? 0 : this.f46189b.hashCode())) * 31) + (this.f46190c == null ? 0 : this.f46190c.hashCode())) * 31) + (this.f46192f == null ? 0 : this.f46192f.hashCode())) * 31) + (this.f46191d == null ? 0 : this.f46191d.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46188a != null) {
            koVar.mo43139a(1, this.f46188a);
        }
        if (this.f46189b != null) {
            koVar.mo43139a(2, this.f46189b);
        }
        if (this.f46190c != null) {
            koVar.mo43142b(3, this.f46190c.longValue());
        }
        if (this.f46192f != null) {
            koVar.mo43134a(4, this.f46192f.floatValue());
        }
        if (this.f46191d != null) {
            koVar.mo43133a(5, this.f46191d.doubleValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46188a != null) {
            b += C16678ko.m54761b(1, this.f46188a);
        }
        if (this.f46189b != null) {
            b += C16678ko.m54761b(2, this.f46189b);
        }
        if (this.f46190c != null) {
            b += C16678ko.m54764c(3, this.f46190c.longValue());
        }
        if (this.f46192f != null) {
            this.f46192f.floatValue();
            b += C16678ko.m54758b(4) + 4;
        }
        if (this.f46191d == null) {
            return b;
        }
        this.f46191d.doubleValue();
        return b + C16678ko.m54758b(5) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f46188a = kmVar.mo43122c();
            } else if (a == 18) {
                this.f46189b = kmVar.mo43122c();
            } else if (a == 24) {
                this.f46190c = Long.valueOf(kmVar.mo43126e());
            } else if (a == 37) {
                this.f46192f = Float.valueOf(Float.intBitsToFloat(kmVar.mo43127f()));
            } else if (a == 41) {
                this.f46191d = Double.valueOf(Double.longBitsToDouble(kmVar.mo43128g()));
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
