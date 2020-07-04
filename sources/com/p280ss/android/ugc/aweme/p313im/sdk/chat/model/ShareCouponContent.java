package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage.C31820a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCouponContent */
public class ShareCouponContent extends BaseContent {
    @C6593c(mo15949a = "activity_id")
    private String activityId;
    @C6593c(mo15949a = "coupon_desc")
    private String couponDesc;
    @C6593c(mo15949a = "coupon_id")
    private String couponId;
    @C6593c(mo15949a = "merchant_icon_url")
    private UrlModel merchantIconUrl;
    @C6593c(mo15949a = "poi_id")
    private String poiId;
    @C6593c(mo15949a = "poi_name")
    private String poiName;

    public String getActivityId() {
        return this.activityId;
    }

    public String getCouponDesc() {
        return this.couponDesc;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public UrlModel getMerchantIconUrl() {
        return this.merchantIconUrl;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getMsgHint() {
        return C6399b.m19921a().getResources().getString(R.string.bo2, new Object[]{this.poiName});
    }

    public SharePackage generateSharePackage() {
        SharePackage a = new C31820a().mo18868d("coupon").mo18871g(this.couponDesc).mo18866a();
        Bundle bundle = a.f20186l;
        bundle.putSerializable("video_cover", this.merchantIconUrl);
        bundle.putString("share_text", C1642a.m8034a(C6399b.m19921a().getResources().getString(R.string.aia), new Object[]{this.poiName, this.couponDesc}));
        return a;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setCouponDesc(String str) {
        this.couponDesc = str;
    }

    public void setCouponId(String str) {
        this.couponId = str;
    }

    public void setMerchantIconUrl(UrlModel urlModel) {
        this.merchantIconUrl = urlModel;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public static ShareCouponContent fromSharePackage(SharePackage sharePackage) {
        ShareCouponContent shareCouponContent = new ShareCouponContent();
        Serializable serializable = sharePackage.f20186l.getSerializable("video_cover");
        String string = sharePackage.f20186l.getString("poi_id");
        String string2 = sharePackage.f20186l.getString("poi_name");
        String string3 = sharePackage.f20186l.getString("activity_id");
        String string4 = sharePackage.f20186l.getString("coupon_desc");
        String string5 = sharePackage.f20186l.getString("coupon_id");
        if (serializable instanceof UrlModel) {
            shareCouponContent.merchantIconUrl = (UrlModel) serializable;
        }
        shareCouponContent.poiId = string;
        shareCouponContent.poiName = string2;
        shareCouponContent.activityId = string3;
        shareCouponContent.couponDesc = string4;
        shareCouponContent.couponId = string5;
        return shareCouponContent;
    }
}
