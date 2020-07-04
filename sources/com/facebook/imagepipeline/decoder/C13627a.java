package com.facebook.imagepipeline.decoder;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.facebook.common.references.C13326a;
import com.facebook.imageformat.C13508b;
import com.facebook.imageformat.C13509c;
import com.facebook.imageformat.C13511d;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p720g.C13649g;
import com.facebook.imagepipeline.p720g.C13650h;
import com.facebook.imagepipeline.p722i.C13659f;
import com.facebook.imagepipeline.p727n.C13834a;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.decoder.a */
public final class C13627a implements C13629b {

    /* renamed from: a */
    private final C13629b f36230a;

    /* renamed from: b */
    private final C13629b f36231b;

    /* renamed from: c */
    private final C13629b f36232c;

    /* renamed from: d */
    private final C13659f f36233d;

    /* renamed from: e */
    private final C13629b f36234e;

    /* renamed from: f */
    private final Map<C13509c, C13629b> f36235f;

    /* renamed from: a */
    private static void m40180a(C13834a aVar, C13326a<Bitmap> aVar2) {
        if (aVar != null) {
            Bitmap bitmap = (Bitmap) aVar2.mo32609a();
            if (VERSION.SDK_INT >= 12 && aVar.mo33451a()) {
                bitmap.setHasAlpha(true);
            }
        }
    }

    /* renamed from: a */
    public final C13646d mo33243a(C13647e eVar, C13594b bVar) {
        C13326a decodeFromEncodedImageWithColorSpace = this.f36233d.decodeFromEncodedImageWithColorSpace(eVar, bVar.f36009h, null, bVar.f36008g);
        try {
            m40180a(bVar.f36011j, decodeFromEncodedImageWithColorSpace);
            return new C13646d(decodeFromEncodedImageWithColorSpace, C13649g.f36269a, eVar.mo33277e(), eVar.mo33278f());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    /* renamed from: d */
    public final C13645c mo33246d(C13647e eVar, int i, C13650h hVar, C13594b bVar) {
        return this.f36231b.mo33042a(eVar, i, hVar, bVar);
    }

    public C13627a(C13629b bVar, C13629b bVar2, C13629b bVar3, C13659f fVar) {
        this(bVar, bVar2, bVar3, fVar, null);
    }

    /* renamed from: b */
    public final C13645c mo33244b(C13647e eVar, int i, C13650h hVar, C13594b bVar) {
        if (bVar.f36007f || this.f36230a == null) {
            return mo33243a(eVar, bVar);
        }
        return this.f36230a.mo33042a(eVar, i, hVar, bVar);
    }

    /* renamed from: a */
    public final C13645c mo33042a(C13647e eVar, int i, C13650h hVar, C13594b bVar) {
        if (bVar.f36010i != null) {
            return bVar.f36010i.mo33042a(eVar, i, hVar, bVar);
        }
        C13509c d = eVar.mo33276d();
        if (d == null || d == C13509c.f35837a) {
            d = C13511d.m39757a(eVar.mo33274c());
            eVar.f36258a = d;
        }
        if (this.f36235f != null) {
            C13629b bVar2 = (C13629b) this.f36235f.get(d);
            if (bVar2 != null) {
                return bVar2.mo33042a(eVar, i, hVar, bVar);
            }
        }
        return this.f36234e.mo33042a(eVar, i, hVar, bVar);
    }

    /* renamed from: c */
    public final C13646d mo33245c(C13647e eVar, int i, C13650h hVar, C13594b bVar) {
        C13326a decodeJPEGFromEncodedImageWithColorSpace = this.f36233d.decodeJPEGFromEncodedImageWithColorSpace(eVar, bVar.f36009h, null, i, bVar.f36008g);
        try {
            m40180a(bVar.f36011j, decodeJPEGFromEncodedImageWithColorSpace);
            return new C13646d(decodeJPEGFromEncodedImageWithColorSpace, hVar, eVar.mo33277e(), eVar.mo33278f());
        } finally {
            decodeJPEGFromEncodedImageWithColorSpace.close();
        }
    }

    public C13627a(C13629b bVar, C13629b bVar2, C13629b bVar3, C13659f fVar, Map<C13509c, C13629b> map) {
        this.f36234e = new C13629b() {
            /* renamed from: a */
            public final C13645c mo33042a(C13647e eVar, int i, C13650h hVar, C13594b bVar) {
                C13509c d = eVar.mo33276d();
                if (d == C13508b.f35825a) {
                    return C13627a.this.mo33245c(eVar, i, hVar, bVar);
                }
                if (d == C13508b.f35827c) {
                    return C13627a.this.mo33244b(eVar, i, hVar, bVar);
                }
                if (d == C13508b.f35834j) {
                    return C13627a.this.mo33246d(eVar, i, hVar, bVar);
                }
                if (d != C13509c.f35837a) {
                    return C13627a.this.mo33243a(eVar, bVar);
                }
                throw new DecodeException("unknown image format", eVar);
            }
        };
        this.f36230a = bVar;
        this.f36231b = bVar2;
        this.f36232c = bVar3;
        this.f36233d = fVar;
        this.f36235f = map;
    }
}
