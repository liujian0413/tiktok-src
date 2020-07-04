package com.facebook.react.devsupport;

import android.os.Build.VERSION;
import com.facebook.ads.AdError;

class WindowOverlayCompat {
    static final int TYPE_SYSTEM_ALERT;
    static final int TYPE_SYSTEM_OVERLAY;

    WindowOverlayCompat() {
    }

    static {
        int i;
        int i2 = 2038;
        if (VERSION.SDK_INT < 26) {
            i = AdError.INTERNAL_ERROR_2003;
        } else {
            i = 2038;
        }
        TYPE_SYSTEM_ALERT = i;
        if (VERSION.SDK_INT < 26) {
            i2 = AdError.INTERNAL_ERROR_2006;
        }
        TYPE_SYSTEM_OVERLAY = i2;
    }
}
