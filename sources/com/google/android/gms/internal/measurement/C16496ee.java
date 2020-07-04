package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ee */
public final class C16496ee extends C16679kp<C16496ee> {

    /* renamed from: e */
    private static volatile C16496ee[] f46173e;

    /* renamed from: a */
    public Integer f46174a;

    /* renamed from: b */
    public C16502ek f46175b;

    /* renamed from: c */
    public C16502ek f46176c;

    /* renamed from: d */
    public Boolean f46177d;

    /* renamed from: a */
    public static C16496ee[] m53769a() {
        if (f46173e == null) {
            synchronized (C16683kt.f46606b) {
                if (f46173e == null) {
                    f46173e = new C16496ee[0];
                }
            }
        }
        return f46173e;
    }

    public C16496ee() {
        this.f46174a = null;
        this.f46175b = null;
        this.f46176c = null;
        this.f46177d = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16496ee)) {
            return false;
        }
        C16496ee eeVar = (C16496ee) obj;
        if (this.f46174a == null) {
            if (eeVar.f46174a != null) {
                return false;
            }
        } else if (!this.f46174a.equals(eeVar.f46174a)) {
            return false;
        }
        if (this.f46175b == null) {
            if (eeVar.f46175b != null) {
                return false;
            }
        } else if (!this.f46175b.equals(eeVar.f46175b)) {
            return false;
        }
        if (this.f46176c == null) {
            if (eeVar.f46176c != null) {
                return false;
            }
        } else if (!this.f46176c.equals(eeVar.f46176c)) {
            return false;
        }
        if (this.f46177d == null) {
            if (eeVar.f46177d != null) {
                return false;
            }
        } else if (!this.f46177d.equals(eeVar.f46177d)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return eeVar.f46593L == null || eeVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(eeVar.f46593L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + (this.f46174a == null ? 0 : this.f46174a.hashCode());
        C16502ek ekVar = this.f46175b;
        int i4 = hashCode * 31;
        if (ekVar == null) {
            i = 0;
        } else {
            i = ekVar.hashCode();
        }
        int i5 = i4 + i;
        C16502ek ekVar2 = this.f46176c;
        int i6 = i5 * 31;
        if (ekVar2 == null) {
            i2 = 0;
        } else {
            i2 = ekVar2.hashCode();
        }
        int hashCode2 = (((i6 + i2) * 31) + (this.f46177d == null ? 0 : this.f46177d.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i3 = this.f46593L.hashCode();
        }
        return hashCode2 + i3;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46174a != null) {
            koVar.mo43135a(1, this.f46174a.intValue());
        }
        if (this.f46175b != null) {
            koVar.mo43138a(2, (C16684ku) this.f46175b);
        }
        if (this.f46176c != null) {
            koVar.mo43138a(3, (C16684ku) this.f46176c);
        }
        if (this.f46177d != null) {
            koVar.mo43140a(4, this.f46177d.booleanValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46174a != null) {
            b += C16678ko.m54759b(1, this.f46174a.intValue());
        }
        if (this.f46175b != null) {
            b += C16678ko.m54760b(2, (C16684ku) this.f46175b);
        }
        if (this.f46176c != null) {
            b += C16678ko.m54760b(3, (C16684ku) this.f46176c);
        }
        if (this.f46177d == null) {
            return b;
        }
        this.f46177d.booleanValue();
        return b + C16678ko.m54758b(4) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46174a = Integer.valueOf(kmVar.mo43124d());
            } else if (a == 18) {
                if (this.f46175b == null) {
                    this.f46175b = new C16502ek();
                }
                kmVar.mo43115a((C16684ku) this.f46175b);
            } else if (a == 26) {
                if (this.f46176c == null) {
                    this.f46176c = new C16502ek();
                }
                kmVar.mo43115a((C16684ku) this.f46176c);
            } else if (a == 32) {
                this.f46177d = Boolean.valueOf(kmVar.mo43121b());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
