package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _ActivityRewardInfo_ProtoDecoder implements C2265b<C2367a> {
    public final C2367a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2367a decodeStatic(C2272g gVar) throws Exception {
        C2367a aVar = new C2367a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f7792a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aVar.f7793b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aVar;
            }
        }
    }
}
