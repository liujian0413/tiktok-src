package com.bytedance.lighten.loader;

import android.net.Uri;
import com.bytedance.lighten.core.C12102c;
import com.facebook.binaryresource.C13231a;
import com.facebook.binaryresource.C13232b;
import com.facebook.cache.common.C13265a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;

/* renamed from: com.bytedance.lighten.loader.l */
final class C12160l implements C12102c {
    C12160l() {
    }

    /* renamed from: a */
    public final File mo29798a(Uri uri) {
        C13265a c = C13577j.m39966a().mo33116c(ImageRequest.fromUri(uri), null);
        C13231a a = C13380c.m39171b().mo33207c().mo32459a(c);
        if (a == null) {
            a = C13380c.m39171b().mo33210f().mo32459a(c);
        }
        if (a instanceof C13232b) {
            File file = ((C13232b) a).f35057a;
            if (file == null || !file.exists()) {
                return null;
            }
            return file;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo29799b(Uri uri) {
        C13265a c = C13577j.m39966a().mo33116c(ImageRequest.fromUri(uri), null);
        if (C13622l.m40095a().mo33207c().mo32467d(c) || C13622l.m40095a().mo33210f().mo32467d(c)) {
            return true;
        }
        return false;
    }
}
