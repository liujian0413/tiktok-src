package com.p280ss.android.http.legacy.p296a;

import com.p280ss.android.http.legacy.C19568b;
import com.p280ss.android.http.legacy.C19572d;
import com.p280ss.android.http.legacy.p877d.C19574b;
import com.p280ss.android.http.legacy.p877d.C19576d;

/* renamed from: com.ss.android.http.legacy.a.b */
public final class C19562b implements C19568b, Cloneable {

    /* renamed from: a */
    private final String f52933a;

    /* renamed from: b */
    private final String f52934b;

    /* renamed from: c */
    private final C19572d[] f52935c;

    /* renamed from: a */
    public final String mo51713a() {
        return this.f52933a;
    }

    /* renamed from: b */
    public final String mo51714b() {
        return this.f52934b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: c */
    public final C19572d[] mo51715c() {
        return (C19572d[]) this.f52935c.clone();
    }

    public final int hashCode() {
        int a = C19576d.m64494a(C19576d.m64494a(17, (Object) this.f52933a), (Object) this.f52934b);
        for (C19572d a2 : this.f52935c) {
            a = C19576d.m64494a(a, (Object) a2);
        }
        return a;
    }

    public final String toString() {
        C19574b bVar = new C19574b(64);
        bVar.mo51739a(this.f52933a);
        if (this.f52934b != null) {
            bVar.mo51739a("=");
            bVar.mo51739a(this.f52934b);
        }
        for (C19572d a : this.f52935c) {
            bVar.mo51739a("; ");
            bVar.mo51738a((Object) a);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19568b)) {
            return false;
        }
        C19562b bVar = (C19562b) obj;
        if (!this.f52933a.equals(bVar.f52933a) || !C19576d.m64495a((Object) this.f52934b, (Object) bVar.f52934b) || !C19576d.m64496a((Object[]) this.f52935c, (Object[]) bVar.f52935c)) {
            return false;
        }
        return true;
    }

    public C19562b(String str, String str2, C19572d[] dVarArr) {
        if (str != null) {
            this.f52933a = str;
            this.f52934b = str2;
            if (dVarArr != null) {
                this.f52935c = dVarArr;
            } else {
                this.f52935c = new C19572d[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }
}
