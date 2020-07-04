package com.ixigua.p795a.p796a;

import android.text.TextUtils;
import com.ixigua.downloader.p797a.C18464b;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.ixigua.a.a.f */
public final class C18458f {
    /* renamed from: c */
    public static boolean m60787c(String str) {
        return str.matches("[a-fA-F0-9]{32}");
    }

    /* renamed from: a */
    public static boolean m60784a(File file) {
        String name = file.getName();
        String b = m60785b(file);
        if (TextUtils.isEmpty(b) || !b.equalsIgnoreCase(name)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m60782a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m60786b(String str) {
        int i;
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists() || !parentFile.isDirectory()) {
            return null;
        }
        final String name = file.getName();
        File[] listFiles = parentFile.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                if (TextUtils.equals(file.getName(), name) || !C18458f.m60787c(file.getName())) {
                    return false;
                }
                return true;
            }
        });
        if (listFiles != null) {
            i = listFiles.length;
        } else {
            i = 0;
        }
        if (i > 0) {
            return listFiles[0].getPath();
        }
        return null;
    }

    /* renamed from: a */
    public static void m60783a(String str) {
        int i;
        File file = new File(str);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
                final String name = file.getName();
                File[] listFiles = parentFile.listFiles(new FileFilter() {
                    public final boolean accept(File file) {
                        if (!TextUtils.equals(file.getName(), name)) {
                            return true;
                        }
                        return false;
                    }
                });
                if (listFiles != null) {
                    i = listFiles.length;
                } else {
                    i = 0;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    C18464b.m60810c(listFiles[i2]);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        if (r4 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        if (r4 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0046, code lost:
        if (r4 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[SYNTHETIC, Splitter:B:19:0x0036] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m60785b(java.io.File r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0049
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L_0x0049
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0045, FileNotFoundException -> 0x0041, IOException -> 0x003a, all -> 0x0033 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ NoSuchAlgorithmException -> 0x0045, FileNotFoundException -> 0x0041, IOException -> 0x003a, all -> 0x0033 }
            r4.<init>(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0045, FileNotFoundException -> 0x0041, IOException -> 0x003a, all -> 0x0033 }
        L_0x0018:
            r7 = 0
            int r5 = r4.read(r2, r7, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0046, FileNotFoundException -> 0x0042, IOException -> 0x003b, all -> 0x0030 }
            r6 = -1
            if (r5 == r6) goto L_0x0024
            r3.update(r2, r7, r5)     // Catch:{ NoSuchAlgorithmException -> 0x0046, FileNotFoundException -> 0x0042, IOException -> 0x003b, all -> 0x0030 }
            goto L_0x0018
        L_0x0024:
            byte[] r7 = r3.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0046, FileNotFoundException -> 0x0042, IOException -> 0x003b, all -> 0x0030 }
            java.lang.String r7 = m60782a(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0046, FileNotFoundException -> 0x0042, IOException -> 0x003b, all -> 0x0030 }
            r4.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004a
        L_0x0030:
            r7 = move-exception
            r0 = r4
            goto L_0x0034
        L_0x0033:
            r7 = move-exception
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            throw r7
        L_0x003a:
            r4 = r0
        L_0x003b:
            if (r4 == 0) goto L_0x0049
        L_0x003d:
            r4.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0049
        L_0x0041:
            r4 = r0
        L_0x0042:
            if (r4 == 0) goto L_0x0049
            goto L_0x003d
        L_0x0045:
            r4 = r0
        L_0x0046:
            if (r4 == 0) goto L_0x0049
            goto L_0x003d
        L_0x0049:
            r7 = r0
        L_0x004a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ixigua.p795a.p796a.C18458f.m60785b(java.io.File):java.lang.String");
    }
}
