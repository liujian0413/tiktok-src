package com.bytedance.ies.geckoclient;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.ies.geckoclient.s */
public final class C10919s {

    /* renamed from: a */
    private static byte[] f29575a = {80, 75, 3, 4};

    /* renamed from: b */
    private static byte[] f29576b = {80, 75, 5, 6};

    /* renamed from: a */
    public final boolean mo26318a(String str) {
        return m32018a(new File(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c A[SYNTHETIC, Splitter:B:26:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0042 A[SYNTHETIC, Splitter:B:32:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m32018a(java.io.File r4) {
        /*
            boolean r0 = r4.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r4 = 4
            byte[] r0 = new byte[r4]     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            int r3 = r2.read(r0, r1, r4)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r3 != r4) goto L_0x0030
            byte[] r4 = f29575a     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            boolean r4 = java.util.Arrays.equals(r4, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r4 != 0) goto L_0x002e
            byte[] r4 = f29576b     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            boolean r4 = java.util.Arrays.equals(r4, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r4 == 0) goto L_0x0030
        L_0x002e:
            r4 = 1
            r1 = 1
        L_0x0030:
            r2.close()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0045
        L_0x0034:
            r4 = move-exception
            goto L_0x003a
        L_0x0036:
            r0 = r2
            goto L_0x0040
        L_0x0038:
            r4 = move-exception
            r2 = r0
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            throw r4
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10919s.m32018a(java.io.File):boolean");
    }

    /* renamed from: b */
    private static String m32020b(File file) {
        if (file == null) {
            return "tmpFile==null";
        }
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(file.getAbsolutePath());
            sb.append(";parent exists?");
            sb.append(file.getParentFile().exists());
            sb.append(";parent dir?");
            sb.append(file.getParentFile().isDirectory());
            sb.append(";write read");
            sb.append(file.getParentFile().canWrite());
            sb.append(file.getParentFile().canRead());
            sb.append(file.canWrite());
            sb.append(file.canRead());
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m32019a(String str, String str2) throws Exception {
        File file;
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        do {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                file = new File(nextEntry.getName());
                while (!TextUtils.isEmpty(file.getParent())) {
                    file = file.getParentFile();
                }
            } else {
                zipInputStream.close();
                return false;
            }
        } while (!TextUtils.equals(file.getPath(), str2));
        zipInputStream.close();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:1|2|(4:4|(4:6|(2:9|7)|78|10)|(2:14|(6:16|(1:18)|19|20|21|(2:25|76)(1:75))(13:26|27|28|29|(1:31)|32|33|34|35|(2:36|(1:38)(1:79))|39|40|77))|72)(1:47)) */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0131, code lost:
        r10 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x000e */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x000e A[LOOP:0: B:1:0x000e->B:72:0x000e, LOOP_START, PHI: r1 r2 r9 
      PHI: (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:0:0x0000, B:72:0x000e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v1 java.io.File) = (r2v0 java.io.File), (r2v6 java.io.File) binds: [B:0:0x0000, B:72:0x000e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v2 java.io.FileOutputStream) = (r9v1 java.io.FileOutputStream), (r9v5 java.io.FileOutputStream) binds: [B:0:0x0000, B:72:0x000e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0160  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo26317a(java.lang.String r9, java.lang.String r10, java.lang.String r11) throws java.lang.Exception {
        /*
            r8 = this;
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r9)
            r0.<init>(r1)
            r9 = 0
            java.lang.String r1 = ""
            r2 = r9
        L_0x000e:
            java.util.zip.ZipEntry r3 = r0.getNextEntry()     // Catch:{ Exception -> 0x0131 }
            if (r3 == 0) goto L_0x00db
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x0131 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0131 }
            if (r5 == 0) goto L_0x0036
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0131 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0131 }
        L_0x0023:
            java.lang.String r5 = r1.getParent()     // Catch:{ Exception -> 0x0131 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0131 }
            if (r5 != 0) goto L_0x0032
            java.io.File r1 = r1.getParentFile()     // Catch:{ Exception -> 0x0131 }
            goto L_0x0023
        L_0x0032:
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0131 }
        L_0x0036:
            if (r4 == 0) goto L_0x000e
            boolean r5 = r4.startsWith(r11)     // Catch:{ Exception -> 0x0131 }
            if (r5 == 0) goto L_0x000e
            boolean r3 = r3.isDirectory()     // Catch:{ Exception -> 0x0131 }
            r5 = 0
            if (r3 == 0) goto L_0x0089
            int r3 = r4.length()     // Catch:{ Exception -> 0x0131 }
            r6 = 1
            int r3 = r3 - r6
            java.lang.String r3 = r4.substring(r5, r3)     // Catch:{ Exception -> 0x0131 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0131 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0131 }
            r5.<init>()     // Catch:{ Exception -> 0x0131 }
            r5.append(r10)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Exception -> 0x0131 }
            r5.append(r7)     // Catch:{ Exception -> 0x0131 }
            r5.append(r3)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0131 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0131 }
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x0131 }
            if (r3 != 0) goto L_0x0071
            r4.mkdirs()     // Catch:{ Exception -> 0x0131 }
        L_0x0071:
            java.lang.String r3 = "HUAWEI"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Exception -> 0x000e }
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x000e }
            if (r3 != 0) goto L_0x0085
            java.lang.String r3 = "HONOR"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Exception -> 0x000e }
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x000e }
            if (r3 == 0) goto L_0x000e
        L_0x0085:
            r4.setWritable(r6)     // Catch:{ Exception -> 0x000e }
            goto L_0x000e
        L_0x0089:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0131 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0131 }
            r6.<init>()     // Catch:{ Exception -> 0x0131 }
            r6.append(r10)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Exception -> 0x0131 }
            r6.append(r7)     // Catch:{ Exception -> 0x0131 }
            r6.append(r4)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0131 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0131 }
            java.io.File r2 = r3.getParentFile()     // Catch:{ Exception -> 0x00d8 }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x00d8 }
            if (r2 != 0) goto L_0x00b3
            java.io.File r2 = r3.getParentFile()     // Catch:{ Exception -> 0x00d8 }
            r2.mkdirs()     // Catch:{ Exception -> 0x00d8 }
        L_0x00b3:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d8 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00d8 }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
        L_0x00bc:
            int r4 = r0.read(r9)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            r6 = -1
            if (r4 == r6) goto L_0x00ca
            r2.write(r9, r5, r4)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            r2.flush()     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            goto L_0x00bc
        L_0x00ca:
            r2.close()     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            r9 = r2
            r2 = r3
            goto L_0x000e
        L_0x00d1:
            r10 = move-exception
            r9 = r2
            goto L_0x015b
        L_0x00d5:
            r10 = move-exception
            r9 = r2
            goto L_0x00d9
        L_0x00d8:
            r10 = move-exception
        L_0x00d9:
            r2 = r3
            goto L_0x0137
        L_0x00db:
            r0.close()     // Catch:{ Exception -> 0x0131 }
            java.lang.String r11 = "/"
            boolean r11 = r1.endsWith(r11)     // Catch:{ Exception -> 0x0131 }
            if (r11 == 0) goto L_0x00ed
            java.lang.String r11 = "/"
            java.lang.String r3 = ""
            r1.replace(r11, r3)     // Catch:{ Exception -> 0x0131 }
        L_0x00ed:
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x0131 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0131 }
            r3.<init>()     // Catch:{ Exception -> 0x0131 }
            r3.append(r10)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r10 = java.io.File.separator     // Catch:{ Exception -> 0x0131 }
            r3.append(r10)     // Catch:{ Exception -> 0x0131 }
            r3.append(r1)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r10 = java.io.File.separator     // Catch:{ Exception -> 0x0131 }
            r3.append(r10)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r10 = "gecko_activate_done"
            r3.append(r10)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r10 = r3.toString()     // Catch:{ Exception -> 0x0131 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0131 }
            boolean r10 = r11.exists()     // Catch:{ Exception -> 0x0131 }
            if (r10 != 0) goto L_0x011d
            r11.createNewFile()     // Catch:{ Exception -> 0x011a }
            goto L_0x011e
        L_0x011a:
            r10 = move-exception
            r2 = r11
            goto L_0x0137
        L_0x011d:
            r11 = r2
        L_0x011e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            java.lang.String r2 = "unzip file done:"
            r10.<init>(r2)     // Catch:{ Exception -> 0x011a }
            r10.append(r1)     // Catch:{ Exception -> 0x011a }
            r0.close()
            if (r9 == 0) goto L_0x0130
            r9.close()
        L_0x0130:
            return r1
        L_0x0131:
            r10 = move-exception
            goto L_0x0137
        L_0x0133:
            r10 = move-exception
            goto L_0x015b
        L_0x0135:
            r10 = move-exception
            r2 = r9
        L_0x0137:
            java.lang.String r11 = m32020b(r2)     // Catch:{ all -> 0x0133 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            java.lang.String r3 = "解压失败:"
            r2.<init>(r3)     // Catch:{ all -> 0x0133 }
            r2.append(r11)     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = ":"
            r2.append(r11)     // Catch:{ all -> 0x0133 }
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch:{ all -> 0x0133 }
            r2.append(r10)     // Catch:{ all -> 0x0133 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x0133 }
            r1.<init>(r10)     // Catch:{ all -> 0x0133 }
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x015b:
            r0.close()
            if (r9 == 0) goto L_0x0163
            r9.close()
        L_0x0163:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10919s.mo26317a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
