package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class ayp extends awf<Long> implements ayc<Long>, azn, RandomAccess {

    /* renamed from: a */
    private static final ayp f41234a;

    /* renamed from: b */
    private long[] f41235b;

    /* renamed from: c */
    private int f41236c;

    ayp() {
        this(new long[10], 0);
    }

    private ayp(long[] jArr, int i) {
        this.f41235b = jArr;
        this.f41236c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo40096c();
        if (i2 >= i) {
            long[] jArr = this.f41235b;
            System.arraycopy(jArr, i2, jArr, i, this.f41236c - i2);
            this.f41236c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayp)) {
            return super.equals(obj);
        }
        ayp ayp = (ayp) obj;
        if (this.f41236c != ayp.f41236c) {
            return false;
        }
        long[] jArr = ayp.f41235b;
        for (int i = 0; i < this.f41236c; i++) {
            if (this.f41235b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41236c; i2++) {
            i = (i * 31) + axw.m47741a(this.f41235b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo40327b(int i) {
        m47790c(i);
        return this.f41235b[i];
    }

    public final int size() {
        return this.f41236c;
    }

    /* renamed from: a */
    public final void mo40326a(long j) {
        m47789a(this.f41236c, j);
    }

    /* renamed from: a */
    private final void m47789a(int i, long j) {
        mo40096c();
        if (i < 0 || i > this.f41236c) {
            throw new IndexOutOfBoundsException(m47791d(i));
        }
        if (this.f41236c < this.f41235b.length) {
            long[] jArr = this.f41235b;
            System.arraycopy(jArr, i, jArr, i + 1, this.f41236c - i);
        } else {
            long[] jArr2 = new long[(((this.f41236c * 3) / 2) + 1)];
            System.arraycopy(this.f41235b, 0, jArr2, 0, i);
            System.arraycopy(this.f41235b, i, jArr2, i + 1, this.f41236c - i);
            this.f41235b = jArr2;
        }
        this.f41235b[i] = j;
        this.f41236c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo40096c();
        axw.m47743a(collection);
        if (!(collection instanceof ayp)) {
            return super.addAll(collection);
        }
        ayp ayp = (ayp) collection;
        if (ayp.f41236c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41236c >= ayp.f41236c) {
            int i = this.f41236c + ayp.f41236c;
            if (i > this.f41235b.length) {
                this.f41235b = Arrays.copyOf(this.f41235b, i);
            }
            System.arraycopy(ayp.f41235b, 0, this.f41235b, this.f41236c, ayp.f41236c);
            this.f41236c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo40096c();
        for (int i = 0; i < this.f41236c; i++) {
            if (obj.equals(Long.valueOf(this.f41235b[i]))) {
                System.arraycopy(this.f41235b, i + 1, this.f41235b, i, (this.f41236c - i) - 1);
                this.f41236c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m47790c(int i) {
        if (i < 0 || i >= this.f41236c) {
            throw new IndexOutOfBoundsException(m47791d(i));
        }
    }

    /* renamed from: d */
    private final String m47791d(int i) {
        int i2 = this.f41236c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo40096c();
        m47790c(i);
        long j = this.f41235b[i];
        this.f41235b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo40096c();
        m47790c(i);
        long j = this.f41235b[i];
        if (i < this.f41236c - 1) {
            System.arraycopy(this.f41235b, i + 1, this.f41235b, i, (this.f41236c - i) - 1);
        }
        this.f41236c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m47789a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayc mo40105a(int i) {
        if (i >= this.f41236c) {
            return new ayp(Arrays.copyOf(this.f41235b, i), this.f41236c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo40327b(i));
    }

    static {
        ayp ayp = new ayp();
        f41234a = ayp;
        ayp.mo40095b();
    }
}
