package com.p280ss.android.ugc.aweme.notice.api.helper;

import com.bytedance.ies.geckoclient.C10873f;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.websocket.p344ws.output.C45457c;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.WSHelper */
public interface WSHelper {
    int getAppVersionCode();

    C10873f getNormalGeckoClient();

    String getProviderString();

    void handleWsCloudMessage(C45457c cVar);

    boolean isAppBackground();

    void registerAppLifecycleObserver(C7162m mVar);
}
