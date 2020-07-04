package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2271f;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _RoomDecoration_ProtoDecoder implements C2265b<C9379p> {
    public final C9379p decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9379p decodeStatic(C2272g gVar) throws Exception {
        C9379p pVar = new C9379p();
        ArrayList arrayList = new ArrayList();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        pVar.f25753h = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        pVar.f25746a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        pVar.f25752g = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        arrayList.add(Integer.valueOf((int) C2273h.m9785c(gVar)));
                        break;
                    case 5:
                        pVar.f25748c = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        pVar.f25747b = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        pVar.f25749d = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        pVar.f25750e = (int) C2273h.m9785c(gVar);
                        break;
                    case 9:
                        pVar.f25758m = (int) C2273h.m9785c(gVar);
                        break;
                    case 10:
                        pVar.f25757l = (int) C2273h.m9785c(gVar);
                        break;
                    case 11:
                        pVar.f25754i = (int) C2273h.m9785c(gVar);
                        break;
                    case 12:
                        pVar.f25756k = (int) C2273h.m9785c(gVar);
                        break;
                    case 13:
                        pVar.f25755j = (int) C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                pVar.f25751f = C2271f.m9768a(arrayList);
                return pVar;
            }
        }
    }
}
