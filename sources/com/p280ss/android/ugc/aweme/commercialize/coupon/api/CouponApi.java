package com.p280ss.android.ugc.aweme.commercialize.coupon.api;

import android.arch.lifecycle.C0052o;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.C24593a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.C24594b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi */
public final class CouponApi {

    /* renamed from: a */
    private static C0052o<Boolean> f64858a = new C0052o<>();

    /* renamed from: b */
    private static final IRetrofit f64859b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: c */
    private static IRetrofitService f64860c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v2/coupon/detail/")
        C18253l<C24593a> getCouponDetail(@C7744t(mo20436a = "coupon_id") int i, @C7744t(mo20436a = "code_id") String str);

        @C7730f(mo20420a = "/aweme/v2/coupon/list/")
        C18253l<C24594b> getCouponList(@C7744t(mo20436a = "page") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "filter_status") int i3);
    }

    /* renamed from: a */
    public static C0052o<Boolean> m80640a() {
        return f64858a;
    }

    /* renamed from: a */
    public static C24593a m80641a(int i, String str) throws Exception {
        try {
            return (C24593a) ((RealApi) f64859b.create(RealApi.class)).getCouponDetail(i, str).get();
        } catch (ExecutionException e) {
            throw f64860c.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C24594b m80642a(int i, int i2, int i3) throws Exception {
        try {
            return (C24594b) ((RealApi) f64859b.create(RealApi.class)).getCouponList(i, 10, i3).get();
        } catch (ExecutionException e) {
            throw f64860c.propagateCompatibleException(e);
        }
    }
}
