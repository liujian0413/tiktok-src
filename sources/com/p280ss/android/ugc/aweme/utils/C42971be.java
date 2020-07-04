package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.utils.be */
public final class C42971be {
    /* renamed from: a */
    private static void m136416a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m136418a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    m136416a(inputStream);
                    m136416a(outputStream);
                    return true;
                }
            } catch (Exception unused) {
                m136416a(inputStream);
                m136416a(outputStream);
                return false;
            } catch (Throwable th) {
                m136416a(inputStream);
                m136416a(outputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static boolean m136417a(Context context, String str, File file) {
        try {
            return m136418a(context.getAssets().open(str), new FileOutputStream(file));
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m136415a(Context context, String str, String str2) {
        File file = new File(str2);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsoluteFile());
        sb.append("/");
        sb.append(str);
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        if (m136417a(context, str, file2)) {
            return file2.getAbsolutePath();
        }
        return null;
    }
}
