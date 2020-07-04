package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class awk extends awf<Boolean> implements ayc<Boolean>, azn, RandomAccess {

    /* renamed from: a */
    private static final awk f41132a;

    /* renamed from: b */
    private boolean[] f41133b;

    /* renamed from: c */
    private int f41134c;

    awk() {
        this(new boolean[10], 0);
    }

    private awk(boolean[] zArr, int i) {
        this.f41133b = zArr;
        this.f41134c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo40096c();
        if (i2 >= i) {
            boolean[] zArr = this.f41133b;
            System.arraycopy(zArr, i2, zArr, i, this.f41134c - i2);
            this.f41134c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awk)) {
            return super.equals(obj);
        }
        awk awk = (awk) obj;
        if (this.f41134c != awk.f41134c) {
            return false;
        }
        boolean[] zArr = awk.f41133b;
        for (int i = 0; i < this.f41134c; i++) {
            if (this.f41133b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41134c; i2++) {
            i = (i * 31) + axw.m47742a(this.f41133b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f41134c;
    }

    /* renamed from: a */
    public final void mo40106a(boolean z) {
        m47437a(this.f41134c, z);
    }

    /* renamed from: a */
    private final void m47437a(int i, boolean z) {
        mo40096c();
        if (i < 0 || i > this.f41134c) {
            throw new IndexOutOfBoundsException(m47439c(i));
        }
        if (this.f41134c < this.f41133b.length) {
            boolean[] zArr = this.f41133b;
            System.arraycopy(zArr, i, zArr, i + 1, this.f41134c - i);
        } else {
            boolean[] zArr2 = new boolean[(((this.f41134c * 3) / 2) + 1)];
            System.arraycopy(this.f41133b, 0, zArr2, 0, i);
            System.arraycopy(this.f41133b, i, zArr2, i + 1, this.f41134c - i);
            this.f41133b = zArr2;
        }
        this.f41133b[i] = z;
        this.f41134c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo40096c();
        axw.m47743a(collection);
        if (!(collection instanceof awk)) {
            return super.addAll(collection);
        }
        awk awk = (awk) collection;
        if (awk.f41134c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41134c >= awk.f41134c) {
            int i = this.f41134c + awk.f41134c;
            if (i > this.f41133b.length) {
                this.f41133b = Arrays.copyOf(this.f41133b, i);
            }
            System.arraycopy(awk.f41133b, 0, this.f41133b, this.f41134c, awk.f41134c);
            this.f41134c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo40096c();
        for (int i = 0; i < this.f41134c; i++) {
            if (obj.equals(Boolean.valueOf(this.f41133b[i]))) {
                System.arraycopy(this.f41133b, i + 1, this.f41133b, i, (this.f41134c - i) - 1);
                this.f41134c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m47438b(int i) {
        if (i < 0 || i >= this.f41134c) {
            throw new IndexOutOfBoundsException(m47439c(i));
        }
    }

    /* renamed from: c */
    private final String m47439c(int i) {
        int i2 = this.f41134c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo40096c();
        m47438b(i);
        boolean z = this.f41133b[i];
        this.f41133b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        mo40096c();
        m47438b(i);
        boolean z = this.f41133b[i];
        if (i < this.f41134c - 1) {
            System.arraycopy(this.f41133b, i + 1, this.f41133b, i, (this.f41134c - i) - 1);
        }
        this.f41134c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m47437a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayc mo40105a(int i) {
        if (i >= this.f41134c) {
            return new awk(Arrays.copyOf(this.f41133b, i), this.f41134c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m47438b(i);
        return Boolean.valueOf(this.f41133b[i]);
    }

    static {
        awk awk = new awk();
        f41132a = awk;
        awk.mo40095b();
    }
}
