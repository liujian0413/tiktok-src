package com.p280ss.android.vesdk;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.vesdk.n */
public final class C45331n {
    /* renamed from: a */
    public static void m143269a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m143272a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m143273b(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m143270a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public static void m143271a(String str, int i) {
        C45334q.m143278a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(493), Integer.valueOf(-1), Integer.valueOf(-1));
    }
}
