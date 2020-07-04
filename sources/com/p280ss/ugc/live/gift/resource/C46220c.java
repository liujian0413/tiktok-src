package com.p280ss.ugc.live.gift.resource;

import java.util.Arrays;

/* renamed from: com.ss.ugc.live.gift.resource.c */
public final class C46220c {

    /* renamed from: a */
    public final long f118812a;

    /* renamed from: b */
    public final String[] f118813b;

    /* renamed from: c */
    public long f118814c;

    /* renamed from: d */
    public String f118815d;

    /* renamed from: e */
    public boolean f118816e;

    /* renamed from: f */
    public boolean f118817f;

    /* renamed from: g */
    public int f118818g = -1;

    /* renamed from: a */
    public final String mo114170a() {
        return this.f118813b[0];
    }

    /* renamed from: c */
    public final void mo114172c() {
        this.f118818g++;
    }

    /* renamed from: b */
    public final String mo114171b() {
        return this.f118813b[Math.min(this.f118818g, this.f118813b.length - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetResourceRequest{mId=");
        sb.append(this.f118812a);
        sb.append(", mUrls='");
        sb.append(Arrays.toString(this.f118813b));
        sb.append('\'');
        sb.append(", mMd5='");
        sb.append(this.f118815d);
        sb.append('\'');
        sb.append(", mSourceFrom='");
        sb.append(this.f118814c);
        sb.append('\'');
        sb.append(", mNeedToUnzip=");
        sb.append(this.f118816e);
        sb.append('}');
        return sb.toString();
    }

    public C46220c(long j, String[] strArr, String str, long j2, boolean z) {
        this.f118812a = j;
        this.f118813b = strArr;
        this.f118815d = str;
        this.f118814c = j2;
        this.f118816e = true;
    }
}
