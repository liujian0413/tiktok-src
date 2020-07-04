package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

/* renamed from: com.google.common.primitives.b */
public final class C18141b {

    /* renamed from: a */
    static final Pattern f49501a = m59958a();

    /* renamed from: com.google.common.primitives.b$a */
    static class C18142a extends AbstractList<Double> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final double[] f49502a;

        /* renamed from: b */
        final int f49503b;

        /* renamed from: c */
        final int f49504c;

        public final boolean isEmpty() {
            return false;
        }

        public final int size() {
            return this.f49504c - this.f49503b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final double[] mo46891a() {
            return Arrays.copyOfRange(this.f49502a, this.f49503b, this.f49504c);
        }

        public final int hashCode() {
            int i = 1;
            for (int i2 = this.f49503b; i2 < this.f49504c; i2++) {
                i = (i * 31) + C18141b.m59956a(this.f49502a[i2]);
            }
            return i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f49502a[this.f49503b]);
            int i = this.f49503b;
            while (true) {
                i++;
                if (i < this.f49504c) {
                    sb.append(", ");
                    sb.append(this.f49502a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Double get(int i) {
            C17439m.m57960a(i, size());
            return Double.valueOf(this.f49502a[this.f49503b + i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Double) || C18141b.m59957a(this.f49502a, ((Double) obj).doubleValue(), this.f49503b, this.f49504c) == -1) {
                return false;
            }
            return true;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Double) {
                int a = C18141b.m59957a(this.f49502a, ((Double) obj).doubleValue(), this.f49503b, this.f49504c);
                if (a >= 0) {
                    return a - this.f49503b;
                }
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                int b = C18141b.m59960b(this.f49502a, ((Double) obj).doubleValue(), this.f49503b, this.f49504c);
                if (b >= 0) {
                    return b - this.f49503b;
                }
            }
            return -1;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C18142a)) {
                return super.equals(obj);
            }
            C18142a aVar = (C18142a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f49502a[this.f49503b + i] != aVar.f49502a[aVar.f49503b + i]) {
                    return false;
                }
            }
            return true;
        }

        public final List<Double> subList(int i, int i2) {
            C17439m.m57967a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            return new C18142a(this.f49502a, this.f49503b + i, this.f49503b + i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Double set(int i, Double d) {
            C17439m.m57960a(i, size());
            double d2 = this.f49502a[this.f49503b + i];
            this.f49502a[this.f49503b + i] = ((Double) C17439m.m57962a(d)).doubleValue();
            return Double.valueOf(d2);
        }

        private C18142a(double[] dArr, int i, int i2) {
            this.f49502a = dArr;
            this.f49503b = i;
            this.f49504c = i2;
        }
    }

    /* renamed from: b */
    public static boolean m59961b(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }

    /* renamed from: a */
    private static Pattern m59958a() {
        StringBuilder sb = new StringBuilder();
        sb.append("(?:\\d++(?:\\.\\d*+)?|\\.\\d++)");
        sb.append("(?:[eE][+-]?\\d++)?[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("0[xX]");
        sb3.append("(?:\\p{XDigit}++(?:\\.\\p{XDigit}*+)?|\\.\\p{XDigit}++)");
        sb3.append("[pP][+-]?\\d++[fFdD]?");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder("[+-]?(?:NaN|Infinity|");
        sb5.append(sb2);
        sb5.append("|");
        sb5.append(sb4);
        sb5.append(")");
        return Pattern.compile(sb5.toString());
    }

    /* renamed from: a */
    public static int m59956a(double d) {
        return Double.valueOf(d).hashCode();
    }

    /* renamed from: a */
    public static double[] m59959a(Collection<? extends Number> collection) {
        if (collection instanceof C18142a) {
            return ((C18142a) collection).mo46891a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) C17439m.m57962a(array[i])).doubleValue();
        }
        return dArr;
    }

    /* renamed from: b */
    public static int m59960b(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m59957a(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
