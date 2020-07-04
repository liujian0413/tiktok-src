package com.p280ss.p811a.p813b;

import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.ss.a.b.e */
public final class C18886e {

    /* renamed from: a */
    private static List<String> f50899a = new ArrayList();

    /* renamed from: a */
    private static File m61649a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            C18882b.m61638a(file.getAbsolutePath());
        }
        return file;
    }

    /* renamed from: a */
    private static String m61650a(Context context, String str, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
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
                        message = sb4.toString();
                        C18882b.m61635a((Closeable) null);
                        C18882b.m61635a((Closeable) null);
                        C18882b.m61637a(zipFile);
                        return message;
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
                    C18882b.m61635a((Closeable) fileOutputStream2);
                    C18882b.m61635a((Closeable) inputStream);
                    C18882b.m61637a(zipFile);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C18882b.m61636a(file.getAbsolutePath(), 493);
                            C18882b.m61635a((Closeable) fileOutputStream);
                            C18882b.m61635a((Closeable) inputStream2);
                            C18882b.m61637a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    fileOutputStream2 = fileOutputStream;
                    inputStream = inputStream2;
                    th = th3;
                    C18882b.m61635a((Closeable) fileOutputStream2);
                    C18882b.m61635a((Closeable) inputStream);
                    C18882b.m61637a(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                C18882b.m61635a((Closeable) fileOutputStream2);
                C18882b.m61635a((Closeable) inputStream);
                C18882b.m61637a(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            C18882b.m61635a((Closeable) fileOutputStream2);
            C18882b.m61635a((Closeable) inputStream);
            C18882b.m61637a(zipFile);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0020 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0022 A[SYNTHETIC, Splitter:B:19:0x0022] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m61651a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<com.ss.a.b.e> r0 = com.p280ss.p811a.p813b.C18886e.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = f50899a     // Catch:{ all -> 0x0043 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x0043 }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r1 = 0
            com.p280ss.p811a.p813b.C18887f.m61653a(r6)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            java.util.List<java.lang.String> r3 = f50899a     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            r3.add(r6)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            goto L_0x003f
        L_0x0018:
            monitor-exit(r0)
            return r1
        L_0x001a:
            java.io.File r3 = m61652b(r5, r6)     // Catch:{ all -> 0x0043 }
            if (r3 != 0) goto L_0x0022
            monitor-exit(r0)
            return r1
        L_0x0022:
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x002b
            r3.delete()     // Catch:{ all -> 0x0043 }
        L_0x002b:
            java.lang.String r5 = m61650a(r5, r6, r3)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0033
            monitor-exit(r0)
            return r1
        L_0x0033:
            java.lang.String r5 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x0041 }
            com.p280ss.p811a.p813b.C18887f.m61654b(r5)     // Catch:{ Throwable -> 0x0041 }
            java.util.List<java.lang.String> r5 = f50899a     // Catch:{ Throwable -> 0x0041 }
            r5.add(r6)     // Catch:{ Throwable -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)
            return r2
        L_0x0041:
            monitor-exit(r0)
            return r1
        L_0x0043:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.p811a.p813b.C18886e.m61651a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    private static File m61652b(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File a = m61649a(context);
        if (a != null) {
            return new File(a, mapLibraryName);
        }
        return null;
    }
}
