package com.bytedance.android.live.base.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _CateCell_ProtoDecoder implements C2265b<C2335b> {
    public final C2335b decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2335b decodeStatic(C2272g gVar) throws Exception {
        C2335b bVar = new C2335b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return bVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                if (bVar.f7656a == null) {
                    bVar.f7656a = new ArrayList();
                }
                bVar.f7656a.add(_Category_ProtoDecoder.decodeStatic(gVar));
            }
        }
    }
}
