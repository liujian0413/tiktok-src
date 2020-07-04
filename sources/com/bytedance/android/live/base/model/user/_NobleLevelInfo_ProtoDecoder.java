package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _NobleLevelInfo_ProtoDecoder implements C2265b<NobleLevelInfo> {
    public final NobleLevelInfo decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static NobleLevelInfo decodeStatic(C2272g gVar) throws Exception {
        NobleLevelInfo nobleLevelInfo = new NobleLevelInfo();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        nobleLevelInfo.nobleBackground = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        nobleLevelInfo.nobleLevel = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        nobleLevelInfo.nobleIcon = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        nobleLevelInfo.nobleName = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        nobleLevelInfo.expireTime = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        nobleLevelInfo.nobleBigIcon = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        nobleLevelInfo.nobleIconWithBack = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        nobleLevelInfo.nobleBoarder = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        if (nobleLevelInfo.nobleBackgroundColor == null) {
                            nobleLevelInfo.nobleBackgroundColor = new ArrayList();
                        }
                        nobleLevelInfo.nobleBackgroundColor.add(C2273h.m9787e(gVar));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return nobleLevelInfo;
            }
        }
    }
}
