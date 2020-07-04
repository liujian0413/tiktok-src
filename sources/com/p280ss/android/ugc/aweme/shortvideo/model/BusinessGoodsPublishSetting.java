package com.p280ss.android.ugc.aweme.shortvideo.model;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting */
public class BusinessGoodsPublishSetting implements Serializable {
    private List<BusinessGoodsPublishModel> goodsPublishModels;
    private String userId;

    public List<BusinessGoodsPublishModel> getGoodsPublishModels() {
        return this.goodsPublishModels;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        if (this.userId != null) {
            return this.userId.hashCode();
        }
        return 0;
    }

    public void setGoodsPublishModels(List<BusinessGoodsPublishModel> list) {
        this.goodsPublishModels = list;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessGoodsPublishSetting businessGoodsPublishSetting = (BusinessGoodsPublishSetting) obj;
        if (this.userId != null) {
            return this.userId.equals(businessGoodsPublishSetting.userId);
        }
        if (businessGoodsPublishSetting.userId == null) {
            return true;
        }
        return false;
    }
}
