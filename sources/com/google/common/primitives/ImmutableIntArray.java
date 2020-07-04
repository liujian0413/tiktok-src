package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    public final int[] array;
    private final int end;
    public final transient int start;

    /* renamed from: com.google.common.primitives.ImmutableIntArray$a */
    static class C18135a extends AbstractList<Integer> implements Serializable, RandomAccess {

        /* renamed from: a */
        private final ImmutableIntArray f49495a;

        public final int hashCode() {
            return this.f49495a.hashCode();
        }

        public final int size() {
            return this.f49495a.length();
        }

        public final String toString() {
            return this.f49495a.toString();
        }

        private C18135a(ImmutableIntArray immutableIntArray) {
            this.f49495a = immutableIntArray;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Integer get(int i) {
            return Integer.valueOf(this.f49495a.get(i));
        }

        public final boolean contains(Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f49495a.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f49495a.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C18135a) {
                return this.f49495a.equals(((C18135a) obj).f49495a);
            } else if (!(obj instanceof List)) {
                return false;
            } else {
                List list = (List) obj;
                if (size() != list.size()) {
                    return false;
                }
                int i = this.f49495a.start;
                for (Object next : list) {
                    if (next instanceof Integer) {
                        int i2 = i + 1;
                        if (this.f49495a.array[i] == ((Integer) next).intValue()) {
                            i = i2;
                        }
                    }
                    return false;
                }
                return true;
            }
        }

        public final List<Integer> subList(int i, int i2) {
            return this.f49495a.subArray(i, i2).asList();
        }
    }

    /* renamed from: com.google.common.primitives.ImmutableIntArray$b */
    public static final class C18136b {

        /* renamed from: a */
        private int[] f49496a;

        /* renamed from: b */
        private int f49497b;

        /* renamed from: a */
        public final ImmutableIntArray mo46832a() {
            if (this.f49497b == 0) {
                return ImmutableIntArray.EMPTY;
            }
            return new ImmutableIntArray(this.f49496a, 0, this.f49497b);
        }

        C18136b(int i) {
            this.f49496a = new int[i];
        }

        /* renamed from: a */
        private C18136b m59935a(int i) {
            m59937b(1);
            this.f49496a[this.f49497b] = i;
            this.f49497b++;
            return this;
        }

        /* renamed from: b */
        private void m59937b(int i) {
            int i2 = this.f49497b + i;
            if (i2 > this.f49496a.length) {
                int[] iArr = new int[m59934a(this.f49496a.length, i2)];
                System.arraycopy(this.f49496a, 0, iArr, 0, this.f49497b);
                this.f49496a = iArr;
            }
        }

        /* renamed from: a */
        private C18136b m59936a(Collection<Integer> collection) {
            m59937b(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f49496a;
                int i = this.f49497b;
                this.f49497b = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        /* renamed from: a */
        public final C18136b mo46831a(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return m59936a((Collection) iterable);
            }
            for (Integer intValue : iterable) {
                m59935a(intValue.intValue());
            }
            return this;
        }

        /* renamed from: a */
        private static int m59934a(int i, int i2) {
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
    public static ImmutableIntArray m59925of() {
        return EMPTY;
    }

    public static C18136b builder() {
        return new C18136b(10);
    }

    public final List<Integer> asList() {
        return new C18135a();
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

    public final int[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + C18143c.m59965a(this.array[i2]);
        }
        return i;
    }

    public final ImmutableIntArray trimmed() {
        if (isPartialView()) {
            return new ImmutableIntArray(toArray());
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

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static C18136b builder(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57971a(z, "Invalid initialCapacity: %s", i);
        return new C18136b(i);
    }

    /* renamed from: of */
    public static ImmutableIntArray m59926of(int i) {
        return new ImmutableIntArray(new int[]{i});
    }

    public final boolean contains(int i) {
        if (indexOf(i) >= 0) {
            return true;
        }
        return false;
    }

    public final int get(int i) {
        C17439m.m57960a(i, length());
        return this.array[this.start + i];
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return builder().mo46831a(iterable).mo46832a();
    }

    public final int indexOf(int i) {
        for (int i2 = this.start; i2 < this.end; i2++) {
            if (this.array[i2] == i) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    public final int lastIndexOf(int i) {
        int i2 = this.end;
        while (true) {
            i2--;
            if (i2 < this.start) {
                return -1;
            }
            if (this.array[i2] == i) {
                return i2 - this.start;
            }
        }
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            return EMPTY;
        }
        return new ImmutableIntArray(C18143c.m59969a(collection));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        if (iArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    /* renamed from: of */
    public static ImmutableIntArray m59927of(int i, int i2) {
        return new ImmutableIntArray(new int[]{i, i2});
    }

    public final ImmutableIntArray subArray(int i, int i2) {
        C17439m.m57967a(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        return new ImmutableIntArray(this.array, this.start + i, this.start + i2);
    }

    /* renamed from: of */
    public static ImmutableIntArray m59932of(int i, int... iArr) {
        boolean z;
        if (iArr.length <= 2147483646) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "the total number of elements must fit in an int");
        int[] iArr2 = new int[(iArr.length + 1)];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }

    private ImmutableIntArray(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    /* renamed from: of */
    public static ImmutableIntArray m59928of(int i, int i2, int i3) {
        return new ImmutableIntArray(new int[]{i, i2, i3});
    }

    /* renamed from: of */
    public static ImmutableIntArray m59929of(int i, int i2, int i3, int i4) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4});
    }

    /* renamed from: of */
    public static ImmutableIntArray m59930of(int i, int i2, int i3, int i4, int i5) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5});
    }

    /* renamed from: of */
    public static ImmutableIntArray m59931of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5, i6});
    }
}
