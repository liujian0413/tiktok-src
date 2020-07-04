package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ft */
public final class C8643ft implements C2265b<C8529bs> {
    /* renamed from: b */
    private static C8529bs m25939b(C2272g gVar) throws Exception {
        return m25938a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25939b(gVar);
    }

    /* renamed from: a */
    private static C8529bs m25938a(C2272g gVar) throws Exception {
        C8529bs bsVar = new C8529bs();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bsVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bsVar.f23446a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        bsVar.f23447b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        bsVar.f23448c = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        bsVar.f23449d = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        bsVar.f23450e = C2273h.m9783a(gVar);
                        break;
                    case 7:
                        bsVar.f23451f = C2273h.m9784b(gVar);
                        break;
                    case 8:
                        bsVar.f23452g = C2273h.m9784b(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bsVar;
            }
        }
    }
}
