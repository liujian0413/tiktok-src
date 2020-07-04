package com.p280ss.ttm.player;

import android.os.Process;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.ss.ttm.player.TTExceptionHandler */
public class TTExceptionHandler implements UncaughtExceptionHandler {
    private String mPath;

    public TTExceptionHandler(String str) {
        this.mPath = str;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        TTPlayerConfiger.getValue(5, false);
        TTCrashUtil.saveException(th, this.mPath);
        Process.killProcess(Process.myPid());
        System.exit(0);
    }
}
