package com.p280ss.android.ugc.aweme.story.shootvideo.publish.upload.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;
import java.util.LinkedHashMap;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.upload.api.CreateStoryApi */
public final class CreateStoryApi {

    /* renamed from: a */
    private static API f109153a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.upload.api.CreateStoryApi$API */
    public interface API {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/life/create/story/")
        C18253l<CreateStoryResponse> createStory(@C7727c(mo20417a = "media_id") String str, @C7728d LinkedHashMap<String, String> linkedHashMap);
    }
}
