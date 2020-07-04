package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4864o;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.ew */
public final class C8619ew implements C2265b<C8505bb> {
    /* renamed from: b */
    private static C8505bb m25891b(C2272g gVar) throws Exception {
        return m25890a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25891b(gVar);
    }

    /* renamed from: a */
    private static C8505bb m25890a(C2272g gVar) throws Exception {
        C8505bb bbVar = new C8505bb();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bbVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bbVar.f23302a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        if (bbVar.f23303b == null) {
                            bbVar.f23303b = new ArrayList();
                        }
                        bbVar.f23303b.add(C4864o.m15874a(gVar));
                        break;
                    case 4:
                        bbVar.f23304c = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        bbVar.f23305d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        bbVar.f23306e = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        bbVar.f23307f = C4864o.m15874a(gVar);
                        break;
                    case 8:
                        bbVar.f23308g = C2273h.m9785c(gVar);
                        break;
                    case 9:
                        bbVar.f23309h = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        bbVar.f23310i = C2273h.m9785c(gVar);
                        break;
                    case 12:
                        bbVar.f23311j = C2273h.m9785c(gVar);
                        break;
                    case 13:
                        bbVar.f23312k = C2273h.m9785c(gVar);
                        break;
                    case 14:
                        bbVar.f23313l = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bbVar;
            }
        }
    }
}
