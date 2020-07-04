package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ea */
public final class C8597ea implements C2265b<FansclubStatisticMessage> {
    /* renamed from: b */
    private static FansclubStatisticMessage m25847b(C2272g gVar) throws Exception {
        return m25846a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25847b(gVar);
    }

    /* renamed from: a */
    private static FansclubStatisticMessage m25846a(C2272g gVar) throws Exception {
        FansclubStatisticMessage fansclubStatisticMessage = new FansclubStatisticMessage();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fansclubStatisticMessage.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        fansclubStatisticMessage.name = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        fansclubStatisticMessage.fansCount = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fansclubStatisticMessage;
            }
        }
    }
}
