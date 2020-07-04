package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _FansClubData_ProtoDecoder implements C2265b<FansClubData> {
    public final FansClubData decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FansClubData decodeStatic(C2272g gVar) throws Exception {
        FansClubData fansClubData = new FansClubData();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fansClubData.clubName = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        fansClubData.level = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        fansClubData.userFansClubStatus = C2273h.m9784b(gVar);
                        break;
                    case 4:
                        fansClubData.badge = _FansClubData_UserBadge_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        if (fansClubData.availableGiftIds == null) {
                            fansClubData.availableGiftIds = new ArrayList();
                        }
                        fansClubData.availableGiftIds.add(Long.valueOf(C2273h.m9785c(gVar)));
                        break;
                    case 6:
                        fansClubData.anchorId = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fansClubData;
            }
        }
    }
}
