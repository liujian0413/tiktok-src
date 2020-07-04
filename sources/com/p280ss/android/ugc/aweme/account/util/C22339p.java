package com.p280ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: com.ss.android.ugc.aweme.account.util.p */
public final class C22339p {

    /* renamed from: a */
    public static final C22339p f59606a = new C22339p();

    private C22339p() {
    }

    /* renamed from: a */
    public static final boolean m73948a(Context context) {
        Object obj;
        if (context != null) {
            obj = context.getSystemService("phone");
        } else {
            obj = null;
        }
        if (!(obj instanceof TelephonyManager)) {
            obj = null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        if (telephonyManager == null) {
            return false;
        }
        switch (telephonyManager.getSimState()) {
            case 0:
            case 1:
                return false;
            default:
                return true;
        }
    }
}
