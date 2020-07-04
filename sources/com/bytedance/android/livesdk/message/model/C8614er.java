package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.android.livesdk.message.model.er */
public final class C8614er implements C2265b<C8499ay> {
    /* renamed from: b */
    private static C8499ay m25881b(C2272g gVar) throws Exception {
        return m25880a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25881b(gVar);
    }

    /* renamed from: a */
    private static C8499ay m25880a(C2272g gVar) throws Exception {
        C8499ay ayVar = new C8499ay();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ayVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (ayVar.f23290b == null) {
                            ayVar.f23290b = new LinkedHashMap();
                        }
                        long a2 = gVar.mo8056a();
                        Long l = null;
                        Object obj = null;
                        while (true) {
                            int b2 = gVar.mo8059b();
                            if (b2 != -1) {
                                switch (b2) {
                                    case 1:
                                        l = Long.valueOf(C2273h.m9785c(gVar));
                                        break;
                                    case 2:
                                        obj = C8615es.m25882a(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo8058a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    ayVar.f23290b.put(l, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 3:
                        if (ayVar.f23291c == null) {
                            ayVar.f23291c = new ArrayList();
                        }
                        ayVar.f23291c.add(C8615es.m25882a(gVar));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                ayVar.mo21653a();
                return ayVar;
            }
        }
    }
}
