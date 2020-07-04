package com.p280ss.android.ugc.aweme.p313im.sdk.p317j;

import com.p280ss.android.websocket.internal.C45439a;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.j.b */
public final class C7006b implements C7305b {
    /* renamed from: a */
    public final Object mo18093a(C45439a aVar) {
        if (aVar.getMethod() != 1) {
            return null;
        }
        return m21801b(aVar);
    }

    /* renamed from: b */
    private static C31334a m21801b(C45439a aVar) {
        try {
            C31334a aVar2 = new C31334a();
            aVar2.f82111c = aVar.getMethod();
            aVar2.f82115g = aVar.getPayload();
            aVar2.f82113e = aVar.getPayloadEncoding();
            aVar2.f82114f = aVar.getPayloadType();
            return aVar2;
        } catch (Exception unused) {
            return null;
        }
    }
}
