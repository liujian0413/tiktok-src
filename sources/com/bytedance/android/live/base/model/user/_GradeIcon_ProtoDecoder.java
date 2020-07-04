package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _GradeIcon_ProtoDecoder implements C2265b<C2376h> {
    public final C2376h decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2376h decodeStatic(C2272g gVar) throws Exception {
        C2376h hVar = new C2376h();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.f7825c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        hVar.f7824b = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        hVar.f7826d = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        hVar.f7823a = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return hVar;
            }
        }
    }
}
