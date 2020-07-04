package com.p280ss.android.ugc.aweme.emoji.utils.zip;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.l */
public final class C27660l implements C27649c {

    /* renamed from: a */
    private static final C27679w f72868a = new C27679w(44225);

    /* renamed from: b */
    private byte[] f72869b;

    /* renamed from: c */
    private byte[] f72870c;

    /* renamed from: a */
    public final C27679w mo71050a() {
        return f72868a;
    }

    /* renamed from: d */
    public final byte[] mo71048d() {
        return C27680x.m90814a(this.f72869b);
    }

    /* renamed from: b */
    public final byte[] mo71046b() {
        if (this.f72870c == null) {
            return mo71048d();
        }
        return C27680x.m90814a(this.f72870c);
    }

    /* renamed from: e */
    public final C27679w mo71049e() {
        int i;
        if (this.f72869b == null) {
            i = 0;
        } else {
            i = this.f72869b.length;
        }
        return new C27679w(i);
    }

    /* renamed from: c */
    public final C27679w mo71047c() {
        if (this.f72870c == null) {
            return mo71049e();
        }
        return new C27679w(this.f72870c.length);
    }

    /* renamed from: a */
    public final void mo71044a(byte[] bArr, int i, int i2) {
        this.f72869b = new byte[i2];
        System.arraycopy(bArr, i, this.f72869b, 0, i2);
    }

    /* renamed from: b */
    public final void mo71052b(byte[] bArr, int i, int i2) {
        this.f72870c = new byte[i2];
        System.arraycopy(bArr, i, this.f72870c, 0, i2);
        if (this.f72869b == null) {
            mo71044a(bArr, i, i2);
        }
    }
}
