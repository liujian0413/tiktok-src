package com.p280ss.sys.ces.p1802a;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.p280ss.p811a.p813b.C18888g;
import com.p280ss.sys.ces.C45939c;
import org.json.JSONArray;

/* renamed from: com.ss.sys.ces.a.f */
public final class C45935f {
    /* renamed from: a */
    public static String m144066a(Context context) {
        String str;
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            String bssid = connectionInfo.getBSSID();
            String trim = bssid == null ? "" : bssid.trim();
            String ssid = connectionInfo.getSSID();
            String trim2 = ssid == null ? "" : ssid.trim();
            String num = Integer.toString(connectionInfo.getIpAddress());
            String trim3 = num == null ? "" : num.trim();
            String a = C18888g.m61655a(trim2);
            String a2 = C18888g.m61655a(trim);
            String a3 = C18888g.m61655a(trim3);
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("[<!>]");
            sb.append(a);
            sb.append("[<!>]");
            sb.append(a3);
            sb.append("[<!>]");
            str = sb.toString();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: b */
    public static String m144067b(Context context) {
        return context == null ? new JSONArray().toString() : "[]";
    }

    /* renamed from: c */
    public static String m144068c(Context context) {
        if (C45939c.m144089h() != 1) {
            return null;
        }
        return C18888g.m61655a(null);
    }

    /* renamed from: d */
    public static String m144069d(Context context) {
        if (C45939c.m144089h() != 1) {
            return null;
        }
        return C18888g.m61655a(null);
    }
}
