package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.n */
public class C27662n implements C27649c {

    /* renamed from: a */
    static final C27679w f72874a = new C27679w(1);

    /* renamed from: f */
    private static final byte[] f72875f = new byte[0];

    /* renamed from: b */
    public C27663o f72876b;

    /* renamed from: c */
    public C27663o f72877c;

    /* renamed from: d */
    public C27663o f72878d;

    /* renamed from: e */
    public C27676u f72879e;

    /* renamed from: g */
    private byte[] f72880g;

    /* renamed from: a */
    public final C27679w mo71050a() {
        return f72874a;
    }

    /* renamed from: e */
    public final C27679w mo71049e() {
        int i;
        if (this.f72876b != null) {
            i = 16;
        } else {
            i = 0;
        }
        return new C27679w(i);
    }

    /* renamed from: c */
    public final C27679w mo71047c() {
        int i;
        int i2;
        int i3 = 8;
        int i4 = 0;
        if (this.f72876b != null) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f72877c != null) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        int i5 = i + i2;
        if (this.f72878d == null) {
            i3 = 0;
        }
        int i6 = i5 + i3;
        if (this.f72879e != null) {
            i4 = 4;
        }
        return new C27679w(i6 + i4);
    }

    /* renamed from: d */
    public final byte[] mo71048d() {
        if (this.f72876b == null && this.f72877c == null) {
            return f72875f;
        }
        if (this.f72876b == null || this.f72877c == null) {
            throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
        }
        byte[] bArr = new byte[16];
        m90701a(bArr);
        return bArr;
    }

    /* renamed from: b */
    public final byte[] mo71046b() {
        byte[] bArr = new byte[mo71047c().f72965a];
        int a = m90701a(bArr);
        if (this.f72878d != null) {
            System.arraycopy(this.f72878d.mo71065a(), 0, bArr, a, 8);
            a += 8;
        }
        if (this.f72879e != null) {
            System.arraycopy(this.f72879e.mo71099a(), 0, bArr, a, 4);
        }
        return bArr;
    }

    /* renamed from: a */
    private int m90701a(byte[] bArr) {
        int i;
        if (this.f72876b != null) {
            System.arraycopy(this.f72876b.mo71065a(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        if (this.f72877c == null) {
            return i;
        }
        System.arraycopy(this.f72877c.mo71065a(), 0, bArr, i, 8);
        return i + 8;
    }

    /* renamed from: b */
    public final void mo71052b(byte[] bArr, int i, int i2) throws ZipException {
        this.f72880g = new byte[i2];
        System.arraycopy(bArr, i, this.f72880g, 0, i2);
        if (i2 >= 28) {
            mo71044a(bArr, i, i2);
        } else if (i2 == 24) {
            this.f72876b = new C27663o(bArr, i);
            int i3 = i + 8;
            this.f72877c = new C27663o(bArr, i3);
            this.f72878d = new C27663o(bArr, i3 + 8);
        } else {
            if (i2 % 8 == 4) {
                this.f72879e = new C27676u(bArr, (i + i2) - 4);
            }
        }
    }

    /* renamed from: a */
    public final void mo71044a(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            if (i2 >= 16) {
                this.f72876b = new C27663o(bArr, i);
                int i3 = i + 8;
                this.f72877c = new C27663o(bArr, i3);
                int i4 = i3 + 8;
                int i5 = i2 - 16;
                if (i5 >= 8) {
                    this.f72878d = new C27663o(bArr, i4);
                    i4 += 8;
                    i5 -= 8;
                }
                if (i5 >= 4) {
                    this.f72879e = new C27676u(bArr, i4);
                }
                return;
            }
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
    }

    /* renamed from: a */
    public final void mo71064a(boolean z, boolean z2, boolean z3, boolean z4) throws ZipException {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f72880g != null) {
            int i5 = 0;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (z3) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (z4) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (this.f72880g.length >= i8) {
                if (z) {
                    this.f72876b = new C27663o(this.f72880g, 0);
                    i5 = 8;
                }
                if (z2) {
                    this.f72877c = new C27663o(this.f72880g, i5);
                    i5 += 8;
                }
                if (z3) {
                    this.f72878d = new C27663o(this.f72880g, i5);
                    i5 += 8;
                }
                if (z4) {
                    this.f72879e = new C27676u(this.f72880g, i5);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length ");
            sb.append(i8);
            sb.append(" but is ");
            sb.append(this.f72880g.length);
            throw new ZipException(sb.toString());
        }
    }
}
