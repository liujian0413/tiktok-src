package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _TextPieceGift_ProtoDecoder implements C2265b<C9508i> {
    public final C9508i decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9508i decodeStatic(C2272g gVar) throws Exception {
        C9508i iVar = new C9508i();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        iVar.f26027a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        iVar.f26028b = _PatternRef_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return iVar;
            }
        }
    }
}
