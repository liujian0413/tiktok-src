package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.utils.C43170u;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.k */
public final class C39619k {
    /* renamed from: a */
    private static Bitmap m126785a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        Bitmap bitmap2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == i && height == i2) {
            return bitmap;
        }
        if (i3 <= 0 || i4 <= 0 || (width <= i3 && height <= i4)) {
            float f = ((float) i) / ((float) width);
            float f2 = ((float) i2) / ((float) height);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f2);
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } else {
            float f3 = ((float) i) / ((float) i3);
            float f4 = ((float) i2) / ((float) i4);
            Matrix matrix2 = new Matrix();
            matrix2.setTranslate(((float) (width - i3)) * 0.5f, ((float) (height - i4)) * 0.5f);
            matrix2.postScale(f3, f4);
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, i3, i4, matrix2, true);
        }
        return bitmap2;
    }

    /* renamed from: a */
    public static Bitmap m126786a(View view, int i, int i2, int i3, int i4) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getHeight(), Config.ARGB_8888);
            createBitmap.setDensity(C23481i.m77089a().getDisplayMetrics().densityDpi);
            if (view.getDrawingCacheBackgroundColor() != 0) {
                createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
            view.draw(canvas);
            Bitmap a = m126785a(createBitmap, i, i2, i3, i4);
            if (a != createBitmap) {
                C43170u.m136917a(createBitmap);
            }
            return a;
        } catch (OutOfMemoryError e) {
            C6921a.m21559a((Throwable) e);
            return null;
        }
    }
}
