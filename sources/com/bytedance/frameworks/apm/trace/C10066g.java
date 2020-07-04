package com.bytedance.frameworks.apm.trace;

/* renamed from: com.bytedance.frameworks.apm.trace.g */
public final class C10066g {

    /* renamed from: a */
    public Type f27391a;

    /* renamed from: b */
    public String f27392b;

    /* renamed from: c */
    public String f27393c;

    /* renamed from: d */
    public String f27394d;

    /* renamed from: e */
    public long f27395e;

    /* renamed from: f */
    public long f27396f;

    /* renamed from: g */
    public long f27397g;

    /* renamed from: h */
    public int f27398h;

    /* renamed from: com.bytedance.frameworks.apm.trace.g$a */
    public interface C10067a {
        /* renamed from: a */
        void mo23975a(C10066g gVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("stackType=");
        sb.append(this.f27391a.name());
        sb.append(",keyStack=");
        sb.append(this.f27392b);
        sb.append(",detailStack=");
        sb.append(this.f27393c);
        sb.append(",happenTime=");
        sb.append(this.f27395e);
        sb.append(",scene=");
        sb.append(this.f27394d);
        sb.append(",costTime=");
        sb.append(this.f27396f);
        sb.append(",cpuDuration=");
        sb.append(this.f27397g);
        sb.append(",stackCostTime=");
        sb.append(this.f27398h);
        sb.append(",");
        return sb.toString();
    }
}
