package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _TextPiecePatternRef_ProtoDecoder implements C2265b<C9510k> {
    public final C9510k decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9510k decodeStatic(C2272g gVar) throws Exception {
        C9510k kVar = new C9510k();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        kVar.f26030a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        kVar.f26031b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return kVar;
            }
        }
    }
}
