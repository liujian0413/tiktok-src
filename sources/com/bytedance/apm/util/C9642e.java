package com.bytedance.apm.util;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.bytedance.apm.util.e */
public class C9642e {

    /* renamed from: a */
    public static final String f26363a = "e";

    /* renamed from: b */
    private static File f26364b;

    /* renamed from: a */
    public static File m28530a() {
        if (f26364b == null) {
            f26364b = Environment.getExternalStorageDirectory();
        }
        return f26364b;
    }

    /* renamed from: a */
    public static void m28531a(List<String> list, String str) throws Exception {
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
            try {
                for (String file : list) {
                    File file2 = new File(file);
                    m28532a(zipOutputStream, file2, file2.getName());
                }
                C9644g.m28534a(zipOutputStream);
            } catch (Throwable th) {
                th = th;
                C9644g.m28534a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = null;
            C9644g.m28534a(zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m28532a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        String str2;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            zipOutputStream.putNextEntry(new ZipEntry(sb.toString()));
            if (str.length() == 0) {
                str2 = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("/");
                str2 = sb2.toString();
            }
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(listFiles[i].getName());
                m28532a(zipOutputStream, file2, sb3.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                zipOutputStream.write(read);
            } else {
                return;
            }
        }
    }
}
