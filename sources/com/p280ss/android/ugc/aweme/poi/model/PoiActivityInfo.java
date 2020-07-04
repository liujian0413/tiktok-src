package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiActivityInfo */
public class PoiActivityInfo implements Serializable {
    @C6593c(mo15949a = "ad_card")
    private AdCard adCard;
    private int adSrc;
    @C6593c(mo15949a = "coupon")
    private CouponInfo couponInfo;
    @C6593c(mo15949a = "coupon_type")
    private int couponType;

    public AdCard getAdCard() {
        return this.adCard;
    }

    public int getAdSrc() {
        return this.adSrc;
    }

    public CouponInfo getCouponInfo() {
        return this.couponInfo;
    }

    public int getCouponType() {
        return this.couponType;
    }

    public List<AwemeRawAd> getAwemeRawAds() {
        if (this.adCard != null) {
            return this.adCard.getAwemeAds();
        }
        return null;
    }

    public void parseRawData() {
        if (this.adCard != null) {
            this.adCard.parseRawData();
        }
    }

    public void setAdCard(AdCard adCard2) {
        this.adCard = adCard2;
    }

    public void setAdSrc(int i) {
        this.adSrc = i;
    }

    public void setCouponInfo(CouponInfo couponInfo2) {
        this.couponInfo = couponInfo2;
    }

    public void setCouponType(int i) {
        this.couponType = i;
    }

    public void setAwemeRawAds(List<AwemeRawAd> list) {
        if (this.adCard != null) {
            this.adCard.setAwemeRawAds(list);
        }
    }
}
