package com.bytedance.android.livesdk.app.dataholder;

import com.bytedance.android.livesdkapi.depend.model.C9355c;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.e */
public final class C3913e extends C3909a<Integer> {

    /* renamed from: n */
    private static C3913e f11716n;

    /* renamed from: c */
    public long f11717c;

    /* renamed from: d */
    public boolean f11718d;

    /* renamed from: e */
    public long f11719e;

    /* renamed from: f */
    public boolean f11720f;

    /* renamed from: g */
    public int f11721g;

    /* renamed from: h */
    public C9355c f11722h;

    /* renamed from: i */
    public String f11723i;

    /* renamed from: j */
    public boolean f11724j;

    /* renamed from: k */
    public int f11725k;

    /* renamed from: l */
    public int f11726l;

    /* renamed from: m */
    public int f11727m;

    /* renamed from: o */
    private long f11728o;

    private C3913e() {
        this.f11699b = Integer.valueOf(0);
    }

    /* renamed from: a */
    public static C3913e m13800a() {
        if (f11716n == null) {
            f11716n = new C3913e();
        }
        return f11716n;
    }

    /* renamed from: b */
    public final long mo11459b() {
        long j = this.f11728o;
        this.f11717c += this.f11728o;
        this.f11728o = 0;
        return j;
    }

    /* renamed from: c */
    public final void mo11460c() {
        this.f11699b = Integer.valueOf(0);
        this.f11718d = false;
        this.f11728o = 0;
        this.f11717c = 0;
        this.f11719e = 0;
        this.f11720f = false;
        this.f11721g = 0;
        this.f11722h = null;
        this.f11723i = null;
        this.f11724j = false;
        this.f11725k = 0;
        this.f11726l = 0;
    }

    /* renamed from: a */
    public final void mo11457a(long j) {
        if (j > this.f11728o) {
            this.f11728o = j;
        }
    }

    /* renamed from: a */
    public final void mo11452a(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() <= 2) {
            if (2 == num.intValue()) {
                this.f11718d = true;
            }
            super.mo11452a(num);
        }
    }
}
