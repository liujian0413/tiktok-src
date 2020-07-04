package com.p280ss.android.ugc.aweme.setting.commentfilter.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.api.CommentFilterApi */
public final class CommentFilterApi {

    /* renamed from: a */
    public static API f98065a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.api.CommentFilterApi$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v2/comment/filter/get_words/")
        C1592h<C37606a> getCommentFilterKeywords();

        @C7739o(mo20429a = "/aweme/v2/comment/filter/update_words/")
        C1592h<BaseResponse> setCommentFilterKeywords(@C7744t(mo20436a = "words") String str);
    }
}
