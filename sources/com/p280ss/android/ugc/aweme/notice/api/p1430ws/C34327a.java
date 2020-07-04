package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import com.p280ss.android.ugc.aweme.p1041ar.C23070b;
import com.p280ss.android.websocket.internal.C45439a;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.a */
public final class C34327a implements C7305b {
    /* renamed from: a */
    public final Object mo18093a(C45439a aVar) {
        return m111020b(aVar);
    }

    /* renamed from: b */
    private static C23070b m111020b(C45439a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            C23070b bVar = new C23070b();
            bVar.f60890a = aVar.getMethod();
            bVar.f60891b = aVar.getService();
            bVar.f60892c = aVar.getPayload();
            bVar.f60893d = aVar.getPayloadType();
            bVar.f60894e = aVar.getPayloadEncoding();
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
