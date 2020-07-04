package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.model.C35125n;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiUploadImageApi */
public final class PoiUploadImageApi {

    /* renamed from: a */
    public static final PoiUploadImageApi f91696a = new PoiUploadImageApi();

    /* renamed from: b */
    private static final C48896PoiUploadImageApi f91697b = ((C48896PoiUploadImageApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(C48896PoiUploadImageApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiUploadImageApi$PoiUploadImageApi reason: collision with other inner class name */
    public interface C48896PoiUploadImageApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/poi/upload/head/image/")
        C1592h<C35125n> uploadPoiImgRequest(@C7727c(mo20417a = "poi_id") String str, @C7727c(mo20417a = "urilist") String str2, @C7727c(mo20417a = "watermark") String str3);
    }

    private PoiUploadImageApi() {
    }

    /* renamed from: a */
    public static C1592h<C35125n> m113169a(String str, String str2, String str3) {
        C7573i.m23587b(str, "poiId");
        C7573i.m23587b(str2, "uriList");
        C7573i.m23587b(str3, "waterMark");
        return f91697b.uploadPoiImgRequest(str, str2, str3);
    }
}
