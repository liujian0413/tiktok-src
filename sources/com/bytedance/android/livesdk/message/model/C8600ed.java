package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.gift.relay.p392a.C8273d;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ed */
public final class C8600ed implements C2265b<C8483aj> {
    /* renamed from: b */
    private static C8483aj m25853b(C2272g gVar) throws Exception {
        return m25852a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25853b(gVar);
    }

    /* renamed from: a */
    private static C8483aj m25852a(C2272g gVar) throws Exception {
        C8483aj ajVar = new C8483aj();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ajVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        ajVar.f23224a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        ajVar.f23225b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        ajVar.f23226c = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        ajVar.f23227d = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        ajVar.f23228e = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        ajVar.f23229f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        ajVar.f23230g = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        ajVar.f23231h = C8273d.m25295a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return ajVar;
            }
        }
    }
}
