package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;

public interface Aweme_service_apiService {
    IAwemeService provideIAwemeService();

    IRequestIdService provideIRequestIdService();
}
