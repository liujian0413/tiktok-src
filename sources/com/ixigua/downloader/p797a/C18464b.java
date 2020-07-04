package com.ixigua.downloader.p797a;

import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.ixigua.downloader.a.b */
public final class C18464b {
    /* renamed from: a */
    public static boolean m60807a(File file) {
        return file.exists();
    }

    /* renamed from: a */
    public static boolean m60805a() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static InputStream m60800a(InputStream inputStream) {
        if (inputStream instanceof BufferedInputStream) {
            return inputStream;
        }
        return new BufferedInputStream(inputStream, 524288);
    }

    /* renamed from: d */
    public static boolean m60813d(String str) {
        return m60818g(new File(str));
    }

    /* renamed from: e */
    public static void m60814e(String str) {
        m60810c(new File(str));
    }

    /* renamed from: f */
    private static boolean m60816f(File file) {
        if (file == null) {
            return false;
        }
        return file.mkdirs();
    }

    /* renamed from: a */
    public static long m60799a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m60809b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m60811c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isDirectory() || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m60812d(File file) {
        if (!file.exists() || !file.isFile() || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m60815e(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return true;
        }
        return m60816f(parentFile);
    }

    /* renamed from: f */
    public static boolean m60817f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m60812d(new File(str));
    }

    /* renamed from: g */
    private static boolean m60818g(File file) {
        if (m60815e(file)) {
            if (file.isFile()) {
                try {
                    return file.createNewFile();
                } catch (IOException unused) {
                }
            } else if (file.isDirectory()) {
                return file.mkdir();
            }
        }
        return false;
    }

    /* renamed from: a */
    private static OutputStream m60801a(OutputStream outputStream) {
        if (outputStream instanceof BufferedOutputStream) {
            return outputStream;
        }
        return new BufferedOutputStream(outputStream, 524288);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC, Splitter:B:21:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0030 A[SYNTHETIC, Splitter:B:26:0x0030] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m60808b(java.io.File r3) {
        /*
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x000e
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L_0x000e
            r3 = 1
            return r3
        L_0x000e:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0020, all -> 0x0027 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0020, all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0020, all -> 0x0027 }
            boolean r3 = r3.setLastModified(r1)     // Catch:{ IOException -> 0x0020, all -> 0x0027 }
            return r3
        L_0x0020:
            goto L_0x002e
        L_0x0022:
            r3 = move-exception
            r0 = r1
            goto L_0x0028
        L_0x0025:
            r0 = r1
            goto L_0x002e
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r3
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ixigua.downloader.p797a.C18464b.m60808b(java.io.File):boolean");
    }

    /* renamed from: c */
    public static void m60810c(File file) {
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists() && file.isFile()) {
                m60812d(file);
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    m60812d(file2);
                } else if (file2.isDirectory()) {
                    m60810c(file2);
                }
            }
        }
        m60812d(file);
    }

    /* renamed from: a */
    private static boolean m60806a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m60802a(File file, String str) throws IOException {
        if (file.exists()) {
            File file2 = new File(str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            ZipFile zipFile = new ZipFile(file);
            Enumeration entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                File file3 = new File(file2, zipEntry.getName());
                if (zipEntry.isDirectory()) {
                    file3.mkdirs();
                } else {
                    m60818g(file3);
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    m60803a(zipFile.getInputStream(zipEntry), (OutputStream) fileOutputStream);
                    fileOutputStream.close();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m60803a(InputStream inputStream, OutputStream outputStream) throws IOException {
        OutputStream outputStream2;
        InputStream inputStream2;
        Throwable e;
        OutputStream outputStream3;
        try {
            byte[] bArr = new byte[524288];
            inputStream2 = m60800a(inputStream);
            try {
                outputStream2 = m60801a(outputStream);
                while (true) {
                    try {
                        int read = inputStream2.read(bArr);
                        if (read != -1) {
                            outputStream2.write(bArr, 0, read);
                            outputStream2.flush();
                        } else {
                            m60806a((Closeable) inputStream2);
                            m60806a((Closeable) outputStream2);
                            return;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        outputStream3 = outputStream2;
                        inputStream = inputStream2;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            outputStream2 = outputStream3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        m60806a((Closeable) inputStream2);
                        m60806a((Closeable) outputStream2);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                outputStream3 = outputStream;
                e = e3;
                inputStream = inputStream2;
                throw e;
            } catch (Throwable th3) {
                OutputStream outputStream4 = outputStream;
                th = th3;
                outputStream2 = outputStream4;
                m60806a((Closeable) inputStream2);
                m60806a((Closeable) outputStream2);
                throw th;
            }
        } catch (IOException e4) {
            Throwable th4 = e4;
            outputStream3 = outputStream;
            e = th4;
            throw e;
        } catch (Throwable th5) {
            inputStream2 = inputStream;
            outputStream2 = outputStream;
            th = th5;
            m60806a((Closeable) inputStream2);
            m60806a((Closeable) outputStream2);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|(0)|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0035 A[SYNTHETIC, Splitter:B:31:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x003b A[SYNTHETIC, Splitter:B:37:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0042 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m60804a(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.Class<com.ixigua.downloader.a.b> r5 = com.ixigua.downloader.p797a.C18464b.class
            monitor-enter(r5)
            if (r3 != 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            if (r4 != 0) goto L_0x000b
            monitor-exit(r5)
            return
        L_0x000b:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0044 }
            r0.<init>(r3)     // Catch:{ all -> 0x0044 }
            r3 = 0
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x0039, all -> 0x0032 }
            if (r1 != 0) goto L_0x001a
            m60818g(r0)     // Catch:{ IOException -> 0x0039, all -> 0x0032 }
        L_0x001a:
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0039, all -> 0x0032 }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x0039, all -> 0x0032 }
            r1.write(r4)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r1.flush()     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r1.close()     // Catch:{ IOException -> 0x002b }
            monitor-exit(r5)
            return
        L_0x002b:
            monitor-exit(r5)
            return
        L_0x002d:
            r4 = move-exception
            r3 = r1
            goto L_0x0033
        L_0x0030:
            r3 = r1
            goto L_0x0039
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            throw r4     // Catch:{ all -> 0x0044 }
        L_0x0039:
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ IOException -> 0x0040 }
            monitor-exit(r5)
            return
        L_0x0040:
            monitor-exit(r5)
            return
        L_0x0042:
            monitor-exit(r5)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ixigua.downloader.p797a.C18464b.m60804a(java.lang.String, java.lang.String, boolean):void");
    }
}
