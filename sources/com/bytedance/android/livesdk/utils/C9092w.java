package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13270f;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.request.C13842b;

/* renamed from: com.bytedance.android.livesdk.utils.w */
public final class C9092w implements C13842b {

    /* renamed from: a */
    private int f24763a;

    /* renamed from: b */
    private float f24764b;

    /* renamed from: c */
    private C9093a f24765c;

    /* renamed from: com.bytedance.android.livesdk.utils.w$a */
    public interface C9093a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final C13265a getPostprocessorCacheKey() {
        return new C13270f("blur_bitmap_processor");
    }

    public C9092w(int i) {
        this.f24763a = 8;
    }

    public final C13326a<Bitmap> process(Bitmap bitmap, C13551f fVar) {
        float f;
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f = 0.6f;
        } else if (width < 200 || height < 200) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        int round = Math.round(((float) width) * f);
        int round2 = Math.round(((float) height) * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        if (this.f24764b != 0.0f) {
            float f2 = (float) round;
            float f3 = (float) round2;
            if (Math.abs((f2 / f3) - ((float) this.f24763a)) > 0.2f) {
                int i3 = (int) (f2 / this.f24764b);
                if (i3 > round2) {
                    i2 = (int) (f3 * this.f24764b);
                    i = round2;
                } else {
                    i = i3;
                    i2 = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i2) >> 1, (round2 - i) >> 1, i2, i);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i2;
                round2 = i;
            }
        }
        C13326a<Bitmap> a = fVar.mo33095a(round, round2);
        C9073k.m27080a(createScaledBitmap, (Bitmap) a.mo32609a(), this.f24763a);
        createScaledBitmap.recycle();
        return a;
    }

    public C9092w(int i, float f, C9093a aVar) {
        this.f24764b = f;
        this.f24763a = i;
        this.f24765c = null;
    }
}
