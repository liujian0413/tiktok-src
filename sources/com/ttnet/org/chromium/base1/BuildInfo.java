package com.ttnet.org.chromium.base1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public class BuildInfo {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m146429x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    private BuildInfo() {
    }

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
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

    public static int getSdkInt() {
        return VERSION.SDK_INT;
    }

    public static String getAndroidBuildFingerprint() {
        return Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
    }

    public static boolean isGreaterThanN() {
        if (VERSION.SDK_INT > 24 || VERSION.CODENAME.equals("NMR1")) {
            return true;
        }
        return false;
    }

    public static String getPackageName(Context context) {
        String str;
        if (context != null) {
            str = context.getPackageName();
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public static String getGMSVersionCode(Context context) {
        String str = "gms versionCode not available.";
        try {
            return Integer.toString(context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode);
        } catch (NameNotFoundException e) {
            Log.m22884d("BuildInfo", "GMS package is not found.", e);
            return str;
        }
    }

    public static String getPackageLabel(Context context) {
        String str;
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            PackageManager packageManager = context.getPackageManager();
            CharSequence applicationLabel = packageManager.getApplicationLabel(_lancet.m146429x89c42dc8(packageManager, context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
            if (applicationLabel != null) {
                str = applicationLabel.toString();
            } else {
                str = "";
            }
            return str;
        } catch (NameNotFoundException unused) {
            return "";
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static String getPackageVersionCode(Context context) {
        String str;
        String str2 = "versionCode not available.";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str3 = "";
            try {
                if (packageInfo.versionCode > 0) {
                    return Integer.toString(packageInfo.versionCode);
                }
                return str3;
            } catch (NameNotFoundException unused) {
                str = str3;
                Log.m22883d("BuildInfo", str);
                return str;
            }
        } catch (NameNotFoundException unused2) {
            str = str2;
            Log.m22883d("BuildInfo", str);
            return str;
        }
    }

    public static String getPackageVersionName(Context context) {
        String str;
        String str2 = "versionName not available";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str3 = "";
            try {
                if (packageInfo.versionName != null) {
                    return packageInfo.versionName;
                }
                return str3;
            } catch (NameNotFoundException unused) {
                str = str3;
                Log.m22883d("BuildInfo", str);
                return str;
            }
        } catch (NameNotFoundException unused2) {
            str = str2;
            Log.m22883d("BuildInfo", str);
            return str;
        }
    }
}
