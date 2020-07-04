package com.p1848vk.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.vk.sdk.d */
public final class C47218d {

    /* renamed from: a */
    private static Context f121355a;

    /* renamed from: a */
    public static Context m147673a() {
        return f121355a;
    }

    /* renamed from: a */
    static void m147675a(Context context) {
        if (context != null) {
            f121355a = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static Bitmap m147674a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || f121355a == null) {
            return bitmap;
        }
        int i3 = (int) (f121355a.getResources().getDisplayMetrics().density * 100.0f);
        int width = (int) (((float) bitmap.getWidth()) / ((((float) bitmap.getHeight()) * 1.0f) / ((float) i3)));
        Bitmap createBitmap = Bitmap.createBitmap(width, i3, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, width, i3);
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, 3.0f, 3.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }
}
