package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8536bz.C8537a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gb */
public final class C8652gb implements C2265b<C8537a> {
    /* renamed from: b */
    private static C8537a m25955b(C2272g gVar) throws Exception {
        return m25954a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25955b(gVar);
    }

    /* renamed from: a */
    public static C8537a m25954a(C2272g gVar) throws Exception {
        C8537a aVar = new C8537a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                aVar.mo21669a();
                return aVar;
            } else if (b == 1) {
                aVar.f23484a = C2273h.m9785c(gVar);
            } else if (b == 3) {
                aVar.f23485b = C2273h.m9787e(gVar);
            } else if (b != 9) {
                C2273h.m9789g(gVar);
            } else {
                aVar.f23487d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
