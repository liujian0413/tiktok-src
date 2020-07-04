package com.p280ss.android.image;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import java.io.File;

/* renamed from: com.ss.android.image.g */
public final class C19591g {
    /* renamed from: b */
    private static void m64534b(String str) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m64534b(listFiles[i].getAbsolutePath());
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static String m64532a(Context context) throws NullPointerException {
        String str;
        if (context != null) {
            try {
                if (context.getCacheDir() != null) {
                    str = context.getCacheDir().getPath();
                } else {
                    StringBuilder sb = new StringBuilder("/data/data/");
                    sb.append(context.getPackageName());
                    sb.append("/cache/");
                    File dir = context.getDir(sb.toString(), 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!C6319n.m19593a(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Cache Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    /* renamed from: a */
    public static void m64533a(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m64534b(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    /* renamed from: a */
    public static long m64531a(File file, boolean z) {
        File[] listFiles;
        long j = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j += m64531a(file2, z);
                } else if (file2.isFile()) {
                    j += file2.length();
                }
            }
            return j;
        } catch (Throwable unused) {
        }
    }
}
