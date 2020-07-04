package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: com.facebook.soloader.n */
public final class C14624n {

    /* renamed from: com.facebook.soloader.n$a */
    static final class C14625a {
        public static String[] getSupportedAbis() {
            return Build.SUPPORTED_ABIS;
        }

        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && e.errno != OsConstants.ENOSYS && e.errno != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }
    }

    /* renamed from: a */
    public static String[] m42302a() {
        if (VERSION.SDK_INT >= 21) {
            return C14625a.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* renamed from: a */
    public static int m42297a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    static void m42303b(File file) throws IOException {
        if (!file.mkdirs() && !file.isDirectory()) {
            StringBuilder sb = new StringBuilder("cannot mkdir: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r3 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0.close();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m42304c(java.io.File r3) throws java.io.IOException {
        /*
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x002d
            java.io.File[] r0 = r3.listFiles()
            if (r0 == 0) goto L_0x0019
            r3 = 0
        L_0x000d:
            int r1 = r0.length
            if (r3 >= r1) goto L_0x0018
            r1 = r0[r3]
            m42304c(r1)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0018:
            return
        L_0x0019:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot list directory "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x002d:
            java.lang.String r0 = r3.getPath()
            java.lang.String r1 = "_lock"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x005f
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r3 = 0
            java.io.FileDescriptor r1 = r0.getFD()     // Catch:{ Throwable -> 0x004e }
            r1.sync()     // Catch:{ Throwable -> 0x004e }
            r0.close()
            return
        L_0x004c:
            r1 = move-exception
            goto L_0x0050
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0050:
            if (r3 == 0) goto L_0x005b
            r0.close()     // Catch:{ Throwable -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r0 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r3, r0)
            goto L_0x005e
        L_0x005b:
            r0.close()
        L_0x005e:
            throw r1
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14624n.m42304c(java.io.File):void");
    }

    /* renamed from: a */
    public static void m42300a(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a : listFiles) {
                    m42300a(a);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder("could not delete: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m42301a(FileDescriptor fileDescriptor, long j) throws IOException {
        if (VERSION.SDK_INT >= 21) {
            C14625a.fallocateIfSupported(fileDescriptor, j);
        }
    }

    /* renamed from: a */
    public static int m42299a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    static int m42298a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < Integer.MAX_VALUE) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }
}
