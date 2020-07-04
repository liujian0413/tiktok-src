package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.de */
public final class C8572de implements C2265b<C8679l> {
    /* renamed from: b */
    private static C8679l m25803b(C2272g gVar) throws Exception {
        return m25802a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25803b(gVar);
    }

    /* renamed from: a */
    private static C8679l m25802a(C2272g gVar) throws Exception {
        C8679l lVar = new C8679l();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (lVar.f23622a == null) {
                            lVar.f23622a = new ArrayList();
                        }
                        lVar.f23622a.add(C8669gs.m25988a(gVar));
                        break;
                    case 3:
                        lVar.f23623b = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return lVar;
            }
        }
    }
}
