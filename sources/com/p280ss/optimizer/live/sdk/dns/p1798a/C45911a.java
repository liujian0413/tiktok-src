package com.p280ss.optimizer.live.sdk.dns.p1798a;

/* renamed from: com.ss.optimizer.live.sdk.dns.a.a */
public final class C45911a {

    /* renamed from: a */
    public final int f117364a;

    /* renamed from: b */
    public final long f117365b;

    /* renamed from: c */
    public final float f117366c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("{\"Seq\":");
        sb.append(this.f117364a);
        sb.append(",\"TTL\":");
        sb.append(this.f117365b);
        sb.append(",\"Time\":");
        sb.append(this.f117366c);
        sb.append("}");
        return sb.toString();
    }

    public C45911a(int i, long j, float f) {
        this.f117364a = i;
        this.f117365b = j;
        this.f117366c = f;
    }
}
