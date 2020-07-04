package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ds */
public final class C8587ds implements C2265b<C8695y> {
    /* renamed from: b */
    private static C8695y m25831b(C2272g gVar) throws Exception {
        return m25830a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25831b(gVar);
    }

    /* renamed from: a */
    private static C8695y m25830a(C2272g gVar) throws Exception {
        C8695y yVar = new C8695y();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        yVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        yVar.f23695a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        yVar.f23696b = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        yVar.f23697c = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        yVar.f23698d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        yVar.f23699e = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return yVar;
            }
        }
    }
}
