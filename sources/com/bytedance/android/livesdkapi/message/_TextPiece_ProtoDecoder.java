package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _TextPiece_ProtoDecoder implements C2265b<C9507h> {
    public final C9507h decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9507h decodeStatic(C2272g gVar) throws Exception {
        C9507h hVar = new C9507h();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return hVar;
            } else if (b != 11) {
                switch (b) {
                    case 1:
                        hVar.f26020a = C2273h.m9784b(gVar);
                        break;
                    case 2:
                        hVar.f26021b = _TextFormat_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        switch (b) {
                            case 21:
                                hVar.f26023d = _TextPieceUser_ProtoDecoder.decodeStatic(gVar);
                                break;
                            case 22:
                                hVar.f26024e = _TextPieceGift_ProtoDecoder.decodeStatic(gVar);
                                break;
                            case 23:
                                hVar.f26025f = _TextPieceHeart_ProtoDecoder.decodeStatic(gVar);
                                break;
                            case 24:
                                hVar.f26026g = _TextPiecePatternRef_ProtoDecoder.decodeStatic(gVar);
                                break;
                            default:
                                C2273h.m9789g(gVar);
                                break;
                        }
                }
            } else {
                hVar.f26022c = C2273h.m9787e(gVar);
            }
        }
    }
}
