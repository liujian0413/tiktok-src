package com.p280ss.android.ugc.aweme.watermark;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43170u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.watermark.c */
public final class C43403c {

    /* renamed from: a */
    public Bitmap f112416a;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0027 A[SYNTHETIC, Splitter:B:20:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x002d A[SYNTHETIC, Splitter:B:26:0x002d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo105312a(java.lang.String r5) {
        /*
            r4 = this;
            android.graphics.Bitmap r0 = r4.f112416a
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r5 = "mBitmap is null"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132283b(r5)
            return r1
        L_0x000b:
            r0 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002b, all -> 0x0023 }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x002b, all -> 0x0023 }
            android.graphics.Bitmap r5 = r4.f112416a     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            r3 = 100
            r5.compress(r0, r3, r2)     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r5 = 1
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0025
        L_0x0021:
            r0 = r2
            goto L_0x002b
        L_0x0023:
            r5 = move-exception
            r2 = r0
        L_0x0025:
            if (r2 == 0) goto L_0x002a
            r2.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            throw r5
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.watermark.C43403c.mo105312a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final C43403c mo105308a() {
        this.f112416a = BitmapFactory.decodeResource(C35563c.f93238a.getResources(), R.drawable.a11);
        return this;
    }

    /* renamed from: a */
    private static Bitmap m137733a(Bitmap bitmap) {
        Bitmap bitmap2;
        float f;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            bitmap2 = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getHeight(), Config.ARGB_8888);
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getWidth(), Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() > bitmap.getHeight()) {
            f = (float) (bitmap.getHeight() / 2);
        } else {
            f = (float) (bitmap.getWidth() / 2);
        }
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmap2;
    }

    /* renamed from: a */
    private C43403c m137734a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2) {
        float f;
        int i3;
        float width;
        float f2;
        float f3;
        float width2;
        float f4;
        int i4 = i;
        int i5 = i2;
        String str2 = str;
        if (i4 == 0 || i5 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(((float) i4) / 540.0f, ((float) i5) / 960.0f);
        }
        Resources resources = C35563c.f93238a.getResources();
        int i6 = (int) (145.0f * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i6, (bitmap.getHeight() * i6) / bitmap.getWidth(), true);
        if (TextUtils.isEmpty(str)) {
            this.f112416a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.a66));
            textPaint.setTextSize(14.0f * f);
            float a = C20505c.m68010a(C35563c.f93238a, 1.0f);
            textPaint.setShadowLayer(1.0f * a, 0.0f, a, resources.getColor(R.color.ju));
            int i7 = (int) (17.0f * f);
            int measureText = (int) (textPaint.measureText(str2) + (5.0f * f));
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                i3 = ((int) Math.ceil((double) (f * 4.0f))) + i7;
            } else {
                i3 = 0;
            }
            int max = Math.max(width3, i3 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (26.0f * f)), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.b2s, null), i7, i7, true);
                if (z2) {
                    f3 = 0.0f;
                } else {
                    f3 = ((float) (max - measureText)) - (((float) i7) + (f * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (15.0f * f), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    f4 = ((float) i7) + (f * 4.0f);
                } else {
                    f4 = (float) (max - measureText);
                }
                canvas.drawText(str2, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (f * 2.0f), textPaint);
            } else {
                if (z2) {
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
                if (z2) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) (max - measureText);
                }
                canvas.drawText(str2, f2, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (f * 2.0f), textPaint);
            }
            this.f112416a = createBitmap;
        }
        return this;
    }

    /* renamed from: a */
    private C43403c m137735a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2, C43404d dVar) {
        float f;
        int i3;
        float width;
        float f2;
        float f3;
        float width2;
        float f4;
        int i4 = i;
        int i5 = i2;
        String str2 = str;
        if (i4 == 0 || i5 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(((float) i4) / 540.0f, ((float) i5) / 960.0f);
        }
        Resources resources = C35563c.f93238a.getResources();
        int i6 = (int) (145.0f * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i6, (bitmap.getHeight() * i6) / bitmap.getWidth(), true);
        if (TextUtils.isEmpty(str)) {
            this.f112416a = createScaledBitmap;
            return this;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(resources.getColor(R.color.a66));
        textPaint.setTextSize(26.0f * f);
        float a = C20505c.m68010a(C35563c.f93238a, 1.0f);
        textPaint.setShadowLayer(1.0f * a, 0.0f, a, resources.getColor(R.color.ju));
        int i7 = (int) (28.0f * f);
        float f5 = 5.0f * f;
        int measureText = (int) (textPaint.measureText(str2) + f5);
        int width3 = createScaledBitmap.getWidth();
        if (z) {
            i3 = ((int) Math.ceil((double) (f * 4.0f))) + i7;
        } else {
            i3 = 0;
        }
        int max = Math.max(width3, i3 + measureText);
        Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (46.0f * f)), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (z) {
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, dVar.f112417a, null), i7, i7, true);
            if (z2) {
                f3 = 0.0f;
            } else {
                f3 = ((float) (max - measureText)) - (((float) i7) + (f * 4.0f));
            }
            canvas.drawBitmap(createScaledBitmap2, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (29.0f * f), paint);
            if (z2) {
                width2 = 0.0f;
            } else {
                width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
            }
            canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
            if (z2) {
                f4 = ((float) i7) + (f * 4.0f);
            } else {
                f4 = (float) (max - measureText);
            }
            canvas.drawText(str2, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - f5, textPaint);
        } else {
            if (z2) {
                width = 0.0f;
            } else {
                width = (float) ((max - createScaledBitmap.getWidth()) + 3);
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = (float) (max - measureText);
            }
            canvas.drawText(str2, f2, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - f5, textPaint);
        }
        this.f112416a = createBitmap;
        return this;
    }

    /* renamed from: a */
    public final C43403c mo105311a(Context context, int i, int i2, String str, String str2, Bitmap bitmap, boolean z) {
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        String str3 = str;
        String str4 = str2;
        if (i7 <= 0 || i8 <= 0) {
            return null;
        }
        float f3 = (float) i7;
        float f4 = (float) i8;
        float f5 = (f3 * 1.0f) / f4;
        if (!z || i8 <= i7) {
            i3 = 0;
        } else {
            i3 = (i8 - i7) / 2;
        }
        this.f112416a = Bitmap.createBitmap(i7, i8, Config.ARGB_8888);
        float f6 = f3 / 375.0f;
        int compare = Float.compare(f5, 1.0f);
        Canvas canvas = new Canvas(this.f112416a);
        canvas.drawColor(-16777216);
        if (compare < 0) {
            if (z) {
                f = ((float) i3) + (0.24f * f3);
            } else {
                f = f4 * 0.32f;
            }
        } else if (compare == 0) {
            f = f4 * 0.24f;
        } else {
            f = f4 * 0.18f;
        }
        float f7 = 56.0f * f6;
        if (z && f5 > 1.0f) {
            f7 = 112.0f;
        }
        float f8 = f + f7;
        RectF rectF = new RectF((f3 - f7) / 2.0f, f, (f3 + f7) / 2.0f, f8);
        Paint paint = new Paint(1);
        int i9 = i3;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setColor(-1);
        float f9 = f7 / 2.0f;
        canvas.drawCircle((float) (i7 / 2), f + f9, f9 + 3.0f, paint);
        canvas.drawBitmap(m137733a(bitmap), null, rectF, null);
        float f10 = f8 + (20.0f * f6);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setFakeBoldText(true);
        textPaint.setTextSize(18.0f * f6);
        textPaint.setColor(context.getResources().getColor(R.color.az3));
        float f11 = f3 * 0.77f;
        float measureText = textPaint.measureText(str3);
        if (measureText > f11) {
            int length = ((int) ((measureText - f11) / (measureText / ((float) str.length())))) + 3;
            StringBuilder sb = new StringBuilder();
            int length2 = str.length() - length;
            i4 = 0;
            sb.append(str3.substring(0, length2));
            sb.append("...");
            str3 = sb.toString();
        } else {
            i4 = 0;
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(str3, i4, str3.length(), rect);
        float width = ((float) (i7 - rect.width())) / 2.0f;
        int height = rect.height();
        canvas.drawText(str3, width, f10, textPaint);
        float f12 = f10 + ((float) height);
        if (compare < 0) {
            if (z) {
                f2 = f12 + 12.0f;
            } else {
                f2 = f12 + (4.0f * f6);
            }
        } else if (compare == 0) {
            f2 = f12 + (6.0f * f6);
        } else {
            f2 = f12 + (3.0f * f6);
        }
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setFakeBoldText(false);
        textPaint2.setTextSize(f6 * 13.0f);
        textPaint2.setColor(context.getResources().getColor(R.color.a6h));
        Rect rect2 = new Rect();
        textPaint2.getTextBounds(str4, 0, str2.length(), rect2);
        canvas.drawText(str4, ((float) (i7 - rect2.width())) / 2.0f, f2, textPaint2);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.abt);
        int width2 = decodeResource.getWidth();
        int height2 = decodeResource.getHeight();
        if (compare < 0) {
            i6 = (i7 * 94) / 375;
            i5 = (i8 * 40) / 667;
        } else if (compare == 0) {
            i6 = (i7 * 72) / 374;
            i5 = (i8 * 16) / 677;
        } else {
            i6 = (i7 * 75) / 375;
            i5 = (i8 * 12) / 667;
        }
        if (z) {
            i5 += i9;
        }
        int i10 = (int) (((float) (i7 - i6)) / 2.0f);
        int i11 = i8 - (i5 + 16);
        canvas.drawBitmap(decodeResource, null, new Rect(i10, i11 - ((int) (((((float) height2) * 1.0f) / ((float) width2)) * ((float) i6))), i6 + i10, i11), null);
        C43170u.m136917a(decodeResource);
        return this;
    }

    /* renamed from: a */
    public final C43403c mo105309a(int i, int i2, String str, int i3, boolean z, boolean z2, boolean z3, C43404d dVar) {
        int i4 = i3;
        Bitmap decodeResource = BitmapFactory.decodeResource(C35563c.f93238a.getResources(), i3, null);
        if (!z2) {
            return m137735a(i, i2, str, decodeResource, z, z3, dVar);
        }
        return m137734a(i, i2, str, decodeResource, z, z3);
    }

    /* renamed from: a */
    public final C43403c mo105310a(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, C43404d dVar) {
        String str3 = str2;
        Bitmap decodeFile = BitmapFactory.decodeFile(str2);
        if (decodeFile == null) {
            StringBuilder sb = new StringBuilder("I18nWaterMarkImage --> pic Path   => ");
            sb.append(str2);
            C42880h.m136156a(sb.toString());
            File file = new File(str2);
            StringBuilder sb2 = new StringBuilder("I18nWaterMarkImage --> pic exists => ");
            sb2.append(file.exists());
            C42880h.m136156a(sb2.toString());
            StringBuilder sb3 = new StringBuilder("I18nWaterMarkImage --> pic size   => ");
            sb3.append(file.length());
            C42880h.m136156a(sb3.toString());
            return this;
        } else if (!z2) {
            return m137735a(i, i2, str, decodeFile, z, z3, dVar);
        } else {
            return m137734a(i, i2, str, decodeFile, z, z3);
        }
    }
}
