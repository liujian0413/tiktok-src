package com.bytedance.android.live.base.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _FlexImageModel_ProtoDecoder implements C2265b<FlexImageModel> {
    public final FlexImageModel decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FlexImageModel decodeStatic(C2272g gVar) throws Exception {
        FlexImageModel flexImageModel = new FlexImageModel();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (flexImageModel.mUrls == null) {
                            flexImageModel.mUrls = new ArrayList();
                        }
                        flexImageModel.mUrls.add(C2273h.m9787e(gVar));
                        break;
                    case 2:
                        flexImageModel.mUri = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return flexImageModel;
            }
        }
    }
}
