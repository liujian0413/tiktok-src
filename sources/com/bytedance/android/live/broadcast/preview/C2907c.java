package com.bytedance.android.live.broadcast.preview;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.C9469i;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.bytedance.android.live.broadcast.preview.c */
public final class C2907c {
    /* renamed from: a */
    public static String m11391a() {
        if (C9469i.m27993e().mo14561a().isLocalTest()) {
            String string = C7285c.m22838a(C9469i.m27991c(), "test_setting", 0).getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String str = "";
        try {
            str = ((TelephonyManager) C9469i.m27991c().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
        }
        return str;
    }
}
