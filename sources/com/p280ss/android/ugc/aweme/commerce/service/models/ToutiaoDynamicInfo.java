package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.ToutiaoDynamicInfo */
public final class ToutiaoDynamicInfo implements Serializable {
    @C6593c(mo15949a = "already_buy")
    private boolean alreadyBuy;
    @C6593c(mo15949a = "button")
    private CommerceToutiaoButton button;
    @C6593c(mo15949a = "seckill_info")
    private SeckillInfo seckillInfo;
    @C6593c(mo15949a = "status_code")
    private Integer statusCode = Integer.valueOf(0);
    @C6593c(mo15949a = "virtual_promotion")
    private VirtualPromotionBean virtualPromotion;

    public final boolean getAlreadyBuy() {
        return this.alreadyBuy;
    }

    public final CommerceToutiaoButton getButton() {
        return this.button;
    }

    public final SeckillInfo getSeckillInfo() {
        return this.seckillInfo;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final VirtualPromotionBean getVirtualPromotion() {
        return this.virtualPromotion;
    }

    public final void setAlreadyBuy(boolean z) {
        this.alreadyBuy = z;
    }

    public final void setButton(CommerceToutiaoButton commerceToutiaoButton) {
        this.button = commerceToutiaoButton;
    }

    public final void setSeckillInfo(SeckillInfo seckillInfo2) {
        this.seckillInfo = seckillInfo2;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setVirtualPromotion(VirtualPromotionBean virtualPromotionBean) {
        this.virtualPromotion = virtualPromotionBean;
    }
}
