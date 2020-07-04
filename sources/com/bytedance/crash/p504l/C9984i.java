package com.bytedance.crash.p504l;

import com.bytedance.crash.p499h.C9909a;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.crash.l.i */
public final class C9984i {
    /* renamed from: a */
    public static void m29565a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29567a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29566a(String str, int i) {
        C9909a.m29297a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(493), Integer.valueOf(-1), Integer.valueOf(-1));
    }
}
