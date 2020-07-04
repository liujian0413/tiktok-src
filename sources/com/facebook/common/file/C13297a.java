package com.facebook.common.file;

import java.io.File;

/* renamed from: com.facebook.common.file.a */
public final class C13297a {
    /* renamed from: b */
    public static boolean m38911b(File file) {
        if (file.isDirectory()) {
            m38910a(file);
        }
        return file.delete();
    }

    /* renamed from: a */
    public static boolean m38910a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File b : listFiles) {
                z &= m38911b(b);
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m38909a(File file, C13298b bVar) {
        bVar.mo16657a(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m38909a(file2, bVar);
                } else {
                    bVar.mo16658b(file2);
                }
            }
        }
        bVar.mo16659c(file);
    }
}
