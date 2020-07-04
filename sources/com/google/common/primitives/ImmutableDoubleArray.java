package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class ImmutableDoubleArray implements Serializable {
    public static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    public final double[] array;
    private final int end;
    public final transient int start;

    /* renamed from: com.google.common.primitives.ImmutableDoubleArray$a */
    static class C18132a extends AbstractList<Double> implements Serializable, RandomAccess {

        /* renamed from: a */
        private final ImmutableDoubleArray f49492a;

        public final int hashCode() {
            return this.f49492a.hashCode();
        }

        public final int size() {
            return this.f49492a.length();
        }

        public final String toString() {
            return this.f49492a.toString();
        }

        private C18132a(ImmutableDoubleArray immutableDoubleArray) {
            this.f49492a = immutableDoubleArray;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Double get(int i) {
            return Double.valueOf(this.f49492a.get(i));
        }

        public final boolean contains(Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f49492a.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f49492a.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C18132a) {
                return this.f49492a.equals(((C18132a) obj).f49492a);
            } else if (!(obj instanceof List)) {
                return false;
            } else {
                List list = (List) obj;
                if (size() != list.size()) {
                    return false;
                }
                int i = this.f49492a.start;
                for (Object next : list) {
                    if (next instanceof Double) {
                        int i2 = i + 1;
                        if (ImmutableDoubleArray.areEqual(this.f49492a.array[i], ((Double) next).doubleValue())) {
                            i = i2;
                        }
                    }
                    return false;
                }
                return true;
            }
        }

        public final List<Double> subList(int i, int i2) {
            return this.f49492a.subArray(i, i2).asList();
        }
    }

    /* renamed from: com.google.common.primitives.ImmutableDoubleArray$b */
    public static final class C18133b {

        /* renamed from: a */
        private double[] f49493a;

        /* renamed from: b */
        private int f49494b;

        /* renamed from: a */
        public final ImmutableDoubleArray mo46806a() {
            if (this.f49494b == 0) {
                return ImmutableDoubleArray.EMPTY;
            }
            return new ImmutableDoubleArray(this.f49493a, 0, this.f49494b);
        }

        C18133b(int i) {
            this.f49493a = new double[i];
        }

        /* renamed from: a */
        private C18133b m59920a(double d) {
            m59922a(1);
            this.f49493a[this.f49494b] = d;
            this.f49494b++;
            return this;
        }

        /* renamed from: a */
        private C18133b m59921a(Collection<Double> collection) {
            m59922a(collection.size());
            for (Double d : collection) {
                double[] dArr = this.f49493a;
                int i = this.f49494b;
                this.f49494b = i + 1;
                dArr[i] = d.doubleValue();
            }
            return this;
        }

        /* renamed from: a */
        private void m59922a(int i) {
            int i2 = this.f49494b + i;
            if (i2 > this.f49493a.length) {
                double[] dArr = new double[m59919a(this.f49493a.length, i2)];
                System.arraycopy(this.f49493a, 0, dArr, 0, this.f49494b);
                this.f49493a = dArr;
            }
        }

        /* renamed from: a */
        public final C18133b mo46805a(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return m59921a((Collection) iterable);
            }
            for (Double doubleValue : iterable) {
                m59920a(doubleValue.doubleValue());
            }
            return this;
        }

        /* renamed from: a */
        private static int m59919a(int i, int i2) {
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
    public static ImmutableDoubleArray m59910of() {
        return EMPTY;
    }

    public static C18133b builder() {
        return new C18133b(10);
    }

    public final List<Double> asList() {
        return new C18132a();
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

    public final double[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + C18141b.m59956a(this.array[i2]);
        }
        return i;
    }

    public final ImmutableDoubleArray trimmed() {
        if (isPartialView()) {
            return new ImmutableDoubleArray(toArray());
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

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static C18133b builder(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57971a(z, "Invalid initialCapacity: %s", i);
        return new C18133b(i);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m59911of(double d) {
        return new ImmutableDoubleArray(new double[]{d});
    }

    public final boolean contains(double d) {
        if (indexOf(d) >= 0) {
            return true;
        }
        return false;
    }

    public final double get(int i) {
        C17439m.m57960a(i, length());
        return this.array[this.start + i];
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return builder().mo46805a(iterable).mo46806a();
    }

    public final int indexOf(double d) {
        for (int i = this.start; i < this.end; i++) {
            if (areEqual(this.array[i], d)) {
                return i - this.start;
            }
        }
        return -1;
    }

    public final int lastIndexOf(double d) {
        int i = this.end;
        while (true) {
            i--;
            if (i < this.start) {
                return -1;
            }
            if (areEqual(this.array[i], d)) {
                return i - this.start;
            }
        }
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        if (collection.isEmpty()) {
            return EMPTY;
        }
        return new ImmutableDoubleArray(C18141b.m59959a(collection));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!areEqual(get(i), immutableDoubleArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        if (dArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    public static boolean areEqual(double d, double d2) {
        if (Double.doubleToLongBits(d) == Double.doubleToLongBits(d2)) {
            return true;
        }
        return false;
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m59912of(double d, double d2) {
        return new ImmutableDoubleArray(new double[]{d, d2});
    }

    public final ImmutableDoubleArray subArray(int i, int i2) {
        C17439m.m57967a(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        return new ImmutableDoubleArray(this.array, this.start + i, this.start + i2);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m59917of(double d, double... dArr) {
        boolean z;
        if (dArr.length <= 2147483646) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "the total number of elements must fit in an int");
        double[] dArr2 = new double[(dArr.length + 1)];
        dArr2[0] = d;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }

    private ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.array = dArr;
        this.start = i;
        this.end = i2;
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m59913of(double d, double d2, double d3) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m59914of(double d, double d2, double d3, double d4) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m59915of(double d, double d2, double d3, double d4, double d5) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m59916of(double d, double d2, double d3, double d4, double d5, double d6) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5, d6});
    }
}
