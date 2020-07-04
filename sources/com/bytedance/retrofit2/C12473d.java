package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.retrofit2.p637a.C12465e;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.account.token.C18905f;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.feed.api.C28216d;
import com.p280ss.android.ugc.aweme.lancet.network.C32285d;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p759ac.C15458a;
import com.p280ss.android.ugc.aweme.p759ac.C15459b;
import com.p280ss.android.ugc.aweme.services.ApiMonitorService;
import java.io.IOException;

/* renamed from: com.bytedance.retrofit2.d */
final class C12473d {
    /* renamed from: a */
    static C12464d m36294a(CallServerInterceptor callServerInterceptor, C12465e eVar, C12520r rVar) throws IOException {
        C12462c cVar = callServerInterceptor.f33054a;
        if (C6857a.m21312e().f19501a && C28216d.m92754a(cVar)) {
            C6857a.m21312e().mo16827b("feed_request_to_network", true);
            if (!C6857a.m21312e().mo16823a("feed_network_duration")) {
                C6857a.m21312e().mo16822a("feed_network_duration", true);
            }
        }
        try {
            return CallServerInterceptor.m36210a(eVar, rVar);
        } catch (Exception e) {
            if (cVar != null) {
                C15458a.f39771a.mo39010a(cVar, e);
            }
            throw e;
        }
    }

    /* renamed from: a */
    static C12534t m36295a(CallServerInterceptor callServerInterceptor, C12464d dVar, C12520r rVar) throws IOException {
        int i;
        C12462c cVar = callServerInterceptor.f33054a;
        boolean z = C6857a.m21312e().f19501a;
        if (z) {
            i = C32285d.m104808a(cVar);
            if (i != -1) {
                C6857a.m21312e().mo16827b("feed_network_duration", true);
                C6857a.m21312e().mo16822a("feed_parse_duration", true);
            }
        } else {
            i = -1;
        }
        try {
            C12534t b = m36297b(callServerInterceptor, dVar, rVar);
            if (z && i != -1) {
                C6857a.m21312e().mo16827b("feed_parse_duration", true);
                C6857a.m21312e().mo16822a("feed_parse_to_ui", true);
                C6857a.m21312e().mo16822a("feed_net_api_to_feed_api", false);
                C6857a.m21312e().mo16830c("feed_api_type", (long) i, false);
            }
            if (cVar != null) {
                ApiMonitorService.Companion.getInstance().checkApiFailedAndMonitor(cVar.f33098b, b);
                ApiMonitorService.Companion.getInstance().addALog(cVar.f33098b, b);
            }
            return b;
        } catch (Throwable th) {
            if ((th instanceof ApiServerException) && dVar != null && ((ApiServerException) th).getErrorCode() == 8) {
                C18905f.m61716a(dVar.f33118a, dVar.f33121d);
            }
            throw th;
        }
    }

    /* renamed from: a */
    static C12534t m36296a(CallServerInterceptor callServerInterceptor, C12470a aVar) throws Exception {
        if (!(aVar.mo30458b() instanceof C15459b)) {
            return callServerInterceptor.mo30401b(aVar);
        }
        C15459b bVar = (C15459b) aVar.mo30458b();
        if (bVar.f39780t > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f39780t;
            bVar.mo39012a(bVar.f39782v, uptimeMillis);
            bVar.mo39013b(bVar.f39782v, uptimeMillis);
        }
        bVar.mo39011a(callServerInterceptor.getClass().getSimpleName());
        bVar.f39780t = SystemClock.uptimeMillis();
        C12534t b = callServerInterceptor.mo30401b(aVar);
        if (bVar.f39781u > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f39781u;
            String simpleName = callServerInterceptor.getClass().getSimpleName();
            bVar.mo39012a(simpleName, uptimeMillis2);
            bVar.mo39014c(simpleName, uptimeMillis2);
        }
        bVar.f39781u = SystemClock.uptimeMillis();
        return b;
    }

    /* renamed from: b */
    private static C12534t m36297b(CallServerInterceptor callServerInterceptor, C12464d dVar, C12520r rVar) throws IOException {
        if ((dVar.f33123f instanceof C10104a) && ((C10104a) dVar.f33123f).f27505h > 0) {
            C12462c cVar = callServerInterceptor.f33054a;
            if (cVar.f33107k instanceof C15459b) {
                C15459b bVar = (C15459b) cVar.f33107k;
                long uptimeMillis = SystemClock.uptimeMillis();
                C12534t a = callServerInterceptor.mo30399a(dVar, rVar);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                bVar.f39783w = uptimeMillis2 - uptimeMillis;
                bVar.f39786z = uptimeMillis2;
                return a;
            }
        }
        return callServerInterceptor.mo30399a(dVar, rVar);
    }
}
