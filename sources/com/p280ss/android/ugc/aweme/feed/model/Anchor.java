package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Anchor */
public final class Anchor implements Serializable {
    @C6593c(mo15949a = "anchor_id")
    public String anchorId;
    @C6593c(mo15949a = "anchor_info")
    public AnchorCommonStruct anchorInfo;
    @C6593c(mo15949a = "business_type")
    public Integer businessType = Integer.valueOf(0);
    @C6593c(mo15949a = "shop_link")
    public AnchorShopLinkStruct shopLinkStruct;
    @C6593c(mo15949a = "show_type")
    public Integer showType = Integer.valueOf(0);
    @C6593c(mo15949a = "wikipedia_info")
    public WikipediaInfo wikipediaInfo;

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final AnchorCommonStruct getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getBusinessType() {
        return this.businessType;
    }

    public final AnchorShopLinkStruct getShopLinkStruct() {
        return this.shopLinkStruct;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final WikipediaInfo getWikipediaInfo() {
        return this.wikipediaInfo;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setAnchorInfo(AnchorCommonStruct anchorCommonStruct) {
        this.anchorInfo = anchorCommonStruct;
    }

    public final void setBusinessType(Integer num) {
        this.businessType = num;
    }

    public final void setShopLinkStruct(AnchorShopLinkStruct anchorShopLinkStruct) {
        this.shopLinkStruct = anchorShopLinkStruct;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public final void setWikipediaInfo(WikipediaInfo wikipediaInfo2) {
        this.wikipediaInfo = wikipediaInfo2;
    }
}
