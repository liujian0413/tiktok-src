package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _ProtoMessageFetchResult_ProtoDecoder implements C2265b<C9503e> {
    public final C9503e decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9503e decodeStatic(C2272g gVar) throws Exception {
        C9503e eVar = new C9503e();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (eVar.f26006a == null) {
                            eVar.f26006a = new ArrayList();
                        }
                        eVar.f26006a.add(_ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 2:
                        eVar.f26007b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        eVar.f26008c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        eVar.f26009d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        eVar.f26010e = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return eVar;
            }
        }
    }
}
