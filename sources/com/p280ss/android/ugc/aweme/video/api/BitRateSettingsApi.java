package com.p280ss.android.ugc.aweme.video.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.video.api.BitRateSettingsApi */
public final class BitRateSettingsApi {

    /* renamed from: a */
    private static final IRetrofit f111830a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e);

    /* renamed from: com.ss.android.ugc.aweme.video.api.BitRateSettingsApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/rate/settings/")
        C18253l<RateSettingsResponse> fetchRateSettings();
    }

    /* renamed from: a */
    public static RateSettingsResponse m136951a() throws Exception {
        try {
            return (RateSettingsResponse) ((RealApi) f111830a.create(RealApi.class)).fetchRateSettings().get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof ApiServerException) {
                int errorCode = ((ApiServerException) e.getCause()).getErrorCode();
                if (errorCode == 9 || errorCode == 14) {
                    return null;
                }
            }
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
        } catch (IncompatibleClassChangeError unused) {
            return null;
        }
    }
}
