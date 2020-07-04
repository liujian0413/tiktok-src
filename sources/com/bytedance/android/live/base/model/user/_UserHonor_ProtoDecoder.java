package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _UserHonor_ProtoDecoder implements C2265b<C2380l> {
    public final C2380l decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2380l decodeStatic(C2272g gVar) throws Exception {
        C2380l lVar = new C2380l();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return lVar;
            } else if (b != 1001) {
                switch (b) {
                    case 1:
                        lVar.f7839f = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        lVar.f7834a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        lVar.f7838e = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        lVar.f7835b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        lVar.f7837d = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        lVar.f7847n = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        lVar.f7836c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        lVar.f7841h = C2273h.m9785c(gVar);
                        break;
                    case 9:
                        lVar.f7840g = C2273h.m9785c(gVar);
                        break;
                    case 10:
                        lVar.f7851r = C2273h.m9785c(gVar);
                        break;
                    case 11:
                        lVar.f7850q = C2273h.m9785c(gVar);
                        break;
                    case 12:
                        lVar.f7856w = C2273h.m9785c(gVar);
                        break;
                    case 13:
                        lVar.f7849p = C2273h.m9787e(gVar);
                        break;
                    case 14:
                        if (lVar.f7848o == null) {
                            lVar.f7848o = new ArrayList();
                        }
                        lVar.f7848o.add(_GradeIcon_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 15:
                        lVar.f7859z = C2273h.m9785c(gVar);
                        break;
                    case 16:
                        lVar.f7842i = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 17:
                        lVar.f7843j = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 18:
                        lVar.f7845l = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 19:
                        lVar.f7844k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 20:
                        lVar.f7846m = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 21:
                        lVar.f7854u = C2273h.m9785c(gVar);
                        break;
                    case 22:
                        lVar.f7857x = C2273h.m9787e(gVar);
                        break;
                    case 23:
                        lVar.f7852s = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 24:
                        lVar.f7853t = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 25:
                        lVar.f7858y = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                lVar.f7855v = C2273h.m9787e(gVar);
            }
        }
    }
}
