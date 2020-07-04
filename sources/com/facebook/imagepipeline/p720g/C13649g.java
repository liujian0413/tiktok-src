package com.facebook.imagepipeline.p720g;

/* renamed from: com.facebook.imagepipeline.g.g */
public final class C13649g implements C13650h {

    /* renamed from: a */
    public static final C13650h f36269a = m40258a(Integer.MAX_VALUE, true, true);

    /* renamed from: b */
    int f36270b;

    /* renamed from: c */
    boolean f36271c;

    /* renamed from: d */
    boolean f36272d;

    /* renamed from: a */
    public final int mo33283a() {
        return this.f36270b;
    }

    /* renamed from: b */
    public final boolean mo33284b() {
        return this.f36271c;
    }

    /* renamed from: c */
    public final boolean mo33285c() {
        return this.f36272d;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f36270b;
        int i3 = 0;
        if (this.f36271c) {
            i = 4194304;
        } else {
            i = 0;
        }
        int i4 = i2 ^ i;
        if (this.f36272d) {
            i3 = 8388608;
        }
        return i4 ^ i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13649g)) {
            return false;
        }
        C13649g gVar = (C13649g) obj;
        if (this.f36270b == gVar.f36270b && this.f36271c == gVar.f36271c && this.f36272d == gVar.f36272d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C13650h m40258a(int i, boolean z, boolean z2) {
        return new C13649g(i, z, z2);
    }

    private C13649g(int i, boolean z, boolean z2) {
        this.f36270b = i;
        this.f36271c = z;
        this.f36272d = z2;
    }
}
