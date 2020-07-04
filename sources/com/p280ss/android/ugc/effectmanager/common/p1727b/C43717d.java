package com.p280ss.android.ugc.effectmanager.common.p1727b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.d */
final class C43717d {

    /* renamed from: a */
    static final Charset f113217a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f113218b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m138548a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    static boolean m138550b(File file) {
        try {
            m138549a(file);
            return file.delete();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: c */
    static long m138551c(File file) {
        long j;
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        long j2 = 0;
        for (int i = 0; i < length; i++) {
            if (listFiles[i].isFile()) {
                j = listFiles[i].length();
            } else {
                j = m138551c(listFiles[i]);
            }
            j2 += j;
        }
        return j2;
    }

    /* renamed from: a */
    static void m138549a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m138549a(file2);
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
