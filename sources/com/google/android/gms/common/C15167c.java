package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15217ai;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15326i;

/* renamed from: com.google.android.gms.common.c */
public class C15167c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C15181e.f39276b;
    private static final C15167c zzm = new C15167c();

    public static C15167c getInstance() {
        return zzm;
    }

    C15167c() {
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        int b = C15181e.m44170b(context, i);
        if (C15181e.m44175d(context, b)) {
            return 18;
        }
        return b;
    }

    public boolean isUserResolvableError(int i) {
        return C15181e.m44171b(i);
    }

    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                if (context == null || !C15326i.m44580b(context)) {
                    return C15217ai.m44234a("com.google.android.gms", zza(context, str));
                }
                return C15217ai.m44232a();
            case 3:
                return C15217ai.m44233a("com.google.android.gms");
            default:
                return null;
        }
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, errorResolutionIntent, 134217728);
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        C15181e.m44174d(context);
    }

    public int getApkVersion(Context context) {
        return C15181e.m44178g(context);
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        return C15181e.m44175d(context, i);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return C15181e.m44169a(context, str);
    }

    public String getErrorString(int i) {
        return C15181e.m44166a(i);
    }

    private static String zza(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C15176d.m44159a(context).mo38467b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }
}
