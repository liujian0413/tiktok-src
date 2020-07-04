package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.FansClubData.UserBadge;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.LinkedHashMap;

public final class _FansClubData_UserBadge_ProtoDecoder implements C2265b<UserBadge> {
    public final UserBadge decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static UserBadge decodeStatic(C2272g gVar) throws Exception {
        UserBadge userBadge = new UserBadge();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (userBadge.icons == null) {
                            userBadge.icons = new LinkedHashMap();
                        }
                        long a2 = gVar.mo8056a();
                        Integer num = null;
                        Object obj = null;
                        while (true) {
                            int b2 = gVar.mo8059b();
                            if (b2 != -1) {
                                switch (b2) {
                                    case 1:
                                        num = Integer.valueOf(C2273h.m9784b(gVar));
                                        break;
                                    case 2:
                                        obj = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo8058a(a2);
                                if (num == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    userBadge.icons.put(num, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 2:
                        userBadge.title = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return userBadge;
            }
        }
    }
}
