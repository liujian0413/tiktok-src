package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo */
public class BlueVBrandInfo implements Serializable {
    @C6593c(mo15949a = "brand_id")
    public int brandId;
    @C6593c(mo15949a = "brand_name")
    public String brandName;
    @C6593c(mo15949a = "category_id")
    public int categoryId;
    @C6593c(mo15949a = "category_name")
    public String categoryName;
    @C6593c(mo15949a = "heat")
    public long heat;
    @C6593c(mo15949a = "logo_url")
    public UrlModel logoUrl;
    @C6593c(mo15949a = "rank")
    public int rank;
    @C6593c(mo15949a = "rank_diff")
    public int rankDiff;
    @C6593c(mo15949a = "tag_name")
    public String tagName;

    public int getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public long getHeat() {
        return this.heat;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setBrandId(int i) {
        this.brandId = i;
    }

    public void setBrandName(String str) {
        this.brandName = str;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setHeat(long j) {
        this.heat = j;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }
}
