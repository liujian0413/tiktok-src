package com.p280ss.android.p294e.p871c;

import com.p280ss.android.p294e.p870b.C19539b;

/* renamed from: com.ss.android.e.c.c */
public final class C19543c {

    /* renamed from: a */
    public String f52857a;

    /* renamed from: b */
    public C19539b f52858b;

    /* renamed from: c */
    public int f52859c;

    /* renamed from: d */
    public long f52860d;

    /* renamed from: e */
    public long f52861e;

    /* renamed from: f */
    public String f52862f;

    /* renamed from: g */
    public Exception f52863g;

    /* renamed from: h */
    public boolean f52864h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedMonitor{url='");
        sb.append(this.f52857a);
        sb.append('\'');
        sb.append(", host=");
        sb.append(this.f52858b.toString());
        sb.append(", status=");
        sb.append(this.f52859c);
        sb.append(", duration=");
        sb.append(this.f52860d);
        sb.append(", sendTime=");
        sb.append(this.f52861e);
        sb.append(", traceCode='");
        sb.append(this.f52862f);
        sb.append('\'');
        sb.append(", exception=");
        sb.append(this.f52863g);
        sb.append(", isSuccess=");
        sb.append(this.f52864h);
        sb.append('}');
        return sb.toString();
    }

    public C19543c(String str, C19539b bVar, int i, long j, long j2, String str2, Exception exc, boolean z) {
        this.f52857a = str;
        this.f52858b = bVar;
        this.f52859c = i;
        this.f52860d = j;
        this.f52861e = j2;
        this.f52862f = str2;
        this.f52863g = exc;
        this.f52864h = z;
    }
}
