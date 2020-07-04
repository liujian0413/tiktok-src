package com.p280ss.android.ugc.aweme.utils;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.em */
public final class C43102em {

    /* renamed from: a */
    private static String f111723a = "";

    /* renamed from: a */
    public static final String m136719a() {
        if (!TextUtils.isEmpty(f111723a)) {
            return f111723a;
        }
        try {
            Object systemService = C6399b.m19921a().getSystemService("phone");
            if (systemService != null) {
                String deviceId = ((TelephonyManager) systemService).getDeviceId();
                C7573i.m23582a((Object) deviceId, "tManager.deviceId");
                f111723a = deviceId;
                if (TextUtils.isEmpty(f111723a)) {
                    f111723a = "";
                }
                return f111723a;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
        }
    }
}
