package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dh */
public final class C8575dh implements C2265b<C8682o> {
    /* renamed from: b */
    private static C8682o m25809b(C2272g gVar) throws Exception {
        return m25808a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25809b(gVar);
    }

    /* renamed from: a */
    private static C8682o m25808a(C2272g gVar) throws Exception {
        C8682o oVar = new C8682o();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        oVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        oVar.f23633a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        oVar.f23634b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        oVar.f23635c = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        oVar.f23636d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        oVar.f23637e = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        oVar.f23638f = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return oVar;
            }
        }
    }
}
