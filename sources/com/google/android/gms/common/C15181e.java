package com.google.android.gms.common;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C15226ar;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15326i;
import com.google.android.gms.common.util.C15333p;
import com.google.android.gms.common.util.C15338u;
import com.google.android.gms.common.util.C15341x;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.e */
public class C15181e {

    /* renamed from: a */
    private static boolean f39275a = false;

    /* renamed from: b */
    public static final int f39276b = 12451000;

    /* renamed from: c */
    static final AtomicBoolean f39277c = new AtomicBoolean();

    /* renamed from: d */
    private static boolean f39278d;

    /* renamed from: e */
    private static final AtomicBoolean f39279e = new AtomicBoolean();

    /* renamed from: b */
    public static boolean m44171b(int i) {
        if (i != 9) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    C15181e() {
    }

    /* renamed from: a */
    public static String m44166a(int i) {
        return ConnectionResult.m43534a(i);
    }

    /* renamed from: b */
    public static int m44170b(Context context, int i) {
        try {
            context.getResources().getString(R.string.aa5);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f39279e.get()) {
            int b = C15226ar.m44248b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b != f39276b) {
                int i2 = f39276b;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return m44165a(context, !C15326i.m44580b(context) && !C15326i.m44583e(context), i);
    }

    /* renamed from: a */
    private static int m44165a(Context context, boolean z, int i) {
        C15267r.m44394b(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C15183g.m44180a(context);
            if (!C15183g.m44183a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!C15183g.m44183a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (C15341x.m44629a(packageInfo2.versionCode) < C15341x.m44629a(i)) {
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = C15182f.m44179a(packageManager, "com.google.android.gms", 0);
                } catch (NameNotFoundException e) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                    return 1;
                }
            }
            if (!applicationInfo.enabled) {
                return 3;
            }
            return 0;
        } catch (NameNotFoundException unused2) {
            return 1;
        }
    }

    /* renamed from: c */
    public static boolean m44173c(Context context, int i) {
        return C15338u.m44611a(context, i);
    }

    /* renamed from: a */
    public static boolean m44168a(Context context, int i, String str) {
        return C15338u.m44612a(context, i, str);
    }

    /* renamed from: c */
    public static boolean m44172c(Context context) {
        if (!f39278d) {
            try {
                PackageInfo b = C15176d.m44159a(context).mo38467b("com.google.android.gms", 64);
                C15183g.m44180a(context);
                if (b == null || C15183g.m44183a(b, false) || !C15183g.m44183a(b, true)) {
                    f39275a = false;
                } else {
                    f39275a = true;
                }
            } catch (NameNotFoundException unused) {
            } finally {
                f39278d = true;
            }
        }
        return f39275a || !C15326i.m44578a();
    }

    /* renamed from: d */
    public static void m44174d(Context context) {
        if (!f39277c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    /* renamed from: e */
    public static Resources m44176e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Context m44177f(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static int m44178g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static boolean m44175d(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m44169a(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: a */
    static boolean m44169a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C15333p.m44600g()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo a = C15182f.m44179a(context.getPackageManager(), str, VideoCacheReadBuffersizeExperiment.DEFAULT);
            if (equals) {
                return a.enabled;
            }
            return a.enabled && !m44167a(context);
        } catch (NameNotFoundException unused2) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m44167a(Context context) {
        if (C15333p.m44597d()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }
}
