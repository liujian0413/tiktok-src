package com.p280ss.android.ugc.aweme.shortvideo.publish;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import java.util.LinkedHashMap;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.CreatePhotoApi */
public final class CreatePhotoApi {

    /* renamed from: a */
    private static API f104535a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.CreatePhotoApi$API */
    public interface API {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/create/image/aweme/")
        C18253l<CreateAwemeResponse> createAweme(@C7727c(mo20417a = "image_ids") String str, @C7728d LinkedHashMap<String, String> linkedHashMap);
    }

    /* renamed from: a */
    public static API m128539a() {
        return f104535a;
    }
}
