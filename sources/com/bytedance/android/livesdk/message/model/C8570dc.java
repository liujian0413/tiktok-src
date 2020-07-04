package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dc */
public final class C8570dc implements C2265b<C8677j> {
    /* renamed from: b */
    private static C8677j m25799b(C2272g gVar) throws Exception {
        return m25798a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25799b(gVar);
    }

    /* renamed from: a */
    private static C8677j m25798a(C2272g gVar) throws Exception {
        C8677j jVar = new C8677j();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        jVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        jVar.f23615c = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        jVar.f23616d = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        jVar.f23617e = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        jVar.f23618f = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        jVar.f23619g = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return jVar;
            }
        }
    }
}
