package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dv */
public final class C16486dv extends C16679kp<C16486dv> {

    /* renamed from: d */
    private static volatile C16486dv[] f46119d;

    /* renamed from: a */
    public Integer f46120a;

    /* renamed from: b */
    public C16490dz[] f46121b;

    /* renamed from: c */
    public C16487dw[] f46122c;

    /* renamed from: e */
    private Boolean f46123e;

    /* renamed from: f */
    private Boolean f46124f;

    /* renamed from: a */
    public static C16486dv[] m53733a() {
        if (f46119d == null) {
            synchronized (C16683kt.f46606b) {
                if (f46119d == null) {
                    f46119d = new C16486dv[0];
                }
            }
        }
        return f46119d;
    }

    public C16486dv() {
        this.f46120a = null;
        this.f46121b = C16490dz.m53749a();
        this.f46122c = C16487dw.m53737a();
        this.f46123e = null;
        this.f46124f = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16486dv)) {
            return false;
        }
        C16486dv dvVar = (C16486dv) obj;
        if (this.f46120a == null) {
            if (dvVar.f46120a != null) {
                return false;
            }
        } else if (!this.f46120a.equals(dvVar.f46120a)) {
            return false;
        }
        if (!C16683kt.m54806a((Object[]) this.f46121b, (Object[]) dvVar.f46121b) || !C16683kt.m54806a((Object[]) this.f46122c, (Object[]) dvVar.f46122c)) {
            return false;
        }
        if (this.f46123e == null) {
            if (dvVar.f46123e != null) {
                return false;
            }
        } else if (!this.f46123e.equals(dvVar.f46123e)) {
            return false;
        }
        if (this.f46124f == null) {
            if (dvVar.f46124f != null) {
                return false;
            }
        } else if (!this.f46124f.equals(dvVar.f46124f)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return dvVar.f46593L == null || dvVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(dvVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46120a == null ? 0 : this.f46120a.hashCode())) * 31) + C16683kt.m54802a((Object[]) this.f46121b)) * 31) + C16683kt.m54802a((Object[]) this.f46122c)) * 31) + (this.f46123e == null ? 0 : this.f46123e.hashCode())) * 31) + (this.f46124f == null ? 0 : this.f46124f.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46120a != null) {
            koVar.mo43135a(1, this.f46120a.intValue());
        }
        if (this.f46121b != null && this.f46121b.length > 0) {
            for (C16490dz dzVar : this.f46121b) {
                if (dzVar != null) {
                    koVar.mo43138a(2, (C16684ku) dzVar);
                }
            }
        }
        if (this.f46122c != null && this.f46122c.length > 0) {
            for (C16487dw dwVar : this.f46122c) {
                if (dwVar != null) {
                    koVar.mo43138a(3, (C16684ku) dwVar);
                }
            }
        }
        if (this.f46123e != null) {
            koVar.mo43140a(4, this.f46123e.booleanValue());
        }
        if (this.f46124f != null) {
            koVar.mo43140a(5, this.f46124f.booleanValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46120a != null) {
            b += C16678ko.m54759b(1, this.f46120a.intValue());
        }
        if (this.f46121b != null && this.f46121b.length > 0) {
            int i = b;
            for (C16490dz dzVar : this.f46121b) {
                if (dzVar != null) {
                    i += C16678ko.m54760b(2, (C16684ku) dzVar);
                }
            }
            b = i;
        }
        if (this.f46122c != null && this.f46122c.length > 0) {
            for (C16487dw dwVar : this.f46122c) {
                if (dwVar != null) {
                    b += C16678ko.m54760b(3, (C16684ku) dwVar);
                }
            }
        }
        if (this.f46123e != null) {
            this.f46123e.booleanValue();
            b += C16678ko.m54758b(4) + 1;
        }
        if (this.f46124f == null) {
            return b;
        }
        this.f46124f.booleanValue();
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
                this.f46120a = Integer.valueOf(kmVar.mo43124d());
            } else if (a == 18) {
                int a2 = C16687kx.m54816a(kmVar, 18);
                int length = this.f46121b == null ? 0 : this.f46121b.length;
                C16490dz[] dzVarArr = new C16490dz[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46121b, 0, dzVarArr, 0, length);
                }
                while (length < dzVarArr.length - 1) {
                    dzVarArr[length] = new C16490dz();
                    kmVar.mo43115a((C16684ku) dzVarArr[length]);
                    kmVar.mo43113a();
                    length++;
                }
                dzVarArr[length] = new C16490dz();
                kmVar.mo43115a((C16684ku) dzVarArr[length]);
                this.f46121b = dzVarArr;
            } else if (a == 26) {
                int a3 = C16687kx.m54816a(kmVar, 26);
                int length2 = this.f46122c == null ? 0 : this.f46122c.length;
                C16487dw[] dwVarArr = new C16487dw[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46122c, 0, dwVarArr, 0, length2);
                }
                while (length2 < dwVarArr.length - 1) {
                    dwVarArr[length2] = new C16487dw();
                    kmVar.mo43115a((C16684ku) dwVarArr[length2]);
                    kmVar.mo43113a();
                    length2++;
                }
                dwVarArr[length2] = new C16487dw();
                kmVar.mo43115a((C16684ku) dwVarArr[length2]);
                this.f46122c = dwVarArr;
            } else if (a == 32) {
                this.f46123e = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 40) {
                this.f46124f = Boolean.valueOf(kmVar.mo43121b());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
