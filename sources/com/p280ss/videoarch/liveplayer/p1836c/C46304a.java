package com.p280ss.videoarch.liveplayer.p1836c;

/* renamed from: com.ss.videoarch.liveplayer.c.a */
public final class C46304a {

    /* renamed from: a */
    public String f118963a;

    /* renamed from: b */
    public String f118964b;

    /* renamed from: c */
    public String f118965c;

    /* renamed from: a */
    public final String mo115056a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118965c);
        sb.append("/?Action=GetStreamPlayInfo&AppId=");
        sb.append(this.f118964b);
        sb.append("&Stream=");
        sb.append(this.f118963a);
        return sb.toString();
    }
}
