package com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.a */
public final class C42536a {
    /* renamed from: a */
    private static void m135171a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m135170a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static int[] m135173a(String str) {
        if (!C7276d.m22812b(str)) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: b */
    public static int m135174b(String str) {
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

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m135168a(java.io.File r3) {
        /*
            boolean r0 = r3.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r2
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a, all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002a, all -> 0x0025 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x002b, all -> 0x0022 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch:{ Exception -> 0x002b, all -> 0x0022 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            return r3
        L_0x0022:
            r3 = move-exception
            r1 = r2
            goto L_0x0026
        L_0x0025:
            r3 = move-exception
        L_0x0026:
            r1.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            throw r3
        L_0x002a:
            r2 = r1
        L_0x002b:
            r2.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42536a.m135168a(java.io.File):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static Bitmap m135166a(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        m135170a(bitmap);
        return createBitmap;
    }

    /* renamed from: d */
    private static Bitmap m135177d(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        if (width <= i || height <= i2) {
            return bitmap;
        }
        float min = Math.min((((float) i) * 1.0f) / ((float) width), (((float) i2) * 1.0f) / ((float) height));
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        m135170a(bitmap);
        return createBitmap;
    }

    /* renamed from: e */
    private static Bitmap m135178e(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        int i5 = width * 16;
        if (i5 < height * 9) {
            int i6 = i5 / 9;
            i4 = (height - i6) / 2;
            i3 = i6;
        } else {
            i3 = height;
            i4 = 0;
        }
        Matrix matrix = new Matrix();
        float f = (float) (i / width);
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, i4, width, i3, matrix, false);
        m135170a(bitmap);
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m135167a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = (((float) i) * 1.0f) / ((float) width);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (createBitmap == null) {
            return null;
        }
        int height2 = (i2 - createBitmap.getHeight()) / 2;
        if (height2 < 0) {
            height2 = 0;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(createBitmap, 0.0f, (float) height2, paint);
        m135170a(bitmap);
        m135170a(createBitmap);
        return createBitmap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r0 < r2) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0 < r2) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m135175b(android.graphics.Bitmap r11, int r12, int r13) {
        /*
            int r3 = r11.getWidth()
            int r4 = r11.getHeight()
            float r0 = (float) r12
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            float r2 = (float) r3
            float r0 = r0 / r2
            float r2 = (float) r13
            float r2 = r2 * r1
            float r5 = (float) r4
            float r2 = r2 / r5
            r7 = 1
            r8 = 0
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0027
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0027
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0024
        L_0x0022:
            r9 = 1
            goto L_0x0048
        L_0x0024:
            r0 = r2
        L_0x0025:
            r9 = 0
            goto L_0x0048
        L_0x0027:
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0030
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x0030
            goto L_0x0022
        L_0x0030:
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x0038
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x0024
        L_0x0038:
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0045
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0045
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0024
            goto L_0x0022
        L_0x0045:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0025
        L_0x0048:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x004f
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x004f:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r0, r0)
            r10 = 0
            if (r3 <= 0) goto L_0x00a6
            if (r4 > 0) goto L_0x005d
            goto L_0x00a6
        L_0x005d:
            r1 = 0
            r2 = 0
            r6 = 0
            r0 = r11
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0068
            return r10
        L_0x0068:
            if (r9 == 0) goto L_0x0075
            int r1 = r0.getHeight()
            int r1 = r13 - r1
            int r1 = r1 / 2
            r2 = r1
            r1 = 0
            goto L_0x007e
        L_0x0075:
            int r1 = r0.getWidth()
            int r1 = r12 - r1
            int r1 = r1 / 2
            r2 = 0
        L_0x007e:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r12, r13, r3)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r12)
            android.graphics.PaintFlagsDrawFilter r3 = new android.graphics.PaintFlagsDrawFilter
            r4 = 3
            r3.<init>(r8, r4)
            r13.setDrawFilter(r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r3.setAntiAlias(r7)
            float r1 = (float) r1
            float r2 = (float) r2
            r13.drawBitmap(r0, r1, r2, r3)
            m135170a(r11)
            m135170a(r0)
            return r12
        L_0x00a6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42536a.m135175b(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m135176c(android.graphics.Bitmap r13, int r14, int r15) {
        /*
            int r0 = r13.getWidth()
            float r0 = (float) r0
            int r1 = r13.getHeight()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r14 <= r15) goto L_0x002b
            float r5 = (float) r14
            float r5 = r5 * r2
            float r2 = (float) r15
            float r5 = r5 / r2
            float r2 = r0 / r5
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0022
            float r1 = r1 - r2
            float r1 = r1 / r3
        L_0x001e:
            r3 = r1
            r1 = r2
            r2 = 0
            goto L_0x004f
        L_0x0022:
            float r2 = r1 * r5
            float r0 = r0 - r2
            float r0 = r0 / r3
        L_0x0026:
            r3 = 0
            r12 = r2
            r2 = r0
            r0 = r12
            goto L_0x004f
        L_0x002b:
            if (r14 >= r15) goto L_0x0040
            float r5 = (float) r15
            float r5 = r5 * r2
            float r2 = (float) r14
            float r5 = r5 / r2
            float r2 = r1 / r5
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x003b
            float r0 = r0 - r2
            float r0 = r0 / r3
            goto L_0x0026
        L_0x003b:
            float r2 = r0 * r5
            float r1 = r1 - r2
            float r1 = r1 / r3
            goto L_0x001e
        L_0x0040:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x004a
            float r0 = r0 - r1
            float r0 = r0 / r3
            r2 = r0
            r0 = r1
            r3 = 0
            goto L_0x004f
        L_0x004a:
            float r1 = r1 - r0
            float r1 = r1 / r3
            r3 = r1
            r2 = 0
            r1 = r0
        L_0x004f:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            float r5 = (float) r14
            float r5 = r5 / r0
            float r6 = (float) r15
            float r6 = r6 / r1
            r10.postScale(r5, r6)
            int r6 = (int) r2
            int r7 = (int) r3
            int r8 = (int) r0
            int r9 = (int) r1
            r11 = 0
            r5 = r13
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != 0) goto L_0x0069
            r13 = 0
            return r13
        L_0x0069:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r14, r15, r1)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r15.<init>(r14)
            android.graphics.PaintFlagsDrawFilter r1 = new android.graphics.PaintFlagsDrawFilter
            r2 = 0
            r3 = 3
            r1.<init>(r2, r3)
            r15.setDrawFilter(r1)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r2 = 1
            r1.setAntiAlias(r2)
            r15.drawBitmap(r0, r4, r4, r1)
            m135170a(r13)
            m135170a(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42536a.m135176c(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static boolean m135172a(Bitmap bitmap, File file, int i, CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m135171a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m135171a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                m135171a((OutputStream) bufferedOutputStream);
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                m135171a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            m135171a((OutputStream) bufferedOutputStream);
            return z;
        } catch (Throwable th2) {
            th = th2;
            m135171a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static Bitmap m135169a(String str, int i, int i2, int i3, int i4) {
        Bitmap a = m135168a(new File(str));
        if (a == null) {
            return null;
        }
        try {
            Bitmap a2 = m135166a(a, i3);
            if (i4 == 1) {
                return m135176c(a2, i, i2);
            }
            if (i4 == 3) {
                return m135175b(a2, i, i2);
            }
            if (i4 == 2) {
                return m135167a(a2, i, i2);
            }
            if (i4 == 4) {
                return m135177d(a2, i, i2);
            }
            if (i4 == 5) {
                return m135178e(a2, i, i2);
            }
            return m135176c(a2, i, i2);
        } catch (OutOfMemoryError unused) {
            long j = C41514ab.m132244a().f107966d;
            StringBuilder sb = new StringBuilder(" totalPss: ");
            sb.append(j);
            sb.append(", bitmap size:");
            sb.append(a.getByteCount());
            C41530am.m132283b(sb.toString());
            return null;
        }
    }
}
