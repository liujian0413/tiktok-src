package com.p280ss.android.ugc.aweme.app.p1027b;

import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.b.b */
public final class C22890b {

    /* renamed from: a */
    public static final C22890b f60607a = new C22890b();

    /* renamed from: b */
    private static final Map<String, C22889a> f60608b = new LinkedHashMap();

    /* renamed from: c */
    private static final C22889a f60609c;

    private C22890b() {
    }

    static {
        C22889a aVar = new C22889a(false, C22977g.f60742b.mo59968c(), null, 4, null);
        f60609c = aVar;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            SpringApiLimitConfig springApiLimitConfig = a.getSpringApiLimitConfig();
            C7573i.m23582a((Object) springApiLimitConfig, "SettingsReader.get().springApiLimitConfig");
            if (springApiLimitConfig != null) {
                List<ApiConfigEntity> configList = springApiLimitConfig.getConfigList();
                if (configList != null) {
                    for (ApiConfigEntity apiConfigEntity : configList) {
                        Map<String, C22889a> map = f60608b;
                        C7573i.m23582a((Object) apiConfigEntity, "it");
                        String apiName = apiConfigEntity.getApiName();
                        C7573i.m23582a((Object) apiName, "it.apiName");
                        Boolean isBanned = apiConfigEntity.getIsBanned();
                        C7573i.m23582a((Object) isBanned, "it.isBanned");
                        boolean booleanValue = isBanned.booleanValue();
                        Long delayTime = apiConfigEntity.getDelayTime();
                        C7573i.m23582a((Object) delayTime, "it.delayTime");
                        long longValue = delayTime.longValue();
                        String apiName2 = apiConfigEntity.getApiName();
                        C7573i.m23582a((Object) apiName2, "it.apiName");
                        map.put(apiName, new C22889a(booleanValue, longValue, apiName2));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C22889a m75355a(String str) {
        C7573i.m23587b(str, "apiName");
        C22889a aVar = (C22889a) f60608b.get(str);
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
