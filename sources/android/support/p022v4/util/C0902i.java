package android.support.p022v4.util;

/* renamed from: android.support.v4.util.i */
public final class C0902i<F, S> {

    /* renamed from: a */
    public final F f3154a;

    /* renamed from: b */
    public final S f3155b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f3154a == null) {
            i = 0;
        } else {
            i = this.f3154a.hashCode();
        }
        if (this.f3155b != null) {
            i2 = this.f3155b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f3154a));
        sb.append(" ");
        sb.append(String.valueOf(this.f3155b));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0902i)) {
            return false;
        }
        C0902i iVar = (C0902i) obj;
        if (!C0901h.m3836a(iVar.f3154a, this.f3154a) || !C0901h.m3836a(iVar.f3155b, this.f3155b)) {
            return false;
        }
        return true;
    }

    public C0902i(F f, S s) {
        this.f3154a = f;
        this.f3155b = s;
    }

    /* renamed from: a */
    public static <A, B> C0902i<A, B> m3837a(A a, B b) {
        return new C0902i<>(a, b);
    }
}
