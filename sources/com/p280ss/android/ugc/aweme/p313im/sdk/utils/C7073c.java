package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.service.C7091a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.c */
public final class C7073c {

    /* renamed from: a */
    public static final C7073c f19901a = new C7073c();

    private C7073c() {
    }

    /* renamed from: a */
    private static void m22058a() {
        String str;
        if (C6399b.m19947w()) {
            str = "https://api.tiktokv.com/aweme/v1/";
        } else if (C6399b.m19946v()) {
            str = "https://api2.musical.ly/aweme/v1/";
        } else {
            str = "https://aweme.snssdk.com/aweme/v1/";
        }
        C7075h.f19903b = str;
    }

    /* renamed from: b */
    private static boolean m22062b(String str) {
        if (!C6399b.m19944t() || !C7573i.m23585a((Object) str, (Object) "https://aweme.snssdk.com/aweme/v1/")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m22059a(int i) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error", String.valueOf(i));
        C7074e.m22070b("im_api_domain_error", linkedHashMap);
    }

    /* renamed from: a */
    public static final void m22060a(C7091a aVar) {
        String str;
        StringBuilder sb = new StringBuilder("checkDomainInit: ");
        if (aVar != null) {
            str = aVar.f19935e;
        } else {
            str = null;
        }
        sb.append(str);
        if (aVar == null) {
            m22058a();
            m22059a(2);
            return;
        }
        String str2 = aVar.f19935e;
        C7573i.m23582a((Object) str2, "config.apiHost");
        if (!m22062b(str2)) {
            m22058a();
            m22059a(1);
        }
    }

    /* renamed from: a */
    public static final void m22061a(String str) {
        C7573i.m23587b(str, "domain");
        if (!m22062b(str)) {
            m22058a();
            m22059a(3);
        }
    }
}
