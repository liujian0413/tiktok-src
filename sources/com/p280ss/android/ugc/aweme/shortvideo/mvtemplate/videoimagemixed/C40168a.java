package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a */
public final class C40168a {

    /* renamed from: a */
    public static final C40168a f104413a = new C40168a();

    private C40168a() {
    }

    /* renamed from: a */
    public static void m128334a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    private static int m128332a(String str) {
        int i = 0;
        if (!C7276d.m22812b(str)) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                i = NormalGiftView.ALPHA_180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[SYNTHETIC, Splitter:B:14:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[SYNTHETIC, Splitter:B:23:0x0037] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m128335b(java.lang.String r3) {
        /*
            boolean r0 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            r3.inPreferredConfig = r2
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0034, all -> 0x002a }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0034, all -> 0x002a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0035, all -> 0x0027 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r3)     // Catch:{ Exception -> 0x0035, all -> 0x0027 }
            r2.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x003e
        L_0x0027:
            r3 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r3 = move-exception
        L_0x002b:
            if (r1 != 0) goto L_0x0030
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0033 }
        L_0x0030:
            r1.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            throw r3
        L_0x0034:
            r2 = r1
        L_0x0035:
            if (r2 != 0) goto L_0x003a
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x003d }
        L_0x003a:
            r2.close()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r3 = r1
        L_0x003e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40168a.m128335b(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private final Bitmap m128333a(Bitmap bitmap, int i) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        m128334a(bitmap);
        return createBitmap;
    }

    /* renamed from: a */
    public final Bitmap mo99928a(String str, int i, int i2) {
        boolean z;
        float f;
        int i3;
        int i4;
        if (!C7276d.m22812b(str)) {
            return null;
        }
        Bitmap b = m128335b(str);
        if (b == null) {
            return null;
        }
        if (b == null) {
            C7573i.m23580a();
        }
        int width = b.getWidth();
        int height = b.getHeight();
        int i5 = 1280;
        int i6 = 720;
        if (width <= 720 && height <= 1280) {
            return b;
        }
        if (str == null) {
            try {
                C7573i.m23580a();
            } catch (OutOfMemoryError unused) {
                C41514ab a = C41514ab.m132244a();
                C7573i.m23582a((Object) a, "MemoryUtil.getInstance()");
                long j = a.f107966d;
                StringBuilder sb = new StringBuilder(" totalPss: ");
                sb.append(j);
                sb.append(", bitmap size:");
                sb.append(b.getByteCount());
                C41530am.m132283b(sb.toString());
                return null;
            }
        }
        Bitmap a2 = m128333a(b, m128332a(str));
        if (a2 == null) {
            C7573i.m23580a();
        }
        int width2 = a2.getWidth();
        int height2 = a2.getHeight();
        if (width2 <= height2) {
            i5 = 720;
            i6 = 1280;
        }
        float f2 = 1.0f;
        if (width2 < height2 || width2 <= i5) {
            if (width2 >= height2 || height2 <= i6) {
                f = 1.0f;
            } else {
                f = (((float) i6) * 1.0f) / ((float) height2);
            }
            z = false;
        } else {
            f = (((float) i5) * 1.0f) / ((float) width2);
            z = true;
        }
        if (f > 0.0f) {
            f2 = f;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f2);
        if (width2 <= 0 || height2 <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2, 0, 0, width2, height2, matrix, false);
        if (createBitmap == null) {
            return null;
        }
        if (z) {
            i4 = (i6 - createBitmap.getHeight()) / 2;
            i3 = 0;
        } else {
            i3 = (i5 - createBitmap.getWidth()) / 2;
            i4 = 0;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i5, i6, Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(createBitmap, (float) i3, (float) i4, paint);
        m128334a(a2);
        m128334a(createBitmap);
        return createBitmap2;
    }
}
