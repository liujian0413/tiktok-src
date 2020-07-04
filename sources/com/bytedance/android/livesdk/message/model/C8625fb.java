package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fb */
public final class C8625fb implements C2265b<C8511bg> {
    /* renamed from: b */
    private static C8511bg m25903b(C2272g gVar) throws Exception {
        return m25902a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25903b(gVar);
    }

    /* renamed from: a */
    private static C8511bg m25902a(C2272g gVar) throws Exception {
        C8511bg bgVar = new C8511bg();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bgVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bgVar.f23356b = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        bgVar.f23355a = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        if (bgVar.f23357c == null) {
                            bgVar.f23357c = new ArrayList();
                        }
                        bgVar.f23357c.add(Long.valueOf(C2273h.m9785c(gVar)));
                        break;
                    case 5:
                        bgVar.f23359e = C2273h.m9784b(gVar);
                        break;
                    case 6:
                        bgVar.f23360f = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        if (bgVar.f23358d == null) {
                            bgVar.f23358d = new ArrayList();
                        }
                        bgVar.f23358d.add(C2273h.m9787e(gVar));
                        break;
                    case 8:
                        bgVar.f23361g = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bgVar;
            }
        }
    }
}
