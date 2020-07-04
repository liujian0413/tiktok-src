package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.C4897bc;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gh */
public final class C8658gh implements C2265b<RoomNotifyMessageExtra> {
    /* renamed from: b */
    private static RoomNotifyMessageExtra m25967b(C2272g gVar) throws Exception {
        return m25966a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25967b(gVar);
    }

    /* renamed from: a */
    public static RoomNotifyMessageExtra m25966a(C2272g gVar) throws Exception {
        RoomNotifyMessageExtra roomNotifyMessageExtra = new RoomNotifyMessageExtra();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        roomNotifyMessageExtra.f23185d = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        roomNotifyMessageExtra.f23183b = C8657gg.m25964a(gVar);
                        break;
                    case 3:
                        roomNotifyMessageExtra.f23184c = C4897bc.m15888a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return roomNotifyMessageExtra;
            }
        }
    }
}
