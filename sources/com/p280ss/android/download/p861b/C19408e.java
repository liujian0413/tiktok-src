package com.p280ss.android.download.p861b;

/* renamed from: com.ss.android.download.b.e */
public final class C19408e implements Cloneable {

    /* renamed from: a */
    public int f52520a;

    /* renamed from: b */
    private long[] f52521b;

    /* renamed from: c */
    private long[] f52522c;

    public C19408e() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C19408e clone() {
        try {
            C19408e eVar = (C19408e) super.clone();
            try {
                eVar.f52521b = (long[]) this.f52521b.clone();
                eVar.f52522c = (long[]) this.f52522c.clone();
                return eVar;
            } catch (CloneNotSupportedException unused) {
                return eVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f52520a <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f52520a * 28);
        sb.append('{');
        for (int i = 0; i < this.f52520a; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo51422a(i));
            sb.append('=');
            sb.append(m63764c(i));
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    private long m63764c(int i) {
        return this.f52522c[i];
    }

    /* renamed from: a */
    public final long mo51422a(int i) {
        return this.f52521b[i];
    }

    /* renamed from: a */
    public final long mo51423a(long j) {
        return m63762b(j, 0);
    }

    /* renamed from: b */
    public final void mo51425b(long j) {
        int a = C19404b.m63752a(this.f52521b, this.f52520a, j);
        if (a >= 0) {
            m63763b(a);
        }
    }

    private C19408e(int i) {
        int a = C19403a.m63750a(10);
        this.f52521b = new long[a];
        this.f52522c = new long[a];
        this.f52520a = 0;
    }

    /* renamed from: d */
    private void m63765d(int i) {
        int a = C19403a.m63750a(i);
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        System.arraycopy(this.f52521b, 0, jArr, 0, this.f52521b.length);
        System.arraycopy(this.f52522c, 0, jArr2, 0, this.f52522c.length);
        this.f52521b = jArr;
        this.f52522c = jArr2;
    }

    /* renamed from: b */
    private void m63763b(int i) {
        int i2 = i + 1;
        System.arraycopy(this.f52521b, i2, this.f52521b, i, this.f52520a - i2);
        System.arraycopy(this.f52522c, i2, this.f52522c, i, this.f52520a - i2);
        this.f52520a--;
    }

    /* renamed from: b */
    private long m63762b(long j, long j2) {
        int a = C19404b.m63752a(this.f52521b, this.f52520a, j);
        if (a < 0) {
            return 0;
        }
        return this.f52522c[a];
    }

    /* renamed from: a */
    public final void mo51424a(long j, long j2) {
        int a = C19404b.m63752a(this.f52521b, this.f52520a, j);
        if (a >= 0) {
            this.f52522c[a] = j2;
            return;
        }
        int i = a ^ -1;
        if (this.f52520a >= this.f52521b.length) {
            m63765d(this.f52520a + 1);
        }
        if (this.f52520a - i != 0) {
            long[] jArr = this.f52521b;
            int i2 = i + 1;
            System.arraycopy(jArr, i, jArr, i2, this.f52520a - i);
            long[] jArr2 = this.f52522c;
            System.arraycopy(jArr2, i, jArr2, i2, this.f52520a - i);
        }
        this.f52521b[i] = j;
        this.f52522c[i] = j2;
        this.f52520a++;
    }
}
