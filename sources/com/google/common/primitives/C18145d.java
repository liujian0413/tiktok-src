package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.primitives.d */
public final class C18145d {

    /* renamed from: com.google.common.primitives.d$a */
    static class C18146a extends AbstractList<Long> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final long[] f49508a;

        /* renamed from: b */
        final int f49509b;

        /* renamed from: c */
        final int f49510c;

        public final boolean isEmpty() {
            return false;
        }

        public final int size() {
            return this.f49510c - this.f49509b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long[] mo46915a() {
            return Arrays.copyOfRange(this.f49508a, this.f49509b, this.f49510c);
        }

        public final int hashCode() {
            int i = 1;
            for (int i2 = this.f49509b; i2 < this.f49510c; i2++) {
                i = (i * 31) + C18145d.m59975a(this.f49508a[i2]);
            }
            return i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f49508a[this.f49509b]);
            int i = this.f49509b;
            while (true) {
                i++;
                if (i < this.f49510c) {
                    sb.append(", ");
                    sb.append(this.f49508a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Long get(int i) {
            C17439m.m57960a(i, size());
            return Long.valueOf(this.f49508a[this.f49509b + i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Long) || C18145d.m59977a(this.f49508a, ((Long) obj).longValue(), this.f49509b, this.f49510c) == -1) {
                return false;
            }
            return true;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Long) {
                int a = C18145d.m59977a(this.f49508a, ((Long) obj).longValue(), this.f49509b, this.f49510c);
                if (a >= 0) {
                    return a - this.f49509b;
                }
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                int b = C18145d.m59980b(this.f49508a, ((Long) obj).longValue(), this.f49509b, this.f49510c);
                if (b >= 0) {
                    return b - this.f49509b;
                }
            }
            return -1;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C18146a)) {
                return super.equals(obj);
            }
            C18146a aVar = (C18146a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f49508a[this.f49509b + i] != aVar.f49508a[aVar.f49509b + i]) {
                    return false;
                }
            }
            return true;
        }

        public final List<Long> subList(int i, int i2) {
            C17439m.m57967a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            return new C18146a(this.f49508a, this.f49509b + i, this.f49509b + i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Long set(int i, Long l) {
            C17439m.m57960a(i, size());
            long j = this.f49508a[this.f49509b + i];
            this.f49508a[this.f49509b + i] = ((Long) C17439m.m57962a(l)).longValue();
            return Long.valueOf(j);
        }

        private C18146a(long[] jArr, int i, int i2) {
            this.f49508a = jArr;
            this.f49509b = i;
            this.f49510c = i2;
        }
    }

    /* renamed from: a */
    public static int m59975a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m59976a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: a */
    public static long m59978a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* renamed from: a */
    public static long[] m59979a(Collection<? extends Number> collection) {
        if (collection instanceof C18146a) {
            return ((C18146a) collection).mo46915a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) C17439m.m57962a(array[i])).longValue();
        }
        return jArr;
    }

    /* renamed from: b */
    public static int m59980b(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m59977a(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
