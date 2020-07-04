package com.p280ss.android.ugc.aweme.hybrid.monitor.utils;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.d */
public final class C30408d {

    /* renamed from: a */
    public static final C30408d f79911a = new C30408d();

    /* renamed from: b */
    private static final List<C30406b> f79912b = C7525m.m23466c(new C30406b("PageStartTime", "StartLoadTime", "rn_load_interval"), new C30406b("StartLoadTime", "FirstDrawTime", "first_draw_interval"), new C30406b("FirstDrawTime", "FirstScreenTime", "first_screen_interval"), new C30406b("FirstDrawTime", "PageFinishTime", "page_finish_interval"));

    /* renamed from: c */
    private static final List<C30406b> f79913c = C7525m.m23466c(new C30406b("redirectStart", "redirectEnd", "redirect_interval"), new C30406b("fetchStart", "domainLookupStart", "app_cache_interval"), new C30406b("domainLookupStart", "domainLookupEnd", "dns_interval"), new C30406b("connectStart", "connectEnd", "tcp_interval"), new C30406b("requestStart", "responseStart", "request_interval"), new C30406b("responseStart", "responseEnd", "response_interval"), new C30406b("domLoading", "domInteractive", "dom_load_interval"), new C30406b("domContentLoadedEventStart", "domContentLoadedEventEnd", "dom_content_loaded_interval"), new C30406b("domContentLoadedEventEnd", "domComplete", "dom_complete_interval"));

    /* renamed from: d */
    private static final List<C30406b> f79914d = C7525m.m23466c(new C30406b("redirectStart", "redirectEnd", "redirect_interval"), new C30406b("fetchStart", "domainLookupStart", "app_cache_interval"), new C30406b("domainLookupStart", "domainLookupEnd", "dns_interval"), new C30406b("connectStart", "connectEnd", "tcp_interval"), new C30406b("requestStart", "responseStart", "request_interval"), new C30406b("responseStart", "responseEnd", "response_interval"));

    /* renamed from: e */
    private static final C30411g f79915e = new C30411g(f79912b);

    /* renamed from: f */
    private static final C30411g f79916f = new C30411g(f79913c);

    /* renamed from: g */
    private static final C30411g f79917g = new C30411g(f79914d);

    private C30408d() {
    }

    /* renamed from: a */
    private static C30411g m99375a(FetcherType fetcherType) {
        switch (C30409e.f79918a[fetcherType.ordinal()]) {
            case 1:
                return f79915e;
            case 2:
                return f79916f;
            case 3:
                return f79917g;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public final JSONObject mo80036a(JSONObject jSONObject, FetcherType fetcherType) {
        boolean z;
        C7573i.m23587b(jSONObject, "metrics");
        C7573i.m23587b(fetcherType, "type");
        C30411g a = m99375a(fetcherType);
        if (a == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        C7573i.m23582a((Object) keys, "metrics.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(str));
            if (valueOf.longValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.longValue();
                C7573i.m23582a((Object) str, "trigger");
                C30407c a2 = a.mo80038a(str, jSONObject);
                if (a2 != null) {
                    jSONObject2.put(a2.f79909a, a2.f79910b);
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final JSONObject mo80035a(String str, JSONObject jSONObject, FetcherType fetcherType) {
        C7573i.m23587b(str, "curTrigger");
        C7573i.m23587b(jSONObject, "metrics");
        C7573i.m23587b(fetcherType, "type");
        C30411g a = m99375a(fetcherType);
        if (a != null) {
            C30407c a2 = a.mo80038a(str, jSONObject);
            if (a2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(a2.f79909a, a2.f79910b);
                return jSONObject2;
            }
        }
        return null;
    }
}
