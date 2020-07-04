package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.memory.MemoryTrimType;

/* renamed from: com.facebook.imagepipeline.memory.n */
public final class C13819n implements C13806c {
    /* renamed from: a */
    public final void mo32580a(MemoryTrimType memoryTrimType) {
    }

    /* renamed from: a */
    private static void m40792a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo32581a(int i) {
        return m40793b(i);
    }

    /* renamed from: b */
    private static Bitmap m40793b(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Config.RGB_565);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32582a(Object obj) {
        m40792a((Bitmap) obj);
    }
}
