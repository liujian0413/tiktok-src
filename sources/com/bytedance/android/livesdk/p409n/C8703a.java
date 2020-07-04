package com.bytedance.android.livesdk.p409n;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import com.bytedance.android.livesdk.utils.C9046am;

/* renamed from: com.bytedance.android.livesdk.n.a */
public final class C8703a {

    /* renamed from: a */
    private static Paint f23715a;

    static {
        Paint paint = new Paint();
        f23715a = paint;
        paint.setColor(-1);
        f23715a.setStyle(Style.FILL_AND_STROKE);
    }

    /* renamed from: a */
    public static void m26017a(Context context, int i, Bitmap bitmap, String str) {
        if (bitmap != null && str != null) {
            f23715a.setColor(i);
            Typeface a = C9046am.m27012a(context);
            if (a != null) {
                f23715a.setTypeface(a);
            }
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f23715a.setTextSize(0.55f * height);
            float measureText = f23715a.measureText(str);
            Canvas canvas = new Canvas(bitmap);
            FontMetrics fontMetrics = f23715a.getFontMetrics();
            canvas.drawText(str, height + (((width - height) - measureText) / 2.0f), ((height - (fontMetrics.bottom - fontMetrics.top)) / 2.0f) + Math.abs(fontMetrics.top), f23715a);
        }
    }
}
