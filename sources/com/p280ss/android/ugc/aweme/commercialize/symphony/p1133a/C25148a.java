package com.p280ss.android.ugc.aweme.commercialize.symphony.p1133a;

import com.bytedance.p073ad.symphony.p074a.p075a.C2091g;
import com.bytedance.p073ad.symphony.p078c.C2124c;
import com.bytedance.p073ad.symphony.p078c.C2128g;
import com.bytedance.p073ad.symphony.p081e.C2141a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.a.a */
public final class C25148a extends C2091g {

    /* renamed from: b */
    public C2141a f66347b;

    /* renamed from: c */
    public C2124c f66348c = new C2124c();

    /* renamed from: d */
    private C25149b f66349d = new C25149b();

    /* renamed from: a */
    public static C25148a m82733a(JSONObject jSONObject) {
        try {
            C25148a aVar = new C25148a();
            aVar.f66347b = C2141a.m9362a(jSONObject);
            C2124c cVar = new C2124c();
            cVar.f7236a = new HashMap();
            cVar.f7237b = "draw_ad";
            aVar.f66348c = cVar;
            if (!aVar.f66349d.f66350a) {
                C2128g.m9331a(aVar.f66347b, aVar.f66348c.f7237b, aVar.f66348c.f7236a);
                aVar.f66349d.mo65705a();
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
