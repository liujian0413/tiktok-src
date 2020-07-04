package com.p280ss.android.ugc.aweme.qrcode.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.qrcode.model.C37079a;
import com.p280ss.android.ugc.aweme.qrcode.model.C37085e;
import com.p280ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.QRCodeApi */
public final class QRCodeApi {

    /* renamed from: a */
    static final IRetrofit f96950a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f96951b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.qrcode.api.QRCodeApi$RealApi */
    interface RealApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/qrcode/info/")
        C18253l<C37079a> getQRCodeInfo(@C7727c(mo20417a = "schema_type") int i, @C7727c(mo20417a = "object_id") String str, @C7727c(mo20417a = "edition_uid") String str2);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/fancy/qrcode/info/")
        C18253l<C37079a> getQRCodeInfoV2(@C7727c(mo20417a = "schema_type") int i, @C7727c(mo20417a = "object_id") String str, @C7727c(mo20417a = "meta_params") String str2);

        @C7730f(mo20420a = "/aweme/v1/commerce/scan/guide/")
        C18253l<C37085e> getScanGuideInfo();

        @C7730f(mo20420a = "/aweme/v1/commerce/scan/material/")
        C18253l<ScanMaterialResponse> scanMaterialResult(@C7744t(mo20436a = "target_id") String str);
    }

    /* renamed from: a */
    public static C37085e m119049a() throws Exception {
        try {
            return (C37085e) ((RealApi) f96950a.create(RealApi.class)).getScanGuideInfo().get();
        } catch (ExecutionException e) {
            throw f96951b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static ScanMaterialResponse m119047a(String str) throws Exception {
        try {
            return (ScanMaterialResponse) ((RealApi) f96950a.create(RealApi.class)).scanMaterialResult(str).get();
        } catch (ExecutionException e) {
            throw f96951b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C37079a m119048a(int i, String str, String str2) throws Exception {
        try {
            return (C37079a) ((RealApi) f96950a.create(RealApi.class)).getQRCodeInfoV2(i, str, str2).get();
        } catch (ExecutionException e) {
            throw f96951b.propagateCompatibleException(e);
        }
    }
}
