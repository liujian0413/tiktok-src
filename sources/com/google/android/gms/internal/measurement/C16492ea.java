package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ea */
public final class C16492ea extends C16679kp<C16492ea> {

    /* renamed from: a */
    public Integer f46153a;

    /* renamed from: b */
    public String f46154b;

    /* renamed from: c */
    public Boolean f46155c;

    /* renamed from: d */
    public String[] f46156d;

    public C16492ea() {
        this.f46153a = null;
        this.f46154b = null;
        this.f46155c = null;
        this.f46156d = C16687kx.f46613c;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16492ea)) {
            return false;
        }
        C16492ea eaVar = (C16492ea) obj;
        if (this.f46153a == null) {
            if (eaVar.f46153a != null) {
                return false;
            }
        } else if (!this.f46153a.equals(eaVar.f46153a)) {
            return false;
        }
        if (this.f46154b == null) {
            if (eaVar.f46154b != null) {
                return false;
            }
        } else if (!this.f46154b.equals(eaVar.f46154b)) {
            return false;
        }
        if (this.f46155c == null) {
            if (eaVar.f46155c != null) {
                return false;
            }
        } else if (!this.f46155c.equals(eaVar.f46155c)) {
            return false;
        }
        if (!C16683kt.m54806a((Object[]) this.f46156d, (Object[]) eaVar.f46156d)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return eaVar.f46593L == null || eaVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(eaVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46153a == null ? 0 : this.f46153a.intValue())) * 31) + (this.f46154b == null ? 0 : this.f46154b.hashCode())) * 31) + (this.f46155c == null ? 0 : this.f46155c.hashCode())) * 31) + C16683kt.m54802a((Object[]) this.f46156d)) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46153a != null) {
            koVar.mo43135a(1, this.f46153a.intValue());
        }
        if (this.f46154b != null) {
            koVar.mo43139a(2, this.f46154b);
        }
        if (this.f46155c != null) {
            koVar.mo43140a(3, this.f46155c.booleanValue());
        }
        if (this.f46156d != null && this.f46156d.length > 0) {
            for (String str : this.f46156d) {
                if (str != null) {
                    koVar.mo43139a(4, str);
                }
            }
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46153a != null) {
            b += C16678ko.m54759b(1, this.f46153a.intValue());
        }
        if (this.f46154b != null) {
            b += C16678ko.m54761b(2, this.f46154b);
        }
        if (this.f46155c != null) {
            this.f46155c.booleanValue();
            b += C16678ko.m54758b(3) + 1;
        }
        if (this.f46156d == null || this.f46156d.length <= 0) {
            return b;
        }
        int i = 0;
        int i2 = 0;
        for (String str : this.f46156d) {
            if (str != null) {
                i2++;
                i += C16678ko.m54754a(str);
            }
        }
        return b + i + (i2 * 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C16492ea mo42654a(C16676km kmVar) throws IOException {
        int d;
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = kmVar.mo43124d();
                    if (d < 0 || d > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(d);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.f46153a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    kmVar.mo43125d(kmVar.mo43130i());
                    mo43146a(kmVar, a);
                }
            } else if (a == 18) {
                this.f46154b = kmVar.mo43122c();
            } else if (a == 24) {
                this.f46155c = Boolean.valueOf(kmVar.mo43121b());
            } else if (a == 34) {
                int a2 = C16687kx.m54816a(kmVar, 34);
                int length = this.f46156d == null ? 0 : this.f46156d.length;
                String[] strArr = new String[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46156d, 0, strArr, 0, length);
                }
                while (length < strArr.length - 1) {
                    strArr[length] = kmVar.mo43122c();
                    kmVar.mo43113a();
                    length++;
                }
                strArr[length] = kmVar.mo43122c();
                this.f46156d = strArr;
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(d);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
