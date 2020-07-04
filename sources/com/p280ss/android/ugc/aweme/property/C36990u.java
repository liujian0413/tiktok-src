package com.p280ss.android.ugc.aweme.property;

import com.C1642a;
import com.google.common.base.C17439m;
import java.lang.Comparable;

/* renamed from: com.ss.android.ugc.aweme.property.u */
public final class C36990u<T extends Comparable<? super T>> {

    /* renamed from: a */
    public final T f96903a;

    /* renamed from: b */
    public final T f96904b;

    public final int hashCode() {
        return m119000a((T[]) new Comparable[]{this.f96903a, this.f96904b});
    }

    public final String toString() {
        return C1642a.m8034a("[%s, %s]", new Object[]{this.f96903a, this.f96904b});
    }

    /* renamed from: a */
    private static <T> int m119000a(T... tArr) {
        int i;
        int i2 = 1;
        for (int i3 = 0; i3 < 2; i3++) {
            T t = tArr[i3];
            if (t == null) {
                i = 0;
            } else {
                i = t.hashCode();
            }
            i2 = ((i2 << 5) - i2) ^ i;
        }
        return i2;
    }

    /* renamed from: a */
    public final boolean mo93412a(T t) {
        boolean z;
        boolean z2;
        C17439m.m57963a(t, (Object) "value must not be null");
        if (t.compareTo(this.f96903a) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (t.compareTo(this.f96904b) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36990u)) {
            return false;
        }
        C36990u uVar = (C36990u) obj;
        if (!this.f96903a.equals(uVar.f96903a) || !this.f96904b.equals(uVar.f96904b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> C36990u<T> m119001a(T t, T t2) {
        return new C36990u<>(t, t2);
    }

    private C36990u(T t, T t2) {
        this.f96903a = (Comparable) C17439m.m57963a(t, (Object) "lower must not be null");
        this.f96904b = (Comparable) C17439m.m57963a(t2, (Object) "upper must not be null");
        if (t.compareTo(t2) > 0) {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
    }
}
