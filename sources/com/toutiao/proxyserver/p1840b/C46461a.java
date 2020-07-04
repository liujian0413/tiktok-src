package com.toutiao.proxyserver.p1840b;

/* renamed from: com.toutiao.proxyserver.b.a */
public final class C46461a {

    /* renamed from: a */
    public final String f119725a;

    /* renamed from: b */
    public final String f119726b;

    /* renamed from: c */
    public final int f119727c;

    /* renamed from: d */
    public final int f119728d;

    /* renamed from: e */
    public final String f119729e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoHttpHeaderInfo{key='");
        sb.append(this.f119725a);
        sb.append('\'');
        sb.append(", mime='");
        sb.append(this.f119726b);
        sb.append('\'');
        sb.append(", contentLength=");
        sb.append(this.f119727c);
        sb.append(", flag=");
        sb.append(this.f119728d);
        sb.append(", extra='");
        sb.append(this.f119729e);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C46461a(String str, String str2, int i, int i2, String str3) {
        this.f119725a = str;
        this.f119726b = str2;
        this.f119727c = i;
        this.f119728d = i2;
        this.f119729e = str3;
    }
}
