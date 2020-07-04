package com.p280ss.android.ugc.aweme.livewallpaper.egl;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.e */
public class C32584e {

    /* renamed from: e */
    private static int f84946e = 12375;

    /* renamed from: f */
    private static int f84947f = 12374;

    /* renamed from: a */
    protected C32583d f84948a;

    /* renamed from: b */
    private Object f84949b;

    /* renamed from: c */
    private int f84950c = -1;

    /* renamed from: d */
    private int f84951d = -1;

    /* renamed from: d */
    public final void mo83891d() {
        this.f84948a.mo83882c(this.f84949b);
    }

    /* renamed from: c */
    public final void mo83890c() {
        this.f84948a.mo83879a(this.f84949b);
        this.f84949b = null;
        this.f84950c = -1;
        this.f84951d = -1;
    }

    /* renamed from: e */
    public final boolean mo83892e() {
        return this.f84948a.mo83883d(this.f84949b);
    }

    /* renamed from: a */
    public final int mo83885a() {
        if (this.f84950c < 0) {
            return this.f84948a.mo83876a(this.f84949b, f84946e);
        }
        return this.f84950c;
    }

    /* renamed from: b */
    public final int mo83889b() {
        if (this.f84951d < 0) {
            return this.f84948a.mo83876a(this.f84949b, f84947f);
        }
        return this.f84951d;
    }

    /* renamed from: a */
    public final void mo83887a(long j) {
        this.f84948a.mo83880a(this.f84949b, j);
    }

    protected C32584e(C32583d dVar) {
        this.f84948a = dVar;
    }

    /* renamed from: a */
    public final void mo83888a(Object obj) {
        if (this.f84949b == null) {
            this.f84949b = this.f84948a.mo83881b(obj);
            return;
        }
        throw new IllegalStateException("surface already created");
    }

    /* renamed from: a */
    public final void mo83886a(int i, int i2) {
        if (this.f84949b == null) {
            this.f84949b = this.f84948a.mo83877a(i, i2);
            this.f84950c = i;
            this.f84951d = i2;
            return;
        }
        throw new IllegalStateException("surface already created");
    }
}
