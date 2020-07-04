package com.p280ss.p811a.p813b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.ss.a.b.b */
public final class C18882b {
    /* renamed from: a */
    public static void m61635a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m61636a(String str, int i) {
        C18883c.m61642a("android.os.FileUtils", str, Integer.valueOf(493), Integer.valueOf(-1), Integer.valueOf(-1));
    }

    /* renamed from: a */
    public static void m61637a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m61638a(String str) {
        return new File(str).mkdirs();
    }
}
