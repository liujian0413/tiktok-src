package com.bytedance.android.live.network.response.p167a;

import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.io.IOException;

/* renamed from: com.bytedance.android.live.network.response.a.a */
public final class C3475a {

    /* renamed from: a */
    public int f10299a;

    /* renamed from: b */
    public String f10300b;

    /* renamed from: c */
    public String f10301c;

    /* renamed from: d */
    public String f10302d;

    /* renamed from: e */
    public long f10303e;

    private C3475a() {
    }

    /* renamed from: a */
    static C3475a m12839a(C2272g gVar) throws IOException {
        C3475a aVar = new C3475a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f10299a = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        aVar.f10300b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        aVar.f10301c = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        aVar.f10302d = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        aVar.f10303e = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                if (aVar.f10299a == -1) {
                    throw new IOException("Invalid protobuf data: missing header.statusCode!");
                } else if (aVar.f10303e != -1) {
                    return aVar;
                } else {
                    throw new IOException("Invalid protobuf data: missing header.now!");
                }
            }
        }
    }
}
