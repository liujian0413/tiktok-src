package com.p280ss.ttm.player;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.ss.ttm.player.TTLowMemoryCallback2 */
public class TTLowMemoryCallback2 implements ComponentCallbacks2 {
    private int mLevel = -1;
    private String mPath;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        TTCrashUtil.saveLowMemoryInfo(this.mLevel, this.mPath);
    }

    public TTLowMemoryCallback2(String str) {
        this.mPath = str;
    }

    public void onTrimMemory(int i) {
        if (i == 5) {
            this.mLevel = i;
        } else if (i == 10) {
            this.mLevel = i;
        } else if (i == 15) {
            this.mLevel = i;
        } else if (i == 20) {
            this.mLevel = i;
        } else if (i == 40) {
            this.mLevel = i;
        } else if (i == 60) {
            this.mLevel = i;
        } else if (i == 80) {
            this.mLevel = i;
        }
        TTCrashUtil.saveLowMemoryInfo(this.mLevel, this.mPath);
    }
}
