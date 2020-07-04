package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ht */
final class C15745ht implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C15836lc f44481a;

    /* renamed from: b */
    private final /* synthetic */ Map f44482b;

    /* renamed from: c */
    private final /* synthetic */ C15743hr f44483c;

    C15745ht(C15743hr hrVar, Map map, C15836lc lcVar) {
        this.f44483c = hrVar;
        this.f44482b = map;
        this.f44481a = lcVar;
    }

    public final void run() {
        acd.m45777b("Received Http request.");
        try {
            acl.f40003a.post(new C15746hu(this, this.f44483c.mo41646a(new JSONObject((String) this.f44482b.get("http_request")))));
        } catch (Exception e) {
            acd.m45778b("Error converting request to json.", e);
        }
    }
}
