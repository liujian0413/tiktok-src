package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _FraternityInfo_ProtoDecoder implements C2265b<FraternityInfo> {
    public final FraternityInfo decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FraternityInfo decodeStatic(C2272g gVar) throws Exception {
        FraternityInfo fraternityInfo = new FraternityInfo();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fraternityInfo.name = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        fraternityInfo.level = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        fraternityInfo.background = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        fraternityInfo.fontColor = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fraternityInfo;
            }
        }
    }
}
