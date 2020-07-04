package com.zego.zegoliveroom.utils;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.C1642a;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import java.io.File;

public final class SoLoadUtil {

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private static String[] getSupportABIs() {
        if (VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    private static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }

    private static String versionFileName(int i) {
        return C1642a.m8034a("cur_ver_%d.txt", new Object[]{Integer.valueOf(i)});
    }

    private static File getCustomizeLibDir(Context context, String str) {
        return new File(context.getDir("libs", 0), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean copyFile(java.io.File r7, java.io.File r8) throws java.io.IOException {
        /*
            java.io.File r0 = r8.getParentFile()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x000d
            r0.mkdirs()
        L_0x000d:
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x004b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004b }
            r2.<init>(r7)     // Catch:{ all -> 0x004b }
            r1.<init>(r2)     // Catch:{ all -> 0x004b }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0049 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0049 }
            r3 = 0
            r2.<init>(r8, r3)     // Catch:{ all -> 0x0049 }
            r7.<init>(r2)     // Catch:{ all -> 0x0049 }
            r8 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r8]     // Catch:{ all -> 0x0046 }
            r2 = 0
        L_0x0028:
            int r4 = r1.read(r0, r3, r8)     // Catch:{ all -> 0x0046 }
            r5 = -1
            r6 = 1
            if (r4 == r5) goto L_0x003c
            r7.write(r0, r3, r4)     // Catch:{ all -> 0x0046 }
            int r2 = r2 + r6
            int r4 = r2 % 10
            if (r4 != 0) goto L_0x0028
            r7.flush()     // Catch:{ all -> 0x0046 }
            goto L_0x0028
        L_0x003c:
            r7.flush()     // Catch:{ all -> 0x0046 }
            r1.close()
            r7.close()
            return r6
        L_0x0046:
            r8 = move-exception
            r0 = r7
            goto L_0x004d
        L_0x0049:
            r8 = move-exception
            goto L_0x004d
        L_0x004b:
            r8 = move-exception
            r1 = r0
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()
        L_0x0052:
            if (r0 == 0) goto L_0x0057
            r0.close()
        L_0x0057:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.zegoliveroom.utils.SoLoadUtil.copyFile(java.io.File, java.io.File):boolean");
    }

    public static boolean loadSoFile(String str, Context context) {
        int i;
        File customizeLibDir = getCustomizeLibDir(context, "apk");
        File file = new File(customizeLibDir, versionFileName(getVersionCode(context)));
        File file2 = new File(customizeLibDir, str);
        if (!file.exists() || !file2.exists()) {
            i = unzipSo(context, str, file2, file);
        } else {
            i = 0;
        }
        if (i != 0 || !file.exists() || !file2.exists()) {
            return false;
        }
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(file2.getPath());
        return true;
    }

    public static boolean loadSpecialLibrary(String str, Context context) throws Exception {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(str);
        } catch (UnsatisfiedLinkError unused) {
            File file2 = new File(getCustomizeLibDir(context, "ext"), file.getName());
            if (!file2.exists() || file2.length() != file.length()) {
                copyFile(file, file2);
            }
            if (file2.exists()) {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(file2.getAbsolutePath());
            }
        }
        return true;
    }

    private static int unzipSo(Context context, String str, File file, File file2) {
        String packageCodePath = context.getPackageCodePath();
        String[] supportABIs = getSupportABIs();
        int length = supportABIs.length;
        int i = 0;
        while (i < length) {
            try {
                if (!unzipSpecialABISo(packageCodePath, str, supportABIs[i], file)) {
                    i++;
                } else if (file2.createNewFile()) {
                    return 0;
                } else {
                    return -1;
                }
            } catch (Exception unused) {
                return -2;
            }
        }
        return -3;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c A[SYNTHETIC, Splitter:B:37:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean unzipSpecialABISo(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0090, all -> 0x0088 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0090, all -> 0x0088 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0090, all -> 0x0088 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0090, all -> 0x0088 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0090, all -> 0x0088 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0090, all -> 0x0088 }
        L_0x0011:
            java.util.zip.ZipEntry r5 = r2.getNextEntry()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r3 = 1
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r4 = "../"
            boolean r4 = r5.contains(r4)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            if (r4 != 0) goto L_0x003b
            java.lang.String r4 = "lib/"
            boolean r4 = r5.startsWith(r4)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            if (r4 == 0) goto L_0x0011
            r4 = 4
            boolean r4 = r5.startsWith(r7, r4)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            if (r4 == 0) goto L_0x0011
            boolean r5 = r5.endsWith(r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            if (r5 == 0) goto L_0x0011
            r5 = 1
            goto L_0x0044
        L_0x003b:
            java.lang.SecurityException r5 = new java.lang.SecurityException     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r6 = "unsecurity zip file!"
            r5.<init>(r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            throw r5     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 == 0) goto L_0x0080
            r5 = 65536(0x10000, float:9.18355E-41)
            byte[] r6 = new byte[r5]     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.io.File r7 = r8.getParentFile()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            boolean r4 = r7.exists()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            if (r4 != 0) goto L_0x0057
            r7.mkdirs()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
        L_0x0057:
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0079 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0079 }
            r4.<init>(r8)     // Catch:{ all -> 0x0079 }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0079 }
        L_0x0061:
            int r8 = r2.read(r6, r1, r5)     // Catch:{ all -> 0x0076 }
            r0 = -1
            if (r8 == r0) goto L_0x006c
            r7.write(r6, r1, r8)     // Catch:{ all -> 0x0076 }
            goto L_0x0061
        L_0x006c:
            r7.flush()     // Catch:{ all -> 0x0076 }
            r7.close()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r2.close()
            return r3
        L_0x0076:
            r5 = move-exception
            r0 = r7
            goto L_0x007a
        L_0x0079:
            r5 = move-exception
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r0.close()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
        L_0x007f:
            throw r5     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
        L_0x0080:
            r2.close()
            goto L_0x0095
        L_0x0084:
            r5 = move-exception
            goto L_0x008a
        L_0x0086:
            r0 = r2
            goto L_0x0090
        L_0x0088:
            r5 = move-exception
            r2 = r0
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            r2.close()
        L_0x008f:
            throw r5
        L_0x0090:
            if (r0 == 0) goto L_0x0095
            r0.close()
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.zegoliveroom.utils.SoLoadUtil.unzipSpecialABISo(java.lang.String, java.lang.String, java.lang.String, java.io.File):boolean");
    }
}
