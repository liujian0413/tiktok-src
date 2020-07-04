package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.system.Os;
import android.text.TextUtils;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ttnet.org.chromium.base.task.AsyncTask;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static String sCacheSubDirectory;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    static class Holder {
        public static final String[] DIRECTORY_PATHS = PathUtils.getOrComputeDirectoryPaths();

        private Holder() {
        }
    }

    private PathUtils() {
    }

    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        if ((applicationInfo.flags & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDownloadsDirectory() {
        /*
            com.ttnet.org.chromium.base.StrictModeContext r0 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskReads()
            r1 = 0
            boolean r2 = com.ttnet.org.chromium.base.BuildInfo.isAtLeastQ()     // Catch:{ Throwable -> 0x002a }
            if (r2 == 0) goto L_0x0018
            java.lang.String[] r2 = getAllPrivateDownloadsDirectories()     // Catch:{ Throwable -> 0x002a }
            r3 = 0
            r2 = r2[r3]     // Catch:{ Throwable -> 0x002a }
            if (r0 == 0) goto L_0x0017
            $closeResource(r1, r0)
        L_0x0017:
            return r2
        L_0x0018:
            java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Throwable -> 0x002a }
            java.io.File r2 = android.os.Environment.getExternalStoragePublicDirectory(r2)     // Catch:{ Throwable -> 0x002a }
            java.lang.String r2 = r2.getPath()     // Catch:{ Throwable -> 0x002a }
            if (r0 == 0) goto L_0x0027
            $closeResource(r1, r0)
        L_0x0027:
            return r2
        L_0x0028:
            r2 = move-exception
            goto L_0x002c
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            $closeResource(r1, r0)
        L_0x0031:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PathUtils.getDownloadsDirectory():java.lang.String");
    }

    public static String[] getOrComputeDirectoryPaths() {
        StrictModeContext allowDiskWrites;
        Throwable th;
        Throwable th2;
        try {
            if (!sDirPathFetchTask.cancel(false)) {
                return (String[]) sDirPathFetchTask.get();
            }
            allowDiskWrites = StrictModeContext.allowDiskWrites();
            try {
                String[] privateDataDirectorySuffixInternal = setPrivateDataDirectorySuffixInternal();
                if (allowDiskWrites != null) {
                    $closeResource(null, allowDiskWrites);
                }
                return privateDataDirectorySuffixInternal;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th = r2;
                th2 = th4;
            }
            if (allowDiskWrites != null) {
                $closeResource(th, allowDiskWrites);
            }
            throw th2;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        File[] fileArr;
        Throwable th;
        if (VERSION.SDK_INT >= 19) {
            StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
            try {
                fileArr = ContextUtils.getApplicationContext().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
                if (allowDiskWrites != null) {
                    $closeResource(null, allowDiskWrites);
                }
            } catch (Throwable th2) {
                if (allowDiskWrites != null) {
                    $closeResource(th, allowDiskWrites);
                }
                throw th2;
            }
        } else {
            fileArr = new File[]{Environment.getExternalStorageDirectory()};
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < fileArr.length; i++) {
            if (fileArr[i] != null && !TextUtils.isEmpty(fileArr[i].getAbsolutePath())) {
                arrayList.add(fileArr[i].getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* access modifiers changed from: private */
    public static String[] setPrivateDataDirectorySuffixInternal() {
        String[] strArr = new String[3];
        Context applicationContext = ContextUtils.getApplicationContext();
        strArr[0] = applicationContext.getDir(sDataDirectorySuffix, 0).getPath();
        chmod(strArr[0], 448);
        strArr[1] = applicationContext.getDir("textures", 0).getPath();
        if (applicationContext.getCacheDir() != null) {
            if (sCacheSubDirectory == null) {
                strArr[2] = applicationContext.getCacheDir().getPath();
            } else {
                strArr[2] = new File(applicationContext.getCacheDir(), sCacheSubDirectory).getPath();
            }
        }
        return strArr;
    }

    private static String getDirectoryPath(int i) {
        return Holder.DIRECTORY_PATHS[i];
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        setPrivateDataDirectorySuffix(str, null);
    }

    private static /* synthetic */ void $closeResource(Throwable th, StrictModeContext strictModeContext) {
        if (th != null) {
            try {
                strictModeContext.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            strictModeContext.close();
        }
    }

    public static void setPrivateDataDirectorySuffix(String str, String str2) {
        if (!sInitializationStarted.getAndSet(true)) {
            sDataDirectorySuffix = str;
            sCacheSubDirectory = str2;
            sDirPathFetchTask = new FutureTask<>(PathUtils$$Lambda$0.$instance);
            AsyncTask.THREAD_POOL_EXECUTOR.execute(sDirPathFetchTask);
        }
    }

    private static void chmod(String str, int i) {
        if (VERSION.SDK_INT >= 21) {
            try {
                Os.chmod(str, i);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("Failed to set permissions for path \"");
                sb.append(str);
                sb.append("\"");
                Log.m146394e("PathUtils", sb.toString(), new Object[0]);
            }
        }
    }
}
