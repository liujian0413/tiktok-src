package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ec */
public final class C16494ec extends C16679kp<C16494ec> {

    /* renamed from: a */
    public Long f46162a;

    /* renamed from: b */
    public String f46163b;

    /* renamed from: c */
    public C16495ed[] f46164c;

    /* renamed from: d */
    public C16493eb[] f46165d;

    /* renamed from: e */
    public C16486dv[] f46166e;

    /* renamed from: f */
    private Integer f46167f;

    /* renamed from: g */
    private String f46168g;

    /* renamed from: h */
    private Boolean f46169h;

    public C16494ec() {
        this.f46162a = null;
        this.f46163b = null;
        this.f46167f = null;
        this.f46164c = C16495ed.m53765a();
        this.f46165d = C16493eb.m53758a();
        this.f46166e = C16486dv.m53733a();
        this.f46168g = null;
        this.f46169h = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16494ec)) {
            return false;
        }
        C16494ec ecVar = (C16494ec) obj;
        if (this.f46162a == null) {
            if (ecVar.f46162a != null) {
                return false;
            }
        } else if (!this.f46162a.equals(ecVar.f46162a)) {
            return false;
        }
        if (this.f46163b == null) {
            if (ecVar.f46163b != null) {
                return false;
            }
        } else if (!this.f46163b.equals(ecVar.f46163b)) {
            return false;
        }
        if (this.f46167f == null) {
            if (ecVar.f46167f != null) {
                return false;
            }
        } else if (!this.f46167f.equals(ecVar.f46167f)) {
            return false;
        }
        if (!C16683kt.m54806a((Object[]) this.f46164c, (Object[]) ecVar.f46164c) || !C16683kt.m54806a((Object[]) this.f46165d, (Object[]) ecVar.f46165d) || !C16683kt.m54806a((Object[]) this.f46166e, (Object[]) ecVar.f46166e)) {
            return false;
        }
        if (this.f46168g == null) {
            if (ecVar.f46168g != null) {
                return false;
            }
        } else if (!this.f46168g.equals(ecVar.f46168g)) {
            return false;
        }
        if (this.f46169h == null) {
            if (ecVar.f46169h != null) {
                return false;
            }
        } else if (!this.f46169h.equals(ecVar.f46169h)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return ecVar.f46593L == null || ecVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(ecVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46162a == null ? 0 : this.f46162a.hashCode())) * 31) + (this.f46163b == null ? 0 : this.f46163b.hashCode())) * 31) + (this.f46167f == null ? 0 : this.f46167f.hashCode())) * 31) + C16683kt.m54802a((Object[]) this.f46164c)) * 31) + C16683kt.m54802a((Object[]) this.f46165d)) * 31) + C16683kt.m54802a((Object[]) this.f46166e)) * 31) + (this.f46168g == null ? 0 : this.f46168g.hashCode())) * 31) + (this.f46169h == null ? 0 : this.f46169h.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46162a != null) {
            koVar.mo43142b(1, this.f46162a.longValue());
        }
        if (this.f46163b != null) {
            koVar.mo43139a(2, this.f46163b);
        }
        if (this.f46167f != null) {
            koVar.mo43135a(3, this.f46167f.intValue());
        }
        if (this.f46164c != null && this.f46164c.length > 0) {
            for (C16495ed edVar : this.f46164c) {
                if (edVar != null) {
                    koVar.mo43138a(4, (C16684ku) edVar);
                }
            }
        }
        if (this.f46165d != null && this.f46165d.length > 0) {
            for (C16493eb ebVar : this.f46165d) {
                if (ebVar != null) {
                    koVar.mo43138a(5, (C16684ku) ebVar);
                }
            }
        }
        if (this.f46166e != null && this.f46166e.length > 0) {
            for (C16486dv dvVar : this.f46166e) {
                if (dvVar != null) {
                    koVar.mo43138a(6, (C16684ku) dvVar);
                }
            }
        }
        if (this.f46168g != null) {
            koVar.mo43139a(7, this.f46168g);
        }
        if (this.f46169h != null) {
            koVar.mo43140a(8, this.f46169h.booleanValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46162a != null) {
            b += C16678ko.m54764c(1, this.f46162a.longValue());
        }
        if (this.f46163b != null) {
            b += C16678ko.m54761b(2, this.f46163b);
        }
        if (this.f46167f != null) {
            b += C16678ko.m54759b(3, this.f46167f.intValue());
        }
        if (this.f46164c != null && this.f46164c.length > 0) {
            int i = b;
            for (C16495ed edVar : this.f46164c) {
                if (edVar != null) {
                    i += C16678ko.m54760b(4, (C16684ku) edVar);
                }
            }
            b = i;
        }
        if (this.f46165d != null && this.f46165d.length > 0) {
            int i2 = b;
            for (C16493eb ebVar : this.f46165d) {
                if (ebVar != null) {
                    i2 += C16678ko.m54760b(5, (C16684ku) ebVar);
                }
            }
            b = i2;
        }
        if (this.f46166e != null && this.f46166e.length > 0) {
            for (C16486dv dvVar : this.f46166e) {
                if (dvVar != null) {
                    b += C16678ko.m54760b(6, (C16684ku) dvVar);
                }
            }
        }
        if (this.f46168g != null) {
            b += C16678ko.m54761b(7, this.f46168g);
        }
        if (this.f46169h == null) {
            return b;
        }
        this.f46169h.booleanValue();
        return b + C16678ko.m54758b(8) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46162a = Long.valueOf(kmVar.mo43126e());
            } else if (a == 18) {
                this.f46163b = kmVar.mo43122c();
            } else if (a == 24) {
                this.f46167f = Integer.valueOf(kmVar.mo43124d());
            } else if (a == 34) {
                int a2 = C16687kx.m54816a(kmVar, 34);
                int length = this.f46164c == null ? 0 : this.f46164c.length;
                C16495ed[] edVarArr = new C16495ed[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46164c, 0, edVarArr, 0, length);
                }
                while (length < edVarArr.length - 1) {
                    edVarArr[length] = new C16495ed();
                    kmVar.mo43115a((C16684ku) edVarArr[length]);
                    kmVar.mo43113a();
                    length++;
                }
                edVarArr[length] = new C16495ed();
                kmVar.mo43115a((C16684ku) edVarArr[length]);
                this.f46164c = edVarArr;
            } else if (a == 42) {
                int a3 = C16687kx.m54816a(kmVar, 42);
                int length2 = this.f46165d == null ? 0 : this.f46165d.length;
                C16493eb[] ebVarArr = new C16493eb[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46165d, 0, ebVarArr, 0, length2);
                }
                while (length2 < ebVarArr.length - 1) {
                    ebVarArr[length2] = new C16493eb();
                    kmVar.mo43115a((C16684ku) ebVarArr[length2]);
                    kmVar.mo43113a();
                    length2++;
                }
                ebVarArr[length2] = new C16493eb();
                kmVar.mo43115a((C16684ku) ebVarArr[length2]);
                this.f46165d = ebVarArr;
            } else if (a == 50) {
                int a4 = C16687kx.m54816a(kmVar, 50);
                int length3 = this.f46166e == null ? 0 : this.f46166e.length;
                C16486dv[] dvVarArr = new C16486dv[(a4 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f46166e, 0, dvVarArr, 0, length3);
                }
                while (length3 < dvVarArr.length - 1) {
                    dvVarArr[length3] = new C16486dv();
                    kmVar.mo43115a((C16684ku) dvVarArr[length3]);
                    kmVar.mo43113a();
                    length3++;
                }
                dvVarArr[length3] = new C16486dv();
                kmVar.mo43115a((C16684ku) dvVarArr[length3]);
                this.f46166e = dvVarArr;
            } else if (a == 58) {
                this.f46168g = kmVar.mo43122c();
            } else if (a == 64) {
                this.f46169h = Boolean.valueOf(kmVar.mo43121b());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
