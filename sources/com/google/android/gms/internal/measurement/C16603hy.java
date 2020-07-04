package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hy */
final class C16603hy extends C16538ft<Long> implements C16590hl<Long>, C16627iv, RandomAccess {

    /* renamed from: a */
    private static final C16603hy f46441a;

    /* renamed from: b */
    private long[] f46442b;

    /* renamed from: c */
    private int f46443c;

    C16603hy() {
        this(new long[10], 0);
    }

    private C16603hy(long[] jArr, int i) {
        this.f46442b = jArr;
        this.f46443c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42738c();
        if (i2 >= i) {
            long[] jArr = this.f46442b;
            System.arraycopy(jArr, i2, jArr, i, this.f46443c - i2);
            this.f46443c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16603hy)) {
            return super.equals(obj);
        }
        C16603hy hyVar = (C16603hy) obj;
        if (this.f46443c != hyVar.f46443c) {
            return false;
        }
        long[] jArr = hyVar.f46442b;
        for (int i = 0; i < this.f46443c; i++) {
            if (this.f46442b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46443c; i2++) {
            i = (i * 31) + C16586hh.m54184a(this.f46442b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo42973b(int i) {
        m54229c(i);
        return this.f46442b[i];
    }

    public final int size() {
        return this.f46443c;
    }

    /* renamed from: a */
    public final void mo42972a(long j) {
        m54228a(this.f46443c, j);
    }

    /* renamed from: a */
    private final void m54228a(int i, long j) {
        mo42738c();
        if (i < 0 || i > this.f46443c) {
            throw new IndexOutOfBoundsException(m54230d(i));
        }
        if (this.f46443c < this.f46442b.length) {
            long[] jArr = this.f46442b;
            System.arraycopy(jArr, i, jArr, i + 1, this.f46443c - i);
        } else {
            long[] jArr2 = new long[(((this.f46443c * 3) / 2) + 1)];
            System.arraycopy(this.f46442b, 0, jArr2, 0, i);
            System.arraycopy(this.f46442b, i, jArr2, i + 1, this.f46443c - i);
            this.f46442b = jArr2;
        }
        this.f46442b[i] = j;
        this.f46443c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo42738c();
        C16586hh.m54186a(collection);
        if (!(collection instanceof C16603hy)) {
            return super.addAll(collection);
        }
        C16603hy hyVar = (C16603hy) collection;
        if (hyVar.f46443c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f46443c >= hyVar.f46443c) {
            int i = this.f46443c + hyVar.f46443c;
            if (i > this.f46442b.length) {
                this.f46442b = Arrays.copyOf(this.f46442b, i);
            }
            System.arraycopy(hyVar.f46442b, 0, this.f46442b, this.f46443c, hyVar.f46443c);
            this.f46443c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo42738c();
        for (int i = 0; i < this.f46443c; i++) {
            if (obj.equals(Long.valueOf(this.f46442b[i]))) {
                System.arraycopy(this.f46442b, i + 1, this.f46442b, i, (this.f46443c - i) - 1);
                this.f46443c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m54229c(int i) {
        if (i < 0 || i >= this.f46443c) {
            throw new IndexOutOfBoundsException(m54230d(i));
        }
    }

    /* renamed from: d */
    private final String m54230d(int i) {
        int i2 = this.f46443c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo42738c();
        m54229c(i);
        long j = this.f46442b[i];
        this.f46442b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo42738c();
        m54229c(i);
        long j = this.f46442b[i];
        if (i < this.f46443c - 1) {
            System.arraycopy(this.f46442b, i + 1, this.f46442b, i, (this.f46443c - i) - 1);
        }
        this.f46443c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m54228a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16590hl mo42747a(int i) {
        if (i >= this.f46443c) {
            return new C16603hy(Arrays.copyOf(this.f46442b, i), this.f46443c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo42973b(i));
    }

    static {
        C16603hy hyVar = new C16603hy();
        f46441a = hyVar;
        hyVar.mo42737b();
    }
}
