package com.p280ss.android.ugc.aweme.feedback;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.bytedance.common.utility.BitmapUtils;
import com.p280ss.android.ugc.aweme.shortvideo.p1573g.C39914a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.x */
public final class C29119x {

    /* renamed from: a */
    public static final C29119x f76867a = new C29119x();

    private C29119x() {
    }

    /* renamed from: b */
    private static String m95493b() {
        StringBuilder sb = new StringBuilder("feedback");
        sb.append(File.separator);
        sb.append("upload");
        return sb.toString();
    }

    /* renamed from: a */
    private final String m95492a() {
        File a = C7276d.m22802a(m95493b());
        if (a == null) {
            return "";
        }
        String path = a.getPath();
        C7573i.m23582a((Object) path, "file.path");
        return path;
    }

    /* renamed from: a */
    public final void mo74563a(int i) {
        if (i > 0) {
            C7276d.m22822e(m95492a());
        }
    }

    /* renamed from: a */
    private static Bitmap m95491a(Options options, String str, int i) {
        options.inSampleSize = C39914a.m127681a(options, i, (options.outHeight * i) / options.outWidth);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        C7573i.m23582a((Object) decodeFile, "BitmapFactory.decodeFile(fileName, option)");
        return decodeFile;
    }

    /* renamed from: a */
    public final String mo74562a(String str, File file, int i) {
        C7573i.m23587b(str, "fileName");
        C7573i.m23587b(file, "file");
        int min = Math.min(i, 720);
        if (min > 0) {
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                if (options.outWidth > min) {
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(m95491a(options, str, min), BitmapUtils.readPictureDegree(str));
                    C7573i.m23582a((Object) rotateBitmap, "BitmapUtils.rotateBitmap(resizeBitmap, degree)");
                    if (rotateBitmap != null) {
                        String a = m95492a();
                        if (BitmapUtils.saveBitmapToSD(rotateBitmap, a, file.getName())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(a);
                            sb.append(File.separator);
                            sb.append(file.getName());
                            str = sb.toString();
                        }
                        rotateBitmap.recycle();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
