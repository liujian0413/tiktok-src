package com.p280ss.android.ugc.aweme.poi.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13270f;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.z */
public final class C35470z implements C13842b {

    /* renamed from: a */
    private final String f93000a;

    /* renamed from: b */
    private final String f93001b;

    /* renamed from: c */
    private final int f93002c;

    public final String getName() {
        return "ResizeBitmapProcessor";
    }

    public final C13265a getPostprocessorCacheKey() {
        return new C13270f("ResizeBitmapProcessor");
    }

    /* renamed from: a */
    private final void m114578a(int i, int i2) {
        C42967ba a = C42967ba.m136396a();
        a.mo104680a("item_id", this.f93000a);
        a.mo104680a("url", this.f93001b);
        a.mo104679a("width", Integer.valueOf(i));
        a.mo104679a("height", Integer.valueOf(i2));
        C6877n.m21407a("poi_log", "poi_preview", a.mo104681b());
    }

    public final C13326a<Bitmap> process(Bitmap bitmap, C13551f fVar) {
        C7573i.m23587b(bitmap, "sourceBitmap");
        C7573i.m23587b(fVar, "bitmapFactory");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= this.f93002c || height <= this.f93002c || this.f93002c == 0 || this.f93002c == 0) {
            C13326a<Bitmap> a = fVar.mo33096a(bitmap);
            C7573i.m23582a((Object) a, "bitmapFactory.createBitmap(sourceBitmap)");
            return a;
        }
        float min = Math.min(((float) width) / ((float) this.f93002c), ((float) height) / ((float) this.f93002c));
        Matrix matrix = new Matrix();
        float f = 1.0f / min;
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        C7573i.m23582a((Object) createBitmap, "Bitmap.createBitmap(sour…W, sourceH, matrix, true)");
        C13326a<Bitmap> a2 = fVar.mo33096a(createBitmap);
        C7573i.m23582a((Object) a2, "bitmapFactory.createBitmap(temp)");
        m114578a(width, height);
        return a2;
    }

    public C35470z(String str, String str2, int i) {
        this.f93000a = str;
        this.f93001b = str2;
        this.f93002c = i;
    }
}
