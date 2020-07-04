package com.kakao.util.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

public class SystemInfo {
    private static final String COUNTRY_CODE = Locale.getDefault().getCountry().toUpperCase();
    private static final String DEVICE_MODEL = Build.MODEL.replaceAll("\\s", "-").toUpperCase();
    private static String KA_HEADER;
    private static final String LANGUAGE = Locale.getDefault().getLanguage().toLowerCase();
    private static final int OS_VERSION = VERSION.SDK_INT;

    public static String getKAHeader() {
        return KA_HEADER;
    }

    public static void initialize(Context context) {
        if (KA_HEADER == null) {
            StringBuilder sb = new StringBuilder("sdk/1.14.0 os/android-");
            sb.append(OS_VERSION);
            sb.append(" lang/");
            sb.append(LANGUAGE);
            sb.append("-");
            sb.append(COUNTRY_CODE);
            sb.append(" origin/");
            sb.append(Utility.getKeyHash(context));
            sb.append(" device/");
            sb.append(DEVICE_MODEL);
            sb.append(" android_pkg/");
            sb.append(context.getPackageName());
            KA_HEADER = sb.toString();
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(KA_HEADER);
                sb2.append(" app_ver/");
                sb2.append(packageInfo.versionName);
                KA_HEADER = sb2.toString();
            } catch (NameNotFoundException unused) {
            }
        }
    }
}
