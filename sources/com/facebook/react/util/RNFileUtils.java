package com.facebook.react.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class RNFileUtils {
    public static boolean loadSplitJsBundle(String str) {
        if (str == null || !str.startsWith("\"use splitCommon:true\";")) {
            return false;
        }
        return true;
    }

    public static String base64Md5(String str) {
        if (str == null) {
            return "";
        }
        try {
            return base64Md5(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String md5(String str) {
        if (str == null) {
            return "";
        }
        try {
            return md5(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String base64Md5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String md5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b A[SYNTHETIC, Splitter:B:24:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0040 A[SYNTHETIC, Splitter:B:28:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0046 A[SYNTHETIC, Splitter:B:34:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x004b A[SYNTHETIC, Splitter:B:38:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readStreamToString(java.io.InputStream r5) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0044, all -> 0x0038 }
            int r2 = r5.available()     // Catch:{ IOException -> 0x0044, all -> 0x0038 }
            int r2 = r2 + 10
            r1.<init>(r2)     // Catch:{ IOException -> 0x0044, all -> 0x0038 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0044, all -> 0x0038 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0044, all -> 0x0038 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0044, all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0044, all -> 0x0038 }
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r0 = new char[r0]     // Catch:{ IOException -> 0x0036, all -> 0x0032 }
        L_0x001a:
            int r3 = r2.read(r0)     // Catch:{ IOException -> 0x0036, all -> 0x0032 }
            if (r3 <= 0) goto L_0x0025
            r4 = 0
            r1.append(r0, r4, r3)     // Catch:{ IOException -> 0x0036, all -> 0x0032 }
            goto L_0x001a
        L_0x0025:
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0036, all -> 0x0032 }
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r5 == 0) goto L_0x0031
            r5.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x0039
        L_0x0036:
            r0 = r2
            goto L_0x0044
        L_0x0038:
            r1 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            if (r5 == 0) goto L_0x0043
            r5.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r1
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            if (r5 == 0) goto L_0x004e
            r5.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.util.RNFileUtils.readStreamToString(java.io.InputStream):java.lang.String");
    }

    public static String loadAsset(String str, Context context) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return readStreamToString(context.getAssets().open(str));
        } catch (IOException unused) {
            return "";
        }
    }

    public static String loadFileOrAsset(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return loadAsset(str, context);
            }
            try {
                return readStreamToString(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
            }
        }
        return "";
    }

    public static void extractSo(String str, String str2) throws IOException {
        ZipFile zipFile = new ZipFile(str);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.closeEntry();
                return;
            } else if (!nextEntry.isDirectory() && nextEntry.getName().contains("lib/armeabi/") && nextEntry.getName().contains("reactnativejni")) {
                String[] split = nextEntry.getName().split("/");
                String str3 = split[split.length - 1];
                InputStream inputStream = zipFile.getInputStream(nextEntry);
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("/");
                sb.append(str3);
                FileOutputStream fileOutputStream = new FileOutputStream(sb.toString());
                while (inputStream.read(bArr) != -1) {
                    fileOutputStream.write(bArr);
                }
                fileOutputStream.close();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC, Splitter:B:20:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0028 A[SYNTHETIC, Splitter:B:26:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveFile(java.lang.String r2, byte[] r3, android.content.Context r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L_0x002c
            if (r3 == 0) goto L_0x002c
            if (r4 != 0) goto L_0x000c
            goto L_0x002c
        L_0x000c:
            r4 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            r0.write(r3)     // Catch:{ Exception -> 0x001d, all -> 0x001a }
            r0.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            r2 = 1
            return r2
        L_0x001a:
            r2 = move-exception
            r4 = r0
            goto L_0x0020
        L_0x001d:
            r4 = r0
            goto L_0x0026
        L_0x001f:
            r2 = move-exception
        L_0x0020:
            if (r4 == 0) goto L_0x0025
            r4.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            throw r2
        L_0x0026:
            if (r4 == 0) goto L_0x002b
            r4.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            return r1
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.util.RNFileUtils.saveFile(java.lang.String, byte[], android.content.Context):boolean");
    }
}
