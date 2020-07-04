package p040b.p041a.p042a.p043a.p044a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: b.a.a.a.a.a */
public class C1579a {

    /* renamed from: a */
    public static String f5932a = ":push";

    /* renamed from: b */
    public static boolean f5933b = false;

    /* renamed from: c */
    public static boolean f5934c = false;

    /* renamed from: d */
    private static boolean f5935d = true;

    /* renamed from: d */
    public static boolean m7679d() {
        if (!f5934c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f5933b = true;
                    f5934c = true;
                    return f5933b;
                }
            } catch (Exception unused) {
            }
            f5934c = true;
        }
        return f5933b;
    }

    /* renamed from: a */
    public static Intent m7678a(Context context) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent();
        try {
            if (VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            } else if (VERSION.SDK_INT >= 21) {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            } else if (VERSION.SDK_INT >= 14) {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            }
            return intent;
        } catch (Exception unused) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            return intent;
        }
    }
}
