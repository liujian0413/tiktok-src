package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32303g.C32304a;
import com.p280ss.android.ugc.aweme.login.p1373ui.C32694a.C32695a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.f */
public final class C32302f extends C32296d {
    public C32302f(C32296d dVar) {
        C7573i.m23587b(dVar, "next");
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C32297a mo83494a(C32303g gVar, C12462c cVar, C12534t<?> tVar) {
        if (gVar != null) {
            C32304a aVar = gVar.f84380a;
            if (aVar != null && aVar.f84382a == 8) {
                C32695a.m105810a().mo84135a();
                return new C32297a(true, false);
            }
        }
        C32297a aVar2 = C32295c.f84366a;
        C7573i.m23582a((Object) aVar2, "ChainManager.IGNORE_RESULT");
        return aVar2;
    }
}
