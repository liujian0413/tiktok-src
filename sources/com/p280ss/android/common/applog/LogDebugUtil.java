package com.p280ss.android.common.applog;

import android.content.Context;
import com.bytedance.common.utility.C6312h;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.common.applog.LogDebugUtil */
public class LogDebugUtil {
    private static boolean sEnabled = false;
    private static int sLogCount = -1;
    private static LinkedList<File> sPurgeQueue;

    private static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static File[] getSortedList(File file) {
        final Pattern compile = Pattern.compile("^log_[0-9]+_\\.log$");
        File[] listFiles = file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                String str;
                if (file != null) {
                    str = file.getName();
                } else {
                    str = null;
                }
                if (str == null || !str.startsWith("log_") || !file.isFile()) {
                    return false;
                }
                return compile.matcher(str).matches();
            }
        });
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        Arrays.sort(listFiles, new Comparator<File>() {
            public final int compare(File file, File file2) {
                long lastModified = file.lastModified();
                long lastModified2 = file2.lastModified();
                if (lastModified < lastModified2) {
                    return -1;
                }
                if (lastModified == lastModified2) {
                    return 0;
                }
                return 1;
            }
        });
        return listFiles;
    }

    private static void loadPurgeQueue(Context context) {
        File[] sortedList = getSortedList(context.getExternalCacheDir());
        sLogCount = sortedList.length;
        if (sortedList.length >= 500) {
            sPurgeQueue = new LinkedList<>();
            int i = 100;
            if (sortedList.length <= 100) {
                i = sortedList.length;
            }
            sPurgeQueue.addAll(Arrays.asList(sortedList).subList(0, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void tryShrink(android.content.Context r3) {
        /*
            java.lang.Class<com.ss.android.common.applog.LogDebugUtil> r0 = com.p280ss.android.common.applog.LogDebugUtil.class
            monitor-enter(r0)
            int r1 = sLogCount     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            if (r1 >= 0) goto L_0x000a
            loadPurgeQueue(r3)     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        L_0x000a:
            int r1 = sLogCount     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            r2 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r2) goto L_0x0012
            monitor-exit(r0)
            return
        L_0x0012:
            java.util.LinkedList<java.io.File> r1 = sPurgeQueue     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            if (r1 != 0) goto L_0x0019
            loadPurgeQueue(r3)     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        L_0x0019:
            java.util.LinkedList<java.io.File> r3 = sPurgeQueue     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            if (r3 != 0) goto L_0x001f
            monitor-exit(r0)
            return
        L_0x001f:
            int r3 = sLogCount     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            if (r3 <= r2) goto L_0x003d
            java.util.LinkedList<java.io.File> r3 = sPurgeQueue     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            int r3 = r3.size()     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            if (r3 <= 0) goto L_0x003d
            java.util.LinkedList<java.io.File> r3 = sPurgeQueue     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            java.lang.Object r3 = r3.removeFirst()     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            r3.delete()     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            int r3 = sLogCount     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            int r3 = r3 + -1
            sLogCount = r3     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            goto L_0x001f
        L_0x003d:
            int r3 = sLogCount     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            if (r3 >= 0) goto L_0x0044
            r3 = -1
            sLogCount = r3     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        L_0x0044:
            java.util.LinkedList<java.io.File> r3 = sPurgeQueue     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            boolean r3 = r3.isEmpty()     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
            if (r3 == 0) goto L_0x004f
            r3 = 0
            sPurgeQueue = r3     // Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return
        L_0x0051:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0054:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogDebugUtil.tryShrink(android.content.Context):void");
    }

    public static void trackLogDiscard(Context context, long j) {
        FileOutputStream fileOutputStream;
        if (sEnabled && C6312h.m19578b() && context != null && j > 0) {
            try {
                fileOutputStream = new FileOutputStream(new File(context.getExternalCacheDir(), "discard_logs.log"), true);
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append(new Date().toString());
                    sb.append("\n");
                    fileOutputStream.write(sb.toString().getBytes());
                    safeClose(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    safeClose(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                safeClose(fileOutputStream);
                throw th;
            }
        }
    }

    public static void trackLogInsert(Context context, long j, String str) {
        if (sEnabled && C6312h.m19578b() && context != null && j > 0 && str != null && str.length() > 0 && str.indexOf("item_impression") > 0) {
            FileOutputStream fileOutputStream = null;
            try {
                File externalCacheDir = context.getExternalCacheDir();
                StringBuilder sb = new StringBuilder("log_");
                sb.append(j);
                sb.append("_.log");
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(externalCacheDir, sb.toString()));
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.close();
                    synchronized (LogDebugUtil.class) {
                        if (sLogCount >= 0) {
                            sLogCount++;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    safeClose(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                safeClose(fileOutputStream);
                throw th;
            }
            safeClose(fileOutputStream);
            tryShrink(context);
            if (sPurgeQueue != null) {
                sPurgeQueue.size();
            }
        }
    }
}
