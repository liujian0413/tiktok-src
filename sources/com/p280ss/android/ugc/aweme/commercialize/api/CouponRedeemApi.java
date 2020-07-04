package com.p280ss.android.ugc.aweme.commercialize.api;

import com.google.common.util.concurrent.C18253l;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.C23268a;
import com.p280ss.android.ugc.aweme.base.api.C6891b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Serializable;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi */
public class CouponRedeemApi {

    /* renamed from: a */
    private static RetroApi f64783a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetail */
    public static class CouponDetail extends C23268a implements Serializable {
        @C6891b
        @C6593c(mo15949a = "user_avatar")
        public UrlModel avatar;
        @C6593c(mo15949a = "coupon_type")
        public int couponType;
        @C6891b
        @C6593c(mo15949a = "head_image_url")
        public UrlModel headImage;
        @C6891b
        @C6593c(mo15949a = "merchant_name")
        public String merchantName;
        @C6891b
        @C6593c(mo15949a = "title")
        public String title;
        @C6891b
        @C6593c(mo15949a = "username")
        public String username;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse */
    public static class CouponDetailApiResponse implements Serializable {
        @C6593c(mo15949a = "coupon")
        public CouponDetail coupon;
        @C6593c(mo15949a = "status_code")
        public int statusCode;
        @C6593c(mo15949a = "status_msg")
        public String statusMsg;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponRedeemApiResponse */
    public static class CouponRedeemApiResponse implements Serializable {
        @C6593c(mo15949a = "status_code")
        public int statusCode;
        @C6593c(mo15949a = "status_msg")
        public String statusMsg;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$RetroApi */
    public interface RetroApi {
        @C7730f(mo20420a = "/aweme/v2/coupon/qrcode/detail/")
        C18253l<CouponDetailApiResponse> getCouponDetail(@C7744t(mo20436a = "code_id") String str, @C7744t(mo20436a = "source") int i);

        @C7730f(mo20420a = "/aweme/v2/coupon/validate/")
        C18253l<CouponRedeemApiResponse> redeemCoupon(@C7744t(mo20436a = "code_id") String str);
    }

    /* renamed from: a */
    private static RetroApi m80561a() {
        if (f64783a == null) {
            synchronized (CouponRedeemApi.class) {
                if (f64783a == null) {
                    f64783a = (RetroApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RetroApi.class);
                }
            }
        }
        return f64783a;
    }

    /* renamed from: a */
    public static C18253l<CouponRedeemApiResponse> m80559a(String str) {
        return m80561a().redeemCoupon(str);
    }

    /* renamed from: a */
    public static C18253l<CouponDetailApiResponse> m80560a(String str, int i) {
        return m80561a().getCouponDetail(str, i);
    }
}
