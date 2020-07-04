package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.TimeZone;

@JNINamespace("base::android")
class TimezoneUtils {
    private TimezoneUtils() {
    }

    private static String getDefaultTimeZoneId() {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }
}
