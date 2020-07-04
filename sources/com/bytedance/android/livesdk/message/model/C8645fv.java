package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fv */
public final class C8645fv implements C2265b<C8531bu> {
    /* renamed from: b */
    private static C8531bu m25943b(C2272g gVar) throws Exception {
        return m25942a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25943b(gVar);
    }

    /* renamed from: a */
    private static C8531bu m25942a(C2272g gVar) throws Exception {
        C8531bu buVar = new C8531bu();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        buVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (buVar.f23456a == null) {
                            buVar.f23456a = new ArrayList();
                        }
                        buVar.f23456a.add(C8644fu.m25940a(gVar));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return buVar;
            }
        }
    }
}
