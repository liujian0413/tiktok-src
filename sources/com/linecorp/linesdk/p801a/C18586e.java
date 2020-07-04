package com.linecorp.linesdk.p801a;

/* renamed from: com.linecorp.linesdk.a.e */
public final class C18586e {

    /* renamed from: a */
    public final String f50221a;

    /* renamed from: b */
    public final long f50222b;

    /* renamed from: c */
    public final long f50223c;

    /* renamed from: d */
    public final String f50224d;

    public final int hashCode() {
        return (((((this.f50221a.hashCode() * 31) + ((int) (this.f50222b ^ (this.f50222b >>> 32)))) * 31) + ((int) (this.f50223c ^ (this.f50223c >>> 32)))) * 31) + this.f50224d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalAccessToken{accessToken='#####', expiresInMillis=");
        sb.append(this.f50222b);
        sb.append(", issuedClientTimeMillis=");
        sb.append(this.f50223c);
        sb.append(", refreshToken='");
        sb.append(this.f50224d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18586e eVar = (C18586e) obj;
        if (this.f50222b == eVar.f50222b && this.f50223c == eVar.f50223c && this.f50221a.equals(eVar.f50221a)) {
            return this.f50224d.equals(eVar.f50224d);
        }
        return false;
    }

    public C18586e(String str, long j, long j2, String str2) {
        this.f50221a = str;
        this.f50222b = j;
        this.f50223c = j2;
        this.f50224d = str2;
    }
}
