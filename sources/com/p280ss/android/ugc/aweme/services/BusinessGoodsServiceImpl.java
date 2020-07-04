package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41556j;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessGoodsServiceImpl */
public final class BusinessGoodsServiceImpl implements IBusinessGoodsService {
    public final void clearCache() {
        C41556j.m132334a();
    }

    public final BusinessGoodsPublishModel getCurBusinessDraftModel(String str) {
        C7573i.m23587b(str, "videoPath");
        BusinessGoodsPublishModel b = C41556j.m132338b(str);
        C7573i.m23582a((Object) b, "BusinessGoodsDraftInfoPr…nessDraftModel(videoPath)");
        return b;
    }

    public final void removeUserSetting(String str) {
        C7573i.m23587b(str, "videoPath");
        C41556j.m132337a(str);
    }

    public final void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel) {
        C7573i.m23587b(businessGoodsPublishModel, "model");
        C41556j.m132335a(businessGoodsPublishModel);
    }
}
