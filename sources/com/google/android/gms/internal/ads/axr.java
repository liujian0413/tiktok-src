package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class axr extends awf<Float> implements ayc<Float>, azn, RandomAccess {

    /* renamed from: a */
    private static final axr f41189a;

    /* renamed from: b */
    private float[] f41190b;

    /* renamed from: c */
    private int f41191c;

    axr() {
        this(new float[10], 0);
    }

    private axr(float[] fArr, int i) {
        this.f41190b = fArr;
        this.f41191c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo40096c();
        if (i2 >= i) {
            float[] fArr = this.f41190b;
            System.arraycopy(fArr, i2, fArr, i, this.f41191c - i2);
            this.f41191c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axr)) {
            return super.equals(obj);
        }
        axr axr = (axr) obj;
        if (this.f41191c != axr.f41191c) {
            return false;
        }
        float[] fArr = axr.f41190b;
        for (int i = 0; i < this.f41191c; i++) {
            if (Float.floatToIntBits(this.f41190b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f41191c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f41190b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f41191c;
    }

    /* renamed from: a */
    public final void mo40274a(float f) {
        m47684a(this.f41191c, f);
    }

    /* renamed from: a */
    private final void m47684a(int i, float f) {
        mo40096c();
        if (i < 0 || i > this.f41191c) {
            throw new IndexOutOfBoundsException(m47686c(i));
        }
        if (this.f41191c < this.f41190b.length) {
            float[] fArr = this.f41190b;
            System.arraycopy(fArr, i, fArr, i + 1, this.f41191c - i);
        } else {
            float[] fArr2 = new float[(((this.f41191c * 3) / 2) + 1)];
            System.arraycopy(this.f41190b, 0, fArr2, 0, i);
            System.arraycopy(this.f41190b, i, fArr2, i + 1, this.f41191c - i);
            this.f41190b = fArr2;
        }
        this.f41190b[i] = f;
        this.f41191c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo40096c();
        axw.m47743a(collection);
        if (!(collection instanceof axr)) {
            return super.addAll(collection);
        }
        axr axr = (axr) collection;
        if (axr.f41191c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f41191c >= axr.f41191c) {
            int i = this.f41191c + axr.f41191c;
            if (i > this.f41190b.length) {
                this.f41190b = Arrays.copyOf(this.f41190b, i);
            }
            System.arraycopy(axr.f41190b, 0, this.f41190b, this.f41191c, axr.f41191c);
            this.f41191c = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        mo40096c();
        for (int i = 0; i < this.f41191c; i++) {
            if (obj.equals(Float.valueOf(this.f41190b[i]))) {
                System.arraycopy(this.f41190b, i + 1, this.f41190b, i, (this.f41191c - i) - 1);
                this.f41191c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m47685b(int i) {
        if (i < 0 || i >= this.f41191c) {
            throw new IndexOutOfBoundsException(m47686c(i));
        }
    }

    /* renamed from: c */
    private final String m47686c(int i) {
        int i2 = this.f41191c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo40096c();
        m47685b(i);
        float f = this.f41190b[i];
        this.f41190b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        mo40096c();
        m47685b(i);
        float f = this.f41190b[i];
        if (i < this.f41191c - 1) {
            System.arraycopy(this.f41190b, i + 1, this.f41190b, i, (this.f41191c - i) - 1);
        }
        this.f41191c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m47684a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ ayc mo40105a(int i) {
        if (i >= this.f41191c) {
            return new axr(Arrays.copyOf(this.f41190b, i), this.f41191c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m47685b(i);
        return Float.valueOf(this.f41190b[i]);
    }

    static {
        axr axr = new axr();
        f41189a = axr;
        axr.mo40095b();
    }
}
