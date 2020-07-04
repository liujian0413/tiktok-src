package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gq */
public final class C8667gq implements C2265b<C8553cn> {
    /* renamed from: b */
    private static C8553cn m25985b(C2272g gVar) throws Exception {
        return m25984a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25985b(gVar);
    }

    /* renamed from: a */
    private static C8553cn m25984a(C2272g gVar) throws Exception {
        C8553cn cnVar = new C8553cn();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cnVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cnVar.f23572a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        cnVar.f23573b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cnVar.f23575d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        cnVar.f23574c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cnVar;
            }
        }
    }
}
