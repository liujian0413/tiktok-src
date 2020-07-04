package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class ImmutableLongArray implements Serializable {
    public static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    public final long[] array;
    private final int end;
    public final transient int start;

    /* renamed from: com.google.common.primitives.ImmutableLongArray$a */
    static class C18138a extends AbstractList<Long> implements Serializable, RandomAccess {

        /* renamed from: a */
        private final ImmutableLongArray f49498a;

        public final int hashCode() {
            return this.f49498a.hashCode();
        }

        public final int size() {
            return this.f49498a.length();
        }

        public final String toString() {
            return this.f49498a.toString();
        }

        private C18138a(ImmutableLongArray immutableLongArray) {
            this.f49498a = immutableLongArray;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Long get(int i) {
            return Long.valueOf(this.f49498a.get(i));
        }

        public final boolean contains(Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f49498a.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f49498a.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C18138a) {
                return this.f49498a.equals(((C18138a) obj).f49498a);
            } else if (!(obj instanceof List)) {
                return false;
            } else {
                List list = (List) obj;
                if (size() != list.size()) {
                    return false;
                }
                int i = this.f49498a.start;
                for (Object next : list) {
                    if (next instanceof Long) {
                        int i2 = i + 1;
                        if (this.f49498a.array[i] == ((Long) next).longValue()) {
                            i = i2;
                        }
                    }
                    return false;
                }
                return true;
            }
        }

        public final List<Long> subList(int i, int i2) {
            return this.f49498a.subArray(i, i2).asList();
        }
    }

    /* renamed from: com.google.common.primitives.ImmutableLongArray$b */
    public static final class C18139b {

        /* renamed from: a */
        private long[] f49499a;

        /* renamed from: b */
        private int f49500b;

        /* renamed from: a */
        public final ImmutableLongArray mo46858a() {
            if (this.f49500b == 0) {
                return ImmutableLongArray.EMPTY;
            }
            return new ImmutableLongArray(this.f49499a, 0, this.f49500b);
        }

        C18139b(int i) {
            this.f49499a = new long[i];
        }

        /* renamed from: a */
        private C18139b m59950a(long j) {
            m59952a(1);
            this.f49499a[this.f49500b] = j;
            this.f49500b++;
            return this;
        }

        /* renamed from: a */
        private C18139b m59951a(Collection<Long> collection) {
            m59952a(collection.size());
            for (Long l : collection) {
                long[] jArr = this.f49499a;
                int i = this.f49500b;
                this.f49500b = i + 1;
                jArr[i] = l.longValue();
            }
            return this;
        }

        /* renamed from: a */
        private void m59952a(int i) {
            int i2 = this.f49500b + i;
            if (i2 > this.f49499a.length) {
                long[] jArr = new long[m59949a(this.f49499a.length, i2)];
                System.arraycopy(this.f49499a, 0, jArr, 0, this.f49500b);
                this.f49499a = jArr;
            }
        }

        /* renamed from: a */
        public final C18139b mo46857a(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return m59951a((Collection) iterable);
            }
            for (Long longValue : iterable) {
                m59950a(longValue.longValue());
            }
            return this;
        }

        /* renamed from: a */
        private static int m59949a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    /* renamed from: of */
    public static ImmutableLongArray m59940of() {
        return EMPTY;
    }

    public static C18139b builder() {
        return new C18139b(10);
    }

    public final List<Long> asList() {
        return new C18138a();
    }

    public final int length() {
        return this.end - this.start;
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return trimmed();
    }

    private boolean isPartialView() {
        if (this.start > 0 || this.end < this.array.length) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this.end == this.start) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final Object readResolve() {
        if (isEmpty()) {
            return EMPTY;
        }
        return this;
    }

    public final long[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + C18145d.m59975a(this.array[i2]);
        }
        return i;
    }

    public final ImmutableLongArray trimmed() {
        if (isPartialView()) {
            return new ImmutableLongArray(toArray());
        }
        return this;
    }

    public final String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ");
                sb.append(this.array[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public static C18139b builder(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57971a(z, "Invalid initialCapacity: %s", i);
        return new C18139b(i);
    }

    /* renamed from: of */
    public static ImmutableLongArray m59941of(long j) {
        return new ImmutableLongArray(new long[]{j});
    }

    public final boolean contains(long j) {
        if (indexOf(j) >= 0) {
            return true;
        }
        return false;
    }

    public final long get(int i) {
        C17439m.m57960a(i, length());
        return this.array[this.start + i];
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return builder().mo46857a(iterable).mo46858a();
    }

    public final int indexOf(long j) {
        for (int i = this.start; i < this.end; i++) {
            if (this.array[i] == j) {
                return i - this.start;
            }
        }
        return -1;
    }

    public final int lastIndexOf(long j) {
        int i = this.end;
        while (true) {
            i--;
            if (i < this.start) {
                return -1;
            }
            if (this.array[i] == j) {
                return i - this.start;
            }
        }
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        if (collection.isEmpty()) {
            return EMPTY;
        }
        return new ImmutableLongArray(C18145d.m59979a(collection));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableLongArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        if (jArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    /* renamed from: of */
    public static ImmutableLongArray m59942of(long j, long j2) {
        return new ImmutableLongArray(new long[]{j, j2});
    }

    public final ImmutableLongArray subArray(int i, int i2) {
        C17439m.m57967a(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        return new ImmutableLongArray(this.array, this.start + i, this.start + i2);
    }

    /* renamed from: of */
    public static ImmutableLongArray m59947of(long j, long... jArr) {
        boolean z;
        if (jArr.length <= 2147483646) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "the total number of elements must fit in an int");
        long[] jArr2 = new long[(jArr.length + 1)];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }

    private ImmutableLongArray(long[] jArr, int i, int i2) {
        this.array = jArr;
        this.start = i;
        this.end = i2;
    }

    /* renamed from: of */
    public static ImmutableLongArray m59943of(long j, long j2, long j3) {
        return new ImmutableLongArray(new long[]{j, j2, j3});
    }

    /* renamed from: of */
    public static ImmutableLongArray m59944of(long j, long j2, long j3, long j4) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4});
    }

    /* renamed from: of */
    public static ImmutableLongArray m59945of(long j, long j2, long j3, long j4, long j5) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5});
    }

    /* renamed from: of */
    public static ImmutableLongArray m59946of(long j, long j2, long j3, long j4, long j5, long j6) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5, j6});
    }
}
