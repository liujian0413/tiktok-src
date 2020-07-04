package com.p280ss.android.ugc.trill.p1764f;

import android.telephony.TelephonyManager;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.trill.f.d */
public final class C44996d extends C44994b<String> {
    /* renamed from: c */
    private static String m141968c() {
        try {
            return m141969d();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo107510a() {
        return m141968c();
    }

    /* renamed from: d */
    private static String m141969d() throws Exception {
        if (((TelephonyManager) C6399b.m19921a().getSystemService("phone")).getPhoneType() == 2) {
            Class cls = Class.forName("android.os.SystemProperties");
            return ((String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.cdma.home.operator.numeric"})).substring(0, 3);
        }
        int i = C6399b.m19921a().getResources().getConfiguration().mcc;
        if (i == 0) {
            return "";
        }
        return String.valueOf(i);
    }
}
