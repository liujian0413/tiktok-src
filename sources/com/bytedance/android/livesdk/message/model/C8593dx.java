package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dx */
public final class C8593dx implements C2265b<C8478af> {
    /* renamed from: b */
    private static C8478af m25841b(C2272g gVar) throws Exception {
        return m25840a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25841b(gVar);
    }

    /* renamed from: a */
    private static C8478af m25840a(C2272g gVar) throws Exception {
        C8478af afVar = new C8478af();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        afVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        afVar.f23209a = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        afVar.f23210b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        afVar.f23211c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        afVar.f23212d = C8594dy.m25842a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return afVar;
            }
        }
    }
}
