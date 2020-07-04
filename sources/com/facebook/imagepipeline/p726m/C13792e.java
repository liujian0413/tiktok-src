package com.facebook.imagepipeline.p726m;

import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.nativecode.C13837c;

/* renamed from: com.facebook.imagepipeline.m.e */
public final class C13792e implements C13790c {

    /* renamed from: a */
    private final int f36582a;

    /* renamed from: b */
    private final boolean f36583b;

    /* renamed from: c */
    private final C13790c f36584c;

    /* renamed from: d */
    private final Integer f36585d;

    /* renamed from: b */
    private C13789b m40679b(C13509c cVar, boolean z) {
        if (this.f36584c == null) {
            return null;
        }
        return this.f36584c.mo33388a(cVar, z);
    }

    /* renamed from: c */
    private C13789b m40680c(C13509c cVar, boolean z) {
        return new C13837c(this.f36582a, this.f36583b).mo33388a(cVar, z);
    }

    /* renamed from: d */
    private C13789b m40681d(C13509c cVar, boolean z) {
        return new C13794g(this.f36582a).mo33388a(cVar, z);
    }

    /* renamed from: a */
    public final C13789b mo33388a(C13509c cVar, boolean z) {
        C13789b b = m40679b(cVar, z);
        if (b == null) {
            b = m40682e(cVar, z);
        }
        if (b == null) {
            b = m40680c(cVar, z);
        }
        if (b == null) {
            return m40681d(cVar, z);
        }
        return b;
    }

    /* renamed from: e */
    private C13789b m40682e(C13509c cVar, boolean z) {
        if (this.f36585d == null) {
            return null;
        }
        switch (this.f36585d.intValue()) {
            case 0:
                return m40680c(cVar, z);
            case 1:
                return m40681d(cVar, z);
            default:
                throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
    }

    public C13792e(int i, boolean z, C13790c cVar, Integer num) {
        this.f36582a = i;
        this.f36583b = z;
        this.f36584c = cVar;
        this.f36585d = num;
    }
}
