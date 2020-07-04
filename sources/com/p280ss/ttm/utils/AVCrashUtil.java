package com.p280ss.ttm.utils;

import android.content.Context;
import android.util.Base64;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ss.ttm.utils.AVCrashUtil */
public final class AVCrashUtil {
    public static String getBase64SampleCrash(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    public static boolean existsCrashFile(Context context, String str) {
        if (context == null && str == null) {
            return false;
        }
        return new File(str).exists();
    }

    public static void compress(InputStream inputStream, OutputStream outputStream) throws Exception {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[VideoPreloadSizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr, 0, VideoPreloadSizeExperiment.DEFAULT);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                return;
            }
        }
    }

    public static void deleteCrashFile(Context context, String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        return copyFile(str, str2, z, true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|(0)|23|24|25|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0055 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC, Splitter:B:21:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCrashFileContext(android.content.Context r5, java.lang.String r6, java.lang.StringBuilder r7) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0065
            if (r6 != 0) goto L_0x0006
            goto L_0x0065
        L_0x0006:
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r1 = r5.exists()
            if (r1 != 0) goto L_0x001f
            java.lang.String r5 = "file not exist.path:"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = "\r\n"
            r7.append(r5)
            return r0
        L_0x001f:
            long r1 = r5.length()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x002f
            java.lang.String r5 = "file size is zore.\r\n"
            r7.append(r5)
            return r0
        L_0x002f:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004e }
            r1.<init>(r5)     // Catch:{ Exception -> 0x004e }
            compress(r1, r6)     // Catch:{ Exception -> 0x004c }
            r1.close()     // Catch:{ Exception -> 0x004c }
            byte[] r5 = r6.toByteArray()     // Catch:{ Exception -> 0x004c }
            r2 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ Exception -> 0x004c }
            r6.close()     // Catch:{ Exception -> 0x004c }
            return r5
        L_0x004c:
            r5 = move-exception
            goto L_0x0050
        L_0x004e:
            r5 = move-exception
            r1 = r0
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r6.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            java.lang.String r6 = "gzip file is error.error:"
            r7.append(r6)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            return r0
        L_0x0065:
            java.lang.String r5 = "context or path is null.\r\n"
            r7.append(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.utils.AVCrashUtil.getCrashFileContext(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC, Splitter:B:45:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080 A[Catch:{ IOException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0087 A[SYNTHETIC, Splitter:B:55:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x008c A[Catch:{ IOException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0093 A[SYNTHETIC, Splitter:B:65:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098 A[Catch:{ IOException -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            r1 = 0
            if (r5 != 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r5 = r0.isFile()
            if (r5 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x003f
            java.io.File r6 = new java.io.File
            r6.<init>(r4)
            r6.delete()
            goto L_0x003f
        L_0x002a:
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x003f
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L_0x003f
            return r1
        L_0x003f:
            r4 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0084, all -> 0x0075 }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0084, all -> 0x0075 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0085, all -> 0x0072 }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0085, all -> 0x0072 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
        L_0x004e:
            int r5 = r6.read(r4)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            r3 = -1
            if (r5 == r3) goto L_0x0059
            r2.write(r4, r1, r5)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            goto L_0x004e
        L_0x0059:
            r2.close()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            r6.close()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            if (r7 == 0) goto L_0x0064
            r0.delete()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
        L_0x0064:
            r2.close()     // Catch:{ IOException -> 0x006a }
            r6.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            r4 = 1
            return r4
        L_0x006c:
            r4 = move-exception
            goto L_0x0079
        L_0x006e:
            r4 = r2
            goto L_0x0085
        L_0x0070:
            r4 = r2
            goto L_0x0091
        L_0x0072:
            r5 = move-exception
            r2 = r4
            goto L_0x0078
        L_0x0075:
            r5 = move-exception
            r6 = r4
            r2 = r6
        L_0x0078:
            r4 = r5
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ IOException -> 0x0083 }
        L_0x007e:
            if (r6 == 0) goto L_0x0083
            r6.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            throw r4
        L_0x0084:
            r6 = r4
        L_0x0085:
            if (r4 == 0) goto L_0x008a
            r4.close()     // Catch:{ IOException -> 0x008f }
        L_0x008a:
            if (r6 == 0) goto L_0x008f
            r6.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return r1
        L_0x0090:
            r6 = r4
        L_0x0091:
            if (r4 == 0) goto L_0x0096
            r4.close()     // Catch:{ IOException -> 0x009b }
        L_0x0096:
            if (r6 == 0) goto L_0x009b
            r6.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.utils.AVCrashUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
