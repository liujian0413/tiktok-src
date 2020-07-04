package com.google.android.gms.internal.ads;

@C6505uv
public final class anv {

    /* renamed from: a */
    public final int f40775a;

    /* renamed from: b */
    public final int f40776b;

    /* renamed from: c */
    private final int f40777c;

    /* renamed from: a */
    public static anv m46664a(zzyz zzyz) {
        if (zzyz.f45801d) {
            return new anv(3, 0, 0);
        }
        if (zzyz.f45806i) {
            return new anv(2, 0, 0);
        }
        if (zzyz.f45805h) {
            return m46662a();
        }
        return m46663a(zzyz.f45803f, zzyz.f45800c);
    }

    /* renamed from: a */
    public static anv m46662a() {
        return new anv(0, 0, 0);
    }

    /* renamed from: a */
    public static anv m46663a(int i, int i2) {
        return new anv(1, i, i2);
    }

    /* renamed from: b */
    public static anv m46665b() {
        return new anv(4, 0, 0);
    }

    /* renamed from: c */
    public static anv m46666c() {
        return new anv(5, 0, 0);
    }

    private anv(int i, int i2, int i3) {
        this.f40777c = i;
        this.f40776b = i2;
        this.f40775a = i3;
    }

    /* renamed from: d */
    public final boolean mo39848d() {
        return this.f40777c == 2;
    }

    /* renamed from: e */
    public final boolean mo39849e() {
        return this.f40777c == 3;
    }

    /* renamed from: f */
    public final boolean mo39850f() {
        return this.f40777c == 0;
    }

    /* renamed from: g */
    public final boolean mo39851g() {
        return this.f40777c == 4;
    }

    /* renamed from: h */
    public final boolean mo39852h() {
        return this.f40777c == 5;
    }
}
