package com.p280ss.android.ugc.aweme.p313im.sdk.p315g;

import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.C31833b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.C31834c;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.C32015a;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1352a.C32019b;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b.C32021a;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b.C32022b;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7099c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.g.d */
public final class C6997d implements C7099c {
    /* renamed from: a */
    public final C32015a mo18081a(C32022b bVar) {
        C7573i.m23587b(bVar, "payload");
        return new C31834c(bVar);
    }

    /* renamed from: a */
    public final C32015a mo18080a(C32021a aVar, C32019b bVar) {
        C7573i.m23587b(aVar, "payload");
        C7573i.m23587b(bVar, "callback");
        IMService.inst().ensureIMState();
        C31833b bVar2 = new C31833b(aVar, bVar);
        C32015a aVar2 = bVar2;
        bVar.mo80288a(aVar2);
        bVar2.mo82652a();
        return aVar2;
    }
}
