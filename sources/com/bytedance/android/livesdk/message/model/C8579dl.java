package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dl */
public final class C8579dl implements C2265b<C8686r> {
    /* renamed from: b */
    private static C8686r m25817b(C2272g gVar) throws Exception {
        return m25816a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25817b(gVar);
    }

    /* renamed from: a */
    private static C8686r m25816a(C2272g gVar) throws Exception {
        C8686r rVar = new C8686r();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        rVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        rVar.f23655a = C2273h.m9783a(gVar);
                        break;
                    case 3:
                        rVar.f23656b = C2273h.m9783a(gVar);
                        break;
                    case 4:
                        rVar.f23657c = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        rVar.f23660f = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        rVar.f23658d = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        rVar.f23659e = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        rVar.f23661g = (int) C2273h.m9785c(gVar);
                        break;
                    case 9:
                        rVar.f23662h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        rVar.f23663i = (int) C2273h.m9785c(gVar);
                        break;
                    case 11:
                        rVar.f23664j = (int) C2273h.m9785c(gVar);
                        break;
                    case 12:
                        rVar.f23665k = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return rVar;
            }
        }
    }
}
