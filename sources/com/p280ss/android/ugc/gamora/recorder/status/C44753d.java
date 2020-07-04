package com.p280ss.android.ugc.gamora.recorder.status;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.status.d */
public final class C44753d {

    /* renamed from: a */
    public static final C44753d f115164a = new C44753d();

    private C44753d() {
    }

    /* renamed from: a */
    public final String mo107170a(String str, int i) {
        C7573i.m23587b(str, "srcPath");
        if (!C7276d.m22812b(str)) {
            return null;
        }
        Bitmap a = m141254a(str, i, m141260b(str));
        if (a == null) {
            return null;
        }
        String path = new File(m141255a(), m141262c(".bmp")).getPath();
        new File(path).createNewFile();
        if (m141258a(a, new File(path), 100, CompressFormat.PNG)) {
            return path;
        }
        return null;
    }

    /* renamed from: a */
    private static File m141255a() {
        StringBuilder sb = new StringBuilder();
        Application application = C35563c.f93238a;
        C7573i.m23582a((Object) application, "AVEnv.application");
        File filesDir = application.getFilesDir();
        C7573i.m23582a((Object) filesDir, "AVEnv.application.filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("status");
        sb.append(File.separator);
        sb.append("resizeImage");
        String sb2 = sb.toString();
        if (!new File(sb2).exists()) {
            new File(sb2).mkdirs();
        }
        return new File(sb2);
    }

    /* renamed from: a */
    private static void m141257a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m141256a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: b */
    private static int m141260b(String str) {
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

    /* renamed from: c */
    private static String m141262c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        C7573i.m23582a((Object) instance, "calendar");
        Date time = instance.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(time));
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[SYNTHETIC, Splitter:B:16:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0032 A[SYNTHETIC, Splitter:B:25:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m141253a(java.io.File r3) {
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
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002f, all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002f, all -> 0x0025 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0030, all -> 0x0022 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch:{ Exception -> 0x0030, all -> 0x0022 }
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
            if (r1 != 0) goto L_0x002b
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x002e }
        L_0x002b:
            r1.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            throw r3
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 != 0) goto L_0x0035
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0038 }
        L_0x0035:
            r2.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.status.C44753d.m141253a(java.io.File):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static boolean m141259a(String str) {
        C7573i.m23587b(str, "path");
        int[] imageWidthHeight = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().getImageWidthHeight(str);
        int i = imageWidthHeight[0];
        int i2 = imageWidthHeight[1];
        if (i < 360 || i2 < 480) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final Bitmap m141252a(Bitmap bitmap, int i) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        m141256a(bitmap);
        return createBitmap;
    }

    /* renamed from: b */
    private final Bitmap m141261b(Bitmap bitmap, int i) {
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * 16;
        if (i4 < height * 9) {
            int i5 = i4 / 9;
            i3 = (height - i5) / 2;
            i2 = i5;
        } else {
            i2 = height;
            i3 = 0;
        }
        Matrix matrix = new Matrix();
        float f = ((float) i) / ((float) width);
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, i3, width, i2, matrix, false);
        m141256a(bitmap);
        return createBitmap;
    }

    /* renamed from: a */
    private final Bitmap m141254a(String str, int i, int i2) {
        Bitmap a = m141253a(new File(str));
        try {
            Bitmap a2 = m141252a(a, i2);
            if (a2 != null) {
                return f115164a.m141261b(a2, i);
            }
            return null;
        } catch (OutOfMemoryError unused) {
            C41514ab a3 = C41514ab.m132244a();
            C7573i.m23582a((Object) a3, "MemoryUtil.getInstance()");
            long j = a3.f107966d;
            StringBuilder sb = new StringBuilder(" totalPss: ");
            sb.append(j);
            sb.append(", bitmap size:");
            if (a == null) {
                C7573i.m23580a();
            }
            sb.append(a.getByteCount());
            C41530am.m132283b(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    private final boolean m141258a(Bitmap bitmap, File file, int i, CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m141257a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m141257a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                m141257a((OutputStream) bufferedOutputStream);
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                m141257a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            m141257a((OutputStream) bufferedOutputStream);
            return z;
        } catch (Throwable th2) {
            th = th2;
            m141257a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }
}
