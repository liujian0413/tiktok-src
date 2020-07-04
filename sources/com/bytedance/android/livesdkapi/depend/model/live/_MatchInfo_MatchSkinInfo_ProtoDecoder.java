package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.C9373m.C9375b;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _MatchInfo_MatchSkinInfo_ProtoDecoder implements C2265b<C9375b> {
    public final C9375b decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9375b decodeStatic(C2272g gVar) throws Exception {
        C9375b bVar = new C9375b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f25724a = _MatchInfo_FollowBtnSkin_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bVar.f25725b = _MatchInfo_FollowBtnSkin_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bVar.f25726c = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        bVar.f25727d = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        bVar.f25728e = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        bVar.f25729f = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        bVar.f25730g = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        bVar.f25731h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        bVar.f25732i = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        bVar.f25733j = C2273h.m9787e(gVar);
                        break;
                    case 11:
                        bVar.f25734k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bVar;
            }
        }
    }
}
