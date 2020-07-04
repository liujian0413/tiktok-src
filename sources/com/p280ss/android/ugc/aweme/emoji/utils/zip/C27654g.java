package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.g */
public final class C27654g implements C27668s {

    /* renamed from: a */
    private static final C27679w f72857a = new C27679w(51966);

    /* renamed from: b */
    private static final C27679w f72858b = new C27679w(0);

    /* renamed from: c */
    private static final byte[] f72859c = new byte[0];

    /* renamed from: d */
    private static final C27654g f72860d = new C27654g();

    /* renamed from: a */
    public final C27679w mo71050a() {
        return f72857a;
    }

    /* renamed from: b */
    public final byte[] mo71046b() {
        return f72859c;
    }

    /* renamed from: c */
    public final C27679w mo71047c() {
        return f72858b;
    }

    /* renamed from: d */
    public final byte[] mo71048d() {
        return f72859c;
    }

    /* renamed from: e */
    public final C27679w mo71049e() {
        return f72858b;
    }

    /* renamed from: a */
    public final void mo71044a(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
