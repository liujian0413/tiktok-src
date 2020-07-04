package android.support.p022v4.util;

/* renamed from: android.support.v4.util.e */
public final class C0893e<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f3127a = new Object();

    /* renamed from: b */
    private boolean f3128b;

    /* renamed from: c */
    private long[] f3129c;

    /* renamed from: d */
    private Object[] f3130d;

    /* renamed from: e */
    private int f3131e;

    public C0893e() {
        this(10);
    }

    /* renamed from: b */
    public final int mo3330b() {
        if (this.f3128b) {
            m3792d();
        }
        return this.f3131e;
    }

    /* renamed from: c */
    public final void mo3335c() {
        int i = this.f3131e;
        Object[] objArr = this.f3130d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3131e = 0;
        this.f3128b = false;
    }

    /* renamed from: d */
    private void m3792d() {
        int i = this.f3131e;
        long[] jArr = this.f3129c;
        Object[] objArr = this.f3130d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3127a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3128b = false;
        this.f3131e = i2;
    }

    /* renamed from: a */
    public final C0893e<E> clone() {
        try {
            C0893e<E> eVar = (C0893e) super.clone();
            eVar.f3129c = (long[]) this.f3129c.clone();
            eVar.f3130d = (Object[]) this.f3130d.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        if (mo3330b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3131e * 28);
        sb.append('{');
        for (int i = 0; i < this.f3131e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo3331b(i));
            sb.append('=');
            Object c = mo3334c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo3336c(long j) {
        mo3332b(j);
    }

    /* renamed from: a */
    public final E mo3327a(long j) {
        return mo3328a(j, null);
    }

    /* renamed from: c */
    public final E mo3334c(int i) {
        if (this.f3128b) {
            m3792d();
        }
        return this.f3130d[i];
    }

    /* renamed from: d */
    public final int mo3339d(long j) {
        if (this.f3128b) {
            m3792d();
        }
        return C0890b.m3786a(this.f3129c, this.f3131e, j);
    }

    public C0893e(int i) {
        if (i == 0) {
            this.f3129c = C0890b.f3123b;
            this.f3130d = C0890b.f3124c;
        } else {
            int b = C0890b.m3788b(i);
            this.f3129c = new long[b];
            this.f3130d = new Object[b];
        }
        this.f3131e = 0;
    }

    /* renamed from: b */
    public final long mo3331b(int i) {
        if (this.f3128b) {
            m3792d();
        }
        return this.f3129c[i];
    }

    /* renamed from: b */
    public final void mo3332b(long j) {
        int a = C0890b.m3786a(this.f3129c, this.f3131e, j);
        if (a >= 0 && this.f3130d[a] != f3127a) {
            this.f3130d[a] = f3127a;
            this.f3128b = true;
        }
    }

    /* renamed from: a */
    public final void mo3329a(int i) {
        if (this.f3130d[i] != f3127a) {
            this.f3130d[i] = f3127a;
            this.f3128b = true;
        }
    }

    /* renamed from: a */
    public final E mo3328a(long j, E e) {
        int a = C0890b.m3786a(this.f3129c, this.f3131e, j);
        if (a < 0 || this.f3130d[a] == f3127a) {
            return e;
        }
        return this.f3130d[a];
    }

    /* renamed from: c */
    public final void mo3337c(long j, E e) {
        if (this.f3131e == 0 || j > this.f3129c[this.f3131e - 1]) {
            if (this.f3128b && this.f3131e >= this.f3129c.length) {
                m3792d();
            }
            int i = this.f3131e;
            if (i >= this.f3129c.length) {
                int b = C0890b.m3788b(i + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f3129c, 0, jArr, 0, this.f3129c.length);
                System.arraycopy(this.f3130d, 0, objArr, 0, this.f3130d.length);
                this.f3129c = jArr;
                this.f3130d = objArr;
            }
            this.f3129c[i] = j;
            this.f3130d[i] = e;
            this.f3131e = i + 1;
            return;
        }
        mo3333b(j, e);
    }

    /* renamed from: b */
    public final void mo3333b(long j, E e) {
        int a = C0890b.m3786a(this.f3129c, this.f3131e, j);
        if (a >= 0) {
            this.f3130d[a] = e;
            return;
        }
        int i = a ^ -1;
        if (i >= this.f3131e || this.f3130d[i] != f3127a) {
            if (this.f3128b && this.f3131e >= this.f3129c.length) {
                m3792d();
                i = C0890b.m3786a(this.f3129c, this.f3131e, j) ^ -1;
            }
            if (this.f3131e >= this.f3129c.length) {
                int b = C0890b.m3788b(this.f3131e + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f3129c, 0, jArr, 0, this.f3129c.length);
                System.arraycopy(this.f3130d, 0, objArr, 0, this.f3130d.length);
                this.f3129c = jArr;
                this.f3130d = objArr;
            }
            if (this.f3131e - i != 0) {
                long[] jArr2 = this.f3129c;
                int i2 = i + 1;
                System.arraycopy(jArr2, i, jArr2, i2, this.f3131e - i);
                Object[] objArr2 = this.f3130d;
                System.arraycopy(objArr2, i, objArr2, i2, this.f3131e - i);
            }
            this.f3129c[i] = j;
            this.f3130d[i] = e;
            this.f3131e++;
            return;
        }
        this.f3129c[i] = j;
        this.f3130d[i] = e;
    }
}
