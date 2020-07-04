package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.PullData;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _LiveCoreSDKData_PullData_ProtoDecoder implements C2265b<PullData> {
    public final PullData decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static PullData decodeStatic(C2272g gVar) throws Exception {
        PullData pullData = new PullData();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        pullData.streamData = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        pullData.options = _LiveCoreSDKData_Options_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return pullData;
            }
        }
    }
}
