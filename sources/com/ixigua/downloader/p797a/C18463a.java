package com.ixigua.downloader.p797a;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* renamed from: com.ixigua.downloader.a.a */
public final class C18463a {

    /* renamed from: a */
    private static String f50060a;

    /* renamed from: a */
    public static synchronized String m60798a(Context context) {
        String str;
        String str2;
        synchronized (C18463a.class) {
            if (!TextUtils.isEmpty(f50060a)) {
                String str3 = f50060a;
                return str3;
            } else if (context == null) {
                return null;
            } else {
                StringBuilder sb = new StringBuilder();
                try {
                    str = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                } catch (Throwable unused) {
                    str = null;
                }
                String string = Secure.getString(context.getContentResolver(), "android_id");
                try {
                    str2 = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                } catch (Throwable unused2) {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                if (!TextUtils.isEmpty(string)) {
                    sb.append(string);
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                }
                String sb2 = sb.toString();
                f50060a = sb2;
                return sb2;
            }
        }
    }
}
