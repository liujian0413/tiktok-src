package com.p280ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.vesdk.utils.BitmapLoader;
import java.io.FileOutputStream;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.photo.j */
public final class C34758j {
    /* renamed from: a */
    public static boolean m112134a() {
        return C35563c.f93231M.mo93305a(Property.PhotoEditEnabled);
    }

    /* renamed from: a */
    private static Bitmap m112131a(Bitmap bitmap) {
        int i;
        boolean z;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if ((bitmap.getWidth() & 1) == 1) {
            i = bitmap.getWidth() - 1;
            z = true;
        } else {
            i = width;
            z = false;
        }
        if ((bitmap.getHeight() & 1) == 1) {
            height = bitmap.getHeight() - 1;
            z = true;
        }
        if (!z) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i, height);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: b */
    public static int[] m112136b(String str) {
        if (!C42973bg.m136427a(str)) {
            return new int[]{0, 0};
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public static boolean m112135a(String str) {
        if ((!m112134a() || (!"direct_shoot".equals(str) && !"prop_reuse".equals(str) && !"challenge".equals(str))) && !"task_platform".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static PhotoContext m112132a(String str, C34791s sVar) {
        return m112133a(str, sVar, 1080, 1920);
    }

    /* renamed from: a */
    public static PhotoContext m112133a(String str, C34791s sVar, int i, int i2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Throwable th2;
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str, i, i2);
            long j = C41514ab.m132244a().f107966d;
            StringBuilder sb = new StringBuilder(" totalPss: ");
            sb.append(j);
            C41530am.m132283b(sb.toString());
            Bitmap a = m112131a(loadBitmap);
            if (a != null) {
                String a2 = sVar.mo88162a();
                fileOutputStream = new FileOutputStream(a2);
                try {
                    boolean compress = a.compress(CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    if (!compress) {
                        C41530am.m132283b("compress bitmap fail");
                    }
                    if (compress) {
                        return PhotoContext.fromUpload(a2, a.getWidth(), a.getHeight(), UUID.randomUUID().toString());
                    }
                    return null;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r4;
                    th2 = th4;
                }
            } else {
                C41530am.m132283b("bitmap = null");
                return null;
            }
            throw th2;
            if (th != null) {
                fileOutputStream.close();
            } else {
                fileOutputStream.close();
            }
            throw th2;
        } catch (Throwable th5) {
            C41530am.m132283b(th5.getMessage());
        }
    }
}
