package com.ttnet.org.chromium.base.memory;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MemoryPressureUma implements ComponentCallbacks2 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static MemoryPressureUma sInstance;
    private final String mHistogramName;

    @Retention(RetentionPolicy.SOURCE)
    @interface Notification {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public static void initializeForBrowser() {
        initializeInstance("Browser");
    }

    public static void initializeForChildService() {
        initializeInstance("ChildService");
    }

    public void onLowMemory() {
        record(8);
    }

    private void record(int i) {
        RecordHistogram.recordEnumeratedHistogram(this.mHistogramName, i, 9);
    }

    private MemoryPressureUma(String str) {
        StringBuilder sb = new StringBuilder("Android.MemoryPressureNotification.");
        sb.append(str);
        this.mHistogramName = sb.toString();
    }

    private static void initializeInstance(String str) {
        ThreadUtils.assertOnUiThread();
        sInstance = new MemoryPressureUma(str);
        ContextUtils.getApplicationContext().registerComponentCallbacks(sInstance);
    }

    public void onTrimMemory(int i) {
        if (i == 5) {
            record(7);
        } else if (i == 10) {
            record(6);
        } else if (i == 15) {
            record(5);
        } else if (i == 20) {
            record(4);
        } else if (i == 40) {
            record(3);
        } else if (i == 60) {
            record(2);
        } else if (i != 80) {
            record(0);
        } else {
            record(1);
        }
    }
}
