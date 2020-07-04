package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _RoomAuthStatus_ProtoDecoder implements C2265b<RoomAuthStatus> {
    public final RoomAuthStatus decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static RoomAuthStatus decodeStatic(C2272g gVar) throws Exception {
        RoomAuthStatus roomAuthStatus = new RoomAuthStatus();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        roomAuthStatus.enableChat = C2273h.m9783a(gVar);
                        break;
                    case 2:
                        roomAuthStatus.enableDanmaku = C2273h.m9783a(gVar);
                        break;
                    case 3:
                        roomAuthStatus.enableGift = C2273h.m9783a(gVar);
                        break;
                    case 4:
                        roomAuthStatus.enableLuckMoney = C2273h.m9783a(gVar);
                        break;
                    case 5:
                        roomAuthStatus.enableDigg = C2273h.m9783a(gVar);
                        break;
                    case 7:
                        roomAuthStatus.enableRoomContributor = C2273h.m9783a(gVar);
                        break;
                    case 8:
                        roomAuthStatus.enableProps = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return roomAuthStatus;
            }
        }
    }
}
