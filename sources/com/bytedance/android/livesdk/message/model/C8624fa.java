package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fa */
public final class C8624fa implements C2265b<C8510bf> {
    /* renamed from: b */
    private static C8510bf m25901b(C2272g gVar) throws Exception {
        return m25900a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25901b(gVar);
    }

    /* renamed from: a */
    private static C8510bf m25900a(C2272g gVar) throws Exception {
        C8510bf bfVar = new C8510bf();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bfVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bfVar.f23347a = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        bfVar.f23348b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        bfVar.f23349c = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        bfVar.f23350d = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        bfVar.f23351e = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        bfVar.f23352f = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        bfVar.f23353g = C2273h.m9785c(gVar);
                        break;
                    case 9:
                        bfVar.f23354h = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bfVar;
            }
        }
    }
}
