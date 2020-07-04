package com.bytedance.apm.util;

/* renamed from: com.bytedance.apm.util.n */
public final class C9650n<F, S> {

    /* renamed from: a */
    public final F f26366a;

    /* renamed from: b */
    public final S f26367b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f26366a == null) {
            i = 0;
        } else {
            i = this.f26366a.hashCode();
        }
        if (this.f26367b != null) {
            i2 = this.f26367b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f26366a));
        sb.append(" ");
        sb.append(this.f26367b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9650n)) {
            return false;
        }
        C9650n nVar = (C9650n) obj;
        if (!C9647m.m28537a(nVar.f26366a, this.f26366a) || !C9647m.m28537a(nVar.f26367b, this.f26367b)) {
            return false;
        }
        return true;
    }

    public C9650n(F f, S s) {
        this.f26366a = f;
        this.f26367b = s;
    }
}
