package com.p280ss.android.ugc.aweme.emoji.utils.zip;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.m */
public final class C27661m implements C27649c {

    /* renamed from: a */
    public C27679w f72871a;

    /* renamed from: b */
    private byte[] f72872b;

    /* renamed from: c */
    private byte[] f72873c;

    /* renamed from: a */
    public final C27679w mo71050a() {
        return this.f72871a;
    }

    /* renamed from: d */
    public final byte[] mo71048d() {
        return C27680x.m90814a(this.f72872b);
    }

    /* renamed from: b */
    public final byte[] mo71046b() {
        if (this.f72873c != null) {
            return C27680x.m90814a(this.f72873c);
        }
        return mo71048d();
    }

    /* renamed from: e */
    public final C27679w mo71049e() {
        return new C27679w(this.f72872b.length);
    }

    /* renamed from: c */
    public final C27679w mo71047c() {
        if (this.f72873c != null) {
            return new C27679w(this.f72873c.length);
        }
        return mo71049e();
    }

    /* renamed from: a */
    private void m90692a(byte[] bArr) {
        this.f72872b = C27680x.m90814a(bArr);
    }

    /* renamed from: b */
    private void m90693b(byte[] bArr) {
        this.f72873c = C27680x.m90814a(bArr);
    }

    /* renamed from: a */
    public final void mo71044a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        m90692a(bArr2);
    }

    /* renamed from: b */
    public final void mo71052b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        m90693b(bArr2);
        if (this.f72872b == null) {
            m90692a(bArr2);
        }
    }
}
