package com.p280ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.codec.binary.Base64;

/* renamed from: com.ss.android.ugc.aweme.utils.bg */
public final class C42973bg {
    /* renamed from: a */
    public static long m136421a() {
        StatFs statFs;
        long j;
        try {
            statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        } catch (IllegalArgumentException unused) {
            statFs = null;
        }
        if (statFs == null) {
            j = 0;
        } else if (VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } else {
            j = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        }
        return (j / 1024) / 1024;
    }

    /* renamed from: b */
    public static long m136429b() {
        StatFs statFs;
        try {
            statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        } catch (IllegalArgumentException unused) {
            statFs = null;
        }
        long j = 0;
        if (statFs != null) {
            if (VERSION.SDK_INT >= 18) {
                j = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            } else {
                j = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            }
        }
        return (j / 1024) / 1024;
    }

    /* renamed from: a */
    public static void m136425a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m136427a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: b */
    public static String m136430b(String str) throws IOException {
        return new String(Base64.encodeBase64(m136428a(new File(str))));
    }

    /* renamed from: c */
    public static void m136431c(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m136431c(file2.getPath());
                        } else {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[SYNTHETIC, Splitter:B:15:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035 A[SYNTHETIC, Splitter:B:21:0x0035] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m136432d(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0033, all -> 0x002b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0033, all -> 0x002b }
            int r2 = r1.read()     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            int r2 = r2 << 8
            int r0 = r1.read()     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            r2 = r2 ^ r0
            int r2 = r2 << 8
            int r0 = r1.read()     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            r2 = r2 ^ r0
            int r2 = r2 << 8
            int r0 = r1.read()     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            r2 = r2 ^ r0
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            return r2
        L_0x0027:
            r2 = move-exception
            goto L_0x002d
        L_0x0029:
            r0 = r1
            goto L_0x0033
        L_0x002b:
            r2 = move-exception
            r1 = r0
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r2
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42973bg.m136432d(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static byte[] m136428a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[((int) file.length())];
        int i = 0;
        while (i < bArr.length) {
            int read = fileInputStream.read(bArr, i, bArr.length - i);
            if (read < 0) {
                break;
            }
            i += read;
        }
        if (i >= bArr.length) {
            fileInputStream.close();
            return bArr;
        }
        StringBuilder sb = new StringBuilder("Could not completely read file ");
        sb.append(file.getName());
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public static String m136423a(File file, String str) {
        try {
            return m136424a((InputStream) new FileInputStream(file), str);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static File m136422a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                file.mkdirs();
            } else {
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[Catch:{ Exception -> 0x0044, all -> 0x003b }, LOOP:0: B:14:0x0027->B:16:0x002e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[EDGE_INSN: B:17:0x0033->B:18:? ?: BREAK  
    EDGE_INSN: B:17:0x0033->B:18:? ?: BREAK  , SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f A[SYNTHETIC, Splitter:B:25:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0046 A[SYNTHETIC, Splitter:B:33:0x0046] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m136424a(java.io.InputStream r4, java.lang.String r5) {
        /*
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.String r2 = ""
            java.lang.String r3 = r5.trim()     // Catch:{ Exception -> 0x0043, all -> 0x001c }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x0043, all -> 0x001c }
            if (r2 == 0) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0043, all -> 0x001c }
            r2.<init>(r4, r5)     // Catch:{ Exception -> 0x0043, all -> 0x001c }
            r5 = r2
            goto L_0x0023
        L_0x001c:
            r4 = move-exception
            goto L_0x003d
        L_0x001e:
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0043, all -> 0x001c }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0043, all -> 0x001c }
        L_0x0023:
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ Exception -> 0x0044, all -> 0x003b }
        L_0x0027:
            r2 = -1
            int r3 = r5.read(r4)     // Catch:{ Exception -> 0x0044, all -> 0x003b }
            if (r2 == r3) goto L_0x0033
            r2 = 0
            r0.write(r4, r2, r3)     // Catch:{ Exception -> 0x0044, all -> 0x003b }
            goto L_0x0027
        L_0x0033:
            r5.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            java.lang.String r4 = r0.toString()
            return r4
        L_0x003b:
            r4 = move-exception
            r1 = r5
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            throw r4
        L_0x0043:
            r5 = r1
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            r5.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42973bg.m136424a(java.io.InputStream, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m136426a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    m136425a((Closeable) inputStream);
                    m136425a((Closeable) outputStream);
                    return true;
                }
            } catch (Exception unused) {
                m136425a((Closeable) inputStream);
                m136425a((Closeable) outputStream);
                return false;
            } catch (Throwable th) {
                m136425a((Closeable) inputStream);
                m136425a((Closeable) outputStream);
                throw th;
            }
        }
    }
}
