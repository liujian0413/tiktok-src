package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.graph.C7289f;

public class _Aweme_service_apiModule {
    public IAwemeService provideIAwemeService() {
        return ((Aweme_service_apiService) C7289f.m22851a(Aweme_service_apiService.class)).provideIAwemeService();
    }

    public IRequestIdService provideIRequestIdService() {
        return ((Aweme_service_apiService) C7289f.m22851a(Aweme_service_apiService.class)).provideIRequestIdService();
    }
}
