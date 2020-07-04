package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.gp */
final class C16561gp extends C16538ft<Double> implements C16590hl<Double>, C16627iv, RandomAccess {

    /* renamed from: a */
    private static final C16561gp f46364a;

    /* renamed from: b */
    private double[] f46365b;

    /* renamed from: c */
    private int f46366c;

    C16561gp() {
        this(new double[10], 0);
    }

    private C16561gp(double[] dArr, int i) {
        this.f46365b = dArr;
        this.f46366c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42738c();
        if (i2 >= i) {
            double[] dArr = this.f46365b;
            System.arraycopy(dArr, i2, dArr, i, this.f46366c - i2);
            this.f46366c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16561gp)) {
            return super.equals(obj);
        }
        C16561gp gpVar = (C16561gp) obj;
        if (this.f46366c != gpVar.f46366c) {
            return false;
        }
        double[] dArr = gpVar.f46365b;
        for (int i = 0; i < this.f46366c; i++) {
            if (Double.doubleToLongBits(this.f46365b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46366c; i2++) {
            i = (i * 31) + C16586hh.m54184a(Double.doubleToLongBits(this.f46365b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f46366c;
    }

    /* renamed from: a */
    public final void mo42884a(double d) {
        m54071a(this.f46366c, d);
    }

    /* renamed from: a */
    private final void m54071a(int i, double d) {
        mo42738c();
        if (i < 0 || i > this.f46366c) {
            throw new IndexOutOfBoundsException(m54073c(i));
        }
        if (this.f46366c < this.f46365b.length) {
            double[] dArr = this.f46365b;
            System.arraycopy(dArr, i, dArr, i + 1, this.f46366c - i);
        } else {
            double[] dArr2 = new double[(((this.f46366c * 3) / 2) + 1)];
            System.arraycopy(this.f46365b, 0, dArr2, 0, i);
            System.arraycopy(this.f46365b, i, dArr2, i + 1, this.f46366c - i);
            this.f46365b = dArr2;
        }
        this.f46365b[i] = d;
        this.f46366c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo42738c();
        C16586hh.m54186a(collection);
        if (!(collection instanceof C16561gp)) {
            return super.addAll(collection);
        }
        C16561gp gpVar = (C16561gp) collection;
        if (gpVar.f46366c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f46366c >= gpVar.f46366c) {
            int i = this.f46366c + gpVar.f46366c;
            if (i > this.f46365b.length) {
                this.f46365b = Arrays.copyOf(this.f46365b, i);
            }
            System.arraycopy(gpVar.f46365b, 0, this.f46365b, this.f46366c, gpVar.f46366c);
            this.f46366c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo42738c();
        for (int i = 0; i < this.f46366c; i++) {
            if (obj.equals(Double.valueOf(this.f46365b[i]))) {
                System.arraycopy(this.f46365b, i + 1, this.f46365b, i, (this.f46366c - i) - 1);
                this.f46366c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m54072b(int i) {
        if (i < 0 || i >= this.f46366c) {
            throw new IndexOutOfBoundsException(m54073c(i));
        }
    }

    /* renamed from: c */
    private final String m54073c(int i) {
        int i2 = this.f46366c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo42738c();
        m54072b(i);
        double d = this.f46365b[i];
        this.f46365b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        mo42738c();
        m54072b(i);
        double d = this.f46365b[i];
        if (i < this.f46366c - 1) {
            System.arraycopy(this.f46365b, i + 1, this.f46365b, i, (this.f46366c - i) - 1);
        }
        this.f46366c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m54071a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16590hl mo42747a(int i) {
        if (i >= this.f46366c) {
            return new C16561gp(Arrays.copyOf(this.f46365b, i), this.f46366c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m54072b(i);
        return Double.valueOf(this.f46365b[i]);
    }

    static {
        C16561gp gpVar = new C16561gp();
        f46364a = gpVar;
        gpVar.mo42737b();
    }
}
