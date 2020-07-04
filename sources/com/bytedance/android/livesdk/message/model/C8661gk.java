package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.gk */
public final class C8661gk implements C2265b<C8546ch> {
    /* renamed from: b */
    private static C8546ch m25973b(C2272g gVar) throws Exception {
        return m25972a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25973b(gVar);
    }

    /* renamed from: a */
    private static C8546ch m25972a(C2272g gVar) throws Exception {
        C8546ch chVar = new C8546ch();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        chVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (chVar.f23536b == null) {
                            chVar.f23536b = new ArrayList();
                        }
                        chVar.f23536b.add(C8580dm.m25818a(gVar));
                        break;
                    case 3:
                        chVar.f23535a = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        chVar.f23537c = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        if (chVar.f23538d == null) {
                            chVar.f23538d = new ArrayList();
                        }
                        chVar.f23538d.add(C8580dm.m25818a(gVar));
                        break;
                    case 6:
                        chVar.f23539e = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return chVar;
            }
        }
    }
}
