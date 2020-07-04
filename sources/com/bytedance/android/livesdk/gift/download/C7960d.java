package com.bytedance.android.livesdk.gift.download;

import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.C46234e;
import com.p280ss.ugc.live.gift.resource.p1827a.C46211b;
import com.p280ss.ugc.live.gift.resource.p1829c.C46221a;
import com.p280ss.ugc.live.gift.resource.p1829c.C46222b;
import com.p280ss.ugc.live.gift.resource.p1829c.C46225d;
import com.p280ss.ugc.live.gift.resource.p1829c.C46227f;

/* renamed from: com.bytedance.android.livesdk.gift.download.d */
public final class C7960d implements C46221a<String> {

    /* renamed from: a */
    private static C46225d<String> f21544a;

    /* renamed from: b */
    private static C46225d<String> f21545b;

    /* renamed from: a */
    private static C46225d<String> m24392a(C46211b bVar) {
        return new C46222b(new C7958c(bVar));
    }

    /* renamed from: a */
    public final C46225d<String> mo20823a(C46220c cVar, C46234e eVar) {
        if (!cVar.f118816e) {
            if (f21545b != null) {
                return f21545b;
            }
            C46225d<String> a = m24392a(eVar.f118833a);
            f21545b = a;
            return a;
        } else if (f21544a != null) {
            return f21544a;
        } else {
            C46227f fVar = new C46227f(m24392a(eVar.f118833a));
            f21544a = fVar;
            return fVar;
        }
    }
}
