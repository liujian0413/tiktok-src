package androidx.work;

import android.os.Build.VERSION;

/* renamed from: androidx.work.c */
public final class C1454c {

    /* renamed from: a */
    public static final C1454c f5656a = new C1455a().mo6684a();

    /* renamed from: b */
    public NetworkType f5657b;

    /* renamed from: c */
    public boolean f5658c;

    /* renamed from: d */
    public boolean f5659d;

    /* renamed from: e */
    public boolean f5660e;

    /* renamed from: f */
    public boolean f5661f;

    /* renamed from: g */
    public C1456d f5662g;

    /* renamed from: androidx.work.c$a */
    public static final class C1455a {

        /* renamed from: a */
        boolean f5663a;

        /* renamed from: b */
        boolean f5664b;

        /* renamed from: c */
        NetworkType f5665c = NetworkType.NOT_REQUIRED;

        /* renamed from: d */
        boolean f5666d;

        /* renamed from: e */
        boolean f5667e;

        /* renamed from: f */
        C1456d f5668f = new C1456d();

        /* renamed from: a */
        public final C1454c mo6684a() {
            return new C1454c(this);
        }
    }

    public C1454c() {
    }

    /* renamed from: a */
    public final boolean mo6681a() {
        if (this.f5662g == null || this.f5662g.mo6685a() <= 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.f5657b.hashCode() * 31) + (this.f5658c ? 1 : 0)) * 31) + (this.f5659d ? 1 : 0)) * 31) + (this.f5660e ? 1 : 0)) * 31) + (this.f5661f ? 1 : 0)) * 31;
        if (this.f5662g != null) {
            i = this.f5662g.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    C1454c(C1455a aVar) {
        boolean z;
        C1456d dVar;
        this.f5658c = aVar.f5663a;
        if (VERSION.SDK_INT < 23 || !aVar.f5664b) {
            z = false;
        } else {
            z = true;
        }
        this.f5659d = z;
        this.f5657b = aVar.f5665c;
        this.f5660e = aVar.f5666d;
        this.f5661f = aVar.f5667e;
        if (VERSION.SDK_INT >= 24) {
            dVar = aVar.f5668f;
        } else {
            dVar = new C1456d();
        }
        this.f5662g = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1454c cVar = (C1454c) obj;
        if (this.f5657b == cVar.f5657b && this.f5658c == cVar.f5658c && this.f5659d == cVar.f5659d && this.f5660e == cVar.f5660e && this.f5661f == cVar.f5661f && (this.f5662g == null ? cVar.f5662g == null : this.f5662g.equals(cVar.f5662g))) {
            return true;
        }
        return false;
    }
}
