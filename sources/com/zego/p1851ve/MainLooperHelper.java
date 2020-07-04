package com.zego.p1851ve;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.zego.ve.MainLooperHelper */
public class MainLooperHelper {
    private static MainLooperHelper gInstance;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public static MainLooperHelper getInstance() {
        if (gInstance == null) {
            gInstance = new MainLooperHelper();
        }
        return gInstance;
    }

    public int postRunnable(Runnable runnable) {
        this.mHandler.post(runnable);
        return 0;
    }
}
