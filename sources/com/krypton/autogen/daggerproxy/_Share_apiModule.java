package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareExtService;
import com.p280ss.android.ugc.aweme.share.ShareService;
import com.p280ss.android.ugc.graph.C7289f;

public class _Share_apiModule {
    public ShareDependService provideShareDependService() {
        return ((Share_apiService) C7289f.m22851a(Share_apiService.class)).provideShareDependService();
    }

    public ShareExtService provideShareExtService() {
        return ((Share_apiService) C7289f.m22851a(Share_apiService.class)).provideShareExtService();
    }

    public ShareService provideShareService() {
        return ((Share_apiService) C7289f.m22851a(Share_apiService.class)).provideShareService();
    }
}
