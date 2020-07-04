package com.bytedance.crash.p499h;

import android.content.Context;
import android.os.Build;
import com.bytedance.crash.p504l.C9984i;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.crash.h.b */
public final class C9911b {

    /* renamed from: a */
    private static List<String> f27030a = new ArrayList();

    /* renamed from: a */
    public static String m29303a(Context context, String str, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                StringBuilder sb = new StringBuilder("lib/");
                sb.append(Build.CPU_ABI);
                sb.append("/");
                sb.append(System.mapLibraryName(str));
                ZipEntry entry = zipFile.getEntry(sb.toString());
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb2 = new StringBuilder("lib/");
                    String str2 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    sb2.append(str2.substring(0, indexOf));
                    sb2.append("/");
                    sb2.append(System.mapLibraryName(str));
                    String sb3 = sb2.toString();
                    ZipEntry entry2 = zipFile.getEntry(sb3);
                    if (entry2 == null) {
                        StringBuilder sb4 = new StringBuilder("Library entry not found:");
                        sb4.append(sb3);
                        String sb5 = sb4.toString();
                        C9984i.m29565a((Closeable) null);
                        C9984i.m29565a((Closeable) null);
                        C9984i.m29567a(zipFile);
                        return sb5;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    inputStream = inputStream2;
                    th = th2;
                    C9984i.m29565a((Closeable) fileOutputStream2);
                    C9984i.m29565a((Closeable) inputStream);
                    C9984i.m29567a(zipFile);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C9984i.m29566a(file.getAbsolutePath(), 493);
                            C9984i.m29565a((Closeable) fileOutputStream);
                            C9984i.m29565a((Closeable) inputStream2);
                            C9984i.m29567a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    fileOutputStream2 = fileOutputStream;
                    inputStream = inputStream2;
                    th = th3;
                    C9984i.m29565a((Closeable) fileOutputStream2);
                    C9984i.m29565a((Closeable) inputStream);
                    C9984i.m29567a(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                C9984i.m29565a((Closeable) fileOutputStream2);
                C9984i.m29565a((Closeable) inputStream);
                C9984i.m29567a(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            C9984i.m29565a((Closeable) fileOutputStream2);
            C9984i.m29565a((Closeable) inputStream);
            C9984i.m29567a(zipFile);
            throw th;
        }
    }
}
