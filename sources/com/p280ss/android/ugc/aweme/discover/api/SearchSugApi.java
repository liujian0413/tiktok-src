package com.p280ss.android.ugc.aweme.discover.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi */
public final class SearchSugApi {

    /* renamed from: a */
    private static IRetrofitService f70078a;

    /* renamed from: b */
    private static API f70079b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v1/search/sug/")
        C18253l<SearchSugResponse> getSearchSugList(@C7744t(mo20436a = "keyword") String str, @C7744t(mo20436a = "source") String str2);
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        f70078a = iRetrofitService;
        f70079b = (API) iRetrofitService.createNewRetrofit(Api.f60502b).create(API.class);
    }

    /* renamed from: a */
    public static SearchSugResponse m87319a(String str, String str2) throws Exception {
        try {
            return (SearchSugResponse) f70079b.getSearchSugList(str, str2).get();
        } catch (ExecutionException e) {
            throw f70078a.propagateCompatibleException(e);
        }
    }
}
