package com.p280ss.android.ugc.aweme.shortvideo.p1557d;

import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d.f */
public class C39328f {

    /* renamed from: a */
    public int f102147a;

    /* renamed from: b */
    public int f102148b;

    /* renamed from: c */
    public int f102149c;

    /* renamed from: d */
    public Object f102150d;

    /* renamed from: e */
    public String f102151e;

    /* renamed from: f */
    public boolean f102152f;

    /* renamed from: g */
    public boolean f102153g;

    /* renamed from: h */
    public C38455ap f102154h;

    /* renamed from: i */
    public boolean f102155i;

    /* renamed from: j */
    public String f102156j;

    public String toString() {
        StringBuilder sb = new StringBuilder("PublishStatus{status=");
        sb.append(this.f102148b);
        sb.append(", progress=");
        sb.append(this.f102149c);
        sb.append(", params=");
        sb.append(this.f102150d);
        sb.append('}');
        return sb.toString();
    }

    public C39328f(int i) {
        this.f102148b = 2;
    }

    public C39328f(int i, int i2, Object obj) {
        this(10, 100, obj, null);
    }

    public C39328f(int i, int i2, Object obj, String str) {
        this.f102150d = obj;
        this.f102149c = i2;
        this.f102148b = i;
        this.f102151e = str;
    }
}
