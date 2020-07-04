package com.p280ss.android.p294e.p870b;

/* renamed from: com.ss.android.e.b.b */
public final class C19539b extends C19538a {

    /* renamed from: d */
    public String f52851d;

    /* renamed from: e */
    public String f52852e;

    /* renamed from: f */
    public long f52853f;

    /* renamed from: g */
    public long f52854g;

    /* renamed from: h */
    public final long mo51685h() {
        return this.f52854g + this.f52853f;
    }

    /* renamed from: g */
    public final String mo51682g() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52852e);
        sb.append("://");
        sb.append(this.f52851d);
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Host{weightTime=");
        sb.append(this.f52853f);
        sb.append(", schema='");
        sb.append(this.f52852e);
        sb.append('\'');
        sb.append(", host='");
        sb.append(this.f52851d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo51684a(C19539b bVar) {
        if (bVar != null && bVar.f52851d.equals(this.f52851d) && bVar.f52852e.equals(this.f52852e)) {
            return true;
        }
        return false;
    }

    public C19539b(String str, String str2) {
        this.f52851d = str;
        this.f52852e = str2;
    }

    public C19539b(String str, String str2, long j) {
        this.f52851d = str;
        this.f52852e = str2;
        this.f52853f = j;
    }
}
