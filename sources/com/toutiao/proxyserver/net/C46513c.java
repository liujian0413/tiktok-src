package com.toutiao.proxyserver.net;

/* renamed from: com.toutiao.proxyserver.net.c */
public final class C46513c {

    /* renamed from: a */
    public final String f119833a;

    /* renamed from: b */
    public final String f119834b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpHeader{name='");
        sb.append(this.f119833a);
        sb.append('\'');
        sb.append(", value='");
        sb.append(this.f119834b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C46513c m146208a(String str) {
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            return new C46513c(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
        StringBuilder sb = new StringBuilder("request header format error, header: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public C46513c(String str, String str2) {
        String trim = str.trim();
        String trim2 = str2.trim();
        if (trim.length() == 0 || trim2.length() == 0) {
            throw new IllegalArgumentException("name and value can't be empty");
        }
        this.f119833a = trim;
        this.f119834b = trim2;
    }
}
