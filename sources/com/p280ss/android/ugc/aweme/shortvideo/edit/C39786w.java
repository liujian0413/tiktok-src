package com.p280ss.android.ugc.aweme.shortvideo.edit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.w */
public final class C39786w<F, S, T> {

    /* renamed from: a */
    public final F f103419a;

    /* renamed from: b */
    public final S f103420b;

    /* renamed from: c */
    public final T f103421c;

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f103419a == null) {
            i = 0;
        } else {
            i = this.f103419a.hashCode();
        }
        if (this.f103420b == null) {
            i2 = 0;
        } else {
            i2 = this.f103420b.hashCode();
        }
        int i4 = i ^ i2;
        if (this.f103421c != null) {
            i3 = this.f103421c.hashCode();
        }
        return i4 ^ i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39786w)) {
            return false;
        }
        C39786w wVar = (C39786w) obj;
        if (!m127397a(wVar.f103419a, this.f103419a) || !m127397a(wVar.f103420b, this.f103420b) || !m127397a(wVar.f103421c, this.f103421c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m127397a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <A, B, C> C39786w<A, B, C> m127396a(A a, B b, C c) {
        return new C39786w<>(a, b, c);
    }

    private C39786w(F f, S s, T t) {
        this.f103419a = f;
        this.f103420b = s;
        this.f103421c = t;
    }
}
