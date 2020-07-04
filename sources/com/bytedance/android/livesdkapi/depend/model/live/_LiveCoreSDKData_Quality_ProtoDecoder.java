package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _LiveCoreSDKData_Quality_ProtoDecoder implements C2265b<Quality> {
    public final Quality decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static Quality decodeStatic(C2272g gVar) throws Exception {
        Quality quality = new Quality();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        quality.name = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        quality.sdkKey = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return quality;
            }
        }
    }
}
