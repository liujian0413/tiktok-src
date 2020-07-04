package com.p280ss.android.ugc.aweme.i18n.p1299a;

import android.telephony.TelephonyManager;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;

/* renamed from: com.ss.android.ugc.aweme.i18n.a.a */
public final class C30432a extends C30433b<String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo80108a() {
        return m99413c();
    }

    /* renamed from: c */
    private static String m99413c() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AwemeApplication.m21341a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            return str;
        } catch (Exception unused) {
        }
    }
}
