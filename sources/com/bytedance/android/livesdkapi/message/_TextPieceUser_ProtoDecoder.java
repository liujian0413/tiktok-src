package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _TextPieceUser_ProtoDecoder implements C2265b<C9511l> {
    public final C9511l decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9511l decodeStatic(C2272g gVar) throws Exception {
        C9511l lVar = new C9511l();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lVar.f26032a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        lVar.f26033b = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return lVar;
            }
        }
    }
}
