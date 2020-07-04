package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43794k;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.q */
public final class C43822q extends C43727d {

    /* renamed from: a */
    private C43834g f113464a;

    /* renamed from: b */
    private C43680a f113465b;

    /* renamed from: g */
    private int f113466g;

    /* renamed from: h */
    private Map<String, String> f113467h;

    /* renamed from: b */
    private C43707b m138768b() {
        HashMap a = m138568a(this.f113464a);
        if (this.f113467h != null) {
            a.putAll(this.f113467h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113465b.f113069b.f113609h);
        sb.append(this.f113464a.f113510a);
        sb.append("/moji/resource");
        return new C43707b("GET", C43735g.m138609a(a, sb.toString()));
    }

    /* renamed from: a */
    public final void mo105685a() {
        while (true) {
            int i = this.f113466g;
            this.f113466g = i - 1;
            if (i != 0) {
                try {
                    ResourceListResponse resourceListResponse = (ResourceListResponse) this.f113464a.f113533x.mo106114a(m138768b(), this.f113464a.f113532w, ResourceListResponse.class);
                    if (resourceListResponse != null && resourceListResponse.checkValue()) {
                        mo105769a(24, new C43794k(resourceListResponse.data));
                        return;
                    }
                } catch (Exception e) {
                    if (this.f113466g == 0 || (e instanceof StatusCodeException)) {
                        mo105769a(24, new C43794k(new C43726c(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo105769a(24, new C43794k(new C43726c(e)));
    }

    public C43822q(C43680a aVar, Handler handler, String str, Map<String, String> map) {
        super(handler, str, "NETWORK");
        this.f113467h = map;
        this.f113464a = aVar.f113068a;
        this.f113465b = aVar;
        this.f113466g = aVar.f113068a.f113529t;
    }
}
