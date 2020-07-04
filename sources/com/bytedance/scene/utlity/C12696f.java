package com.bytedance.scene.utlity;

/* renamed from: com.bytedance.scene.utlity.f */
public final class C12696f<F, S> {

    /* renamed from: a */
    public final F f33695a;

    /* renamed from: b */
    public final S f33696b;

    public final int hashCode() {
        return this.f33695a.hashCode() ^ this.f33696b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f33695a));
        sb.append(" ");
        sb.append(String.valueOf(this.f33696b));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12696f)) {
            return false;
        }
        C12696f fVar = (C12696f) obj;
        if (!m36902b(fVar.f33695a, this.f33695a) || !m36902b(fVar.f33696b, this.f33696b)) {
            return false;
        }
        return true;
    }

    private C12696f(F f, S s) {
        this.f33695a = f;
        this.f33696b = s;
    }

    /* renamed from: a */
    public static <A, B> C12696f<A, B> m36901a(A a, B b) {
        return new C12696f<>(a, b);
    }

    /* renamed from: b */
    private static boolean m36902b(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
