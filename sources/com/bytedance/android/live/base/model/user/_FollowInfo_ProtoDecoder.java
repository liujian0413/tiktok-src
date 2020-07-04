package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _FollowInfo_ProtoDecoder implements C2265b<FollowInfo> {
    public final FollowInfo decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FollowInfo decodeStatic(C2272g gVar) throws Exception {
        FollowInfo followInfo = new FollowInfo();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        followInfo.followingCount = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        followInfo.followerCount = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        followInfo.followStatus = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        followInfo.pushStatus = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return followInfo;
            }
        }
    }
}
