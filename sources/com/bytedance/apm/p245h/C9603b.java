package com.bytedance.apm.p245h;

/* renamed from: com.bytedance.apm.h.b */
public final class C9603b {

    /* renamed from: a */
    public long f26256a;

    /* renamed from: b */
    public boolean f26257b;

    /* renamed from: c */
    public long f26258c;

    /* renamed from: d */
    public String f26259d;

    /* renamed from: e */
    public boolean f26260e;

    /* renamed from: f */
    public String f26261f;

    /* renamed from: g */
    public long f26262g;

    /* renamed from: h */
    public String f26263h;

    /* renamed from: i */
    public long f26264i;

    /* renamed from: j */
    public String f26265j;

    /* renamed from: k */
    public boolean f26266k;

    /* renamed from: l */
    public String f26267l;

    /* renamed from: m */
    public boolean f26268m;

    public C9603b() {
    }

    /* renamed from: a */
    public final boolean mo23950a() {
        if (!this.f26257b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo23951b() {
        if (!this.f26260e) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatteryLogEntity{id=");
        sb.append(this.f26256a);
        sb.append(", front=");
        sb.append(this.f26257b);
        sb.append(", time=");
        sb.append(this.f26258c);
        sb.append(", type='");
        sb.append(this.f26259d);
        sb.append('\'');
        sb.append(", status=");
        sb.append(this.f26260e);
        sb.append(", scene='");
        sb.append(this.f26261f);
        sb.append('\'');
        sb.append(", accumulation=");
        sb.append(this.f26262g);
        sb.append(", source='");
        sb.append(this.f26263h);
        sb.append('\'');
        sb.append(", versionId=");
        sb.append(this.f26264i);
        sb.append(", processName='");
        sb.append(this.f26265j);
        sb.append('\'');
        sb.append(", mainProcess=");
        sb.append(this.f26266k);
        sb.append(", startUuid='");
        sb.append(this.f26267l);
        sb.append('\'');
        sb.append(", deleteFlag=");
        sb.append(this.f26268m);
        sb.append('}');
        return sb.toString();
    }

    public C9603b(boolean z, long j) {
        this.f26257b = z;
        this.f26258c = j;
    }

    public C9603b(boolean z, long j, String str, long j2) {
        this.f26257b = z;
        this.f26258c = j;
        this.f26259d = str;
        this.f26262g = j2;
    }

    public C9603b(boolean z, long j, String str, boolean z2) {
        this.f26257b = z;
        this.f26258c = j;
        this.f26259d = str;
        this.f26260e = z2;
    }

    public C9603b(boolean z, long j, String str, boolean z2, String str2, long j2, String str3) {
        this.f26257b = z;
        this.f26258c = j;
        this.f26259d = str;
        this.f26260e = z2;
        this.f26261f = str2;
        this.f26262g = j2;
        this.f26263h = str3;
    }
}
