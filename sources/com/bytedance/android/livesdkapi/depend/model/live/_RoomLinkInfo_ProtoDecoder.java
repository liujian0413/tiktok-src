package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _RoomLinkInfo_ProtoDecoder implements C2265b<C9380q> {
    public final C9380q decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9380q decodeStatic(C2272g gVar) throws Exception {
        C9380q qVar = new C9380q();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        qVar.f25761a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        qVar.f25762b = _ChannelInfoInRoom_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        if (qVar.f25764d == null) {
                            qVar.f25764d = new ArrayList();
                        }
                        qVar.f25764d.add(_BattleScorePairInRoom_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 4:
                        qVar.f25763c = _BattleSettingInRoom_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return qVar;
            }
        }
    }
}
