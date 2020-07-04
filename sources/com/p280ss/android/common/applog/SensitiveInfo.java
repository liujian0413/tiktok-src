package com.p280ss.android.common.applog;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.SensitiveInfo */
final class SensitiveInfo {
    private SensitiveInfo() {
    }

    static void tryGetFingerPrint(Context context, JSONObject jSONObject, HashSet<Integer> hashSet, WifiBssidInfo wifiBssidInfo) {
        TelephonyManager telephonyManager;
        if (hashSet != null && !hashSet.isEmpty()) {
            String str = null;
            try {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
                telephonyManager = null;
            }
            if (telephonyManager != null) {
                String str2 = "sim_op";
                if (hashSet.contains(Integer.valueOf(4)) && jSONObject.isNull(str2)) {
                    try {
                        String simOperator = telephonyManager.getSimOperator();
                        if (simOperator != null && simOperator.length() > 0 && simOperator.length() < 30) {
                            jSONObject.put(str2, simOperator);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                String str3 = "net_op";
                if (hashSet.contains(Integer.valueOf(4)) && jSONObject.isNull(str3)) {
                    try {
                        String networkOperator = telephonyManager.getNetworkOperator();
                        if (networkOperator != null && networkOperator.length() > 0 && networkOperator.length() < 30) {
                            jSONObject.put(str3, networkOperator);
                        }
                    } catch (Throwable unused3) {
                    }
                }
                String str4 = "phone_type";
                if (hashSet.contains(Integer.valueOf(4)) && jSONObject.isNull(str4)) {
                    try {
                        jSONObject.put(str4, telephonyManager.getPhoneType());
                    } catch (Exception unused4) {
                    }
                }
                String str5 = "net_type";
                if (hashSet.contains(Integer.valueOf(4)) && jSONObject.isNull(str5)) {
                    try {
                        jSONObject.put(str5, telephonyManager.getNetworkType());
                    } catch (Exception unused5) {
                    }
                }
                String str6 = "wifi_bssid";
                if (hashSet.contains(Integer.valueOf(6))) {
                    if (wifiBssidInfo != null) {
                        try {
                            str = wifiBssidInfo.getBssid();
                        } catch (Exception unused6) {
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(str6, str);
                    }
                }
            }
        }
    }
}
