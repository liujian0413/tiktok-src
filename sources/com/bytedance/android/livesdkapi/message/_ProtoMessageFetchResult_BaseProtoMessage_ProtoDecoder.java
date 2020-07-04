package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.livesdkapi.message.C9503e.C9504a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder implements C2265b<C9504a> {
    public final C9504a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9504a decodeStatic(C2272g gVar) throws Exception {
        C9504a aVar = new C9504a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f26011a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        aVar.f26012b = C2273h.m9788f(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aVar;
            }
        }
    }
}
