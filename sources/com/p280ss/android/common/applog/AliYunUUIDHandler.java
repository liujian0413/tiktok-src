package com.p280ss.android.common.applog;

import android.text.TextUtils;

/* renamed from: com.ss.android.common.applog.AliYunUUIDHandler */
public class AliYunUUIDHandler implements IAliYunHandler {
    private static AliYunUUIDHandler sAliYunUUIDHandler;
    private String mCloudUUID;

    public String getCloudUUID() {
        return this.mCloudUUID;
    }

    private static String getCommonCloudUUID() {
        return getSystemProperty("ro.aliyun.clouduuid", "false");
    }

    private static String getMeiZuCloudUUID() {
        return getSystemProperty("ro.sys.aliyun.clouduuid", "false");
    }

    private AliYunUUIDHandler() {
        if (isAliYunOs()) {
            this.mCloudUUID = getCommonCloudUUID();
            if (TextUtils.isEmpty(this.mCloudUUID)) {
                this.mCloudUUID = getMeiZuCloudUUID();
            }
        }
    }

    public static AliYunUUIDHandler inst() {
        if (sAliYunUUIDHandler == null) {
            synchronized (AliYunUUIDHandler.class) {
                if (sAliYunUUIDHandler == null) {
                    sAliYunUUIDHandler = new AliYunUUIDHandler();
                }
            }
        }
        return sAliYunUUIDHandler;
    }

    private static boolean isAliYunOs() {
        try {
            if ((System.getProperty("java.vm.name") != null && System.getProperty("java.vm.name").toLowerCase().contains("lemur")) || System.getProperty("ro.yunos.version") != null) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static String getSystemProperty(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Exception unused) {
            return str2;
        }
    }
}
