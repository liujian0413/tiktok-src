package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.eg */
public final class C16498eg extends C16679kp<C16498eg> {

    /* renamed from: f */
    private static volatile C16498eg[] f46181f;

    /* renamed from: a */
    public C16499eh[] f46182a;

    /* renamed from: b */
    public String f46183b;

    /* renamed from: c */
    public Long f46184c;

    /* renamed from: d */
    public Long f46185d;

    /* renamed from: e */
    public Integer f46186e;

    /* renamed from: a */
    public static C16498eg[] m53777a() {
        if (f46181f == null) {
            synchronized (C16683kt.f46606b) {
                if (f46181f == null) {
                    f46181f = new C16498eg[0];
                }
            }
        }
        return f46181f;
    }

    public C16498eg() {
        this.f46182a = C16499eh.m53781a();
        this.f46183b = null;
        this.f46184c = null;
        this.f46185d = null;
        this.f46186e = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16498eg)) {
            return false;
        }
        C16498eg egVar = (C16498eg) obj;
        if (!C16683kt.m54806a((Object[]) this.f46182a, (Object[]) egVar.f46182a)) {
            return false;
        }
        if (this.f46183b == null) {
            if (egVar.f46183b != null) {
                return false;
            }
        } else if (!this.f46183b.equals(egVar.f46183b)) {
            return false;
        }
        if (this.f46184c == null) {
            if (egVar.f46184c != null) {
                return false;
            }
        } else if (!this.f46184c.equals(egVar.f46184c)) {
            return false;
        }
        if (this.f46185d == null) {
            if (egVar.f46185d != null) {
                return false;
            }
        } else if (!this.f46185d.equals(egVar.f46185d)) {
            return false;
        }
        if (this.f46186e == null) {
            if (egVar.f46186e != null) {
                return false;
            }
        } else if (!this.f46186e.equals(egVar.f46186e)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return egVar.f46593L == null || egVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(egVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + C16683kt.m54802a((Object[]) this.f46182a)) * 31) + (this.f46183b == null ? 0 : this.f46183b.hashCode())) * 31) + (this.f46184c == null ? 0 : this.f46184c.hashCode())) * 31) + (this.f46185d == null ? 0 : this.f46185d.hashCode())) * 31) + (this.f46186e == null ? 0 : this.f46186e.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46182a != null && this.f46182a.length > 0) {
            for (C16499eh ehVar : this.f46182a) {
                if (ehVar != null) {
                    koVar.mo43138a(1, (C16684ku) ehVar);
                }
            }
        }
        if (this.f46183b != null) {
            koVar.mo43139a(2, this.f46183b);
        }
        if (this.f46184c != null) {
            koVar.mo43142b(3, this.f46184c.longValue());
        }
        if (this.f46185d != null) {
            koVar.mo43142b(4, this.f46185d.longValue());
        }
        if (this.f46186e != null) {
            koVar.mo43135a(5, this.f46186e.intValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46182a != null && this.f46182a.length > 0) {
            for (C16499eh ehVar : this.f46182a) {
                if (ehVar != null) {
                    b += C16678ko.m54760b(1, (C16684ku) ehVar);
                }
            }
        }
        if (this.f46183b != null) {
            b += C16678ko.m54761b(2, this.f46183b);
        }
        if (this.f46184c != null) {
            b += C16678ko.m54764c(3, this.f46184c.longValue());
        }
        if (this.f46185d != null) {
            b += C16678ko.m54764c(4, this.f46185d.longValue());
        }
        return this.f46186e != null ? b + C16678ko.m54759b(5, this.f46186e.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = C16687kx.m54816a(kmVar, 10);
                int length = this.f46182a == null ? 0 : this.f46182a.length;
                C16499eh[] ehVarArr = new C16499eh[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46182a, 0, ehVarArr, 0, length);
                }
                while (length < ehVarArr.length - 1) {
                    ehVarArr[length] = new C16499eh();
                    kmVar.mo43115a((C16684ku) ehVarArr[length]);
                    kmVar.mo43113a();
                    length++;
                }
                ehVarArr[length] = new C16499eh();
                kmVar.mo43115a((C16684ku) ehVarArr[length]);
                this.f46182a = ehVarArr;
            } else if (a == 18) {
                this.f46183b = kmVar.mo43122c();
            } else if (a == 24) {
                this.f46184c = Long.valueOf(kmVar.mo43126e());
            } else if (a == 32) {
                this.f46185d = Long.valueOf(kmVar.mo43126e());
            } else if (a == 40) {
                this.f46186e = Integer.valueOf(kmVar.mo43124d());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
