package com.bytedance.android.livesdk.utils;

/* renamed from: com.bytedance.android.livesdk.utils.ah */
public final class C9039ah<E> {

    /* renamed from: a */
    public int f24707a;

    /* renamed from: b */
    private Object[] f24708b = new Object[(this.f24709c + 1)];

    /* renamed from: c */
    private int f24709c;

    /* renamed from: d */
    private C9040a f24710d;

    /* renamed from: com.bytedance.android.livesdk.utils.ah$a */
    public interface C9040a<E> {
        /* renamed from: a */
        boolean mo14040a(E e, E e2);
    }

    /* renamed from: d */
    private void m27002d() {
        int i = this.f24707a;
        while (true) {
            int i2 = i;
            i /= 2;
            if (i > 0 && this.f24710d.mo14040a(this.f24708b[i2], this.f24708b[i])) {
                m27000a(i, i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final E mo22235a() {
        if (this.f24707a <= 0) {
            return null;
        }
        E e = this.f24708b[1];
        Object[] objArr = this.f24708b;
        Object[] objArr2 = this.f24708b;
        int i = this.f24707a;
        this.f24707a = i - 1;
        objArr[1] = objArr2[i];
        m27001c();
        return e;
    }

    /* renamed from: b */
    public final void mo22237b() {
        for (int i = 0; i < this.f24707a; i++) {
            this.f24708b[i] = null;
        }
        this.f24707a = 0;
    }

    /* renamed from: c */
    private void m27001c() {
        int i = 2;
        int i2 = 1;
        while (i <= this.f24707a) {
            int i3 = i + 1;
            if (i3 <= this.f24707a && this.f24710d.mo14040a(this.f24708b[i3], this.f24708b[i])) {
                i = i3;
            }
            if (this.f24710d.mo14040a(this.f24708b[i], this.f24708b[i2])) {
                m27000a(i2, i);
                i2 = i;
                i *= 2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo22236a(Object obj) {
        if (this.f24707a != this.f24709c) {
            this.f24707a++;
            this.f24708b[this.f24707a] = obj;
            m27002d();
        } else if (this.f24710d.mo14040a(obj, this.f24708b[1])) {
            return false;
        } else {
            this.f24708b[1] = obj;
            m27001c();
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo22238b(Object obj) {
        int i = 0;
        while (i < this.f24707a) {
            i++;
            if (this.f24708b[i].equals(obj)) {
                Object[] objArr = this.f24708b;
                int i2 = this.f24707a;
                this.f24707a = i2 - 1;
                objArr[i] = objArr[i2];
                m27001c();
                return true;
            }
        }
        return false;
    }

    public C9039ah(int i, C9040a aVar) {
        this.f24709c = i;
        this.f24710d = aVar;
    }

    /* renamed from: a */
    private void m27000a(int i, int i2) {
        Object obj = this.f24708b[i];
        Object[] objArr = this.f24708b;
        objArr[i] = objArr[i2];
        this.f24708b[i2] = obj;
    }
}
