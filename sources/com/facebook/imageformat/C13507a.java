package com.facebook.imageformat;

import com.facebook.common.internal.C13302e;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p689f.C13296c;
import com.facebook.imageformat.C13509c.C13510a;

/* renamed from: com.facebook.imageformat.a */
public final class C13507a implements C13510a {

    /* renamed from: b */
    private static final byte[] f35812b;

    /* renamed from: c */
    private static final int f35813c;

    /* renamed from: d */
    private static final byte[] f35814d;

    /* renamed from: e */
    private static final int f35815e;

    /* renamed from: f */
    private static final byte[] f35816f = C13512e.m39765a("GIF87a");

    /* renamed from: g */
    private static final byte[] f35817g = C13512e.m39765a("GIF89a");

    /* renamed from: h */
    private static final byte[] f35818h;

    /* renamed from: i */
    private static final int f35819i;

    /* renamed from: j */
    private static final byte[] f35820j;

    /* renamed from: k */
    private static final int f35821k;

    /* renamed from: l */
    private static final String[] f35822l = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};

    /* renamed from: m */
    private static final int f35823m;

    /* renamed from: a */
    final int f35824a = C13302e.m38928a(21, 20, f35813c, f35815e, 6, f35819i, f35821k, f35823m);

    /* renamed from: a */
    public final int mo33047a() {
        return this.f35824a;
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f35812b = bArr;
        f35813c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f35814d = bArr2;
        f35815e = bArr2.length;
        byte[] a = C13512e.m39765a("BM");
        f35818h = a;
        f35819i = a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f35820j = bArr3;
        f35821k = bArr3.length;
        StringBuilder sb = new StringBuilder("ftyp");
        sb.append(f35822l[0]);
        f35823m = C13512e.m39765a(sb.toString()).length;
    }

    /* renamed from: f */
    private static boolean m39746f(byte[] bArr, int i) {
        if (i < f35818h.length) {
            return false;
        }
        return C13512e.m39764a(bArr, f35818h);
    }

    /* renamed from: g */
    private static boolean m39747g(byte[] bArr, int i) {
        if (i < f35820j.length) {
            return false;
        }
        return C13512e.m39764a(bArr, f35820j);
    }

    /* renamed from: c */
    private static boolean m39743c(byte[] bArr, int i) {
        if (i < f35812b.length || !C13512e.m39764a(bArr, f35812b)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m39744d(byte[] bArr, int i) {
        if (i < f35814d.length || !C13512e.m39764a(bArr, f35814d)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m39745e(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        if (C13512e.m39764a(bArr, f35816f) || C13512e.m39764a(bArr, f35817g)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static C13509c m39742b(byte[] bArr, int i) {
        C13307g.m38943a(C13296c.m38904b(bArr, 0, i));
        if (C13296c.m38903b(bArr, 0)) {
            return C13508b.f35830f;
        }
        if (C13296c.m38905c(bArr, 0)) {
            return C13508b.f35831g;
        }
        if (!C13296c.m38899a(bArr, 0, i)) {
            return C13509c.f35837a;
        }
        if (C13296c.m38898a(bArr, 0)) {
            return C13508b.f35834j;
        }
        if (C13296c.m38906d(bArr, 0)) {
            return C13508b.f35833i;
        }
        return C13508b.f35832h;
    }

    /* renamed from: h */
    private static boolean m39748h(byte[] bArr, int i) {
        String[] strArr;
        if (i < f35823m || bArr[3] < 8) {
            return false;
        }
        for (String str : f35822l) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder("ftyp");
            sb.append(str);
            if (C13512e.m39763a(bArr, length, C13512e.m39765a(sb.toString()), f35823m) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C13509c mo33048a(byte[] bArr, int i) {
        C13307g.m38940a(bArr);
        if (C13296c.m38904b(bArr, 0, i)) {
            return m39742b(bArr, i);
        }
        if (m39743c(bArr, i)) {
            return C13508b.f35825a;
        }
        if (m39744d(bArr, i)) {
            return C13508b.f35826b;
        }
        if (m39745e(bArr, i)) {
            return C13508b.f35827c;
        }
        if (m39746f(bArr, i)) {
            return C13508b.f35828d;
        }
        if (m39747g(bArr, i)) {
            return C13508b.f35829e;
        }
        if (m39748h(bArr, i)) {
            return C13508b.f35835k;
        }
        return C13509c.f35837a;
    }
}
