package com.p280ss.android.ugc.aweme.commerce.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.SimplePromotion */
public final class SimplePromotion extends C24430a implements Serializable {
    @C6593c(mo15949a = "card_url")
    private String cardUrl = "";
    @C6593c(mo15949a = "elastic_images")
    private List<? extends UrlModel> elasticImages = C7525m.m23461a();
    @C6593c(mo15949a = "elastic_title")
    private String elasticTitle = "";
    @C6593c(mo15949a = "label")
    private List<String> labels = C7525m.m23461a();
    @C6593c(mo15949a = "price")
    private int price;
    @C6593c(mo15949a = "product_id")
    private String productId = "";
    @C6593c(mo15949a = "promotion_id")
    private String promotionId = "";
    @C6593c(mo15949a = "promotion_source")
    private int promotionSource;
    @C6593c(mo15949a = "sales")
    private int sales;
    @C6593c(mo15949a = "title")
    private String title = "";
    @C6593c(mo15949a = "visitor")
    private PromotionVisitor visitor;

    public final String getCardUrl() {
        return this.cardUrl;
    }

    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    public final String getElasticTitle() {
        return this.elasticTitle;
    }

    public final List<String> getLabels() {
        return this.labels;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final int getPromotionSource() {
        return this.promotionSource;
    }

    public final int getSales() {
        return this.sales;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PromotionVisitor getVisitor() {
        return this.visitor;
    }

    public final String getLongTitle() {
        if (!TextUtils.isEmpty(this.title)) {
            return this.title;
        }
        return this.elasticTitle;
    }

    public final String getShortTitle() {
        if (TextUtils.isEmpty(this.elasticTitle)) {
            return this.title;
        }
        return this.elasticTitle;
    }

    public final void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setElasticTitle(String str) {
        this.elasticTitle = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(int i) {
        this.promotionSource = i;
    }

    public final void setSales(int i) {
        this.sales = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.visitor = promotionVisitor;
    }

    public final void setLabels(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.labels = list;
    }
}
