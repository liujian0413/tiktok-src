package com.p280ss.android.ugc.aweme.commercialize;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct;
import com.p280ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.d */
public final class C24610d implements C40231c {
    /* renamed from: a */
    public final void mo64276a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(photoContext, "photoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        C25006o a = C25006o.m82323a(photoContext);
        C7573i.m23582a((Object) a, "commercePublishModel");
        ShopOrderShareStructInfo shopOrderShareStructInfo = a.f65943f;
        if (shopOrderShareStructInfo != null) {
            ShopOrderShareStruct shopOrderShareStruct = shopOrderShareStructInfo.getShopOrderShareStruct();
            if (shopOrderShareStruct != null) {
                String b = C10944e.m32113a().mo15979b((Object) shopOrderShareStruct);
                C7573i.m23582a((Object) b, "Network.getGson().toJson(it)");
                linkedHashMap.put("shop_order_share", b);
            }
        }
    }

    /* renamed from: a */
    public final void mo64277a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(baseShortVideoContext, "videoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        C25006o a = C25006o.m82324a(baseShortVideoContext);
        C7573i.m23582a((Object) a, "commercePublishModel");
        ShopOrderShareStructInfo shopOrderShareStructInfo = a.f65943f;
        if (shopOrderShareStructInfo != null) {
            ShopOrderShareStruct shopOrderShareStruct = shopOrderShareStructInfo.getShopOrderShareStruct();
            if (shopOrderShareStruct != null) {
                String b = C10944e.m32113a().mo15979b((Object) shopOrderShareStruct);
                C7573i.m23582a((Object) b, "Network.getGson().toJson(it)");
                linkedHashMap.put("shop_order_share", b);
            }
        }
    }
}
