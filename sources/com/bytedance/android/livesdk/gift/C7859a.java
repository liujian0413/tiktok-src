package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9456c.C9458b;

/* renamed from: com.bytedance.android.livesdk.gift.a */
public final class C7859a {
    /* renamed from: a */
    public static String m24102a(long j) {
        C8149d findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById == null) {
            return "";
        }
        ImageModel imageModel = findGiftById.f22231b;
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() <= 0) {
            return "";
        }
        return ((C9456c) C3596c.m13172a(C9456c.class)).mo23197b((String) imageModel.getUrls().get(0));
    }

    /* renamed from: b */
    public static void m24104b(long j) {
        C8149d findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById != null) {
            ImageModel imageModel = findGiftById.f22231b;
            if (!(imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() <= 0)) {
                ((C9456c) C3596c.m13172a(C9456c.class)).mo23193a((String) imageModel.getUrls().get(0));
            }
        }
    }

    /* renamed from: a */
    public static void m24103a(long j, C9458b bVar) {
        C8149d findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById == null || findGiftById.f22231b == null || findGiftById.f22231b.getUrls() == null || findGiftById.f22231b.getUrls().isEmpty()) {
            bVar.mo21638c();
            return;
        }
        ((C9456c) C3596c.m13172a(C9456c.class)).mo23194a((String) findGiftById.f22231b.getUrls().get(0), bVar);
    }
}
