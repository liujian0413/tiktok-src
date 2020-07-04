package androidx.work.impl.p036b;

/* renamed from: androidx.work.impl.b.d */
public final class C1496d {

    /* renamed from: a */
    public final String f5726a;

    /* renamed from: b */
    public final int f5727b;

    public final int hashCode() {
        return (this.f5726a.hashCode() * 31) + this.f5727b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1496d dVar = (C1496d) obj;
        if (this.f5727b != dVar.f5727b) {
            return false;
        }
        return this.f5726a.equals(dVar.f5726a);
    }

    public C1496d(String str, int i) {
        this.f5726a = str;
        this.f5727b = i;
    }
}
