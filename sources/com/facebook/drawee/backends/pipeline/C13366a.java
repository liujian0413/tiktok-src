package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C13414i;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.drawee.backends.pipeline.a */
public final class C13366a implements C13642a {

    /* renamed from: a */
    private final Resources f35326a;

    /* renamed from: b */
    private final C13642a f35327b;

    /* renamed from: a */
    public final boolean mo32678a(C13645c cVar) {
        return true;
    }

    /* renamed from: a */
    private static boolean m39138a(C13646d dVar) {
        if (dVar.f36253a == 0 || dVar.f36253a == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m39139b(C13646d dVar) {
        if (dVar.f36254b == 1 || dVar.f36254b == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final Drawable mo32679b(C13645c cVar) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof C13646d) {
                C13646d dVar = (C13646d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f35326a, dVar.mo33265d());
                if (!m39138a(dVar) && !m39139b(dVar)) {
                    return bitmapDrawable;
                }
                C13414i iVar = new C13414i(bitmapDrawable, dVar.f36253a, dVar.f36254b);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return iVar;
            } else if (this.f35327b == null || !this.f35327b.mo32678a(cVar)) {
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return null;
            } else {
                Drawable b = this.f35327b.mo32679b(cVar);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return b;
            }
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    public C13366a(Resources resources, C13642a aVar) {
        this.f35326a = resources;
        this.f35327b = aVar;
    }
}
