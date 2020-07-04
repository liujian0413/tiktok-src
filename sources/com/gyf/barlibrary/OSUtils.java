package com.gyf.barlibrary;

import android.text.TextUtils;

public class OSUtils {
    private static String getFlymeOSFlag() {
        return getSystemProperty("ro.build.display.id", "");
    }

    public static boolean isEMUI3_0() {
        if (getEMUIVersion().contains("EmotionUI_3.0")) {
            return true;
        }
        return false;
    }

    public static boolean isFlymeOS() {
        return getFlymeOSFlag().toLowerCase().contains("flyme");
    }

    public static String getEMUIVersion() {
        if (isEMUI()) {
            return getSystemProperty("ro.build.version.emui", "");
        }
        return "";
    }

    public static String getFlymeOSVersion() {
        if (isFlymeOS()) {
            return getSystemProperty("ro.build.display.id", "");
        }
        return "";
    }

    public static String getMIUIVersion() {
        if (isMIUI()) {
            return getSystemProperty("ro.miui.ui.version.name", "");
        }
        return "";
    }

    public static boolean isEMUI() {
        if (!TextUtils.isEmpty(getSystemProperty("ro.build.version.emui", ""))) {
            return true;
        }
        return false;
    }

    public static boolean isEMUI3_1() {
        String eMUIVersion = getEMUIVersion();
        if ("EmotionUI 3".equals(eMUIVersion) || eMUIVersion.contains("EmotionUI_3.1")) {
            return true;
        }
        return false;
    }

    public static boolean isEMUI3_x() {
        if (isEMUI3_0() || isEMUI3_1()) {
            return true;
        }
        return false;
    }

    public static boolean isMIUI() {
        if (!TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name", ""))) {
            return true;
        }
        return false;
    }

    public static boolean isMIUI6Later() {
        String mIUIVersion = getMIUIVersion();
        if (mIUIVersion.isEmpty()) {
            return false;
        }
        try {
            if (Integer.valueOf(mIUIVersion.substring(1)).intValue() >= 6) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isFlymeOS4Later() {
        int i;
        String flymeOSVersion = getFlymeOSVersion();
        if (flymeOSVersion.isEmpty()) {
            return false;
        }
        try {
            if (flymeOSVersion.toLowerCase().contains("os")) {
                i = Integer.valueOf(flymeOSVersion.substring(9, 10)).intValue();
            } else {
                i = Integer.valueOf(flymeOSVersion.substring(6, 7)).intValue();
            }
            if (i >= 4) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isFlymeOS5() {
        int i;
        String flymeOSVersion = getFlymeOSVersion();
        if (flymeOSVersion.isEmpty()) {
            return false;
        }
        try {
            if (flymeOSVersion.toLowerCase().contains("os")) {
                i = Integer.valueOf(flymeOSVersion.substring(9, 10)).intValue();
            } else {
                i = Integer.valueOf(flymeOSVersion.substring(6, 7)).intValue();
            }
            if (i == 5) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static String getSystemProperty(String str, String str2) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{str, str2});
        } catch (Exception unused) {
            return str2;
        }
    }
}
