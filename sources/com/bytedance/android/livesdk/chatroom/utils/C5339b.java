package com.bytedance.android.livesdk.chatroom.utils;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7876i;
import com.p280ss.ugc.live.gift.resource.C46220c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.b */
public final class C5339b {
    /* renamed from: a */
    public static C46220c m17015a(AssetsModel assetsModel) {
        return m17016a(assetsModel, 0);
    }

    /* renamed from: b */
    private static boolean m17017b(AssetsModel assetsModel) {
        if (assetsModel == null || TextUtils.isEmpty(assetsModel.getMD5())) {
            return false;
        }
        C7876i resourceModel = assetsModel.getResourceModel();
        if (resourceModel == null) {
            return false;
        }
        List<String> list = resourceModel.f21274b;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C46220c m17016a(AssetsModel assetsModel, int i) {
        if (!m17017b(assetsModel)) {
            return null;
        }
        C7876i resourceModel = assetsModel.getResourceModel();
        String[] strArr = new String[resourceModel.f21274b.size()];
        resourceModel.f21274b.toArray(strArr);
        C46220c cVar = new C46220c(assetsModel.getId(), strArr, assetsModel.getMD5(), (long) i, true);
        return cVar;
    }
}
