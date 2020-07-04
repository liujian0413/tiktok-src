package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _Text_ProtoDecoder implements C2265b<C9505f> {
    public final C9505f decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9505f decodeStatic(C2272g gVar) throws Exception {
        C9505f fVar = new C9505f();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fVar.f26013a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        fVar.f26014b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        fVar.f26015c = _TextFormat_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        if (fVar.f26016d == null) {
                            fVar.f26016d = new ArrayList();
                        }
                        fVar.f26016d.add(_TextPiece_ProtoDecoder.decodeStatic(gVar));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fVar;
            }
        }
    }
}
