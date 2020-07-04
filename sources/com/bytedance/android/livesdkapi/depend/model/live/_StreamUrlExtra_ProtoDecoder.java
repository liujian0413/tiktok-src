package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _StreamUrlExtra_ProtoDecoder implements C2265b<C9383t> {
    public final C9383t decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9383t decodeStatic(C2272g gVar) throws Exception {
        C9383t tVar = new C9383t();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        tVar.f25779c = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        tVar.f25780d = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        tVar.f25787k = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        tVar.f25783g = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        tVar.f25781e = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        tVar.f25782f = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        tVar.f25786j = (int) C2273h.m9785c(gVar);
                        break;
                    case 8:
                        tVar.f25788l = (int) C2273h.m9785c(gVar);
                        break;
                    case 9:
                        tVar.f25789m = (int) C2273h.m9785c(gVar);
                        break;
                    case 10:
                        tVar.f25785i = C2273h.m9783a(gVar);
                        break;
                    case 12:
                        tVar.f25784h = (int) C2273h.m9785c(gVar);
                        break;
                    case 14:
                        tVar.f25790n = _StreamUrlExtra_SrConfig_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 15:
                        tVar.f25791o = C2273h.m9783a(gVar);
                        break;
                    case 16:
                        tVar.f25792p = (float) C2273h.m9785c(gVar);
                        break;
                    case 17:
                        tVar.f25793q = C2273h.m9783a(gVar);
                        break;
                    case 18:
                        tVar.f25794r = C2273h.m9783a(gVar);
                        break;
                    case 19:
                        tVar.f25795s = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return tVar;
            }
        }
    }
}
