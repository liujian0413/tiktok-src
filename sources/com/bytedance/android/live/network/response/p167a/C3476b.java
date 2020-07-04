package com.bytedance.android.live.network.response.p167a;

import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import com.google.gson.p276a.C6593c;
import java.io.IOException;

/* renamed from: com.bytedance.android.live.network.response.a.b */
public final class C3476b {
    @C6593c(mo15949a = "header")

    /* renamed from: a */
    public C3475a f10304a;
    @C6593c(mo15949a = "body")

    /* renamed from: b */
    public byte[] f10305b;

    private C3476b() {
    }

    /* renamed from: a */
    public static C3476b m12840a(C2272g gVar) throws IOException {
        C3476b bVar = new C3476b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f10304a = C3475a.m12839a(gVar);
                        break;
                    case 2:
                        bVar.f10305b = C2273h.m9788f(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                if (bVar.f10304a != null && (bVar.f10304a.f10299a != 0 || bVar.f10305b != null)) {
                    return bVar;
                }
                throw new IOException("Invalid protobuf data: response.body is null!");
            }
        }
    }
}
