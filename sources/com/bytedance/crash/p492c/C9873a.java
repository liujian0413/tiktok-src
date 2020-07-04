package com.bytedance.crash.p492c;

import com.bytedance.crash.C9918j;
import java.io.File;

/* renamed from: com.bytedance.crash.c.a */
public final class C9873a {
    /* renamed from: a */
    public static void m29127a() {
        File file = new File(C9918j.m29343h().getFilesDir(), "crashCommand");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    try {
                        file2.getName().split("_")[0].equals("0");
                        file2.delete();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
