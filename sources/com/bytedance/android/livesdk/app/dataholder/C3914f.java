package com.bytedance.android.livesdk.app.dataholder;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.f */
public final class C3914f implements Cloneable {

    /* renamed from: a */
    public int f11729a;

    /* renamed from: b */
    private long[] f11730b;

    /* renamed from: c */
    private long[] f11731c;

    public C3914f() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C3914f clone() {
        try {
            C3914f fVar = (C3914f) super.clone();
            try {
                fVar.f11730b = (long[]) this.f11730b.clone();
                fVar.f11731c = (long[]) this.f11731c.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f11729a <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11729a * 28);
        sb.append('{');
        for (int i = 0; i < this.f11729a; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m13808b(i));
            sb.append('=');
            sb.append(m13809c(i));
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    private long m13808b(int i) {
        return this.f11730b[i];
    }

    /* renamed from: c */
    private long m13809c(int i) {
        return this.f11731c[i];
    }

    /* renamed from: a */
    public final void mo11462a(long j) {
        int a = C3911c.m13794a(this.f11730b, this.f11729a, j);
        if (a >= 0) {
            m13807a(a);
        }
    }

    private C3914f(int i) {
        int a = C3910b.m13792a(10);
        this.f11730b = new long[a];
        this.f11731c = new long[a];
        this.f11729a = 0;
    }

    /* renamed from: a */
    private void m13807a(int i) {
        int i2 = i + 1;
        System.arraycopy(this.f11730b, i2, this.f11730b, i, this.f11729a - i2);
        System.arraycopy(this.f11731c, i2, this.f11731c, i, this.f11729a - i2);
        this.f11729a--;
    }

    /* renamed from: a */
    public final long mo11461a(long j, long j2) {
        int a = C3911c.m13794a(this.f11730b, this.f11729a, j);
        if (a < 0) {
            return 0;
        }
        return this.f11731c[a];
    }
}
