package com.p280ss.android.ugc.aweme.sticker.p1635c;

import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.sticker.c.a */
public final class C41848a {
    /* renamed from: a */
    public static void m133098a(File file) {
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                m133098a(file2);
                            } else {
                                file2.delete();
                            }
                        }
                        file.delete();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
