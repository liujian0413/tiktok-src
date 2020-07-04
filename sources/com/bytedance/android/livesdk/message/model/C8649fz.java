package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.android.livesdk.message.model.fz */
public final class C8649fz implements C2265b<C8539ca> {
    /* renamed from: b */
    private static C8539ca m25951b(C2272g gVar) throws Exception {
        return m25950a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25951b(gVar);
    }

    /* renamed from: a */
    public static C8539ca m25950a(C2272g gVar) throws Exception {
        C8539ca caVar = new C8539ca();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                String str = null;
                switch (b) {
                    case 1:
                        if (caVar.f23488a == null) {
                            caVar.f23488a = new LinkedHashMap();
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
                                    caVar.f23488a.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 2:
                        if (caVar.f23489b == null) {
                            caVar.f23489b = new LinkedHashMap();
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
                                    caVar.f23489b.put(str, obj2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 3:
                        caVar.f23490c = C2273h.m9784b(gVar);
                        break;
                    case 4:
                        caVar.f23491d = C2273h.m9784b(gVar);
                        break;
                    case 5:
                        if (caVar.f23492e == null) {
                            caVar.f23492e = new ArrayList();
                        }
                        caVar.f23492e.add(Long.valueOf(C2273h.m9785c(gVar)));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return caVar;
            }
        }
    }
}
