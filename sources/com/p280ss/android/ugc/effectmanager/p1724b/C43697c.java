package com.p280ss.android.ugc.effectmanager.p1724b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.b.c */
final class C43697c {

    /* renamed from: a */
    static final Charset f113139a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f113140b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m138462a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static void m138463a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m138463a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }
}
