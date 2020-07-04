package com.p280ss.video.rtc.engine.utils;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: com.ss.video.rtc.engine.utils.RtcBuildInfo */
public final class RtcBuildInfo {
    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getSdkVersion() {
        return VERSION.SDK_INT;
    }
}
