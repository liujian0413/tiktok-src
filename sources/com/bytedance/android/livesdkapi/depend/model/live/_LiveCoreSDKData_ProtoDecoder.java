package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _LiveCoreSDKData_ProtoDecoder implements C2265b<LiveCoreSDKData> {
    public final LiveCoreSDKData decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static LiveCoreSDKData decodeStatic(C2272g gVar) throws Exception {
        LiveCoreSDKData liveCoreSDKData = new LiveCoreSDKData();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return liveCoreSDKData;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                liveCoreSDKData.pullData = _LiveCoreSDKData_PullData_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
