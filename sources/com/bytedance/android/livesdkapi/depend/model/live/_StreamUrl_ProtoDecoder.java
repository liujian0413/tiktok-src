package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class _StreamUrl_ProtoDecoder implements C2265b<StreamUrl> {
    public final StreamUrl decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static StreamUrl decodeStatic(C2272g gVar) throws Exception {
        StreamUrl streamUrl = new StreamUrl();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                String str = null;
                switch (b) {
                    case 1:
                        streamUrl.f25604c = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        streamUrl.f25602a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        streamUrl.f25603b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        if (streamUrl.f25609h == null) {
                            streamUrl.f25609h = new LinkedHashMap();
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
                                    streamUrl.f25609h.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 5:
                        streamUrl.f25612k = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        streamUrl.f25613l = _StreamUrlExtra_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        streamUrl.f25605d = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        streamUrl.f25607f = C2273h.m9787e(gVar);
                        break;
                    case 9:
                        if (streamUrl.f25608g == null) {
                            streamUrl.f25608g = new LinkedHashMap();
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
                                        obj2 = C2273h.m9787e(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo8058a(a3);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj2 != null) {
                                    streamUrl.f25608g.put(str, obj2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 10:
                        if (streamUrl.f25611j == null) {
                            streamUrl.f25611j = new ArrayList();
                        }
                        streamUrl.f25611j.add(C2273h.m9787e(gVar));
                        break;
                    case 13:
                        streamUrl.f25614m = C2273h.m9787e(gVar);
                        break;
                    case 14:
                        if (streamUrl.f25610i == null) {
                            streamUrl.f25610i = new LinkedHashMap();
                        }
                        long a4 = gVar.mo8056a();
                        Object obj3 = null;
                        while (true) {
                            int b4 = gVar.mo8059b();
                            if (b4 != -1) {
                                switch (b4) {
                                    case 1:
                                        str = C2273h.m9787e(gVar);
                                        break;
                                    case 2:
                                        obj3 = C2273h.m9787e(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo8058a(a4);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj3 != null) {
                                    streamUrl.f25610i.put(str, obj3);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 15:
                        streamUrl.f25615n = C2273h.m9787e(gVar);
                        break;
                    case 16:
                        if (streamUrl.f25606e == null) {
                            streamUrl.f25606e = new ArrayList();
                        }
                        streamUrl.f25606e.add(C2273h.m9787e(gVar));
                        break;
                    case 17:
                        streamUrl.f25616o = _LiveCoreSDKData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return streamUrl;
            }
        }
    }
}
