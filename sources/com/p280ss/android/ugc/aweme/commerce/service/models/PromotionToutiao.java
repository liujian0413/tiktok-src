package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PromotionToutiao */
public final class PromotionToutiao implements Serializable {
    @C6593c(mo15949a = "already_buy")
    private Boolean alreadyBuy = Boolean.valueOf(false);
    @C6593c(mo15949a = "appointment")
    private PromotionAppointment appointment;
    @C6593c(mo15949a = "button")
    private CommerceToutiaoButton button;
    @C6593c(mo15949a = "cart_url")
    private String cartUrl;
    @C6593c(mo15949a = "coupon_rule")
    private List<String> couponRule;
    @C6593c(mo15949a = "delivery_delay_text")
    private String deliveryDelayText;
    @C6593c(mo15949a = "im_url")
    private String imUrl;
    @C6593c(mo15949a = "max_price")
    private int maxPrice;
    @C6593c(mo15949a = "min_price")
    private int minPrice;
    @C6593c(mo15949a = "need_check")
    private Boolean needCheck = Boolean.valueOf(true);
    @C6593c(mo15949a = "order_tma_url")
    private String orderTmaUrl;
    @C6593c(mo15949a = "order_url")
    private String orderUrl;
    @C6593c(mo15949a = "origin_id")
    private String originId;
    @C6593c(mo15949a = "origin_type")
    private String originType;
    @C6593c(mo15949a = "pre_sale")
    private PromotionPreSale preSale;
    @C6593c(mo15949a = "full_reduction")
    private TouTiaoFullReductionInfo reductionInfo;
    @C6593c(mo15949a = "sec_kill_info")
    private SeckillInfo secKillInfo;
    @C6593c(mo15949a = "sku")
    private String skuJsonString;
    @C6593c(mo15949a = "title_prefix")
    private String titlePrefix;
    @C6593c(mo15949a = "virtual_promotion")
    private VirtualPromotionBean virtualPromotion;

    public final Boolean getAlreadyBuy() {
        return this.alreadyBuy;
    }

    public final PromotionAppointment getAppointment() {
        return this.appointment;
    }

    public final CommerceToutiaoButton getButton() {
        return this.button;
    }

    public final String getCartUrl() {
        return this.cartUrl;
    }

    public final List<String> getCouponRule() {
        return this.couponRule;
    }

    public final String getDeliveryDelayText() {
        return this.deliveryDelayText;
    }

    public final String getImUrl() {
        return this.imUrl;
    }

    public final int getMaxPrice() {
        return this.maxPrice;
    }

    public final int getMinPrice() {
        return this.minPrice;
    }

    public final Boolean getNeedCheck() {
        return this.needCheck;
    }

    public final String getOrderTmaUrl() {
        return this.orderTmaUrl;
    }

    public final String getOrderUrl() {
        return this.orderUrl;
    }

    public final String getOriginId() {
        return this.originId;
    }

    public final String getOriginType() {
        return this.originType;
    }

    public final PromotionPreSale getPreSale() {
        return this.preSale;
    }

    public final TouTiaoFullReductionInfo getReductionInfo() {
        return this.reductionInfo;
    }

    public final SeckillInfo getSecKillInfo() {
        return this.secKillInfo;
    }

    public final String getSkuJsonString() {
        return this.skuJsonString;
    }

    public final String getTitlePrefix() {
        return this.titlePrefix;
    }

    public final VirtualPromotionBean getVirtualPromotion() {
        return this.virtualPromotion;
    }

    public final void setAlreadyBuy(Boolean bool) {
        this.alreadyBuy = bool;
    }

    public final void setAppointment(PromotionAppointment promotionAppointment) {
        this.appointment = promotionAppointment;
    }

    public final void setButton(CommerceToutiaoButton commerceToutiaoButton) {
        this.button = commerceToutiaoButton;
    }

    public final void setCartUrl(String str) {
        this.cartUrl = str;
    }

    public final void setCouponRule(List<String> list) {
        this.couponRule = list;
    }

    public final void setDeliveryDelayText(String str) {
        this.deliveryDelayText = str;
    }

    public final void setImUrl(String str) {
        this.imUrl = str;
    }

    public final void setMaxPrice(int i) {
        this.maxPrice = i;
    }

    public final void setMinPrice(int i) {
        this.minPrice = i;
    }

    public final void setNeedCheck(Boolean bool) {
        this.needCheck = bool;
    }

    public final void setOrderTmaUrl(String str) {
        this.orderTmaUrl = str;
    }

    public final void setOrderUrl(String str) {
        this.orderUrl = str;
    }

    public final void setOriginId(String str) {
        this.originId = str;
    }

    public final void setOriginType(String str) {
        this.originType = str;
    }

    public final void setPreSale(PromotionPreSale promotionPreSale) {
        this.preSale = promotionPreSale;
    }

    public final void setReductionInfo(TouTiaoFullReductionInfo touTiaoFullReductionInfo) {
        this.reductionInfo = touTiaoFullReductionInfo;
    }

    public final void setSecKillInfo(SeckillInfo seckillInfo) {
        this.secKillInfo = seckillInfo;
    }

    public final void setSkuJsonString(String str) {
        this.skuJsonString = str;
    }

    public final void setTitlePrefix(String str) {
        this.titlePrefix = str;
    }

    public final void setVirtualPromotion(VirtualPromotionBean virtualPromotionBean) {
        this.virtualPromotion = virtualPromotionBean;
    }
}
