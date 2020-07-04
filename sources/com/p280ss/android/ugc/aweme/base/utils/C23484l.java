package com.p280ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.base.utils.l */
public class C23484l {

    /* renamed from: a */
    private static final String f61962a = "l";

    /* renamed from: a */
    public static String m77112a() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C6399b.m19921a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            return str;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static String m77114b(Context context) {
        return m77113a(context, "-1");
    }

    /* renamed from: a */
    public static int m77111a(Context context) {
        String b = m77114b(context);
        if ("46000".equals(b) || "46002".equals(b) || "46007".equals(b)) {
            return 3;
        }
        if ("46001".equals(b) || "46006".equals(b) || "46009".equals(b)) {
            return 2;
        }
        if ("46003".equals(b) || "46005".equals(b) || "46011".equals(b)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m77113a(Context context, String str) {
        String str2;
        if (context == null) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str2 = telephonyManager.getSimOperator();
            return str2;
        } catch (Exception unused) {
            str2 = str;
        }
    }
}
