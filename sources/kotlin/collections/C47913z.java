package kotlin.collections;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.z */
public final class C47913z<T> {

    /* renamed from: a */
    public final int f122770a;

    /* renamed from: b */
    public final T f122771b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47913z) {
                C47913z zVar = (C47913z) obj;
                if (!(this.f122770a == zVar.f122770a) || !C7573i.m23585a((Object) this.f122771b, (Object) zVar.f122771b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f122770a * 31;
        T t = this.f122771b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.f122770a);
        sb.append(", value=");
        sb.append(this.f122771b);
        sb.append(")");
        return sb.toString();
    }

    public C47913z(int i, T t) {
        this.f122770a = i;
        this.f122771b = t;
    }
}
