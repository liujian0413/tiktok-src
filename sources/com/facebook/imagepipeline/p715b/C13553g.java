package com.facebook.imagepipeline.p715b;

import android.graphics.Bitmap;
import com.facebook.common.references.C13329c;

/* renamed from: com.facebook.imagepipeline.b.g */
public final class C13553g implements C13329c<Bitmap> {

    /* renamed from: a */
    private static C13553g f35930a;

    private C13553g() {
    }

    /* renamed from: a */
    public static C13553g m39883a() {
        if (f35930a == null) {
            f35930a = new C13553g();
        }
        return f35930a;
    }

    /* renamed from: a */
    private static void m39884a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32582a(Object obj) {
        m39884a((Bitmap) obj);
    }
}
