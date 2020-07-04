package com.p280ss.android.ugc.aweme.watermark;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.utils.C43170u;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.watermark.p */
public final class C43425p {

    /* renamed from: a */
    public Bitmap f112490a;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[SYNTHETIC, Splitter:B:16:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A[SYNTHETIC, Splitter:B:23:0x002c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo105351a(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002a, all -> 0x001d }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x002a, all -> 0x001d }
            android.graphics.Bitmap r4 = r3.f112490a     // Catch:{ FileNotFoundException -> 0x001b, all -> 0x0019 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x001b, all -> 0x0019 }
            r2 = 100
            r4.compress(r0, r2, r1)     // Catch:{ FileNotFoundException -> 0x001b, all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            android.graphics.Bitmap r4 = r3.f112490a
            com.p280ss.android.ugc.aweme.utils.C43170u.m136917a(r4)
            r4 = 1
            return r4
        L_0x0019:
            r4 = move-exception
            goto L_0x001f
        L_0x001b:
            r0 = r1
            goto L_0x002a
        L_0x001d:
            r4 = move-exception
            r1 = r0
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            android.graphics.Bitmap r0 = r3.f112490a
            com.p280ss.android.ugc.aweme.utils.C43170u.m136917a(r0)
            throw r4
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            android.graphics.Bitmap r4 = r3.f112490a
            com.p280ss.android.ugc.aweme.utils.C43170u.m136917a(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.watermark.C43425p.mo105351a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final C43425p mo105349a(String str, int i, boolean z) {
        return m137808a(str, BitmapFactory.decodeResource(C35563c.f93238a.getResources(), i, null), z);
    }

    /* renamed from: a */
    public final C43425p mo105350a(String str, String str2, boolean z) {
        return m137808a(str, BitmapFactory.decodeFile(str2), z);
    }

    /* renamed from: a */
    private C43425p m137808a(String str, Bitmap bitmap, boolean z) {
        float f;
        Resources resources = C35563c.f93238a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 168, 67, true);
        if (TextUtils.isEmpty(str)) {
            this.f112490a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.a66));
            textPaint.setTextSize(30.0f);
            float a = C20505c.m68010a(C35563c.f93238a, 1.0f);
            textPaint.setShadowLayer(2.0f * a, 0.0f, a, resources.getColor(R.color.mj));
            int measureText = (int) (textPaint.measureText(str) + 5.0f);
            int max = Math.max(createScaledBitmap.getWidth(), measureText) + 15;
            Bitmap createBitmap = Bitmap.createBitmap(max, createScaledBitmap.getHeight() + 44 + 2, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                f = 4.0f;
            } else {
                f = (float) (max - createScaledBitmap.getWidth());
            }
            canvas.drawBitmap(createScaledBitmap, f, 0.0f, paint);
            canvas.drawText(str, (float) ((max - measureText) - 4), ((float) (createScaledBitmap.getHeight() + 2)) - textPaint.ascent(), textPaint);
            this.f112490a = createBitmap;
        }
        return this;
    }

    /* renamed from: a */
    public final C43425p mo105347a(int i, int i2, String str, int i3, boolean z) {
        Bitmap bitmap;
        float f;
        float f2;
        Resources resources = C35563c.f93238a.getResources();
        float f3 = ((float) i) / 720.0f;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.bko, null), (int) (208.0f * f3), (int) (56.0f * f3), true);
        if (TextUtils.isEmpty(str)) {
            this.f112490a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.ab2));
            textPaint.setTextSize(22.0f * f3);
            float f4 = 4.0f * f3;
            textPaint.setShadowLayer(f4, 0.0f, 0.0f, resources.getColor(R.color.mj));
            int measureText = (int) textPaint.measureText(str);
            float f5 = 6.0f * f3;
            int i4 = ((int) f5) + measureText;
            if (i4 >= createScaledBitmap.getWidth()) {
                bitmap = Bitmap.createBitmap(i4, (int) (((float) createScaledBitmap.getHeight()) + (f3 * 32.0f)), Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) (i4 - createScaledBitmap.getWidth());
                }
                canvas.drawBitmap(createScaledBitmap, f2, 0.0f, paint);
                canvas.drawText(str, 0.0f, (((float) createScaledBitmap.getHeight()) + f4) - textPaint.ascent(), textPaint);
            } else {
                int width = createScaledBitmap.getWidth();
                bitmap = Bitmap.createBitmap(width, (int) (((float) createScaledBitmap.getHeight()) + (f3 * 32.0f)), Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                if (z) {
                    f = 0.0f;
                } else {
                    f = (float) (width - createScaledBitmap.getWidth());
                }
                canvas2.drawBitmap(createScaledBitmap, f, 0.0f, paint2);
                canvas2.drawText(str, ((float) (width - measureText)) - f5, (((float) createScaledBitmap.getHeight()) + f4) - textPaint.ascent(), textPaint);
            }
            this.f112490a = bitmap;
        }
        return this;
    }

    /* renamed from: a */
    public final C43425p mo105348a(Context context, int i, int i2, String str, String str2) {
        float f;
        float f2;
        float f3;
        int i3;
        int i4 = i;
        int i5 = i2;
        String str3 = str;
        String str4 = str2;
        this.f112490a = Bitmap.createBitmap(i4, i5, Config.ARGB_8888);
        float f4 = (float) i4;
        float f5 = (float) i5;
        float f6 = (f4 * 1.0f) / f5;
        if (f6 < 1.0f) {
            f = Math.min(f4 / 540.0f, f5 / 960.0f);
        } else {
            f = Math.min(f4 / 960.0f, f5 / 540.0f);
        }
        Canvas canvas = new Canvas(this.f112490a);
        canvas.drawColor(0);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setFakeBoldText(true);
        double d = (double) f6;
        if (d < 1.0d) {
            f2 = 37.0f;
        } else {
            f2 = 50.0f;
        }
        textPaint.setTextSize(f2 * f);
        textPaint.setColor(context.getResources().getColor(R.color.a5e));
        float f7 = f4 * 0.77f;
        float measureText = textPaint.measureText(str3);
        if (measureText > f7) {
            int length = ((int) ((measureText - f7) / (measureText / ((float) str.length())))) + 3;
            StringBuilder sb = new StringBuilder();
            sb.append(str3.substring(0, str.length() - length));
            sb.append("...");
            str3 = sb.toString();
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(str3, 0, str3.length(), rect);
        float width = ((float) (i4 - rect.width())) / 2.0f;
        int height = rect.height();
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setFakeBoldText(false);
        if (d < 1.0d) {
            f3 = 26.0f;
        } else {
            f3 = 24.0f;
        }
        textPaint2.setTextSize(f3 * f);
        textPaint2.setColor(context.getResources().getColor(R.color.a6h));
        Rect rect2 = new Rect();
        textPaint2.getTextBounds(str4, 0, str2.length(), rect2);
        float f8 = (4.5f * f5) / 10.0f;
        canvas.drawText(str3, width, f8, textPaint);
        canvas.drawText(str4, ((float) (i4 - rect2.width())) / 2.0f, f8 + ((float) height) + (f * 3.0f), textPaint2);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.coe);
        int width2 = decodeResource.getWidth();
        int height2 = decodeResource.getHeight();
        if (f6 < 1.0f) {
            i3 = i4 * 21;
        } else {
            i3 = i4 * 13;
        }
        int i6 = i3 / 100;
        int i7 = (int) (((float) (i4 - i6)) / 2.0f);
        int i8 = i5 - ((int) (f5 * 0.06f));
        canvas.drawBitmap(decodeResource, null, new Rect(i7, i8 - ((int) (((((float) height2) * 1.0f) / ((float) width2)) * ((float) i6))), i6 + i7, i8), null);
        C43170u.m136917a(decodeResource);
        return this;
    }
}
