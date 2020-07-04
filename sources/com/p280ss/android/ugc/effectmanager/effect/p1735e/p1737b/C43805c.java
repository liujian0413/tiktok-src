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
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43787d;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.c */
public final class C43805c extends C43727d {

    /* renamed from: a */
    private C43834g f113341a;

    /* renamed from: b */
    private C43680a f113342b;

    /* renamed from: g */
    private int f113343g;

    /* renamed from: h */
    private List<String> f113344h;

    /* renamed from: i */
    private Map<String, String> f113345i;

    /* renamed from: a */
    public final void mo105685a() {
        while (true) {
            int i = this.f113343g;
            this.f113343g = i - 1;
            if (i != 0) {
                try {
                    EffectListResponse effectListResponse = (EffectListResponse) this.f113341a.f113533x.mo106114a(m138726a(this.f113344h), this.f113341a.f113532w, EffectListResponse.class);
                    if (effectListResponse != null && effectListResponse.checkValid()) {
                        C43731c.m138584a(this.f113341a.f113519j.getAbsolutePath(), effectListResponse.data);
                        mo105769a(17, new C43787d(effectListResponse.data, null));
                        return;
                    } else if (this.f113343g == 0) {
                        mo105769a(17, new C43787d(new ArrayList(), new C43726c(10014)));
                    }
                } catch (Exception e) {
                    if (this.f113343g == 0 || (e instanceof StatusCodeException)) {
                        mo105769a(17, new C43787d(new ArrayList(), new C43726c(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo105769a(17, new C43787d(new ArrayList(), new C43726c(e)));
    }

    /* renamed from: a */
    private C43707b m138726a(List<String> list) {
        HashMap a = m138568a(this.f113341a);
        if (this.f113345i != null) {
            a.putAll(this.f113345i);
        }
        a.put("effect_ids", C43735g.m138608a(list));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113342b.f113069b.f113609h);
        sb.append(this.f113341a.f113510a);
        sb.append("/v3/effect/list");
        return new C43707b("GET", C43735g.m138609a(a, sb.toString()));
    }

    public C43805c(C43680a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str, "NETWORK");
        this.f113345i = map;
        this.f113341a = aVar.f113068a;
        this.f113342b = aVar;
        this.f113344h = list;
        this.f113343g = aVar.f113068a.f113529t;
    }
}
