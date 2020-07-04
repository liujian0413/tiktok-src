package com.p280ss.ttm.player;

import android.content.Context;
import android.os.Environment;
import android.util.Base64;
import com.C1642a;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ss.ttm.player.TTCrashUtil */
public final class TTCrashUtil {
    private static void deleteTrackFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static String getBase64SampleCrash(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    public static void checkTrackDir(String str) {
        File file = new File(C1642a.m8034a("%s/ttplayer_logs", new Object[]{str}));
        if (!file.exists()) {
            file.mkdir();
        }
    }

    public static void checkLogDir(String str) {
        File file = new File(C1642a.m8034a("%s/ttplayer_logs", new Object[]{str}));
        if (!file.exists()) {
            file.mkdir();
        } else if (file.isDirectory()) {
            for (File delete : file.listFiles()) {
                delete.delete();
            }
            file.delete();
        }
    }

    public static final String existsCrashFilePath(Context context) {
        if (TTPlayerConfiger.getValue(18, 1) == 1) {
            String appCrashFilePath = TTPlayerConfiger.getAppCrashFilePath(context);
            if (appCrashFilePath == null || !new File(appCrashFilePath).exists()) {
                return null;
            }
            return appCrashFilePath;
        }
        String appCrashFilePath2 = TTPlayerConfiger.getAppCrashFilePath2(context);
        if (appCrashFilePath2 != null && new File(appCrashFilePath2).exists()) {
            return appCrashFilePath2;
        }
        String plugerCrashFilePath = TTPlayerConfiger.getPlugerCrashFilePath(context);
        if (plugerCrashFilePath != null && new File(plugerCrashFilePath).exists()) {
            return plugerCrashFilePath;
        }
        String externalStorageDirectoryCrashFilePath = TTPlayerConfiger.getExternalStorageDirectoryCrashFilePath();
        if (externalStorageDirectoryCrashFilePath != null && !new File(externalStorageDirectoryCrashFilePath).exists()) {
            externalStorageDirectoryCrashFilePath = null;
        }
        return externalStorageDirectoryCrashFilePath;
    }

    public static void deleteDebugTrackFile(long j, String str) {
        deleteTrackFile(getDebugTrackFilePath(j, str));
    }

    public static void deleteTrackFile(long j, String str) {
        deleteTrackFile(getTrackFilePath(j, str));
    }

    public static boolean existsCrashFile(Context context, String str) {
        if (context == null && str == null) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean existsTrackFile(long j, String str) {
        return new File(getTrackFilePath(j, str)).exists();
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

    private static String getDebugTrackFilePath(long j, String str) {
        return C1642a.m8034a("%s/ttplayer_logs/%d_d.log", new Object[]{str, Long.valueOf(j)});
    }

    public static String getTrackFilePath(long j, String str) {
        return C1642a.m8034a("%s/ttplayer_logs/%d.log", new Object[]{str, Long.valueOf(j)});
    }

    public static void deleteCrashFile(Context context, String str) {
        if (TTPlayerConfiger.getValue(6, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/ttplayer.dump");
            copyFile(sb.toString(), str, true, true);
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean existLogsFile(long j, String str) {
        String valueOf = String.valueOf(j);
        File file = new File(C1642a.m8034a("%s/ttplayer_logs", new Object[]{str}));
        if (file.exists() && file.isDirectory()) {
            for (File name : file.listFiles()) {
                String name2 = name.getName();
                if (name2 != null && !name2.startsWith(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getTrackFileInfos(java.io.File r5, java.lang.StringBuilder r6) {
        /*
            r0 = 0
            boolean r1 = r5.exists()     // Catch:{ Throwable -> 0x0024 }
            r2 = 0
            if (r1 != 0) goto L_0x0009
            return r2
        L_0x0009:
            r1 = 1024(0x400, float:1.435E-42)
            char[] r3 = new char[r1]     // Catch:{ Throwable -> 0x0024 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Throwable -> 0x0024 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0024 }
        L_0x0012:
            int r5 = r4.read(r3)     // Catch:{ Throwable -> 0x0021 }
            if (r5 <= 0) goto L_0x001d
            r6.append(r3, r2, r5)     // Catch:{ Throwable -> 0x0021 }
            if (r5 >= r1) goto L_0x0012
        L_0x001d:
            r4.close()     // Catch:{ Throwable -> 0x0021 }
            goto L_0x003b
        L_0x0021:
            r5 = move-exception
            r0 = r4
            goto L_0x0025
        L_0x0024:
            r5 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            java.lang.String r0 = "track message:"
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = "\r\n"
            r6.append(r5)
        L_0x003b:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.getTrackFileInfos(java.io.File, java.lang.StringBuilder):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC, Splitter:B:18:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0035 A[SYNTHETIC, Splitter:B:24:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0039 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveLowMemoryInfo(int r2, java.lang.String r3) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0033, all -> 0x002b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0033, all -> 0x002b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r0 = "LOWM\r\nrecv low memory warring info.level:"
            r3.<init>(r0)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r3.append(r2)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r1.write(r2)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            return
        L_0x0027:
            r2 = move-exception
            goto L_0x002d
        L_0x0029:
            r3 = r1
            goto L_0x0033
        L_0x002b:
            r2 = move-exception
            r1 = r3
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r2
        L_0x0033:
            if (r3 == 0) goto L_0x0039
            r3.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            return
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.saveLowMemoryInfo(int, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[SYNTHETIC, Splitter:B:17:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getTrackFileInfos(java.lang.String r5, java.lang.StringBuilder r6) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x0036 }
            r1.<init>(r5)     // Catch:{ Throwable -> 0x0036 }
            boolean r2 = r1.exists()     // Catch:{ Throwable -> 0x0036 }
            r3 = 0
            if (r2 != 0) goto L_0x001b
            java.lang.String r1 = "path"
            r6.append(r1)     // Catch:{ Throwable -> 0x0036 }
            r6.append(r5)     // Catch:{ Throwable -> 0x0036 }
            java.lang.String r5 = " not exists.\r\n"
            r6.append(r5)     // Catch:{ Throwable -> 0x0036 }
            return r3
        L_0x001b:
            r5 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r5]     // Catch:{ Throwable -> 0x0036 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Throwable -> 0x0036 }
            r4.<init>(r1)     // Catch:{ Throwable -> 0x0036 }
        L_0x0024:
            int r0 = r4.read(r2)     // Catch:{ Throwable -> 0x0033 }
            if (r0 <= 0) goto L_0x002f
            r6.append(r2, r3, r0)     // Catch:{ Throwable -> 0x0033 }
            if (r0 >= r5) goto L_0x0024
        L_0x002f:
            r4.close()     // Catch:{ Throwable -> 0x0033 }
            goto L_0x004d
        L_0x0033:
            r5 = move-exception
            r0 = r4
            goto L_0x0037
        L_0x0036:
            r5 = move-exception
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            java.lang.String r0 = "track message:"
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = "\r\n"
            r6.append(r5)
        L_0x004d:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.getTrackFileInfos(java.lang.String, java.lang.StringBuilder):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003f A[SYNTHETIC, Splitter:B:29:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x004b A[SYNTHETIC, Splitter:B:38:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x004f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void saveException(java.lang.Throwable r2, java.lang.String r3) {
        /*
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x000f
            return
        L_0x000f:
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0043, all -> 0x0036 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0043, all -> 0x0036 }
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.lang.String r3 = "EXCE"
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            r0.write(r3)     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20179a(r2, r0)     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            r0.close()
            r1.close()     // Catch:{ Exception -> 0x002c }
        L_0x002c:
            return
        L_0x002d:
            r2 = move-exception
            r3 = r0
            goto L_0x0038
        L_0x0030:
            r3 = r0
            goto L_0x0044
        L_0x0032:
            r2 = move-exception
            goto L_0x0038
        L_0x0034:
            goto L_0x0044
        L_0x0036:
            r2 = move-exception
            r1 = r3
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            r3.close()
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            throw r2
        L_0x0043:
            r1 = r3
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            r3.close()
        L_0x0049:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            return
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.saveException(java.lang.Throwable, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[SYNTHETIC, Splitter:B:18:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveStopInfo(java.lang.String r2, java.lang.String r3) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x000c
            return
        L_0x000c:
            r2 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            java.lang.String r0 = "STOP recv stop info:"
            r2.<init>(r0)     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            r2.append(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            java.lang.String r3 = ".time:"
            r2.append(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            java.lang.String r3 = com.p280ss.ttm.utils.AVTime.getFormatNow()     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            r2.append(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            java.lang.String r3 = "\r\n"
            r2.append(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            r1.write(r2)     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            r1.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            return
        L_0x0038:
            r2 = move-exception
            goto L_0x003f
        L_0x003a:
            r2 = r1
            goto L_0x0045
        L_0x003c:
            r3 = move-exception
            r1 = r2
            r2 = r3
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            throw r2
        L_0x0045:
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            return
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.saveStopInfo(java.lang.String, java.lang.String):void");
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        return copyFile(str, str2, z, true);
    }

    public static void addTrackInfo(long j, String str, String str2) {
        appendTrackInfo(getTrackFilePath(j, str), true, str2);
    }

    public static boolean readDebugTrackInfos(long j, String str, StringBuilder sb) {
        return getTrackFileInfos(getDebugTrackFilePath(j, str), sb);
    }

    public static boolean readTrackInfos(long j, String str, StringBuilder sb) {
        return getTrackFileInfos(getTrackFilePath(j, str), sb);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void appendTrackInfo(java.lang.String r2, boolean r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ Exception -> 0x0018, all -> 0x0013 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0018, all -> 0x0013 }
            r1.write(r4)     // Catch:{ Exception -> 0x0011, all -> 0x000e }
            r1.close()     // Catch:{ Exception -> 0x000d }
            return
        L_0x000d:
            return
        L_0x000e:
            r2 = move-exception
            r0 = r1
            goto L_0x0014
        L_0x0011:
            r0 = r1
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
        L_0x0014:
            r0.close()     // Catch:{ Exception -> 0x0017 }
        L_0x0017:
            throw r2
        L_0x0018:
            r0.close()     // Catch:{ Exception -> 0x001c }
            return
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.appendTrackInfo(java.lang.String, boolean, java.lang.String):void");
    }

    public static boolean moveTrackFile(long j, long j2, String str) {
        return new File(getTrackFilePath(j, str)).renameTo(new File(getTrackFilePath(j2, str)));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[SYNTHETIC, Splitter:B:23:0x0057] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCrashFileContext(android.content.Context r5, java.lang.String r6, java.lang.StringBuilder r7) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x000b
            if (r6 != 0) goto L_0x000b
            java.lang.String r5 = "context or path is null.\r\n"
            r7.append(r5)
            return r0
        L_0x000b:
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r1 = r5.exists()
            if (r1 != 0) goto L_0x0024
            java.lang.String r5 = "file not exist.path:"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = "\r\n"
            r7.append(r5)
            return r0
        L_0x0024:
            long r1 = r5.length()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0034
            java.lang.String r5 = "file size is zore.\r\n"
            r7.append(r5)
            return r0
        L_0x0034:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0053 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0053 }
            compress(r1, r6)     // Catch:{ Exception -> 0x0051 }
            r1.close()     // Catch:{ Exception -> 0x0051 }
            byte[] r5 = r6.toByteArray()     // Catch:{ Exception -> 0x0051 }
            r2 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ Exception -> 0x0051 }
            r6.close()     // Catch:{ Exception -> 0x0051 }
            return r5
        L_0x0051:
            r5 = move-exception
            goto L_0x0055
        L_0x0053:
            r5 = move-exception
            r1 = r0
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r6.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            java.lang.String r6 = "gzip file is error.error:"
            r7.append(r6)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.getCrashFileContext(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }

    public static boolean readLogsInfo(long j, String str, StringBuilder sb) {
        String valueOf = String.valueOf(j);
        File file = new File(C1642a.m8034a("%s/ttplayer_logs", new Object[]{str}));
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                String name = file2.getName();
                if (name == null || name.startsWith(valueOf) || !getTrackFileInfos(file2, sb)) {
                    i++;
                } else {
                    file2.delete();
                    return true;
                }
            }
        }
        return false;
    }

    public static void addDebugTrackInfo(long j, String str, String str2, boolean z) {
        appendTrackInfo(getDebugTrackFilePath(j, str), z, str2);
    }

    public static void addTrackInfo(long j, String str, String str2, boolean z) {
        appendTrackInfo(getTrackFilePath(j, str), z, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0075 A[SYNTHETIC, Splitter:B:44:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007a A[Catch:{ IOException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0081 A[SYNTHETIC, Splitter:B:54:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0086 A[Catch:{ IOException -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x008d A[SYNTHETIC, Splitter:B:64:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0092 A[Catch:{ IOException -> 0x0095 }] */
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
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x007e, all -> 0x006f }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x007e, all -> 0x006f }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x007f, all -> 0x006c }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x007f, all -> 0x006c }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0068, all -> 0x0066 }
        L_0x004e:
            int r5 = r6.read(r4)     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0068, all -> 0x0066 }
            r3 = -1
            if (r5 == r3) goto L_0x0059
            r2.write(r4, r1, r5)     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0068, all -> 0x0066 }
            goto L_0x004e
        L_0x0059:
            if (r7 == 0) goto L_0x005e
            r0.delete()     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0068, all -> 0x0066 }
        L_0x005e:
            r2.close()     // Catch:{ IOException -> 0x0064 }
            r6.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r4 = 1
            return r4
        L_0x0066:
            r4 = move-exception
            goto L_0x0073
        L_0x0068:
            r4 = r2
            goto L_0x007f
        L_0x006a:
            r4 = r2
            goto L_0x008b
        L_0x006c:
            r5 = move-exception
            r2 = r4
            goto L_0x0072
        L_0x006f:
            r5 = move-exception
            r6 = r4
            r2 = r6
        L_0x0072:
            r4 = r5
        L_0x0073:
            if (r2 == 0) goto L_0x0078
            r2.close()     // Catch:{ IOException -> 0x007d }
        L_0x0078:
            if (r6 == 0) goto L_0x007d
            r6.close()     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            throw r4
        L_0x007e:
            r6 = r4
        L_0x007f:
            if (r4 == 0) goto L_0x0084
            r4.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0084:
            if (r6 == 0) goto L_0x0089
            r6.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            return r1
        L_0x008a:
            r6 = r4
        L_0x008b:
            if (r4 == 0) goto L_0x0090
            r4.close()     // Catch:{ IOException -> 0x0095 }
        L_0x0090:
            if (r6 == 0) goto L_0x0095
            r6.close()     // Catch:{ IOException -> 0x0095 }
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTCrashUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
