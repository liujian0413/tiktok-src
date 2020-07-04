package com.p280ss.android.ugc.aweme.opensdk.share;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35535af;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.b */
public final class C34680b implements C35535af {
    /* renamed from: a */
    public final void mo87989a(Activity activity, Object obj) {
        ShareContext checkShareContextWhenPublish = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkShareContextWhenPublish(obj);
        if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isClientKeyValid(checkShareContextWhenPublish)) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onReturnThirdPlatformFailed(activity, checkShareContextWhenPublish, "Sharing canceled", 20013);
        }
    }
}
