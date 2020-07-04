package com.bytedance.apm.p245h;

/* renamed from: com.bytedance.apm.h.j */
public class C9609j {

    /* renamed from: b */
    public long f26296b;

    /* renamed from: c */
    public int f26297c;

    /* renamed from: d */
    public int f26298d;

    /* renamed from: e */
    public int f26299e;

    /* renamed from: f */
    public long f26300f;

    /* renamed from: g */
    public long f26301g;

    public String toString() {
        StringBuilder sb = new StringBuilder("TrafficLogEntity{value=");
        sb.append(this.f26296b);
        sb.append(", netType=");
        sb.append(this.f26297c);
        sb.append(", send=");
        sb.append(this.f26298d);
        sb.append(", front=");
        sb.append(this.f26299e);
        sb.append(", time=");
        sb.append(this.f26300f);
        sb.append(", sid=");
        sb.append(this.f26301g);
        sb.append('}');
        return sb.toString();
    }

    public C9609j(long j, int i, int i2, int i3, long j2) {
        this.f26296b = j;
        this.f26297c = i2;
        this.f26298d = i3;
        this.f26299e = i;
        this.f26300f = j2;
    }

    public C9609j(long j, int i, int i2, int i3, long j2, long j3) {
        this.f26296b = j;
        this.f26297c = i2;
        this.f26298d = i3;
        this.f26299e = i;
        this.f26300f = j2;
        this.f26301g = j3;
    }
}
