package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fg */
public final class C8630fg implements C2265b<C8514bj> {
    /* renamed from: b */
    private static C8514bj m25913b(C2272g gVar) throws Exception {
        return m25912a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25913b(gVar);
    }

    /* renamed from: a */
    private static C8514bj m25912a(C2272g gVar) throws Exception {
        C8514bj bjVar = new C8514bj();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bjVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bjVar.f23390b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bjVar.f23389a = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        bjVar.f23394f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        bjVar.f23395g = C2273h.m9783a(gVar);
                        break;
                    case 6:
                        bjVar.f23391c = C2273h.m9783a(gVar);
                        break;
                    case 7:
                        bjVar.f23396h = (int) C2273h.m9785c(gVar);
                        break;
                    case 8:
                        bjVar.f23393e = (int) C2273h.m9785c(gVar);
                        break;
                    case 9:
                        bjVar.f23397i = (int) C2273h.m9785c(gVar);
                        break;
                    case 10:
                        bjVar.f23392d = (int) C2273h.m9785c(gVar);
                        break;
                    case 11:
                        bjVar.f23398j = C2273h.m9787e(gVar);
                        break;
                    case 12:
                        bjVar.f23400l = C2273h.m9785c(gVar);
                        break;
                    case 14:
                        bjVar.f23401m = C2273h.m9787e(gVar);
                        break;
                    case 15:
                        bjVar.f23399k = C8629ff.m25910a(gVar);
                        break;
                    case 17:
                        bjVar.f23402n = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bjVar;
            }
        }
    }
}
