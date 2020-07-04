package com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import android.os.Build;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.a */
public final class C42524a {

    /* renamed from: a */
    public static final Map<String, String> f110574a;

    static {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("access_key", C35574k.m114859a().mo70092g().mo70113a());
        String i = C35574k.m114859a().mo70102q().mo83142i();
        C7573i.m23582a((Object) i, "CameraClient.getAPI().ap…icationService.appVersion");
        linkedHashMap.put("app_version", i);
        String serverDeviceId = AppLog.getServerDeviceId();
        C7573i.m23582a((Object) serverDeviceId, "AppLog.getServerDeviceId()");
        linkedHashMap.put("device_id", serverDeviceId);
        linkedHashMap.put("device_platform", "android");
        String str = Build.MODEL;
        C7573i.m23582a((Object) str, "android.os.Build.MODEL");
        linkedHashMap.put("device_type", str);
        String d = EffectPlatform.m90015d();
        C7573i.m23582a((Object) d, "EffectPlatform.generateChannel()");
        linkedHashMap.put("channel", d);
        String c = C35574k.m114859a().mo70107v().mo83209c();
        C7573i.m23582a((Object) c, "CameraClient.getAPI().locationService.region");
        linkedHashMap.put("region", c);
        String str2 = EffectPlatform.f72452d;
        C7573i.m23582a((Object) str2, "EffectPlatform.APP_ID");
        linkedHashMap.put("aid", str2);
        f110574a = linkedHashMap;
    }
}
