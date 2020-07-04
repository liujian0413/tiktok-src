package com.bytedance.android.live.base.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _RoomStats_ProtoDecoder implements C2265b<RoomStats> {
    public final RoomStats decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static RoomStats decodeStatic(C2272g gVar) throws Exception {
        RoomStats roomStats = new RoomStats();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        roomStats.f7713id = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        roomStats.idStr = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        roomStats.ticket = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        roomStats.money = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        roomStats.totalUser = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        roomStats.giftUVCount = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        roomStats.followCount = (int) C2273h.m9785c(gVar);
                        break;
                    case 8:
                        roomStats.userComposition = _RoomStats_UserComposition_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        roomStats.watermelon = (int) C2273h.m9785c(gVar);
                        break;
                    case 11:
                        roomStats.enterCount = (int) C2273h.m9785c(gVar);
                        break;
                    case 12:
                        roomStats.douPlusPromotion = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return roomStats;
            }
        }
    }
}
