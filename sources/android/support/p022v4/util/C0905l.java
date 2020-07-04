package android.support.p022v4.util;

/* renamed from: android.support.v4.util.l */
public final class C0905l<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f3163a = new Object();

    /* renamed from: b */
    private boolean f3164b;

    /* renamed from: c */
    private int[] f3165c;

    /* renamed from: d */
    private Object[] f3166d;

    /* renamed from: e */
    private int f3167e;

    public C0905l() {
        this(10);
    }

    /* renamed from: b */
    public final int mo3435b() {
        if (this.f3164b) {
            m3855d();
        }
        return this.f3167e;
    }

    /* renamed from: c */
    public final void mo3438c() {
        int i = this.f3167e;
        Object[] objArr = this.f3166d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3167e = 0;
        this.f3164b = false;
    }

    /* renamed from: d */
    private void m3855d() {
        int i = this.f3167e;
        int[] iArr = this.f3165c;
        Object[] objArr = this.f3166d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3163a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3164b = false;
        this.f3167e = i2;
    }

    /* renamed from: a */
    public final C0905l<E> clone() {
        try {
            C0905l<E> lVar = (C0905l) super.clone();
            lVar.f3165c = (int[]) this.f3165c.clone();
            lVar.f3166d = (Object[]) this.f3166d.clone();
            return lVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        if (mo3435b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3167e * 28);
        sb.append('{');
        for (int i = 0; i < this.f3167e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo3442d(i));
            sb.append('=');
            Object e = mo3443e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo3436b(int i) {
        m3856g(i);
    }

    /* renamed from: a */
    public final E mo3433a(int i) {
        return mo3434a(i, null);
    }

    /* renamed from: d */
    public final int mo3442d(int i) {
        if (this.f3164b) {
            m3855d();
        }
        return this.f3165c[i];
    }

    /* renamed from: e */
    public final E mo3443e(int i) {
        if (this.f3164b) {
            m3855d();
        }
        return this.f3166d[i];
    }

    /* renamed from: f */
    public final int mo3444f(int i) {
        if (this.f3164b) {
            m3855d();
        }
        return C0890b.m3785a(this.f3165c, this.f3167e, i);
    }

    public C0905l(int i) {
        if (i == 0) {
            this.f3165c = C0890b.f3122a;
            this.f3166d = C0890b.f3124c;
        } else {
            int a = C0890b.m3784a(i);
            this.f3165c = new int[a];
            this.f3166d = new Object[a];
        }
        this.f3167e = 0;
    }

    /* renamed from: g */
    private void m3856g(int i) {
        int a = C0890b.m3785a(this.f3165c, this.f3167e, i);
        if (a >= 0 && this.f3166d[a] != f3163a) {
            this.f3166d[a] = f3163a;
            this.f3164b = true;
        }
    }

    /* renamed from: a */
    public final int mo3431a(E e) {
        if (this.f3164b) {
            m3855d();
        }
        for (int i = 0; i < this.f3167e; i++) {
            if (this.f3166d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final void mo3439c(int i) {
        if (this.f3166d[i] != f3163a) {
            this.f3166d[i] = f3163a;
            this.f3164b = true;
        }
    }

    /* renamed from: a */
    public final E mo3434a(int i, E e) {
        int a = C0890b.m3785a(this.f3165c, this.f3167e, i);
        if (a < 0 || this.f3166d[a] == f3163a) {
            return e;
        }
        return this.f3166d[a];
    }

    /* renamed from: c */
    public final void mo3440c(int i, E e) {
        if (this.f3167e == 0 || i > this.f3165c[this.f3167e - 1]) {
            if (this.f3164b && this.f3167e >= this.f3165c.length) {
                m3855d();
            }
            int i2 = this.f3167e;
            if (i2 >= this.f3165c.length) {
                int a = C0890b.m3784a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                System.arraycopy(this.f3165c, 0, iArr, 0, this.f3165c.length);
                System.arraycopy(this.f3166d, 0, objArr, 0, this.f3166d.length);
                this.f3165c = iArr;
                this.f3166d = objArr;
            }
            this.f3165c[i2] = i;
            this.f3166d[i2] = e;
            this.f3167e = i2 + 1;
            return;
        }
        mo3437b(i, e);
    }

    /* renamed from: b */
    public final void mo3437b(int i, E e) {
        int a = C0890b.m3785a(this.f3165c, this.f3167e, i);
        if (a >= 0) {
            this.f3166d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 >= this.f3167e || this.f3166d[i2] != f3163a) {
            if (this.f3164b && this.f3167e >= this.f3165c.length) {
                m3855d();
                i2 = C0890b.m3785a(this.f3165c, this.f3167e, i) ^ -1;
            }
            if (this.f3167e >= this.f3165c.length) {
                int a2 = C0890b.m3784a(this.f3167e + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                System.arraycopy(this.f3165c, 0, iArr, 0, this.f3165c.length);
                System.arraycopy(this.f3166d, 0, objArr, 0, this.f3166d.length);
                this.f3165c = iArr;
                this.f3166d = objArr;
            }
            if (this.f3167e - i2 != 0) {
                int[] iArr2 = this.f3165c;
                int i3 = i2 + 1;
                System.arraycopy(iArr2, i2, iArr2, i3, this.f3167e - i2);
                Object[] objArr2 = this.f3166d;
                System.arraycopy(objArr2, i2, objArr2, i3, this.f3167e - i2);
            }
            this.f3165c[i2] = i;
            this.f3166d[i2] = e;
            this.f3167e++;
            return;
        }
        this.f3165c[i2] = i;
        this.f3166d[i2] = e;
    }
}
