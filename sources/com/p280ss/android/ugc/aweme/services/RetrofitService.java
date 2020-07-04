package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.net.C34096o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.services.RetrofitService */
public class RetrofitService implements IRetrofitService {
    private final HashMap<String, IRetrofit> mRetrofitHashMap = new HashMap<>();

    public RuntimeException propagateCompatibleException(ExecutionException executionException) throws Exception {
        throw C22838j.m75277a(executionException);
    }

    public IRetrofit createNewRetrofit(String str) {
        IRetrofit iRetrofit = (IRetrofit) this.mRetrofitHashMap.get(str);
        if (iRetrofit == null) {
            synchronized (this) {
                iRetrofit = (IRetrofit) this.mRetrofitHashMap.get(str);
                if (iRetrofit == null) {
                    iRetrofit = new TTRetrofit(str);
                    this.mRetrofitHashMap.put(str, iRetrofit);
                }
            }
        }
        C34096o.m109765a((Map<?, ?>) this.mRetrofitHashMap);
        return iRetrofit;
    }
}
