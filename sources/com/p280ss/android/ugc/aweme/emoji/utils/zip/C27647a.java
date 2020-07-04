package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.a */
public abstract class C27647a implements C27668s {

    /* renamed from: a */
    public long f72837a;

    /* renamed from: b */
    private byte[] f72838b;

    /* renamed from: c */
    private byte[] f72839c;

    protected C27647a() {
    }

    /* renamed from: d */
    public final byte[] mo71048d() {
        return mo71046b();
    }

    /* renamed from: e */
    public final C27679w mo71049e() {
        return mo71047c();
    }

    /* renamed from: c */
    public final C27679w mo71047c() {
        if (this.f72839c == null) {
            m90637f();
        }
        return new C27679w(this.f72839c.length);
    }

    public final byte[] aN_() {
        if (this.f72838b == null) {
            return null;
        }
        byte[] bArr = new byte[this.f72838b.length];
        System.arraycopy(this.f72838b, 0, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: b */
    public final byte[] mo71046b() {
        if (this.f72839c == null) {
            m90637f();
        }
        if (this.f72839c == null) {
            return null;
        }
        byte[] bArr = new byte[this.f72839c.length];
        System.arraycopy(this.f72839c, 0, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: f */
    private void m90637f() {
        if (this.f72838b != null) {
            this.f72839c = new byte[(this.f72838b.length + 5)];
            this.f72839c[0] = 1;
            System.arraycopy(C27676u.m90767a(this.f72837a), 0, this.f72839c, 1, 4);
            System.arraycopy(this.f72838b, 0, this.f72839c, 5, this.f72838b.length);
        }
    }

    /* renamed from: a */
    public final void mo71044a(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 >= 5) {
            byte b = bArr[i];
            if (b == 1) {
                this.f72837a = C27676u.m90768b(bArr, i + 1);
                int i3 = i2 - 5;
                this.f72838b = new byte[i3];
                System.arraycopy(bArr, i + 5, this.f72838b, 0, i3);
                this.f72839c = null;
                return;
            }
            StringBuilder sb = new StringBuilder("Unsupported version [");
            sb.append(b);
            sb.append("] for UniCode path extra data.");
            throw new ZipException(sb.toString());
        }
        throw new ZipException("UniCode path extra data must have at least 5 bytes.");
    }
}
