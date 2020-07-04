package com.facebook.ads.internal.api;

import com.facebook.ads.BuildConfig;

public class BuildConfigApi {
    public static String getVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
