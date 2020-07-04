package com.p280ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.collections.C7525m;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.DetailPromotion */
public final class DetailPromotion extends BaseDetailPromotion {
    @C6593c(mo15949a = "activity")
    private PromotionActivity activity;
    @C6593c(mo15949a = "buy_button")
    private C24484b buyBtn;
    @C6593c(mo15949a = "consumer_comment")
    private List<String> consumerComment;
    @C6593c(mo15949a = "apply_coupon_button")
    private C24484b couponBuyBtn;
    @C6593c(mo15949a = "has_gyl")
    private Boolean hasGuessULike = Boolean.valueOf(true);
    @C6593c(mo15949a = "marketing_floors")
    private List<PromotionMarketFloor> marketFloors = C7525m.m23461a();
    @C6593c(mo15949a = "module_control")
    private C24486d moduleControl;
    @C6593c(mo15949a = "origin_media_id")
    private String originMediaId = "";
    @C6593c(mo15949a = "origin_user_id")
    private String originUserId = "";
    @C6593c(mo15949a = "price_tag")
    private String priceTag;
    @C6593c(mo15949a = "rank")
    private int rank;
    @C6593c(mo15949a = "rank_text")
    private String rankText = "";
    @C6593c(mo15949a = "rank_url")
    private String rankUrl = "";
    @C6593c(mo15949a = "sec_origin_user_id")
    private String secOriginUserId = "";
    @C6593c(mo15949a = "third_platform")
    private C24488f thirdCoupon;

    public final PromotionActivity getActivity() {
        return this.activity;
    }

    public final C24484b getBuyBtn() {
        return this.buyBtn;
    }

    public final List<String> getConsumerComment() {
        return this.consumerComment;
    }

    public final C24484b getCouponBuyBtn() {
        return this.couponBuyBtn;
    }

    public final Boolean getHasGuessULike() {
        return this.hasGuessULike;
    }

    public final List<PromotionMarketFloor> getMarketFloors() {
        return this.marketFloors;
    }

    public final C24486d getModuleControl() {
        return this.moduleControl;
    }

    public final String getOriginMediaId() {
        return this.originMediaId;
    }

    public final String getOriginUserId() {
        return this.originUserId;
    }

    public final String getPriceTag() {
        return this.priceTag;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getRankText() {
        return this.rankText;
    }

    public final String getRankUrl() {
        return this.rankUrl;
    }

    public final String getSecOriginUserId() {
        return this.secOriginUserId;
    }

    public final C24488f getThirdCoupon() {
        return this.thirdCoupon;
    }

    public final boolean hasGoodRankInfo() {
        List<PromotionMarketFloor> list = this.marketFloors;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean isSelf() {
        return TextUtils.isEmpty(this.originUserId);
    }

    public final void setActivity(PromotionActivity promotionActivity) {
        this.activity = promotionActivity;
    }

    public final void setBuyBtn(C24484b bVar) {
        this.buyBtn = bVar;
    }

    public final void setConsumerComment(List<String> list) {
        this.consumerComment = list;
    }

    public final void setCouponBuyBtn(C24484b bVar) {
        this.couponBuyBtn = bVar;
    }

    public final void setHasGuessULike(Boolean bool) {
        this.hasGuessULike = bool;
    }

    public final void setMarketFloors(List<PromotionMarketFloor> list) {
        this.marketFloors = list;
    }

    public final void setModuleControl(C24486d dVar) {
        this.moduleControl = dVar;
    }

    public final void setOriginMediaId(String str) {
        this.originMediaId = str;
    }

    public final void setOriginUserId(String str) {
        this.originUserId = str;
    }

    public final void setPriceTag(String str) {
        this.priceTag = str;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setRankText(String str) {
        this.rankText = str;
    }

    public final void setRankUrl(String str) {
        this.rankUrl = str;
    }

    public final void setSecOriginUserId(String str) {
        this.secOriginUserId = str;
    }

    public final void setThirdCoupon(C24488f fVar) {
        this.thirdCoupon = fVar;
    }
}
