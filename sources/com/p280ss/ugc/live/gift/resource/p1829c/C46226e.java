package com.p280ss.ugc.live.gift.resource.p1829c;

import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.C46234e;
import com.p280ss.ugc.live.gift.resource.p1828b.C46214b;
import com.p280ss.ugc.live.gift.resource.p1828b.C46216c;

/* renamed from: com.ss.ugc.live.gift.resource.c.e */
public final class C46226e implements C46221a<String> {

    /* renamed from: a */
    private static C46225d<String> f118827a;

    /* renamed from: b */
    private static C46225d<String> f118828b;

    /* renamed from: c */
    private C46214b f118829c = new C46216c();

    /* renamed from: a */
    private C46225d<String> m145151a(C46234e eVar) {
        return new C46222b(new C46223c(this.f118829c, eVar.f118833a));
    }

    /* renamed from: a */
    public final C46225d<String> mo20823a(C46220c cVar, C46234e eVar) {
        if (!cVar.f118816e) {
            if (f118828b != null) {
                return f118828b;
            }
            C46225d<String> a = m145151a(eVar);
            f118828b = a;
            return a;
        } else if (f118827a != null) {
            return f118827a;
        } else {
            C46227f fVar = new C46227f(m145151a(eVar));
            f118827a = fVar;
            return fVar;
        }
    }
}
