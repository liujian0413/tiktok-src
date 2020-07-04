package com.zego.zegoavkit2.utils;

import android.os.Build;
import android.os.Build.VERSION;
import com.taobao.android.dexposed.ClassUtils;

public final class SysUtil {
    public static String getOsInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(":");
        sb.append(VERSION.RELEASE);
        sb.append(":");
        sb.append(Build.MODEL);
        return sb.toString().replaceAll(",", ClassUtils.PACKAGE_SEPARATOR);
    }
}
