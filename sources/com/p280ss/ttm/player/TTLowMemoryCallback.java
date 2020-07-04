package com.p280ss.ttm.player;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: com.ss.ttm.player.TTLowMemoryCallback */
public class TTLowMemoryCallback implements ComponentCallbacks {
    private String mPath;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        TTCrashUtil.saveLowMemoryInfo(-1, this.mPath);
    }

    public TTLowMemoryCallback(String str) {
        this.mPath = str;
    }
}
