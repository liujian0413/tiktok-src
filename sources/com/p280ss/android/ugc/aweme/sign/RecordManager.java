package com.p280ss.android.ugc.aweme.sign;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.sign.RecordManager */
public final class RecordManager {

    /* renamed from: a */
    private static RecordApi f108581a = ((RecordApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RecordApi.class));

    /* renamed from: com.ss.android.ugc.aweme.sign.RecordManager$RecordApi */
    interface RecordApi {
        @C7730f(mo20420a = "/aweme/v1/sign/gain/url/")
        C18253l<RecordResponseInfo> getRecordInfo(@C7744t(mo20436a = "video_id") String str);
    }
}
