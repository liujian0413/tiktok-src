package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class axe extends awf<Double> implements ayc<Double>, azn, RandomAccess {

    /* renamed from: a */
    private static final axe f41162a;

    /* renamed from: b */
    private double[] f41163b;

    /* renamed from: c */
    private int f41164c;

    axe() {
        this(new double[10], 0);
    }

    private axe(double[] dArr, int i) {
        this.f41163b = dArr;
        this.f41164c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo40096c();
        if (i2 >= i) {
            double[] dArr = this.f41163b;
            System.arraycopy(dArr, i2, dArr, i, this.f41164c - i2);
            this.f41164c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axe)) {
            return super.equals(obj);
        }
        axe axe = (axe) obj;
        if (this.f41164c != axe.f41164c) {
            return false;
        }
        double[] dArr = axe.f41163b;
        for (int i = 0; i < this.f41164c; i++) {
            if (Double.doubleToLongBits(this.f41163b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41164c; i2++) {
            i = (i * 31) + axw.m47741a(Double.doubleToLongBits(this.f41163b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f41164c;
    }

    /* renamed from: a */
    public final void mo40239a(double d) {
        m47619a(this.f41164c, d);
    }

    /* renamed from: a */
    private final void m47619a(int i, double d) {
        mo40096c();
        if (i < 0 || i > this.f41164c) {
            throw new IndexOutOfBoundsException(m47621c(i));
        }
        if (this.f41164c < this.f41163b.length) {
            double[] dArr = this.f41163b;
            System.arraycopy(dArr, i, dArr, i + 1, this.f41164c - i);
        } else {
            double[] dArr2 = new double[(((this.f41164c * 3) / 2) + 1)];
            System.arraycopy(this.f41163b, 0, dArr2, 0, i);
            System.arraycopy(this.f41163b, i, dArr2, i + 1, this.f41164c - i);
            this.f41163b = dArr2;
        }
        this.f41163b[i] = d;
        this.f41164c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo40096c();
        axw.m47743a(collection);
        if (!(collection instanceof axe)) {
            return super.addAll(collection);
        }
        axe axe = (axe) collection;
        if (axe.f41164c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41164c >= axe.f41164c) {
            int i = this.f41164c + axe.f41164c;
            if (i > this.f41163b.length) {
                this.f41163b = Arrays.copyOf(this.f41163b, i);
            }
            System.arraycopy(axe.f41163b, 0, this.f41163b, this.f41164c, axe.f41164c);
            this.f41164c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo40096c();
        for (int i = 0; i < this.f41164c; i++) {
            if (obj.equals(Double.valueOf(this.f41163b[i]))) {
                System.arraycopy(this.f41163b, i + 1, this.f41163b, i, (this.f41164c - i) - 1);
                this.f41164c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m47620b(int i) {
        if (i < 0 || i >= this.f41164c) {
            throw new IndexOutOfBoundsException(m47621c(i));
        }
    }

    /* renamed from: c */
    private final String m47621c(int i) {
        int i2 = this.f41164c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo40096c();
        m47620b(i);
        double d = this.f41163b[i];
        this.f41163b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        mo40096c();
        m47620b(i);
        double d = this.f41163b[i];
        if (i < this.f41164c - 1) {
            System.arraycopy(this.f41163b, i + 1, this.f41163b, i, (this.f41164c - i) - 1);
        }
        this.f41164c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m47619a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayc mo40105a(int i) {
        if (i >= this.f41164c) {
            return new axe(Arrays.copyOf(this.f41163b, i), this.f41164c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m47620b(i);
        return Double.valueOf(this.f41163b[i]);
    }

    static {
        axe axe = new axe();
        f41162a = axe;
        axe.mo40095b();
    }
}
