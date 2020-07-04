package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.c */
public final class C4818c implements C2265b<RivalExtraInfo> {
    /* renamed from: b */
    private static RivalExtraInfo m15846b(C2272g gVar) throws Exception {
        return m15845a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15846b(gVar);
    }

    /* renamed from: a */
    public static RivalExtraInfo m15845a(C2272g gVar) throws Exception {
        RivalExtraInfo rivalExtraInfo = new RivalExtraInfo();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        rivalExtraInfo.f13721a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        rivalExtraInfo.f13722b = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        rivalExtraInfo.f13723c = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        rivalExtraInfo.f13724d = C2273h.m9784b(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return rivalExtraInfo;
            }
        }
    }
}
