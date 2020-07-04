package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.p686c.C13286a;
import com.facebook.imageutils.C13844a;

/* renamed from: com.facebook.imagepipeline.memory.d */
public final class C13807d extends C13825r<Bitmap> {
    /* renamed from: b */
    private static int m40748b(Bitmap bitmap) {
        return C13844a.m40886a(bitmap);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo33423a(Bitmap bitmap) {
        if (m40750c(bitmap)) {
            super.mo33423a(bitmap);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo33424b(Object obj) {
        return m40748b((Bitmap) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Bitmap mo33422a(int i) {
        Bitmap bitmap = (Bitmap) super.mo33422a(i);
        if (bitmap == null || !m40750c(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: c */
    private static boolean m40750c(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C13286a.m38865d("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C13286a.m38865d("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }
}
