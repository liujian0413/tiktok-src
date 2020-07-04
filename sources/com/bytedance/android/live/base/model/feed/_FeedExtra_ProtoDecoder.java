package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _FeedExtra_ProtoDecoder implements C2265b<C2344a> {
    public final C2344a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2344a decodeStatic(C2272g gVar) throws Exception {
        C2344a aVar = new C2344a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f7697d = _FeedExtra_LogPb_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                switch (b) {
                    case 5:
                        aVar.f7694a = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aVar.f7698e = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        aVar.f7699f = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        aVar.f7702i = (int) C2273h.m9785c(gVar);
                        break;
                    case 9:
                        aVar.f7701h = _FeedBannerContainer_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        aVar.f7695b = _RankRoundBanner_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        aVar.f7696c = C2273h.m9787e(gVar);
                        break;
                    case 12:
                        aVar.f7703j = (int) C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                aVar.hasMore = C2273h.m9783a(gVar);
            }
        }
    }
}
