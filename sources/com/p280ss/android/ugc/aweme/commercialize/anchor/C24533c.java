package com.p280ss.android.ugc.aweme.commercialize.anchor;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.c */
public final class C24533c {

    /* renamed from: a */
    public static final C24533c f64757a = new C24533c();

    private C24533c() {
    }

    /* renamed from: a */
    public static void m80538a() {
        C6907h.m21524a("request_anchor_list", (Map) C22984d.m75611a().f60753a);
    }

    /* renamed from: a */
    public static void m80539a(List<C24536e> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C24536e eVar : list) {
                arrayList.add(Integer.valueOf(eVar.f64760a));
            }
        }
        C6907h.m21524a("anchor_list_success", (Map) C22984d.m75611a().mo59973a("anchor_type", arrayList.toString()).f60753a);
    }
}
