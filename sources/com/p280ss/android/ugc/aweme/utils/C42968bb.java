package com.p280ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import com.bytedance.crash.C9912i;
import com.bytedance.dataplatform.p507a.C10034a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.bb */
public final class C42968bb {

    /* renamed from: a */
    private static boolean f111530a;

    /* renamed from: b */
    private static boolean f111531b;

    /* renamed from: a */
    public static boolean m136400a() {
        boolean z;
        String str;
        if (f111531b) {
            return f111530a;
        }
        if (VERSION.SDK_INT < 21 || !C10034a.m29824g(true).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        f111530a = z;
        HashMap hashMap = new HashMap();
        String str2 = "webview_use_zorder";
        if (f111530a) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put(str2, str);
        C9912i.m29314a((Map<? extends String, ? extends String>) hashMap);
        f111531b = true;
        return f111530a;
    }
}
