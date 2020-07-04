package com.p280ss.android.ugc.aweme.framework.services;

import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IRetrofitService */
public interface IRetrofitService {
    IRetrofit createNewRetrofit(String str);

    RuntimeException propagateCompatibleException(ExecutionException executionException) throws Exception;
}
