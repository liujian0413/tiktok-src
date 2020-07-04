package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.android.livesdk.message.model.cz */
public final class C8566cz implements C2265b<C8650g> {
    /* renamed from: b */
    private static C8650g m25793b(C2272g gVar) throws Exception {
        return m25792a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25793b(gVar);
    }

    /* renamed from: a */
    private static C8650g m25792a(C2272g gVar) throws Exception {
        C8650g gVar2 = new C8650g();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                String str = null;
                switch (b) {
                    case 1:
                        gVar2.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        gVar2.f23603a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        gVar2.f23604b = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        gVar2.f23607e = C2273h.m9784b(gVar);
                        break;
                    case 8:
                        gVar2.f23608f = C2273h.m9784b(gVar);
                        break;
                    case 9:
                        if (gVar2.f23609g == null) {
                            gVar2.f23609g = new ArrayList();
                        }
                        gVar2.f23609g.add(Long.valueOf(C2273h.m9785c(gVar)));
                        break;
                    case 10:
                        if (gVar2.f23605c == null) {
                            gVar2.f23605c = new LinkedHashMap();
                        }
                        long a2 = gVar.mo8056a();
                        Object obj = null;
                        while (true) {
                            int b2 = gVar.mo8059b();
                            if (b2 != -1) {
                                switch (b2) {
                                    case 1:
                                        str = C2273h.m9787e(gVar);
                                        break;
                                    case 2:
                                        obj = C2273h.m9787e(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo8058a(a2);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    gVar2.f23605c.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 11:
                        if (gVar2.f23606d == null) {
                            gVar2.f23606d = new LinkedHashMap();
                        }
                        long a3 = gVar.mo8056a();
                        Object obj2 = null;
                        while (true) {
                            int b3 = gVar.mo8059b();
                            if (b3 != -1) {
                                switch (b3) {
                                    case 1:
                                        str = C2273h.m9787e(gVar);
                                        break;
                                    case 2:
                                        obj2 = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo8058a(a3);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj2 != null) {
                                    gVar2.f23606d.put(str, obj2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return gVar2;
            }
        }
    }
}
