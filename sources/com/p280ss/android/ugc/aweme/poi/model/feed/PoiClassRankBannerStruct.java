package com.p280ss.android.ugc.aweme.poi.model.feed;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct */
public class PoiClassRankBannerStruct implements Serializable {
    @C6593c(mo15949a = "banner_url")
    UrlModel bannerUrl;
    @C6593c(mo15949a = "bid")
    String bid;
    @C6593c(mo15949a = "business_area_option")
    PoiOptionStruct businessAreaOption;
    @C6593c(mo15949a = "class_option")
    PoiOptionStruct classOption;
    @C6593c(mo15949a = "description")
    String description;
    @C6593c(mo15949a = "district_code")
    String districtCode;
    @C6593c(mo15949a = "explanation")
    String explanation;
    @C6593c(mo15949a = "height")
    int height;
    @C6593c(mo15949a = "notch_banner_url")
    UrlModel notchBannerUrl;
    @C6593c(mo15949a = "schema")
    String schema;
    @C6593c(mo15949a = "tag_list")
    List<C35112b> tags;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "width")
    int width;

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public PoiOptionStruct getBusinessAreaOption() {
        return this.businessAreaOption;
    }

    public PoiOptionStruct getClassOption() {
        return this.classOption;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDistrictCode() {
        return this.districtCode;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public int getHeight() {
        return this.height;
    }

    public UrlModel getNotchBannerUrl() {
        return this.notchBannerUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public String getTag() {
        if (C6307b.m19566a((Collection<T>) this.tags)) {
            return "";
        }
        return ((C35112b) this.tags.get(0)).f91843a;
    }

    public void updateSchema(String str) {
        this.schema = str;
    }
}
