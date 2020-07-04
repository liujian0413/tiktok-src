package com.p280ss.android.ugc.aweme.utils;

import com.C1642a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.utils.aq */
public final class C42936aq {
    /* renamed from: b */
    public static String m136292b(File... fileArr) throws Exception {
        return m136291a((double) m136290a(fileArr));
    }

    /* renamed from: a */
    private static String m136291a(double d) {
        return C1642a.m8034a("%.2fMB", new Object[]{Double.valueOf(d / 1048576.0d)});
    }

    /* renamed from: a */
    public static long m136290a(File... fileArr) throws Exception {
        long j = 0;
        for (File listFiles : fileArr) {
            try {
                File[] listFiles2 = listFiles.listFiles();
                long j2 = j;
                int i = 0;
                while (i < listFiles2.length) {
                    try {
                        if (listFiles2[i].isDirectory()) {
                            j2 += m136290a(listFiles2[i]);
                        } else {
                            j2 += listFiles2[i].length();
                        }
                        i++;
                    } catch (Exception unused) {
                    }
                }
                j = j2;
            } catch (Exception unused2) {
            }
        }
        return j;
    }
}
