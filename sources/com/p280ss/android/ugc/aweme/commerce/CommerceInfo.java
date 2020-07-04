package com.p280ss.android.ugc.aweme.commerce;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.CommerceInfo */
public class CommerceInfo implements Serializable {
    @C6593c(mo15949a = "challenge_list")
    public List<Challenge> challengeList;
    @C6593c(mo15949a = "head_image_url")
    public UrlModel headImageUrl;
    @C6593c(mo15949a = "offline_info_list")
    public List<OfflineInfo> offlineInfoList;
    @C6593c(mo15949a = "quick_shop_name")
    public String quickShopName;
    @C6593c(mo15949a = "quick_shop_url")
    public String quickShopUrl;
    @C6593c(mo15949a = "site_id")
    public String siteId;
    @C6593c(mo15949a = "smart_phone")
    public SmartPhone smartPhone;

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public List<OfflineInfo> getOfflineInfoList() {
        return this.offlineInfoList;
    }

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public SmartPhone getSmartPhone() {
        return this.smartPhone;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setOfflineInfoList(List<OfflineInfo> list) {
        this.offlineInfoList = list;
    }

    public void setSmartPhone(SmartPhone smartPhone2) {
        this.smartPhone = smartPhone2;
    }
}
