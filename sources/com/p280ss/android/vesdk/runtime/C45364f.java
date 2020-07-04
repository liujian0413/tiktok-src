package com.p280ss.android.vesdk.runtime;

import android.content.Context;
import android.os.Build;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.vesdk.C45331n;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.vesdk.runtime.f */
public final class C45364f {

    /* renamed from: a */
    private static List<String> f116879a = new ArrayList();

    /* renamed from: a */
    private static File m143382a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            C45331n.m143273b(file.getAbsolutePath());
        }
        return file;
    }

    /* renamed from: a */
    private static String m143385a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    /* renamed from: a */
    private static File m143383a(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File a = m143382a(context);
        if (a != null) {
            return new File(a, mapLibraryName);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m143386a(java.lang.String r7, android.content.Context r8) {
        /*
            java.lang.Class<com.ss.android.vesdk.runtime.f> r0 = com.p280ss.android.vesdk.runtime.C45364f.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = f116879a     // Catch:{ all -> 0x0082 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0082 }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r1 = 0
            com.p280ss.android.vesdk.runtime.C45365g.m143387a(r7)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            java.util.List<java.lang.String> r3 = f116879a     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            r3.add(r7)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            goto L_0x007e
        L_0x0018:
            monitor-exit(r0)
            return r1
        L_0x001a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "loadLibrary "
            r4.<init>(r5)     // Catch:{ all -> 0x0082 }
            r4.append(r7)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = " error."
            r4.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = m143385a(r3)     // Catch:{ all -> 0x0082 }
            r4.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0082 }
            r5 = 4
            com.p280ss.android.ttve.log.C20456a.m67876a(r5, r4)     // Catch:{ all -> 0x0082 }
            java.io.File r4 = m143383a(r8, r7)     // Catch:{ all -> 0x0082 }
            if (r4 != 0) goto L_0x0041
            monitor-exit(r0)
            return r1
        L_0x0041:
            boolean r6 = r4.exists()     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x004a
            r4.delete()     // Catch:{ all -> 0x0082 }
        L_0x004a:
            java.lang.String r8 = m143384a(r8, r7, r4)     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0072
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r7.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x0082 }
            r7.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "["
            r7.append(r2)     // Catch:{ all -> 0x0082 }
            r7.append(r8)     // Catch:{ all -> 0x0082 }
            java.lang.String r8 = "]"
            r7.append(r8)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0082 }
            com.p280ss.android.ttve.log.C20456a.m67876a(r5, r7)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)
            return r1
        L_0x0072:
            java.lang.String r8 = r4.getAbsolutePath()     // Catch:{ Throwable -> 0x0080 }
            com.p280ss.android.vesdk.runtime.C45365g.m143388b(r8)     // Catch:{ Throwable -> 0x0080 }
            java.util.List<java.lang.String> r8 = f116879a     // Catch:{ Throwable -> 0x0080 }
            r8.add(r7)     // Catch:{ Throwable -> 0x0080 }
        L_0x007e:
            monitor-exit(r0)
            return r2
        L_0x0080:
            monitor-exit(r0)
            return r1
        L_0x0082:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.runtime.C45364f.m143386a(java.lang.String, android.content.Context):boolean");
    }

    /* renamed from: a */
    private static String m143384a(Context context, String str, File file) {
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
                        C45331n.m143269a((Closeable) null);
                        C45331n.m143269a((Closeable) null);
                        C45331n.m143272a(zipFile);
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
                    C45331n.m143269a((Closeable) fileOutputStream2);
                    C45331n.m143269a((Closeable) inputStream);
                    C45331n.m143272a(zipFile);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C45331n.m143271a(file.getAbsolutePath(), 493);
                            C45331n.m143269a((Closeable) fileOutputStream);
                            C45331n.m143269a((Closeable) inputStream2);
                            C45331n.m143272a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    fileOutputStream2 = fileOutputStream;
                    inputStream = inputStream2;
                    th = th3;
                    C45331n.m143269a((Closeable) fileOutputStream2);
                    C45331n.m143269a((Closeable) inputStream);
                    C45331n.m143272a(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                C45331n.m143269a((Closeable) fileOutputStream2);
                C45331n.m143269a((Closeable) inputStream);
                C45331n.m143272a(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            C45331n.m143269a((Closeable) fileOutputStream2);
            C45331n.m143269a((Closeable) inputStream);
            C45331n.m143272a(zipFile);
            throw th;
        }
    }
}
