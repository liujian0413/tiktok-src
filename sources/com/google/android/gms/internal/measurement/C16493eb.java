package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.eb */
public final class C16493eb extends C16679kp<C16493eb> {

    /* renamed from: e */
    private static volatile C16493eb[] f46157e;

    /* renamed from: a */
    public String f46158a;

    /* renamed from: b */
    public Boolean f46159b;

    /* renamed from: c */
    public Boolean f46160c;

    /* renamed from: d */
    public Integer f46161d;

    /* renamed from: a */
    public static C16493eb[] m53758a() {
        if (f46157e == null) {
            synchronized (C16683kt.f46606b) {
                if (f46157e == null) {
                    f46157e = new C16493eb[0];
                }
            }
        }
        return f46157e;
    }

    public C16493eb() {
        this.f46158a = null;
        this.f46159b = null;
        this.f46160c = null;
        this.f46161d = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16493eb)) {
            return false;
        }
        C16493eb ebVar = (C16493eb) obj;
        if (this.f46158a == null) {
            if (ebVar.f46158a != null) {
                return false;
            }
        } else if (!this.f46158a.equals(ebVar.f46158a)) {
            return false;
        }
        if (this.f46159b == null) {
            if (ebVar.f46159b != null) {
                return false;
            }
        } else if (!this.f46159b.equals(ebVar.f46159b)) {
            return false;
        }
        if (this.f46160c == null) {
            if (ebVar.f46160c != null) {
                return false;
            }
        } else if (!this.f46160c.equals(ebVar.f46160c)) {
            return false;
        }
        if (this.f46161d == null) {
            if (ebVar.f46161d != null) {
                return false;
            }
        } else if (!this.f46161d.equals(ebVar.f46161d)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return ebVar.f46593L == null || ebVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(ebVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46158a == null ? 0 : this.f46158a.hashCode())) * 31) + (this.f46159b == null ? 0 : this.f46159b.hashCode())) * 31) + (this.f46160c == null ? 0 : this.f46160c.hashCode())) * 31) + (this.f46161d == null ? 0 : this.f46161d.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46158a != null) {
            koVar.mo43139a(1, this.f46158a);
        }
        if (this.f46159b != null) {
            koVar.mo43140a(2, this.f46159b.booleanValue());
        }
        if (this.f46160c != null) {
            koVar.mo43140a(3, this.f46160c.booleanValue());
        }
        if (this.f46161d != null) {
            koVar.mo43135a(4, this.f46161d.intValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46158a != null) {
            b += C16678ko.m54761b(1, this.f46158a);
        }
        if (this.f46159b != null) {
            this.f46159b.booleanValue();
            b += C16678ko.m54758b(2) + 1;
        }
        if (this.f46160c != null) {
            this.f46160c.booleanValue();
            b += C16678ko.m54758b(3) + 1;
        }
        return this.f46161d != null ? b + C16678ko.m54759b(4, this.f46161d.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f46158a = kmVar.mo43122c();
            } else if (a == 16) {
                this.f46159b = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 24) {
                this.f46160c = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 32) {
                this.f46161d = Integer.valueOf(kmVar.mo43124d());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
