package com.p280ss.android.agilelogger.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.agilelogger.utils.b */
public final class C19196b {
    /* renamed from: a */
    public static void m62913a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m62915a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m62916a(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m62914a(String str, int i) {
        C19197c.m62918a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(493), Integer.valueOf(-1), Integer.valueOf(-1));
    }
}
