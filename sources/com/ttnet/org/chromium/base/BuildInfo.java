package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ttnet.org.chromium.base.compat.ApiHelperForP;

public class BuildInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static PackageInfo sBrowserPackageInfo = null;
    private static String sFirebaseAppId = "";
    private static boolean sInitialized;
    public final String abiString;
    public final String androidBuildFingerprint;
    public final String customThemes;
    public final String extractedFileSuffix;
    public final String gmsVersionCode;
    public final String hostPackageLabel;
    public final long hostVersionCode;
    public final String installerPackageName;
    public final String packageName;
    public final String resourcesVersion;
    public final long versionCode;
    public final String versionName;

    static class Holder {
        public static BuildInfo sInstance = new BuildInfo();

        private Holder() {
        }
    }

    public static String getFirebaseAppId() {
        return sFirebaseAppId;
    }

    public static BuildInfo getInstance() {
        return Holder.sInstance;
    }

    public static boolean isAtLeastQ() {
        if (VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean isDebugAndroid() {
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    public static boolean targetsAtLeastQ() {
        if (ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            return true;
        }
        return false;
    }

    private BuildInfo() {
        PackageInfo packageInfo;
        String str;
        sInitialized = true;
        Context applicationContext = ContextUtils.getApplicationContext();
        String packageName2 = applicationContext.getPackageName();
        PackageManager packageManager = applicationContext.getPackageManager();
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName2, 0);
        this.hostVersionCode = packageVersionCode(packageInfo2);
        if (sBrowserPackageInfo != null) {
            this.packageName = sBrowserPackageInfo.packageName;
            this.versionCode = packageVersionCode(sBrowserPackageInfo);
            this.versionName = nullToEmpty(sBrowserPackageInfo.versionName);
            sBrowserPackageInfo = null;
        } else {
            this.packageName = packageName2;
            this.versionCode = this.hostVersionCode;
            this.versionName = nullToEmpty(packageInfo2.versionName);
        }
        this.hostPackageLabel = nullToEmpty(packageManager.getApplicationLabel(packageInfo2.applicationInfo));
        this.installerPackageName = nullToEmpty(packageManager.getInstallerPackageName(this.packageName));
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
        } catch (NameNotFoundException e) {
            Log.m146387d("BuildInfo", "GMS package is not found.", e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            str = String.valueOf(packageVersionCode(packageInfo));
        } else {
            str = "gms versionCode not available.";
        }
        this.gmsVersionCode = str;
        String str2 = "true";
        try {
            packageManager.getPackageInfo("projekt.substratum", 0);
        } catch (NameNotFoundException unused) {
            str2 = "false";
        }
        try {
            this.customThemes = str2;
            String str3 = "Not Enabled";
            if (BuildConfig.R_STRING_PRODUCT_VERSION != 0) {
                try {
                    str3 = ContextUtils.getApplicationContext().getString(BuildConfig.R_STRING_PRODUCT_VERSION);
                } catch (Exception unused2) {
                    str3 = "Not found";
                }
            }
            this.resourcesVersion = str3;
            if (VERSION.SDK_INT >= 21) {
                this.abiString = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            } else {
                this.abiString = C1642a.m8034a("ABI1: %s, ABI2: %s", new Object[]{Build.CPU_ABI, Build.CPU_ABI2});
            }
            this.extractedFileSuffix = C1642a.m8034a("@%x_%x", new Object[]{Long.valueOf(this.versionCode), Long.valueOf(packageInfo2.lastUpdateTime)});
            this.androidBuildFingerprint = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
        } catch (NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String[] getAll() {
        String str;
        BuildInfo instance = getInstance();
        String packageName2 = ContextUtils.getApplicationContext().getPackageName();
        String[] strArr = new String[23];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName2;
        strArr[9] = String.valueOf(instance.hostVersionCode);
        strArr[10] = instance.hostPackageLabel;
        strArr[11] = instance.packageName;
        strArr[12] = String.valueOf(instance.versionCode);
        strArr[13] = instance.versionName;
        strArr[14] = instance.androidBuildFingerprint;
        strArr[15] = instance.gmsVersionCode;
        strArr[16] = instance.installerPackageName;
        strArr[17] = instance.abiString;
        strArr[18] = sFirebaseAppId;
        strArr[19] = instance.customThemes;
        strArr[20] = instance.resourcesVersion;
        strArr[21] = instance.extractedFileSuffix;
        if (isAtLeastQ()) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[22] = str;
        return strArr;
    }

    public static void setBrowserPackageInfo(PackageInfo packageInfo) {
        sBrowserPackageInfo = packageInfo;
    }

    public static void setFirebaseAppId(String str) {
        sFirebaseAppId = str;
    }

    private static String nullToEmpty(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    private static long packageVersionCode(PackageInfo packageInfo) {
        if (VERSION.SDK_INT >= 28) {
            return ApiHelperForP.getLongVersionCode(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }
}
