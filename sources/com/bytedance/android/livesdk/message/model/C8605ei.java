package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ei */
public final class C8605ei implements C2265b<C8489ao> {
    /* renamed from: b */
    private static C8489ao m25863b(C2272g gVar) throws Exception {
        return m25862a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25863b(gVar);
    }

    /* renamed from: a */
    public static C8489ao m25862a(C2272g gVar) throws Exception {
        C8489ao aoVar = new C8489ao();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aoVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aoVar.f23254c = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aoVar.f23256e = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        aoVar.f23260i = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        aoVar.f23255d = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aoVar.f23259h = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        aoVar.f23252a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        aoVar.f23253b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        aoVar.f23258g = C2273h.m9784b(gVar);
                        break;
                    case 10:
                        aoVar.f23262k = C8666gp.m25982a(gVar);
                        break;
                    case 11:
                        aoVar.f23261j = C2273h.m9785c(gVar);
                        break;
                    case 12:
                        aoVar.f23263l = C2273h.m9785c(gVar);
                        break;
                    case 13:
                        aoVar.f23257f = C2273h.m9785c(gVar);
                        break;
                    case 14:
                        aoVar.f23266o = C8604eh.m25860a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aoVar;
            }
        }
    }
}
