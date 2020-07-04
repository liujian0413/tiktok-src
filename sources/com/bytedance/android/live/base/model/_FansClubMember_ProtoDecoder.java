package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.user._FansClubData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.LinkedHashMap;

public final class _FansClubMember_ProtoDecoder implements C2265b<FansClubMember> {
    public final FansClubMember decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FansClubMember decodeStatic(C2272g gVar) throws Exception {
        FansClubMember fansClubMember = new FansClubMember();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fansClubMember.data = _FansClubData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (fansClubMember.preferData == null) {
                            fansClubMember.preferData = new LinkedHashMap();
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
                                        obj = _FansClubData_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo8058a(a2);
                                if (num == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    fansClubMember.preferData.put(num, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fansClubMember;
            }
        }
    }
}
