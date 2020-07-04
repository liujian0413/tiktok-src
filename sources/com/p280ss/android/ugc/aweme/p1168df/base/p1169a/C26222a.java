package com.p280ss.android.ugc.aweme.p1168df.base.p1169a;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.df.base.a.a */
public final class C26222a {
    /* renamed from: b */
    public static String m86212b() {
        return m86210a(m86211a(Environment.getDataDirectory()));
    }

    /* renamed from: a */
    public static int m86209a() {
        try {
            if ((C6399b.m19921a().getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static String m86213c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return m86210a(m86211a(Environment.getExternalStorageDirectory()));
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    private static String m86210a(long[] jArr) {
        if (jArr == null || jArr.length != 2) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jArr[0]);
        sb.append(" / ");
        sb.append(jArr[1]);
        return sb.toString();
    }

    /* renamed from: a */
    private static long[] m86211a(File file) {
        try {
            long[] jArr = new long[2];
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                jArr[0] = statFs.getAvailableBytes();
                jArr[1] = statFs.getTotalBytes();
            } else {
                long blockSize = (long) statFs.getBlockSize();
                long blockCount = (long) statFs.getBlockCount();
                jArr[0] = ((long) statFs.getAvailableBlocks()) * blockSize;
                jArr[1] = blockSize * blockCount;
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }
}
