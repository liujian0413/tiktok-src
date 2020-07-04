package com.p280ss.android.ugc.aweme.language;

import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.language.k */
public class C32330k {
    /* renamed from: i */
    public static final boolean m104887i() {
        if (Locale.JAPAN.getCountry() == null || !Locale.JAPAN.getCountry().equalsIgnoreCase(m104885g())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final String m104885g() {
        String h = m104886h();
        if (TextUtils.isEmpty(h)) {
            h = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysRegion();
            if (TextUtils.isEmpty(h)) {
                h = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getRegion();
            }
        }
        if (TextUtils.isEmpty(h)) {
            h = "";
        }
        return h.toUpperCase();
    }

    /* renamed from: h */
    public static final String m104886h() {
        String str;
        if (C7163a.m22363a() || C32325g.m104870a()) {
            SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "test_setting", 0);
            String str2 = "pref_carrier";
            if (C6399b.m19944t()) {
                str = "US";
            } else {
                str = "";
            }
            String string = a.getString(str2, str);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String str3 = "";
        try {
            str3 = ((TelephonyManager) C6399b.m19921a().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str3)) {
            str3 = str3.toUpperCase();
        }
        return str3;
    }

    /* renamed from: a */
    public static final boolean m104884a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Arrays.asList(new String[]{"AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB"}).contains(str.toUpperCase());
    }
}
