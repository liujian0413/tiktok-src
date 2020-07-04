package com.p280ss.android.ugc.aweme.tools.extension;

import android.content.Intent;
import com.p280ss.android.ugc.aweme.tools.extension.p1670a.C42306a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.tools.extension.e */
public final class C42311e {

    /* renamed from: a */
    public static boolean f110072a;

    /* renamed from: b */
    private static Map<SupportedBusiness, C42309c> f110073b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final C42309c f110074c = new C42306a();

    /* renamed from: a */
    public static void m134572a(boolean z) {
        f110072a = z;
    }

    /* renamed from: a */
    private static C42309c m134566a(SupportedBusiness supportedBusiness) {
        C42309c cVar = (C42309c) f110073b.get(supportedBusiness);
        if (cVar == null) {
            return f110074c;
        }
        return cVar;
    }

    /* renamed from: a */
    public static void m134568a(Intent intent, C42305a aVar) {
        SupportedBusiness[] values;
        for (SupportedBusiness supportedBusiness : SupportedBusiness.values()) {
            aVar.mo88378a(supportedBusiness, intent.getStringExtra(supportedBusiness.intentKey));
        }
    }

    /* renamed from: a */
    public static void m134570a(SupportedBusiness supportedBusiness, C42309c cVar) {
        if (f110072a) {
            cVar = new C42310d(cVar);
        }
        f110073b.put(supportedBusiness, cVar);
    }

    /* renamed from: a */
    public static void m134567a(Intent intent, Intent intent2, Scene scene, Scene scene2) {
        SupportedBusiness[] values;
        for (SupportedBusiness supportedBusiness : SupportedBusiness.values()) {
            intent2.putExtra(supportedBusiness.intentKey, m134566a(supportedBusiness).mo103788a(intent.getStringExtra(supportedBusiness.intentKey), scene, scene2));
        }
    }

    /* renamed from: a */
    public static void m134569a(Intent intent, C42308b bVar, Scene scene, Scene scene2) {
        SupportedBusiness[] values;
        for (SupportedBusiness supportedBusiness : SupportedBusiness.values()) {
            intent.putExtra(supportedBusiness.intentKey, m134566a(supportedBusiness).mo103788a(bVar.mo88377a(supportedBusiness), scene, scene2));
        }
    }

    /* renamed from: a */
    public static void m134571a(C42308b bVar, C42305a aVar, Scene scene, Scene scene2) {
        SupportedBusiness[] values;
        for (SupportedBusiness supportedBusiness : SupportedBusiness.values()) {
            aVar.mo88378a(supportedBusiness, m134566a(supportedBusiness).mo103788a(bVar.mo88377a(supportedBusiness), scene, scene2));
        }
    }
}
