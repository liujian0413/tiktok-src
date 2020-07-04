package com.bytedance.android.live.base.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _ImageModel_ProtoDecoder implements C2265b<ImageModel> {
    public final ImageModel decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static ImageModel decodeStatic(C2272g gVar) throws Exception {
        ImageModel imageModel = new ImageModel();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (imageModel.mUrls == null) {
                            imageModel.mUrls = new ArrayList();
                        }
                        imageModel.mUrls.add(C2273h.m9787e(gVar));
                        break;
                    case 2:
                        imageModel.mUri = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        imageModel.height = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        imageModel.width = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        imageModel.avgColor = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        imageModel.imageType = C2273h.m9784b(gVar);
                        break;
                    case 7:
                        imageModel.schema = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        imageModel.content = _ImageModel_Content_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        imageModel.isAnimated = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return imageModel;
            }
        }
    }
}
