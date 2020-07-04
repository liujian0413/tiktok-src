package com.p280ss.android.ugc.aweme.poi.api;

import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiMerchantApi */
public final class PoiMerchantApi {

    /* renamed from: a */
    public static boolean f91688a;

    /* renamed from: b */
    public static boolean f91689b;

    /* renamed from: c */
    private static final IRetrofit f91690c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e);

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiMerchantApi$RealApi */
    interface RealApi {
        @C7739o(mo20429a = "/aweme/v1/poi/merchant/entry/hint/ack/")
        C18253l<BaseResponse> ackPoiMerchantEntryHint();

        @C7730f(mo20420a = "/aweme/v1/poi/merchant/poi/list/")
        C18253l<Object> getPoiMerchantList();
    }

    /* renamed from: b */
    public static boolean m113166b() {
        return f91688a;
    }

    /* renamed from: c */
    public static boolean m113167c() {
        return f91689b;
    }

    /* renamed from: a */
    public static void m113165a() {
        f91689b = false;
        C18246h.m60214a(((RealApi) f91690c.create(RealApi.class)).ackPoiMerchantEntryHint(), (C18245g<? super V>) new C18245g<BaseResponse>() {
            public final void onFailure(Throwable th) {
            }

            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            }
        }, C18254m.m60217a());
    }
}
