package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hc */
final class C16576hc extends C16538ft<Float> implements C16590hl<Float>, C16627iv, RandomAccess {

    /* renamed from: a */
    private static final C16576hc f46397a;

    /* renamed from: b */
    private float[] f46398b;

    /* renamed from: c */
    private int f46399c;

    C16576hc() {
        this(new float[10], 0);
    }

    private C16576hc(float[] fArr, int i) {
        this.f46398b = fArr;
        this.f46399c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo42738c();
        if (i2 >= i) {
            float[] fArr = this.f46398b;
            System.arraycopy(fArr, i2, fArr, i, this.f46399c - i2);
            this.f46399c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16576hc)) {
            return super.equals(obj);
        }
        C16576hc hcVar = (C16576hc) obj;
        if (this.f46399c != hcVar.f46399c) {
            return false;
        }
        float[] fArr = hcVar.f46398b;
        for (int i = 0; i < this.f46399c; i++) {
            if (Float.floatToIntBits(this.f46398b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46399c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f46398b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f46399c;
    }

    /* renamed from: a */
    public final void mo42921a(float f) {
        m54137a(this.f46399c, f);
    }

    /* renamed from: a */
    private final void m54137a(int i, float f) {
        mo42738c();
        if (i < 0 || i > this.f46399c) {
            throw new IndexOutOfBoundsException(m54139c(i));
        }
        if (this.f46399c < this.f46398b.length) {
            float[] fArr = this.f46398b;
            System.arraycopy(fArr, i, fArr, i + 1, this.f46399c - i);
        } else {
            float[] fArr2 = new float[(((this.f46399c * 3) / 2) + 1)];
            System.arraycopy(this.f46398b, 0, fArr2, 0, i);
            System.arraycopy(this.f46398b, i, fArr2, i + 1, this.f46399c - i);
            this.f46398b = fArr2;
        }
        this.f46398b[i] = f;
        this.f46399c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo42738c();
        C16586hh.m54186a(collection);
        if (!(collection instanceof C16576hc)) {
            return super.addAll(collection);
        }
        C16576hc hcVar = (C16576hc) collection;
        if (hcVar.f46399c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f46399c >= hcVar.f46399c) {
            int i = this.f46399c + hcVar.f46399c;
            if (i > this.f46398b.length) {
                this.f46398b = Arrays.copyOf(this.f46398b, i);
            }
            System.arraycopy(hcVar.f46398b, 0, this.f46398b, this.f46399c, hcVar.f46399c);
            this.f46399c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo42738c();
        for (int i = 0; i < this.f46399c; i++) {
            if (obj.equals(Float.valueOf(this.f46398b[i]))) {
                System.arraycopy(this.f46398b, i + 1, this.f46398b, i, (this.f46399c - i) - 1);
                this.f46399c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m54138b(int i) {
        if (i < 0 || i >= this.f46399c) {
            throw new IndexOutOfBoundsException(m54139c(i));
        }
    }

    /* renamed from: c */
    private final String m54139c(int i) {
        int i2 = this.f46399c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo42738c();
        m54138b(i);
        float f = this.f46398b[i];
        this.f46398b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        mo42738c();
        m54138b(i);
        float f = this.f46398b[i];
        if (i < this.f46399c - 1) {
            System.arraycopy(this.f46398b, i + 1, this.f46398b, i, (this.f46399c - i) - 1);
        }
        this.f46399c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m54137a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C16590hl mo42747a(int i) {
        if (i >= this.f46399c) {
            return new C16576hc(Arrays.copyOf(this.f46398b, i), this.f46399c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m54138b(i);
        return Float.valueOf(this.f46398b[i]);
    }

    static {
        C16576hc hcVar = new C16576hc();
        f46397a = hcVar;
        hcVar.mo42737b();
    }
}
