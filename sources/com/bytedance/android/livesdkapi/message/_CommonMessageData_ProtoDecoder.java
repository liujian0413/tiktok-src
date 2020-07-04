package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _CommonMessageData_ProtoDecoder implements C2265b<C9500b> {
    public final C9500b decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9500b decodeStatic(C2272g gVar) throws Exception {
        C9500b bVar = new C9500b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f25995e = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        bVar.f25994d = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        bVar.f25993c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        bVar.f25991a = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        bVar.f25999i = C2273h.m9784b(gVar);
                        break;
                    case 6:
                        bVar.f25997g = C2273h.m9783a(gVar);
                        break;
                    case 7:
                        bVar.f25996f = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        bVar.f26000j = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        bVar.f26001k = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bVar;
            }
        }
    }
}
