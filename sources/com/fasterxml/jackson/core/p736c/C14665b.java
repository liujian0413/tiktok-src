package com.fasterxml.jackson.core.p736c;

/* renamed from: com.fasterxml.jackson.core.c.b */
public final class C14665b {

    /* renamed from: a */
    static final C14665b f37904a = new C14665b();

    /* renamed from: b */
    protected C14665b f37905b;

    /* renamed from: c */
    public final int f37906c;

    /* renamed from: d */
    protected final boolean f37907d;

    /* renamed from: e */
    protected final boolean f37908e;

    /* renamed from: f */
    protected String[] f37909f;

    /* renamed from: g */
    protected C14666a[] f37910g;

    /* renamed from: h */
    public int f37911h;

    /* renamed from: i */
    protected int f37912i;

    /* renamed from: j */
    protected int f37913j;

    /* renamed from: k */
    public int f37914k;

    /* renamed from: l */
    public boolean f37915l;

    /* renamed from: com.fasterxml.jackson.core.c.b$a */
    static final class C14666a {
    }

    /* renamed from: c */
    private static int m42427c(int i) {
        return i - (i >> 2);
    }

    private C14665b() {
        this.f37908e = true;
        this.f37907d = true;
        this.f37915l = true;
        m42426b(64);
    }

    /* renamed from: a */
    public static C14665b m42423a() {
        long currentTimeMillis = System.currentTimeMillis();
        return m42424a((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: b */
    public final void mo37159b() {
        if (this.f37915l && this.f37905b != null) {
            this.f37905b.m42425a(this);
            this.f37915l = false;
        }
    }

    /* renamed from: a */
    private static C14665b m42424a(int i) {
        return f37904a.m42428d(i);
    }

    /* renamed from: b */
    private void m42426b(int i) {
        this.f37909f = new String[64];
        this.f37910g = new C14666a[32];
        this.f37913j = 63;
        this.f37911h = 0;
        this.f37914k = 0;
        this.f37912i = m42427c(64);
    }

    /* renamed from: d */
    private C14665b m42428d(int i) {
        C14665b bVar = new C14665b(null, true, true, this.f37909f, this.f37910g, this.f37911h, i, this.f37914k);
        return bVar;
    }

    /* renamed from: a */
    private void m42425a(C14665b bVar) {
        if (bVar.f37911h > 12000 || bVar.f37914k > 63) {
            synchronized (this) {
                m42426b(64);
                this.f37915l = false;
            }
        } else if (bVar.f37911h > this.f37911h) {
            synchronized (this) {
                this.f37909f = bVar.f37909f;
                this.f37910g = bVar.f37910g;
                this.f37911h = bVar.f37911h;
                this.f37912i = bVar.f37912i;
                this.f37913j = bVar.f37913j;
                this.f37914k = bVar.f37914k;
                this.f37915l = false;
            }
        }
    }

    /* renamed from: a */
    public final C14665b mo37158a(boolean z, boolean z2) {
        String[] strArr;
        C14666a[] aVarArr;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            strArr = this.f37909f;
            aVarArr = this.f37910g;
            i = this.f37911h;
            i2 = this.f37906c;
            i3 = this.f37914k;
        }
        C14665b bVar = new C14665b(this, z, z2, strArr, aVarArr, i, i2, i3);
        return bVar;
    }

    private C14665b(C14665b bVar, boolean z, boolean z2, String[] strArr, C14666a[] aVarArr, int i, int i2, int i3) {
        this.f37905b = bVar;
        this.f37908e = z;
        this.f37907d = z2;
        this.f37909f = strArr;
        this.f37910g = aVarArr;
        this.f37911h = i;
        this.f37906c = i2;
        int length = strArr.length;
        this.f37912i = m42427c(length);
        this.f37913j = length - 1;
        this.f37914k = i3;
        this.f37915l = false;
    }
}
