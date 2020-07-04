package com.p280ss.ttm.player;

import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

/* renamed from: com.ss.ttm.player.TTPlayerService */
public class TTPlayerService extends Service {
    public static boolean IsErrored = false;
    private static final String TAG = "TTPlayerService";
    private static String mAppFileDir;
    private static String mCrashPath;
    private ComponentCallbacks mLowMemoryCallback;

    public static String getAppFilesPath() {
        return mAppFileDir;
    }

    public static String getCrashPath() {
        return mCrashPath;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterComponentCallbacks(this.mLowMemoryCallback);
        TTCrashUtil.saveStopInfo("onDestroy", mCrashPath);
    }

    public void onCreate() {
        try {
            mAppFileDir = TTPlayerConfiger.getAppFileCachePath(this);
            if (TTPlayerConfiger.getValue(18, 1) > 1) {
                mCrashPath = TTPlayerConfiger.getAppCrashFilePath2(this);
            } else {
                mCrashPath = TTPlayerConfiger.getAppCrashFileStorePath(this);
            }
            initService();
        } catch (Throwable unused) {
            IsErrored = true;
        }
    }

    private void initService() {
        TTCrashUtil.checkLogDir(mAppFileDir);
        TTPlayer.setTempFileDir(mAppFileDir);
        TTPlayer.setCrashPath(mCrashPath);
        TTPlayer.setIsIPPlayer(true);
        if (!TTPlayerConfiger.getValue(4, false)) {
            TTPlayer.registerPlayerInfo();
        }
        IsErrored = TTPlayer.isError();
        Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new TTExceptionHandler(mCrashPath));
        if (VERSION.SDK_INT < 14) {
            this.mLowMemoryCallback = new TTLowMemoryCallback(mCrashPath);
        } else {
            this.mLowMemoryCallback = new TTLowMemoryCallback2(mCrashPath);
        }
        registerComponentCallbacks(this.mLowMemoryCallback);
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    public IBinder onBind(Intent intent) {
        try {
            return new TTPlayerStub(this);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean onUnbind(Intent intent) {
        TTCrashUtil.saveStopInfo("onUnbind", mCrashPath);
        return true;
    }
}
