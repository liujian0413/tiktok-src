package com.p280ss.android.ugc.aweme.setting.api;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.DataSaverApi */
public interface DataSaverApi {

    /* renamed from: a */
    public static final C37569a f97985a = C37569a.f97986a;

    /* renamed from: com.ss.android.ugc.aweme.setting.api.DataSaverApi$a */
    public static final class C37569a {

        /* renamed from: a */
        static final /* synthetic */ C37569a f97986a = new C37569a();

        /* renamed from: b */
        private static final DataSaverApi f97987b = ((DataSaverApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(DataSaverApi.class));

        private C37569a() {
        }

        /* renamed from: a */
        public static void m120340a(int i, C1591g<BaseResponse, Object> gVar) {
            C7573i.m23587b(gVar, "continuation");
            f97987b.setDataSaverSetting(i).mo6876a(gVar, C1592h.f5958b);
        }
    }

    @C7739o(mo20429a = "/aweme/v1/set/data-saver-setting/")
    C1592h<BaseResponse> setDataSaverSetting(@C7744t(mo20436a = "data_saver_setting") int i);
}
