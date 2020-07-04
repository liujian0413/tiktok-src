package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class axv extends awf<Integer> implements aya, azn, RandomAccess {

    /* renamed from: a */
    private static final axv f41213a;

    /* renamed from: b */
    private int[] f41214b;

    /* renamed from: c */
    private int f41215c;

    /* renamed from: d */
    public static axv m47733d() {
        return f41213a;
    }

    axv() {
        this(new int[10], 0);
    }

    private axv(int[] iArr, int i) {
        this.f41214b = iArr;
        this.f41215c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo40096c();
        if (i2 >= i) {
            int[] iArr = this.f41214b;
            System.arraycopy(iArr, i2, iArr, i, this.f41215c - i2);
            this.f41215c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axv)) {
            return super.equals(obj);
        }
        axv axv = (axv) obj;
        if (this.f41215c != axv.f41215c) {
            return false;
        }
        int[] iArr = axv.f41214b;
        for (int i = 0; i < this.f41215c; i++) {
            if (this.f41214b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41215c; i2++) {
            i = (i * 31) + this.f41214b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final aya mo40105a(int i) {
        if (i >= this.f41215c) {
            return new axv(Arrays.copyOf(this.f41214b, i), this.f41215c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final int mo40295c(int i) {
        m47734e(i);
        return this.f41214b[i];
    }

    public final int size() {
        return this.f41215c;
    }

    /* renamed from: d */
    public final void mo40296d(int i) {
        m47732a(this.f41215c, i);
    }

    /* renamed from: a */
    private final void m47732a(int i, int i2) {
        mo40096c();
        if (i < 0 || i > this.f41215c) {
            throw new IndexOutOfBoundsException(m47735f(i));
        }
        if (this.f41215c < this.f41214b.length) {
            int[] iArr = this.f41214b;
            System.arraycopy(iArr, i, iArr, i + 1, this.f41215c - i);
        } else {
            int[] iArr2 = new int[(((this.f41215c * 3) / 2) + 1)];
            System.arraycopy(this.f41214b, 0, iArr2, 0, i);
            System.arraycopy(this.f41214b, i, iArr2, i + 1, this.f41215c - i);
            this.f41214b = iArr2;
        }
        this.f41214b[i] = i2;
        this.f41215c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo40096c();
        axw.m47743a(collection);
        if (!(collection instanceof axv)) {
            return super.addAll(collection);
        }
        axv axv = (axv) collection;
        if (axv.f41215c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41215c >= axv.f41215c) {
            int i = this.f41215c + axv.f41215c;
            if (i > this.f41214b.length) {
                this.f41214b = Arrays.copyOf(this.f41214b, i);
            }
            System.arraycopy(axv.f41214b, 0, this.f41214b, this.f41215c, axv.f41215c);
            this.f41215c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo40096c();
        for (int i = 0; i < this.f41215c; i++) {
            if (obj.equals(Integer.valueOf(this.f41214b[i]))) {
                System.arraycopy(this.f41214b, i + 1, this.f41214b, i, (this.f41215c - i) - 1);
                this.f41215c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private final void m47734e(int i) {
        if (i < 0 || i >= this.f41215c) {
            throw new IndexOutOfBoundsException(m47735f(i));
        }
    }

    /* renamed from: f */
    private final String m47735f(int i) {
        int i2 = this.f41215c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo40096c();
        m47734e(i);
        int i2 = this.f41214b[i];
        this.f41214b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        mo40096c();
        m47734e(i);
        int i2 = this.f41214b[i];
        if (i < this.f41215c - 1) {
            System.arraycopy(this.f41214b, i + 1, this.f41214b, i, (this.f41215c - i) - 1);
        }
        this.f41215c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m47732a(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo40295c(i));
    }

    static {
        axv axv = new axv();
        f41213a = axv;
        axv.mo40095b();
    }
}
