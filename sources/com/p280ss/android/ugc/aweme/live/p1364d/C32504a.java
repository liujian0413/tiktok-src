package com.p280ss.android.ugc.aweme.live.p1364d;

import android.graphics.Bitmap;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13270f;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.image.C19586c;

/* renamed from: com.ss.android.ugc.aweme.live.d.a */
public final class C32504a implements C13842b {

    /* renamed from: a */
    private int f84767a = 5;

    /* renamed from: b */
    private float f84768b;

    /* renamed from: c */
    private C32505a f84769c = null;

    /* renamed from: com.ss.android.ugc.aweme.live.d.a$a */
    public interface C32505a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final C13265a getPostprocessorCacheKey() {
        return new C13270f("blur_bitmap_processor");
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
        if (this.f84768b != 0.0f) {
            float f2 = (float) round;
            float f3 = (float) round2;
            if (Math.abs((f2 / f3) - ((float) this.f84767a)) > 0.2f) {
                int i3 = (int) (f2 / this.f84768b);
                if (i3 > round2) {
                    i2 = (int) (f3 * this.f84768b);
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
        C19586c.m64524a(createScaledBitmap, (Bitmap) a.mo32609a(), this.f84767a);
        createScaledBitmap.recycle();
        return a;
    }

    public C32504a(int i, float f, C32505a aVar) {
        this.f84768b = f;
    }
}
