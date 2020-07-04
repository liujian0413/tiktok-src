package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gm */
public final class C8663gm implements C2265b<C8548cj> {
    /* renamed from: b */
    private static C8548cj m25977b(C2272g gVar) throws Exception {
        return m25976a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25977b(gVar);
    }

    /* renamed from: a */
    private static C8548cj m25976a(C2272g gVar) throws Exception {
        C8548cj cjVar = new C8548cj();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cjVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cjVar.f23544c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        cjVar.f23545d = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cjVar.f23543b = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        cjVar.f23546e = (int) C2273h.m9785c(gVar);
                        break;
                    case 8:
                        cjVar.f23547f = C8571dd.m25800a(gVar);
                        break;
                    case 9:
                        cjVar.f23548g = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cjVar;
            }
        }
    }
}
