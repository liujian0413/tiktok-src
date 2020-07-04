package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareExtService;
import com.p280ss.android.ugc.aweme.share.ShareService;

public interface Share_apiService {
    ShareDependService provideShareDependService();

    ShareExtService provideShareExtService();

    ShareService provideShareService();
}
