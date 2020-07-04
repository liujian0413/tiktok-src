package com.p280ss.android.ugc.aweme.feed;

import bolts.C1592h;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.feed.api.C28216d;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p759ac.C15459b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.feed.aa */
public final class C28062aa {

    /* renamed from: a */
    private List<Object> f73925a;

    /* renamed from: com.ss.android.ugc.aweme.feed.aa$a */
    static class C28064a {

        /* renamed from: a */
        public static C28062aa f73926a = new C28062aa();
    }

    /* renamed from: a */
    public static C28062aa m91698a() {
        return C28064a.f73926a;
    }

    private C28062aa() {
        this.f73925a = new ArrayList();
    }

    /* renamed from: c */
    private void m91701c() {
        Iterator it = this.f73925a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    public final void mo71510b() {
        C1592h.m7848a(10000).mo6880b(C28065ab.f73927a, C7258h.m22732e());
        m91701c();
    }

    /* renamed from: a */
    private static void m91699a(C10104a aVar) {
        if (aVar.f27519v == 0) {
            if (aVar.f27507j > 0) {
                C6857a.m21312e().mo16830c("feed_cronet_dns_duration", aVar.f27507j, false);
            }
            if (aVar.f27508k > 0) {
                C6857a.m21312e().mo16830c("feed_cronet_connect_duration", aVar.f27508k, false);
            }
            if (aVar.f27509l > 0) {
                C6857a.m21312e().mo16830c("feed_cronet_ssl_duration", aVar.f27509l, false);
            }
            if (aVar.f27510m > 0) {
                C6857a.m21312e().mo16830c("feed_cronet_send_duration", aVar.f27510m, false);
            }
            if (aVar.f27514q > 0) {
                C6857a.m21312e().mo16830c("feed_cronet_timing_waiting", aVar.f27514q, false);
            }
            if (aVar.f27512o > 0) {
                C6857a.m21312e().mo16830c("feed_cronet_receive_duration", aVar.f27512o, false);
            }
            if (aVar.f27515r > 0) {
                C6857a.m21312e().mo16830c("feed_cronet_total", aVar.f27515r, false);
            }
        }
    }

    /* renamed from: a */
    private static void m91700a(C15459b bVar) {
        HashMap<String, Long> hashMap = bVar.f39778r;
        HashMap<String, Long> hashMap2 = bVar.f39779s;
        for (Entry entry : hashMap.entrySet()) {
            C6857a e = C6857a.m21312e();
            StringBuilder sb = new StringBuilder();
            sb.append((String) entry.getKey());
            sb.append("_duration_pre");
            e.mo16830c(sb.toString(), ((Long) entry.getValue()).longValue(), false);
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            C6857a e2 = C6857a.m21312e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) entry2.getKey());
            sb2.append("_duration_post");
            e2.mo16830c(sb2.toString(), ((Long) entry2.getValue()).longValue(), false);
        }
    }

    /* renamed from: a */
    public final void mo71509a(C12462c cVar, C10104a aVar, C15459b bVar) {
        C10104a aVar2 = aVar;
        C15459b bVar2 = bVar;
        if (cVar != null && aVar2 != null && bVar2 != null && C6857a.m21312e().f19501a && C28216d.m92754a(cVar)) {
            long j = aVar2.f27501d - aVar2.f27500c;
            long j2 = aVar2.f27502e - aVar2.f27501d;
            long j3 = aVar2.f27503f - aVar2.f27502e;
            long j4 = aVar2.f27505h - aVar2.f27503f;
            long j5 = bVar2.f39785y;
            long j6 = bVar2.f39784x - bVar2.f33205a;
            C6857a.m21312e().mo16826b("feed_api_to_net_api", aVar2.f27500c, false);
            C6857a.m21312e().mo16830c("feed_net_api_to_interceptors", j, false);
            C6857a.m21312e().mo16830c("feed_interceptors_pre_duration", j2, false);
            C6857a.m21312e().mo16830c("feed_network_to_response", j3, false);
            C6857a.m21312e().mo16830c("feed_read_response_duration", j4, false);
            C6857a.m21312e().mo16830c("feed_interceptors_post_duration", j5, false);
            C6857a.m21312e().mo16830c("feed_net_api_total", j6, false);
            m91700a(bVar);
            m91699a(aVar);
        }
    }
}
