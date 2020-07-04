package com.p280ss.android.pushmanager;

import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;

/* renamed from: com.ss.android.pushmanager.b */
final class C20052b {
    /* renamed from: a */
    static String m66040a(String str) {
        try {
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            if (iBridgeService != null && iBridgeService.isNeedReplacePushPath()) {
                if (str.equals("/service/1/update_token/")) {
                    str = "/cloudpush/update_token/";
                }
                if (str.equals("/cloudpush/update_sender/")) {
                    str = "/cloudpush/update_sender/";
                }
                if (str.equals("/service/1/app_notice_status/")) {
                    str = "/cloudpush/app_notice_status/";
                }
            }
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder(TutorialVideoApiManager.f89507a);
        sb.append(str);
        return sb.toString();
    }
}
