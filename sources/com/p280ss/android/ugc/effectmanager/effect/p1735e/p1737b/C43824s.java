package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43798o;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.s */
public final class C43824s extends C43727d {

    /* renamed from: a */
    private C43834g f113472a;

    /* renamed from: b */
    private C43680a f113473b;

    /* renamed from: g */
    private C43721c f113474g = this.f113472a.f113532w;

    /* renamed from: h */
    private int f113475h;

    /* renamed from: i */
    private String f113476i;

    /* renamed from: j */
    private String f113477j;

    /* renamed from: k */
    private int f113478k;

    /* renamed from: l */
    private int f113479l;

    /* renamed from: m */
    private Map<String, String> f113480m;

    /* renamed from: a */
    public final void mo105685a() {
        C43707b a = m138771a(this.f113476i, this.f113478k, this.f113479l);
        while (true) {
            int i = this.f113475h;
            this.f113475h = i - 1;
            if (i != 0) {
                try {
                    if (this.f113228e) {
                        mo105769a(60, new C43798o(null, new C43726c(10001)));
                        return;
                    }
                    SearchEffectResponse searchEffectResponse = (SearchEffectResponse) this.f113472a.f113533x.mo106115a(a, this.f113472a.f113533x.mo106116a(a), this.f113474g, SearchEffectResponse.class);
                    if (searchEffectResponse != null && searchEffectResponse.checkValid()) {
                        C43731c.m138584a(this.f113472a.f113519j.getAbsolutePath(), searchEffectResponse.effects);
                        C43731c.m138584a(this.f113472a.f113519j.getAbsolutePath(), searchEffectResponse.collection);
                        C43731c.m138584a(this.f113472a.f113519j.getAbsolutePath(), searchEffectResponse.bind_effects);
                        mo105769a(60, new C43798o(searchEffectResponse, null));
                        return;
                    } else if (this.f113475h == 0) {
                        mo105769a(60, new C43798o(null, new C43726c(10014)));
                    }
                } catch (Exception e) {
                    if (this.f113475h == 0 || (e instanceof StatusCodeException)) {
                        mo105769a(60, new C43798o(null, new C43726c(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo105769a(60, new C43798o(null, new C43726c(e)));
    }

    /* renamed from: a */
    private C43707b m138771a(String str, int i, int i2) {
        HashMap a = m138568a(this.f113472a);
        a.put("panel", this.f113477j);
        a.put(POIService.KEY_KEYWORD, str);
        a.put("cursor", String.valueOf(i2));
        a.put("count", String.valueOf(i));
        if (this.f113480m != null) {
            a.putAll(this.f113480m);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113473b.f113069b.f113609h);
        sb.append(this.f113472a.f113510a);
        sb.append("/search");
        return new C43707b("GET", C43735g.m138609a(a, sb.toString()));
    }

    public C43824s(C43680a aVar, String str, String str2, int i, int i2, Map<String, String> map, Handler handler, String str3) {
        super(handler, str3, "NETWORK");
        this.f113476i = str2;
        this.f113478k = i;
        this.f113479l = i2;
        this.f113477j = str;
        this.f113480m = map;
        this.f113472a = aVar.f113068a;
        this.f113473b = aVar;
        this.f113475h = aVar.f113068a.f113529t;
    }
}
