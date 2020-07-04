package com.bytedance.android.livesdk.chatroom.p209bl;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.gift.model.C8156k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.a */
public final class C4267a {
    /* renamed from: a */
    private static boolean m14418a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static String m14417a(C8156k kVar) {
        Typeface typeface;
        String str = kVar.f22294i;
        Bitmap createBitmap = Bitmap.createBitmap(kVar.f22287b, kVar.f22288c, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        if (m14418a(kVar.f22295j)) {
            typeface = Typeface.createFromFile(kVar.f22295j);
        } else {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextSize((float) kVar.f22290e);
        textPaint.setColor(Color.parseColor(kVar.f22291f));
        float f = 0.0f;
        if (kVar.mo21283a()) {
            int b = C3358ac.m12521b((int) R.color.as5);
            textPaint.setShadowLayer(2.0f, 0.0f, 5.0f, Color.argb(153, Color.red(b), Color.green(b), Color.blue(b)));
        }
        String str2 = kVar.f22293h;
        if (TextUtils.equals(str2, "center")) {
            f = (((float) kVar.f22287b) - textPaint.measureText(kVar.f22289d)) / 2.0f;
        } else if (!TextUtils.equals(str2, "left") && TextUtils.equals(str2, "right")) {
            f = ((float) kVar.f22287b) - textPaint.measureText(kVar.f22289d);
        }
        textPaint.getTextBounds(kVar.f22289d, 0, kVar.f22289d.length(), new Rect());
        FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(kVar.f22289d, f, (float) ((((kVar.f22288c - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top), textPaint);
        m14419a(str, createBitmap);
        createBitmap.recycle();
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001a A[SYNTHETIC, Splitter:B:16:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0020 A[SYNTHETIC, Splitter:B:22:0x0020] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m14419a(java.lang.String r2, android.graphics.Bitmap r3) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001e, all -> 0x0017 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001e, all -> 0x0017 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r0 = 100
            r3.compress(r2, r0, r1)     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r1.close()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r2 = 1
            return r2
        L_0x0012:
            r2 = move-exception
            r0 = r1
            goto L_0x0018
        L_0x0015:
            r0 = r1
            goto L_0x001e
        L_0x0017:
            r2 = move-exception
        L_0x0018:
            if (r0 == 0) goto L_0x001d
            r0.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            throw r2
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p209bl.C4267a.m14419a(java.lang.String, android.graphics.Bitmap):boolean");
    }
}
