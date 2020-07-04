package com.ttnet.org.chromium.base.compat;

import android.content.pm.PackageInfo;
import android.net.LinkProperties;

public final class ApiHelperForP {
    private ApiHelperForP() {
    }

    public static long getLongVersionCode(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static String getPrivateDnsServerName(LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }

    public static boolean isPrivateDnsActive(LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }
}
