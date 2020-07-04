package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _TextPieceHeart_ProtoDecoder implements C2265b<C9509j> {
    public final C9509j decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9509j decodeStatic(C2272g gVar) throws Exception {
        C9509j jVar = new C9509j();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return jVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                jVar.f26029a = C2273h.m9787e(gVar);
            }
        }
    }
}
