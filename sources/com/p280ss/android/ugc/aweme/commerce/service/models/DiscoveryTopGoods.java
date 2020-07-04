package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.DiscoveryTopGoods */
public class DiscoveryTopGoods implements Serializable {
    @C6593c(mo15949a = "category")
    private String category;
    @C6593c(mo15949a = "h5_url")
    private String h5Url;
    @C6593c(mo15949a = "promotion_image")
    private UrlModel promotionImage;
    @C6593c(mo15949a = "promotion_title")
    private String promotionTitle;
    @C6593c(mo15949a = "title")
    private String title;

    public String getCategory() {
        return this.category;
    }

    public String getH5Url() {
        return this.h5Url;
    }

    public UrlModel getPromotionImage() {
        return this.promotionImage;
    }

    public String getPromotionTitle() {
        return this.promotionTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setH5Url(String str) {
        this.h5Url = str;
    }

    public void setPromotionImage(UrlModel urlModel) {
        this.promotionImage = urlModel;
    }

    public void setPromotionTitle(String str) {
        this.promotionTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
