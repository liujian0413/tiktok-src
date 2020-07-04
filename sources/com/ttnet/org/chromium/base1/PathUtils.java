package com.ttnet.org.chromium.base1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ttnet.org.chromium.base1.metrics.RecordHistogram;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static String sDataDirectorySuffix;
    private static AsyncTask<Void, Void, String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    static class Holder {
        public static final String[] DIRECTORY_PATHS = PathUtils.getOrComputeDirectoryPaths();

        private Holder() {
        }
    }

    private PathUtils() {
    }

    public static String getCacheDirectory() {
        return getDirectoryPath(3);
    }

    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    public static String getDatabaseDirectory() {
        return getDirectoryPath(2);
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

    private static String getDownloadsDirectory() {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            RecordHistogram.recordTimesHistogram("Android.StrictMode.DownloadsDir", SystemClock.elapsedRealtime() - elapsedRealtime, TimeUnit.MILLISECONDS);
            return path;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static String[] getOrComputeDirectoryPaths() {
        ThreadPolicy allowThreadDiskReads;
        try {
            if (!sDirPathFetchTask.cancel(false)) {
                return (String[]) sDirPathFetchTask.get();
            }
            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            StrictMode.allowThreadDiskWrites();
            String[] privateDataDirectorySuffixInternal = setPrivateDataDirectorySuffixInternal();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return privateDataDirectorySuffixInternal;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static String[] setPrivateDataDirectorySuffixInternal() {
        String[] strArr = new String[4];
        Context applicationContext = ContextUtils.getApplicationContext();
        strArr[0] = applicationContext.getDir(sDataDirectorySuffix, 0).getPath();
        strArr[1] = applicationContext.getDir("textures", 0).getPath();
        strArr[2] = applicationContext.getDatabasePath("foo").getParent();
        if (applicationContext.getCacheDir() != null) {
            strArr[3] = applicationContext.getCacheDir().getPath();
        }
        return strArr;
    }

    private static String getDirectoryPath(int i) {
        return Holder.DIRECTORY_PATHS[i];
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        if (!sInitializationStarted.getAndSet(true)) {
            sDataDirectorySuffix = str;
            sDirPathFetchTask = new AsyncTask<Void, Void, String[]>() {
                /* access modifiers changed from: protected */
                public final String[] doInBackground(Void... voidArr) {
                    return PathUtils.setPrivateDataDirectorySuffixInternal();
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
