package com.p280ss.android.medialib.p883d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/* renamed from: com.ss.android.medialib.d.e */
public class C19719e {

    /* renamed from: a */
    private static final String f53482a = "com.ss.android.medialib.d.e";

    /* renamed from: b */
    private static int f53483b = 2048;

    /* renamed from: a */
    private static void m65020a(Closeable... closeableArr) {
        if (closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static ZipInputStream m65018a(Context context, int i) {
        if (context == null) {
            return null;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            return null;
        }
        return new ZipInputStream(resources.openRawResource(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        m65020a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r4 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[ExcHandler: all (r8v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x001d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m65017a(java.lang.String r8, java.util.zip.ZipInputStream r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L_0x0005
            java.lang.String r8 = ""
            return r8
        L_0x0005:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L_0x0019
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0019
            r0.mkdirs()
        L_0x0019:
            java.lang.String r0 = ""
            r1 = 0
            r2 = 1
            java.util.zip.ZipEntry r3 = r9.getNextEntry()     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
            r4.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
            r4.append(r8)     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
            java.lang.String r5 = r3.getName()     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
            r4.append(r5)     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0089 }
        L_0x0038:
            if (r3 == 0) goto L_0x0081
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            r5.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            r5.append(r8)     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            java.lang.String r6 = r3.getName()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            r5.append(r6)     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            boolean r5 = r0.exists()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            if (r5 == 0) goto L_0x0061
            java.util.zip.ZipEntry r3 = r9.getNextEntry()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            goto L_0x0038
        L_0x0061:
            boolean r3 = r3.isDirectory()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            if (r3 == 0) goto L_0x0075
            boolean r3 = r0.exists()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            if (r3 != 0) goto L_0x0070
            r0.mkdirs()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
        L_0x0070:
            java.util.zip.ZipEntry r3 = r9.getNextEntry()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            goto L_0x0038
        L_0x0075:
            int r3 = f53483b     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            r7.m65019a(r9, r0, r3)     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            java.util.zip.ZipEntry r3 = r9.getNextEntry()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            goto L_0x0038
        L_0x0081:
            r9.close()     // Catch:{ Exception -> 0x0093, all -> 0x0089 }
            java.io.Closeable[] r8 = new java.io.Closeable[r2]
            r8[r1] = r9
            goto L_0x0097
        L_0x0089:
            r8 = move-exception
            java.io.Closeable[] r0 = new java.io.Closeable[r2]
            r0[r1] = r9
            m65020a(r0)
            throw r8
        L_0x0092:
            r4 = r0
        L_0x0093:
            java.io.Closeable[] r8 = new java.io.Closeable[r2]
            r8[r1] = r9
        L_0x0097:
            m65020a(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.p883d.C19719e.m65017a(java.lang.String, java.util.zip.ZipInputStream):java.lang.String");
    }

    /* renamed from: a */
    private void m65019a(ZipInputStream zipInputStream, File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        Closeable[] closeableArr;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream, f53483b);
                while (true) {
                    try {
                        int read = zipInputStream.read(bArr, 0, f53483b);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream2.write(bArr, 0, read);
                    } catch (IOException unused) {
                        bufferedOutputStream = bufferedOutputStream2;
                        closeableArr = new Closeable[]{fileOutputStream, bufferedOutputStream};
                        m65020a(closeableArr);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        m65020a(fileOutputStream, bufferedOutputStream);
                        throw th;
                    }
                }
                bufferedOutputStream2.flush();
                closeableArr = new Closeable[]{fileOutputStream, bufferedOutputStream2};
            } catch (IOException unused2) {
                closeableArr = new Closeable[]{fileOutputStream, bufferedOutputStream};
                m65020a(closeableArr);
            } catch (Throwable th2) {
                th = th2;
                m65020a(fileOutputStream, bufferedOutputStream);
                throw th;
            }
        } catch (IOException unused3) {
            fileOutputStream = null;
            closeableArr = new Closeable[]{fileOutputStream, bufferedOutputStream};
            m65020a(closeableArr);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            m65020a(fileOutputStream, bufferedOutputStream);
            throw th;
        }
        m65020a(closeableArr);
    }

    /* renamed from: a */
    public final String mo52424a(Context context, int i, String str) {
        if (context == null || i == 0 || TextUtils.isEmpty(str)) {
            return "";
        }
        return m65017a(str, m65018a(context, i));
    }
}
