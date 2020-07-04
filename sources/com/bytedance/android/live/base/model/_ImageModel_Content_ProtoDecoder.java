package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.ImageModel.Content;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _ImageModel_Content_ProtoDecoder implements C2265b<Content> {
    public final Content decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static Content decodeStatic(C2272g gVar) throws Exception {
        Content content = new Content();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        content.f7648a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        content.f7649b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        content.f7650c = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return content;
            }
        }
    }
}
