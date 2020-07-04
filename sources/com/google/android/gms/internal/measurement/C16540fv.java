package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fv */
final class C16540fv extends C16538ft<Boolean> implements C16590hl<Boolean>, C16627iv, RandomAccess {

    /* renamed from: a */
    private static final C16540fv f46327a;

    /* renamed from: b */
    private boolean[] f46328b;

    /* renamed from: c */
    private int f46329c;

    C16540fv() {
        this(new boolean[10], 0);
    }

    private C16540fv(boolean[] zArr, int i) {
        this.f46328b = zArr;
        this.f46329c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42738c();
        if (i2 >= i) {
            boolean[] zArr = this.f46328b;
            System.arraycopy(zArr, i2, zArr, i, this.f46329c - i2);
            this.f46329c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16540fv)) {
            return super.equals(obj);
        }
        C16540fv fvVar = (C16540fv) obj;
        if (this.f46329c != fvVar.f46329c) {
            return false;
        }
        boolean[] zArr = fvVar.f46328b;
        for (int i = 0; i < this.f46329c; i++) {
            if (this.f46328b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46329c; i2++) {
            i = (i * 31) + C16586hh.m54185a(this.f46328b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f46329c;
    }

    /* renamed from: a */
    public final void mo42748a(boolean z) {
        m53897a(this.f46329c, z);
    }

    /* renamed from: a */
    private final void m53897a(int i, boolean z) {
        mo42738c();
        if (i < 0 || i > this.f46329c) {
            throw new IndexOutOfBoundsException(m53899c(i));
        }
        if (this.f46329c < this.f46328b.length) {
            boolean[] zArr = this.f46328b;
            System.arraycopy(zArr, i, zArr, i + 1, this.f46329c - i);
        } else {
            boolean[] zArr2 = new boolean[(((this.f46329c * 3) / 2) + 1)];
            System.arraycopy(this.f46328b, 0, zArr2, 0, i);
            System.arraycopy(this.f46328b, i, zArr2, i + 1, this.f46329c - i);
            this.f46328b = zArr2;
        }
        this.f46328b[i] = z;
        this.f46329c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo42738c();
        C16586hh.m54186a(collection);
        if (!(collection instanceof C16540fv)) {
            return super.addAll(collection);
        }
        C16540fv fvVar = (C16540fv) collection;
        if (fvVar.f46329c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f46329c >= fvVar.f46329c) {
            int i = this.f46329c + fvVar.f46329c;
            if (i > this.f46328b.length) {
                this.f46328b = Arrays.copyOf(this.f46328b, i);
            }
            System.arraycopy(fvVar.f46328b, 0, this.f46328b, this.f46329c, fvVar.f46329c);
            this.f46329c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo42738c();
        for (int i = 0; i < this.f46329c; i++) {
            if (obj.equals(Boolean.valueOf(this.f46328b[i]))) {
                System.arraycopy(this.f46328b, i + 1, this.f46328b, i, (this.f46329c - i) - 1);
                this.f46329c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m53898b(int i) {
        if (i < 0 || i >= this.f46329c) {
            throw new IndexOutOfBoundsException(m53899c(i));
        }
    }

    /* renamed from: c */
    private final String m53899c(int i) {
        int i2 = this.f46329c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo42738c();
        m53898b(i);
        boolean z = this.f46328b[i];
        this.f46328b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        mo42738c();
        m53898b(i);
        boolean z = this.f46328b[i];
        if (i < this.f46329c - 1) {
            System.arraycopy(this.f46328b, i + 1, this.f46328b, i, (this.f46329c - i) - 1);
        }
        this.f46329c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m53897a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16590hl mo42747a(int i) {
        if (i >= this.f46329c) {
            return new C16540fv(Arrays.copyOf(this.f46328b, i), this.f46329c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m53898b(i);
        return Boolean.valueOf(this.f46328b[i]);
    }

    static {
        C16540fv fvVar = new C16540fv();
        f46327a = fvVar;
        fvVar.mo42737b();
    }
}
