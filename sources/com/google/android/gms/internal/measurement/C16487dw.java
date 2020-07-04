package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dw */
public final class C16487dw extends C16679kp<C16487dw> {

    /* renamed from: g */
    private static volatile C16487dw[] f46125g;

    /* renamed from: a */
    public Integer f46126a;

    /* renamed from: b */
    public String f46127b;

    /* renamed from: c */
    public C16488dx[] f46128c;

    /* renamed from: d */
    public C16489dy f46129d;

    /* renamed from: e */
    public Boolean f46130e;

    /* renamed from: f */
    public Boolean f46131f;

    /* renamed from: h */
    private Boolean f46132h;

    /* renamed from: a */
    public static C16487dw[] m53737a() {
        if (f46125g == null) {
            synchronized (C16683kt.f46606b) {
                if (f46125g == null) {
                    f46125g = new C16487dw[0];
                }
            }
        }
        return f46125g;
    }

    public C16487dw() {
        this.f46126a = null;
        this.f46127b = null;
        this.f46128c = C16488dx.m53741a();
        this.f46132h = null;
        this.f46129d = null;
        this.f46130e = null;
        this.f46131f = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16487dw)) {
            return false;
        }
        C16487dw dwVar = (C16487dw) obj;
        if (this.f46126a == null) {
            if (dwVar.f46126a != null) {
                return false;
            }
        } else if (!this.f46126a.equals(dwVar.f46126a)) {
            return false;
        }
        if (this.f46127b == null) {
            if (dwVar.f46127b != null) {
                return false;
            }
        } else if (!this.f46127b.equals(dwVar.f46127b)) {
            return false;
        }
        if (!C16683kt.m54806a((Object[]) this.f46128c, (Object[]) dwVar.f46128c)) {
            return false;
        }
        if (this.f46132h == null) {
            if (dwVar.f46132h != null) {
                return false;
            }
        } else if (!this.f46132h.equals(dwVar.f46132h)) {
            return false;
        }
        if (this.f46129d == null) {
            if (dwVar.f46129d != null) {
                return false;
            }
        } else if (!this.f46129d.equals(dwVar.f46129d)) {
            return false;
        }
        if (this.f46130e == null) {
            if (dwVar.f46130e != null) {
                return false;
            }
        } else if (!this.f46130e.equals(dwVar.f46130e)) {
            return false;
        }
        if (this.f46131f == null) {
            if (dwVar.f46131f != null) {
                return false;
            }
        } else if (!this.f46131f.equals(dwVar.f46131f)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return dwVar.f46593L == null || dwVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(dwVar.f46593L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46126a == null ? 0 : this.f46126a.hashCode())) * 31) + (this.f46127b == null ? 0 : this.f46127b.hashCode())) * 31) + C16683kt.m54802a((Object[]) this.f46128c)) * 31) + (this.f46132h == null ? 0 : this.f46132h.hashCode());
        C16489dy dyVar = this.f46129d;
        int i3 = hashCode * 31;
        if (dyVar == null) {
            i = 0;
        } else {
            i = dyVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f46130e == null ? 0 : this.f46130e.hashCode())) * 31) + (this.f46131f == null ? 0 : this.f46131f.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i2 = this.f46593L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46126a != null) {
            koVar.mo43135a(1, this.f46126a.intValue());
        }
        if (this.f46127b != null) {
            koVar.mo43139a(2, this.f46127b);
        }
        if (this.f46128c != null && this.f46128c.length > 0) {
            for (C16488dx dxVar : this.f46128c) {
                if (dxVar != null) {
                    koVar.mo43138a(3, (C16684ku) dxVar);
                }
            }
        }
        if (this.f46132h != null) {
            koVar.mo43140a(4, this.f46132h.booleanValue());
        }
        if (this.f46129d != null) {
            koVar.mo43138a(5, (C16684ku) this.f46129d);
        }
        if (this.f46130e != null) {
            koVar.mo43140a(6, this.f46130e.booleanValue());
        }
        if (this.f46131f != null) {
            koVar.mo43140a(7, this.f46131f.booleanValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46126a != null) {
            b += C16678ko.m54759b(1, this.f46126a.intValue());
        }
        if (this.f46127b != null) {
            b += C16678ko.m54761b(2, this.f46127b);
        }
        if (this.f46128c != null && this.f46128c.length > 0) {
            for (C16488dx dxVar : this.f46128c) {
                if (dxVar != null) {
                    b += C16678ko.m54760b(3, (C16684ku) dxVar);
                }
            }
        }
        if (this.f46132h != null) {
            this.f46132h.booleanValue();
            b += C16678ko.m54758b(4) + 1;
        }
        if (this.f46129d != null) {
            b += C16678ko.m54760b(5, (C16684ku) this.f46129d);
        }
        if (this.f46130e != null) {
            this.f46130e.booleanValue();
            b += C16678ko.m54758b(6) + 1;
        }
        if (this.f46131f == null) {
            return b;
        }
        this.f46131f.booleanValue();
        return b + C16678ko.m54758b(7) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46126a = Integer.valueOf(kmVar.mo43124d());
            } else if (a == 18) {
                this.f46127b = kmVar.mo43122c();
            } else if (a == 26) {
                int a2 = C16687kx.m54816a(kmVar, 26);
                int length = this.f46128c == null ? 0 : this.f46128c.length;
                C16488dx[] dxVarArr = new C16488dx[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46128c, 0, dxVarArr, 0, length);
                }
                while (length < dxVarArr.length - 1) {
                    dxVarArr[length] = new C16488dx();
                    kmVar.mo43115a((C16684ku) dxVarArr[length]);
                    kmVar.mo43113a();
                    length++;
                }
                dxVarArr[length] = new C16488dx();
                kmVar.mo43115a((C16684ku) dxVarArr[length]);
                this.f46128c = dxVarArr;
            } else if (a == 32) {
                this.f46132h = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 42) {
                if (this.f46129d == null) {
                    this.f46129d = new C16489dy();
                }
                kmVar.mo43115a((C16684ku) this.f46129d);
            } else if (a == 48) {
                this.f46130e = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 56) {
                this.f46131f = Boolean.valueOf(kmVar.mo43121b());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
