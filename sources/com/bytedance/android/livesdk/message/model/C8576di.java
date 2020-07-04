package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8683p.C8684a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.di */
public final class C8576di implements C2265b<C8684a> {
    /* renamed from: b */
    private static C8684a m25811b(C2272g gVar) throws Exception {
        return m25810a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25811b(gVar);
    }

    /* renamed from: a */
    public static C8684a m25810a(C2272g gVar) throws Exception {
        C8684a aVar = new C8684a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23647a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        aVar.f23648b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        aVar.f23649c = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        aVar.f23650d = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        aVar.f23651e = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aVar.f23652f = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aVar;
            }
        }
    }
}
