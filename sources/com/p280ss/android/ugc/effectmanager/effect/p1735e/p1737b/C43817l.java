package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43791h;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.l */
public final class C43817l extends C43727d {

    /* renamed from: a */
    private C43834g f113423a;

    /* renamed from: b */
    private C43680a f113424b;

    /* renamed from: g */
    private int f113425g;

    /* renamed from: h */
    private List<String> f113426h;

    /* renamed from: i */
    private Map<String, String> f113427i;

    /* renamed from: a */
    public final void mo105685a() {
        while (true) {
            int i = this.f113425g;
            this.f113425g = i - 1;
            if (i != 0) {
                try {
                    EffectListResponse effectListResponse = (EffectListResponse) this.f113423a.f113533x.mo106114a(m138755a(this.f113426h), this.f113423a.f113532w, EffectListResponse.class);
                    if (effectListResponse != null && effectListResponse.checkValid()) {
                        C43731c.m138584a(this.f113423a.f113519j.getAbsolutePath(), effectListResponse.data);
                        C43731c.m138584a(this.f113423a.f113519j.getAbsolutePath(), effectListResponse.collection);
                        mo105769a(23, new C43791h(effectListResponse, null));
                        return;
                    } else if (this.f113425g == 0) {
                        mo105769a(23, new C43791h(null, new C43726c(10014)));
                    }
                } catch (Exception e) {
                    if (this.f113425g == 0 || (e instanceof StatusCodeException)) {
                        mo105769a(23, new C43791h(null, new C43726c(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo105769a(23, new C43791h(null, new C43726c(e)));
    }

    /* renamed from: a */
    private C43707b m138755a(List<String> list) {
        HashMap a = m138568a(this.f113423a);
        if (this.f113427i != null) {
            a.putAll(this.f113427i);
        }
        a.put("effect_ids", C43735g.m138608a(list));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113424b.f113069b.f113609h);
        sb.append(this.f113423a.f113510a);
        sb.append("/v3/effect/list");
        return new C43707b("GET", C43735g.m138609a(a, sb.toString()));
    }

    public C43817l(C43680a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str, "NETWORK");
        this.f113427i = map;
        this.f113423a = aVar.f113068a;
        this.f113424b = aVar;
        this.f113426h = list;
        this.f113425g = aVar.f113068a.f113529t;
    }
}
