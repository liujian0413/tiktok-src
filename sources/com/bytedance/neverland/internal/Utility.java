package com.bytedance.neverland.internal;

import android.util.Base64;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;

public class Utility {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String getReadableTime(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return simpleDateFormat.format(new Date(j));
    }

    public static String obtainStringFromInputStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                closeQuietly(byteArrayOutputStream);
            }
        }
    }

    static String compress(String str) {
        GZIPOutputStream gZIPOutputStream;
        String replace = str.replace("\t", "").replace("Caused by: ", "");
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(replace.getBytes("UTF-8"));
                gZIPOutputStream.flush();
                closeQuietly(gZIPOutputStream);
                try {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    return new String(Base64.encode(byteArray, 0, byteArray.length, 0));
                } finally {
                    closeQuietly(byteArrayOutputStream);
                }
            } catch (IOException unused) {
                closeQuietly(gZIPOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream2 = gZIPOutputStream;
                closeQuietly(gZIPOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            gZIPOutputStream = null;
            closeQuietly(gZIPOutputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(gZIPOutputStream2);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String readFile(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            long r1 = r0.length()
            int r1 = (int) r1
            r4.<init>(r1)
            r1 = 0
            java.util.Scanner r2 = new java.util.Scanner     // Catch:{ IOException -> 0x0049, all -> 0x0041 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0049, all -> 0x0041 }
        L_0x0015:
            boolean r0 = r2.hasNextLine()     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            r0.<init>()     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            java.lang.String r3 = r2.nextLine()     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            r0.append(r3)     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            java.lang.String r3 = "\n"
            r0.append(r3)     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            r4.append(r0)     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            goto L_0x0015
        L_0x0034:
            r2.close()     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x004a, all -> 0x003f }
            r2.close()
            return r4
        L_0x003f:
            r4 = move-exception
            goto L_0x0043
        L_0x0041:
            r4 = move-exception
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()
        L_0x0048:
            throw r4
        L_0x0049:
            r2 = r1
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r2.close()
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.neverland.internal.Utility.readFile(java.lang.String):java.lang.String");
    }

    public static boolean saveStringToFile(File file, String str) {
        PrintWriter printWriter = null;
        try {
            PrintWriter printWriter2 = new PrintWriter(file.getPath());
            try {
                printWriter2.println(str);
                closeQuietly(printWriter2);
                return true;
            } catch (FileNotFoundException unused) {
                printWriter = printWriter2;
                closeQuietly(printWriter);
                return false;
            } catch (Throwable th) {
                th = th;
                printWriter = printWriter2;
                closeQuietly(printWriter);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            closeQuietly(printWriter);
            return false;
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(printWriter);
            throw th;
        }
    }
}
