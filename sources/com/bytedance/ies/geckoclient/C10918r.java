package com.bytedance.ies.geckoclient;

import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.geckoclient.p570d.C10852a;
import com.bytedance.ies.geckoclient.p571e.C10866c;
import java.util.List;

/* renamed from: com.bytedance.ies.geckoclient.r */
public final class C10918r extends C10835a {

    /* renamed from: b */
    private List<C10917q> f29572b;

    /* renamed from: c */
    private C10852a f29573c;

    /* renamed from: d */
    private C10873f f29574d;

    public final void run() {
        C10915o oVar = new C10915o(this.f29574d);
        if (!C6311g.m19573a(this.f29572b)) {
            for (C10917q qVar : this.f29572b) {
                try {
                    qVar.f29561b = oVar.f29559a;
                    qVar.run();
                } catch (Exception unused) {
                }
            }
            oVar.f29559a.f29556b.addAll(C10866c.m31876a(C10873f.m31911e()).mo26195a());
            C10916p pVar = new C10916p(this.f29573c);
            pVar.f29560b = oVar;
            pVar.run();
        }
    }

    public C10918r(C10852a aVar, List<C10917q> list, C10873f fVar) {
        super(aVar);
        this.f29572b = list;
        this.f29573c = aVar;
        this.f29574d = fVar;
    }
}
