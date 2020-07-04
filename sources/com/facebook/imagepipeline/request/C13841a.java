package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import com.facebook.cache.common.C13265a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.imagepipeline.p715b.C13551f;

/* renamed from: com.facebook.imagepipeline.request.a */
public abstract class C13841a implements C13842b {
    public static final Config FALLBACK_BITMAP_CONFIGURATION = Config.ARGB_8888;

    public String getName() {
        return "Unknown postprocessor";
    }

    public C13265a getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.copyBitmap(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, null);
        }
    }

    public C13326a<Bitmap> process(Bitmap bitmap, C13551f fVar) {
        Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        C13326a a = fVar.mo33093a(width, height, config);
        try {
            process((Bitmap) a.mo32609a(), bitmap);
            return C13326a.m39000b(a);
        } finally {
            C13326a.m39001c(a);
        }
    }
}
