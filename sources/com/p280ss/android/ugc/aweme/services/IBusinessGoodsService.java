package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;

/* renamed from: com.ss.android.ugc.aweme.services.IBusinessGoodsService */
public interface IBusinessGoodsService {
    void clearCache();

    BusinessGoodsPublishModel getCurBusinessDraftModel(String str);

    void removeUserSetting(String str);

    void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel);
}
