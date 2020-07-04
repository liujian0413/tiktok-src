package com.google.android.gms.tagmanager;

/* renamed from: com.google.android.gms.tagmanager.bg */
final class C17016bg extends Number implements Comparable<C17016bg> {

    /* renamed from: a */
    private double f47658a;

    /* renamed from: b */
    private long f47659b;

    /* renamed from: c */
    private boolean f47660c = true;

    private C17016bg(long j) {
        this.f47659b = j;
    }

    /* renamed from: a */
    public static C17016bg m56485a(long j) {
        return new C17016bg(0);
    }

    public final String toString() {
        return this.f47660c ? Long.toString(this.f47659b) : Double.toString(this.f47658a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17016bg) && compareTo((C17016bg) obj) == 0;
    }

    public final int hashCode() {
        return new Long(longValue()).hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C17016bg bgVar) {
        if (!this.f47660c || !bgVar.f47660c) {
            return Double.compare(doubleValue(), bgVar.doubleValue());
        }
        return new Long(this.f47659b).compareTo(Long.valueOf(bgVar.f47659b));
    }

    /* renamed from: a */
    public final boolean mo44232a() {
        return !this.f47660c;
    }

    /* renamed from: b */
    public final boolean mo44233b() {
        return this.f47660c;
    }

    public final double doubleValue() {
        return this.f47660c ? (double) this.f47659b : this.f47658a;
    }

    public final float floatValue() {
        return (float) doubleValue();
    }

    public final long longValue() {
        return this.f47660c ? this.f47659b : (long) this.f47658a;
    }

    public final int intValue() {
        return (int) longValue();
    }

    public final short shortValue() {
        return (short) ((int) longValue());
    }

    public final byte byteValue() {
        return (byte) ((int) longValue());
    }
}
