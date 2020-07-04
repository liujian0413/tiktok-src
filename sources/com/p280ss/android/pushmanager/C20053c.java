package com.p280ss.android.pushmanager;

import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p280ss.android.message.C19809a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.c */
public class C20053c {
    /* renamed from: a */
    public String mo53676a() {
        return "message";
    }

    /* renamed from: c */
    public String mo53677c() {
        return C20038a.f54226a;
    }

    /* renamed from: b */
    public static Map<String, String> m66041b() {
        return new HashMap();
    }

    /* renamed from: d */
    public static String m66042d() {
        String str = "";
        try {
            str = ((TelephonyManager) C19809a.m65408a().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = Resources.getSystem().getConfiguration().locale.getCountry();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase();
        }
        return "";
    }
}
