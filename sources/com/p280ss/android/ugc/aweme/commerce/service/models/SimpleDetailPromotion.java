package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.SimpleDetailPromotion */
public final class SimpleDetailPromotion extends BaseDetailPromotion {
    @C6593c(mo15949a = "goods_source")
    private String goodsSource = "";
    @C6593c(mo15949a = "last_aweme_id")
    private String lastAwemeId = "";
    @C6593c(mo15949a = "third_platform")
    private C24488f thirdCoupon;

    public final String getGoodsSource() {
        return this.goodsSource;
    }

    public final String getLastAwemeId() {
        return this.lastAwemeId;
    }

    public final C24488f getThirdCoupon() {
        return this.thirdCoupon;
    }

    public final void setGoodsSource(String str) {
        this.goodsSource = str;
    }

    public final void setLastAwemeId(String str) {
        this.lastAwemeId = str;
    }

    public final void setThirdCoupon(C24488f fVar) {
        this.thirdCoupon = fVar;
    }
}
