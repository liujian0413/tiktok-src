package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.dj */
public final class C8577dj implements C2265b<C8683p> {
    /* renamed from: b */
    private static C8683p m25813b(C2272g gVar) throws Exception {
        return m25812a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25813b(gVar);
    }

    /* renamed from: a */
    private static C8683p m25812a(C2272g gVar) throws Exception {
        C8683p pVar = new C8683p();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        pVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        pVar.f23639a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        pVar.f23640b = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        if (pVar.f23641c == null) {
                            pVar.f23641c = new ArrayList();
                        }
                        pVar.f23641c.add(C8576di.m25810a(gVar));
                        break;
                    case 5:
                        pVar.f23642d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        pVar.f23643e = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        pVar.f23644f = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        pVar.f23645g = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        pVar.f23646h = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return pVar;
            }
        }
    }
}
