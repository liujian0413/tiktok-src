package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.primitives.c */
public final class C18143c {

    /* renamed from: com.google.common.primitives.c$a */
    static class C18144a extends AbstractList<Integer> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final int[] f49505a;

        /* renamed from: b */
        final int f49506b;

        /* renamed from: c */
        final int f49507c;

        public final boolean isEmpty() {
            return false;
        }

        public final int size() {
            return this.f49507c - this.f49506b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int[] mo46903a() {
            return Arrays.copyOfRange(this.f49505a, this.f49506b, this.f49507c);
        }

        public final int hashCode() {
            int i = 1;
            for (int i2 = this.f49506b; i2 < this.f49507c; i2++) {
                i = (i * 31) + C18143c.m59965a(this.f49505a[i2]);
            }
            return i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f49505a[this.f49506b]);
            int i = this.f49506b;
            while (true) {
                i++;
                if (i < this.f49507c) {
                    sb.append(", ");
                    sb.append(this.f49505a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Integer get(int i) {
            C17439m.m57960a(i, size());
            return Integer.valueOf(this.f49505a[this.f49506b + i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer) || C18143c.m59968a(this.f49505a, ((Integer) obj).intValue(), this.f49506b, this.f49507c) == -1) {
                return false;
            }
            return true;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int a = C18143c.m59968a(this.f49505a, ((Integer) obj).intValue(), this.f49506b, this.f49507c);
                if (a >= 0) {
                    return a - this.f49506b;
                }
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int b = C18143c.m59971b(this.f49505a, ((Integer) obj).intValue(), this.f49506b, this.f49507c);
                if (b >= 0) {
                    return b - this.f49506b;
                }
            }
            return -1;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C18144a)) {
                return super.equals(obj);
            }
            C18144a aVar = (C18144a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f49505a[this.f49506b + i] != aVar.f49505a[aVar.f49506b + i]) {
                    return false;
                }
            }
            return true;
        }

        public final List<Integer> subList(int i, int i2) {
            C17439m.m57967a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            return new C18144a(this.f49505a, this.f49506b + i, this.f49506b + i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Integer set(int i, Integer num) {
            C17439m.m57960a(i, size());
            int i2 = this.f49505a[this.f49506b + i];
            this.f49505a[this.f49506b + i] = ((Integer) C17439m.m57962a(num)).intValue();
            return Integer.valueOf(i2);
        }

        private C18144a(int[] iArr, int i, int i2) {
            this.f49505a = iArr;
            this.f49506b = i;
            this.f49507c = i2;
        }
    }

    /* renamed from: a */
    public static int m59965a(int i) {
        return i;
    }

    /* renamed from: a */
    public static int m59966a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m59970b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: a */
    public static int m59967a(long j) {
        boolean z;
        int i = (int) j;
        if (((long) i) == j) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57973a(z, "Out of range: %s", j);
        return i;
    }

    /* renamed from: a */
    public static int[] m59969a(Collection<? extends Number> collection) {
        if (collection instanceof C18144a) {
            return ((C18144a) collection).mo46903a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C17439m.m57962a(array[i])).intValue();
        }
        return iArr;
    }

    /* renamed from: b */
    public static int m59971b(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m59968a(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
