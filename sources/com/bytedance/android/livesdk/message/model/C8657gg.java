package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra.Background;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.gg */
public final class C8657gg implements C2265b<Background> {
    /* renamed from: b */
    private static Background m25965b(C2272g gVar) throws Exception {
        return m25964a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25965b(gVar);
    }

    /* renamed from: a */
    public static Background m25964a(C2272g gVar) throws Exception {
        Background background = new Background();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        background.width = C2273h.m9784b(gVar);
                        break;
                    case 2:
                        background.height = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        if (background.mUrls == null) {
                            background.mUrls = new ArrayList();
                        }
                        background.mUrls.add(C2273h.m9787e(gVar));
                        break;
                    case 4:
                        background.mUri = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return background;
            }
        }
    }
}
