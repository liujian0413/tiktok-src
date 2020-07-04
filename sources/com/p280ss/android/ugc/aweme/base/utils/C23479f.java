package com.p280ss.android.ugc.aweme.base.utils;

import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.utils.f */
public final class C23479f {
    /* renamed from: a */
    public static void m77085a(String str) {
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("mobile_model", Build.MODEL).mo59973a("mobile_brand", Build.BRAND).mo59973a("android_version", VERSION.RELEASE).f60753a);
    }
}
