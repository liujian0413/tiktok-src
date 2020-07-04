package com.bytedance.android.livesdk.gift.effect.normal.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.utils.a */
public final class C8057a {

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.utils.a$a */
    enum C8058a {
        VERTICAL,
        HORIZONTAL
    }

    /* renamed from: b */
    public static Bitmap m24690b(Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m24689a(View view) {
        Bitmap bitmap;
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        try {
            bitmap = view.getDrawingCache();
            if (bitmap == null) {
                bitmap = m24691b(view);
            }
        } catch (Exception unused) {
            bitmap = m24691b(view);
        }
        Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        return copy;
    }

    /* renamed from: b */
    private static Bitmap m24691b(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: c */
    public static Bitmap m24692c(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        matrix.postScale(-1.0f, 1.0f);
        matrix.postTranslate((float) bitmap.getWidth(), 0.0f);
        canvas.drawBitmap(bitmap, matrix, null);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m24688a(Bitmap bitmap) {
        C8058a aVar;
        Rect rect;
        try {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            Point point = new Point(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            if (bitmap.getWidth() > bitmap.getHeight()) {
                aVar = C8058a.HORIZONTAL;
            } else {
                aVar = C8058a.VERTICAL;
            }
            int i = min * 2;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(new Rect(0, 0, i, i));
            float min2 = (float) (Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
            if (aVar == C8058a.HORIZONTAL) {
                rect = new Rect(point.x - min, 0, point.x + min, i);
            } else {
                rect = new Rect(0, point.y - min, i, point.y + min);
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return createBitmap;
        } catch (Exception unused) {
            return bitmap;
        } catch (OutOfMemoryError unused2) {
            return null;
        }
    }
}
