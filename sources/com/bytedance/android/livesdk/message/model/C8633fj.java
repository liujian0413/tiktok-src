package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fj */
public final class C8633fj implements C2265b<C8518bm> {
    /* renamed from: b */
    private static C8518bm m25919b(C2272g gVar) throws Exception {
        return m25918a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25919b(gVar);
    }

    /* renamed from: a */
    private static C8518bm m25918a(C2272g gVar) throws Exception {
        C8518bm bmVar = new C8518bm();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bmVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bmVar.f23414a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bmVar.f23415b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        bmVar.f23416c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        bmVar.f23417d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        bmVar.f23418e = C2273h.m9784b(gVar);
                        break;
                    case 7:
                        bmVar.f23419f = C8604eh.m25860a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bmVar;
            }
        }
    }
}
