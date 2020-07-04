package com.p280ss.android.http.legacy.p877d;

/* renamed from: com.ss.android.http.legacy.d.a */
public final class C19573a {

    /* renamed from: a */
    public byte[] f52944a;

    /* renamed from: b */
    public int f52945b;

    /* renamed from: a */
    public final byte[] mo51733a() {
        byte[] bArr = new byte[this.f52945b];
        if (this.f52945b > 0) {
            System.arraycopy(this.f52944a, 0, bArr, 0, this.f52945b);
        }
        return bArr;
    }

    public C19573a(int i) {
        if (i >= 0) {
            this.f52944a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    private void m64480a(int i) {
        byte[] bArr = new byte[Math.max(this.f52944a.length << 1, i)];
        System.arraycopy(this.f52944a, 0, bArr, 0, this.f52945b);
        this.f52944a = bArr;
    }

    /* renamed from: a */
    public final void mo51732a(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int i3 = i2 + 0;
            if (i3 >= 0 && i3 <= 4096) {
                if (i2 != 0) {
                    int i4 = this.f52945b + i2;
                    if (i4 > this.f52944a.length) {
                        m64480a(i4);
                    }
                    System.arraycopy(bArr, 0, this.f52944a, this.f52945b, i2);
                    this.f52945b = i4;
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
