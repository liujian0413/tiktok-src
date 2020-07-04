package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hg */
final class C16585hg extends C16538ft<Integer> implements C16590hl<Integer>, C16627iv, RandomAccess {

    /* renamed from: a */
    private static final C16585hg f46421a;

    /* renamed from: b */
    private int[] f46422b;

    /* renamed from: c */
    private int f46423c;

    C16585hg() {
        this(new int[10], 0);
    }

    private C16585hg(int[] iArr, int i) {
        this.f46422b = iArr;
        this.f46423c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42738c();
        if (i2 >= i) {
            int[] iArr = this.f46422b;
            System.arraycopy(iArr, i2, iArr, i, this.f46423c - i2);
            this.f46423c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16585hg)) {
            return super.equals(obj);
        }
        C16585hg hgVar = (C16585hg) obj;
        if (this.f46423c != hgVar.f46423c) {
            return false;
        }
        int[] iArr = hgVar.f46422b;
        for (int i = 0; i < this.f46423c; i++) {
            if (this.f46422b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46423c; i2++) {
            i = (i * 31) + this.f46422b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final int mo42944b(int i) {
        m54178d(i);
        return this.f46422b[i];
    }

    public final int size() {
        return this.f46423c;
    }

    /* renamed from: c */
    public final void mo42945c(int i) {
        m54177a(this.f46423c, i);
    }

    /* renamed from: a */
    private final void m54177a(int i, int i2) {
        mo42738c();
        if (i < 0 || i > this.f46423c) {
            throw new IndexOutOfBoundsException(m54179e(i));
        }
        if (this.f46423c < this.f46422b.length) {
            int[] iArr = this.f46422b;
            System.arraycopy(iArr, i, iArr, i + 1, this.f46423c - i);
        } else {
            int[] iArr2 = new int[(((this.f46423c * 3) / 2) + 1)];
            System.arraycopy(this.f46422b, 0, iArr2, 0, i);
            System.arraycopy(this.f46422b, i, iArr2, i + 1, this.f46423c - i);
            this.f46422b = iArr2;
        }
        this.f46422b[i] = i2;
        this.f46423c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo42738c();
        C16586hh.m54186a(collection);
        if (!(collection instanceof C16585hg)) {
            return super.addAll(collection);
        }
        C16585hg hgVar = (C16585hg) collection;
        if (hgVar.f46423c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f46423c >= hgVar.f46423c) {
            int i = this.f46423c + hgVar.f46423c;
            if (i > this.f46422b.length) {
                this.f46422b = Arrays.copyOf(this.f46422b, i);
            }
            System.arraycopy(hgVar.f46422b, 0, this.f46422b, this.f46423c, hgVar.f46423c);
            this.f46423c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo42738c();
        for (int i = 0; i < this.f46423c; i++) {
            if (obj.equals(Integer.valueOf(this.f46422b[i]))) {
                System.arraycopy(this.f46422b, i + 1, this.f46422b, i, (this.f46423c - i) - 1);
                this.f46423c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m54178d(int i) {
        if (i < 0 || i >= this.f46423c) {
            throw new IndexOutOfBoundsException(m54179e(i));
        }
    }

    /* renamed from: e */
    private final String m54179e(int i) {
        int i2 = this.f46423c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo42738c();
        m54178d(i);
        int i2 = this.f46422b[i];
        this.f46422b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        mo42738c();
        m54178d(i);
        int i2 = this.f46422b[i];
        if (i < this.f46423c - 1) {
            System.arraycopy(this.f46422b, i + 1, this.f46422b, i, (this.f46423c - i) - 1);
        }
        this.f46423c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m54177a(i, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16590hl mo42747a(int i) {
        if (i >= this.f46423c) {
            return new C16585hg(Arrays.copyOf(this.f46422b, i), this.f46423c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo42944b(i));
    }

    static {
        C16585hg hgVar = new C16585hg();
        f46421a = hgVar;
        hgVar.mo42737b();
    }
}
