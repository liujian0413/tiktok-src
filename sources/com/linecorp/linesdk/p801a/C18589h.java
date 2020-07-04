package com.linecorp.linesdk.p801a;

/* renamed from: com.linecorp.linesdk.a.h */
public final class C18589h {

    /* renamed from: a */
    public final String f50229a;

    /* renamed from: b */
    public final long f50230b;

    /* renamed from: c */
    public final String f50231c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefreshTokenResult{accessToken='#####', expiresInMillis=");
        sb.append(this.f50230b);
        sb.append(", refreshToken='#####'}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f50229a.hashCode() * 31) + ((int) (this.f50230b ^ (this.f50230b >>> 32)))) * 31;
        if (this.f50231c != null) {
            i = this.f50231c.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18589h hVar = (C18589h) obj;
        if (this.f50230b != hVar.f50230b || !this.f50229a.equals(hVar.f50229a)) {
            return false;
        }
        if (this.f50231c != null) {
            return this.f50231c.equals(hVar.f50231c);
        }
        if (hVar.f50231c == null) {
            return true;
        }
        return false;
    }

    public C18589h(String str, long j, String str2) {
        this.f50229a = str;
        this.f50230b = j;
        this.f50231c = str2;
    }
}
